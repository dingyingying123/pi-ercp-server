package cn.com.personnel.ercp.pi.persistence.entity.server;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_high_risk_family_info")
public class ServerHighRiskFamilyInfo {
    @Id
    @Column(name = "risk_id")
    @GeneratedValue(generator = "JDBC")
    private String riskId;

    @Column(name = "est_id")
    private String estId;

    @Column(name = "child_id")
    private String childId;

    @Column(name = "sta_id")
    private String staId;

    @Column(name = "high_risk_no")
    private String highRiskNo;

    @Column(name = "high_risk_date")
    private String highRiskDate;

    @Column(name = "guardian_name")
    private String guardianName;

    @Column(name = "guardian_tel")
    private String guardianTel;

    @Column(name = "guardian_home_address")
    private String guardianHomeAddress;

    @Column(name = "family_conflict")
    private String familyConflict;

    private String disadvantages;

    private String unemployed;

    @Column(name = "one_party_death")
    private String onePartyDeath;

    @Column(name = "parents_too_busy")
    private String parentsTooBusy;

    @Column(name = "suicidal_tendency")
    private String suicidalTendency;

    @Column(name = "family_assessment_other")
    private String familyAssessmentOther;

    @Column(name = "family_assessment_other_instruction")
    private String familyAssessmentOtherInstruction;

    @Column(name = "provided_service_unit")
    private String providedServiceUnit;

    @Column(name = "provided_service_unit_instruction")
    private String providedServiceUnitInstruction;

    @Column(name = "government_policy_resources")
    private String governmentPolicyResources;

    @Column(name = "government_policy_resources_instruction")
    private String governmentPolicyResourcesInstruction;

    @Column(name = "civil_society_welfare_resources")
    private String civilSocietyWelfareResources;

    @Column(name = "civil_society_welfare_resources_instruction")
    private String civilSocietyWelfareResourcesInstruction;

    @Column(name = "relatives_support")
    private String relativesSupport;

    @Column(name = "relatives_support_instruction")
    private String relativesSupportInstruction;

    @Column(name = "relief_resources_other")
    private String reliefResourcesOther;

    @Column(name = "relief_resources_other_instruction")
    private String reliefResourcesOtherInstruction;

    @Column(name = "brief_description_case")
    private String briefDescriptionCase;

    private String assessor;

    @Column(name = "assessor_tel")
    private String assessorTel;

    @Column(name = "do_you_need_follow_up_service")
    private String doYouNeedFollowUpService;

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
     * @return high_risk_no
     */
    public String getHighRiskNo() {
        return highRiskNo;
    }

    /**
     * @param highRiskNo
     */
    public void setHighRiskNo(String highRiskNo) {
        this.highRiskNo = highRiskNo;
    }

    /**
     * @return high_risk_date
     */
    public String getHighRiskDate() {
        return highRiskDate;
    }

    /**
     * @param highRiskDate
     */
    public void setHighRiskDate(String highRiskDate) {
        this.highRiskDate = highRiskDate;
    }

    /**
     * @return guardian_name
     */
    public String getGuardianName() {
        return guardianName;
    }

    /**
     * @param guardianName
     */
    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    /**
     * @return guardian_tel
     */
    public String getGuardianTel() {
        return guardianTel;
    }

    /**
     * @param guardianTel
     */
    public void setGuardianTel(String guardianTel) {
        this.guardianTel = guardianTel;
    }

    /**
     * @return guardian_home_address
     */
    public String getGuardianHomeAddress() {
        return guardianHomeAddress;
    }

    /**
     * @param guardianHomeAddress
     */
    public void setGuardianHomeAddress(String guardianHomeAddress) {
        this.guardianHomeAddress = guardianHomeAddress;
    }

    /**
     * @return family_conflict
     */
    public String getFamilyConflict() {
        return familyConflict;
    }

    /**
     * @param familyConflict
     */
    public void setFamilyConflict(String familyConflict) {
        this.familyConflict = familyConflict;
    }

    /**
     * @return disadvantages
     */
    public String getDisadvantages() {
        return disadvantages;
    }

    /**
     * @param disadvantages
     */
    public void setDisadvantages(String disadvantages) {
        this.disadvantages = disadvantages;
    }

    /**
     * @return unemployed
     */
    public String getUnemployed() {
        return unemployed;
    }

    /**
     * @param unemployed
     */
    public void setUnemployed(String unemployed) {
        this.unemployed = unemployed;
    }

    /**
     * @return one_party_death
     */
    public String getOnePartyDeath() {
        return onePartyDeath;
    }

    /**
     * @param onePartyDeath
     */
    public void setOnePartyDeath(String onePartyDeath) {
        this.onePartyDeath = onePartyDeath;
    }

    /**
     * @return parents_too_busy
     */
    public String getParentsTooBusy() {
        return parentsTooBusy;
    }

    /**
     * @param parentsTooBusy
     */
    public void setParentsTooBusy(String parentsTooBusy) {
        this.parentsTooBusy = parentsTooBusy;
    }

    /**
     * @return suicidal_tendency
     */
    public String getSuicidalTendency() {
        return suicidalTendency;
    }

    /**
     * @param suicidalTendency
     */
    public void setSuicidalTendency(String suicidalTendency) {
        this.suicidalTendency = suicidalTendency;
    }

    /**
     * @return family_assessment_other
     */
    public String getFamilyAssessmentOther() {
        return familyAssessmentOther;
    }

    /**
     * @param familyAssessmentOther
     */
    public void setFamilyAssessmentOther(String familyAssessmentOther) {
        this.familyAssessmentOther = familyAssessmentOther;
    }

    /**
     * @return family_assessment_other_instruction
     */
    public String getFamilyAssessmentOtherInstruction() {
        return familyAssessmentOtherInstruction;
    }

    /**
     * @param familyAssessmentOtherInstruction
     */
    public void setFamilyAssessmentOtherInstruction(String familyAssessmentOtherInstruction) {
        this.familyAssessmentOtherInstruction = familyAssessmentOtherInstruction;
    }

    /**
     * @return provided_service_unit
     */
    public String getProvidedServiceUnit() {
        return providedServiceUnit;
    }

    /**
     * @param providedServiceUnit
     */
    public void setProvidedServiceUnit(String providedServiceUnit) {
        this.providedServiceUnit = providedServiceUnit;
    }

    /**
     * @return provided_service_unit_instruction
     */
    public String getProvidedServiceUnitInstruction() {
        return providedServiceUnitInstruction;
    }

    /**
     * @param providedServiceUnitInstruction
     */
    public void setProvidedServiceUnitInstruction(String providedServiceUnitInstruction) {
        this.providedServiceUnitInstruction = providedServiceUnitInstruction;
    }

    /**
     * @return government_policy_resources
     */
    public String getGovernmentPolicyResources() {
        return governmentPolicyResources;
    }

    /**
     * @param governmentPolicyResources
     */
    public void setGovernmentPolicyResources(String governmentPolicyResources) {
        this.governmentPolicyResources = governmentPolicyResources;
    }

    /**
     * @return government_policy_resources_instruction
     */
    public String getGovernmentPolicyResourcesInstruction() {
        return governmentPolicyResourcesInstruction;
    }

    /**
     * @param governmentPolicyResourcesInstruction
     */
    public void setGovernmentPolicyResourcesInstruction(String governmentPolicyResourcesInstruction) {
        this.governmentPolicyResourcesInstruction = governmentPolicyResourcesInstruction;
    }

    /**
     * @return civil_society_welfare_resources
     */
    public String getCivilSocietyWelfareResources() {
        return civilSocietyWelfareResources;
    }

    /**
     * @param civilSocietyWelfareResources
     */
    public void setCivilSocietyWelfareResources(String civilSocietyWelfareResources) {
        this.civilSocietyWelfareResources = civilSocietyWelfareResources;
    }

    /**
     * @return civil_society_welfare_resources_instruction
     */
    public String getCivilSocietyWelfareResourcesInstruction() {
        return civilSocietyWelfareResourcesInstruction;
    }

    /**
     * @param civilSocietyWelfareResourcesInstruction
     */
    public void setCivilSocietyWelfareResourcesInstruction(String civilSocietyWelfareResourcesInstruction) {
        this.civilSocietyWelfareResourcesInstruction = civilSocietyWelfareResourcesInstruction;
    }

    /**
     * @return relatives_support
     */
    public String getRelativesSupport() {
        return relativesSupport;
    }

    /**
     * @param relativesSupport
     */
    public void setRelativesSupport(String relativesSupport) {
        this.relativesSupport = relativesSupport;
    }

    /**
     * @return relatives_support_instruction
     */
    public String getRelativesSupportInstruction() {
        return relativesSupportInstruction;
    }

    /**
     * @param relativesSupportInstruction
     */
    public void setRelativesSupportInstruction(String relativesSupportInstruction) {
        this.relativesSupportInstruction = relativesSupportInstruction;
    }

    /**
     * @return relief_resources_other
     */
    public String getReliefResourcesOther() {
        return reliefResourcesOther;
    }

    /**
     * @param reliefResourcesOther
     */
    public void setReliefResourcesOther(String reliefResourcesOther) {
        this.reliefResourcesOther = reliefResourcesOther;
    }

    /**
     * @return relief_resources_other_instruction
     */
    public String getReliefResourcesOtherInstruction() {
        return reliefResourcesOtherInstruction;
    }

    /**
     * @param reliefResourcesOtherInstruction
     */
    public void setReliefResourcesOtherInstruction(String reliefResourcesOtherInstruction) {
        this.reliefResourcesOtherInstruction = reliefResourcesOtherInstruction;
    }

    /**
     * @return brief_description_case
     */
    public String getBriefDescriptionCase() {
        return briefDescriptionCase;
    }

    /**
     * @param briefDescriptionCase
     */
    public void setBriefDescriptionCase(String briefDescriptionCase) {
        this.briefDescriptionCase = briefDescriptionCase;
    }

    /**
     * @return assessor
     */
    public String getAssessor() {
        return assessor;
    }

    /**
     * @param assessor
     */
    public void setAssessor(String assessor) {
        this.assessor = assessor;
    }

    /**
     * @return assessor_tel
     */
    public String getAssessorTel() {
        return assessorTel;
    }

    /**
     * @param assessorTel
     */
    public void setAssessorTel(String assessorTel) {
        this.assessorTel = assessorTel;
    }

    /**
     * @return do_you_need_follow_up_service
     */
    public String getDoYouNeedFollowUpService() {
        return doYouNeedFollowUpService;
    }

    /**
     * @param doYouNeedFollowUpService
     */
    public void setDoYouNeedFollowUpService(String doYouNeedFollowUpService) {
        this.doYouNeedFollowUpService = doYouNeedFollowUpService;
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