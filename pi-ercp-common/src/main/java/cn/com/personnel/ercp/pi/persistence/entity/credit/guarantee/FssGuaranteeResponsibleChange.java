package cn.com.personnel.ercp.pi.persistence.entity.credit.guarantee;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_guarantee_responsible_change")
public class FssGuaranteeResponsibleChange {
    /**
     * 变更负责人ID
     */
    @Id
    @Column(name = "rc_id")
    @GeneratedValue(generator = "JDBC")
    private String rcId;

    /**
     * 保函ID
     */
    @Column(name = "guarantee_id")
    private String guaranteeId;

    /**
     * 保函管理ID
     */
    @Column(name = "s_id")
    private String sId;

    /**
     * 保函负责人ID
     */
    @Column(name = "responsible_person_id")
    private String responsiblePersonId;

    /**
     * 保函负责人姓名
     */
    @Column(name = "responsible_person_name")
    private String responsiblePersonName;

    /**
     * 保函负责人部门
     */
    @Column(name = "responsible_person_dept")
    private String responsiblePersonDept;

    /**
     * 保函负责人部门ID
     */
    @Column(name = "responsible_person_dept_id")
    private String responsiblePersonDeptId;

    /**
     * 原保函负责人ID
     */
    @Column(name = "old_responsible_person_id")
    private String oldResponsiblePersonId;

    /**
     * 原保函负责人姓名
     */
    @Column(name = "old_responsible_person_name")
    private String oldResponsiblePersonName;

    /**
     * 原保函负责人部门
     */
    @Column(name = "old_responsible_person_dept")
    private String oldResponsiblePersonDept;

    /**
     * 原保函负责人部门ID
     */
    @Column(name = "old_responsible_person_dept_id")
    private String oldResponsiblePersonDeptId;

    /**
     * 审批状态
     */
    @Column(name = "approve_status")
    private String approveStatus;

    /**
     * 审批时间
     */
    @Column(name = "approve_time")
    private String approveTime;

    /**
     * 预留
     */
    private String reserve;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 生效日
     */
    @Column(name = "effective_date")
    private String effectiveDate;

    /**
     * 截止日
     */
    private String deadline;

    /**
     * 更改人
     */
    @Column(name = "change_person")
    private String changePerson;

    /**
     * 获取变更负责人ID
     *
     * @return rc_id - 变更负责人ID
     */
    public String getRcId() {
        return rcId;
    }

    /**
     * 设置变更负责人ID
     *
     * @param rcId 变更负责人ID
     */
    public void setRcId(String rcId) {
        this.rcId = rcId;
    }

    /**
     * 获取保函ID
     *
     * @return guarantee_id - 保函ID
     */
    public String getGuaranteeId() {
        return guaranteeId;
    }

    /**
     * 设置保函ID
     *
     * @param guaranteeId 保函ID
     */
    public void setGuaranteeId(String guaranteeId) {
        this.guaranteeId = guaranteeId;
    }

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
     * 获取保函负责人姓名
     *
     * @return responsible_person_name - 保函负责人姓名
     */
    public String getResponsiblePersonName() {
        return responsiblePersonName;
    }

    /**
     * 设置保函负责人姓名
     *
     * @param responsiblePersonName 保函负责人姓名
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
     * 获取原保函负责人ID
     *
     * @return old_responsible_person_id - 原保函负责人ID
     */
    public String getOldResponsiblePersonId() {
        return oldResponsiblePersonId;
    }

    /**
     * 设置原保函负责人ID
     *
     * @param oldResponsiblePersonId 原保函负责人ID
     */
    public void setOldResponsiblePersonId(String oldResponsiblePersonId) {
        this.oldResponsiblePersonId = oldResponsiblePersonId;
    }

    /**
     * 获取原保函负责人姓名
     *
     * @return old_responsible_person_name - 原保函负责人姓名
     */
    public String getOldResponsiblePersonName() {
        return oldResponsiblePersonName;
    }

    /**
     * 设置原保函负责人姓名
     *
     * @param oldResponsiblePersonName 原保函负责人姓名
     */
    public void setOldResponsiblePersonName(String oldResponsiblePersonName) {
        this.oldResponsiblePersonName = oldResponsiblePersonName;
    }

    /**
     * 获取原保函负责人部门
     *
     * @return old_responsible_person_dept - 原保函负责人部门
     */
    public String getOldResponsiblePersonDept() {
        return oldResponsiblePersonDept;
    }

    /**
     * 设置原保函负责人部门
     *
     * @param oldResponsiblePersonDept 原保函负责人部门
     */
    public void setOldResponsiblePersonDept(String oldResponsiblePersonDept) {
        this.oldResponsiblePersonDept = oldResponsiblePersonDept;
    }

    /**
     * 获取原保函负责人部门ID
     *
     * @return old_responsible_person_dept_id - 原保函负责人部门ID
     */
    public String getOldResponsiblePersonDeptId() {
        return oldResponsiblePersonDeptId;
    }

    /**
     * 设置原保函负责人部门ID
     *
     * @param oldResponsiblePersonDeptId 原保函负责人部门ID
     */
    public void setOldResponsiblePersonDeptId(String oldResponsiblePersonDeptId) {
        this.oldResponsiblePersonDeptId = oldResponsiblePersonDeptId;
    }

    /**
     * 获取审批状态
     *
     * @return approve_status - 审批状态
     */
    public String getApproveStatus() {
        return approveStatus;
    }

    /**
     * 设置审批状态
     *
     * @param approveStatus 审批状态
     */
    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    /**
     * 获取审批时间
     *
     * @return approve_time - 审批时间
     */
    public String getApproveTime() {
        return approveTime;
    }

    /**
     * 设置审批时间
     *
     * @param approveTime 审批时间
     */
    public void setApproveTime(String approveTime) {
        this.approveTime = approveTime;
    }

    /**
     * 获取预留
     *
     * @return reserve - 预留
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * 设置预留
     *
     * @param reserve 预留
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
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
     * 获取生效日
     *
     * @return effective_date - 生效日
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置生效日
     *
     * @param effectiveDate 生效日
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * 获取截止日
     *
     * @return deadline - 截止日
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * 设置截止日
     *
     * @param deadline 截止日
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     * 获取更改人
     *
     * @return change_person - 更改人
     */
    public String getChangePerson() {
        return changePerson;
    }

    /**
     * 设置更改人
     *
     * @param changePerson 更改人
     */
    public void setChangePerson(String changePerson) {
        this.changePerson = changePerson;
    }
}