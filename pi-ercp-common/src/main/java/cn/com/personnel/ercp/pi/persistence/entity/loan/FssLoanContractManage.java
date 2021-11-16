package cn.com.personnel.ercp.pi.persistence.entity.loan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_loan_contract_manage")
public class FssLoanContractManage {
    /**
     * 主键id
     */
    @Id
    @Column(name = "manage_id")
    @GeneratedValue(generator = "JDBC")
    private String manageId;

    /**
     * 申请单号
     */
    @Column(name = "apply_no")
    private String applyNo;

    /**
     * 贷款种类
     */
    @Column(name = "loan_type")
    private String loanType;

    /**
     * 贷款种类id
     */
    @Column(name = "loan_type_id")
    private String loanTypeId;

    /**
     * 是否可循环
     */
    @Column(name = "is_loop")
    private String isLoop;

    /**
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 公司id
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 项目id
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 是否银团贷款
     */
    @Column(name = "is_syndicated_loan")
    private String isSyndicatedLoan;

    /**
     * 贷款机构
     */
    @Column(name = "loan_organization")
    private String loanOrganization;

    /**
     * 贷款机构id
     */
    @Column(name = "loan_organization_id")
    private String loanOrganizationId;

    /**
     * 银行账号
     */
    @Column(name = "bank_account")
    private String bankAccount;

    /**
     * 银行账号id
     */
    @Column(name = "bank_account_id")
    private String bankAccountId;

    /**
     * 业务单元
     */
    @Column(name = "business_unit")
    private String businessUnit;

    /**
     * 业务单元id
     */
    @Column(name = "business_unit_id")
    private String businessUnitId;

    /**
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 合同文本编号
     */
    @Column(name = "contract_num")
    private String contractNum;

    /**
     * 贷款期限（月）
     */
    @Column(name = "loan_term_month")
    private String loanTermMonth;

    /**
     * 贷款期限（年）
     */
    @Column(name = "loan_term_year")
    private String loanTermYear;

    /**
     * 合同签订日期
     */
    @Column(name = "contract_sign_date")
    private String contractSignDate;

    /**
     * 合同结束日期
     */
    @Column(name = "contract_end_date")
    private String contractEndDate;

    /**
     * 最后提款日
     */
    @Column(name = "last_withdrawal_date")
    private String lastWithdrawalDate;

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
    private String exchangeRate;

    /**
     * 合同金额
     */
    @Column(name = "contract_amount")
    private BigDecimal contractAmount;

    /**
     * 折后金额（元）
     */
    @Column(name = "amount_after_discount")
    private BigDecimal amountAfterDiscount;

    /**
     * 利率类型
     */
    @Column(name = "interest_rate_type")
    private String interestRateType;

    /**
     * 利率类型
     */
    @Column(name = "interest_rate_type_id")
    private String interestRateTypeId;

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
     * 合同利率
     */
    @Column(name = "contract_rate")
    private BigDecimal contractRate;

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
    private String adjustInterestSpecificTime;

    /**
     * 调息间隔
     */
    @Column(name = "adjust_interest_interval")
    private String adjustInterestInterval;

    /**
     * 计息天数
     */
    @Column(name = "interest_days")
    private Integer interestDays;

    /**
     * 利率浮动方式描述
     */
    @Column(name = "float_interest_way_desc")
    private String floatInterestWayDesc;

    /**
     * 宽限期到期日
     */
    @Column(name = "grace_time")
    private String graceTime;

    /**
     * 承诺费金额
     */
    @Column(name = "commitment_fee_amount")
    private BigDecimal commitmentFeeAmount;

    /**
     * 已交承诺费
     */
    @Column(name = "commitment_fee_paid")
    private BigDecimal commitmentFeePaid;

    /**
     * 承诺费比率（%）
     */
    @Column(name = "commitment_fee_rate")
    private BigDecimal commitmentFeeRate;

    /**
     * 担保类型
     */
    @Column(name = "guarantee_type")
    private String guaranteeType;

    /**
     * 担保人
     */
    @Column(name = "guarantee_person")
    private String guaranteePerson;

    /**
     * 贷款用途
     */
    @Column(name = "loan_purpose")
    private String loanPurpose;

    /**
     * 手续费金额
     */
    @Column(name = "service_charge_amount")
    private String serviceChargeAmount;

    /**
     * 手续费率（%）
     */
    @Column(name = "service_charge_rate")
    private BigDecimal serviceChargeRate;

    /**
     * 综合成本（%）
     */
    @Column(name = "comprehensive_cost")
    private BigDecimal comprehensiveCost;

    /**
     * 清户状态
     */
    @Column(name = "qinghu_status")
    private String qinghuStatus;
    /**
     * 转换日
     */
    @Column(name = "change_date")
    private String changeDate;
    /**
     * 备注
     */
    private String remarks;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新者
     */
    private String updater;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 借款申请id
     */
    @Column(name = "loan_id")
    private String loanId;

    /**
     * 逻辑删除，控制版本变更是否展示1:显示 0:不显示
     */
    private String deleted;

    /**
     * 审批时间
     */
    @Column(name = "approval_time")
    private Date approvalTime;

    /**
     * 审批状态
     */
    @Column(name = "approval_status")
    private String approvalStatus;

    /**
     * 分配号
     */
    @Column(name = "assigned_number")
    private String assignedNumber;
    /**
     * 状态
     */
    private String status;

    /**
     * 合同余额
     */
    @Column(name = "contract_balance")
    private BigDecimal contractBalance;

    /**
     * 原始合同管理主键id
     */
    @Column(name = "original_manage_id")
    private String originalManageId;

    /**
     * 申请人
     */
    @Column(name = "apply_user")
    private String applyUser;

    /**
     * 申请日期
     */
    @Column(name = "apply_date")
    private Date applyDate;

    /**
     * 部门名称
     */
    private String depart;

    /**
     * 部门id
     */
    @Column(name = "depart_id")
    private String departId;

    /**
     * 申请人id
     */
    @Column(name = "apply_user_id")
    private String applyUserId;
    /**
     * 计算状态
     */
    @Column(name = "calculation_status")
    private String calculationStatus;
    /**
     * 获取主键id
     *
     * @return manage_id - 主键id
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 变更状态
     */
    @Column(name = "change_status")
    private String changeStatus;

    /**
     * 还款户
     */
    @Column(name = "still_bank_account")
    private String stillBankAccount;
    /**
     * 还款户id
     */
    @Column(name = "still_bank_account_id")
    private String stillBankAccountId;


    public String getStillBankAccount() {
        return stillBankAccount;
    }

    public void setStillBankAccount(String stillBankAccount) {
        this.stillBankAccount = stillBankAccount;
    }

    public String getStillBankAccountId() {
        return stillBankAccountId;
    }

    public void setStillBankAccountId(String stillBankAccountId) {
        this.stillBankAccountId = stillBankAccountId;
    }

    /**
     * 设置主键id
     *
     * @param manageId 主键id
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
     * 获取贷款种类
     *
     * @return loan_type - 贷款种类
     */
    public String getLoanType() {
        return loanType;
    }

    public String getAssignedNumber() {
        return assignedNumber;
    }

    public void setAssignedNumber(String assignedNumber) {
        this.assignedNumber = assignedNumber;
    }

    /**
     * 设置贷款种类
     *
     * @param loanType 贷款种类
     */
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    /**
     * 获取贷款种类id
     *
     * @return loan_type_id - 贷款种类id
     */
    public String getLoanTypeId() {
        return loanTypeId;
    }

    /**
     * 设置贷款种类id
     *
     * @param loanTypeId 贷款种类id
     */
    public void setLoanTypeId(String loanTypeId) {
        this.loanTypeId = loanTypeId;
    }

    /**
     * 获取是否可循环
     *
     * @return is_loop - 是否可循环
     */
    public String getIsLoop() {
        return isLoop;
    }

    /**
     * 设置是否可循环
     *
     * @param isLoop 是否可循环
     */
    public void setIsLoop(String isLoop) {
        this.isLoop = isLoop;
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
     * 获取公司id
     *
     * @return company_id - 公司id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置公司id
     *
     * @param companyId 公司id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
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
     * 获取项目id
     *
     * @return project_id - 项目id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目id
     *
     * @param projectId 项目id
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取是否银团贷款
     *
     * @return is_syndicated_loan - 是否银团贷款
     */
    public String getIsSyndicatedLoan() {
        return isSyndicatedLoan;
    }

    /**
     * 设置是否银团贷款
     *
     * @param isSyndicatedLoan 是否银团贷款
     */
    public void setIsSyndicatedLoan(String isSyndicatedLoan) {
        this.isSyndicatedLoan = isSyndicatedLoan;
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
     * 获取贷款机构id
     *
     * @return loan_organization_id - 贷款机构id
     */
    public String getLoanOrganizationId() {
        return loanOrganizationId;
    }

    /**
     * 设置贷款机构id
     *
     * @param loanOrganizationId 贷款机构id
     */
    public void setLoanOrganizationId(String loanOrganizationId) {
        this.loanOrganizationId = loanOrganizationId;
    }

    /**
     * 获取银行账号
     *
     * @return bank_account - 银行账号
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 设置银行账号
     *
     * @param bankAccount 银行账号
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * 获取银行账号id
     *
     * @return bank_account_id - 银行账号id
     */
    public String getBankAccountId() {
        return bankAccountId;
    }

    /**
     * 设置银行账号id
     *
     * @param bankAccountId 银行账号id
     */
    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    /**
     * 获取业务单元
     *
     * @return business_unit - 业务单元
     */
    public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * 设置业务单元
     *
     * @param businessUnit 业务单元
     */
    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
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
     * @return contract_num - 合同文本编号
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * 设置合同文本编号
     *
     * @param contractNum 合同文本编号
     */
    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    /**
     * 获取贷款期限（月）
     *
     * @return loan_term_month - 贷款期限（月）
     */
    public String getLoanTermMonth() {
        return loanTermMonth;
    }

    /**
     * 设置贷款期限（月）
     *
     * @param loanTermMonth 贷款期限（月）
     */
    public void setLoanTermMonth(String loanTermMonth) {
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
     * 获取变更状态
     *
     * @return change_status - 变更状态
     */
    public String getChangeStatus() {
        return changeStatus;
    }

    /**
     * 设置变更状态
     *
     * @param changeStatus 变更状态
     */
    public void setChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
    }
    /**
     * 获取合同签订日期
     *
     * @return contract_sign_date - 合同签订日期
     */
    public String getContractSignDate() {
        return contractSignDate;
    }

    /**
     * 设置合同签订日期
     *
     * @param contractSignDate 合同签订日期
     */
    public void setContractSignDate(String contractSignDate) {
        this.contractSignDate = contractSignDate;
    }

    /**
     * 获取合同结束日期
     *
     * @return contract_end_date - 合同结束日期
     */
    public String getContractEndDate() {
        return contractEndDate;
    }

    /**
     * 设置合同结束日期
     *
     * @param contractEndDate 合同结束日期
     */
    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    /**
     * 获取最后提款日
     *
     * @return last_withdrawal_date - 最后提款日
     */
    public String getLastWithdrawalDate() {
        return lastWithdrawalDate;
    }

    /**
     * 设置最后提款日
     *
     * @param lastWithdrawalDate 最后提款日
     */
    public void setLastWithdrawalDate(String lastWithdrawalDate) {
        this.lastWithdrawalDate = lastWithdrawalDate;
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
     * 获取合同金额
     *
     * @return contract_amount - 合同金额
     */
    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    /**
     * 设置合同金额
     *
     * @param contractAmount 合同金额
     */
    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    /**
     * 获取折后金额（元）
     *
     * @return amount_after_discount - 折后金额（元）
     */
    public BigDecimal getAmountAfterDiscount() {
        return amountAfterDiscount;
    }

    /**
     * 设置折后金额（元）
     *
     * @param amountAfterDiscount 折后金额（元）
     */
    public void setAmountAfterDiscount(BigDecimal amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
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
     * 获取利率类型
     *
     * @return interest_rate_type_id - 利率类型
     */
    public String getInterestRateTypeId() {
        return interestRateTypeId;
    }

    /**
     * 设置利率类型
     *
     * @param interestRateTypeId 利率类型
     */
    public void setInterestRateTypeId(String interestRateTypeId) {
        this.interestRateTypeId = interestRateTypeId;
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
     * 获取合同利率
     *
     * @return contract_rate - 合同利率
     */
    public BigDecimal getContractRate() {
        return contractRate;
    }

    /**
     * 设置合同利率
     *
     * @param contractRate 合同利率
     */
    public void setContractRate(BigDecimal contractRate) {
        this.contractRate = contractRate;
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
    public String getAdjustInterestSpecificTime() {
        return adjustInterestSpecificTime;
    }

    /**
     * 设置调息具体日期
     *
     * @param adjustInterestSpecificTime 调息具体日期
     */
    public void setAdjustInterestSpecificTime(String adjustInterestSpecificTime) {
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
     * 获取计息天数
     *
     * @return interest_days - 计息天数
     */
    public Integer getInterestDays() {
        return interestDays;
    }

    /**
     * 设置计息天数
     *
     * @param interestDays 计息天数
     */
    public void setInterestDays(Integer interestDays) {
        this.interestDays = interestDays;
    }

    /**
     * 获取利率浮动方式描述
     *
     * @return float_interest_way_desc - 利率浮动方式描述
     */
    public String getFloatInterestWayDesc() {
        return floatInterestWayDesc;
    }

    /**
     * 设置利率浮动方式描述
     *
     * @param floatInterestWayDesc 利率浮动方式描述
     */
    public void setFloatInterestWayDesc(String floatInterestWayDesc) {
        this.floatInterestWayDesc = floatInterestWayDesc;
    }

    /**
     * 获取宽限期到期日
     *
     * @return grace_time - 宽限期到期日
     */
    public String getGraceTime() {
        return graceTime;
    }

    /**
     * 设置宽限期到期日
     *
     * @param graceTime 宽限期到期日
     */
    public void setGraceTime(String graceTime) {
        this.graceTime = graceTime;
    }

    /**
     * 获取承诺费金额
     *
     * @return commitment_fee_amount - 承诺费金额
     */
    public BigDecimal getCommitmentFeeAmount() {
        return commitmentFeeAmount;
    }

    /**
     * 设置承诺费金额
     *
     * @param commitmentFeeAmount 承诺费金额
     */
    public void setCommitmentFeeAmount(BigDecimal commitmentFeeAmount) {
        this.commitmentFeeAmount = commitmentFeeAmount;
    }

    /**
     * 获取已交承诺费
     *
     * @return commitment_fee_paid - 已交承诺费
     */
    public BigDecimal getCommitmentFeePaid() {
        return commitmentFeePaid;
    }

    /**
     * 设置已交承诺费
     *
     * @param commitmentFeePaid 已交承诺费
     */
    public void setCommitmentFeePaid(BigDecimal commitmentFeePaid) {
        this.commitmentFeePaid = commitmentFeePaid;
    }

    /**
     * 获取承诺费比率（%）
     *
     * @return commitment_fee_rate - 承诺费比率（%）
     */
    public BigDecimal getCommitmentFeeRate() {
        return commitmentFeeRate;
    }

    /**
     * 设置承诺费比率（%）
     *
     * @param commitmentFeeRate 承诺费比率（%）
     */
    public void setCommitmentFeeRate(BigDecimal commitmentFeeRate) {
        this.commitmentFeeRate = commitmentFeeRate;
    }

    /**
     * 获取担保类型
     *
     * @return guarantee_type - 担保类型
     */
    public String getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * 设置担保类型
     *
     * @param guaranteeType 担保类型
     */
    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    /**
     * 获取担保人
     *
     * @return guarantee_person - 担保人
     */
    public String getGuaranteePerson() {
        return guaranteePerson;
    }

    /**
     * 设置担保人
     *
     * @param guaranteePerson 担保人
     */
    public void setGuaranteePerson(String guaranteePerson) {
        this.guaranteePerson = guaranteePerson;
    }

    /**
     * 获取贷款用途
     *
     * @return loan_purpose - 贷款用途
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * 设置贷款用途
     *
     * @param loanPurpose 贷款用途
     */
    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    /**
     * 获取手续费金额
     *
     * @return service_charge_amount - 手续费金额
     */
    public String getServiceChargeAmount() {
        return serviceChargeAmount;
    }

    /**
     * 设置手续费金额
     *
     * @param serviceChargeAmount 手续费金额
     */
    public void setServiceChargeAmount(String serviceChargeAmount) {
        this.serviceChargeAmount = serviceChargeAmount;
    }

    /**
     * 获取手续费率（%）
     *
     * @return service_charge_rate - 手续费率（%）
     */
    public BigDecimal getServiceChargeRate() {
        return serviceChargeRate;
    }

    /**
     * 设置手续费率（%）
     *
     * @param serviceChargeRate 手续费率（%）
     */
    public void setServiceChargeRate(BigDecimal serviceChargeRate) {
        this.serviceChargeRate = serviceChargeRate;
    }

    /**
     * 获取综合成本（%）
     *
     * @return comprehensive_cost - 综合成本（%）
     */
    public BigDecimal getComprehensiveCost() {
        return comprehensiveCost;
    }

    /**
     * 设置综合成本（%）
     *
     * @param comprehensiveCost 综合成本（%）
     */
    public void setComprehensiveCost(BigDecimal comprehensiveCost) {
        this.comprehensiveCost = comprehensiveCost;
    }

    /**
     * 获取清户状态
     *
     * @return qinghu_status - 清户状态
     */
    public String getQinghuStatus() {
        return qinghuStatus;
    }

    /**
     * 设置清户状态
     *
     * @param qinghuStatus 清户状态
     */
    public void setQinghuStatus(String qinghuStatus) {
        this.qinghuStatus = qinghuStatus;
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
     * 获取创建者
     *
     * @return creator - 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator 创建者
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
     * 获取更新者
     *
     * @return updater - 更新者
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设置更新者
     *
     * @param updater 更新者
     */
    public void setUpdater(String updater) {
        this.updater = updater;
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
     * 获取借款申请id
     *
     * @return loan_id - 借款申请id
     */
    public String getLoanId() {
        return loanId;
    }

    /**
     * 设置借款申请id
     *
     * @param loanId 借款申请id
     */
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    /**
     * 获取逻辑删除，控制版本变更是否展示1:显示 0:不显示
     *
     * @return deleted - 逻辑删除，控制版本变更是否展示1:显示 0:不显示
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置逻辑删除，控制版本变更是否展示1:显示 0:不显示
     *
     * @param deleted 逻辑删除，控制版本变更是否展示1:显示 0:不显示
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
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
     * 获取合同余额
     *
     * @return contract_balance - 合同余额
     */
    public BigDecimal getContractBalance() {
        return contractBalance;
    }

    /**
     * 设置合同余额
     *
     * @param contractBalance 合同余额
     */
    public void setContractBalance(BigDecimal contractBalance) {
        this.contractBalance = contractBalance;
    }

    /**
     * 获取原始合同管理主键id
     *
     * @return original_manage_id - 原始合同管理主键id
     */
    public String getOriginalManageId() {
        return originalManageId;
    }

    /**
     * 设置原始合同管理主键id
     *
     * @param originalManageId 原始合同管理主键id
     */
    public void setOriginalManageId(String originalManageId) {
        this.originalManageId = originalManageId;
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
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * 设置申请日期
     *
     * @param applyDate 申请日期
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * 获取部门名称
     *
     * @return depart - 部门名称
     */
    public String getDepart() {
        return depart;
    }

    /**
     * 设置部门名称
     *
     * @param depart 部门名称
     */
    public void setDepart(String depart) {
        this.depart = depart;
    }

    /**
     * 获取部门id
     *
     * @return depart_id - 部门id
     */
    public String getDepartId() {
        return departId;
    }

    /**
     * 设置部门id
     *
     * @param departId 部门id
     */
    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    public String getCalculationStatus() {
        return calculationStatus;
    }

    public void setCalculationStatus(String calculationStatus) {
        this.calculationStatus = calculationStatus;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }
}