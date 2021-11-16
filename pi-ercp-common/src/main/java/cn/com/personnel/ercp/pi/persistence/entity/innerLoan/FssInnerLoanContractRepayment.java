package cn.com.personnel.ercp.pi.persistence.entity.innerLoan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_inner_loan_contract_repayment")
public class FssInnerLoanContractRepayment {
    /**
     * 还款主键id
     */
    @Id
    @Column(name = "repayment_id")
    @GeneratedValue(generator = "JDBC")
    private String repaymentId;

    /**
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 贷款机构
     */
    @Column(name = "loan_organization")
    private String loanOrganization;

    /**
     * 贷款机构
     */
    @Column(name = "loan_organization_id")
    private String loanOrganizationId;

    /**
     * 还款日期
     */
    @Column(name = "repayment_date")
    private Date repaymentDate;

    /**
     * 币种
     */
    @Column(name = "currency_type")
    private String currencyType;

    /**
     * 汇率
     */
    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * 还款金额
     */
    @Column(name = "repayment_amount")
    private BigDecimal repaymentAmount;

    /**
     * 折后金额（元）
     */
    @Column(name = "discount_amount")
    private BigDecimal discountAmount;

    /**
     * 入账日期
     */
    @Column(name = "credit_date")
    private Date creditDate;

    /**
     * 入账状态
     */
    @Column(name = "credit_status")
    private String creditStatus;

    /**
     * 计算状态
     */
    @Column(name = "calculation_status")
    private String calculationStatus;

    /**
     * 报错消息
     */
    @Column(name = "error_message")
    private String errorMessage;

    /**
     * SAP凭证编号
     */
    @Column(name = "sap_document_no")
    private String sapDocumentNo;

    /**
     * 冲销状态
     */
    @Column(name = "reversal_status")
    private String reversalStatus;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 还款类型
     */
    @Column(name = "repayment_type")
    private String repaymentType;

    /**
     * 利息结清方式
     */
    @Column(name = "interest_settle_way")
    private String interestSettleWay;

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
     * 合同id
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 业务日期
     */
    @Column(name = "business_date")
    private Date businessDate;

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
     * 还款计划id
     */
    @Column(name="plan_id")
    private String planId;

    /**
     * 合同文本编号
     */
    @Column(name = "contract_num")
    private String contractNum;

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


    @Column(name="sap_reversal_document_no")
    private String sapReversalDocumentNo;

    @Column(name="reversal_error_message")
    private String reversalErrorMessage;

    /**
     * 获取还款主键id
     *
     * @return repayment_id - 还款主键id
     */
    public String getRepaymentId() {
        return repaymentId;
    }

    /**
     * 设置还款主键id
     *
     * @param repaymentId 还款主键id
     */
    public void setRepaymentId(String repaymentId) {
        this.repaymentId = repaymentId;
    }

    /**
     * 获取公司名称
     *
     * @return company_name - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
     * 获取贷款机构
     *
     * @return loan_organization - 贷款机构
     */
    public String getLoanOrganization() {
        return loanOrganization;
    }

    /**
     * 设置贷款机构
     *
     * @param loanOrganization 贷款机构
     */
    public void setLoanOrganization(String loanOrganization) {
        this.loanOrganization = loanOrganization;
    }

    /**
     * 获取贷款机构
     *
     * @return loan_organization_id - 贷款机构
     */
    public String getLoanOrganizationId() {
        return loanOrganizationId;
    }

    /**
     * 设置贷款机构
     *
     * @param loanOrganizationId 贷款机构
     */
    public void setLoanOrganizationId(String loanOrganizationId) {
        this.loanOrganizationId = loanOrganizationId;
    }

    /**
     * 获取还款日期
     *
     * @return repayment_date - 还款日期
     */
    public Date getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * 设置还款日期
     *
     * @param repaymentDate 还款日期
     */
    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
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
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * 设置汇率
     *
     * @param exchangeRate 汇率
     */
    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * 获取还款金额
     *
     * @return repayment_amount - 还款金额
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * 设置还款金额
     *
     * @param repaymentAmount 还款金额
     */
    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    /**
     * 获取折后金额（元）
     *
     * @return discount_amount - 折后金额（元）
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 设置折后金额（元）
     *
     * @param discountAmount 折后金额（元）
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
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
     * 获取报错消息
     *
     * @return error_message - 报错消息
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 设置报错消息
     *
     * @param errorMessage 报错消息
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
     * 获取摘要
     *
     * @return summary - 摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置摘要
     *
     * @param summary 摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取还款类型
     *
     * @return repayment_type - 还款类型
     */
    public String getRepaymentType() {
        return repaymentType;
    }

    /**
     * 设置还款类型
     *
     * @param repaymentType 还款类型
     */
    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    /**
     * 获取利息结清方式
     *
     * @return interest_settle_way - 利息结清方式
     */
    public String getInterestSettleWay() {
        return interestSettleWay;
    }

    /**
     * 设置利息结清方式
     *
     * @param interestSettleWay 利息结清方式
     */
    public void setInterestSettleWay(String interestSettleWay) {
        this.interestSettleWay = interestSettleWay;
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

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
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