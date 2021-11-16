package cn.com.personnel.ercp.common.autoconfig;

import cn.com.personnel.ercp.framework.exception.BusinessException;
import cn.com.personnel.ercp.framework.kit.excel.ColHeadView;
import cn.com.personnel.ercp.pi.module.ImportParamsVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import org.jeecgframework.poi.excel.annotation.*;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.params.ExcelCollectionParams;
import org.jeecgframework.poi.excel.entity.params.ExcelImportEntity;
import org.jeecgframework.poi.excel.imports.base.ImportBaseService;
import org.jeecgframework.poi.util.ExcelUtil;
import org.jeecgframework.poi.util.PoiPublicUtil;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;


public class ExcelUtils extends ImportBaseService {

    public static final String tempUrl = "/excel";
//    public static final String tempUrl = "./gw-ercp-qms-ui/src/main/resources/excel";

    private XSSFWorkbook workbook;

    private File newFile;

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public InputStream getTempleteStream(String tempPath){
        return this.getClass().getResourceAsStream(tempUrl + tempPath);
    }

    public ByteArrayOutputStream exportExcel(){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            workbook.write(bos);
            bos.flush();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bos;
    }

    int currentRow = -1;


    /**
     * 特殊表头，横向表头导出
     *
     *tempPath 模板文件路径
     *pojoClass 列表字段
     *params excel数据项
     *mergeCols 合并字段
     *data 列表数据
     *titleClass 特殊表头字段
     *fileName 导出文件名
     */
    public ByteArrayOutputStream exportExcel(String tempPath, Class<?> pojoClass,ImportParams params,
                List<String> mergeCols, List data, Class<?> titleClass, Object object, String fileName, Integer dataRowId) throws Exception {
        InputStream is = null;
        XSSFWorkbook workbook = null;
        XSSFSheet sheet = null;
        try {
            is = getTempleteStream(tempPath);// 将excel文件转为输入流
            workbook = new XSSFWorkbook(is);// 创建个workbook，
            // 获取第一个sheet
            sheet = workbook.getSheetAt(0);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        ByteArrayOutputStream bos = null;
        if (sheet != null) {
            setTitleExcel(sheet, titleClass, params, object);
            List<ColHeadView> colHeadViews = getExcelCols(sheet, pojoClass, params);
            try {
                // 写数据
                bos = new ByteArrayOutputStream();

                if(data!=null){
                    setBody(workbook,sheet, data, colHeadViews);
                    if(mergeCols != null && mergeCols.size() > 0){
                        for(String s : mergeCols){
                            int ind=-1;
                            for(int d = 0; d < colHeadViews.size(); d++){
                                ColHeadView col = colHeadViews.get(d);
                                if(s.equals(col.getColName())){
                                    ind = d;
                                    break;
                                }
                            }
//                            ind = newColHeadViews.indexOf(s);
                            int rowId = dataRowId;
                            int rowIdEnd = dataRowId - 1;
                            Object before = "";
                            int rowSpanTaxCount = 0;
                            for(int p = 0; p < data.size(); p++){
                                rowIdEnd++;
                                if(p > 0){
                                    before = ((Map)data.get(p - 1)).get(s);
                                    if(before != null && before.equals(((Map)data.get(p)).get(s))){
                                        rowSpanTaxCount++;
                                    }else{
                                        if(rowSpanTaxCount > 0){
                                            //合并单元格
                                            CellRangeAddress region = new CellRangeAddress(rowId-1,rowId+rowSpanTaxCount-1,ind,ind);
                                            sheet.addMergedRegion(region);
                                        }
                                        rowSpanTaxCount = 0;
                                        rowId = rowIdEnd;
                                    }
                                }

                            }
                            if(rowSpanTaxCount > 0){
                                //合并单元格
//                                CellRangeAddress region = new CellRangeAddress(rowId,rowId+rowSpanTaxCount,ind,ind);
                                CellRangeAddress region = new CellRangeAddress(rowId-1,rowId+rowSpanTaxCount-1,ind,ind);
//                                CellRangeAddress region = new CellRangeAddress(1,2,0,0);
                                sheet.addMergedRegion(region);
                            }
                        }
                    }
                }
                workbook.write(bos);
                bos.flush();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != is) {
                        is.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return bos;
    }

    /**
     * 导出
     *
     *tempPath 模板文件路径
     *pojoClass 列表字段
     *params excel数据项
     *mergeCols 合并字段
     *data 列表数据
     *titleClass 特殊表头字段
     *fileName 导出文件名
     * dataRowId 数据起始位置
     */
    public ByteArrayOutputStream exportExcel1(String tempPath, Class<?> pojoClass,ImportParams params,
                                             List<String> mergeCols, List data, Integer dataRowId) throws Exception {
        InputStream is = null;
        XSSFWorkbook workbook = null;
        XSSFSheet sheet = null;
        try {
            is = getTempleteStream(tempPath);// 将excel文件转为输入流
            workbook = new XSSFWorkbook(is);// 创建个workbook，
            // 获取第一个sheet
            sheet = workbook.getSheetAt(0);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        ByteArrayOutputStream bos = null;
        if (sheet != null) {
            setTitleExcel(sheet, params);
            List<ColHeadView> colHeadViews = getExcelCols(sheet, pojoClass, params);
            try {
                // 写数据
                bos = new ByteArrayOutputStream();

                if(data!=null){
                    setBody(workbook,sheet, data, colHeadViews);
                    if(mergeCols != null && mergeCols.size() > 0){
                        for(String s : mergeCols){
                            int ind=-1;
                            for(int d = 0; d < colHeadViews.size(); d++){
                                ColHeadView col = colHeadViews.get(d);
                                if(s.equals(col.getColName())){
                                    ind = d;
                                    break;
                                }
                            }
//                            ind = newColHeadViews.indexOf(s);
                            int rowId = dataRowId;
                            int rowIdEnd = dataRowId-1;
                            Object before = "";
                            int rowSpanTaxCount = 0;
                            for(int p = 0; p < data.size(); p++){
                                rowIdEnd++;
                                if(p > 0){
                                    before = ((Map)data.get(p - 1)).get(s);
                                    if(before != null && before.equals(((Map)data.get(p)).get(s))){
                                        rowSpanTaxCount++;
                                    }else{
                                        if(rowSpanTaxCount > 0){
                                            //合并单元格
                                            CellRangeAddress region = new CellRangeAddress(rowId-1,rowId+rowSpanTaxCount-1,ind,ind);
                                            sheet.addMergedRegion(region);
                                        }
                                        rowSpanTaxCount = 0;
                                        rowId = rowIdEnd;
                                    }
                                }

                            }
                            if(rowSpanTaxCount > 0){
                                //合并单元格
//                                CellRangeAddress region = new CellRangeAddress(rowId,rowId+rowSpanTaxCount,ind,ind);
                                CellRangeAddress region = new CellRangeAddress(rowId-1,rowId+rowSpanTaxCount-1,ind,ind);
//                                CellRangeAddress region = new CellRangeAddress(1,2,0,0);
                                sheet.addMergedRegion(region);
                            }
                        }
                    }
                }
                workbook.write(bos);
                bos.flush();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != is) {
                        is.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return bos;
    }
    /**
     * 导出
     *
     *tempPath 模板文件路径
     *pojoClass 列表字段
     *params excel数据项
     *mergeCols 合并字段
     *data 列表数据
     *titleClass 特殊表头字段
     *fileName 导出文件名
     * dataRowId 数据起始位置，从1开始计算
     */
    public ByteArrayOutputStream exportExcel(String tempPath, Class<?> pojoClass,ImportParams params,
                                             List<String> mergeCols, List data, Integer dataRowId) throws Exception {
        InputStream is = null;
        XSSFWorkbook workbook = null;
        XSSFSheet sheet = null;
        try {
            is = getTempleteStream(tempPath);// 将excel文件转为输入流
            workbook = new XSSFWorkbook(is);// 创建个workbook，
            // 获取第一个sheet
            sheet = workbook.getSheetAt(0);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        ByteArrayOutputStream bos = null;
        if (sheet != null) {
            setTitleExcel(sheet, params);
            List<ColHeadView> colHeadViews = getExcelCols(sheet, pojoClass, params);
            try {
                // 写数据
                bos = new ByteArrayOutputStream();

                if(data!=null){
                    setBody(workbook,sheet, data, colHeadViews);
                    if(mergeCols != null && mergeCols.size() > 0){
                        for(String s : mergeCols){
                            int ind=-1;
                            for(int d = 0; d < colHeadViews.size(); d++){
                                ColHeadView col = colHeadViews.get(d);
                                if(s.equals(col.getColName())){
                                    ind = d;
                                    break;
                                }
                            }
//                            ind = newColHeadViews.indexOf(s);
                            int rowId = dataRowId;
                            int rowIdEnd = dataRowId-1;
                            Object before = "";
                            int rowSpanTaxCount = 0;
                            for(int p = 0; p < data.size(); p++){
                                rowIdEnd++;
                                if(p > 0){
                                    before = ((Map)data.get(p - 1)).get(s);
                                    if(before != null && before.equals(((Map)data.get(p)).get(s))){
                                        rowSpanTaxCount++;
                                    }else{
                                        if(rowSpanTaxCount > 0){
                                            //合并单元格
                                            CellRangeAddress region = new CellRangeAddress(rowId-1,rowId+rowSpanTaxCount-1,ind,ind);
                                            sheet.addMergedRegion(region);
                                        }
                                        rowSpanTaxCount = 0;
                                        rowId = rowIdEnd;
                                    }
                                }

                            }
                            if(rowSpanTaxCount > 0){
                                //合并单元格
//                                CellRangeAddress region = new CellRangeAddress(rowId,rowId+rowSpanTaxCount,ind,ind);
                                CellRangeAddress region = new CellRangeAddress(rowId-1,rowId+rowSpanTaxCount-1,ind,ind);
//                                CellRangeAddress region = new CellRangeAddress(1,2,0,0);
                                sheet.addMergedRegion(region);
                            }
                        }
                    }
                }
                workbook.write(bos);
                bos.flush();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != is) {
                        is.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return bos;
    }

    /**
     *tempPath 模板文件路径
     */
    public ByteArrayOutputStream exportExcelTemplete(String tempPath) throws Exception {
        InputStream is = null;
        XSSFWorkbook workbook = null;
        XSSFSheet sheet = null;
        try {
            is = getTempleteStream(tempPath);// 将excel文件转为输入流
            workbook = new XSSFWorkbook(is);// 创建个workbook，
            // 获取第一个sheet
            sheet = workbook.getSheetAt(0);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        ByteArrayOutputStream bos = null;
        if (sheet != null) {
            try {
                bos = new ByteArrayOutputStream();
                workbook.write(bos);
                bos.flush();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != is) {
                        is.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return bos;
    }

    private void setBody(XSSFWorkbook wb, XSSFSheet sheet, List data, List<ColHeadView> colHeadViews) {
        currentRow++;

        for (int i = 0; i < data.size(); i++) {
            Object rowData = data.get(i);
            Map rowMap = class2Map(rowData);
            rowMap.put("sequence_oid", i + 1);
            // 创建行
            XSSFRow row = sheet.createRow(currentRow);
            for (int t = 0; t < colHeadViews.size(); t++) {
                ColHeadView colHeadView = colHeadViews.get(t);
                String colname = colHeadView.getColName();
                Object colValue = null;
                colValue = rowMap.get(colname);

                String cellType = "CELL_TYPE_STRING";
                if (colHeadView.getColType() != null) {
                    String colType = colHeadView.getColType();
                    if (colType == null || colType.trim().equals("")) {
                        colType = "CELL_TYPE_FORMULA";
                    }
                    cellType = getCellType(colType);
                } else {
                    if (colValue == null) {
                        colValue = colHeadView.getFormula();
                        if (colValue != null) {
                            String colType = colHeadView.getColType();
                            if (colType == null || colType.trim().equals("")) {
                                colType = "CELL_TYPE_FORMULA";
                            }
                            cellType = getCellType(colType);
                        } else {
                            cellType = getCellType(String.class.getName());
                        }

                    } else {
                        cellType = getCellType(colValue.getClass().getName());
                    }

                }

                Format format = colHeadView.getFormat();
                setCellValue(wb, sheet, row, t, cellType, colValue, format);
            }
            currentRow++;
        }
    }

    private Map class2Map(Object object) {
        if (object instanceof Map) {
            return (Map) object;
        }
        try {
            Class beanClass = object.getClass();
            BeanInfo beanInfo = Introspector.getBeanInfo(beanClass);
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            Map map = new HashMap();
            for (int i = 0; i < descriptors.length; i++) {
                String key = descriptors[i].getName();
                Method method = beanClass.getMethod("get" + StringUtils.capitalize(key), new Class[0]);
                Object value = method.invoke(object, new Object[0]);
                map.put(key, value);
            }
            return map;
        } catch (Exception e) {
            throw new BusinessException(e);
        }
    }

    private String getCellType(String celType) {
        if (celType.equals(String.class.getName())) {
            return "CELL_TYPE_STRING";
        }
        if (celType.equals(Date.class.getName())) {
            return "CELL_TYPE_STRING";
        }

        if (celType.equals(Integer.class.getName())) {
            return "CELL_TYPE_INTEGER";
        }
        if (celType.equals(Short.class.getName())) {
            return "CELL_TYPE_INTEGER";
        }
        if (celType.equals(Double.class.getName())) {
            return "CELL_TYPE_NUMERIC";
        }
        if (celType.equals(Float.class.getName())) {
            return "CELL_TYPE_NUMERIC";
        }
        if (celType.equals(BigDecimal.class.getName())) {
            return "CELL_TYPE_NUMERIC";
        }
        if (celType.equals(Long.class.getName())) {
            return "CELL_TYPE_INTEGER";
        }

        if (celType.equals(Boolean.class.getName())) {
            return "CELL_TYPE_BOOLEAN";
        }

        if (celType.equals("CELL_TYPE_FORMULA")) {
            return "CELL_TYPE_FORMULA";
        }
        return "CELL_TYPE_STRING";
    }

    private void setCellValue(XSSFWorkbook wb, XSSFSheet sheet, XSSFRow row, int colIndex, String cellType,
                              Object value, Format format) {
        // 创建单元格
        XSSFCell cell = row.createCell(colIndex);
        // 设置单元格内容

        if (cellType.equals("CELL_TYPE_STRING")) {
            if (value instanceof Date) {
                // 创建单元格样式
                Date temp = DateUtils.addHours((Date) value, 8);
                cell.setCellStyle(getDateStyle(wb));
                cell.setCellValue(temp);
                return;
            } else {
                if (value == null) {
                    cell.setCellStyle(getStringStyle(wb));
                    return;
                }
                // if (!((String) value).startsWith("0") || ((String)
                // value).startsWith("0.")) {
                // int maxLength = 10;
                // if (((String) value).indexOf(".") >= 0) {
                // maxLength++;
                // }
                //
                // if ((((String) value).length() <= maxLength)) {
                // if (((String) value).matches("0|[1-9]\\d*")) { // 整数
                // cell.setCellStyle(getNumStyle(wb));
                // cell.setCellValue(Double.valueOf((String)
                // value).doubleValue());
                // return;
                // } else if (((String) value).matches("^(\\d*\\.)?\\d+$")
                // || ((String) value).matches("^-(\\d*\\.)?\\d+$")) { // 浮点数
                // cell.setCellStyle(getNumStyle(wb));
                // cell.setCellValue(Double.valueOf((String)
                // value).doubleValue());
                // return;
                // }
                // }
                // } else if (((String) value).equals("0")) {
                // cell.setCellStyle(getNumStyle(wb));
                // cell.setCellValue(Double.valueOf((String)
                // value).doubleValue());
                // return;
                // }
                cell.setCellStyle(getStringStyle(wb));
                cell.setCellValue(((String) value).trim());
                return;
            }

        } else if (cellType.equals("CELL_TYPE_NUMERIC") || cellType.equals("CELL_TYPE_INTEGER")) {
            cell.setCellStyle(getNumStyle(wb));
            if (value instanceof Integer) {
                cell.setCellValue((Integer) value);
                return;
            } else if (value instanceof Short) {
                cell.setCellValue((Short) value);
                return;
            } else if (value instanceof Double) {
                if (format != null) {
                    value = Double.valueOf(format.format(value));
                }
                cell.setCellValue((Double) value);
                return;
            } else if (value instanceof Float) {
                if (format != null) {
                    value = Float.valueOf(format.format(value));
                }
                cell.setCellValue((Float) value);
                return;
            } else if (value instanceof BigDecimal) {
                if (format != null) {
                    value = new BigDecimal(format.format(value));
                }
                cell.setCellValue(((BigDecimal) value).doubleValue());
                return;
            } else if (value instanceof Long) {
                cell.setCellValue((Long) value);
                return;
            }
        } else if (cellType.equals("CELL_TYPE_FORMULA")) {
            // Formula f = new Formula(colIndex,rowIndex, StringUtil.replace(
            // value.toString(), "#row#", (rowIndex+1) + ""), wcf_body);
            // sheet.addCell(f);
            return;
        } else if (cellType.equals("CELL_TYPE_BOOLEAN")) {
            cell.setCellValue((Boolean) value);
            return;
        }

        cell.setCellStyle(getStringStyle(wb));
    }

    private XSSFCellStyle numStyle;
    private XSSFCellStyle dateStyle;
    private XSSFCellStyle stringStyle;

    private XSSFCellStyle getStyle(XSSFWorkbook wb) {
        XSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(XSSFCellStyle.ALIGN_LEFT);
        style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
        // 设置字体
        XSSFFont font = wb.createFont();
        font.setFontHeightInPoints((short) 10);
        style.setFont(font);
        // 自动换行
        style.setWrapText(false);
        // 设置边框
        style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
        style.setLeftBorderColor(IndexedColors.GREEN.getIndex());
        style.setBorderRight(XSSFCellStyle.BORDER_THIN);
        style.setRightBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderTop(XSSFCellStyle.BORDER_THIN);
        style.setTopBorderColor(IndexedColors.BLACK.getIndex());
        return style;
    }

    private XSSFCellStyle getStringStyle(XSSFWorkbook wb) {
        if (stringStyle != null) {
            return stringStyle;
        }

        stringStyle = getStyle(wb);
        return stringStyle;

    }

    private XSSFCellStyle getNumStyle(XSSFWorkbook wb) {
        if (numStyle != null) {
            return numStyle;
        }

        numStyle = getStyle(wb);
        numStyle.setAlignment(XSSFCellStyle.ALIGN_LEFT);
        return numStyle;

    }

    private XSSFCellStyle getDateStyle(XSSFWorkbook wb) {
        if (dateStyle != null) {
            return dateStyle;
        }

        XSSFDataFormat df = wb.createDataFormat();
        dateStyle = getStyle(wb);
        dateStyle.setDataFormat(df.getFormat("yyyy-MM-dd"));
        return dateStyle;
    }

    /**
     *根据当前row行，来创建index标记的列数,并赋值数据
     */
    private void createRowAndCell(Object obj, XSSFRow row, XSSFCell cell, int index) {
        cell = row.getCell(index);
        if (cell == null) {
            cell = row.createCell(index);
        }

        if (obj != null)
            cell.setCellValue(obj.toString());
        else
            cell.setCellValue("");
    }

    /**
     * 复制文件
     *
     * @param s
     *            源文件
     * @param t
     *            复制到的新文件
     */

    public static void fileChannelCopy(File s, File t) {
        try {
            InputStream in = null;
            OutputStream out = null;
            try {
                in = new BufferedInputStream(new FileInputStream(s), 1024);
                out = new BufferedOutputStream(new FileOutputStream(t), 1024);
                byte[] buffer = new byte[1024];
                int len;
                while ((len = in.read(buffer)) != -1) {
                    out.write(buffer, 0, len);
                }
            } finally {
                if (null != in) {
                    in.close();
                }
                if (null != out) {
                    out.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 读取excel模板，并复制到新文件中供写入和下载
     *
     * @return
     */
    public static File createNewFile(String tempPath, String rPath) {
        File directory = new File(".");//设定为当前文件夹
        try{
            System.out.println(directory.getCanonicalPath());//获取标准的路径
            System.out.println(directory.getAbsolutePath());//获取绝对路径
        }catch(Exception e){}
        // 读取模板，并赋值到新文件************************************************************
        // 文件模板路径
        String path = (tempPath);
        File file = new File(path);
        // 保存文件的路径
        String realPath = rPath;
        // 新的文件名
        String newFileName = System.currentTimeMillis() + ".xlsx";
        // 判断路径是否存在
        File dir = new File(realPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        // 写入到新的excel
        File newFile = new File(realPath, newFileName);
        try {
            newFile.createNewFile();
            // 复制模板到新文件
            fileChannelCopy(file, newFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newFile;
    }

    /**
     * 下载成功后删除
     *
     * @param files
     */
    public static void deleteFile(File... files) {
        for (File file : files) {
            if (file.exists()) {
                file.delete();
            }
        }
    }

    private void setTitleExcel(Sheet sheet, Class<?> pojoClass, ImportParams params, Object object) throws Exception {
        Map<String, ExcelImportEntity> excelParams = new HashMap<String, ExcelImportEntity>();
        List<List<MultiTitle>> multiTitleList = null;
        Iterator<Row> rows = sheet.rowIterator();
//        List<String> multiTitles = null;  //excel模板表头
        ImportParamsVO paramsVO = null;
        Map<String, ColHeadView> colMultiMap = new HashMap<>();
        if(params instanceof ImportParamsVO) {
            paramsVO = (ImportParamsVO) params;
            if(paramsVO.getIsLandscape() && paramsVO.getTitleNum() > 0){
//                multiTitles = getMultiTitleList(sheet, rows, paramsVO);
                multiTitleList = paramsVO.getMultiTitleList();
            }
        }
        String targetId = null;
        if (!Map.class.equals(pojoClass)) {
            Field fileds[] = PoiPublicUtil.getClassFields(pojoClass);
            getDoubleTitleExcelField(targetId, fileds, excelParams, colMultiMap, pojoClass, null);
        }


        // 跳过表头和标题行 向特殊表头填数据
        setTitleData(params, colMultiMap, multiTitleList, rows, paramsVO, object);
    }

    private void setTitleExcel(Sheet sheet, ImportParams params) throws Exception {
        List<List<MultiTitle>> multiTitleList = null;
        Iterator<Row> rows = sheet.rowIterator();
        List<String> multiTitles = null;  //excel模板表头
        ImportParamsVO paramsVO = null;
        Map<String, ColHeadView> colMultiMap = new HashMap<>();
        if(params instanceof ImportParamsVO) {
            paramsVO = (ImportParamsVO) params;
            if(paramsVO.getIsLandscape() && paramsVO.getTitleNum() > 0){
//                multiTitles = getMultiTitleList(sheet, rows, paramsVO);
                multiTitleList = paramsVO.getMultiTitleList();
            }
        }
//        String targetId = null;
//        if (!Map.class.equals(pojoClass)) {
//            Field fileds[] = PoiPublicUtil.getClassFields(pojoClass);
//            getDoubleTitleExcelField(targetId, fileds, excelParams, colMultiMap, pojoClass, null);
//        }


        // 跳过表头和标题行 向特殊表头填数据
        setTitleData(params, colMultiMap, multiTitleList, rows, paramsVO, null);
    }

    private List<ColHeadView> getExcelCols(Sheet sheet, Class<?> pojoClass, ImportParams params) throws Exception {
        Map<String, ExcelImportEntity> excelParams = new HashMap<String, ExcelImportEntity>();
        List<ExcelCollectionParams> excelCollection = new ArrayList<ExcelCollectionParams>();
        List<ColHeadView> colHeadViewList = new ArrayList<>();
        Map<String, ColHeadView> colMap = new HashMap<>();
        String targetId = null;
        if (!Map.class.equals(pojoClass)) {
            Field fileds[] = PoiPublicUtil.getClassFields(pojoClass);
            ExcelTarget etarget = pojoClass.getAnnotation(ExcelTarget.class);
            if (etarget != null) {
                targetId = etarget.value();
            }
            if(fileds.length > 0){
                //判断是否有双层表头标识
//                boolean flag = false;
//                for(Field field : fileds){
//                    if(PoiPublicUtil.isJavaClass(fileds[1])){
//                        if(fileds[1].getAnnotation(Excel.class) != null && fileds[1].getAnnotation(Excel.class).name().indexOf("_") > 0){
//                            flag = true;
//                        }
//                    }else {
//                        flag = false;
//                    }
//                }
//                //获取实体类excel表头字段
//                if(flag){
//                    getDoubleTitleExcelField(targetId, fileds, excelParams,colMap, pojoClass, null);
//                }else{
//                    getAllExcelField(targetId, fileds, excelParams,colMap, pojoClass, null);
//                }
                getDoubleTitleExcelField(targetId, fileds, excelParams,colMap, pojoClass, null);
            }
        }
        Iterator<Row> rows = sheet.rowIterator();
        List<String> titleList = null;  //excel模板表头

        titleList = getTitleList(sheet, rows, params, excelCollection);

        //获取模板的字段及对应的变量名
        if(titleList.size() > 0){
            for(String text : titleList){
                colHeadViewList.add(colMap.get(text));
            }
        }

        return colHeadViewList;
    }

    private void setTitleData(ImportParams params, Map<String, ColHeadView> colMap,
                              List<List<MultiTitle>> multiTitleList, Iterator<Row> rows, ImportParamsVO paramsVO, Object object) throws Exception {
        Row row = null;
        List<MultiTitle> multiTitles = null;
        int k = 0;
        // 跳过表头和标题行
        for (int j = 0; j < params.getTitleRows() + params.getHeadRows(); j++) {
            currentRow++;
            row = rows.next();
            if(paramsVO != null && j >= paramsVO.getStartTitle() && j < paramsVO.getStartTitle() + paramsVO.getTitleNum()){
                if(paramsVO.getIsLandscape()){
                    multiTitles = multiTitleList.get(j - paramsVO.getStartTitle());
                    int i = 0;
                    String titleName = "";
                    for(MultiTitle multiTitle : multiTitles){
                        Cell cell = row.getCell(i);
                        String value = getKeyValue(cell);
                        if(!"".equals(multiTitle.getTitle()) && multiTitle.getTitle().equals(value)){
                            titleName = multiTitle.getTitle();
                        }else{
                            if (colMap.containsKey(titleName)) {
                                Method method = object.getClass().getMethod("get" + StringUtils.capitalize(colMap.get(titleName).getColName()), new Class[0]);
                                cell.setCellValue((String) method.invoke(object, new Object[0]));
                            }
                        }
                        i += multiTitle.getCols();
                    }
                }
            }
        }
    }

    /**
     * 获取需要导出的全部字段
     *
     * @param targetId
     *            目标ID
     * @param fields
     * @throws Exception
     */
    public void getDoubleTitleExcelField(String targetId, Field[] fields, Map<String, ExcelImportEntity> excelParams, Map<String, ColHeadView> colMap, Class<?> pojoClass, List<Method> getMethods) throws Exception {
        ExcelImportEntity excelEntity = null;
        ColHeadView col = null;
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (isNotUserExcelUserThis(null, field, targetId)) {
                continue;
            }
            addDoubleTitleEntityToMap(targetId, field, excelEntity, pojoClass, getMethods, excelParams, col, colMap);
        }
    }

    /**
     * 获取需要导出的全部字段
     *
     *
     * @param targetId
     *            目标ID
     * @param fields
     * @throws Exception
     */
    public void getAllExcelField(String targetId, Field[] fields, Map<String, ExcelImportEntity> excelParams, Map<String, ColHeadView> colMap, Class<?> pojoClass, List<Method> getMethods) throws Exception {
        ExcelImportEntity excelEntity = null;
        ColHeadView col = null;
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (isNotUserExcelUserThis(null, field, targetId)) {
                continue;
            }
            addEntityToMap(targetId, field, excelEntity, pojoClass, getMethods, excelParams);
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
    public void addDoubleTitleEntityToMap(String targetId, Field field, ExcelImportEntity excelEntity, Class<?> pojoClass,
                List<Method> getMethods, Map<String, ExcelImportEntity> temp, ColHeadView col, Map<String, ColHeadView> colMap) throws Exception {
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
        col = new ColHeadView();
        col.setColName(field.getName());
//        col.setColText(excel.name());
        getColText(col, excel);
        if (getMethods != null) {
            List<Method> newMethods = new ArrayList<Method>();
            newMethods.addAll(getMethods);
            newMethods.add(excelEntity.getMethod());
            excelEntity.setMethods(newMethods);
        }
        temp.put(excelEntity.getName(), excelEntity);
        colMap.put(excel.name(), col);

    }

    private void getColText(ColHeadView col, Excel excel) {
        String name = excel.name();
        String text = "";
        if(name != null && !"".equals(name)){
            String[] strings = name.split("_");
            if(strings.length >= 2){
                text = strings[strings.length - 1];
            }else{
                text = name;
            }
        }
        col.setColText(text);
    }

    private List<String> getMultiTitleList(Sheet sheet, Iterator<Row> rows, ImportParamsVO params) {
        List<String> titleList = new ArrayList<>();
        Iterator<Cell> cellTitle = null;
        Row headRow = null;
        int headBegin = params.getStartTitle();

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
                    titleList.add(value);// 加入表头列表
                }
            }
        }
        return titleList;
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
                        titlemap.put(cell.getColumnIndex(), value);
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
    private List<String> getTitleList(Sheet sheet, Iterator<Row> rows, ImportParams params,
                                      List<ExcelCollectionParams> excelCollection) {
        List<String> titleList = new ArrayList<>();
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
        if(params.getHeadRows() == 1){
            cellTitle = headRow.cellIterator();
            while (cellTitle.hasNext()) {
                Cell cell = cellTitle.next();
                String value = getKeyValue(cell);
                if (StringUtils.isNotEmpty(value)) {
                    titleList.add(value);// 加入表头列表
                }
            }
        }

        // 多行表头
        for (int j = headBegin; j < headBegin + params.getHeadRows() - 1; j++) {
            headRow = sheet.getRow(j);
            cellTitle = headRow.cellIterator();
            while (cellTitle.hasNext()) {
                Cell cell = cellTitle.next();
                String value = getKeyValue(cell);
                int columnIndex = cell.getColumnIndex();
                if (StringUtils.isNotEmpty(value)) {
                    // 当前cell的上一行是否为合并单元格
                    if (ExcelUtil.isMergedRegion(sheet, cell.getRowIndex() - 1, columnIndex)) {
                        collectionName = ExcelUtil.getMergedRegionValue(sheet, cell.getRowIndex() - 1, columnIndex);
                        titleList.add(collectionName + "_" + value);
                    } else {
                        //双层表头获取上一行单元格值
                        collectionName = ExcelUtil.getCellValue(sheet.getRow(cell.getRowIndex() - 1).getCell(columnIndex));
                        titleList.add(collectionName + "_" + value);
//                        titleList.add(value);
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
                }else if(ExcelUtil.isMergedRegion(sheet, cell.getRowIndex() - 1, columnIndex)){
                    collectionName = ExcelUtil.getMergedRegionValue(sheet, cell.getRowIndex() - 1, columnIndex);
                    titleList.add(collectionName);
                }
            }
        }
        return titleList;
    }

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


}
