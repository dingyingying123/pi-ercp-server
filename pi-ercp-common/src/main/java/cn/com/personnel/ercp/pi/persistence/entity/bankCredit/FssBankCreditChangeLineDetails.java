package cn.com.personnel.ercp.pi.persistence.entity.bankCredit;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Table(name = "fss_bank_credit_change_line_details")
public class FssBankCreditChangeLineDetails {
    /**
     * 主键
     */
    @Id
    @Column(name = "fbccld_id")
    @GeneratedValue(generator = "JDBC")
    private String fbccldId;

    /**
     * 授信变更主键
     */
    @Column(name = "fbcc_id")
    private String fbccId;

    /**
     * 序号
     */
    private String number;

    /**
     * 授信机构
     */
    @Column(name = "head_name")
    private String headName;

    /**
     * 授信机构编号
     */
    @Column(name = "head_code")
    private String headCode;

    /**
     * 授信机构id
     */
    @Column(name = "head_id")
    private String headId;

    /**
     * 授信主体
     */
    @Column(name = "credit_ccupier")
    private String creditCcupier;

    /**
     * 授信品种
     */
    @Column(name = "credit_varieties")
    private String creditVarieties;

    @Transient
    private List<String> listCreditVarieties;

    /**
     * 授信品种id
     */
    @Column(name = "credit_varieties_id")
    private String creditVarietiesId;

    /**
     * 是否限额
     */
    @Column(name = "is_limit")
    private String isLimit;

    /**
     * 币种
     */
    @Column(name = "currency_name")
    private String currencyName;

    /**
     * 币种编码
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 币种id
     */
    @Column(name = "currency_id")
    private String currencyId;

    /**
     * 总额度
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 总额度折合人民币金额
     */
    @Column(name = "amount_equivalent_currency")
    private BigDecimal amountEquivalentCurrency;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人
     */
    private String updator;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否可用
     */
    private String active;

    /**
     * 模块类型：1(银行授信管理)，2(银行授信变更)
     */
    @Column(name = "module_type")
    private String moduleType;

    /**
     * 有效时间
     */
    @Transient
    private String gdatu;

    /**
     * 从货币
     */
    @Transient
    private String fcurr;

    /**
     * 最终货币
     */
    @Transient
    private String tcurr;

    /**
     * 获取主键
     *
     * @return fbccld_id - 主键
     */
    public String getFbccldId() {
        return fbccldId;
    }

    /**
     * 设置主键
     *
     * @param fbccldId 主键
     */
    public void setFbccldId(String fbccldId) {
        this.fbccldId = fbccldId;
    }

    /**
     * 获取授信变更主键
     *
     * @return fbcc_id - 授信变更主键
     */
    public String getFbccId() {
        return fbccId;
    }

    /**
     * 设置授信变更主键
     *
     * @param fbccId 授信变更主键
     */
    public void setFbccId(String fbccId) {
        this.fbccId = fbccId;
    }

    /**
     * 获取序号
     *
     * @return number - 序号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置序号
     *
     * @param number 序号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getHeadCode() {
        return headCode;
    }

    public void setHeadCode(String headCode) {
        this.headCode = headCode;
    }

    public String getHeadId() {
        return headId;
    }

    public void setHeadId(String headId) {
        this.headId = headId;
    }

    /**
     * 获取授信主体
     *
     * @return credit_ccupier - 授信主体
     */
    public String getCreditCcupier() {
        return creditCcupier;
    }

    /**
     * 设置授信主体
     *
     * @param creditCcupier 授信主体
     */
    public void setCreditCcupier(String creditCcupier) {
        this.creditCcupier = creditCcupier;
    }

    /**
     * 获取授信品种
     *
     * @return credit_varieties - 授信品种
     */
    public String getCreditVarieties() {
        return creditVarieties;
    }

    /**
     * 设置授信品种
     *
     * @param creditVarieties 授信品种
     */
    public void setCreditVarieties(String creditVarieties) {
        this.creditVarieties = creditVarieties;
    }

    /**
     * 获取授信品种id
     *
     * @return credit_varieties_id - 授信品种id
     */
    public String getCreditVarietiesId() {
        return creditVarietiesId;
    }

    /**
     * 设置授信品种id
     *
     * @param creditVarietiesId 授信品种id
     */
    public void setCreditVarietiesId(String creditVarietiesId) {
        this.creditVarietiesId = creditVarietiesId;
    }

    /**
     * 获取是否限额
     *
     * @return is_limit - 是否限额
     */
    public String getIsLimit() {
        return isLimit;
    }

    /**
     * 设置是否限额
     *
     * @param isLimit 是否限额
     */
    public void setIsLimit(String isLimit) {
        this.isLimit = isLimit;
    }

    /**
     * 获取币种
     *
     * @return currency_name - 币种
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * 设置币种
     *
     * @param currencyName 币种
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /**
     * 获取币种编码
     *
     * @return currency_code - 币种编码
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置币种编码
     *
     * @param currencyCode 币种编码
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * 获取币种id
     *
     * @return currency_id - 币种id
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * 设置币种id
     *
     * @param currencyId 币种id
     */
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * 获取总额度
     *
     * @return total_amount - 总额度
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置总额度
     *
     * @param totalAmount 总额度
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取总额度折合人民币金额
     *
     * @return amount_equivalent_currency - 总额度折合人民币金额
     */
    public BigDecimal getAmountEquivalentCurrency() {
        return amountEquivalentCurrency;
    }

    /**
     * 设置总额度折合人民币金额
     *
     * @param amountEquivalentCurrency 总额度折合人民币金额
     */
    public void setAmountEquivalentCurrency(BigDecimal amountEquivalentCurrency) {
        this.amountEquivalentCurrency = amountEquivalentCurrency;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人
     *
     * @return updator - 修改人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置修改人
     *
     * @param updator 修改人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否可用
     *
     * @return active - 是否可用
     */
    public String getActive() {
        return active;
    }

    /**
     * 设置是否可用
     *
     * @param active 是否可用
     */
    public void setActive(String active) {
        this.active = active;
    }

    public List<String> getListCreditVarieties() {
        return listCreditVarieties;
    }

    public void setListCreditVarieties(List<String> listCreditVarieties) {
        this.listCreditVarieties = listCreditVarieties;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public String getGdatu() {
        return gdatu;
    }

    public void setGdatu(String gdatu) {
        this.gdatu = gdatu;
    }

    public String getFcurr() {
        return fcurr;
    }

    public void setFcurr(String fcurr) {
        this.fcurr = fcurr;
    }

    public String getTcurr() {
        return tcurr;
    }

    public void setTcurr(String tcurr) {
        this.tcurr = tcurr;
    }
}