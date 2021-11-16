package cn.com.personnel.ercp.pi.persistence.entity.loan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_loan_contract_iou")
public class FssLoanContractIou {
    /**
     * 借据主键id
     */
    @Id
    @Column(name = "iou_id")
    @GeneratedValue(generator = "JDBC")
    private String iouId;

    /**
     * 提款申请单号
     */
    @Column(name = "apply_no")
    private String applyNo;

    /**
     * 借据名称
     */
    @Column(name = "iou_name")
    private String iouName;

    /**
     * 提款日期
     */
    @Column(name = "withdraw_date")
    private Date withdrawDate;

    /**
     * 入账日期
     */
    @Column(name = "credit_date")
    private Date creditDate;

    /**
     * 币种
     */
    @Column(name = "currency_type")
    private String currencyType;

    /**
     * 提款金额
     */
    @Column(name = "withdraw_amount")
    private BigDecimal withdrawAmount;

    /**
     * 汇率
     */
    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * 提款金额折后金额（元）
     */
    @Column(name = "withdraw_after_discount_amount")
    private BigDecimal withdrawAfterDiscountAmount;

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
     * 借据利率
     */
    @Column(name = "iou_interest_rate")
    private BigDecimal iouInterestRate;

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
     * 首次付息日
     */
    @Column(name = "first_interest_payment_date")
    private Date firstInterestPaymentDate;

    /**
     * 付息间隔
     */
    @Column(name = "interest_payment_interval")
    private String interestPaymentInterval;

    /**
     * 是否已上传盖章版合同
     */
    @Column(name = "seal_contract_upload")
    private String sealContractUpload;

    /**
     * 是否银团贷款
     */
    @Column(name = "is_syndicated_loan")
    private String isSyndicatedLoan;

    /**
     * 银团贷款机构
     */
    @Column(name = "loan_organization")
    private String loanOrganization;

    /**
     * 银团贷款机构id
     */
    @Column(name = "loan_organization_id")
    private String loanOrganizationId;

    /**
     * 入账状态
     */
    @Column(name = "credit_status")
    private String creditStatus;

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
     * 备注
     */
    private String remarks;

    /**
     * 提款金额合计
     */
    @Column(name = "total_withdraw_amount")
    private BigDecimal totalWithdrawAmount;

    /**
     * 提款金额折后金额合计
     */
    @Column(name = "total_withdraw_after_discount_amount")
    private BigDecimal totalWithdrawAfterDiscountAmount;

    /**
     * 合同id
     */
    @Column(name = "manage_id")
    private String manageId;

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
     * 提款申请ID
     */
    @Column(name = "draw_apply_id")
    private String drawApplyId;

    /**
     * 利率类型id及利率code
     */
    @Column(name = "interest_rate_type_id")
    private String interestRateTypeId;

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
     * 生成分录分录编号
     */
    @Column(name = "entry_number")
    private String entryNumber;

    /**
     * 生成分录组编号
     */
    @Column(name = "group_no")
    private String groupNo;

    /**
     * 还款计划规则
     */
    @Column(name = "repayment_plan_calculate_rules")
    private String repaymentPlanCalculateRules;

    /**
     * 还款计划计算规则ID
     */
    @Column(name = "repayment_plan_calculate_rules_id")
    private String repaymentPlanCalculateRulesId;

    /**
     * 还款计划计算规则Code
     */
    @Column(name = "repayment_plan_calculate_rules_code")
    private String repaymentPlanCalculateRulesCode;

    /**
     * 计算状态
     */
    @Column(name = "calculation_status")
    private String calculationStatus;

    /**
     * 转换日
     */
    @Column(name = "change_date")
    private String changeDate;

    /**
     * 借据余额
     */
    @Column(name = "iou_balance")
    private BigDecimal iouBalance;

    /**
     * 币种编码
     */
    @Column(name = "currency_type_id")
    private String currencyTypeId;

    /**
     * 获取借据主键id
     *
     * @return iou_id - 借据主键id
     */
    public String getIouId() {
        return iouId;
    }

    /**
     * 设置借据主键id
     *
     * @param iouId 借据主键id
     */
    public void setIouId(String iouId) {
        this.iouId = iouId;
    }

    /**
     * 获取提款申请单号
     *
     * @return apply_no - 提款申请单号
     */
    public String getApplyNo() {
        return applyNo;
    }

    /**
     * 设置提款申请单号
     *
     * @param applyNo 提款申请单号
     */
    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    /**
     * 获取借据名称
     *
     * @return iou_name - 借据名称
     */
    public String getIouName() {
        return iouName;
    }

    /**
     * 设置借据名称
     *
     * @param iouName 借据名称
     */
    public void setIouName(String iouName) {
        this.iouName = iouName;
    }

    /**
     * 获取提款日期
     *
     * @return withdraw_date - 提款日期
     */
    public Date getWithdrawDate() {
        return withdrawDate;
    }

    /**
     * 设置提款日期
     *
     * @param withdrawDate 提款日期
     */
    public void setWithdrawDate(Date withdrawDate) {
        this.withdrawDate = withdrawDate;
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
     * 获取提款金额
     *
     * @return withdraw_amount - 提款金额
     */
    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    /**
     * 设置提款金额
     *
     * @param withdrawAmount 提款金额
     */
    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
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
     * 获取提款金额折后金额（元）
     *
     * @return withdraw_after_discount_amount - 提款金额折后金额（元）
     */
    public BigDecimal getWithdrawAfterDiscountAmount() {
        return withdrawAfterDiscountAmount;
    }

    /**
     * 设置提款金额折后金额（元）
     *
     * @param withdrawAfterDiscountAmount 提款金额折后金额（元）
     */
    public void setWithdrawAfterDiscountAmount(BigDecimal withdrawAfterDiscountAmount) {
        this.withdrawAfterDiscountAmount = withdrawAfterDiscountAmount;
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
     * 获取借据利率
     *
     * @return iou_interest_rate - 借据利率
     */
    public BigDecimal getIouInterestRate() {
        return iouInterestRate;
    }

    /**
     * 设置借据利率
     *
     * @param iouInterestRate 借据利率
     */
    public void setIouInterestRate(BigDecimal iouInterestRate) {
        this.iouInterestRate = iouInterestRate;
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
     * 获取首次付息日
     *
     * @return first_interest_payment_date - 首次付息日
     */
    public Date getFirstInterestPaymentDate() {
        return firstInterestPaymentDate;
    }

    /**
     * 设置首次付息日
     *
     * @param firstInterestPaymentDate 首次付息日
     */
    public void setFirstInterestPaymentDate(Date firstInterestPaymentDate) {
        this.firstInterestPaymentDate = firstInterestPaymentDate;
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
     * 获取是否已上传盖章版合同
     *
     * @return seal_contract_upload - 是否已上传盖章版合同
     */
    public String getSealContractUpload() {
        return sealContractUpload;
    }

    /**
     * 设置是否已上传盖章版合同
     *
     * @param sealContractUpload 是否已上传盖章版合同
     */
    public void setSealContractUpload(String sealContractUpload) {
        this.sealContractUpload = sealContractUpload;
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
     * 获取银团贷款机构
     *
     * @return loan_organization - 银团贷款机构
     */
    public String getLoanOrganization() {
        return loanOrganization;
    }

    /**
     * 设置银团贷款机构
     *
     * @param loanOrganization 银团贷款机构
     */
    public void setLoanOrganization(String loanOrganization) {
        this.loanOrganization = loanOrganization;
    }

    /**
     * 获取银团贷款机构id
     *
     * @return loan_organization_id - 银团贷款机构id
     */
    public String getLoanOrganizationId() {
        return loanOrganizationId;
    }

    /**
     * 设置银团贷款机构id
     *
     * @param loanOrganizationId 银团贷款机构id
     */
    public void setLoanOrganizationId(String loanOrganizationId) {
        this.loanOrganizationId = loanOrganizationId;
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
     * 获取提款金额合计
     *
     * @return total_withdraw_amount - 提款金额合计
     */
    public BigDecimal getTotalWithdrawAmount() {
        return totalWithdrawAmount;
    }

    /**
     * 设置提款金额合计
     *
     * @param totalWithdrawAmount 提款金额合计
     */
    public void setTotalWithdrawAmount(BigDecimal totalWithdrawAmount) {
        this.totalWithdrawAmount = totalWithdrawAmount;
    }

    /**
     * 获取提款金额折后金额合计
     *
     * @return total_withdraw_after_discount_amount - 提款金额折后金额合计
     */
    public BigDecimal getTotalWithdrawAfterDiscountAmount() {
        return totalWithdrawAfterDiscountAmount;
    }

    /**
     * 设置提款金额折后金额合计
     *
     * @param totalWithdrawAfterDiscountAmount 提款金额折后金额合计
     */
    public void setTotalWithdrawAfterDiscountAmount(BigDecimal totalWithdrawAfterDiscountAmount) {
        this.totalWithdrawAfterDiscountAmount = totalWithdrawAfterDiscountAmount;
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
     * 获取提款申请ID
     *
     * @return draw_apply_id - 提款申请ID
     */
    public String getDrawApplyId() {
        return drawApplyId;
    }

    /**
     * 设置提款申请ID
     *
     * @param drawApplyId 提款申请ID
     */
    public void setDrawApplyId(String drawApplyId) {
        this.drawApplyId = drawApplyId;
    }

    /**
     * 获取利率类型id及利率code
     *
     * @return interest_rate_type_id - 利率类型id及利率code
     */
    public String getInterestRateTypeId() {
        return interestRateTypeId;
    }

    /**
     * 设置利率类型id及利率code
     *
     * @param interestRateTypeId 利率类型id及利率code
     */
    public void setInterestRateTypeId(String interestRateTypeId) {
        this.interestRateTypeId = interestRateTypeId;
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
     * 获取生成分录分录编号
     *
     * @return entry_number - 生成分录分录编号
     */
    public String getEntryNumber() {
        return entryNumber;
    }

    /**
     * 设置生成分录分录编号
     *
     * @param entryNumber 生成分录分录编号
     */
    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    /**
     * 获取生成分录组编号
     *
     * @return group_no - 生成分录组编号
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * 设置生成分录组编号
     *
     * @param groupNo 生成分录组编号
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    /**
     * 获取还款计划规则
     *
     * @return repayment_plan_calculate_rules - 还款计划规则
     */
    public String getRepaymentPlanCalculateRules() {
        return repaymentPlanCalculateRules;
    }

    /**
     * 设置还款计划规则
     *
     * @param repaymentPlanCalculateRules 还款计划规则
     */
    public void setRepaymentPlanCalculateRules(String repaymentPlanCalculateRules) {
        this.repaymentPlanCalculateRules = repaymentPlanCalculateRules;
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
     * 获取转换日
     *
     * @return change_date - 转换日
     */
    public String getChangeDate() {
        return changeDate;
    }

    /**
     * 设置转换日
     *
     * @param changeDate 转换日
     */
    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    /**
     * 获取借据余额
     *
     * @return iou_balance - 借据余额
     */
    public BigDecimal getIouBalance() {
        return iouBalance;
    }

    /**
     * 设置借据余额
     *
     * @param iouBalance 借据余额
     */
    public void setIouBalance(BigDecimal iouBalance) {
        this.iouBalance = iouBalance;
    }

    /**
     * 获取币种编码
     *
     * @return currency_type_id - 币种编码
     */
    public String getCurrencyTypeId() {
        return currencyTypeId;
    }

    /**
     * 设置币种编码
     *
     * @param currencyTypeId 币种编码
     */
    public void setCurrencyTypeId(String currencyTypeId) {
        this.currencyTypeId = currencyTypeId;
    }

    public String getRepaymentPlanCalculateRulesId() {
        return repaymentPlanCalculateRulesId;
    }

    public void setRepaymentPlanCalculateRulesId(String repaymentPlanCalculateRulesId) {
        this.repaymentPlanCalculateRulesId = repaymentPlanCalculateRulesId;
    }

    public String getRepaymentPlanCalculateRulesCode() {
        return repaymentPlanCalculateRulesCode;
    }

    public void setRepaymentPlanCalculateRulesCode(String repaymentPlanCalculateRulesCode) {
        this.repaymentPlanCalculateRulesCode = repaymentPlanCalculateRulesCode;
    }
}