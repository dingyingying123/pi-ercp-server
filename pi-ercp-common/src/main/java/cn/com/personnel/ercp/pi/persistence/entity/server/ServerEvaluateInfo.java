package cn.com.personnel.ercp.pi.persistence.entity.server;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_evaluate_info")
public class ServerEvaluateInfo {
    @Id
    @Column(name = "evaluate_id")
    @GeneratedValue(generator = "JDBC")
    private String evaluateId;

    @Column(name = "child_id")
    private String childId;

    @Column(name = "sta_id")
    private String staId;

    @Column(name = "evaluate_no")
    private String evaluateNo;

    @Column(name = "evaluate_date")
    private String evaluateDate;

    @Column(name = "child_name")
    private String childName;

    @Column(name = "child_male")
    private String childMale;

    @Column(name = "child_age")
    private String childAge;

    @Column(name = "case_description")
    private String caseDescription;

    @Column(name = "service_goal")
    private String serviceGoal;

    @Column(name = "service_start_date")
    private String serviceStartDate;

    @Column(name = "service_end_date")
    private String serviceEndDate;

    @Column(name = "services_provided_and_progress")
    private String servicesProvidedAndProgress;

    @Column(name = "current_status_children")
    private String currentStatusChildren;

    @Column(name = "case_closed_situation")
    private String caseClosedSituation;

    @Column(name = "case_closed_situation_other")
    private String caseClosedSituationOther;

    @Column(name = "intervention_work_reflection")
    private String interventionWorkReflection;

    @Column(name = "track_service_plan")
    private String trackServicePlan;

    @Column(name = "help_received")
    private String helpReceived;

    @Column(name = "help_received_other")
    private String helpReceivedOther;

    @Column(name = "is_meets_expectations")
    private String isMeetsExpectations;

    @Column(name = "supervisory_opinion")
    private String supervisoryOpinion;

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
     * @return evaluate_id
     */
    public String getEvaluateId() {
        return evaluateId;
    }

    /**
     * @param evaluateId
     */
    public void setEvaluateId(String evaluateId) {
        this.evaluateId = evaluateId;
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
     * @return evaluate_no
     */
    public String getEvaluateNo() {
        return evaluateNo;
    }

    /**
     * @param evaluateNo
     */
    public void setEvaluateNo(String evaluateNo) {
        this.evaluateNo = evaluateNo;
    }

    /**
     * @return evaluate_date
     */
    public String getEvaluateDate() {
        return evaluateDate;
    }

    /**
     * @param evaluateDate
     */
    public void setEvaluateDate(String evaluateDate) {
        this.evaluateDate = evaluateDate;
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
     * @return child_male
     */
    public String getChildMale() {
        return childMale;
    }

    /**
     * @param childMale
     */
    public void setChildMale(String childMale) {
        this.childMale = childMale;
    }

    /**
     * @return child_age
     */
    public String getChildAge() {
        return childAge;
    }

    /**
     * @param childAge
     */
    public void setChildAge(String childAge) {
        this.childAge = childAge;
    }

    /**
     * @return case_description
     */
    public String getCaseDescription() {
        return caseDescription;
    }

    /**
     * @param caseDescription
     */
    public void setCaseDescription(String caseDescription) {
        this.caseDescription = caseDescription;
    }

    /**
     * @return service_goal
     */
    public String getServiceGoal() {
        return serviceGoal;
    }

    /**
     * @param serviceGoal
     */
    public void setServiceGoal(String serviceGoal) {
        this.serviceGoal = serviceGoal;
    }

    /**
     * @return service_start_date
     */
    public String getServiceStartDate() {
        return serviceStartDate;
    }

    /**
     * @param serviceStartDate
     */
    public void setServiceStartDate(String serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    /**
     * @return service_end_date
     */
    public String getServiceEndDate() {
        return serviceEndDate;
    }

    /**
     * @param serviceEndDate
     */
    public void setServiceEndDate(String serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    /**
     * @return services_provided_and_progress
     */
    public String getServicesProvidedAndProgress() {
        return servicesProvidedAndProgress;
    }

    /**
     * @param servicesProvidedAndProgress
     */
    public void setServicesProvidedAndProgress(String servicesProvidedAndProgress) {
        this.servicesProvidedAndProgress = servicesProvidedAndProgress;
    }

    /**
     * @return current_status_children
     */
    public String getCurrentStatusChildren() {
        return currentStatusChildren;
    }

    /**
     * @param currentStatusChildren
     */
    public void setCurrentStatusChildren(String currentStatusChildren) {
        this.currentStatusChildren = currentStatusChildren;
    }

    /**
     * @return case_closed_situation
     */
    public String getCaseClosedSituation() {
        return caseClosedSituation;
    }

    /**
     * @param caseClosedSituation
     */
    public void setCaseClosedSituation(String caseClosedSituation) {
        this.caseClosedSituation = caseClosedSituation;
    }

    /**
     * @return case_closed_situation_other
     */
    public String getCaseClosedSituationOther() {
        return caseClosedSituationOther;
    }

    /**
     * @param caseClosedSituationOther
     */
    public void setCaseClosedSituationOther(String caseClosedSituationOther) {
        this.caseClosedSituationOther = caseClosedSituationOther;
    }

    /**
     * @return intervention_work_reflection
     */
    public String getInterventionWorkReflection() {
        return interventionWorkReflection;
    }

    /**
     * @param interventionWorkReflection
     */
    public void setInterventionWorkReflection(String interventionWorkReflection) {
        this.interventionWorkReflection = interventionWorkReflection;
    }

    /**
     * @return track_service_plan
     */
    public String getTrackServicePlan() {
        return trackServicePlan;
    }

    /**
     * @param trackServicePlan
     */
    public void setTrackServicePlan(String trackServicePlan) {
        this.trackServicePlan = trackServicePlan;
    }

    /**
     * @return help_received
     */
    public String getHelpReceived() {
        return helpReceived;
    }

    /**
     * @param helpReceived
     */
    public void setHelpReceived(String helpReceived) {
        this.helpReceived = helpReceived;
    }

    /**
     * @return help_received_other
     */
    public String getHelpReceivedOther() {
        return helpReceivedOther;
    }

    /**
     * @param helpReceivedOther
     */
    public void setHelpReceivedOther(String helpReceivedOther) {
        this.helpReceivedOther = helpReceivedOther;
    }

    /**
     * @return is_meets_expectations
     */
    public String getIsMeetsExpectations() {
        return isMeetsExpectations;
    }

    /**
     * @param isMeetsExpectations
     */
    public void setIsMeetsExpectations(String isMeetsExpectations) {
        this.isMeetsExpectations = isMeetsExpectations;
    }

    /**
     * @return supervisory_opinion
     */
    public String getSupervisoryOpinion() {
        return supervisoryOpinion;
    }

    /**
     * @param supervisoryOpinion
     */
    public void setSupervisoryOpinion(String supervisoryOpinion) {
        this.supervisoryOpinion = supervisoryOpinion;
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