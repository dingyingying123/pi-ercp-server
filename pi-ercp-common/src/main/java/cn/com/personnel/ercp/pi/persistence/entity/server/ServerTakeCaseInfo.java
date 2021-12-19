package cn.com.personnel.ercp.pi.persistence.entity.server;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_take_case_info")
public class ServerTakeCaseInfo {
    @Id
    @Column(name = "case_id")
    @GeneratedValue(generator = "JDBC")
    private String caseId;

    @Column(name = "child_id")
    private String childId;

    @Column(name = "case_no")
    private String caseNo;

    @Column(name = "child_name")
    private String childName;

    private String male;

    private String age;

    @Column(name = "case_source")
    private String caseSource;

    @Column(name = "referral_source")
    private String referralSource;

    @Column(name = "referral_reason")
    private String referralReason;

    @Column(name = "problems_and_needs_faced")
    private String problemsAndNeedsFaced;

    @Column(name = "case_date")
    private String caseDate;

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
     * @return case_id
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * @param caseId
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId;
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
     * @return case_no
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * @param caseNo
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
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
     * @return male
     */
    public String getMale() {
        return male;
    }

    /**
     * @param male
     */
    public void setMale(String male) {
        this.male = male;
    }

    /**
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return case_source
     */
    public String getCaseSource() {
        return caseSource;
    }

    /**
     * @param caseSource
     */
    public void setCaseSource(String caseSource) {
        this.caseSource = caseSource;
    }

    /**
     * @return referral_source
     */
    public String getReferralSource() {
        return referralSource;
    }

    /**
     * @param referralSource
     */
    public void setReferralSource(String referralSource) {
        this.referralSource = referralSource;
    }

    /**
     * @return referral_reason
     */
    public String getReferralReason() {
        return referralReason;
    }

    /**
     * @param referralReason
     */
    public void setReferralReason(String referralReason) {
        this.referralReason = referralReason;
    }

    /**
     * @return problems_and_needs_faced
     */
    public String getProblemsAndNeedsFaced() {
        return problemsAndNeedsFaced;
    }

    /**
     * @param problemsAndNeedsFaced
     */
    public void setProblemsAndNeedsFaced(String problemsAndNeedsFaced) {
        this.problemsAndNeedsFaced = problemsAndNeedsFaced;
    }

    /**
     * @return case_date
     */
    public String getCaseDate() {
        return caseDate;
    }

    /**
     * @param caseDate
     */
    public void setCaseDate(String caseDate) {
        this.caseDate = caseDate;
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