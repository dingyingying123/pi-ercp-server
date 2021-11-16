package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseExchangeRate;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.math.BigDecimal;
import java.util.List;

public class FssBaseExchangeRateVo extends FssBaseExchangeRate {
    private String mandt;
    private List<String> ids;
    /**
     * 有效自
     */
    @Excel(name = "有效自")
    private String gdatu;

    /**
     * 从货币
     */
    @Excel(name = "从货币")
    private String fcurr;

    /**
     * 最终货币
     */
    @Excel(name = "最终货币")
    private String tcurr;

    /**
     * 汇率
     */
    @Excel(name = "汇率")
    private BigDecimal ukurs;
    public String getMandt() {
        return mandt;
    }

    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    @Override
    public String getGdatu() {
        return gdatu;
    }

    @Override
    public void setGdatu(String gdatu) {
        this.gdatu = gdatu;
    }

    @Override
    public String getFcurr() {
        return fcurr;
    }

    @Override
    public void setFcurr(String fcurr) {
        this.fcurr = fcurr;
    }

    @Override
    public String getTcurr() {
        return tcurr;
    }

    @Override
    public void setTcurr(String tcurr) {
        this.tcurr = tcurr;
    }

    @Override
    public BigDecimal getUkurs() {
        return ukurs;
    }

    @Override
    public void setUkurs(BigDecimal ukurs) {
        this.ukurs = ukurs;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public List<String> getIds() {
        return ids;
    }
}
