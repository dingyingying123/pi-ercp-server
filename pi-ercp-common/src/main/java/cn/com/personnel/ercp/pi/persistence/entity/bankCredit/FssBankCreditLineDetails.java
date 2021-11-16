package cn.com.personnel.ercp.pi.persistence.entity.bankCredit;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Table(name = "fss_bank_credit_line_details")
public class FssBankCreditLineDetails {
    /**
     * 授信品种明细ID
     */
    @Id
    @Column(name = "details_id")
    @GeneratedValue(generator = "JDBC")
    private String detailsId;

    /**
     * 银行授信ID
     */
    @Column(name = "bc_id")
    private String bcId;

    /**
     * 开立银行总行ID
     */
    @Column(name = "head_id")
    private String headId;

    /**
     * 开立银行总行编码
     */
    @Column(name = "head_code")
    private String headCode;

    /**
     * 开立银行总行名称
     */
    @Column(name = "head_name")
    private String headName;

    /**
     * 授信占用主体
     */
    @Column(name = "credit_ccupier")
    private String creditCcupier;

    /**
     * 授信品种字典项ID
     */
    @Column(name = "credit_varieties_id")
    private String creditVarietiesId;

    /**
     * 授信品种
     */
    @Column(name = "credit_varieties")
    private String creditVarieties;

    @Transient
    private List<String> listCreditVarieties;

    /**
     * 是否限额
     */
    @Column(name = "is_limit")
    private String isLimit;

    /**
     * 币种id
     */
    @Column(name = "currency_id")
    private String currencyId;

    /**
     * 币种编码
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 币种
     */
    @Column(name = "currency_name")
    private String currencyName;

    /**
     * 总额度
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 预留
     */
    private String reserve;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 是否可用
     */
    private String active;

    /**
     * 总额度折合人民币金额
     */
    @Column(name = "amount_equivalent_currency")
    private BigDecimal amountEquivalentCurrency;

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
     * 获取授信品种明细ID
     *
     * @return details_id - 授信品种明细ID
     */
    public String getDetailsId() {
        return detailsId;
    }

    /**
     * 设置授信品种明细ID
     *
     * @param detailsId 授信品种明细ID
     */
    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId;
    }

    /**
     * 获取银行授信ID
     *
     * @return bc_id - 银行授信ID
     */
    public String getBcId() {
        return bcId;
    }

    /**
     * 设置银行授信ID
     *
     * @param bcId 银行授信ID
     */
    public void setBcId(String bcId) {
        this.bcId = bcId;
    }

    /**
     * 获取开立银行总行ID
     *
     * @return head_id - 开立银行总行ID
     */
    public String getHeadId() {
        return headId;
    }

    /**
     * 设置开立银行总行ID
     *
     * @param headId 开立银行总行ID
     */
    public void setHeadId(String headId) {
        this.headId = headId;
    }

    /**
     * 获取开立银行总行编码
     *
     * @return head_code - 开立银行总行编码
     */
    public String getHeadCode() {
        return headCode;
    }

    /**
     * 设置开立银行总行编码
     *
     * @param headCode 开立银行总行编码
     */
    public void setHeadCode(String headCode) {
        this.headCode = headCode;
    }

    /**
     * 获取开立银行总行名称
     *
     * @return head_name - 开立银行总行名称
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * 设置开立银行总行名称
     *
     * @param headName 开立银行总行名称
     */
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    /**
     * 获取授信占用主体
     *
     * @return credit_ccupier - 授信占用主体
     */
    public String getCreditCcupier() {
        return creditCcupier;
    }

    /**
     * 设置授信占用主体
     *
     * @param creditCcupier 授信占用主体
     */
    public void setCreditCcupier(String creditCcupier) {
        this.creditCcupier = creditCcupier;
    }

    /**
     * 获取授信品种字典项ID
     *
     * @return credit_varieties_id - 授信品种字典项ID
     */
    public String getCreditVarietiesId() {
        return creditVarietiesId;
    }

    /**
     * 设置授信品种字典项ID
     *
     * @param creditVarietiesId 授信品种字典项ID
     */
    public void setCreditVarietiesId(String creditVarietiesId) {
        this.creditVarietiesId = creditVarietiesId;
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
     * 获取预留
     *
     * @return reserve - 预留
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * 设置预留
     *
     * @param reserve 预留
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
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
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新人
     *
     * @return updater - 更新人
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设置更新人
     *
     * @param updater 更新人
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public BigDecimal getAmountEquivalentCurrency() {
        return amountEquivalentCurrency;
    }

    public void setAmountEquivalentCurrency(BigDecimal amountEquivalentCurrency) {
        this.amountEquivalentCurrency = amountEquivalentCurrency;
    }

    public List<String> getListCreditVarieties() {
        return listCreditVarieties;
    }

    public void setListCreditVarieties(List<String> listCreditVarieties) {
        this.listCreditVarieties = listCreditVarieties;
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