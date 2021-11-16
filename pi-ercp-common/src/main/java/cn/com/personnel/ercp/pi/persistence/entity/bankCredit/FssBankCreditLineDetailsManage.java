package cn.com.personnel.ercp.pi.persistence.entity.bankCredit;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Table(name = "fss_bank_credit_line_details_manage")
public class FssBankCreditLineDetailsManage {
    /**
     * 主键
     */
    @Id
    @Column(name = "fbcldm_id")
    @GeneratedValue(generator = "JDBC")
    private String fbcldmId;

    /**
     * 银行授信管理主键
     */
    @Column(name = "fbcm_id")
    private String fbcmId;

    /**
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 合同文本编号
     */
    @Column(name = "contract_code")
    private String contractCode;

    /**
     * 开立银行总行名称
     */
    @Column(name = "head_name")
    private String headName;

    /**
     * 开立银行总行编码
     */
    @Column(name = "head_code")
    private String headCode;

    /**
     * 开立银行总行ID
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
     * 授信品种字典项ID
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
    private String totalAmount;

    /**
     * 总额度折合人命币金额
     */
    @Column(name = "amount_equivalent_currency")
    private BigDecimal amountEquivalentCurrency;

    /**
     * 占用额度
     */
    @Column(name = "occupy_quota")
    private BigDecimal occupyQuota;

    /**
     * 折合人命币金额-占用额度
     */
    @Column(name = "convert_occupy_quota")
    private BigDecimal convertOccupyQuota;

    /**
     * 使用额度
     */
    @Column(name = "use_quota")
    private BigDecimal useQuota;

    /**
     * 折合人民币金额-使用额度
     */
    @Column(name = "convert_use_quota")
    private BigDecimal convertUseQuota;

    /**
     * 剩余额度
     */
    @Column(name = "remaining_amount")
    private BigDecimal remainingAmount;

    /**
     * 折合人命币额度-剩余额度
     */
    @Column(name = "convert_remaining_amount")
    private BigDecimal convertRemainingAmount;

    /**
     * 并表占用额度
     */
    @Column(name = "consolidated_occupancy_quota")
    private BigDecimal consolidatedOccupancyQuota;

    /**
     * 折合人民币金额-并表占用额度
     */
    @Column(name = "convert_consolidated_occupancy_quota")
    private BigDecimal convertConsolidatedOccupancyQuota;

    /**
     * 非并表占用额度
     */
    @Column(name = "no_consolidated_occupancy_quota")
    private BigDecimal noConsolidatedOccupancyQuota;

    /**
     * 折合人民币金额-非并表占用额度
     */
    @Column(name = "no_convert_consolidated_occupancy_quota")
    private BigDecimal noConvertConsolidatedOccupancyQuota;

    /**
     * 并表使用额度
     */
    @Column(name = "consolidated_use_quota")
    private BigDecimal consolidatedUseQuota;

    /**
     * 折合人民币金额-并表使用额度
     */
    @Column(name = "convert_consolidated_use_quota")
    private BigDecimal convertConsolidatedUseQuota;

    /**
     * 非并表使用额度
     */
    @Column(name = "no_consolidated_use_quota")
    private BigDecimal noConsolidatedUseQuota;

    /**
     * 折合人民币金额-非并表使用额度
     */
    @Column(name = "no_convert_consolidated_use_quota")
    private BigDecimal noConvertConsolidatedUseQuota;

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
     * 获取主键
     *
     * @return fbcldm_id - 主键
     */
    public String getFbcldmId() {
        return fbcldmId;
    }

    /**
     * 设置主键
     *
     * @param fbcldmId 主键
     */
    public void setFbcldmId(String fbcldmId) {
        this.fbcldmId = fbcldmId;
    }

    /**
     * 获取银行授信管理主键
     *
     * @return fbcm_id - 银行授信管理主键
     */
    public String getFbcmId() {
        return fbcmId;
    }

    /**
     * 设置银行授信管理主键
     *
     * @param fbcmId 银行授信管理主键
     */
    public void setFbcmId(String fbcmId) {
        this.fbcmId = fbcmId;
    }

    /**
     * 获取合同名称
     *
     * @return contract_name - 合同名称
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * 设置合同名称
     *
     * @param contractName 合同名称
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * 获取合同文本编号
     *
     * @return contract_code - 合同文本编号
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置合同文本编号
     *
     * @param contractCode 合同文本编号
     */
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
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
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置总额度
     *
     * @param totalAmount 总额度
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取总额度折合人命币金额
     *
     * @return amount_equivalent_currency - 总额度折合人命币金额
     */
    public BigDecimal getAmountEquivalentCurrency() {
        return amountEquivalentCurrency;
    }

    /**
     * 设置总额度折合人命币金额
     *
     * @param amountEquivalentCurrency 总额度折合人命币金额
     */
    public void setAmountEquivalentCurrency(BigDecimal amountEquivalentCurrency) {
        this.amountEquivalentCurrency = amountEquivalentCurrency;
    }

    /**
     * 获取占用额度
     *
     * @return occupy_quota - 占用额度
     */
    public BigDecimal getOccupyQuota() {
        return occupyQuota;
    }

    /**
     * 设置占用额度
     *
     * @param occupyQuota 占用额度
     */
    public void setOccupyQuota(BigDecimal occupyQuota) {
        this.occupyQuota = occupyQuota;
    }

    /**
     * 获取折合人命币金额-占用额度
     *
     * @return convert_occupy_quota - 折合人命币金额-占用额度
     */
    public BigDecimal getConvertOccupyQuota() {
        return convertOccupyQuota;
    }

    /**
     * 设置折合人命币金额-占用额度
     *
     * @param convertOccupyQuota 折合人命币金额-占用额度
     */
    public void setConvertOccupyQuota(BigDecimal convertOccupyQuota) {
        this.convertOccupyQuota = convertOccupyQuota;
    }

    /**
     * 获取使用额度
     *
     * @return use_quota - 使用额度
     */
    public BigDecimal getUseQuota() {
        return useQuota;
    }

    /**
     * 设置使用额度
     *
     * @param useQuota 使用额度
     */
    public void setUseQuota(BigDecimal useQuota) {
        this.useQuota = useQuota;
    }

    /**
     * 获取折合人民币金额-使用额度
     *
     * @return convert_use_quota - 折合人民币金额-使用额度
     */
    public BigDecimal getConvertUseQuota() {
        return convertUseQuota;
    }

    /**
     * 设置折合人民币金额-使用额度
     *
     * @param convertUseQuota 折合人民币金额-使用额度
     */
    public void setConvertUseQuota(BigDecimal convertUseQuota) {
        this.convertUseQuota = convertUseQuota;
    }

    /**
     * 获取剩余额度
     *
     * @return remaining_amount - 剩余额度
     */
    public BigDecimal getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * 设置剩余额度
     *
     * @param remainingAmount 剩余额度
     */
    public void setRemainingAmount(BigDecimal remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    /**
     * 获取折合人命币额度-剩余额度
     *
     * @return convert_remaining_amount - 折合人命币额度-剩余额度
     */
    public BigDecimal getConvertRemainingAmount() {
        return convertRemainingAmount;
    }

    /**
     * 设置折合人命币额度-剩余额度
     *
     * @param convertRemainingAmount 折合人命币额度-剩余额度
     */
    public void setConvertRemainingAmount(BigDecimal convertRemainingAmount) {
        this.convertRemainingAmount = convertRemainingAmount;
    }

    /**
     * 获取并表占用额度
     *
     * @return consolidated_occupancy_quota - 并表占用额度
     */
    public BigDecimal getConsolidatedOccupancyQuota() {
        return consolidatedOccupancyQuota;
    }

    /**
     * 设置并表占用额度
     *
     * @param consolidatedOccupancyQuota 并表占用额度
     */
    public void setConsolidatedOccupancyQuota(BigDecimal consolidatedOccupancyQuota) {
        this.consolidatedOccupancyQuota = consolidatedOccupancyQuota;
    }

    /**
     * 获取折合人民币金额-并表占用额度
     *
     * @return convert_consolidated_occupancy_quota - 折合人民币金额-并表占用额度
     */
    public BigDecimal getConvertConsolidatedOccupancyQuota() {
        return convertConsolidatedOccupancyQuota;
    }

    /**
     * 设置折合人民币金额-并表占用额度
     *
     * @param convertConsolidatedOccupancyQuota 折合人民币金额-并表占用额度
     */
    public void setConvertConsolidatedOccupancyQuota(BigDecimal convertConsolidatedOccupancyQuota) {
        this.convertConsolidatedOccupancyQuota = convertConsolidatedOccupancyQuota;
    }

    /**
     * 获取非并表占用额度
     *
     * @return no_consolidated_occupancy_quota - 非并表占用额度
     */
    public BigDecimal getNoConsolidatedOccupancyQuota() {
        return noConsolidatedOccupancyQuota;
    }

    /**
     * 设置非并表占用额度
     *
     * @param noConsolidatedOccupancyQuota 非并表占用额度
     */
    public void setNoConsolidatedOccupancyQuota(BigDecimal noConsolidatedOccupancyQuota) {
        this.noConsolidatedOccupancyQuota = noConsolidatedOccupancyQuota;
    }

    /**
     * 获取折合人民币金额-非并表占用额度
     *
     * @return no_convert_consolidated_occupancy_quota - 折合人民币金额-非并表占用额度
     */
    public BigDecimal getNoConvertConsolidatedOccupancyQuota() {
        return noConvertConsolidatedOccupancyQuota;
    }

    /**
     * 设置折合人民币金额-非并表占用额度
     *
     * @param noConvertConsolidatedOccupancyQuota 折合人民币金额-非并表占用额度
     */
    public void setNoConvertConsolidatedOccupancyQuota(BigDecimal noConvertConsolidatedOccupancyQuota) {
        this.noConvertConsolidatedOccupancyQuota = noConvertConsolidatedOccupancyQuota;
    }

    /**
     * 获取并表使用额度
     *
     * @return consolidated_use_quota - 并表使用额度
     */
    public BigDecimal getConsolidatedUseQuota() {
        return consolidatedUseQuota;
    }

    /**
     * 设置并表使用额度
     *
     * @param consolidatedUseQuota 并表使用额度
     */
    public void setConsolidatedUseQuota(BigDecimal consolidatedUseQuota) {
        this.consolidatedUseQuota = consolidatedUseQuota;
    }

    /**
     * 获取折合人民币金额-并表使用额度
     *
     * @return convert_consolidated_use_quota - 折合人民币金额-并表使用额度
     */
    public BigDecimal getConvertConsolidatedUseQuota() {
        return convertConsolidatedUseQuota;
    }

    /**
     * 设置折合人民币金额-并表使用额度
     *
     * @param convertConsolidatedUseQuota 折合人民币金额-并表使用额度
     */
    public void setConvertConsolidatedUseQuota(BigDecimal convertConsolidatedUseQuota) {
        this.convertConsolidatedUseQuota = convertConsolidatedUseQuota;
    }

    /**
     * 获取非并表使用额度
     *
     * @return no_consolidated_use_quota - 非并表使用额度
     */
    public BigDecimal getNoConsolidatedUseQuota() {
        return noConsolidatedUseQuota;
    }

    /**
     * 设置非并表使用额度
     *
     * @param noConsolidatedUseQuota 非并表使用额度
     */
    public void setNoConsolidatedUseQuota(BigDecimal noConsolidatedUseQuota) {
        this.noConsolidatedUseQuota = noConsolidatedUseQuota;
    }

    /**
     * 获取折合人民币金额-非并表使用额度
     *
     * @return no_convert_consolidated_use_quota - 折合人民币金额-非并表使用额度
     */
    public BigDecimal getNoConvertConsolidatedUseQuota() {
        return noConvertConsolidatedUseQuota;
    }

    /**
     * 设置折合人民币金额-非并表使用额度
     *
     * @param noConvertConsolidatedUseQuota 折合人民币金额-非并表使用额度
     */
    public void setNoConvertConsolidatedUseQuota(BigDecimal noConvertConsolidatedUseQuota) {
        this.noConvertConsolidatedUseQuota = noConvertConsolidatedUseQuota;
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
}