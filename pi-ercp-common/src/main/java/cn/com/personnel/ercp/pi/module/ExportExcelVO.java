package cn.com.personnel.ercp.pi.module;

import java.util.List;
import java.util.Map;

public class ExportExcelVO {
    private String fileName;
    private String colHead;
    private Map<String, Object> filters;
    private List<String> exports;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getColHead() {
        return colHead;
    }

    public void setColHead(String colHead) {
        this.colHead = colHead;
    }

    public Map<String, Object> getFilters() {
        return filters;
    }

    public void setFilters(Map<String, Object> filters) {
        this.filters = filters;
    }

    public List<String> getExports() {
        return exports;
    }

    public void setExports(List<String> exports) {
        this.exports = exports;
    }
}
