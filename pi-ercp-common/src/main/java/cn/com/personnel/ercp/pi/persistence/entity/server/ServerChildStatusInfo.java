package cn.com.personnel.ercp.pi.persistence.entity.server;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_child_status_info")
public class ServerChildStatusInfo {
    @Id
    @Column(name = "sta_id")
    @GeneratedValue(generator = "JDBC")
    private String staId;

    @Column(name = "child_id")
    private String childId;

    @Column(name = "child_name")
    private String childName;

    @Column(name = "case_status")
    private String caseStatus;

    @Column(name = "estimate_status")
    private String estimateStatus;

    @Column(name = "plan_status")
    private String planStatus;

    @Column(name = "intervention_status")
    private String interventionStatus;

    @Column(name = "evaluate_status")
    private String evaluateStatus;

    @Column(name = "case_closed_status")
    private String caseClosedStatus;

    private String isdelete;

    private String status;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;

    private String area;

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
     * @return case_status
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * @param caseStatus
     */
    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    /**
     * @return estimate_status
     */
    public String getEstimateStatus() {
        return estimateStatus;
    }

    /**
     * @param estimateStatus
     */
    public void setEstimateStatus(String estimateStatus) {
        this.estimateStatus = estimateStatus;
    }

    /**
     * @return plan_status
     */
    public String getPlanStatus() {
        return planStatus;
    }

    /**
     * @param planStatus
     */
    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
    }

    /**
     * @return intervention_status
     */
    public String getInterventionStatus() {
        return interventionStatus;
    }

    /**
     * @param interventionStatus
     */
    public void setInterventionStatus(String interventionStatus) {
        this.interventionStatus = interventionStatus;
    }

    /**
     * @return evaluate_status
     */
    public String getEvaluateStatus() {
        return evaluateStatus;
    }

    /**
     * @param evaluateStatus
     */
    public void setEvaluateStatus(String evaluateStatus) {
        this.evaluateStatus = evaluateStatus;
    }

    /**
     * @return case_closed_status
     */
    public String getCaseClosedStatus() {
        return caseClosedStatus;
    }

    /**
     * @param caseClosedStatus
     */
    public void setCaseClosedStatus(String caseClosedStatus) {
        this.caseClosedStatus = caseClosedStatus;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}