package cn.com.personnel.ercp.common.util;

import org.apache.commons.io.IOUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class ExcelUtil {

    private Workbook workbook;

    public ExcelUtil(Workbook workbook) {
        this.workbook = workbook;
    }
    public ExcelUtil(MultipartFile file) {
        InputStream is = null;
        try {
            is =  file.getInputStream();
            if (file.getOriginalFilename().endsWith(".xls")) {
                // Excel2003及以前版本
                workbook = new HSSFWorkbook(is);
            } else if (file.getOriginalFilename().endsWith(".xlsx")){
                // Excel2007及以后版本
                workbook = new XSSFWorkbook(is);
            }else {
                throw new RuntimeException("文件格式错误");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(is);
        }
    }
    public static String getCellValue(Cell cell) {
        if (cell==null){
            return "";
        }
        String cellValue = null;
        switch (cell.getCellTypeEnum()) {
            // 数字
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    cellValue = sdf.format(DateUtil.getJavaDate(cell.getNumericCellValue()));
                } else {
                    DataFormatter dataFormatter = new DataFormatter();
                    cellValue = dataFormatter.formatCellValue(cell);
                }
                break;
            // 字符串
            case STRING:
                cellValue = cell.getStringCellValue();
                break;
            // Boolean
            case BOOLEAN:
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            // 公式
            case FORMULA:
                cellValue = cell.getCellFormula();
                break;
            // 空值
            case BLANK:
                cellValue = null;
                break;
            // 错误
            case ERROR:
                cellValue = "非法字符";
                break;
            default:
                cellValue = "未知类型";
                break;
        }
        return cellValue;
    }

    public List<List<String>> getData() {
        try {
            Sheet sheet = workbook.getSheetAt(0);
            List<List<String>> allData = new LinkedList<List<String>>();

            for (Row row:sheet) {
                List<String> oneRow = new LinkedList<String>();
                //不读表头
                if(row.getRowNum()==0){
                    continue;
                }else {
                    short lastCellNum = row.getLastCellNum();
                    for (short i=0;i<lastCellNum;i++){
                        Cell cell = row.getCell(i);
                        oneRow.add(ExcelUtil.getCellValue(cell));
                    }
                    allData.add(oneRow);
                }

            }

            for (int i = 0; i < allData.size(); i++) {
                System.out.println(allData.get(i));
            }
            //关闭workbook
            workbook.close();
            return allData;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<List<String>> getExcelRowData() {
        try {
            Sheet sheet = workbook.getSheetAt(0);
            List<List<String>> allData = new LinkedList<List<String>>();
            for (Row row : sheet) {
                List<String> oneRow = new LinkedList<String>();
                for (Cell cell : row) {
                    oneRow.add(ExcelUtil.getCellValue(cell));
                }
                allData.add(oneRow);
            }
            //关闭workbook
            workbook.close();
            return allData;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
