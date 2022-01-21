package cn.com.personnel.ercp.pi.persistence.entity.server;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_estimate_info")
public class ServerEstimateInfo {
    @Id
    @Column(name = "est_id")
    @GeneratedValue(generator = "JDBC")
    private String estId;

    @Column(name = "child_id")
    private String childId;

    @Column(name = "sta_id")
    private String staId;

    @Column(name = "estimate_no")
    private String estimateNo;

    @Column(name = "child_name")
    private String childName;

    @Column(name = "child_male")
    private String childMale;

    @Column(name = "child_age")
    private String childAge;

    @Column(name = "acceptance_reason")
    private String acceptanceReason;

    @Column(name = "family_background")
    private String familyBackground;

    @Column(name = "family_background_instructions")
    private String familyBackgroundInstructions;

    @Column(name = "academic_performance")
    private String academicPerformance;

    @Column(name = "classmate_relationship")
    private String classmateRelationship;

    @Column(name = "teacher_student_relationship")
    private String teacherStudentRelationship;

    private String adaptability;

    @Column(name = "school_performance_instructions")
    private String schoolPerformanceInstructions;

    @Column(name = "peer_relationship_good_or_bad")
    private String peerRelationshipGoodOrBad;

    @Column(name = "peer_time")
    private String peerTime;

    @Column(name = "peer_to_peer_relationship")
    private String peerToPeerRelationship;

    @Column(name = "peer_relationship_instructions")
    private String peerRelationshipInstructions;

    @Column(name = "important_growth_experience")
    private String importantGrowthExperience;

    private String other;

    @Column(name = "behavior_observation_interview")
    private String behaviorObservationInterview;

    @Column(name = "initial_evaluation")
    private String initialEvaluation;

    @Column(name = "problem_diagnosis")
    private String problemDiagnosis;

    @Column(name = "determine_service_method")
    private String determineServiceMethod;

    @Column(name = "determine_service_method_instruction")
    private String determineServiceMethodInstruction;

    @Column(name = "suggest_referral_resources")
    private String suggestReferralResources;

    @Column(name = "suggest_referral_resources_instruction")
    private String suggestReferralResourcesInstruction;

    @Column(name = "estimate_date")
    private String estimateDate;

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
        return "ServerEstimateInfo{" +
                "estId='" + estId + '\'' +
                ", childId='" + childId + '\'' +
                ", staId='" + staId + '\'' +
                ", estimateNo='" + estimateNo + '\'' +
                ", childName='" + childName + '\'' +
                ", childMale='" + childMale + '\'' +
                ", childAge='" + childAge + '\'' +
                ", acceptanceReason='" + acceptanceReason + '\'' +
                ", familyBackground='" + familyBackground + '\'' +
                ", familyBackgroundInstructions='" + familyBackgroundInstructions + '\'' +
                ", academicPerformance='" + academicPerformance + '\'' +
                ", classmateRelationship='" + classmateRelationship + '\'' +
                ", teacherStudentRelationship='" + teacherStudentRelationship + '\'' +
                ", adaptability='" + adaptability + '\'' +
                ", schoolPerformanceInstructions='" + schoolPerformanceInstructions + '\'' +
                ", peerRelationshipGoodOrBad='" + peerRelationshipGoodOrBad + '\'' +
                ", peerTime='" + peerTime + '\'' +
                ", peerToPeerRelationship='" + peerToPeerRelationship + '\'' +
                ", peerRelationshipInstructions='" + peerRelationshipInstructions + '\'' +
                ", importantGrowthExperience='" + importantGrowthExperience + '\'' +
                ", other='" + other + '\'' +
                ", behaviorObservationInterview='" + behaviorObservationInterview + '\'' +
                ", initialEvaluation='" + initialEvaluation + '\'' +
                ", problemDiagnosis='" + problemDiagnosis + '\'' +
                ", determineServiceMethod='" + determineServiceMethod + '\'' +
                ", determineServiceMethodInstruction='" + determineServiceMethodInstruction + '\'' +
                ", suggestReferralResources='" + suggestReferralResources + '\'' +
                ", suggestReferralResourcesInstruction='" + suggestReferralResourcesInstruction + '\'' +
                ", estimateDate='" + estimateDate + '\'' +
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
     * @return estimate_no
     */
    public String getEstimateNo() {
        return estimateNo;
    }

    /**
     * @param estimateNo
     */
    public void setEstimateNo(String estimateNo) {
        this.estimateNo = estimateNo;
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
     * @return acceptance_reason
     */
    public String getAcceptanceReason() {
        return acceptanceReason;
    }

    /**
     * @param acceptanceReason
     */
    public void setAcceptanceReason(String acceptanceReason) {
        this.acceptanceReason = acceptanceReason;
    }

    /**
     * @return family_background
     */
    public String getFamilyBackground() {
        return familyBackground;
    }

    /**
     * @param familyBackground
     */
    public void setFamilyBackground(String familyBackground) {
        this.familyBackground = familyBackground;
    }

    /**
     * @return family_background_instructions
     */
    public String getFamilyBackgroundInstructions() {
        return familyBackgroundInstructions;
    }

    /**
     * @param familyBackgroundInstructions
     */
    public void setFamilyBackgroundInstructions(String familyBackgroundInstructions) {
        this.familyBackgroundInstructions = familyBackgroundInstructions;
    }

    /**
     * @return academic_performance
     */
    public String getAcademicPerformance() {
        return academicPerformance;
    }

    /**
     * @param academicPerformance
     */
    public void setAcademicPerformance(String academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    /**
     * @return classmate_relationship
     */
    public String getClassmateRelationship() {
        return classmateRelationship;
    }

    /**
     * @param classmateRelationship
     */
    public void setClassmateRelationship(String classmateRelationship) {
        this.classmateRelationship = classmateRelationship;
    }

    /**
     * @return teacher_student_relationship
     */
    public String getTeacherStudentRelationship() {
        return teacherStudentRelationship;
    }

    /**
     * @param teacherStudentRelationship
     */
    public void setTeacherStudentRelationship(String teacherStudentRelationship) {
        this.teacherStudentRelationship = teacherStudentRelationship;
    }

    /**
     * @return adaptability
     */
    public String getAdaptability() {
        return adaptability;
    }

    /**
     * @param adaptability
     */
    public void setAdaptability(String adaptability) {
        this.adaptability = adaptability;
    }

    /**
     * @return school_performance_instructions
     */
    public String getSchoolPerformanceInstructions() {
        return schoolPerformanceInstructions;
    }

    /**
     * @param schoolPerformanceInstructions
     */
    public void setSchoolPerformanceInstructions(String schoolPerformanceInstructions) {
        this.schoolPerformanceInstructions = schoolPerformanceInstructions;
    }

    /**
     * @return peer_relationship_good_or_bad
     */
    public String getPeerRelationshipGoodOrBad() {
        return peerRelationshipGoodOrBad;
    }

    /**
     * @param peerRelationshipGoodOrBad
     */
    public void setPeerRelationshipGoodOrBad(String peerRelationshipGoodOrBad) {
        this.peerRelationshipGoodOrBad = peerRelationshipGoodOrBad;
    }

    /**
     * @return peer_time
     */
    public String getPeerTime() {
        return peerTime;
    }

    /**
     * @param peerTime
     */
    public void setPeerTime(String peerTime) {
        this.peerTime = peerTime;
    }

    /**
     * @return peer_to_peer_relationship
     */
    public String getPeerToPeerRelationship() {
        return peerToPeerRelationship;
    }

    /**
     * @param peerToPeerRelationship
     */
    public void setPeerToPeerRelationship(String peerToPeerRelationship) {
        this.peerToPeerRelationship = peerToPeerRelationship;
    }

    /**
     * @return peer_relationship_instructions
     */
    public String getPeerRelationshipInstructions() {
        return peerRelationshipInstructions;
    }

    /**
     * @param peerRelationshipInstructions
     */
    public void setPeerRelationshipInstructions(String peerRelationshipInstructions) {
        this.peerRelationshipInstructions = peerRelationshipInstructions;
    }

    /**
     * @return important_growth_experience
     */
    public String getImportantGrowthExperience() {
        return importantGrowthExperience;
    }

    /**
     * @param importantGrowthExperience
     */
    public void setImportantGrowthExperience(String importantGrowthExperience) {
        this.importantGrowthExperience = importantGrowthExperience;
    }

    /**
     * @return other
     */
    public String getOther() {
        return other;
    }

    /**
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }

    /**
     * @return behavior_observation_interview
     */
    public String getBehaviorObservationInterview() {
        return behaviorObservationInterview;
    }

    /**
     * @param behaviorObservationInterview
     */
    public void setBehaviorObservationInterview(String behaviorObservationInterview) {
        this.behaviorObservationInterview = behaviorObservationInterview;
    }

    /**
     * @return initial_evaluation
     */
    public String getInitialEvaluation() {
        return initialEvaluation;
    }

    /**
     * @param initialEvaluation
     */
    public void setInitialEvaluation(String initialEvaluation) {
        this.initialEvaluation = initialEvaluation;
    }

    /**
     * @return problem_diagnosis
     */
    public String getProblemDiagnosis() {
        return problemDiagnosis;
    }

    /**
     * @param problemDiagnosis
     */
    public void setProblemDiagnosis(String problemDiagnosis) {
        this.problemDiagnosis = problemDiagnosis;
    }

    /**
     * @return determine_service_method
     */
    public String getDetermineServiceMethod() {
        return determineServiceMethod;
    }

    /**
     * @param determineServiceMethod
     */
    public void setDetermineServiceMethod(String determineServiceMethod) {
        this.determineServiceMethod = determineServiceMethod;
    }

    /**
     * @return determine_service_method_instruction
     */
    public String getDetermineServiceMethodInstruction() {
        return determineServiceMethodInstruction;
    }

    /**
     * @param determineServiceMethodInstruction
     */
    public void setDetermineServiceMethodInstruction(String determineServiceMethodInstruction) {
        this.determineServiceMethodInstruction = determineServiceMethodInstruction;
    }

    /**
     * @return suggest_referral_resources
     */
    public String getSuggestReferralResources() {
        return suggestReferralResources;
    }

    /**
     * @param suggestReferralResources
     */
    public void setSuggestReferralResources(String suggestReferralResources) {
        this.suggestReferralResources = suggestReferralResources;
    }

    /**
     * @return suggest_referral_resources_instruction
     */
    public String getSuggestReferralResourcesInstruction() {
        return suggestReferralResourcesInstruction;
    }

    /**
     * @param suggestReferralResourcesInstruction
     */
    public void setSuggestReferralResourcesInstruction(String suggestReferralResourcesInstruction) {
        this.suggestReferralResourcesInstruction = suggestReferralResourcesInstruction;
    }

    /**
     * @return estimate_date
     */
    public String getEstimateDate() {
        return estimateDate;
    }

    /**
     * @param estimateDate
     */
    public void setEstimateDate(String estimateDate) {
        this.estimateDate = estimateDate;
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