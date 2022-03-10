package cn.com.personnel.ercp.pi.persistence.entity.child;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pi_children_base_info")
public class PiChildrenBaseInfo {
    @Id
    @Column(name = "child_id")
    @GeneratedValue(generator = "JDBC")
    private String childId;

    private String area;

    @Column(name = "child_name")
    private String childName;

    @Column(name = "child_id_no")
    private String childIdNo;

    @Column(name = "child_tel_no")
    private String childTelNo;

    @Column(name = "child_nationality")
    private String childNationality;

    @Column(name = "child_male")
    private String childMale;

    @Column(name = "child_account_province")
    private String childAccountProvince;

    @Column(name = "child_account_town")
    private String childAccountTown;

    @Column(name = "child_account_city")
    private String childAccountCity;

    @Column(name = "child_account_county")
    private String childAccountCounty;

    @Column(name = "child_account_address")
    private String childAccountAddress;

    @Column(name = "child_current_province")
    private String childCurrentProvince;

    @Column(name = "child_current_city")
    private String childCurrentCity;

    @Column(name = "child_current_county")
    private String childCurrentCounty;

    @Column(name = "child_current_town")
    private String childCurrentTown;

    @Column(name = "child_current_address")
    private String childCurrentAddress;

    @Column(name = "child_health_status")
    private String childHealthStatus;

    @Column(name = "child_escalation_type")
    private String childEscalationType;

    @Column(name = "child_disability_type")
    private String childDisabilityType;

    @Column(name = "child_disability_level")
    private String childDisabilityLevel;

    @Column(name = "child_disease_type")
    private String childDiseaseType;

    @Column(name = "child_school_attendance")
    private String childSchoolAttendance;

    @Column(name = "child_other_cases")
    private String childOtherCases;

    @Column(name = "child_poverty_alleviation_implementation")
    private String childPovertyAlleviationImplementation;

    @Column(name = "child_violation_guardian")
    private String childViolationGuardian;

    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "organization_principal")
    private String organizationPrincipal;

    @Column(name = "organization_tel_no")
    private String organizationTelNo;

    @Column(name = "organization_nature")
    private String organizationNature;

    @Column(name = "organization_residential_province")
    private String organizationResidentialProvince;

    @Column(name = "organization_residential_city")
    private String organizationResidentialCity;

    @Column(name = "organization_residential_county")
    private String organizationResidentialCounty;

    @Column(name = "organization_residential_town")
    private String organizationResidentialTown;

    @Column(name = "organization_residential_address")
    private String organizationResidentialAddress;

    @Column(name = "help_suggestions")
    private String helpSuggestions;

    @Column(name = "security_fee_collection_method")
    private String securityFeeCollectionMethod;

    @Column(name = "security_fee_collector")
    private String securityFeeCollector;

    @Column(name = "security_fee_recipient_relationship")
    private String securityFeeRecipientRelationship;

    @Column(name = "security_fee_guarantee_standard")
    private String securityFeeGuaranteeStandard;

    private String isdelete;

    private String status;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;

    private String guardian;

    @Column(name = "child_age")
    private String childAge;

    @Column(name = "approve_opinion")
    private String approveOpinion;

    @Column(name = "home_situation")
    private String homeSituation;

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
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
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
     * @return child_id_no
     */
    public String getChildIdNo() {
        return childIdNo;
    }

    /**
     * @param childIdNo
     */
    public void setChildIdNo(String childIdNo) {
        this.childIdNo = childIdNo;
    }

    /**
     * @return child_tel_no
     */
    public String getChildTelNo() {
        return childTelNo;
    }

    /**
     * @param childTelNo
     */
    public void setChildTelNo(String childTelNo) {
        this.childTelNo = childTelNo;
    }

    /**
     * @return child_nationality
     */
    public String getChildNationality() {
        return childNationality;
    }

    /**
     * @param childNationality
     */
    public void setChildNationality(String childNationality) {
        this.childNationality = childNationality;
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

    public String getChildAccountTown() {
        return childAccountTown;
    }

    public void setChildAccountTown(String childAccountTown) {
        this.childAccountTown = childAccountTown;
    }

    /**
     * @return child_account_city
     */
    public String getChildAccountCity() {
        return childAccountCity;
    }

    /**
     * @param childAccountCity
     */
    public void setChildAccountCity(String childAccountCity) {
        this.childAccountCity = childAccountCity;
    }

    /**
     * @return child_account_county
     */
    public String getChildAccountCounty() {
        return childAccountCounty;
    }

    /**
     * @param childAccountCounty
     */
    public void setChildAccountCounty(String childAccountCounty) {
        this.childAccountCounty = childAccountCounty;
    }

    /**
     * @return child_account_address
     */
    public String getChildAccountAddress() {
        return childAccountAddress;
    }

    /**
     * @param childAccountAddress
     */
    public void setChildAccountAddress(String childAccountAddress) {
        this.childAccountAddress = childAccountAddress;
    }

    /**
     * @return child_current_province
     */
    public String getChildCurrentProvince() {
        return childCurrentProvince;
    }

    /**
     * @param childCurrentProvince
     */
    public void setChildCurrentProvince(String childCurrentProvince) {
        this.childCurrentProvince = childCurrentProvince;
    }

    /**
     * @return child_current_city
     */
    public String getChildCurrentCity() {
        return childCurrentCity;
    }

    /**
     * @param childCurrentCity
     */
    public void setChildCurrentCity(String childCurrentCity) {
        this.childCurrentCity = childCurrentCity;
    }

    /**
     * @return child_current_county
     */
    public String getChildCurrentCounty() {
        return childCurrentCounty;
    }

    /**
     * @param childCurrentCounty
     */
    public void setChildCurrentCounty(String childCurrentCounty) {
        this.childCurrentCounty = childCurrentCounty;
    }

    /**
     * @return child_current_address
     */
    public String getChildCurrentAddress() {
        return childCurrentAddress;
    }

    /**
     * @param childCurrentAddress
     */
    public void setChildCurrentAddress(String childCurrentAddress) {
        this.childCurrentAddress = childCurrentAddress;
    }

    /**
     * @return child_health_status
     */
    public String getChildHealthStatus() {
        return childHealthStatus;
    }

    /**
     * @param childHealthStatus
     */
    public void setChildHealthStatus(String childHealthStatus) {
        this.childHealthStatus = childHealthStatus;
    }

    /**
     * @return child_escalation_type
     */
    public String getChildEscalationType() {
        return childEscalationType;
    }

    /**
     * @param childEscalationType
     */
    public void setChildEscalationType(String childEscalationType) {
        this.childEscalationType = childEscalationType;
    }

    /**
     * @return child_disability_type
     */
    public String getChildDisabilityType() {
        return childDisabilityType;
    }

    /**
     * @param childDisabilityType
     */
    public void setChildDisabilityType(String childDisabilityType) {
        this.childDisabilityType = childDisabilityType;
    }

    /**
     * @return child_disability_level
     */
    public String getChildDisabilityLevel() {
        return childDisabilityLevel;
    }

    /**
     * @param childDisabilityLevel
     */
    public void setChildDisabilityLevel(String childDisabilityLevel) {
        this.childDisabilityLevel = childDisabilityLevel;
    }

    /**
     * @return child_disease_type
     */
    public String getChildDiseaseType() {
        return childDiseaseType;
    }

    /**
     * @param childDiseaseType
     */
    public void setChildDiseaseType(String childDiseaseType) {
        this.childDiseaseType = childDiseaseType;
    }

    /**
     * @return child_school_attendance
     */
    public String getChildSchoolAttendance() {
        return childSchoolAttendance;
    }

    /**
     * @param childSchoolAttendance
     */
    public void setChildSchoolAttendance(String childSchoolAttendance) {
        this.childSchoolAttendance = childSchoolAttendance;
    }

    /**
     * @return child_other_cases
     */
    public String getChildOtherCases() {
        return childOtherCases;
    }

    /**
     * @param childOtherCases
     */
    public void setChildOtherCases(String childOtherCases) {
        this.childOtherCases = childOtherCases;
    }

    /**
     * @return child_poverty_alleviation_implementation
     */
    public String getChildPovertyAlleviationImplementation() {
        return childPovertyAlleviationImplementation;
    }

    /**
     * @param childPovertyAlleviationImplementation
     */
    public void setChildPovertyAlleviationImplementation(String childPovertyAlleviationImplementation) {
        this.childPovertyAlleviationImplementation = childPovertyAlleviationImplementation;
    }

    /**
     * @return child_violation_guardian
     */
    public String getChildViolationGuardian() {
        return childViolationGuardian;
    }

    /**
     * @param childViolationGuardian
     */
    public void setChildViolationGuardian(String childViolationGuardian) {
        this.childViolationGuardian = childViolationGuardian;
    }

    /**
     * @return organization_name
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * @return organization_principal
     */
    public String getOrganizationPrincipal() {
        return organizationPrincipal;
    }

    /**
     * @param organizationPrincipal
     */
    public void setOrganizationPrincipal(String organizationPrincipal) {
        this.organizationPrincipal = organizationPrincipal;
    }

    /**
     * @return organization_tel_no
     */
    public String getOrganizationTelNo() {
        return organizationTelNo;
    }

    /**
     * @param organizationTelNo
     */
    public void setOrganizationTelNo(String organizationTelNo) {
        this.organizationTelNo = organizationTelNo;
    }

    /**
     * @return organization_nature
     */
    public String getOrganizationNature() {
        return organizationNature;
    }

    /**
     * @param organizationNature
     */
    public void setOrganizationNature(String organizationNature) {
        this.organizationNature = organizationNature;
    }

    /**
     * @return organization_residential_province
     */
    public String getOrganizationResidentialProvince() {
        return organizationResidentialProvince;
    }

    /**
     * @param organizationResidentialProvince
     */
    public void setOrganizationResidentialProvince(String organizationResidentialProvince) {
        this.organizationResidentialProvince = organizationResidentialProvince;
    }

    /**
     * @return organization_residential_city
     */
    public String getOrganizationResidentialCity() {
        return organizationResidentialCity;
    }

    /**
     * @param organizationResidentialCity
     */
    public void setOrganizationResidentialCity(String organizationResidentialCity) {
        this.organizationResidentialCity = organizationResidentialCity;
    }

    /**
     * @return organization_residential_county
     */
    public String getOrganizationResidentialCounty() {
        return organizationResidentialCounty;
    }

    /**
     * @param organizationResidentialCounty
     */
    public void setOrganizationResidentialCounty(String organizationResidentialCounty) {
        this.organizationResidentialCounty = organizationResidentialCounty;
    }

    /**
     * @return organization_residential_address
     */
    public String getOrganizationResidentialAddress() {
        return organizationResidentialAddress;
    }

    /**
     * @param organizationResidentialAddress
     */
    public void setOrganizationResidentialAddress(String organizationResidentialAddress) {
        this.organizationResidentialAddress = organizationResidentialAddress;
    }

    /**
     * @return help_suggestions
     */
    public String getHelpSuggestions() {
        return helpSuggestions;
    }

    /**
     * @param helpSuggestions
     */
    public void setHelpSuggestions(String helpSuggestions) {
        this.helpSuggestions = helpSuggestions;
    }

    /**
     * @return security_fee_collection_method
     */
    public String getSecurityFeeCollectionMethod() {
        return securityFeeCollectionMethod;
    }

    /**
     * @param securityFeeCollectionMethod
     */
    public void setSecurityFeeCollectionMethod(String securityFeeCollectionMethod) {
        this.securityFeeCollectionMethod = securityFeeCollectionMethod;
    }

    /**
     * @return security_fee_collector
     */
    public String getSecurityFeeCollector() {
        return securityFeeCollector;
    }

    /**
     * @param securityFeeCollector
     */
    public void setSecurityFeeCollector(String securityFeeCollector) {
        this.securityFeeCollector = securityFeeCollector;
    }

    /**
     * @return security_fee_recipient_relationship
     */
    public String getSecurityFeeRecipientRelationship() {
        return securityFeeRecipientRelationship;
    }

    /**
     * @param securityFeeRecipientRelationship
     */
    public void setSecurityFeeRecipientRelationship(String securityFeeRecipientRelationship) {
        this.securityFeeRecipientRelationship = securityFeeRecipientRelationship;
    }

    /**
     * @return security_fee_guarantee_standard
     */
    public String getSecurityFeeGuaranteeStandard() {
        return securityFeeGuaranteeStandard;
    }

    /**
     * @param securityFeeGuaranteeStandard
     */
    public void setSecurityFeeGuaranteeStandard(String securityFeeGuaranteeStandard) {
        this.securityFeeGuaranteeStandard = securityFeeGuaranteeStandard;
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

    /**
     * @return guardian
     */
    public String getGuardian() {
        return guardian;
    }

    /**
     * @param guardian
     */
    public void setGuardian(String guardian) {
        this.guardian = guardian;
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

    public String getChildAccountProvince() {
        return childAccountProvince;
    }

    public void setChildAccountProvince(String childAccountProvince) {
        this.childAccountProvince = childAccountProvince;
    }

    public String getChildCurrentTown() {
        return childCurrentTown;
    }

    public void setChildCurrentTown(String childCurrentTown) {
        this.childCurrentTown = childCurrentTown;
    }

    public String getApproveOpinion() {
        return approveOpinion;
    }

    public void setApproveOpinion(String approveOpinion) {
        this.approveOpinion = approveOpinion;
    }

    public String getOrganizationResidentialTown() {
        return organizationResidentialTown;
    }

    public void setOrganizationResidentialTown(String organizationResidentialTown) {
        this.organizationResidentialTown = organizationResidentialTown;
    }

    public String getHomeSituation() {
        return homeSituation;
    }

    public void setHomeSituation(String homeSituation) {
        this.homeSituation = homeSituation;
    }
}