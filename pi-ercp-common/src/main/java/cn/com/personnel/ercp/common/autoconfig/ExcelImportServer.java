/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.autoconfig;

import cn.com.personnel.ercp.pi.module.ImportParamsVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jeecgframework.poi.excel.annotation.*;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.params.ExcelCollectionParams;
import org.jeecgframework.poi.excel.entity.params.ExcelImportEntity;
import org.jeecgframework.poi.excel.entity.result.ExcelImportResult;
import org.jeecgframework.poi.excel.entity.result.ExcelVerifyHanlderResult;
import org.jeecgframework.poi.excel.imports.base.ImportBaseService;
import org.jeecgframework.poi.excel.imports.verifys.VerifyHandlerServer;
import org.jeecgframework.poi.exception.excel.ExcelImportException;
import org.jeecgframework.poi.exception.excel.enums.ExcelImportEnum;
import org.jeecgframework.poi.util.ExcelUtil;
import org.jeecgframework.poi.util.PoiPublicUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Excel 导入服务
 * 
 */
@SuppressWarnings({"rawtypes", "unchecked", "hiding"})
public class ExcelImportServer extends ImportBaseService {

    private final static Logger LOGGER     = LoggerFactory.getLogger(ExcelImportServer.class);

    private CellValueServer cellValueServer;

    private VerifyHandlerServer verifyHandlerServer;

    private boolean             verfiyFail = false;
    /**
     * 异常数据styler
     */
    private CellStyle errorCellStyle;

    public ExcelImportServer() {
        this.cellValueServer = new CellValueServer();
        this.verifyHandlerServer = new VerifyHandlerServer();
    }

    /***
     * 向List里面继续添加元素
     * 
     * @param object
     * @param param
     * @param row
     * @param titlemap
     * @param targetId
     * @param pictures
     * @param params
     */
    private void addListContinue(Object object, ExcelCollectionParams param, Row row, Map<Integer, String> titlemap,
                                 String targetId, Map<String, PictureData> pictures, ImportParams params) throws Exception {
        Collection collection = (Collection) PoiPublicUtil.getMethod(param.getName(), object.getClass())
                .invoke(object, new Object[] {});
        Object entity = PoiPublicUtil.createObject(param.getType(), targetId);
        String picId;
        boolean isUsed = false;// 是否需要加上这个对象
        for (int i = row.getFirstCellNum(); i < row.getLastCellNum(); i++) {
            Cell cell = row.getCell(i);
            String titleString = titlemap.get(i);
            if (param.getExcelParams().containsKey(titleString)) {
                if (param.getExcelParams().get(titleString).getType() == 2) {
                    picId = row.getRowNum() + "_" + i;
                    saveImage(object, picId, param.getExcelParams(), titleString, pictures, params);
                } else {
                    saveFieldValue(params, entity, cell, param.getExcelParams(), titleString, row);
                }
                isUsed = true;
            }
        }
        if (isUsed) {
            collection.add(entity);
        }
    }

    /**
     * 获取key的值,针对不同类型获取不同的值
     * 
     * @Author JueYue
     * @date 2013-11-21
     * @param cell
     * @return
     */
    private String getKeyValue(Cell cell) {
        Object obj = null;
        switch (cell.getCellType()) {
        case Cell.CELL_TYPE_STRING:
            obj = cell.getStringCellValue();
            break;
        case Cell.CELL_TYPE_BOOLEAN:
            obj = cell.getBooleanCellValue();
            break;
        case Cell.CELL_TYPE_NUMERIC:
            obj = cell.getNumericCellValue();
            break;
        case Cell.CELL_TYPE_FORMULA:
            obj = cell.getCellFormula();
            break;
        }
        return obj == null ? null : obj.toString().trim();
    }

    /**
     * 获取保存的真实路径
     * 
     * @param excelImportEntity
     * @param object
     * @return
     * @throws Exception
     */
    private String getSaveUrl(ExcelImportEntity excelImportEntity, Object object) throws Exception {
        String url = "";
        if (excelImportEntity.getSaveUrl().equals("upload")) {
            if (excelImportEntity.getMethods() != null && excelImportEntity.getMethods().size() > 0) {
                object = getFieldBySomeMethod(excelImportEntity.getMethods(), object);
            }
            url = object.getClass().getName().split("\\.")[object.getClass().getName().split("\\.").length - 1];
            return excelImportEntity.getSaveUrl() + "/" + url.substring(0, url.lastIndexOf("Entity"));
        }
        return excelImportEntity.getSaveUrl();
    }

    // update-begin--Author:xuelin Date:20171205 for：TASK #2098 【excel问题】 Online
    // 一对多导入失败--------------------
    private <T> List<T> importExcel(Collection<T> result, Sheet sheet, Class<?> pojoClass, ImportParams params,
                                    Map<String, PictureData> pictures) throws Exception {
        List collection = new ArrayList();
        Map<String, ExcelImportEntity> excelParams = new HashMap<String, ExcelImportEntity>();
        List<ExcelCollectionParams> excelCollection = new ArrayList<ExcelCollectionParams>();
        String targetId = null;
        if (!Map.class.equals(pojoClass)) {
            Field fileds[] = PoiPublicUtil.getClassFields(pojoClass);
            ExcelTarget etarget = pojoClass.getAnnotation(ExcelTarget.class);
            if (etarget != null) {
                targetId = etarget.value();
            }
            if(fileds.length > 0){
                boolean flag = false;
                for(Field field : fileds){
                    if(PoiPublicUtil.isJavaClass(fileds[1])){
                        if(field.getAnnotation(Excel.class) != null && field.getAnnotation(Excel.class).name().indexOf("_") > 0){
                            flag = true;
                        }
                    }else {
                        flag = false;
                    }
                }
                if(flag){
                    getDoubleTitleExcelField(targetId, fileds, excelParams, excelCollection, pojoClass, null);
                }else{
                    getAllExcelField(targetId, fileds, excelParams, excelCollection, pojoClass, null);
                }
            }
        }
        Object obj = null;
        List<List<MultiTitle>> multiTitleList = null;
        Iterator<Row> rows = sheet.rowIterator();
        Map<Integer, String> titlemap = null;
        ImportParamsVO paramsVO = null;
        if(params instanceof ImportParamsVO) {
            paramsVO = (ImportParamsVO) params;
            if(paramsVO.getIsLandscape() && paramsVO.getTitleNum() > 0){
                titlemap = getMultiTitleMap(sheet, rows, paramsVO, excelCollection);
                obj = PoiPublicUtil.createObject(pojoClass, targetId);
                multiTitleList = paramsVO.getMultiTitleList();
            }else{
                titlemap = getTitleMap(sheet, rows, params, excelCollection);
            }
        }else{
            titlemap = getTitleMap(sheet, rows, params, excelCollection);
        }

        Row row = null;
        Iterator<Cell> cellTitle = null;
        List<MultiTitle> multiTitles = null;
        int k = 0;
        // 跳过表头和标题行
        for (int j = 0; j < params.getTitleRows() + params.getHeadRows(); j++) {
            row = rows.next();
            if(j >= params.getTitleRows()){
                if(paramsVO != null){
                    //
                    if(paramsVO.getIsLandscape()){
                        if(paramsVO.getReferFirst() != null && paramsVO.getReferFirst()){
                            multiTitles = multiTitleList.get(0);
                        }else {
                            multiTitles = multiTitleList.get(j - paramsVO.getTitleRows());
                        }
                        int i = 0;
                        String titleName = "";
                        for(MultiTitle multiTitle : multiTitles){
                            cellTitle = row.cellIterator();
                            Cell cell = row.getCell(i);
                            String value = getKeyValue(cell);
                            if(!"".equals(multiTitle.getTitle()) && multiTitle.getTitle().equals(value)){
                                titleName = multiTitle.getTitle();
//                                i += multiTitle.getCols();
                            }else{
                                String titleString = titlemap.get(k++);
                                if (excelParams.containsKey(titleName)) {
                                    saveFieldValue(params, obj, cell, excelParams, titleName, row);
                                }
                            }
                            i += multiTitle.getCols();
//                            int i = 0;
//                            while (cellTitle.hasNext()) {
//                                Cell cell = cellTitle.next();
//                                String value = getKeyValue(cell);
//                                if (StringUtils.isNotEmpty(value)) {
//                                    if(i++ % 2 == 1){
//                                        String titleString = titlemap.get(k++);
//                                        if (excelParams.containsKey(titleString)) {
//                                            saveFieldValue(params, obj, cell, excelParams, titleString, row);
//                                        }
//                                    }
//                                }
//                            }
                        }
                    }
                }
            }
        }
        if(paramsVO != null && !paramsVO.getIsExecuteData()){
            collection.add(obj);
            return collection;
        }
        Object object = null;
        String picId;
        while (rows.hasNext()
                && (row == null || sheet.getLastRowNum() - row.getRowNum() > params.getLastOfInvalidRow())) {
            row = rows.next();
            // update-begin--Author:xuelin Date:20171017 for：TASK #2373
            // 【bug】表改造问题，导致 3.7.1批量导入用户bug-导入不成功--------------------
            // 判断是集合元素还是不是集合元素,如果是就继续加入这个集合,不是就创建新的对象
            // update-begin--Author:xuelin Date:20171206 for：TASK #2451
            // 【excel导出bug】online 一对多导入成功， 但是现在代码生成后的一对多online导入有问题了
            if ((row.getCell(params.getKeyIndex()) == null
                    || StringUtils.isEmpty(getKeyValue(row.getCell(params.getKeyIndex())))) && object != null
                    && !Map.class.equals(pojoClass)) {
                // update-end--Author:xuelin Date:20171206 for：TASK #2451
                // 【excel导出bug】online 一对多导入成功， 但是现在代码生成后的一对多online导入有问题了
                for (ExcelCollectionParams param : excelCollection) {
                    addListContinue(object, param, row, titlemap, targetId, pictures, params);
                }

            } else {
                object = PoiPublicUtil.createObject(pojoClass, targetId);
                try {
                    for (int i = row.getFirstCellNum(), le = row.getLastCellNum(); i < le; i++) {
                        Cell cell = row.getCell(i);
                        String titleString = titlemap.get(i);
                        if (excelParams.containsKey(titleString) || Map.class.equals(pojoClass)) {
                            if (excelParams.get(titleString) != null && excelParams.get(titleString).getType() == 2) {
                                picId = row.getRowNum() + "_" + i;
                                saveImage(object, picId, excelParams, titleString, pictures, params);
                            } else {
                                if(cell instanceof XSSFCell){
                                    if(((XSSFCell) cell).getRawValue() == null){
                                        if(sheet.getNumMergedRegions() > 0){
                                            cell.setCellValue(ExcelUtil.getMergedRegionValue(sheet, row.getRowNum(), cell.getColumnIndex()));
                                        }
                                    }
                                }
                                saveFieldValue(params, object, cell, excelParams, titleString, row);
                            }
                        }
                    }

                    for (ExcelCollectionParams param : excelCollection) {
                        addListContinue(object, param, row, titlemap, targetId, pictures, params);
                    }
                    collection.add(object);
                } catch (ExcelImportException e) {
                    if (!e.getType().equals(ExcelImportEnum.VERIFY_ERROR)) {
                        throw new ExcelImportException(e.getType(), e);
                    }
                }
            }
            // update-end--Author:xuelin Date:20171017 for：TASK #2373
            // 【bug】表改造问题，导致 3.7.1批量导入用户bug-导入不成功--------------------
        }
        return collection;
    }

    /**
     * 获取需要导出的全部字段
     *
     * @param targetId
     *            目标ID
     * @param fields
     * @param excelCollection
     * @throws Exception
     */
    public void getDoubleTitleExcelField(String targetId, Field[] fields, Map<String, ExcelImportEntity> excelParams, List<ExcelCollectionParams> excelCollection, Class<?> pojoClass, List<Method> getMethods) throws Exception {
        ExcelImportEntity excelEntity = null;
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (isNotUserExcelUserThis(null, field, targetId)) {
                continue;
            }
            addDoubleTitleEntityToMap(targetId, field, excelEntity, pojoClass, getMethods, excelParams);
        }
    }
    /**
     * 判断是否不要在这个excel操作中
     *
     * @param
     * @param field
     * @param targetId
     * @return
     */
    public static boolean isNotUserExcelUserThis(List<String> exclusionsList, Field field, String targetId) {
        boolean boo = true;
        if (field.getAnnotation(ExcelIgnore.class) != null) {
            boo = true;
        } else if (boo && field.getAnnotation(ExcelCollection.class) != null && isUseInThis(field.getAnnotation(ExcelCollection.class).name(), targetId) && (exclusionsList == null || !exclusionsList.contains(field.getAnnotation(ExcelCollection.class).name()))) {
            boo = false;
        } else if (boo && field.getAnnotation(Excel.class) != null && (exclusionsList == null || !exclusionsList.contains(field.getAnnotation(Excel.class).name()))) {
            boo = false;
        } else if (boo && field.getAnnotation(ExcelEntity.class) != null && isUseInThis(field.getAnnotation(ExcelEntity.class).name(), targetId) && (exclusionsList == null || !exclusionsList.contains(field.getAnnotation(ExcelEntity.class).name()))) {
            boo = false;
        }
        return boo;
    }

    /**
     * 判断是不是使用
     *
     * @param exportName
     * @param targetId
     * @return
     */
    private static boolean isUseInThis(String exportName, String targetId) {
        return targetId == null || exportName.equals("") || exportName.indexOf("_") < 0 || exportName.indexOf(targetId) != -1;
    }

    /**
     * 判断指定的单元格是否是合并单元格
     * @param sheet
     * @param row 行下标
     * @param column 列下标
     * @return
     */
    private boolean isMergedRegion(Sheet sheet, int row , int column) {
        int sheetMergeCount = sheet.getNumMergedRegions();
        for (int i = 0; i < sheetMergeCount; i++) {
            CellRangeAddress range = sheet.getMergedRegion(i);
            int firstColumn = range.getFirstColumn();
            int lastColumn = range.getLastColumn();
            int firstRow = range.getFirstRow();
            int lastRow = range.getLastRow();
            if(row >= firstRow && row <= lastRow){
                if(column >= firstColumn && column <= lastColumn){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 把这个注解解析放到类型对象中
     *
     * @param targetId
     * @param field
     * @param excelEntity
     * @param pojoClass
     * @param getMethods
     * @param temp
     * @throws Exception
     */
    public void addDoubleTitleEntityToMap(String targetId, Field field, ExcelImportEntity excelEntity, Class<?> pojoClass, List<Method> getMethods, Map<String, ExcelImportEntity> temp) throws Exception {
        Excel excel = field.getAnnotation(Excel.class);
        excelEntity = new ExcelImportEntity();
        excelEntity.setType(excel.type());
        excelEntity.setSaveUrl(excel.savePath());
        excelEntity.setSaveType(excel.imageType());
        excelEntity.setReplace(excel.replace());
        excelEntity.setDatabaseFormat(excel.databaseFormat());
        excelEntity.setVerify(getImportVerify(field));
        excelEntity.setSuffix(excel.suffix());
        getExcelField(targetId, field, excelEntity, excel, pojoClass);
        if (getMethods != null) {
            List<Method> newMethods = new ArrayList<Method>();
            newMethods.addAll(getMethods);
            newMethods.add(excelEntity.getMethod());
            excelEntity.setMethods(newMethods);
        }
        temp.put(excelEntity.getName(), excelEntity);

    }
    public void getExcelField(String targetId, Field field, ExcelImportEntity excelEntity, Excel excel, Class<?> pojoClass) throws Exception {
        excelEntity.setName(excel.name());
        String fieldname = field.getName();
        excelEntity.setMethod(PoiPublicUtil.getMethod(fieldname, pojoClass, field.getType()));
        if (StringUtils.isNotEmpty(excel.importFormat())) {
            excelEntity.setFormat(excel.importFormat());
        } else {
            excelEntity.setFormat(excel.format());
        }
    }

    /**
     * 获取表格字段列名对应信息
     * 
     * @param rows
     * @param params
     * @param excelCollection
     * @return
     */
    private Map<Integer, String> getTitleMap(Sheet sheet, Iterator<Row> rows, ImportParams params,
                                             List<ExcelCollectionParams> excelCollection) {
        Map<Integer, String> titlemap = new HashMap<Integer, String>();
        Iterator<Cell> cellTitle = null;
        String collectionName = null;
        ExcelCollectionParams collectionParams = null;
        Row headRow = null;
        int headBegin = params.getTitleRows();
        // 找到首行表头，每个sheet都必须至少有一行表头
        while (headRow == null) {
            headRow = sheet.getRow(headBegin++);
        }
        // 设置表头行数
        if (ExcelUtil.isMergedRegion(sheet, headRow.getRowNum(), 0)) {
            params.setHeadRows(2);
        } else {
            params.setHeadRows(1);
        }
        cellTitle = headRow.cellIterator();
        while (cellTitle.hasNext()) {
            Cell cell = cellTitle.next();
            String value = getKeyValue(cell);
            if (StringUtils.isNotEmpty(value)) {
                titlemap.put(cell.getColumnIndex(), value);// 加入表头列表
            }
        }

        // 多行表头
        for (int j = headBegin; j < headBegin + params.getHeadRows() - 1; j++) {
            headRow = sheet.getRow(j);
            cellTitle = headRow.cellIterator();
            while (cellTitle.hasNext()) {
                Cell cell = cellTitle.next();
                String value = getKeyValue(cell);
                if (StringUtils.isNotEmpty(value)) {
                    int columnIndex = cell.getColumnIndex();
                    // 当前cell的上一行是否为合并单元格
                    if (ExcelUtil.isMergedRegion(sheet, cell.getRowIndex() - 1, columnIndex)) {
                        collectionName = ExcelUtil.getMergedRegionValue(sheet, cell.getRowIndex() - 1, columnIndex);
                        titlemap.put(cell.getColumnIndex(), collectionName + "_" + value);
                    } else {
//                        Row fRow = sheet.getRow(cell.getRowIndex() - 1);
//                        Cell fCell = fRow.getCell(columnIndex);
//                        collectionName = ExcelUtil.getCellValue(fCell) ;
//                        if(StringUtils.isNotEmpty(collectionName)){
//                            titlemap.put(cell.getColumnIndex(), collectionName + "_" + value);
//                        }else{
                            titlemap.put(cell.getColumnIndex(), value);
//                        }
                    }
                    /*
                     * int i = cell.getColumnIndex(); // 用以支持重名导入 if
                     * (titlemap.containsKey(i)) { collectionName =
                     * titlemap.get(i); collectionParams =
                     * getCollectionParams(excelCollection, collectionName);
                     * titlemap.put(i, collectionName + "_" + value); } else if
                     * (StringUtils.isNotEmpty(collectionName) &&
                     * collectionParams.getExcelParams().containsKey(
                     * collectionName + "_" + value)) { titlemap.put(i,
                     * collectionName + "_" + value); } else { collectionName =
                     * null; collectionParams = null; } if
                     * (StringUtils.isEmpty(collectionName)) { titlemap.put(i,
                     * value); }
                     */
                }
            }
        }
        return titlemap;
    }

    /**
     * 获取表格字段列名对应信息
     *
     * @param rows
     * @param params
     * @param excelCollection
     * @return
     */
    private Map<Integer, String> getMultiTitleMap(Sheet sheet, Iterator<Row> rows, ImportParamsVO params,
                                                  List<ExcelCollectionParams> excelCollection) {
        Map<Integer, String> titlemap = new HashMap<Integer, String>();
        Iterator<Cell> cellTitle = null;
        String collectionName = null;
        ExcelCollectionParams collectionParams = null;
        Row headRow = null;
        int headBegin = params.getTitleRows();

        int index = 0;
        for(int k = 0; k < params.getTitleNum(); k++){
            // 找到首行表头，每个sheet都必须至少有一行表头
            headRow = sheet.getRow(headBegin++);

            cellTitle = headRow.cellIterator();
            int i = 0;
            while (cellTitle.hasNext()) {
                Cell cell = cellTitle.next();
                String value = getKeyValue(cell);
                if (StringUtils.isNotEmpty(value)) {
                    if(i++ % 2 == 0)
                        titlemap.put(index++, value);// 加入表头列表
                }
            }
        }
//        // 设置表头行数
//        if (ExcelUtil.isMergedRegion(sheet, headRow.getRowNum(), 0)) {
//            params.setHeadRows(2);
//        } else {
//            params.setHeadRows(1);
//        }
//        cellTitle = headRow.cellIterator();
//        while (cellTitle.hasNext()) {
//            Cell cell = cellTitle.next();
//            String value = getKeyValue(cell);
//            if (StringUtils.isNotEmpty(value)) {
//                titlemap.put(cell.getColumnIndex(), value);// 加入表头列表
//            }
//        }
//
//        // 多行表头
//        for (int j = headBegin; j < headBegin + params.getHeadRows() - 1; j++) {
//            headRow = sheet.getRow(j);
//            cellTitle = headRow.cellIterator();
//            while (cellTitle.hasNext()) {
//                Cell cell = cellTitle.next();
//                String value = getKeyValue(cell);
//                if (StringUtils.isNotEmpty(value)) {
//                    int columnIndex = cell.getColumnIndex();
//                    // 当前cell的上一行是否为合并单元格
//                    if (ExcelUtil.isMergedRegion(sheet, cell.getRowIndex() - 1, columnIndex)) {
//                        collectionName = ExcelUtil.getMergedRegionValue(sheet, cell.getRowIndex() - 1, columnIndex);
//                        titlemap.put(cell.getColumnIndex(), collectionName + "_" + value);
//                    } else {
//                        titlemap.put(cell.getColumnIndex(), value);
//                    }
//                    /*
//                     * int i = cell.getColumnIndex(); // 用以支持重名导入 if
//                     * (titlemap.containsKey(i)) { collectionName =
//                     * titlemap.get(i); collectionParams =
//                     * getCollectionParams(excelCollection, collectionName);
//                     * titlemap.put(i, collectionName + "_" + value); } else if
//                     * (StringUtils.isNotEmpty(collectionName) &&
//                     * collectionParams.getExcelParams().containsKey(
//                     * collectionName + "_" + value)) { titlemap.put(i,
//                     * collectionName + "_" + value); } else { collectionName =
//                     * null; collectionParams = null; } if
//                     * (StringUtils.isEmpty(collectionName)) { titlemap.put(i,
//                     * value); }
//                     */
//                }
//            }
//        }
        return titlemap;
    }

    // update-end--Author:xuelin Date:20171205 for：TASK #2098 【excel问题】 Online
    // 一对多导入失败--------------------
    /**
     * 获取这个名称对应的集合信息
     * 
     * @param excelCollection
     * @param collectionName
     * @return
     */
    private ExcelCollectionParams getCollectionParams(List<ExcelCollectionParams> excelCollection,
            String collectionName) {
        for (ExcelCollectionParams excelCollectionParams : excelCollection) {
            if (collectionName.equals(excelCollectionParams.getExcelName())) {
                return excelCollectionParams;
            }
        }
        return null;
    }

    /**
     * Excel 导入 field 字段类型 Integer,Long,Double,Date,String,Boolean
     * 
     * @param inputstream
     * @param pojoClass
     * @param params
     * @return
     * @throws Exception
     */
    public ExcelImportResult importExcelByIs(InputStream inputstream, Class<?> pojoClass,
            ImportParams params) throws Exception {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Excel import start ,class is {}", pojoClass);
        }
        List<T> result = new ArrayList<T>();
        Workbook book = null;
        boolean isXSSFWorkbook = true;
        if (!(inputstream.markSupported())) {
            inputstream = new PushbackInputStream(inputstream, 8);
        }
        if (POIFSFileSystem.hasPOIFSHeader(inputstream)) {
            book = new HSSFWorkbook(inputstream);
            isXSSFWorkbook = false;
        } else if (POIXMLDocument.hasOOXMLHeader(inputstream)) {
            book = new XSSFWorkbook(OPCPackage.open(inputstream));
        }
        createErrorCellStyle(book);
        Map<String, PictureData> pictures;
        for (int i = 0; i < params.getSheetNum(); i++) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(" start to read excel by is ,startTime is {}", new Date().getTime());
            }
            if (isXSSFWorkbook) {
                pictures = PoiPublicUtil.getSheetPictrues07((XSSFSheet) book.getSheetAt(i), (XSSFWorkbook) book);
            } else {
                pictures = PoiPublicUtil.getSheetPictrues03((HSSFSheet) book.getSheetAt(i), (HSSFWorkbook) book);
            }
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(" end to read excel by is ,endTime is {}", new Date().getTime());
            }
            result.addAll(importExcel(result, book.getSheetAt(i), pojoClass, params, pictures));
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(" end to read excel list by pos ,endTime is {}", new Date().getTime());
            }
        }
        if (params.isNeedSave()) {
            saveThisExcel(params, pojoClass, isXSSFWorkbook, book);
        }
        return new ExcelImportResult(result, verfiyFail, book);
    }

    /**
     * 保存字段值(获取值,校验值,追加错误信息)
     * 
     * @param params
     * @param object
     * @param cell
     * @param excelParams
     * @param titleString
     * @param row
     * @throws Exception
     */
    private void saveFieldValue(ImportParams params, Object object, Cell cell,
            Map<String, ExcelImportEntity> excelParams, String titleString, Row row) throws Exception {
        Object value = cellValueServer.getValue(params.getDataHanlder(), object, cell, excelParams, titleString);
        if (object instanceof Map) {
            if (params.getDataHanlder() != null) {
                params.getDataHanlder().setMapValue((Map) object, titleString, value);
            } else {
                ((Map) object).put(titleString, value);
            }
        } else {
            ExcelVerifyHanlderResult verifyResult = verifyHandlerServer
                    .verifyData(object, value, titleString, excelParams.get(titleString).getVerify(),
                                params.getVerifyHanlder());
            if (verifyResult.isSuccess()) {
                setValues(excelParams.get(titleString), object, value);
            } else {
                Cell errorCell = row.createCell(row.getLastCellNum());
                errorCell.setCellValue(verifyResult.getMsg());
                errorCell.setCellStyle(errorCellStyle);
                verfiyFail = true;
                throw new ExcelImportException(ExcelImportEnum.VERIFY_ERROR);
            }
        }
    }

    /**
     * 
     * @param object
     * @param picId
     * @param excelParams
     * @param titleString
     * @param pictures
     * @param params
     * @throws Exception
     */
    private void saveImage(Object object, String picId, Map<String, ExcelImportEntity> excelParams, String titleString,
                           Map<String, PictureData> pictures, ImportParams params) throws Exception {
        if (pictures == null) {
            return;
        }
        PictureData image = pictures.get(picId);
        byte[] data = image.getData();
        String fileName = "pic" + Math.round(Math.random() * 100000000000L);
        fileName += "." + PoiPublicUtil.getFileExtendName(data);
        if (excelParams.get(titleString).getSaveType() == 1) {
            String path = PoiPublicUtil.getWebRootPath(getSaveUrl(excelParams.get(titleString), object));
            File savefile = new File(path);
            if (!savefile.exists()) {
                savefile.mkdirs();
            }
            savefile = new File(path + "/" + fileName);
            FileOutputStream fos = new FileOutputStream(savefile);
            fos.write(data);
            fos.close();
            setValues(excelParams.get(titleString), object,
                      getSaveUrl(excelParams.get(titleString), object) + "/" + fileName);
        } else {
            setValues(excelParams.get(titleString), object, data);
        }
    }

    private void createErrorCellStyle(Workbook workbook) {
        errorCellStyle = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setColor(Font.COLOR_RED);
        errorCellStyle.setFont(font);
    }

}