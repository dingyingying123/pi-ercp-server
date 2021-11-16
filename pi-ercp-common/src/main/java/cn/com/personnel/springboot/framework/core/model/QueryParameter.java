package cn.com.personnel.springboot.framework.core.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lfjin
 *
 */
public class QueryParameter {
    private Map<String, Object> params = new HashMap<String, Object>();
    /**
     * 排序的多个列,如: username desc
     */
    private String              sortColumns;

    /**
     * @return the params
     */
    public Map<String, Object> getParams() {
        return params;
    }

    /**
     * @return the sortColumns
     */
    public String getSortColumns() {
        return sortColumns;
    }

    /**
     * @param params
     *            the params to set
     */
    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    /**
     * @param sortColumns
     *            the sortColumns to set
     */
    public void setSortColumns(String sortColumns) {
        this.sortColumns = sortColumns;
    }
}
