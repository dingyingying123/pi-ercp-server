package cn.com.personnel.ercp.pi.persistence.entity.credit.guarantee;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_guarantee_statetrack")
public class FssGuaranteeStatetrack {
    /**
     * 状态跟踪ID
     */
    @Id
    @Column(name = "statetrack_id")
    @GeneratedValue(generator = "JDBC")
    private String statetrackId;

    /**
     * 保函管理ID
     */
    @Column(name = "s_id")
    private String sId;

    /**
     * 流程主键
     */
    @Column(name = "frev_id")
    private String frevId;

    /**
     * 生效日期
     */
    @Column(name = "effective_date")
    private String effectiveDate;

    /**
     * 截止日
     */
    private String deadline;

    /**
     * 未撤销原因
     */
    @Column(name = "no_cancel_cause")
    private String noCancelCause;

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
     * 更改人ID
     */
    @Column(name = "change_person_id")
    private String changePersonId;

    /**
     * 更改人
     */
    @Column(name = "change_person")
    private String changePerson;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建人ID
     */
    @Column(name = "creator_id")
    private String creatorId;

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
     * 更新人ID
     */
    @Column(name = "updater_id")
    private String updaterId;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取状态跟踪ID
     *
     * @return statetrack_id - 状态跟踪ID
     */
    public String getStatetrackId() {
        return statetrackId;
    }

    /**
     * 设置状态跟踪ID
     *
     * @param statetrackId 状态跟踪ID
     */
    public void setStatetrackId(String statetrackId) {
        this.statetrackId = statetrackId;
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
     * 获取流程主键
     *
     * @return frev_id - 流程主键
     */
    public String getFrevId() {
        return frevId;
    }

    /**
     * 设置流程主键
     *
     * @param frevId 流程主键
     */
    public void setFrevId(String frevId) {
        this.frevId = frevId;
    }

    /**
     * 获取生效日期
     *
     * @return effective_date - 生效日期
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置生效日期
     *
     * @param effectiveDate 生效日期
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
     * 获取未撤销原因
     *
     * @return no_cancel_cause - 未撤销原因
     */
    public String getNoCancelCause() {
        return noCancelCause;
    }

    /**
     * 设置未撤销原因
     *
     * @param noCancelCause 未撤销原因
     */
    public void setNoCancelCause(String noCancelCause) {
        this.noCancelCause = noCancelCause;
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
     * 获取更改人ID
     *
     * @return change_person_id - 更改人ID
     */
    public String getChangePersonId() {
        return changePersonId;
    }

    /**
     * 设置更改人ID
     *
     * @param changePersonId 更改人ID
     */
    public void setChangePersonId(String changePersonId) {
        this.changePersonId = changePersonId;
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
     * 获取创建人ID
     *
     * @return creator_id - 创建人ID
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人ID
     *
     * @param creatorId 创建人ID
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
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
     * 获取更新人ID
     *
     * @return updater_id - 更新人ID
     */
    public String getUpdaterId() {
        return updaterId;
    }

    /**
     * 设置更新人ID
     *
     * @param updaterId 更新人ID
     */
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
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
}