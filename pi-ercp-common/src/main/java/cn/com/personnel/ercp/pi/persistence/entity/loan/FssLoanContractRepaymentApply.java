package cn.com.personnel.ercp.pi.persistence.entity.loan;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_loan_contract_repayment_apply")
public class FssLoanContractRepaymentApply {
    /**
     * 主键id
     */
    @Id
    @Column(name = "repayment_apply_id")
    @GeneratedValue(generator = "JDBC")
    private String repaymentApplyId;

    /**
     * 借款合同
     */
    @Column(name = "contract_name")
    private String contractName;

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
     * 申请日期
     */
    @Column(name = "apply_date")
    private Date applyDate;

    /**
     * 区域
     */
    private String area;

    /**
     * 申请部门
     */
    private String depart;

    /**
     * 申请部门id
     */
    @Column(name = "depart_id")
    private String departId;

    /**
     * 流程摘要
     */
    private String summary;

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
     * 合同金额
     */
    @Column(name = "contract_amount")
    private BigDecimal contractAmount;

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
    private String adjustInterestSpecificTime;

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

    /**
     * 项目id
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 合同主键id
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 工程进展
     */
    @Column(name = "project_progress")
    private String projectProgress;

    /**
     * 申请人ID
     */
    @Column(name = "apply_user_id")
    private String applyUserId;

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
     * 获取借款合同
     *
     * @return contract_name - 借款合同
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * 设置借款合同
     *
     * @param contractName 借款合同
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
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
     * 获取区域
     *
     * @return area - 区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区域
     *
     * @param area 区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取申请部门
     *
     * @return depart - 申请部门
     */
    public String getDepart() {
        return depart;
    }

    /**
     * 设置申请部门
     *
     * @param depart 申请部门
     */
    public void setDepart(String depart) {
        this.depart = depart;
    }

    /**
     * 获取申请部门id
     *
     * @return depart_id - 申请部门id
     */
    public String getDepartId() {
        return departId;
    }

    /**
     * 设置申请部门id
     *
     * @param departId 申请部门id
     */
    public void setDepartId(String departId) {
        this.departId = departId;
    }

    /**
     * 获取流程摘要
     *
     * @return summary - 流程摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置流程摘要
     *
     * @param summary 流程摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
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
     * 获取贷款种类
     *
     * @return loan_type - 贷款种类
     */
    public String getLoanType() {
        return loanType;
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
     * 获取工程进展
     *
     * @return project_progress - 工程进展
     */
    public String getProjectProgress() {
        return projectProgress;
    }

    /**
     * 设置工程进展
     *
     * @param projectProgress 工程进展
     */
    public void setProjectProgress(String projectProgress) {
        this.projectProgress = projectProgress;
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
}