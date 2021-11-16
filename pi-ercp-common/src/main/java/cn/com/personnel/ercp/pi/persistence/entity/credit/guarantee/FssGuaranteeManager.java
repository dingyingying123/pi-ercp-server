package cn.com.personnel.ercp.pi.persistence.entity.credit.guarantee;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_guarantee_manager")
public class FssGuaranteeManager {
    /**
     * 保函管理ID
     */
    @Id
    @Column(name = "s_id")
    @GeneratedValue(generator = "JDBC")
    private String sId;

    /**
     * 申请单号
     */
    @Column(name = "apply_no")
    private String applyNo;

    /**
     * 保函申请人
     */
    @Column(name = "apply_user")
    private String applyUser;

    /**
     * 业务单元
     */
    @Column(name = "business_unit")
    private String businessUnit;

    /**
     * 申请部门
     */
    @Column(name = "apply_dept")
    private String applyDept;

    /**
     * 保函编号
     */
    @Column(name = "guarantee_num")
    private String guaranteeNum;

    /**
     * 合同号
     */
    @Column(name = "contract_no")
    private String contractNo;

    /**
     * 档案号
     */
    @Column(name = "archives_no")
    private String archivesNo;

    /**
     * 保函性质
     */
    @Column(name = "guarantee_nature")
    private String guaranteeNature;

    /**
     * 开立银行
     */
    @Column(name = "open_bank")
    private String openBank;

    /**
     * 转开行
     */
    @Column(name = "turn_bank")
    private String turnBank;

    /**
     * 保函份分数
     */
    @Column(name = "number_of_guarantee")
    private String numberOfGuarantee;

    /**
     * 是否代开
     */
    @Column(name = "whether_delegate_open")
    private String whetherDelegateOpen;

    /**
     * 保函金额
     */
    @Column(name = "amount_of_guarantee")
    private String amountOfGuarantee;

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
     * 折合人民币金额
     */
    @Column(name = "convert_into_rmb")
    private BigDecimal convertIntoRmb;

    /**
     * 生效日期
     */
    @Column(name = "effective_date")
    private Date effectiveDate;

    /**
     * 预计截至日
     */
    @Column(name = "estimated_end_date")
    private Date estimatedEndDate;

    /**
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 被担保人
     */
    private String warrantee;

    /**
     * 受益人
     */
    private String beneficiary;

    /**
     * 使用授信合同
     */
    @Column(name = "use_of_credit_contract")
    private String useOfCreditContract;

    /**
     * 使用融资品种
     */
    @Column(name = "use_of_financing_varieties")
    private String useOfFinancingVarieties;

    /**
     * 使用额度
     */
    @Column(name = "usage_limit")
    private String usageLimit;

    /**
     * 剩余授信额度
     */
    @Column(name = "remaining_credit_line")
    private BigDecimal remainingCreditLine;

    /**
     * 本次占用授信额度
     */
    @Column(name = "credit_occupied")
    private BigDecimal creditOccupied;

    /**
     * 快递号
     */
    @Column(name = "express_no")
    private String expressNo;

    /**
     * 授信占用说明
     */
    @Column(name = "des_credit_occupation")
    private String desCreditOccupation;

    /**
     * 备注
     */
    private String remarks;

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
     * 更新人
     */
    private String updater;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 合同主体
     */
    @Column(name = "subject_of_contract")
    private String subjectOfContract;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 是否收到回执
     */
    @Column(name = "is_receipt_received")
    private String isReceiptReceived;

    /**
     * 撤销情况
     */
    @Column(name = "revoke_situation")
    private String revokeSituation;

    /**
     * 撤销时间
     */
    @Column(name = "revoke_time")
    private Date revokeTime;

    /**
     * 未撤销原因
     */
    @Column(name = "not_revoke_cause")
    private String notRevokeCause;

    /**
     * 审批状态
     */
    @Column(name = "approval_status")
    private String approvalStatus;

    /**
     * 通知状态
     */
    @Column(name = "notification_status")
    private String notificationStatus;

    /**
     * 未撤销原因审批状态
     */
    @Column(name = "approval_status_of_reason_not_revoked")
    private String approvalStatusOfReasonNotRevoked;

    /**
     * 邮寄信息
     */
    @Column(name = "mailing_information")
    private String mailingInformation;

    /**
     * 保函负责人你
     */
    @Column(name = "responsible_person_name")
    private String responsiblePersonName;

    /**
     * 保函负责人部门
     */
    @Column(name = "responsible_person_dept")
    private String responsiblePersonDept;

    /**
     * 申请人ID
     */
    @Column(name = "apply_user_id")
    private String applyUserId;

    /**
     * 收到回执时间
     */
    @Column(name = "receipt_received_time")
    private String receiptReceivedTime;

    /**
     * 原件是否收回 ，0：否，1 是
     */
    @Column(name = "is_original_retrieve")
    private String isOriginalRetrieve;

    /**
     * 预计收回月份
     */
    @Column(name = "predict_retrieve_month")
    private String predictRetrieveMonth;

    /**
     * 未撤销原因(备注)
     */
    @Column(name = "no_cancel_cause_remarks")
    private String noCancelCauseRemarks;

    /**
     * 已收回未撤销
     */
    @Column(name = "recall_not_revoked")
    private String recallNotRevoked;

    /**
     * 未撤销原因审批时间
     */
    @Column(name = "approval_of_reason_not_revoked_time")
    private String approvalOfReasonNotRevokedTime;

    /**
     * 申请表主键
     */
    @Column(name = "guarantee_id")
    private String guaranteeId;

    /**
     * 业务单元Id
     */
    @Column(name = "business_unit_id")
    private String businessUnitId;

    /**
     * 合同code
     */
    @Column(name = "contract_code")
    private String contractCode;

    /**
     * 保函性质编号
     */
    @Column(name = "guarantee_nature_code")
    private String guaranteeNatureCode;

    /**
     * 开立银行ID
     */
    @Column(name = "head_id")
    private String headId;

    /**
     * 公司编号
     */
    @Column(name = "company_name_id")
    private String companyNameId;

    /**
     * 撤销状态
     */
    @Column(name = "revoke_stage")
    private String revokeStage;

    /**
     * 保函负责人的id
     */
    @Column(name = "responsible_person_id")
    private String responsiblePersonId;

    /**
     * 保函负责人部门ID
     */
    @Column(name = "responsible_person_dept_id")
    private String responsiblePersonDeptId;

    /**
     * 币种编码
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 费率
     */
    private BigDecimal rate;

    /**
     * 预估费用
     */
    @Column(name = "estimated_cost")
    private BigDecimal estimatedCost;

    /**
     * 银行编码
     */
    @Column(name = "head_code")
    private String headCode;

    /**
     * 合同主体id
     */
    @Column(name = "subject_of_contract_id")
    private String subjectOfContractId;

    /**
     * 被担保人id
     */
    @Column(name = "warrantee_id")
    private String warranteeId;

    /**
     * 获取保函管理ID
     *
     * @return s_id - 保函管理ID
     */
    public String getSId() {
        return sId;
    }

    /**
     * 设置保函管理ID
     *
     * @param sId 保函管理ID
     */
    public void setSId(String sId) {
        this.sId = sId;
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
     * 获取保函申请人
     *
     * @return apply_user - 保函申请人
     */
    public String getApplyUser() {
        return applyUser;
    }

    /**
     * 设置保函申请人
     *
     * @param applyUser 保函申请人
     */
    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser;
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
     * 获取保函编号
     *
     * @return guarantee_num - 保函编号
     */
    public String getGuaranteeNum() {
        return guaranteeNum;
    }

    /**
     * 设置保函编号
     *
     * @param guaranteeNum 保函编号
     */
    public void setGuaranteeNum(String guaranteeNum) {
        this.guaranteeNum = guaranteeNum;
    }

    /**
     * 获取合同号
     *
     * @return contract_no - 合同号
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * 设置合同号
     *
     * @param contractNo 合同号
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    /**
     * 获取档案号
     *
     * @return archives_no - 档案号
     */
    public String getArchivesNo() {
        return archivesNo;
    }

    /**
     * 设置档案号
     *
     * @param archivesNo 档案号
     */
    public void setArchivesNo(String archivesNo) {
        this.archivesNo = archivesNo;
    }

    /**
     * 获取保函性质
     *
     * @return guarantee_nature - 保函性质
     */
    public String getGuaranteeNature() {
        return guaranteeNature;
    }

    /**
     * 设置保函性质
     *
     * @param guaranteeNature 保函性质
     */
    public void setGuaranteeNature(String guaranteeNature) {
        this.guaranteeNature = guaranteeNature;
    }

    /**
     * 获取开立银行
     *
     * @return open_bank - 开立银行
     */
    public String getOpenBank() {
        return openBank;
    }

    /**
     * 设置开立银行
     *
     * @param openBank 开立银行
     */
    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    /**
     * 获取转开行
     *
     * @return turn_bank - 转开行
     */
    public String getTurnBank() {
        return turnBank;
    }

    /**
     * 设置转开行
     *
     * @param turnBank 转开行
     */
    public void setTurnBank(String turnBank) {
        this.turnBank = turnBank;
    }

    /**
     * 获取保函份分数
     *
     * @return number_of_guarantee - 保函份分数
     */
    public String getNumberOfGuarantee() {
        return numberOfGuarantee;
    }

    /**
     * 设置保函份分数
     *
     * @param numberOfGuarantee 保函份分数
     */
    public void setNumberOfGuarantee(String numberOfGuarantee) {
        this.numberOfGuarantee = numberOfGuarantee;
    }

    /**
     * 获取是否代开
     *
     * @return whether_delegate_open - 是否代开
     */
    public String getWhetherDelegateOpen() {
        return whetherDelegateOpen;
    }

    /**
     * 设置是否代开
     *
     * @param whetherDelegateOpen 是否代开
     */
    public void setWhetherDelegateOpen(String whetherDelegateOpen) {
        this.whetherDelegateOpen = whetherDelegateOpen;
    }

    /**
     * 获取保函金额
     *
     * @return amount_of_guarantee - 保函金额
     */
    public String getAmountOfGuarantee() {
        return amountOfGuarantee;
    }

    /**
     * 设置保函金额
     *
     * @param amountOfGuarantee 保函金额
     */
    public void setAmountOfGuarantee(String amountOfGuarantee) {
        this.amountOfGuarantee = amountOfGuarantee;
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
     * 获取折合人民币金额
     *
     * @return convert_into_rmb - 折合人民币金额
     */
    public BigDecimal getConvertIntoRmb() {
        return convertIntoRmb;
    }

    /**
     * 设置折合人民币金额
     *
     * @param convertIntoRmb 折合人民币金额
     */
    public void setConvertIntoRmb(BigDecimal convertIntoRmb) {
        this.convertIntoRmb = convertIntoRmb;
    }

    /**
     * 获取生效日期
     *
     * @return effective_date - 生效日期
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置生效日期
     *
     * @param effectiveDate 生效日期
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * 获取预计截至日
     *
     * @return estimated_end_date - 预计截至日
     */
    public Date getEstimatedEndDate() {
        return estimatedEndDate;
    }

    /**
     * 设置预计截至日
     *
     * @param estimatedEndDate 预计截至日
     */
    public void setEstimatedEndDate(Date estimatedEndDate) {
        this.estimatedEndDate = estimatedEndDate;
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
     * 获取被担保人
     *
     * @return warrantee - 被担保人
     */
    public String getWarrantee() {
        return warrantee;
    }

    /**
     * 设置被担保人
     *
     * @param warrantee 被担保人
     */
    public void setWarrantee(String warrantee) {
        this.warrantee = warrantee;
    }

    /**
     * 获取受益人
     *
     * @return beneficiary - 受益人
     */
    public String getBeneficiary() {
        return beneficiary;
    }

    /**
     * 设置受益人
     *
     * @param beneficiary 受益人
     */
    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    /**
     * 获取使用授信合同
     *
     * @return use_of_credit_contract - 使用授信合同
     */
    public String getUseOfCreditContract() {
        return useOfCreditContract;
    }

    /**
     * 设置使用授信合同
     *
     * @param useOfCreditContract 使用授信合同
     */
    public void setUseOfCreditContract(String useOfCreditContract) {
        this.useOfCreditContract = useOfCreditContract;
    }

    /**
     * 获取使用融资品种
     *
     * @return use_of_financing_varieties - 使用融资品种
     */
    public String getUseOfFinancingVarieties() {
        return useOfFinancingVarieties;
    }

    /**
     * 设置使用融资品种
     *
     * @param useOfFinancingVarieties 使用融资品种
     */
    public void setUseOfFinancingVarieties(String useOfFinancingVarieties) {
        this.useOfFinancingVarieties = useOfFinancingVarieties;
    }

    /**
     * 获取使用额度
     *
     * @return usage_limit - 使用额度
     */
    public String getUsageLimit() {
        return usageLimit;
    }

    /**
     * 设置使用额度
     *
     * @param usageLimit 使用额度
     */
    public void setUsageLimit(String usageLimit) {
        this.usageLimit = usageLimit;
    }

    /**
     * 获取剩余授信额度
     *
     * @return remaining_credit_line - 剩余授信额度
     */
    public BigDecimal getRemainingCreditLine() {
        return remainingCreditLine;
    }

    /**
     * 设置剩余授信额度
     *
     * @param remainingCreditLine 剩余授信额度
     */
    public void setRemainingCreditLine(BigDecimal remainingCreditLine) {
        this.remainingCreditLine = remainingCreditLine;
    }

    /**
     * 获取本次占用授信额度
     *
     * @return credit_occupied - 本次占用授信额度
     */
    public BigDecimal getCreditOccupied() {
        return creditOccupied;
    }

    /**
     * 设置本次占用授信额度
     *
     * @param creditOccupied 本次占用授信额度
     */
    public void setCreditOccupied(BigDecimal creditOccupied) {
        this.creditOccupied = creditOccupied;
    }

    /**
     * 获取快递号
     *
     * @return express_no - 快递号
     */
    public String getExpressNo() {
        return expressNo;
    }

    /**
     * 设置快递号
     *
     * @param expressNo 快递号
     */
    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    /**
     * 获取授信占用说明
     *
     * @return des_credit_occupation - 授信占用说明
     */
    public String getDesCreditOccupation() {
        return desCreditOccupation;
    }

    /**
     * 设置授信占用说明
     *
     * @param desCreditOccupation 授信占用说明
     */
    public void setDesCreditOccupation(String desCreditOccupation) {
        this.desCreditOccupation = desCreditOccupation;
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
     * 获取合同主体
     *
     * @return subject_of_contract - 合同主体
     */
    public String getSubjectOfContract() {
        return subjectOfContract;
    }

    /**
     * 设置合同主体
     *
     * @param subjectOfContract 合同主体
     */
    public void setSubjectOfContract(String subjectOfContract) {
        this.subjectOfContract = subjectOfContract;
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
     * 获取是否收到回执
     *
     * @return is_receipt_received - 是否收到回执
     */
    public String getIsReceiptReceived() {
        return isReceiptReceived;
    }

    /**
     * 设置是否收到回执
     *
     * @param isReceiptReceived 是否收到回执
     */
    public void setIsReceiptReceived(String isReceiptReceived) {
        this.isReceiptReceived = isReceiptReceived;
    }

    /**
     * 获取撤销情况
     *
     * @return revoke_situation - 撤销情况
     */
    public String getRevokeSituation() {
        return revokeSituation;
    }

    /**
     * 设置撤销情况
     *
     * @param revokeSituation 撤销情况
     */
    public void setRevokeSituation(String revokeSituation) {
        this.revokeSituation = revokeSituation;
    }

    /**
     * 获取撤销时间
     *
     * @return revoke_time - 撤销时间
     */
    public Date getRevokeTime() {
        return revokeTime;
    }

    /**
     * 设置撤销时间
     *
     * @param revokeTime 撤销时间
     */
    public void setRevokeTime(Date revokeTime) {
        this.revokeTime = revokeTime;
    }

    /**
     * 获取未撤销原因
     *
     * @return not_revoke_cause - 未撤销原因
     */
    public String getNotRevokeCause() {
        return notRevokeCause;
    }

    /**
     * 设置未撤销原因
     *
     * @param notRevokeCause 未撤销原因
     */
    public void setNotRevokeCause(String notRevokeCause) {
        this.notRevokeCause = notRevokeCause;
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
     * 获取通知状态
     *
     * @return notification_status - 通知状态
     */
    public String getNotificationStatus() {
        return notificationStatus;
    }

    /**
     * 设置通知状态
     *
     * @param notificationStatus 通知状态
     */
    public void setNotificationStatus(String notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    /**
     * 获取未撤销原因审批状态
     *
     * @return approval_status_of_reason_not_revoked - 未撤销原因审批状态
     */
    public String getApprovalStatusOfReasonNotRevoked() {
        return approvalStatusOfReasonNotRevoked;
    }

    /**
     * 设置未撤销原因审批状态
     *
     * @param approvalStatusOfReasonNotRevoked 未撤销原因审批状态
     */
    public void setApprovalStatusOfReasonNotRevoked(String approvalStatusOfReasonNotRevoked) {
        this.approvalStatusOfReasonNotRevoked = approvalStatusOfReasonNotRevoked;
    }

    /**
     * 获取邮寄信息
     *
     * @return mailing_information - 邮寄信息
     */
    public String getMailingInformation() {
        return mailingInformation;
    }

    /**
     * 设置邮寄信息
     *
     * @param mailingInformation 邮寄信息
     */
    public void setMailingInformation(String mailingInformation) {
        this.mailingInformation = mailingInformation;
    }

    /**
     * 获取保函负责人你
     *
     * @return responsible_person_name - 保函负责人你
     */
    public String getResponsiblePersonName() {
        return responsiblePersonName;
    }

    /**
     * 设置保函负责人你
     *
     * @param responsiblePersonName 保函负责人你
     */
    public void setResponsiblePersonName(String responsiblePersonName) {
        this.responsiblePersonName = responsiblePersonName;
    }

    /**
     * 获取保函负责人部门
     *
     * @return responsible_person_dept - 保函负责人部门
     */
    public String getResponsiblePersonDept() {
        return responsiblePersonDept;
    }

    /**
     * 设置保函负责人部门
     *
     * @param responsiblePersonDept 保函负责人部门
     */
    public void setResponsiblePersonDept(String responsiblePersonDept) {
        this.responsiblePersonDept = responsiblePersonDept;
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
     * 获取收到回执时间
     *
     * @return receipt_received_time - 收到回执时间
     */
    public String getReceiptReceivedTime() {
        return receiptReceivedTime;
    }

    /**
     * 设置收到回执时间
     *
     * @param receiptReceivedTime 收到回执时间
     */
    public void setReceiptReceivedTime(String receiptReceivedTime) {
        this.receiptReceivedTime = receiptReceivedTime;
    }

    /**
     * 获取原件是否收回 ，0：否，1 是
     *
     * @return is_original_retrieve - 原件是否收回 ，0：否，1 是
     */
    public String getIsOriginalRetrieve() {
        return isOriginalRetrieve;
    }

    /**
     * 设置原件是否收回 ，0：否，1 是
     *
     * @param isOriginalRetrieve 原件是否收回 ，0：否，1 是
     */
    public void setIsOriginalRetrieve(String isOriginalRetrieve) {
        this.isOriginalRetrieve = isOriginalRetrieve;
    }

    /**
     * 获取预计收回月份
     *
     * @return predict_retrieve_month - 预计收回月份
     */
    public String getPredictRetrieveMonth() {
        return predictRetrieveMonth;
    }

    /**
     * 设置预计收回月份
     *
     * @param predictRetrieveMonth 预计收回月份
     */
    public void setPredictRetrieveMonth(String predictRetrieveMonth) {
        this.predictRetrieveMonth = predictRetrieveMonth;
    }

    /**
     * 获取未撤销原因(备注)
     *
     * @return no_cancel_cause_remarks - 未撤销原因(备注)
     */
    public String getNoCancelCauseRemarks() {
        return noCancelCauseRemarks;
    }

    /**
     * 设置未撤销原因(备注)
     *
     * @param noCancelCauseRemarks 未撤销原因(备注)
     */
    public void setNoCancelCauseRemarks(String noCancelCauseRemarks) {
        this.noCancelCauseRemarks = noCancelCauseRemarks;
    }

    /**
     * 获取已收回未撤销
     *
     * @return recall_not_revoked - 已收回未撤销
     */
    public String getRecallNotRevoked() {
        return recallNotRevoked;
    }

    /**
     * 设置已收回未撤销
     *
     * @param recallNotRevoked 已收回未撤销
     */
    public void setRecallNotRevoked(String recallNotRevoked) {
        this.recallNotRevoked = recallNotRevoked;
    }

    /**
     * 获取未撤销原因审批时间
     *
     * @return approval_of_reason_not_revoked_time - 未撤销原因审批时间
     */
    public String getApprovalOfReasonNotRevokedTime() {
        return approvalOfReasonNotRevokedTime;
    }

    /**
     * 设置未撤销原因审批时间
     *
     * @param approvalOfReasonNotRevokedTime 未撤销原因审批时间
     */
    public void setApprovalOfReasonNotRevokedTime(String approvalOfReasonNotRevokedTime) {
        this.approvalOfReasonNotRevokedTime = approvalOfReasonNotRevokedTime;
    }

    /**
     * 获取申请表主键
     *
     * @return guarantee_id - 申请表主键
     */
    public String getGuaranteeId() {
        return guaranteeId;
    }

    /**
     * 设置申请表主键
     *
     * @param guaranteeId 申请表主键
     */
    public void setGuaranteeId(String guaranteeId) {
        this.guaranteeId = guaranteeId;
    }

    /**
     * 获取业务单元Id
     *
     * @return business_unit_id - 业务单元Id
     */
    public String getBusinessUnitId() {
        return businessUnitId;
    }

    /**
     * 设置业务单元Id
     *
     * @param businessUnitId 业务单元Id
     */
    public void setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    /**
     * 获取合同code
     *
     * @return contract_code - 合同code
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置合同code
     *
     * @param contractCode 合同code
     */
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    /**
     * 获取保函性质编号
     *
     * @return guarantee_nature_code - 保函性质编号
     */
    public String getGuaranteeNatureCode() {
        return guaranteeNatureCode;
    }

    /**
     * 设置保函性质编号
     *
     * @param guaranteeNatureCode 保函性质编号
     */
    public void setGuaranteeNatureCode(String guaranteeNatureCode) {
        this.guaranteeNatureCode = guaranteeNatureCode;
    }

    /**
     * 获取开立银行ID
     *
     * @return head_id - 开立银行ID
     */
    public String getHeadId() {
        return headId;
    }

    /**
     * 设置开立银行ID
     *
     * @param headId 开立银行ID
     */
    public void setHeadId(String headId) {
        this.headId = headId;
    }

    /**
     * 获取公司编号
     *
     * @return company_name_id - 公司编号
     */
    public String getCompanyNameId() {
        return companyNameId;
    }

    /**
     * 设置公司编号
     *
     * @param companyNameId 公司编号
     */
    public void setCompanyNameId(String companyNameId) {
        this.companyNameId = companyNameId;
    }

    /**
     * 获取撤销状态
     *
     * @return revoke_stage - 撤销状态
     */
    public String getRevokeStage() {
        return revokeStage;
    }

    /**
     * 设置撤销状态
     *
     * @param revokeStage 撤销状态
     */
    public void setRevokeStage(String revokeStage) {
        this.revokeStage = revokeStage;
    }

    /**
     * 获取保函负责人的id
     *
     * @return responsible_person_id - 保函负责人的id
     */
    public String getResponsiblePersonId() {
        return responsiblePersonId;
    }

    /**
     * 设置保函负责人的id
     *
     * @param responsiblePersonId 保函负责人的id
     */
    public void setResponsiblePersonId(String responsiblePersonId) {
        this.responsiblePersonId = responsiblePersonId;
    }

    /**
     * 获取保函负责人部门ID
     *
     * @return responsible_person_dept_id - 保函负责人部门ID
     */
    public String getResponsiblePersonDeptId() {
        return responsiblePersonDeptId;
    }

    /**
     * 设置保函负责人部门ID
     *
     * @param responsiblePersonDeptId 保函负责人部门ID
     */
    public void setResponsiblePersonDeptId(String responsiblePersonDeptId) {
        this.responsiblePersonDeptId = responsiblePersonDeptId;
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
     * 获取费率
     *
     * @return rate - 费率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置费率
     *
     * @param rate 费率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取预估费用
     *
     * @return estimated_cost - 预估费用
     */
    public BigDecimal getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * 设置预估费用
     *
     * @param estimatedCost 预估费用
     */
    public void setEstimatedCost(BigDecimal estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    /**
     * 获取银行编码
     *
     * @return head_code - 银行编码
     */
    public String getHeadCode() {
        return headCode;
    }

    /**
     * 设置银行编码
     *
     * @param headCode 银行编码
     */
    public void setHeadCode(String headCode) {
        this.headCode = headCode;
    }

    public String getSubjectOfContractId() {
        return subjectOfContractId;
    }

    public void setSubjectOfContractId(String subjectOfContractId) {
        this.subjectOfContractId = subjectOfContractId;
    }

    public String getWarranteeId() {
        return warranteeId;
    }

    public void setWarranteeId(String warranteeId) {
        this.warranteeId = warranteeId;
    }
}