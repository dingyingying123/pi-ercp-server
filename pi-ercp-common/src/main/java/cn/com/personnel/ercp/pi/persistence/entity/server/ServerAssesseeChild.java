package cn.com.personnel.ercp.pi.persistence.entity.server;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_assessee_child")
public class ServerAssesseeChild {
    @Id
    @Column(name = "assessee_id")
    @GeneratedValue(generator = "JDBC")
    private String assesseeId;

    @Column(name = "risk_id")
    private String riskId;

    @Column(name = "est_id")
    private String estId;

    @Column(name = "child_name")
    private String childName;

    @Column(name = "child_age")
    private String childAge;

    @Column(name = "child_current_school")
    private String childCurrentSchool;

    private String isdelete;

    private String status;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return assessee_id
     */
    public String getAssesseeId() {
        return assesseeId;
    }

    /**
     * @param assesseeId
     */
    public void setAssesseeId(String assesseeId) {
        this.assesseeId = assesseeId;
    }

    /**
     * @return risk_id
     */
    public String getRiskId() {
        return riskId;
    }

    /**
     * @param riskId
     */
    public void setRiskId(String riskId) {
        this.riskId = riskId;
    }

    /**
     * @return est_id
     */
    public String getEstId() {
        return estId;
    }

    /**
     * @param estId
     */
    public void setEstId(String estId) {
        this.estId = estId;
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
     * @return child_current_school
     */
    public String getChildCurrentSchool() {
        return childCurrentSchool;
    }

    /**
     * @param childCurrentSchool
     */
    public void setChildCurrentSchool(String childCurrentSchool) {
        this.childCurrentSchool = childCurrentSchool;
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