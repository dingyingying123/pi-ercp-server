package cn.com.personnel.ercp.pi.persistence.entity.credit.factoring;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_factoring_withdraw")
public class FssFactoringWithdraw {
    /**
     * 主键
     */
    @Id
    @Column(name = "fw_id")
    @GeneratedValue(generator = "JDBC")
    private String fwId;

    /**
     * 提款申请单号
     */
    @Column(name = "with_letter_number")
    private String withLetterNumber;

    /**
     * 单据名称
     */
    @Column(name = "document_name")
    private String documentName;

    /**
     * 提款申请人编号
     */
    @Column(name = "with_applicant_id")
    private String withApplicantId;

    /**
     * 提款申请人
     */
    @Column(name = "with_applicant_name")
    private String withApplicantName;

    /**
     * 提款申请部门编号
     */
    @Column(name = "with_applicant_dept_id")
    private String withApplicantDeptId;

    /**
     * 提款申请部门
     */
    @Column(name = "with_applicant_dept")
    private String withApplicantDept;

    /**
     * 提款申请日期
     */
    @Column(name = "with_applicant_date")
    private Date withApplicantDate;

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
     * 提款日期
     */
    @Column(name = "withdraw_date")
    private Date withdrawDate;

    /**
     * 提款日期起
     */
    @Transient
    private Date upWithdrawDate;

    /**
     * 提款日期止
     */
    @Transient
    private Date onlyWithdrawDate;

    /**
     * 入账日期
     */
    @Column(name = "credit_date")
    private Date creditDate;

    /**
     * 币种
     */
    @Column(name = "currency_name")
    private String currencyName;

    /**
     * 提款金额
     */
    @Column(name = "withdraw_amount")
    private BigDecimal withdrawAmount;

    /**
     * 保理种类
     */
    @Column(name = "factoring_type")
    private String factoringType;

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
     * 融资金额(元)
     */
    @Column(name = "financing_amount")
    private BigDecimal financingAmount;

    /**
     * 实际到款金额
     */
    @Column(name = "actual_payment_amount")
    private BigDecimal actualPaymentAmount;

    /**
     * 申请发放金额
     */
    @Column(name = "appliaction_payment_amount")
    private BigDecimal appliactionPaymentAmount;

    /**
     * 剩余申请发放金额
     */
    @Column(name = "appliaction_payment_overage")
    private BigDecimal appliactionPaymentOverage;

    /**
     * 利率类型
     */
    @Column(name = "interest_rate_type")
    private String interestRateType;

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
     * 合同利率(%)
     */
    @Column(name = "contract_interest_rate")
    private BigDecimal contractInterestRate;

    /**
     * 付息方式
     */
    @Column(name = "payment_method")
    private String paymentMethod;

    /**
     * 付息日
     */
    @Column(name = "interest_payment_date")
    private Date interestPaymentDate;

    /**
     * 付手续费方式
     */
    @Column(name = "handling_method")
    private String handlingMethod;

    /**
     * 手续费总金额(元)
     */
    @Column(name = "total_handling_fee")
    private BigDecimal totalHandlingFee;

    /**
     * 计算状态
     */
    @Column(name = "calculation_status")
    private String calculationStatus;

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
    private String remark;

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
     * 提款申请主键
     */
    @Column(name = "fwa_id")
    private String fwaId;

    /**
     * 保理合同主键
     */
    @Column(name = "fc_id")
    private String fcId;

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
     * 币种编号
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 币种编号
     */
    @Column(name = "currency_id")
    private String currencyId;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * 获取主键
     *
     * @return fw_id - 主键
     */
    public String getFwId() {
        return fwId;
    }

    /**
     * 设置主键
     *
     * @param fwId 主键
     */
    public void setFwId(String fwId) {
        this.fwId = fwId;
    }

    /**
     * 获取提款申请单号
     *
     * @return with_letter_number - 提款申请单号
     */
    public String getWithLetterNumber() {
        return withLetterNumber;
    }

    /**
     * 设置提款申请单号
     *
     * @param withLetterNumber 提款申请单号
     */
    public void setWithLetterNumber(String withLetterNumber) {
        this.withLetterNumber = withLetterNumber;
    }

    /**
     * 获取单据名称
     *
     * @return document_name - 单据名称
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * 设置单据名称
     *
     * @param documentName 单据名称
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * 获取提款申请人编号
     *
     * @return with_applicant_id - 提款申请人编号
     */
    public String getWithApplicantId() {
        return withApplicantId;
    }

    /**
     * 设置提款申请人编号
     *
     * @param withApplicantId 提款申请人编号
     */
    public void setWithApplicantId(String withApplicantId) {
        this.withApplicantId = withApplicantId;
    }

    /**
     * 获取提款申请人
     *
     * @return with_applicant_name - 提款申请人
     */
    public String getWithApplicantName() {
        return withApplicantName;
    }

    /**
     * 设置提款申请人
     *
     * @param withApplicantName 提款申请人
     */
    public void setWithApplicantName(String withApplicantName) {
        this.withApplicantName = withApplicantName;
    }

    /**
     * 获取提款申请部门编号
     *
     * @return with_applicant_dept_id - 提款申请部门编号
     */
    public String getWithApplicantDeptId() {
        return withApplicantDeptId;
    }

    /**
     * 设置提款申请部门编号
     *
     * @param withApplicantDeptId 提款申请部门编号
     */
    public void setWithApplicantDeptId(String withApplicantDeptId) {
        this.withApplicantDeptId = withApplicantDeptId;
    }

    /**
     * 获取提款申请部门
     *
     * @return with_applicant_dept - 提款申请部门
     */
    public String getWithApplicantDept() {
        return withApplicantDept;
    }

    /**
     * 设置提款申请部门
     *
     * @param withApplicantDept 提款申请部门
     */
    public void setWithApplicantDept(String withApplicantDept) {
        this.withApplicantDept = withApplicantDept;
    }

    /**
     * 获取提款申请日期
     *
     * @return with_applicant_date - 提款申请日期
     */
    public Date getWithApplicantDate() {
        return withApplicantDate;
    }

    /**
     * 设置提款申请日期
     *
     * @param withApplicantDate 提款申请日期
     */
    public void setWithApplicantDate(Date withApplicantDate) {
        this.withApplicantDate = withApplicantDate;
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
     * 获取实际到款金额
     *
     * @return actual_payment_amount - 实际到款金额
     */
    public BigDecimal getActualPaymentAmount() {
        return actualPaymentAmount;
    }

    /**
     * 设置实际到款金额
     *
     * @param actualPaymentAmount 实际到款金额
     */
    public void setActualPaymentAmount(BigDecimal actualPaymentAmount) {
        this.actualPaymentAmount = actualPaymentAmount;
    }

    /**
     * 获取申请发放金额
     *
     * @return appliaction_payment_amount - 申请发放金额
     */
    public BigDecimal getAppliactionPaymentAmount() {
        return appliactionPaymentAmount;
    }

    /**
     * 设置申请发放金额
     *
     * @param appliactionPaymentAmount 申请发放金额
     */
    public void setAppliactionPaymentAmount(BigDecimal appliactionPaymentAmount) {
        this.appliactionPaymentAmount = appliactionPaymentAmount;
    }

    /**
     * 获取剩余申请发放金额
     *
     * @return appliaction_payment_overage - 剩余申请发放金额
     */
    public BigDecimal getAppliactionPaymentOverage() {
        return appliactionPaymentOverage;
    }

    /**
     * 设置剩余申请发放金额
     *
     * @param appliactionPaymentOverage 剩余申请发放金额
     */
    public void setAppliactionPaymentOverage(BigDecimal appliactionPaymentOverage) {
        this.appliactionPaymentOverage = appliactionPaymentOverage;
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
     * 获取付息日
     *
     * @return interest_payment_date - 付息日
     */
    public Date getInterestPaymentDate() {
        return interestPaymentDate;
    }

    /**
     * 设置付息日
     *
     * @param interestPaymentDate 付息日
     */
    public void setInterestPaymentDate(Date interestPaymentDate) {
        this.interestPaymentDate = interestPaymentDate;
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

    public Date getUpWithdrawDate() {
        return upWithdrawDate;
    }

    public void setUpWithdrawDate(Date upWithdrawDate) {
        this.upWithdrawDate = upWithdrawDate;
    }

    public Date getOnlyWithdrawDate() {
        return onlyWithdrawDate;
    }

    public void setOnlyWithdrawDate(Date onlyWithdrawDate) {
        this.onlyWithdrawDate = onlyWithdrawDate;
    }

    public String getFwaId() {
        return fwaId;
    }

    /**
     * 设置提款申请Id
     *
     * @param fwaId 提款申请Id
     */
    public void setFwaId(String fwaId) {
        this.fwaId = fwaId;
    }

    /**
     * 获取保理合同Id
     *
     * @return fc_id - 保理合同Id
     */
    public String getFcId() {
        return fcId;
    }

    /**
     * 设置保理合同Id
     *
     * @param fcId 保理合同Id
     */
    public void setFcId(String fcId) {
        this.fcId = fcId;
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
}