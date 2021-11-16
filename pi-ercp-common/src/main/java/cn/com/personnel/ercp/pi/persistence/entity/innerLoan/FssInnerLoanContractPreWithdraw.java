package cn.com.personnel.ercp.pi.persistence.entity.innerLoan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_inner_loan_contract_pre_withdraw")
public class FssInnerLoanContractPreWithdraw {
    /**
     * 主键id
     */
    @Id
    @Column(name = "pre_withdraw_id")
    @GeneratedValue(generator = "JDBC")
    private String preWithdrawId;

    /**
     * 币种
     */
    @Column(name = "currency_type")
    private String currencyType;

    /**
     * 汇率
     */
    @Column(name = "exchange_rate")
    private String exchangeRate;

    /**
     * 预提金额(元)
     */
    @Column(name = "pre_with_draw_amount")
    private BigDecimal preWithDrawAmount;

    /**
     * 折后金额(元)
     */
    @Column(name = "after_discount_amount")
    private BigDecimal afterDiscountAmount;

    /**
     * 来源
     */
    private String source;

    /**
     * 入账状态
     */
    @Column(name = "credit_status")
    private String creditStatus;

    /**
     * 入账日期
     */
    @Column(name = "credit_date")
    private Date creditDate;

    /**
     * 计算状态
     */
    @Column(name = "calculation_status")
    private String calculationStatus;

    /**
     * SAP凭证编号
     */
    @Column(name = "sap_document_no")
    private String sapDocumentNo;

    /**
     * 报错消息
     */
    @Column(name = "error_message")
    private String errorMessage;

    /**
     * 冲销状态
     */
    @Column(name = "reversal_status")
    private String reversalStatus;

    /**
     * 乐观锁
     */
    private Integer revision;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 业务日期
     */
    @Column(name = "business_date")
    private Date businessDate;

    /**
     * 合同id
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 借款方,公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 借款方ID,公司id
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 贷款方,公司名称
     */
    @Column(name = "lender_company_name")
    private String lenderCompanyName;

    /**
     * 贷款方ID,公司id
     */
    @Column(name = "lender_company_id")
    private String lenderCompanyId;

    /**
     * 开始日期
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 结束日期
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * 生成分录分录编号
     */
    @Column(name = "entry_number")
    private String entryNumber;

    /**
     * 生成分录组编号
     */
    @Column(name = "group_no")
    private String groupNo;

    private String summary;


    @Column(name="sap_reversal_document_no")
    private String sapReversalDocumentNo;

    @Column(name="reversal_error_message")
    private String reversalErrorMessage;

    /**
     * 获取主键id
     *
     * @return pre_withdraw_id - 主键id
     */
    public String getPreWithdrawId() {
        return preWithdrawId;
    }

    /**
     * 设置主键id
     *
     * @param preWithdrawId 主键id
     */
    public void setPreWithdrawId(String preWithdrawId) {
        this.preWithdrawId = preWithdrawId;
    }

    /**
     * 获取币种
     *
     * @return currency_type - 币种
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * 设置币种
     *
     * @param currencyType 币种
     */
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    /**
     * 获取汇率
     *
     * @return exchange_rate - 汇率
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * 设置汇率
     *
     * @param exchangeRate 汇率
     */
    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * 获取预提金额(元)
     *
     * @return pre_with_draw_amount - 预提金额(元)
     */
    public BigDecimal getPreWithDrawAmount() {
        return preWithDrawAmount;
    }

    /**
     * 设置预提金额(元)
     *
     * @param preWithDrawAmount 预提金额(元)
     */
    public void setPreWithDrawAmount(BigDecimal preWithDrawAmount) {
        this.preWithDrawAmount = preWithDrawAmount;
    }

    /**
     * 获取折后金额(元)
     *
     * @return after_discount_amount - 折后金额(元)
     */
    public BigDecimal getAfterDiscountAmount() {
        return afterDiscountAmount;
    }

    /**
     * 设置折后金额(元)
     *
     * @param afterDiscountAmount 折后金额(元)
     */
    public void setAfterDiscountAmount(BigDecimal afterDiscountAmount) {
        this.afterDiscountAmount = afterDiscountAmount;
    }

    /**
     * 获取来源
     *
     * @return source - 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源
     *
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取入账状态
     *
     * @return credit_status - 入账状态
     */
    public String getCreditStatus() {
        return creditStatus;
    }

    /**
     * 设置入账状态
     *
     * @param creditStatus 入账状态
     */
    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    /**
     * 获取入账日期
     *
     * @return credit_date - 入账日期
     */
    public Date getCreditDate() {
        return creditDate;
    }

    /**
     * 设置入账日期
     *
     * @param creditDate 入账日期
     */
    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }

    /**
     * 获取计算状态
     *
     * @return calculation_status - 计算状态
     */
    public String getCalculationStatus() {
        return calculationStatus;
    }

    /**
     * 设置计算状态
     *
     * @param calculationStatus 计算状态
     */
    public void setCalculationStatus(String calculationStatus) {
        this.calculationStatus = calculationStatus;
    }

    /**
     * 获取SAP凭证编号
     *
     * @return sap_document_no - SAP凭证编号
     */
    public String getSapDocumentNo() {
        return sapDocumentNo;
    }

    /**
     * 设置SAP凭证编号
     *
     * @param sapDocumentNo SAP凭证编号
     */
    public void setSapDocumentNo(String sapDocumentNo) {
        this.sapDocumentNo = sapDocumentNo;
    }

    /**
     * 获取冲销状态
     *
     * @return reversal_status - 冲销状态
     */
    public String getReversalStatus() {
        return reversalStatus;
    }

    /**
     * 设置冲销状态
     *
     * @param reversalStatus 冲销状态
     */
    public void setReversalStatus(String reversalStatus) {
        this.reversalStatus = reversalStatus;
    }

    /**
     * 获取乐观锁
     *
     * @return revision - 乐观锁
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * 设置乐观锁
     *
     * @param revision 乐观锁
     */
    public void setRevision(Integer revision) {
        this.revision = revision;
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
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 获取业务日期
     *
     * @return business_date - 业务日期
     */
    public Date getBusinessDate() {
        return businessDate;
    }

    /**
     * 设置业务日期
     *
     * @param businessDate 业务日期
     */
    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    /**
     * 获取合同id
     *
     * @return manage_id - 合同id
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置合同id
     *
     * @param manageId 合同id
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    /**
     * 获取借款方,公司名称
     *
     * @return company_name - 借款方,公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置借款方,公司名称
     *
     * @param companyName 借款方,公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取借款方ID,公司id
     *
     * @return company_id - 借款方ID,公司id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置借款方ID,公司id
     *
     * @param companyId 借款方ID,公司id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取贷款方,公司名称
     *
     * @return lender_company_name - 贷款方,公司名称
     */
    public String getLenderCompanyName() {
        return lenderCompanyName;
    }

    /**
     * 设置贷款方,公司名称
     *
     * @param lenderCompanyName 贷款方,公司名称
     */
    public void setLenderCompanyName(String lenderCompanyName) {
        this.lenderCompanyName = lenderCompanyName;
    }

    /**
     * 获取贷款方ID,公司id
     *
     * @return lender_company_id - 贷款方ID,公司id
     */
    public String getLenderCompanyId() {
        return lenderCompanyId;
    }

    /**
     * 设置贷款方ID,公司id
     *
     * @param lenderCompanyId 贷款方ID,公司id
     */
    public void setLenderCompanyId(String lenderCompanyId) {
        this.lenderCompanyId = lenderCompanyId;
    }
    /**
     * 获取开始日期
     *
     * @return start_date - 开始日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始日期
     *
     * @param startDate 开始日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束日期
     *
     * @return end_date - 结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结束日期
     *
     * @param endDate 结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSapReversalDocumentNo() {
        return sapReversalDocumentNo;
    }

    public void setSapReversalDocumentNo(String sapReversalDocumentNo) {
        this.sapReversalDocumentNo = sapReversalDocumentNo;
    }

    public String getReversalErrorMessage() {
        return reversalErrorMessage;
    }

    public void setReversalErrorMessage(String reversalErrorMessage) {
        this.reversalErrorMessage = reversalErrorMessage;
    }
}