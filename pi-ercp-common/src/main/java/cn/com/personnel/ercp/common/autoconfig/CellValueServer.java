/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.autoconfig;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.jeecgframework.poi.excel.entity.params.ExcelImportEntity;
import org.jeecgframework.poi.excel.entity.sax.SaxReadCellEntity;
import org.jeecgframework.poi.exception.excel.ExcelImportException;
import org.jeecgframework.poi.exception.excel.enums.ExcelImportEnum;
import org.jeecgframework.poi.handler.inter.IExcelDataHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Cell 取值服务 判断类型处理数据 1.判断Excel中的类型 2.根据replace替换值 3.handler处理数据 4.判断返回类型转化数据返回
 * 
 */
public class CellValueServer {

    private static final Logger LOGGER      = LoggerFactory.getLogger(CellValueServer.class);

    private List<String>        hanlderList = null;

    /**
     * 获取单元格内的值
     * 
     * 修改方法调整读取到数字文本 小数位位.0的特殊处理
     * 
     * @param xclass
     * @param cell
     * @param entity
     * @return
     */
    private Object getCellValue(String xclass, Cell cell, ExcelImportEntity entity) {

        if (cell == null) {
            return "";
        }
        Object result = null;
        // 日期格式比较特殊,和cell格式不一致
        if ("class java.util.Date".equals(xclass) || ("class java.sql.Time").equals(xclass)) {
            if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                // 日期格式
                result = cell.getDateCellValue();
            } else {
                cell.setCellType(Cell.CELL_TYPE_STRING);
                result = getDateData(entity, cell.getStringCellValue());
            }
            if (("class java.sql.Time").equals(xclass)) {
                result = new Time(((Date) result).getTime());
            }
        } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
            //判断是否为日期类型
            if(HSSFDateUtil.isCellDateFormatted(cell)){
                //用于转化为日期格式
                Date d = cell.getDateCellValue();
                SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                result = formater.format(d);
            }else{
                // 用于格式化数字，只保留数字的整数部分
//                DecimalFormat df = new DecimalFormat("########");
//                result = df.format(cell.getNumericCellValue());

                double num = cell.getNumericCellValue();
                double eps = 1e-10; // 精度范围
                if (num - ((int) num) < eps) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    result = cell.getStringCellValue();
                } else {
                    result = cell.getNumericCellValue();
                }
            }
        } else if (Cell.CELL_TYPE_FORMULA == cell.getCellType()) {
            try {
                result = cell.getStringCellValue();
            } catch (IllegalStateException e) {
                result = String.valueOf(cell.getNumericCellValue());
            }
        } else if (Cell.CELL_TYPE_BOOLEAN == cell.getCellType()) {
            result = cell.getBooleanCellValue();
        } else {
            result = cell.getStringCellValue();
        }

        return result;
    }

    /**
     * 获取日期类型数据
     * 
     * @Author JueYue
     * @date 2013年11月26日
     * @param entity
     * @param value
     * @return
     */
    private Date getDateData(ExcelImportEntity entity, String value) {
        if (StringUtils.isNotEmpty(entity.getFormat()) && StringUtils.isNotEmpty(value)) {
            SimpleDateFormat format = new SimpleDateFormat(entity.getFormat());
            try {
                return format.parse(value);
            } catch (ParseException e) {
                LOGGER.error("时间格式化失败,格式化:{},值:{}", entity.getFormat(), value);
                throw new ExcelImportException(ExcelImportEnum.GET_VALUE_ERROR);
            }
        }
        return null;
    }

    /**
     * 获取cell的值
     * 
     * @param object
     * @param excelParams
     * @param cell
     * @param titleString
     */
    public Object getValue(IExcelDataHandler dataHanlder, Object object, Cell cell,
            Map<String, ExcelImportEntity> excelParams, String titleString) throws Exception {
        ExcelImportEntity entity = excelParams.get(titleString);
        String xclass = "class java.lang.Object";
        if (!(object instanceof Map)) {
            Method setMethod = entity.getMethods() != null && entity.getMethods().size() > 0
                    ? entity.getMethods().get(entity.getMethods().size() - 1) : entity.getMethod();
            Type[] ts = setMethod.getGenericParameterTypes();
            xclass = ts[0].toString();
        }
        Object result = getCellValue(xclass, cell, entity);
        if (entity != null) {
            result = hanlderSuffix(entity.getSuffix(), result);
            result = replaceValue(entity.getReplace(), result);
        }
        result = hanlderValue(dataHanlder, object, result, titleString);
        return getValueByType(xclass, result, entity);
    }

    /**
     * 获取cell值
     * 
     * @param dataHanlder
     * @param object
     * @param entity
     * @param excelParams
     * @param titleString
     * @return
     */
    public Object getValue(IExcelDataHandler dataHanlder, Object object, SaxReadCellEntity cellEntity,
            Map<String, ExcelImportEntity> excelParams, String titleString) {
        ExcelImportEntity entity = excelParams.get(titleString);
        Method setMethod = entity.getMethods() != null && entity.getMethods().size() > 0
                ? entity.getMethods().get(entity.getMethods().size() - 1) : entity.getMethod();
        Type[] ts = setMethod.getGenericParameterTypes();
        String xclass = ts[0].toString();
        Object result = cellEntity.getValue();
        result = hanlderSuffix(entity.getSuffix(), result);
        result = replaceValue(entity.getReplace(), result);
        result = hanlderValue(dataHanlder, object, result, titleString);
        return getValueByType(xclass, result, entity);
    }

    /**
     * 把后缀删除掉
     * 
     * @param result
     * @param suffix
     * @return
     */
    private Object hanlderSuffix(String suffix, Object result) {
        if (StringUtils.isNotEmpty(suffix) && result != null && result.toString().endsWith(suffix)) {
            String temp = result.toString();
            return temp.substring(0, temp.length() - suffix.length());
        }
        return result;
    }

    /**
     * 根据返回类型获取返回值
     * 
     * @param xclass
     * @param result
     * @param entity
     * @return
     */
    private Object getValueByType(String xclass, Object result, ExcelImportEntity entity) {
        try {
            if ("class java.util.Date".equals(xclass)) {
                return result;
            }
            if ("class java.lang.Boolean".equals(xclass) || "boolean".equals(xclass)) {
                return Boolean.valueOf(String.valueOf(result));
            }
            if ("class java.lang.Double".equals(xclass) || "double".equals(xclass)) {
                return Double.valueOf(String.valueOf(result));
            }
            if ("class java.lang.Long".equals(xclass) || "long".equals(xclass)) {
                return Long.valueOf(String.valueOf(result));
            }
            if ("class java.lang.Float".equals(xclass) || "float".equals(xclass)) {
                if (ObjectUtils.isEmpty(result))
                    return null;
                return Float.valueOf(String.valueOf(result));
            }
            if ("class java.lang.Integer".equals(xclass) || "int".equals(xclass)) {
                return Integer.valueOf(String.valueOf(result));
            }
            if ("class java.math.BigDecimal".equals(xclass)) {
                return new BigDecimal(String.valueOf(result));
            }
            if ("class java.lang.String".equals(xclass)) {
                // 针对String 类型,但是Excel获取的数据却不是String,比如Double类型,防止科学计数法
                if (result instanceof String) {
                    return result;
                }
                // double类型防止科学计数法
                if (result instanceof Double) {
                    String temp = result.toString();
                    if (temp.contains("E")) {
                        BigDecimal bigDecimal = new BigDecimal(temp);
                        temp = bigDecimal.toPlainString();
                    }else{
                        int index=temp.indexOf(".");
                        if(index>0){
                            int dcimalDigits=temp.length()-index-1;
                            if(dcimalDigits<=2){
                                BigDecimal bigDecimal = new BigDecimal(temp);
                                temp=bigDecimal.toPlainString();
                            }else {
                                BigDecimal bigDecimal = new BigDecimal(temp);
                                temp=bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP).toPlainString();
                            }
                        }else{
                            BigDecimal bigDecimal = new BigDecimal(temp);
                            temp=bigDecimal.toPlainString();
                        }
                    }
                    return temp;
                }
                return String.valueOf(result);
            }
            return result;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw new ExcelImportException(ExcelImportEnum.GET_VALUE_ERROR);
        }
    }

    /**
     * 调用处理接口处理值
     * 
     * @param dataHanlder
     * @param object
     * @param result
     * @param titleString
     * @return
     */
    private Object hanlderValue(IExcelDataHandler dataHanlder, Object object, Object result, String titleString) {
        if (dataHanlder == null || dataHanlder.getNeedHandlerFields() == null
                || dataHanlder.getNeedHandlerFields().length == 0) {
            return result;
        }
        if (hanlderList == null) {
            hanlderList = Arrays.asList(dataHanlder.getNeedHandlerFields());
        }
        if (hanlderList.contains(titleString)) {
            return dataHanlder.importHandler(object, titleString, result);
        }
        return result;
    }

    /**
     * 替换值
     * 
     * @param replace
     * @param result
     * @return
     */
    private Object replaceValue(String[] replace, Object result) {
        if (replace != null && replace.length > 0) {
            String temp = String.valueOf(result);
            String[] tempArr;
            for (int i = 0; i < replace.length; i++) {
                tempArr = replace[i].split("_");
                if (temp.equals(tempArr[0])) {
                    return tempArr[1];
                }
            }
        }
        return result;
    }
}