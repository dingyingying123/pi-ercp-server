package cn.com.personnel.ercp.pi.persistence.entity.innerLoan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_inner_loan_pre_repayment_apply")
public class FssInnerLoanPreRepaymentApply {
    /**
     * 主键id
     */
    @Id
    @Column(name = "repayment_apply_id")
    @GeneratedValue(generator = "JDBC")
    private String repaymentApplyId;

    /**
     * 合同主键id
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 申请单号
     */
    @Column(name = "apply_no")
    private String applyNo;

    /**
     * 申请人ID
     */
    @Column(name = "apply_user_id")
    private String applyUserId;

    /**
     * 申请人
     */
    @Column(name = "apply_user")
    private String applyUser;

    /**
     * 申请日期
     */
    @Column(name = "apply_date")
    private String applyDate;

    /**
     * 申请部门
     */
    @Column(name = "apply_dept")
    private String applyDept;

    /**
     * 申请部门id
     */
    @Column(name = "apply_dept_id")
    private String applyDeptId;

    /**
     * 流程摘要
     */
    @Column(name = "process_summary")
    private String processSummary;

    /**
     * 借款合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 借款合同编码
     */
    @Column(name = "contract_num")
    private String contractNum;

    /**
     * 是否签订合同
     */
    @Column(name = "is_sign_contract")
    private String isSignContract;

    /**
     * 合同签订日期
     */
    @Column(name = "contract_signing_date")
    private String contractSigningDate;

    /**
     * 借款方式
     */
    @Column(name = "borrowing_method")
    private String borrowingMethod;

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
     * 贷款期限（月）
     */
    @Column(name = "loan_term_month")
    private Integer loanTermMonth;

    /**
     * 贷款期限（年）
     */
    @Column(name = "loan_term_year")
    private String loanTermYear;

    /**
     * 借款起始日期
     */
    @Column(name = "loan_start_date")
    private String loanStartDate;

    /**
     * 借款到期日期
     */
    @Column(name = "loan_end_date")
    private String loanEndDate;

    /**
     * 币种
     */
    @Column(name = "currency_type")
    private String currencyType;

    /**
     * 币种id
     */
    @Column(name = "currency_type_id")
    private String currencyTypeId;

    /**
     * 汇率
     */
    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * 借款金额
     */
    @Column(name = "loan_amount")
    private BigDecimal loanAmount;

    /**
     * 已提款金额
     */
    @Column(name = "withdrawn_amount")
    private BigDecimal withdrawnAmount;

    /**
     * 已还款金额
     */
    @Column(name = "repayment_amount")
    private BigDecimal repaymentAmount;

    /**
     * 利率类型id
     */
    @Column(name = "interest_rate_type_id")
    private String interestRateTypeId;

    /**
     * 利率类型
     */
    @Column(name = "interest_rate_type")
    private String interestRateType;

    /**
     * 利率浮动方式
     */
    @Column(name = "interest_rate_float_way")
    private String interestRateFloatWay;

    /**
     * 浮动比例
     */
    @Column(name = "float_rate")
    private BigDecimal floatRate;

    /**
     * 调息方式
     */
    @Column(name = "adjust_interest_way")
    private String adjustInterestWay;

    /**
     * 调息日
     */
    @Column(name = "adjust_interest_date")
    private String adjustInterestDate;

    /**
     * 调息具体日期
     */
    @Column(name = "adjust_interest_specific_time")
    private Date adjustInterestSpecificTime;

    /**
     * 调息间隔
     */
    @Column(name = "adjust_interest_interval")
    private String adjustInterestInterval;

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
     * 还款日期
     */
    @Column(name = "repayment_date")
    private String repaymentDate;

    /**
     * 申请还款金额
     */
    @Column(name = "apply_repayment_amount")
    private BigDecimal applyRepaymentAmount;

    /**
     * 折合人民币金额（元）
     */
    @Column(name = "convert_into_rmb")
    private BigDecimal convertIntoRmb;

    /**
     * 还款来源
     */
    @Column(name = "repayment_source")
    private String repaymentSource;

    /**
     * 提前还款原因
     */
    @Column(name = "prepayment_reason")
    private String prepaymentReason;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 审批状态
     */
    @Column(name = "approval_status")
    private String approvalStatus;

    /**
     * 状态
     */
    private String status;

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
     * 乐观锁
     */
    private Integer version;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 业务单元id
     */
    @Column(name = "business_unit_id")
    private String businessUnitId;

    /**
     * 审批时间
     */
    @Column(name = "approval_time")
    private Date approvalTime;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_id")
    private String projectId;
    /**
     * 项目阶段
     */
    @Column(name = "project_stage")
    private String projectStage;

    /**
     * 是否提前还款
     * @return
     */
    @Column(name="is_prepayment")
    private String isPrepayment;

    /**
     * 还本支付途径
     */
    @Column(name="hb_pay_way")
    private String hbPayWay;

    /**
     *还本折合人民币金额
     */
    @Column(name="hb_discount_cny_money")
    private BigDecimal hbDiscountCnyMoney;

    /**
     *付息是否支付利息，是否
     */
    @Column(name="fx_is_way_interest")
    private String fxIsWayInterest;
    /**
     *付息还款日期
     */
    @Column(name="fx_repayment_date")
    private Date fxRepaymentDate;
    /**
     *付息申请支付利息金额
     */
    @Column(name="fx_way_interest_money")
    private BigDecimal fxWayInterestMoney;
    /**
     *付息折合人民币金额
     */
    @Column(name="fx_discount_cny_money")
    private BigDecimal fxDiscountCnyMoney;
    /**
     *付息支付途径
     */
    @Column(name="fx_pay_way")
    private String fxPayWay;
    /**
     *付息审核状态
     */
    @Column(name="fx_approval_status")
    private String fxApprovalStatus;
    /**
     *本息金额合计
     */
    @Column(name="zh_principal_money")
    private BigDecimal zhPrincipalMoney;
    /**
     *本次偿还金额合计
     */
    @Column(name="zh_repay_money")
    private BigDecimal zhRepayMoney;
    /**
     *借款方银行id
     */
    @Column(name="zh_debtor_bank_id")
    private String zhDebtorBankId;
    /**
     *借款方银行账号
     */
    @Column(name="zh_debtor_bank_account")
    private String zhDebtorBankAccount;
    /**
     *借款方银行名称
     */
    @Column(name="zh_debtor_bank_name")
    private String zhDebtorBankName;
    /**
     *收款方银行id
     */
    @Column(name="zh_payee_bank_id")
    private String zhPayeeBankId;
    /**
     *收款方银行名称
     */
    @Column(name="zh_payee_bank_name")
    private String zhPayeeBankName;
    /**
     *收款方银行账号
     */
    @Column(name="zh_payee_bank_account")
    private String zhPayeeBankAccount;

    /**
     * 还本是否支付本金，是否
     */
    @Column(name="hb_is_way_principal")
    private String hbIsWayPrincipal;

    /**
     * 还本是否提前还款
     */
    @Column(name="hb_is_prepayment")
    private String hbIsPrepayment;

    public BigDecimal getHbDiscountCnyMoney() {
        return hbDiscountCnyMoney;
    }

    public void setHbDiscountCnyMoney(BigDecimal hbDiscountCnyMoney) {
        this.hbDiscountCnyMoney = hbDiscountCnyMoney;
    }

    public String getHbPayWay() {
        return hbPayWay;
    }

    public void setHbPayWay(String hbPayWay) {
        this.hbPayWay = hbPayWay;
    }

    public String getFxIsWayInterest() {
        return fxIsWayInterest;
    }

    public void setFxIsWayInterest(String fxIsWayInterest) {
        this.fxIsWayInterest = fxIsWayInterest;
    }

    public Date getFxRepaymentDate() {
        return fxRepaymentDate;
    }

    public void setFxRepaymentDate(Date fxRepaymentDate) {
        this.fxRepaymentDate = fxRepaymentDate;
    }

    public BigDecimal getFxWayInterestMoney() {
        return fxWayInterestMoney;
    }

    public void setFxWayInterestMoney(BigDecimal fxWayInterestMoney) {
        this.fxWayInterestMoney = fxWayInterestMoney;
    }

    public BigDecimal getFxDiscountCnyMoney() {
        return fxDiscountCnyMoney;
    }

    public void setFxDiscountCnyMoney(BigDecimal fxDiscountCnyMoney) {
        this.fxDiscountCnyMoney = fxDiscountCnyMoney;
    }

    public String getFxPayWay() {
        return fxPayWay;
    }

    public void setFxPayWay(String fxPayWay) {
        this.fxPayWay = fxPayWay;
    }

    public String getFxApprovalStatus() {
        return fxApprovalStatus;
    }

    public void setFxApprovalStatus(String fxApprovalStatus) {
        this.fxApprovalStatus = fxApprovalStatus;
    }

    public BigDecimal getZhPrincipalMoney() {
        return zhPrincipalMoney;
    }

    public void setZhPrincipalMoney(BigDecimal zhPrincipalMoney) {
        this.zhPrincipalMoney = zhPrincipalMoney;
    }

    public BigDecimal getZhRepayMoney() {
        return zhRepayMoney;
    }

    public void setZhRepayMoney(BigDecimal zhRepayMoney) {
        this.zhRepayMoney = zhRepayMoney;
    }

    public String getZhDebtorBankId() {
        return zhDebtorBankId;
    }

    public void setZhDebtorBankId(String zhDebtorBankId) {
        this.zhDebtorBankId = zhDebtorBankId;
    }

    public String getZhDebtorBankAccount() {
        return zhDebtorBankAccount;
    }

    public void setZhDebtorBankAccount(String zhDebtorBankAccount) {
        this.zhDebtorBankAccount = zhDebtorBankAccount;
    }

    public String getZhDebtorBankName() {
        return zhDebtorBankName;
    }

    public void setZhDebtorBankName(String zhDebtorBankName) {
        this.zhDebtorBankName = zhDebtorBankName;
    }

    public String getZhPayeeBankId() {
        return zhPayeeBankId;
    }

    public void setZhPayeeBankId(String zhPayeeBankId) {
        this.zhPayeeBankId = zhPayeeBankId;
    }

    public String getZhPayeeBankName() {
        return zhPayeeBankName;
    }

    public void setZhPayeeBankName(String zhPayeeBankName) {
        this.zhPayeeBankName = zhPayeeBankName;
    }

    public String getZhPayeeBankAccount() {
        return zhPayeeBankAccount;
    }

    public void setZhPayeeBankAccount(String zhPayeeBankAccount) {
        this.zhPayeeBankAccount = zhPayeeBankAccount;
    }

    /**
     * 获取主键id
     *
     * @return repayment_apply_id - 主键id
     */
    public String getRepaymentApplyId() {
        return repaymentApplyId;
    }

    /**
     * 设置主键id
     *
     * @param repaymentApplyId 主键id
     */
    public void setRepaymentApplyId(String repaymentApplyId) {
        this.repaymentApplyId = repaymentApplyId;
    }

    /**
     * 获取合同主键id
     *
     * @return manage_id - 合同主键id
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置合同主键id
     *
     * @param manageId 合同主键id
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    /**
     * 获取申请单号
     *
     * @return apply_no - 申请单号
     */
    public String getApplyNo() {
        return applyNo;
    }

    /**
     * 设置申请单号
     *
     * @param applyNo 申请单号
     */
    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    /**
     * 获取申请人ID
     *
     * @return apply_user_id - 申请人ID
     */
    public String getApplyUserId() {
        return applyUserId;
    }

    /**
     * 设置申请人ID
     *
     * @param applyUserId 申请人ID
     */
    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    /**
     * 获取申请人
     *
     * @return apply_user - 申请人
     */
    public String getApplyUser() {
        return applyUser;
    }

    /**
     * 设置申请人
     *
     * @param applyUser 申请人
     */
    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser;
    }

    /**
     * 获取申请日期
     *
     * @return apply_date - 申请日期
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * 设置申请日期
     *
     * @param applyDate 申请日期
     */
    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * 获取申请部门
     *
     * @return apply_dept - 申请部门
     */
    public String getApplyDept() {
        return applyDept;
    }

    /**
     * 设置申请部门
     *
     * @param applyDept 申请部门
     */
    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept;
    }

    /**
     * 获取申请部门id
     *
     * @return apply_dept_id - 申请部门id
     */
    public String getApplyDeptId() {
        return applyDeptId;
    }

    /**
     * 设置申请部门id
     *
     * @param applyDeptId 申请部门id
     */
    public void setApplyDeptId(String applyDeptId) {
        this.applyDeptId = applyDeptId;
    }

    /**
     * 获取流程摘要
     *
     * @return process_summary - 流程摘要
     */
    public String getProcessSummary() {
        return processSummary;
    }

    /**
     * 设置流程摘要
     *
     * @param processSummary 流程摘要
     */
    public void setProcessSummary(String processSummary) {
        this.processSummary = processSummary;
    }

    /**
     * 获取借款合同名称
     *
     * @return contract_name - 借款合同名称
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * 设置借款合同名称
     *
     * @param contractName 借款合同名称
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * 获取借款合同编码
     *
     * @return contract_num - 借款合同编码
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * 设置借款合同编码
     *
     * @param contractNum 借款合同编码
     */
    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    /**
     * 获取是否签订合同
     *
     * @return is_sign_contract - 是否签订合同
     */
    public String getIsSignContract() {
        return isSignContract;
    }

    /**
     * 设置是否签订合同
     *
     * @param isSignContract 是否签订合同
     */
    public void setIsSignContract(String isSignContract) {
        this.isSignContract = isSignContract;
    }

    /**
     * 获取合同签订日期
     *
     * @return contract_signing_date - 合同签订日期
     */
    public String getContractSigningDate() {
        return contractSigningDate;
    }

    /**
     * 设置合同签订日期
     *
     * @param contractSigningDate 合同签订日期
     */
    public void setContractSigningDate(String contractSigningDate) {
        this.contractSigningDate = contractSigningDate;
    }

    /**
     * 获取借款方式
     *
     * @return borrowing_method - 借款方式
     */
    public String getBorrowingMethod() {
        return borrowingMethod;
    }

    /**
     * 设置借款方式
     *
     * @param borrowingMethod 借款方式
     */
    public void setBorrowingMethod(String borrowingMethod) {
        this.borrowingMethod = borrowingMethod;
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
     * 获取贷款期限（月）
     *
     * @return loan_term_month - 贷款期限（月）
     */
    public Integer getLoanTermMonth() {
        return loanTermMonth;
    }

    /**
     * 设置贷款期限（月）
     *
     * @param loanTermMonth 贷款期限（月）
     */
    public void setLoanTermMonth(Integer loanTermMonth) {
        this.loanTermMonth = loanTermMonth;
    }

    /**
     * 获取贷款期限（年）
     *
     * @return loan_term_year - 贷款期限（年）
     */
    public String getLoanTermYear() {
        return loanTermYear;
    }

    /**
     * 设置贷款期限（年）
     *
     * @param loanTermYear 贷款期限（年）
     */
    public void setLoanTermYear(String loanTermYear) {
        this.loanTermYear = loanTermYear;
    }

    /**
     * 获取借款起始日期
     *
     * @return loan_start_date - 借款起始日期
     */
    public String getLoanStartDate() {
        return loanStartDate;
    }

    /**
     * 设置借款起始日期
     *
     * @param loanStartDate 借款起始日期
     */
    public void setLoanStartDate(String loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    /**
     * 获取借款到期日期
     *
     * @return loan_end_date - 借款到期日期
     */
    public String getLoanEndDate() {
        return loanEndDate;
    }

    /**
     * 设置借款到期日期
     *
     * @param loanEndDate 借款到期日期
     */
    public void setLoanEndDate(String loanEndDate) {
        this.loanEndDate = loanEndDate;
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
     * 获取币种id
     *
     * @return currency_type_id - 币种id
     */
    public String getCurrencyTypeId() {
        return currencyTypeId;
    }

    /**
     * 设置币种id
     *
     * @param currencyTypeId 币种id
     */
    public void setCurrencyTypeId(String currencyTypeId) {
        this.currencyTypeId = currencyTypeId;
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
     * 获取借款金额
     *
     * @return loan_amount - 借款金额
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * 设置借款金额
     *
     * @param loanAmount 借款金额
     */
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * 获取已提款金额
     *
     * @return withdrawn_amount - 已提款金额
     */
    public BigDecimal getWithdrawnAmount() {
        return withdrawnAmount;
    }

    /**
     * 设置已提款金额
     *
     * @param withdrawnAmount 已提款金额
     */
    public void setWithdrawnAmount(BigDecimal withdrawnAmount) {
        this.withdrawnAmount = withdrawnAmount;
    }

    /**
     * 获取已还款金额
     *
     * @return repayment_amount - 已还款金额
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * 设置已还款金额
     *
     * @param repaymentAmount 已还款金额
     */
    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    /**
     * 获取利率类型id
     *
     * @return interest_rate_type_id - 利率类型id
     */
    public String getInterestRateTypeId() {
        return interestRateTypeId;
    }

    /**
     * 设置利率类型id
     *
     * @param interestRateTypeId 利率类型id
     */
    public void setInterestRateTypeId(String interestRateTypeId) {
        this.interestRateTypeId = interestRateTypeId;
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
     * @return interest_rate_float_way - 利率浮动方式
     */
    public String getInterestRateFloatWay() {
        return interestRateFloatWay;
    }

    /**
     * 设置利率浮动方式
     *
     * @param interestRateFloatWay 利率浮动方式
     */
    public void setInterestRateFloatWay(String interestRateFloatWay) {
        this.interestRateFloatWay = interestRateFloatWay;
    }

    /**
     * 获取浮动比例
     *
     * @return float_rate - 浮动比例
     */
    public BigDecimal getFloatRate() {
        return floatRate;
    }

    /**
     * 设置浮动比例
     *
     * @param floatRate 浮动比例
     */
    public void setFloatRate(BigDecimal floatRate) {
        this.floatRate = floatRate;
    }

    /**
     * 获取调息方式
     *
     * @return adjust_interest_way - 调息方式
     */
    public String getAdjustInterestWay() {
        return adjustInterestWay;
    }

    /**
     * 设置调息方式
     *
     * @param adjustInterestWay 调息方式
     */
    public void setAdjustInterestWay(String adjustInterestWay) {
        this.adjustInterestWay = adjustInterestWay;
    }

    /**
     * 获取调息日
     *
     * @return adjust_interest_date - 调息日
     */
    public String getAdjustInterestDate() {
        return adjustInterestDate;
    }

    /**
     * 设置调息日
     *
     * @param adjustInterestDate 调息日
     */
    public void setAdjustInterestDate(String adjustInterestDate) {
        this.adjustInterestDate = adjustInterestDate;
    }

    /**
     * 获取调息具体日期
     *
     * @return adjust_interest_specific_time - 调息具体日期
     */
    public Date getAdjustInterestSpecificTime() {
        return adjustInterestSpecificTime;
    }

    /**
     * 设置调息具体日期
     *
     * @param adjustInterestSpecificTime 调息具体日期
     */
    public void setAdjustInterestSpecificTime(Date adjustInterestSpecificTime) {
        this.adjustInterestSpecificTime = adjustInterestSpecificTime;
    }

    /**
     * 获取调息间隔
     *
     * @return adjust_interest_interval - 调息间隔
     */
    public String getAdjustInterestInterval() {
        return adjustInterestInterval;
    }

    /**
     * 设置调息间隔
     *
     * @param adjustInterestInterval 调息间隔
     */
    public void setAdjustInterestInterval(String adjustInterestInterval) {
        this.adjustInterestInterval = adjustInterestInterval;
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
     * 获取还款日期
     *
     * @return repayment_date - 还款日期
     */
    public String getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * 设置还款日期
     *
     * @param repaymentDate 还款日期
     */
    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    /**
     * 获取申请还款金额
     *
     * @return apply_repayment_amount - 申请还款金额
     */
    public BigDecimal getApplyRepaymentAmount() {
        return applyRepaymentAmount;
    }

    /**
     * 设置申请还款金额
     *
     * @param applyRepaymentAmount 申请还款金额
     */
    public void setApplyRepaymentAmount(BigDecimal applyRepaymentAmount) {
        this.applyRepaymentAmount = applyRepaymentAmount;
    }

    /**
     * 获取折合人民币金额（元）
     *
     * @return convert_into_rmb - 折合人民币金额（元）
     */
    public BigDecimal getConvertIntoRmb() {
        return convertIntoRmb;
    }

    /**
     * 设置折合人民币金额（元）
     *
     * @param convertIntoRmb 折合人民币金额（元）
     */
    public void setConvertIntoRmb(BigDecimal convertIntoRmb) {
        this.convertIntoRmb = convertIntoRmb;
    }

    /**
     * 获取还款来源
     *
     * @return repayment_source - 还款来源
     */
    public String getRepaymentSource() {
        return repaymentSource;
    }

    /**
     * 设置还款来源
     *
     * @param repaymentSource 还款来源
     */
    public void setRepaymentSource(String repaymentSource) {
        this.repaymentSource = repaymentSource;
    }

    /**
     * 获取提前还款原因
     *
     * @return prepayment_reason - 提前还款原因
     */
    public String getPrepaymentReason() {
        return prepaymentReason;
    }

    /**
     * 设置提前还款原因
     *
     * @param prepaymentReason 提前还款原因
     */
    public void setPrepaymentReason(String prepaymentReason) {
        this.prepaymentReason = prepaymentReason;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
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
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
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
     * 获取乐观锁
     *
     * @return version - 乐观锁
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置乐观锁
     *
     * @param version 乐观锁
     */
    public void setVersion(Integer version) {
        this.version = version;
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
     * 获取业务单元id
     *
     * @return business_unit_id - 业务单元id
     */
    public String getBusinessUnitId() {
        return businessUnitId;
    }

    /**
     * 设置业务单元id
     *
     * @param businessUnitId 业务单元id
     */
    public void setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    /**
     * 获取审批时间
     *
     * @return approval_time - 审批时间
     */
    public Date getApprovalTime() {
        return approvalTime;
    }

    /**
     * 设置审批时间
     *
     * @param approvalTime 审批时间
     */
    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectStage() {
        return projectStage;
    }

    public void setProjectStage(String projectStage) {
        this.projectStage = projectStage;
    }

    public String getIsPrepayment() {
        return isPrepayment;
    }

    public void setIsPrepayment(String isPrepayment) {
        this.isPrepayment = isPrepayment;
    }

    public String getHbIsWayPrincipal() {
        return hbIsWayPrincipal;
    }

    public void setHbIsWayPrincipal(String hbIsWayPrincipal) {
        this.hbIsWayPrincipal = hbIsWayPrincipal;
    }

    public String getHbIsPrepayment() {
        return hbIsPrepayment;
    }

    public void setHbIsPrepayment(String hbIsPrepayment) {
        this.hbIsPrepayment = hbIsPrepayment;
    }
}