package cn.com.personnel.ercp.pi.persistence.entity.sap;

public class SapParam {

    /**
     * 公司名称编码
     */
    private String bukrs;

    /**
     * 客户名称
     */
    private String clientName;

    /**
     * 客户编号
     */
    private String clientKunnr;

    public String getBukrs() {
        return bukrs;
    }

    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientKunnr() {
        return clientKunnr;
    }

    public void setClientKunnr(String clientKunnr) {
        this.clientKunnr = clientKunnr;
    }
}
