package cn.com.personnel.ercp.pi.persistence.entity.server;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_case_closed_info")
public class ServerCaseClosedInfo {
    @Id
    @Column(name = "close_id")
    @GeneratedValue(generator = "JDBC")
    private String closeId;

    @Column(name = "child_id")
    private String childId;

    @Column(name = "sta_id")
    private String staId;

    @Column(name = "close_no")
    private String closeNo;

    @Column(name = "close_date")
    private String closeDate;

    @Column(name = "child_name")
    private String childName;

    @Column(name = "child_male")
    private String childMale;

    @Column(name = "child_age")
    private String childAge;

    @Column(name = "referral_application_date")
    private String referralApplicationDate;

    @Column(name = "filing_date")
    private String filingDate;

    @Column(name = "case_closed_date")
    private String caseClosedDate;

    @Column(name = "case_nature_and_brief_description")
    private String caseNatureAndBriefDescription;

    @Column(name = "coaching_goals")
    private String coachingGoals;

    @Column(name = "services_provided_and_case_progress")
    private String servicesProvidedAndCaseProgress;

    @Column(name = "current_status_service_objects")
    private String currentStatusServiceObjects;

    @Column(name = "reason_for_closing")
    private String reasonForClosing;

    @Column(name = "reason_for_closing_directions")
    private String reasonForClosingDirections;

    @Column(name = "do_you_know_end")
    private String doYouKnowEnd;

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
     * @return close_id
     */
    public String getCloseId() {
        return closeId;
    }

    /**
     * @param closeId
     */
    public void setCloseId(String closeId) {
        this.closeId = closeId;
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
     * @return close_no
     */
    public String getCloseNo() {
        return closeNo;
    }

    /**
     * @param closeNo
     */
    public void setCloseNo(String closeNo) {
        this.closeNo = closeNo;
    }

    /**
     * @return close_date
     */
    public String getCloseDate() {
        return closeDate;
    }

    /**
     * @param closeDate
     */
    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
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
     * @return referral_application_date
     */
    public String getReferralApplicationDate() {
        return referralApplicationDate;
    }

    /**
     * @param referralApplicationDate
     */
    public void setReferralApplicationDate(String referralApplicationDate) {
        this.referralApplicationDate = referralApplicationDate;
    }

    /**
     * @return filing_date
     */
    public String getFilingDate() {
        return filingDate;
    }

    /**
     * @param filingDate
     */
    public void setFilingDate(String filingDate) {
        this.filingDate = filingDate;
    }

    /**
     * @return case_closed_date
     */
    public String getCaseClosedDate() {
        return caseClosedDate;
    }

    /**
     * @param caseClosedDate
     */
    public void setCaseClosedDate(String caseClosedDate) {
        this.caseClosedDate = caseClosedDate;
    }

    /**
     * @return case_nature_and_brief_description
     */
    public String getCaseNatureAndBriefDescription() {
        return caseNatureAndBriefDescription;
    }

    /**
     * @param caseNatureAndBriefDescription
     */
    public void setCaseNatureAndBriefDescription(String caseNatureAndBriefDescription) {
        this.caseNatureAndBriefDescription = caseNatureAndBriefDescription;
    }

    /**
     * @return coaching_goals
     */
    public String getCoachingGoals() {
        return coachingGoals;
    }

    /**
     * @param coachingGoals
     */
    public void setCoachingGoals(String coachingGoals) {
        this.coachingGoals = coachingGoals;
    }

    /**
     * @return services_provided_and_case_progress
     */
    public String getServicesProvidedAndCaseProgress() {
        return servicesProvidedAndCaseProgress;
    }

    /**
     * @param servicesProvidedAndCaseProgress
     */
    public void setServicesProvidedAndCaseProgress(String servicesProvidedAndCaseProgress) {
        this.servicesProvidedAndCaseProgress = servicesProvidedAndCaseProgress;
    }

    /**
     * @return current_status_service_objects
     */
    public String getCurrentStatusServiceObjects() {
        return currentStatusServiceObjects;
    }

    /**
     * @param currentStatusServiceObjects
     */
    public void setCurrentStatusServiceObjects(String currentStatusServiceObjects) {
        this.currentStatusServiceObjects = currentStatusServiceObjects;
    }

    /**
     * @return reason_for_closing
     */
    public String getReasonForClosing() {
        return reasonForClosing;
    }

    /**
     * @param reasonForClosing
     */
    public void setReasonForClosing(String reasonForClosing) {
        this.reasonForClosing = reasonForClosing;
    }

    /**
     * @return reason_for_closing_directions
     */
    public String getReasonForClosingDirections() {
        return reasonForClosingDirections;
    }

    /**
     * @param reasonForClosingDirections
     */
    public void setReasonForClosingDirections(String reasonForClosingDirections) {
        this.reasonForClosingDirections = reasonForClosingDirections;
    }

    /**
     * @return do_you_know_end
     */
    public String getDoYouKnowEnd() {
        return doYouKnowEnd;
    }

    /**
     * @param doYouKnowEnd
     */
    public void setDoYouKnowEnd(String doYouKnowEnd) {
        this.doYouKnowEnd = doYouKnowEnd;
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