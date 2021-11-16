package cn.com.personnel.ercp.pi.persistence.entity.innerLoan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_inner_loan_contract")
public class FssInnerLoanContract {
    /**
     * 主键id
     */
    @Id
    @Column(name = "inner_id")
    @GeneratedValue(generator = "JDBC")
    private String innerId;

    /**
     * 申请单号
     */
    @Column(name = "apply_no")
    private String applyNo;

    /**
     * 申请人
     */
    @Column(name = "apply_user")
    private String applyUser;

    /**
     * 申请人id
     */
    @Column(name = "apply_user_id")
    private String applyUserId;

    /**
     * 申请日期
     */
    @Column(name = "apply_date")
    private Date applyDate;

    /**
     * 部门
     */
    private String department;

    /**
     * 部门ID
     */
    @Column(name = "department_id")
    private String departmentId;

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
     * 借款金额
     */
    @Column(name = "loan_amount")
    private BigDecimal loanAmount;

    /**
     * 借款金额折合人民币金额
     */
    @Column(name = "discount_loan_amount")
    private BigDecimal discountLoanAmount;

    /**
     * 本年累计借款金额
     */
    @Column(name = "cumulative_loan_amount_this_year")
    private BigDecimal cumulativeLoanAmountThisYear;

    /**
     * 本年累计借款金额折合人民币金额
     */
    @Column(name = "discount_cumulative_loan_amount_this_year")
    private BigDecimal discountCumulativeLoanAmountThisYear;

    /**
     * 年度净增加
     */
    @Column(name = "annual_net_increase")
    private BigDecimal annualNetIncrease;

    /**
     * 年度净增加折合人民币金额
     */
    @Column(name = "discount_annual_net_increase")
    private BigDecimal discountAnnualNetIncrease;

    /**
     * 计息天数
     */
    @Column(name = "interest_days")
    private Integer interestDays;

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
     * 贷款利率
     */
    @Column(name = "lending_rates")
    private BigDecimal lendingRates;

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
     * 利率浮动方式描述
     */
    @Column(name = "float_interest_way_desc")
    private String floatInterestWayDesc;

    /**
     * 首次付息日
     */
    @Column(name = "first_interest_payment_date")
    private String firstInterestPaymentDate;

    /**
     * 付息间隔字典表ID
     */
    @Column(name = "interest_payment_interval_id")
    private String interestPaymentIntervalId;

    /**
     * 付息间隔
     */
    @Column(name = "interest_payment_interval")
    private String interestPaymentInterval;

    /**
     * 借款方开户银行ID
     */
    @Column(name = "borrower_bank_id")
    private String borrowerBankId;

    /**
     * 借款方开户银行编码
     */
    @Column(name = "borrower_bank_code")
    private String borrowerBankCode;

    /**
     * 借款方开户银行全称
     */
    @Column(name = "borrower_bank_all")
    private String borrowerBankAll;

    /**
     * 银行账号
     */
    @Column(name = "bank_account")
    private String bankAccount;

    /**
     * 借款说明
     */
    @Column(name = "loan_description")
    private String loanDescription;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 状态
     */
    private String status;

    /**
     * 审批状态
     */
    @Column(name = "approval_status")
    private String approvalStatus;

    /**
     * 审批时间
     */
    @Column(name = "approval_time")
    private Date approvalTime;

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
     * 逻辑删除
     */
    private String deleted;

    /**
     * 发起日期
     */
    @Column(name = "start_date")
    private String startDate;

    /**
     * 数据校验
     */
    @Column(name = "data_check")
    private String dataCheck;

    /**
     * 汇率
     */
    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 项目ID
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 项目阶段
     */
    @Column(name = "project_stage")
    private String projectStage;

    /**
     * 分配号
     */
    @Column(name = "assigned_number")
    private String assignedNumber;

    /**
     * 实际总投资
     */
    @Column(name = "cctual_total_investment")
    private BigDecimal cctualTotalInvestment;

    /**
     * 已到位资金
     */
    @Column(name = "capital_amount")
    private BigDecimal capitalAmount;

    /**
     * 工程进度情况
     */
    @Column(name = "project_progress")
    private String projectProgress;

    /**
     * SAP项目编码
     */
    private String pspid;

    /**
     * SAP项目名称
     */
    private String post1;

    /**
     * SAP利润中心编码
     */
    private String prctr;

    /**
     * SAP的对象号
     */
    private String objnr;

    /**
     * 流程类型
     */
    @Column(name = "process_type")
    private String processType;

    /**
     * 流程类型ID
     */
    @Column(name = "process_type_id")
    private String processTypeId;

    /**
     * 项目性质
     */
    @Column(name = "project_nature")
    private String projectNature;

    /**
     * 获取主键id
     *
     * @return inner_id - 主键id
     */
    public String getInnerId() {
        return innerId;
    }

    /**
     * 设置主键id
     *
     * @param innerId 主键id
     */
    public void setInnerId(String innerId) {
        this.innerId = innerId;
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
     * 获取申请人id
     *
     * @return apply_user_id - 申请人id
     */
    public String getApplyUserId() {
        return applyUserId;
    }

    /**
     * 设置申请人id
     *
     * @param applyUserId 申请人id
     */
    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
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
     * 获取部门
     *
     * @return department - 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门
     *
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取部门ID
     *
     * @return department_id - 部门ID
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门ID
     *
     * @param departmentId 部门ID
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
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
     * 获取借款金额折合人民币金额
     *
     * @return discount_loan_amount - 借款金额折合人民币金额
     */
    public BigDecimal getDiscountLoanAmount() {
        return discountLoanAmount;
    }

    /**
     * 设置借款金额折合人民币金额
     *
     * @param discountLoanAmount 借款金额折合人民币金额
     */
    public void setDiscountLoanAmount(BigDecimal discountLoanAmount) {
        this.discountLoanAmount = discountLoanAmount;
    }

    /**
     * 获取本年累计借款金额
     *
     * @return cumulative_loan_amount_this_year - 本年累计借款金额
     */
    public BigDecimal getCumulativeLoanAmountThisYear() {
        return cumulativeLoanAmountThisYear;
    }

    /**
     * 设置本年累计借款金额
     *
     * @param cumulativeLoanAmountThisYear 本年累计借款金额
     */
    public void setCumulativeLoanAmountThisYear(BigDecimal cumulativeLoanAmountThisYear) {
        this.cumulativeLoanAmountThisYear = cumulativeLoanAmountThisYear;
    }

    /**
     * 获取本年累计借款金额折合人民币金额
     *
     * @return discount_cumulative_loan_amount_this_year - 本年累计借款金额折合人民币金额
     */
    public BigDecimal getDiscountCumulativeLoanAmountThisYear() {
        return discountCumulativeLoanAmountThisYear;
    }

    /**
     * 设置本年累计借款金额折合人民币金额
     *
     * @param discountCumulativeLoanAmountThisYear 本年累计借款金额折合人民币金额
     */
    public void setDiscountCumulativeLoanAmountThisYear(BigDecimal discountCumulativeLoanAmountThisYear) {
        this.discountCumulativeLoanAmountThisYear = discountCumulativeLoanAmountThisYear;
    }

    /**
     * 获取年度净增加
     *
     * @return annual_net_increase - 年度净增加
     */
    public BigDecimal getAnnualNetIncrease() {
        return annualNetIncrease;
    }

    /**
     * 设置年度净增加
     *
     * @param annualNetIncrease 年度净增加
     */
    public void setAnnualNetIncrease(BigDecimal annualNetIncrease) {
        this.annualNetIncrease = annualNetIncrease;
    }

    /**
     * 获取年度净增加折合人民币金额
     *
     * @return discount_annual_net_increase - 年度净增加折合人民币金额
     */
    public BigDecimal getDiscountAnnualNetIncrease() {
        return discountAnnualNetIncrease;
    }

    /**
     * 设置年度净增加折合人民币金额
     *
     * @param discountAnnualNetIncrease 年度净增加折合人民币金额
     */
    public void setDiscountAnnualNetIncrease(BigDecimal discountAnnualNetIncrease) {
        this.discountAnnualNetIncrease = discountAnnualNetIncrease;
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
     * 获取贷款利率
     *
     * @return lending_rates - 贷款利率
     */
    public BigDecimal getLendingRates() {
        return lendingRates;
    }

    /**
     * 设置贷款利率
     *
     * @param lendingRates 贷款利率
     */
    public void setLendingRates(BigDecimal lendingRates) {
        this.lendingRates = lendingRates;
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
     * 获取首次付息日
     *
     * @return first_interest_payment_date - 首次付息日
     */
    public String getFirstInterestPaymentDate() {
        return firstInterestPaymentDate;
    }

    /**
     * 设置首次付息日
     *
     * @param firstInterestPaymentDate 首次付息日
     */
    public void setFirstInterestPaymentDate(String firstInterestPaymentDate) {
        this.firstInterestPaymentDate = firstInterestPaymentDate;
    }

    /**
     * 获取付息间隔字典表ID
     *
     * @return interest_payment_interval_id - 付息间隔字典表ID
     */
    public String getInterestPaymentIntervalId() {
        return interestPaymentIntervalId;
    }

    /**
     * 设置付息间隔字典表ID
     *
     * @param interestPaymentIntervalId 付息间隔字典表ID
     */
    public void setInterestPaymentIntervalId(String interestPaymentIntervalId) {
        this.interestPaymentIntervalId = interestPaymentIntervalId;
    }

    /**
     * 获取付息间隔
     *
     * @return interest_payment_interval - 付息间隔
     */
    public String getInterestPaymentInterval() {
        return interestPaymentInterval;
    }

    /**
     * 设置付息间隔
     *
     * @param interestPaymentInterval 付息间隔
     */
    public void setInterestPaymentInterval(String interestPaymentInterval) {
        this.interestPaymentInterval = interestPaymentInterval;
    }

    /**
     * 获取借款方开户银行ID
     *
     * @return borrower_bank_id - 借款方开户银行ID
     */
    public String getBorrowerBankId() {
        return borrowerBankId;
    }

    /**
     * 设置借款方开户银行ID
     *
     * @param borrowerBankId 借款方开户银行ID
     */
    public void setBorrowerBankId(String borrowerBankId) {
        this.borrowerBankId = borrowerBankId;
    }

    /**
     * 获取借款方开户银行编码
     *
     * @return borrower_bank_code - 借款方开户银行编码
     */
    public String getBorrowerBankCode() {
        return borrowerBankCode;
    }

    /**
     * 设置借款方开户银行编码
     *
     * @param borrowerBankCode 借款方开户银行编码
     */
    public void setBorrowerBankCode(String borrowerBankCode) {
        this.borrowerBankCode = borrowerBankCode;
    }

    /**
     * 获取借款方开户银行全称
     *
     * @return borrower_bank_all - 借款方开户银行全称
     */
    public String getBorrowerBankAll() {
        return borrowerBankAll;
    }

    /**
     * 设置借款方开户银行全称
     *
     * @param borrowerBankAll 借款方开户银行全称
     */
    public void setBorrowerBankAll(String borrowerBankAll) {
        this.borrowerBankAll = borrowerBankAll;
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
     * 获取借款说明
     *
     * @return loan_description - 借款说明
     */
    public String getLoanDescription() {
        return loanDescription;
    }

    /**
     * 设置借款说明
     *
     * @param loanDescription 借款说明
     */
    public void setLoanDescription(String loanDescription) {
        this.loanDescription = loanDescription;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
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
     * 获取逻辑删除
     *
     * @return deleted - 逻辑删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置逻辑删除
     *
     * @param deleted 逻辑删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取发起日期
     *
     * @return start_date - 发起日期
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 设置发起日期
     *
     * @param startDate 发起日期
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取数据校验
     *
     * @return data_check - 数据校验
     */
    public String getDataCheck() {
        return dataCheck;
    }

    /**
     * 设置数据校验
     *
     * @param dataCheck 数据校验
     */
    public void setDataCheck(String dataCheck) {
        this.dataCheck = dataCheck;
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
     * 获取项目ID
     *
     * @return project_id - 项目ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目ID
     *
     * @param projectId 项目ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取项目阶段
     *
     * @return project_stage - 项目阶段
     */
    public String getProjectStage() {
        return projectStage;
    }

    /**
     * 设置项目阶段
     *
     * @param projectStage 项目阶段
     */
    public void setProjectStage(String projectStage) {
        this.projectStage = projectStage;
    }

    /**
     * 获取分配号
     *
     * @return assigned_number - 分配号
     */
    public String getAssignedNumber() {
        return assignedNumber;
    }

    /**
     * 设置分配号
     *
     * @param assignedNumber 分配号
     */
    public void setAssignedNumber(String assignedNumber) {
        this.assignedNumber = assignedNumber;
    }

    /**
     * 获取实际总投资
     *
     * @return cctual_total_investment - 实际总投资
     */
    public BigDecimal getCctualTotalInvestment() {
        return cctualTotalInvestment;
    }

    /**
     * 设置实际总投资
     *
     * @param cctualTotalInvestment 实际总投资
     */
    public void setCctualTotalInvestment(BigDecimal cctualTotalInvestment) {
        this.cctualTotalInvestment = cctualTotalInvestment;
    }

    /**
     * 获取已到位资金
     *
     * @return capital_amount - 已到位资金
     */
    public BigDecimal getCapitalAmount() {
        return capitalAmount;
    }

    /**
     * 设置已到位资金
     *
     * @param capitalAmount 已到位资金
     */
    public void setCapitalAmount(BigDecimal capitalAmount) {
        this.capitalAmount = capitalAmount;
    }

    /**
     * 获取工程进度情况
     *
     * @return project_progress - 工程进度情况
     */
    public String getProjectProgress() {
        return projectProgress;
    }

    /**
     * 设置工程进度情况
     *
     * @param projectProgress 工程进度情况
     */
    public void setProjectProgress(String projectProgress) {
        this.projectProgress = projectProgress;
    }

    /**
     * 获取SAP项目编码
     *
     * @return pspid - SAP项目编码
     */
    public String getPspid() {
        return pspid;
    }

    /**
     * 设置SAP项目编码
     *
     * @param pspid SAP项目编码
     */
    public void setPspid(String pspid) {
        this.pspid = pspid;
    }

    /**
     * 获取SAP项目名称
     *
     * @return post1 - SAP项目名称
     */
    public String getPost1() {
        return post1;
    }

    /**
     * 设置SAP项目名称
     *
     * @param post1 SAP项目名称
     */
    public void setPost1(String post1) {
        this.post1 = post1;
    }

    /**
     * 获取SAP利润中心编码
     *
     * @return prctr - SAP利润中心编码
     */
    public String getPrctr() {
        return prctr;
    }

    /**
     * 设置SAP利润中心编码
     *
     * @param prctr SAP利润中心编码
     */
    public void setPrctr(String prctr) {
        this.prctr = prctr;
    }

    /**
     * 获取SAP的对象号
     *
     * @return objnr - SAP的对象号
     */
    public String getObjnr() {
        return objnr;
    }

    /**
     * 设置SAP的对象号
     *
     * @param objnr SAP的对象号
     */
    public void setObjnr(String objnr) {
        this.objnr = objnr;
    }

    /**
     * 获取流程类型
     *
     * @return process_type - 流程类型
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * 设置流程类型
     *
     * @param processType 流程类型
     */
    public void setProcessType(String processType) {
        this.processType = processType;
    }

    /**
     * 获取流程类型ID
     *
     * @return process_type_id - 流程类型ID
     */
    public String getProcessTypeId() {
        return processTypeId;
    }

    /**
     * 设置流程类型ID
     *
     * @param processTypeId 流程类型ID
     */
    public void setProcessTypeId(String processTypeId) {
        this.processTypeId = processTypeId;
    }

    /**
     * 获取项目性质
     *
     * @return project_nature - 项目性质
     */
    public String getProjectNature() {
        return projectNature;
    }

    /**
     * 设置项目性质
     *
     * @param projectNature 项目性质
     */
    public void setProjectNature(String projectNature) {
        this.projectNature = projectNature;
    }
}