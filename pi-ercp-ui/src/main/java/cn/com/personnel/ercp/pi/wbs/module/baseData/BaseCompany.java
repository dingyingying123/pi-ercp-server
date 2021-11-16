package cn.com.personnel.ercp.pi.wbs.module.baseData;

import java.io.Serializable;

public class BaseCompany implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 805312988716996885L;

    /**
     * 公司代码
     */
    private String bukrs;

    /**
     * 公司名称
     */
    private String butxt;

    /**
     * 公司地址
     */
    private String bukrs_street;

    /**
     * 行项目-预留字段1
     */
    private String zreserve_i_f1;

    /**
     * 行项目-预留字段2
     */
    private String zreserve_i_f2;

    /**
     * 行项目-预留字段3
     */
    private String zreserve_i_f3;

    /**
     * 公司营业税编号
     */
    private String stceg;

    /**
     * 获取公司代码
     *
     * @return bukrs - 公司代码
     */
    public String getBukrs() {
        return bukrs;
    }

    /**
     * 设置公司代码
     *
     * @param bukrs
     *            公司代码
     */
    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    /**
     * 获取公司名称
     *
     * @return butxt - 公司名称
     */
    public String getButxt() {
        return butxt;
    }

    /**
     * 设置公司名称
     *
     * @param butxt
     *            公司名称
     */
    public void setButxt(String butxt) {
        this.butxt = butxt;
    }

    /**
     * 获取公司营业税编号
     *
     * @return stceg - 公司营业税编号
     */
    public String getStceg() {
        return stceg;
    }

    /**
     * 设置公司营业税编号
     *
     * @param stceg
     *            公司营业税编号
     */
    public void setStceg(String stceg) {
        this.stceg = stceg;
    }

    public String getBukrs_street() {
        return bukrs_street;
    }

    public void setBukrs_street(String bukrs_street) {
        this.bukrs_street = bukrs_street;
    }

    public String getZreserve_i_f1() {
        return zreserve_i_f1;
    }

    public void setZreserve_i_f1(String zreserve_i_f1) {
        this.zreserve_i_f1 = zreserve_i_f1;
    }

    public String getZreserve_i_f2() {
        return zreserve_i_f2;
    }

    public void setZreserve_i_f2(String zreserve_i_f2) {
        this.zreserve_i_f2 = zreserve_i_f2;
    }

    public String getZreserve_i_f3() {
        return zreserve_i_f3;
    }

    public void setZreserve_i_f3(String zreserve_i_f3) {
        this.zreserve_i_f3 = zreserve_i_f3;
    }

    @Override
    public String toString() {
        return "BaseCompany [bukrs=" + bukrs + ", butxt=" + butxt + ", bukrs_street=" + bukrs_street
                + ", zreserve_i_f1=" + zreserve_i_f1 + ", zreserve_i_f2=" + zreserve_i_f2 + ", zreserve_i_f3="
                + zreserve_i_f3 + ", stceg=" + stceg + "]";
    }

}