package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "fss_base_exchange_rate")
public class FssBaseExchangeRate {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 有效自
     */
    private String gdatu;

    /**
     * 从货币
     */
    private String fcurr;

    /**
     * 最终货币
     */
    private String tcurr;

    /**
     * 汇率
     */
    private BigDecimal ukurs;

    /**
     * 1可以修改，0只读
     */
    private String source;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取有效自
     *
     * @return gdatu - 有效自
     */
    public String getGdatu() {
        return gdatu;
    }

    /**
     * 设置有效自
     *
     * @param gdatu 有效自
     */
    public void setGdatu(String gdatu) {
        this.gdatu = gdatu;
    }

    /**
     * 获取从货币
     *
     * @return fcurr - 从货币
     */
    public String getFcurr() {
        return fcurr;
    }

    /**
     * 设置从货币
     *
     * @param fcurr 从货币
     */
    public void setFcurr(String fcurr) {
        this.fcurr = fcurr;
    }

    /**
     * 获取最终货币
     *
     * @return tcurr - 最终货币
     */
    public String getTcurr() {
        return tcurr;
    }

    /**
     * 设置最终货币
     *
     * @param tcurr 最终货币
     */
    public void setTcurr(String tcurr) {
        this.tcurr = tcurr;
    }

    /**
     * 获取汇率
     *
     * @return ukurs - 汇率
     */
    public BigDecimal getUkurs() {
        return ukurs;
    }

    /**
     * 设置汇率
     *
     * @param ukurs 汇率
     */
    public void setUkurs(BigDecimal ukurs) {
        this.ukurs = ukurs;
    }

    /**
     * 获取1可以修改，0只读
     *
     * @return source - 1可以修改，0只读
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置1可以修改，0只读
     *
     * @param source 1可以修改，0只读
     */
    public void setSource(String source) {
        this.source = source;
    }
}