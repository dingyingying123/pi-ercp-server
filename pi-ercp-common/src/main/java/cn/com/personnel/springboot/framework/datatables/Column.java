package cn.com.personnel.springboot.framework.datatables;


/**
 * @author lfjin
 *
 */
public class Column {
    private int     index;
    private String  data;

    private String  name;

    private boolean searchable;
    private boolean orderable;

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the orderable
     */
    public boolean isOrderable() {
        return orderable;
    }

    /**
     * @return the searchable
     */
    public boolean isSearchable() {
        return searchable;
    }

    /**
     * @param data
     *            the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @param index
     *            the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param orderable
     *            the orderable to set
     */
    public void setOrderable(boolean orderable) {
        this.orderable = orderable;
    }

    /**
     * @param searchable
     *            the searchable to set
     */
    public void setSearchable(boolean searchable) {
        this.searchable = searchable;
    }
}

