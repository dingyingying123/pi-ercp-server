package cn.com.personnel.ercp.pi.persistence.entity.server;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_interview_intervention_info")
public class ServerInterviewInterventionInfo {
    @Id
    @Column(name = "view_id")
    @GeneratedValue(generator = "JDBC")
    private String viewId;

    @Column(name = "sta_id")
    private String staId;

    @Column(name = "child_id")
    private String childId;

    @Column(name = "view_no")
    private String viewNo;

    @Column(name = "child_name")
    private String childName;

    @Column(name = "view_date")
    private String viewDate;

    @Column(name = "date_time")
    private String dateTime;

    private String place;

    private String target;

    @Column(name = "main_content")
    private String mainContent;

    @Column(name = "evaluation_and_reflection")
    private String evaluationAndReflection;

    @Column(name = "follow_up_plan")
    private String followUpPlan;

    @Column(name = "supervisor_opinion")
    private String supervisorOpinion;

    private String receiver;

    private String isdelete;

    private String status;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return view_id
     */
    public String getViewId() {
        return viewId;
    }

    /**
     * @param viewId
     */
    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    /**
     * @return sta_id
     */
    public String getStaId() {
        return staId;
    }

    /**
     * @param staId
     */
    public void setStaId(String staId) {
        this.staId = staId;
    }

    /**
     * @return child_id
     */
    public String getChildId() {
        return childId;
    }

    /**
     * @param childId
     */
    public void setChildId(String childId) {
        this.childId = childId;
    }

    /**
     * @return view_no
     */
    public String getViewNo() {
        return viewNo;
    }

    /**
     * @param viewNo
     */
    public void setViewNo(String viewNo) {
        this.viewNo = viewNo;
    }

    /**
     * @return child_name
     */
    public String getChildName() {
        return childName;
    }

    /**
     * @param childName
     */
    public void setChildName(String childName) {
        this.childName = childName;
    }

    /**
     * @return view_date
     */
    public String getViewDate() {
        return viewDate;
    }

    /**
     * @param viewDate
     */
    public void setViewDate(String viewDate) {
        this.viewDate = viewDate;
    }

    /**
     * @return date_time
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return target;
    }

    /**
     * @param target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * @return main_content
     */
    public String getMainContent() {
        return mainContent;
    }

    /**
     * @param mainContent
     */
    public void setMainContent(String mainContent) {
        this.mainContent = mainContent;
    }

    /**
     * @return evaluation_and_reflection
     */
    public String getEvaluationAndReflection() {
        return evaluationAndReflection;
    }

    /**
     * @param evaluationAndReflection
     */
    public void setEvaluationAndReflection(String evaluationAndReflection) {
        this.evaluationAndReflection = evaluationAndReflection;
    }

    /**
     * @return follow_up_plan
     */
    public String getFollowUpPlan() {
        return followUpPlan;
    }

    /**
     * @param followUpPlan
     */
    public void setFollowUpPlan(String followUpPlan) {
        this.followUpPlan = followUpPlan;
    }

    /**
     * @return supervisor_opinion
     */
    public String getSupervisorOpinion() {
        return supervisorOpinion;
    }

    /**
     * @param supervisorOpinion
     */
    public void setSupervisorOpinion(String supervisorOpinion) {
        this.supervisorOpinion = supervisorOpinion;
    }

    /**
     * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * @param receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * @return isdelete
     */
    public String getIsdelete() {
        return isdelete;
    }

    /**
     * @param isdelete
     */
    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return updator
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}