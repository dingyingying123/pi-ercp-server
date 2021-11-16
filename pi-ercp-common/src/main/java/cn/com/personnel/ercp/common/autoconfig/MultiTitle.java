package cn.com.personnel.ercp.common.autoconfig;

public class MultiTitle {
    private String title;  //名称
    private Integer cols;   //合并的列数

    public MultiTitle(String title, Integer cols) {
        this.title = title;
        this.cols = cols;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCols() {
        return cols;
    }

    public void setCols(Integer cols) {
        this.cols = cols;
    }
}
