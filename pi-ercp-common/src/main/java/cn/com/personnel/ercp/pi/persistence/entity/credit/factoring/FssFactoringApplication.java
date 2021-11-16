package cn.com.personnel.ercp.pi.persistence.entity.credit.factoring;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_factoring_application")
public class FssFactoringApplication {
    /**
     * 主键Id
     */
    @Id
    @Column(name = "fa_id")
    @GeneratedValue(generator = "JDBC")
    private String faId;

    /**
     * 申请单号
     */
    @Column(name = "letter_number")
    private String letterNumber;

    /**
     * 申请人编号
     */
    @Column(name = "applicant_id")
    private String applicantId;

    /**
     * 申请人
     */
    @Column(name = "applicant_name")
    private String applicantName;

    /**
     * 申请部门编号
     */
    @Column(name = "applicant_dept_id")
    private String applicantDeptId;

    /**
     * 申请部门
     */
    @Column(name = "applicant_dept")
    private String applicantDept;

    /**
     * 申请日期
     */
    @Column(name = "applicant_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private java.sql.Date applicantDate;

    /**
     * 公司名称
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 公司编号
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 项目编号
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 保理种类
     */
    @Column(name = "factoring_type")
    private String factoringType;

    /**
     * 融资金额(元)
     */
    @Column(name = "financing_amount")
    private BigDecimal financingAmount;

    /**
     * 质押发票金额(元)
     */
    @Column(name = "pledged_invoice_amount")
    private BigDecimal pledgedInvoiceAmount;

    /**
     * 保理期限(天)
     */
    @Column(name = "factoring_period")
    private Integer factoringPeriod;

    /**
     * 保理银行
     */
    @Column(name = "factoring_bank")
    private String factoringBank;

    /**
     * 保理银行编号
     */
    @Column(name = "factoring_bank_id")
    private String factoringBankId;

    /**
     * 计划签订日期
     */
    @Column(name = "plan_signing_date")
    private Date planSigningDate;

    /**
     * 提款账号
     */
    @Column(name = "withdrawal_account")
    private String withdrawalAccount;

    /**
     * 提款账号编号
     */
    @Column(name = "withdrawal_account_id")
    private String withdrawalAccountId;

    /**
     * 还款账号
     */
    @Column(name = "repayment_account")
    private String repaymentAccount;

    /**
     * 还款账号编号
     */
    @Column(name = "repayment_account_id")
    private String repaymentAccountId;

    /**
     * 币种
     */
    @Column(name = "currency_name")
    private String currencyName;

    /**
     * 计息天数
     */
    @Column(name = "interest_bearing_days")
    private Integer interestBearingDays;

    /**
     * 利率类型
     */
    @Column(name = "interest_rate_type")
    private String interestRateType;

    /**
     * 利率类型id
     */
    @Column(name = "interest_rate_type_id")
    private String interestRateTypeId;

    /**
     * 利率浮动方式
     */
    @Column(name = "interest_rate_floating")
    private String interestRateFloating;

    /**
     * 浮动比例
     */
    @Column(name = "floating_ratio")
    private BigDecimal floatingRatio;

    /**
     * 备注
     */
    private String remark;

    /**
     * 利息承担方
     */
    @Column(name = "interest_bearer")
    private String interestBearer;

    /**
     * 利息承担人
     */
    @Column(name = "interest_bearer_people")
    private String interestBearerPeople;

    /**
     * 利息承担人编号
     */
    @Column(name = "interest_bearer_people_id")
    private String interestBearerPeopleId;

    /**
     * 付息方式
     */
    @Column(name = "payment_method")
    private String paymentMethod;

    /**
     * 付息方式
     */
    @Column(name = "payment_method_id")
    private String paymentMethodId;

    /**
     * 合同利率(%)
     */
    @Column(name = "contract_interest_rate")
    private BigDecimal contractInterestRate;

    /**
     * 业主利息比例(%)
     */
    @Column(name = "owner_interest_ratio")
    private BigDecimal ownerInterestRatio;

    /**
     * 手续费承担方
     */
    @Column(name = "handling_party")
    private String handlingParty;

    /**
     * 手续费承担人
     */
    @Column(name = "handling_party_people")
    private String handlingPartyPeople;

    /**
     * 手续费承担人编号
     */
    @Column(name = "handling_party_people_id")
    private String handlingPartyPeopleId;

    /**
     * 付手续费方式
     */
    @Column(name = "handling_method")
    private String handlingMethod;

    /**
     * 费率(%)
     */
    private BigDecimal rate;

    /**
     * 手续费总金额(元)
     */
    @Column(name = "total_handling_fee")
    private BigDecimal totalHandlingFee;

    /**
     * 业主手续费比例(%)
     */
    @Column(name = "owner_handling_fee_ratio")
    private BigDecimal ownerHandlingFeeRatio;

    /**
     * 业主承担手续费
     */
    @Column(name = "owner_bears_handling_fee")
    private BigDecimal ownerBearsHandlingFee;

    /**
     * 业务日期
     */
    @Column(name = "business_date")
    private Date businessDate;

    /**
     * 销售合同
     */
    @Column(name = "sales_contract")
    private String salesContract;

    /**
     * 客户公司名称
     */
    @Column(name = "customer_company_name")
    private String customerCompanyName;

    /**
     * 客户公司名称编号
     */
    @Column(name = "customer_company_id")
    private String customerCompanyId;

    /**
     * 合同签订方
     */
    @Column(name = "contract_signer")
    private String contractSigner;

    /**
     * 合同签订方编号
     */
    @Column(name = "contract_signer_id")
    private String contractSignerId;

    /**
     * 合同签订日期
     */
    @Column(name = "contract_signing_date")
    private Date contractSigningDate;

    /**
     * 合同总价(元)
     */
    @Column(name = "total_contract_price")
    private BigDecimal totalContractPrice;

    /**
     * 已回款金额
     */
    @Column(name = "refunded_amount")
    private BigDecimal refundedAmount;

    /**
     * 开出发票情况
     */
    @Column(name = "invoicing_situation")
    private String invoicingSituation;

    /**
     * 货物交付清单
     */
    @Column(name = "cargo_delivery_list")
    private String cargoDeliveryList;

    /**
     * 备注1
     */
    private String remarks;

    /**
     * 审批状态
     */
    @Column(name = "approval_status")
    private String approvalStatus;

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
     * 付息日
     */
    @Column(name = "interest_payment_date")
    private Date interestPaymentDate;

    /**
     * 币种编号
     */
    @Column(name = "currency_code")
    private String currencyCode;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * 币种编号
     */
    @Column(name = "currency_id")
    private String currencyId;

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * 获取主键Id
     *
     * @return fa_id - 主键Id
     */
    public String getFaId() {
        return faId;
    }

    /**
     * 设置主键Id
     *
     * @param faId 主键Id
     */
    public void setFaId(String faId) {
        this.faId = faId;
    }

    /**
     * 获取申请单号
     *
     * @return letter_number - 申请单号
     */
    public String getLetterNumber() {
        return letterNumber;
    }

    /**
     * 设置申请单号
     *
     * @param letterNumber 申请单号
     */
    public void setLetterNumber(String letterNumber) {
        this.letterNumber = letterNumber;
    }

    /**
     * 获取申请人编号
     *
     * @return applicant_id - 申请人编号
     */
    public String getApplicantId() {
        return applicantId;
    }

    /**
     * 设置申请人编号
     *
     * @param applicantId 申请人编号
     */
    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * 获取申请人
     *
     * @return applicant_name - 申请人
     */
    public String getApplicantName() {
        return applicantName;
    }

    /**
     * 设置申请人
     *
     * @param applicantName 申请人
     */
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    /**
     * 获取申请部门编号
     *
     * @return applicant_dept_id - 申请部门编号
     */
    public String getApplicantDeptId() {
        return applicantDeptId;
    }

    /**
     * 设置申请部门编号
     *
     * @param applicantDeptId 申请部门编号
     */
    public void setApplicantDeptId(String applicantDeptId) {
        this.applicantDeptId = applicantDeptId;
    }

    /**
     * 获取申请部门
     *
     * @return applicant_dept - 申请部门
     */
    public String getApplicantDept() {
        return applicantDept;
    }

    /**
     * 设置申请部门
     *
     * @param applicantDept 申请部门
     */
    public void setApplicantDept(String applicantDept) {
        this.applicantDept = applicantDept;
    }

    /**
     * 获取申请日期
     *
     * @return applicant_date - 申请日期
     */
    public java.sql.Date getApplicantDate() {
        return applicantDate;
    }

    /**
     * 设置申请日期
     *
     * @param applicantDate 申请日期
     */
    public void setApplicantDate(java.sql.Date applicantDate) {
        this.applicantDate = applicantDate;
    }

    /**
     * 获取公司名称
     *
     * @return organ_name - 公司名称
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * 设置公司名称
     *
     * @param organName 公司名称
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * 获取公司编号
     *
     * @return organ_id - 公司编号
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置公司编号
     *
     * @param organId 公司编号
     */
    public void setOrganId(String organId) {
        this.organId = organId;
    }

    /**
     * 获取项目名称
     *
     * @return project_name - 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目名称
     *
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取项目编号
     *
     * @return project_id - 项目编号
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目编号
     *
     * @param projectId 项目编号
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取保理种类
     *
     * @return factoring_type - 保理种类
     */
    public String getFactoringType() {
        return factoringType;
    }

    /**
     * 设置保理种类
     *
     * @param factoringType 保理种类
     */
    public void setFactoringType(String factoringType) {
        this.factoringType = factoringType;
    }

    /**
     * 获取融资金额(元)
     *
     * @return financing_amount - 融资金额(元)
     */
    public BigDecimal getFinancingAmount() {
        return financingAmount;
    }

    /**
     * 设置融资金额(元)
     *
     * @param financingAmount 融资金额(元)
     */
    public void setFinancingAmount(BigDecimal financingAmount) {
        this.financingAmount = financingAmount;
    }

    /**
     * 获取质押发票金额(元)
     *
     * @return pledged_invoice_amount - 质押发票金额(元)
     */
    public BigDecimal getPledgedInvoiceAmount() {
        return pledgedInvoiceAmount;
    }

    /**
     * 设置质押发票金额(元)
     *
     * @param pledgedInvoiceAmount 质押发票金额(元)
     */
    public void setPledgedInvoiceAmount(BigDecimal pledgedInvoiceAmount) {
        this.pledgedInvoiceAmount = pledgedInvoiceAmount;
    }

    /**
     * 获取保理期限(天)
     *
     * @return factoring_period - 保理期限(天)
     */
    public Integer getFactoringPeriod() {
        return factoringPeriod;
    }

    /**
     * 设置保理期限(天)
     *
     * @param factoringPeriod 保理期限(天)
     */
    public void setFactoringPeriod(Integer factoringPeriod) {
        this.factoringPeriod = factoringPeriod;
    }

    /**
     * 获取保理银行
     *
     * @return factoring_bank - 保理银行
     */
    public String getFactoringBank() {
        return factoringBank;
    }

    /**
     * 设置保理银行
     *
     * @param factoringBank 保理银行
     */
    public void setFactoringBank(String factoringBank) {
        this.factoringBank = factoringBank;
    }

    /**
     * 获取保理银行编号
     *
     * @return factoring_bank_id - 保理银行编号
     */
    public String getFactoringBankId() {
        return factoringBankId;
    }

    /**
     * 设置保理银行编号
     *
     * @param factoringBankId 保理银行编号
     */
    public void setFactoringBankId(String factoringBankId) {
        this.factoringBankId = factoringBankId;
    }

    /**
     * 获取计划签订日期
     *
     * @return plan_signing_date - 计划签订日期
     */
    public Date getPlanSigningDate() {
        return planSigningDate;
    }

    /**
     * 设置计划签订日期
     *
     * @param planSigningDate 计划签订日期
     */
    public void setPlanSigningDate(Date planSigningDate) {
        this.planSigningDate = planSigningDate;
    }

    /**
     * 获取提款账号
     *
     * @return withdrawal_account - 提款账号
     */
    public String getWithdrawalAccount() {
        return withdrawalAccount;
    }

    /**
     * 设置提款账号
     *
     * @param withdrawalAccount 提款账号
     */
    public void setWithdrawalAccount(String withdrawalAccount) {
        this.withdrawalAccount = withdrawalAccount;
    }

    /**
     * 获取提款账号编号
     *
     * @return withdrawal_account_id - 提款账号编号
     */
    public String getWithdrawalAccountId() {
        return withdrawalAccountId;
    }

    /**
     * 设置提款账号编号
     *
     * @param withdrawalAccountId 提款账号编号
     */
    public void setWithdrawalAccountId(String withdrawalAccountId) {
        this.withdrawalAccountId = withdrawalAccountId;
    }

    /**
     * 获取还款账号
     *
     * @return repayment_account - 还款账号
     */
    public String getRepaymentAccount() {
        return repaymentAccount;
    }

    /**
     * 设置还款账号
     *
     * @param repaymentAccount 还款账号
     */
    public void setRepaymentAccount(String repaymentAccount) {
        this.repaymentAccount = repaymentAccount;
    }

    /**
     * 获取还款账号编号
     *
     * @return repayment_account_id - 还款账号编号
     */
    public String getRepaymentAccountId() {
        return repaymentAccountId;
    }

    /**
     * 设置还款账号编号
     *
     * @param repaymentAccountId 还款账号编号
     */
    public void setRepaymentAccountId(String repaymentAccountId) {
        this.repaymentAccountId = repaymentAccountId;
    }

    /**
     * 获取币种
     *
     * @return currencyName - 币种
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
     * 获取计息天数
     *
     * @return interest_bearing_days - 计息天数
     */
    public Integer getInterestBearingDays() {
        return interestBearingDays;
    }

    /**
     * 设置计息天数
     *
     * @param interestBearingDays 计息天数
     */
    public void setInterestBearingDays(Integer interestBearingDays) {
        this.interestBearingDays = interestBearingDays;
    }

    /**
     * 获取利率类型
     *
     * @return interest_rate_type - 利率类型
     */
    public String getInterestRateType() {
        return interestRateType;
    }

    /**
     * 设置利率类型
     *
     * @param interestRateType 利率类型
     */
    public void setInterestRateType(String interestRateType) {
        this.interestRateType = interestRateType;
    }

    /**
     * 获取利率浮动方式
     *
     * @return interest_rate_floating - 利率浮动方式
     */
    public String getInterestRateFloating() {
        return interestRateFloating;
    }

    /**
     * 设置利率浮动方式
     *
     * @param interestRateFloating 利率浮动方式
     */
    public void setInterestRateFloating(String interestRateFloating) {
        this.interestRateFloating = interestRateFloating;
    }

    /**
     * 获取浮动比例
     *
     * @return floating_ratio - 浮动比例
     */
    public BigDecimal getFloatingRatio() {
        return floatingRatio;
    }

    /**
     * 设置浮动比例
     *
     * @param floatingRatio 浮动比例
     */
    public void setFloatingRatio(BigDecimal floatingRatio) {
        this.floatingRatio = floatingRatio;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取利息承担方
     *
     * @return interest_bearer - 利息承担方
     */
    public String getInterestBearer() {
        return interestBearer;
    }

    /**
     * 设置利息承担方
     *
     * @param interestBearer 利息承担方
     */
    public void setInterestBearer(String interestBearer) {
        this.interestBearer = interestBearer;
    }

    /**
     * 获取利息承担人
     *
     * @return interest_bearer_people - 利息承担人
     */
    public String getInterestBearerPeople() {
        return interestBearerPeople;
    }

    /**
     * 设置利息承担人
     *
     * @param interestBearerPeople 利息承担人
     */
    public void setInterestBearerPeople(String interestBearerPeople) {
        this.interestBearerPeople = interestBearerPeople;
    }

    /**
     * 获取利息承担人编号
     *
     * @return interest_bearer_people_id - 利息承担人编号
     */
    public String getInterestBearerPeopleId() {
        return interestBearerPeopleId;
    }

    /**
     * 设置利息承担人编号
     *
     * @param interestBearerPeopleId 利息承担人编号
     */
    public void setInterestBearerPeopleId(String interestBearerPeopleId) {
        this.interestBearerPeopleId = interestBearerPeopleId;
    }

    /**
     * 获取付息方式
     *
     * @return payment_method - 付息方式
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置付息方式
     *
     * @param paymentMethod 付息方式
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取合同利率(%)
     *
     * @return contract_interest_rate - 合同利率(%)
     */
    public BigDecimal getContractInterestRate() {
        return contractInterestRate;
    }

    /**
     * 设置合同利率(%)
     *
     * @param contractInterestRate 合同利率(%)
     */
    public void setContractInterestRate(BigDecimal contractInterestRate) {
        this.contractInterestRate = contractInterestRate;
    }

    /**
     * 获取业主利息比例(%)
     *
     * @return owner_interest_ratio - 业主利息比例(%)
     */
    public BigDecimal getOwnerInterestRatio() {
        return ownerInterestRatio;
    }

    /**
     * 设置业主利息比例(%)
     *
     * @param ownerInterestRatio 业主利息比例(%)
     */
    public void setOwnerInterestRatio(BigDecimal ownerInterestRatio) {
        this.ownerInterestRatio = ownerInterestRatio;
    }

    /**
     * 获取手续费承担方
     *
     * @return handling_party - 手续费承担方
     */
    public String getHandlingParty() {
        return handlingParty;
    }

    /**
     * 设置手续费承担方
     *
     * @param handlingParty 手续费承担方
     */
    public void setHandlingParty(String handlingParty) {
        this.handlingParty = handlingParty;
    }

    /**
     * 获取手续费承担人
     *
     * @return handling_party_people - 手续费承担人
     */
    public String getHandlingPartyPeople() {
        return handlingPartyPeople;
    }

    /**
     * 设置手续费承担人
     *
     * @param handlingPartyPeople 手续费承担人
     */
    public void setHandlingPartyPeople(String handlingPartyPeople) {
        this.handlingPartyPeople = handlingPartyPeople;
    }

    /**
     * 获取手续费承担人编号
     *
     * @return handling_party_people_id - 手续费承担人编号
     */
    public String getHandlingPartyPeopleId() {
        return handlingPartyPeopleId;
    }

    /**
     * 设置手续费承担人编号
     *
     * @param handlingPartyPeopleId 手续费承担人编号
     */
    public void setHandlingPartyPeopleId(String handlingPartyPeopleId) {
        this.handlingPartyPeopleId = handlingPartyPeopleId;
    }

    /**
     * 获取付手续费方式
     *
     * @return handling_method - 付手续费方式
     */
    public String getHandlingMethod() {
        return handlingMethod;
    }

    /**
     * 设置付手续费方式
     *
     * @param handlingMethod 付手续费方式
     */
    public void setHandlingMethod(String handlingMethod) {
        this.handlingMethod = handlingMethod;
    }

    /**
     * 获取费率(%)
     *
     * @return rate - 费率(%)
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置费率(%)
     *
     * @param rate 费率(%)
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取手续费总金额(元)
     *
     * @return total_handling_fee - 手续费总金额(元)
     */
    public BigDecimal getTotalHandlingFee() {
        return totalHandlingFee;
    }

    /**
     * 设置手续费总金额(元)
     *
     * @param totalHandlingFee 手续费总金额(元)
     */
    public void setTotalHandlingFee(BigDecimal totalHandlingFee) {
        this.totalHandlingFee = totalHandlingFee;
    }

    /**
     * 获取业主手续费比例(%)
     *
     * @return owner_handling_fee_ratio - 业主手续费比例(%)
     */
    public BigDecimal getOwnerHandlingFeeRatio() {
        return ownerHandlingFeeRatio;
    }

    /**
     * 设置业主手续费比例(%)
     *
     * @param ownerHandlingFeeRatio 业主手续费比例(%)
     */
    public void setOwnerHandlingFeeRatio(BigDecimal ownerHandlingFeeRatio) {
        this.ownerHandlingFeeRatio = ownerHandlingFeeRatio;
    }

    /**
     * 获取业主承担手续费
     *
     * @return owner_bears_handling_fee - 业主承担手续费
     */
    public BigDecimal getOwnerBearsHandlingFee() {
        return ownerBearsHandlingFee;
    }

    /**
     * 设置业主承担手续费
     *
     * @param ownerBearsHandlingFee 业主承担手续费
     */
    public void setOwnerBearsHandlingFee(BigDecimal ownerBearsHandlingFee) {
        this.ownerBearsHandlingFee = ownerBearsHandlingFee;
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
     * 获取销售合同
     *
     * @return sales_contract - 销售合同
     */
    public String getSalesContract() {
        return salesContract;
    }

    /**
     * 设置销售合同
     *
     * @param salesContract 销售合同
     */
    public void setSalesContract(String salesContract) {
        this.salesContract = salesContract;
    }

    /**
     * 获取客户公司名称
     *
     * @return customer_company_name - 客户公司名称
     */
    public String getCustomerCompanyName() {
        return customerCompanyName;
    }

    /**
     * 设置客户公司名称
     *
     * @param customerCompanyName 客户公司名称
     */
    public void setCustomerCompanyName(String customerCompanyName) {
        this.customerCompanyName = customerCompanyName;
    }

    /**
     * 获取客户公司名称编号
     *
     * @return customer_company_id - 客户公司名称编号
     */
    public String getCustomerCompanyId() {
        return customerCompanyId;
    }

    /**
     * 设置客户公司名称编号
     *
     * @param customerCompanyId 客户公司名称编号
     */
    public void setCustomerCompanyId(String customerCompanyId) {
        this.customerCompanyId = customerCompanyId;
    }

    /**
     * 获取合同签订方
     *
     * @return contract_signer - 合同签订方
     */
    public String getContractSigner() {
        return contractSigner;
    }

    /**
     * 设置合同签订方
     *
     * @param contractSigner 合同签订方
     */
    public void setContractSigner(String contractSigner) {
        this.contractSigner = contractSigner;
    }

    /**
     * 获取合同签订方编号
     *
     * @return contract_signer_id - 合同签订方编号
     */
    public String getContractSignerId() {
        return contractSignerId;
    }

    /**
     * 设置合同签订方编号
     *
     * @param contractSignerId 合同签订方编号
     */
    public void setContractSignerId(String contractSignerId) {
        this.contractSignerId = contractSignerId;
    }

    /**
     * 获取合同签订日期
     *
     * @return contract_signing_date - 合同签订日期
     */
    public Date getContractSigningDate() {
        return contractSigningDate;
    }

    /**
     * 设置合同签订日期
     *
     * @param contractSigningDate 合同签订日期
     */
    public void setContractSigningDate(Date contractSigningDate) {
        this.contractSigningDate = contractSigningDate;
    }

    /**
     * 获取合同总价(元)
     *
     * @return total_contract_price - 合同总价(元)
     */
    public BigDecimal getTotalContractPrice() {
        return totalContractPrice;
    }

    /**
     * 设置合同总价(元)
     *
     * @param totalContractPrice 合同总价(元)
     */
    public void setTotalContractPrice(BigDecimal totalContractPrice) {
        this.totalContractPrice = totalContractPrice;
    }

    /**
     * 获取已回款金额
     *
     * @return refunded_amount - 已回款金额
     */
    public BigDecimal getRefundedAmount() {
        return refundedAmount;
    }

    /**
     * 设置已回款金额
     *
     * @param refundedAmount 已回款金额
     */
    public void setRefundedAmount(BigDecimal refundedAmount) {
        this.refundedAmount = refundedAmount;
    }

    /**
     * 获取开出发票情况
     *
     * @return invoicing_situation - 开出发票情况
     */
    public String getInvoicingSituation() {
        return invoicingSituation;
    }

    /**
     * 设置开出发票情况
     *
     * @param invoicingSituation 开出发票情况
     */
    public void setInvoicingSituation(String invoicingSituation) {
        this.invoicingSituation = invoicingSituation;
    }

    /**
     * 获取货物交付清单
     *
     * @return cargo_delivery_list - 货物交付清单
     */
    public String getCargoDeliveryList() {
        return cargoDeliveryList;
    }

    /**
     * 设置货物交付清单
     *
     * @param cargoDeliveryList 货物交付清单
     */
    public void setCargoDeliveryList(String cargoDeliveryList) {
        this.cargoDeliveryList = cargoDeliveryList;
    }

    /**
     * 获取备注1
     *
     * @return remarks - 备注1
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注1
     *
     * @param remarks 备注1
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取审批状态
     *
     * @return approval_status - 审批状态
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * 设置审批状态
     *
     * @param approvalStatus 审批状态
     */
    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
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

    public Date getInterestPaymentDate() {
        return interestPaymentDate;
    }

    public void setInterestPaymentDate(Date interestPaymentDate) {
        this.interestPaymentDate = interestPaymentDate;
    }

    public String getInterestRateTypeId() {
        return interestRateTypeId;
    }

    public void setInterestRateTypeId(String interestRateTypeId) {
        this.interestRateTypeId = interestRateTypeId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
}