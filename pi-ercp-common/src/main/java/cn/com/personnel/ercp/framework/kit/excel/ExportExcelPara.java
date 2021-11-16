package cn.com.personnel.ercp.framework.kit.excel;

import java.util.List;

public class ExportExcelPara {

    private List data;
    private List<ColHeadView> colHeadViews;
    private String sheetName;

    public List getData() {
        return data;
    }
    public void setData(List data) {
        this.data = data;
    }
    public List<ColHeadView> getColHeadViews() {
        return colHeadViews;
    }
    public void setColHeadViews(List<ColHeadView> colHeadViews) {
        this.colHeadViews = colHeadViews;
    }
    public String getSheetName() {
        return sheetName;
    }
    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

}