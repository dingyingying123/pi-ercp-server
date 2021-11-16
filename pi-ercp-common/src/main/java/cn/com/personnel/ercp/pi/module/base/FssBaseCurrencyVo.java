package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseCurrency;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.Date;
import java.util.List;

public class FssBaseCurrencyVo extends FssBaseCurrency {
    /**
     * 编码
     */
    @Excel(name = "编码")
    private String code;
    /**
     * 名称
     */
    @Excel(name = "名称")
    private String name;

    /**
     * 说明
     */
    @Excel(name = "说明")
    private String description;
    /**
     * 符号
     */
    @Excel(name = "符号")
    private String symbol;
    /**
     * 精确度
     */
    @Excel(name = "精确度")
    private Short accuracy;
    /**
     * 扩展精确度
     */
    @Excel(name = "扩展精确度")
    private Short expendaccuracy;
    /**
     * 生效日期
     */
    @Excel(name = "生效日期")
    private Date effectivedate;
    /**
     * 失效日期
     */
    @Excel(name = "失效日期")
    private Date expirationdate;
    ;
    /**
     * 启用状态
     */
    @Excel(name = "启用状态")
    private String state;

    /**
     * 导出选中数据
     */
    private List<String> ids;


    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public Short getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(short accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public Short getExpendaccuracy() {
        return expendaccuracy;
    }

    public void setExpendaccuracy(short expendaccuracy) {
        this.expendaccuracy = expendaccuracy;
    }

    @Override
    public Date getEffectivedate() {
        return effectivedate;
    }

    @Override
    public void setEffectivedate(Date effectivedate) {
        this.effectivedate = effectivedate;
    }

    @Override
    public Date getExpirationdate() {
        return expirationdate;
    }

    @Override
    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
