package cn.com.personnel.ercp.pi.persistence.entity.server;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_plan_info")
public class ServerPlanInfo {
    @Id
    @Column(name = "plan_id")
    @GeneratedValue(generator = "JDBC")
    private String planId;

    @Column(name = "sta_id")
    private String staId;

    @Column(name = "child_id")
    private String childId;

    @Column(name = "plan_no")
    private String planNo;

    @Column(name = "child_name")
    private String childName;

    @Column(name = "problem_escription")
    private String problemEscription;

    @Column(name = "expected_goal")
    private String expectedGoal;

    @Column(name = "specific_strategies_and_methods")
    private String specificStrategiesAndMethods;

    private String executor;

    @Column(name = "expected_execution")
    private String expectedExecution;

    @Column(name = "implementation_status")
    private String implementationStatus;

    private String remark;

    @Column(name = "plan_date")
    private String planDate;

    private String receiver;

    private String isdelete;

    private String status;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;

    @Override
    public String toString() {
        return "ServerPlanInfo{" +
                "planId='" + planId + '\'' +
                ", staId='" + staId + '\'' +
                ", childId='" + childId + '\'' +
                ", planNo='" + planNo + '\'' +
                ", childName='" + childName + '\'' +
                ", problemEscription='" + problemEscription + '\'' +
                ", expectedGoal='" + expectedGoal + '\'' +
                ", specificStrategiesAndMethods='" + specificStrategiesAndMethods + '\'' +
                ", executor='" + executor + '\'' +
                ", expectedExecution='" + expectedExecution + '\'' +
                ", implementationStatus='" + implementationStatus + '\'' +
                ", remark='" + remark + '\'' +
                ", planDate='" + planDate + '\'' +
                ", receiver='" + receiver + '\'' +
                ", isdelete='" + isdelete + '\'' +
                ", status='" + status + '\'' +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", updator='" + updator + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }

    /**
     * @return plan_id
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * @param planId
     */
    public void setPlanId(String planId) {
        this.planId = planId;
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
     * @return plan_no
     */
    public String getPlanNo() {
        return planNo;
    }

    /**
     * @param planNo
     */
    public void setPlanNo(String planNo) {
        this.planNo = planNo;
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
     * @return problem_escription
     */
    public String getProblemEscription() {
        return problemEscription;
    }

    /**
     * @param problemEscription
     */
    public void setProblemEscription(String problemEscription) {
        this.problemEscription = problemEscription;
    }

    /**
     * @return expected_goal
     */
    public String getExpectedGoal() {
        return expectedGoal;
    }

    /**
     * @param expectedGoal
     */
    public void setExpectedGoal(String expectedGoal) {
        this.expectedGoal = expectedGoal;
    }

    /**
     * @return specific_strategies_and_methods
     */
    public String getSpecificStrategiesAndMethods() {
        return specificStrategiesAndMethods;
    }

    /**
     * @param specificStrategiesAndMethods
     */
    public void setSpecificStrategiesAndMethods(String specificStrategiesAndMethods) {
        this.specificStrategiesAndMethods = specificStrategiesAndMethods;
    }

    /**
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    /**
     * @param executor
     */
    public void setExecutor(String executor) {
        this.executor = executor;
    }

    /**
     * @return expected_execution
     */
    public String getExpectedExecution() {
        return expectedExecution;
    }

    /**
     * @param expectedExecution
     */
    public void setExpectedExecution(String expectedExecution) {
        this.expectedExecution = expectedExecution;
    }

    /**
     * @return implementation_status
     */
    public String getImplementationStatus() {
        return implementationStatus;
    }

    /**
     * @param implementationStatus
     */
    public void setImplementationStatus(String implementationStatus) {
        this.implementationStatus = implementationStatus;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return plan_date
     */
    public String getPlanDate() {
        return planDate;
    }

    /**
     * @param planDate
     */
    public void setPlanDate(String planDate) {
        this.planDate = planDate;
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