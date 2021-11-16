package cn.com.personnel.ercp.pi.persistence.entity.credit.guarantee;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_guarantee_expire_reminder")
public class FssGuaranteeExpireReminder {
    @Id
    @Column(name = "reminder_id")
    private String reminderId;

    /**
     * 业务单元ID
     */
    @Column(name = "commercian_unit_id")
    private String commercianUnitId;

    /**
     * 业务单元
     */
    @Column(name = "commercian_unit")
    private String commercianUnit;

    /**
     * 保函编号
     */
    @Column(name = "guarantee_num")
    private String guaranteeNum;

    /**
     * 开立银行
     */
    @Column(name = "open_bank")
    private String openBank;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 受益人
     */
    private String beneficiary;

    /**
     * 合同主体
     */
    @Column(name = "subject_of_contract")
    private String subjectOfContract;

    /**
     * 到期天数
     */
    private Long days;

    /**
     * 未撤销原因
     */
    @Column(name = "not_revoke_cause")
    private String notRevokeCause;

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
     * 公司名称，合同主体
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 保函负责人
     */
    @Column(name = "responsible_person_name")
    private String responsiblePersonName;

    /**
     * 保函负责人部门
     */
    @Column(name = "responsible_person_dept")
    private String responsiblePersonDept;

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
     * 保函负责人ID
     */
    @Column(name = "responsible_person_id")
    private String responsiblePersonId;

    /**
     * 保函负责人部门ID
     */
    @Column(name = "responsible_person_dept_id")
    private String responsiblePersonDeptId;

    /**
     * 流程id
     */
    @Column(name = "process_id")
    private String processId;

    /**
     * 到期日
     */
    @Column(name = "expire_date")
    private String expireDate;

    /**
     * 流程审批状态
     */
    @Column(name = "approval_status")
    private String approvalStatus;

    /**
     * 流程审批时间
     */
    @Column(name = "approval_time")
    private Date approvalTime;

    /**
     * 管理ID
     */
    @Column(name = "manager_id")
    private String managerId;

    /**
     * 合同主体编码
     */
    @Column(name = "subject_of_contract_id")
    private String subjectOfContractId;

    /**
     * 公司编码
     */
    @Column(name = "organ_id")
    @GeneratedValue(generator = "JDBC")
    private String organId;

    /**
     * @return reminder_id
     */
    public String getReminderId() {
        return reminderId;
    }

    /**
     * @param reminderId
     */
    public void setReminderId(String reminderId) {
        this.reminderId = reminderId;
    }

    /**
     * 获取业务单元ID
     *
     * @return commercian_unit_id - 业务单元ID
     */
    public String getCommercianUnitId() {
        return commercianUnitId;
    }

    /**
     * 设置业务单元ID
     *
     * @param commercianUnitId 业务单元ID
     */
    public void setCommercianUnitId(String commercianUnitId) {
        this.commercianUnitId = commercianUnitId;
    }

    /**
     * 获取业务单元
     *
     * @return commercian_unit - 业务单元
     */
    public String getCommercianUnit() {
        return commercianUnit;
    }

    /**
     * 设置业务单元
     *
     * @param commercianUnit 业务单元
     */
    public void setCommercianUnit(String commercianUnit) {
        this.commercianUnit = commercianUnit;
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
     * 获取到期天数
     *
     * @return days - 到期天数
     */
    public Long getDays() {
        return days;
    }

    /**
     * 设置到期天数
     *
     * @param days 到期天数
     */
    public void setDays(Long days) {
        this.days = days;
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
     * 获取公司名称，合同主体
     *
     * @return organ_name - 公司名称，合同主体
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * 设置公司名称，合同主体
     *
     * @param organName 公司名称，合同主体
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * 获取保函负责人
     *
     * @return responsible_person_name - 保函负责人
     */
    public String getResponsiblePersonName() {
        return responsiblePersonName;
    }

    /**
     * 设置保函负责人
     *
     * @param responsiblePersonName 保函负责人
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
     * 获取保函负责人ID
     *
     * @return responsible_person_id - 保函负责人ID
     */
    public String getResponsiblePersonId() {
        return responsiblePersonId;
    }

    /**
     * 设置保函负责人ID
     *
     * @param responsiblePersonId 保函负责人ID
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
     * 获取流程id
     *
     * @return process_id - 流程id
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * 设置流程id
     *
     * @param processId 流程id
     */
    public void setProcessId(String processId) {
        this.processId = processId;
    }

    /**
     * 获取到期日
     *
     * @return expire_date - 到期日
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * 设置到期日
     *
     * @param expireDate 到期日
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * 获取流程审批状态
     *
     * @return approval_status - 流程审批状态
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * 设置流程审批状态
     *
     * @param approvalStatus 流程审批状态
     */
    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    /**
     * 获取流程审批时间
     *
     * @return approval_time - 流程审批时间
     */
    public Date getApprovalTime() {
        return approvalTime;
    }

    /**
     * 设置流程审批时间
     *
     * @param approvalTime 流程审批时间
     */
    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    /**
     * 获取管理ID
     *
     * @return manager_id - 管理ID
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * 设置管理ID
     *
     * @param managerId 管理ID
     */
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    /**
     * 获取合同主体编码
     *
     * @return subject_of_contract_id - 合同主体编码
     */
    public String getSubjectOfContractId() {
        return subjectOfContractId;
    }

    /**
     * 设置合同主体编码
     *
     * @param subjectOfContractId 合同主体编码
     */
    public void setSubjectOfContractId(String subjectOfContractId) {
        this.subjectOfContractId = subjectOfContractId;
    }

    /**
     * 获取公司编码
     *
     * @return organ_id - 公司编码
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置公司编码
     *
     * @param organId 公司编码
     */
    public void setOrganId(String organId) {
        this.organId = organId;
    }
}