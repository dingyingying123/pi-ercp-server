package cn.com.personnel.ercp.fss.persistence.entity.collectionAccount;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pi_children_base_info")
public class PiChildrenBaseInfo {
    @Id
    @Column(name = "child_id")
    @GeneratedValue(generator = "JDBC")
    private String childId;

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

    @Column(name = "child_account_address")
    private String childAccountAddress;

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

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "father_id_no")
    private String fatherIdNo;

    @Column(name = "father_tel_no")
    private String fatherTelNo;

    @Column(name = "father_account_address")
    private String fatherAccountAddress;

    @Column(name = "father_current_address")
    private String fatherCurrentAddress;

    @Column(name = "father_health_status")
    private String fatherHealthStatus;

    @Column(name = "father_disability_type")
    private String fatherDisabilityType;

    @Column(name = "father_disability_level")
    private String fatherDisabilityLevel;

    @Column(name = "father_disease_type")
    private String fatherDiseaseType;

    @Column(name = "father_family_income")
    private String fatherFamilyIncome;

    @Column(name = "father_other_cases")
    private String fatherOtherCases;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "mother_id_no")
    private String motherIdNo;

    @Column(name = "mother_tel_no")
    private String motherTelNo;

    @Column(name = "mother_account_address")
    private String motherAccountAddress;

    @Column(name = "mother_current_address")
    private String motherCurrentAddress;

    @Column(name = "mother_health_status")
    private String motherHealthStatus;

    @Column(name = "mother_disability_type")
    private String motherDisabilityType;

    @Column(name = "mother_disability_level")
    private String motherDisabilityLevel;

    @Column(name = "mother_disease_type")
    private String motherDiseaseType;

    @Column(name = "mother_family_income")
    private String motherFamilyIncome;

    @Column(name = "mother_other_cases")
    private String motherOtherCases;

    @Column(name = "other_guardian_name")
    private String otherGuardianName;

    @Column(name = "other_guardian_id_no")
    private String otherGuardianIdNo;

    @Column(name = "other_guardian_tel_no")
    private String otherGuardianTelNo;

    @Column(name = "other_guardian_relationship_with_children")
    private String otherGuardianRelationshipWithChildren;

    @Column(name = "other_guardian_health_status")
    private String otherGuardianHealthStatus;

    @Column(name = "other_guardian_disability_type")
    private String otherGuardianDisabilityType;

    @Column(name = "other_guardian_disability_level")
    private String otherGuardianDisabilityLevel;

    @Column(name = "other_guardian_disease_type")
    private String otherGuardianDiseaseType;

    @Column(name = "other_guardian_reasons")
    private String otherGuardianReasons;

    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "organization_principal")
    private String organizationPrincipal;

    @Column(name = "organization_tel_no")
    private String organizationTelNo;

    @Column(name = "organization_nature")
    private String organizationNature;

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
     * @return father_name
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * @param fatherName
     */
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    /**
     * @return father_id_no
     */
    public String getFatherIdNo() {
        return fatherIdNo;
    }

    /**
     * @param fatherIdNo
     */
    public void setFatherIdNo(String fatherIdNo) {
        this.fatherIdNo = fatherIdNo;
    }

    /**
     * @return father_tel_no
     */
    public String getFatherTelNo() {
        return fatherTelNo;
    }

    /**
     * @param fatherTelNo
     */
    public void setFatherTelNo(String fatherTelNo) {
        this.fatherTelNo = fatherTelNo;
    }

    /**
     * @return father_account_address
     */
    public String getFatherAccountAddress() {
        return fatherAccountAddress;
    }

    /**
     * @param fatherAccountAddress
     */
    public void setFatherAccountAddress(String fatherAccountAddress) {
        this.fatherAccountAddress = fatherAccountAddress;
    }

    /**
     * @return father_current_address
     */
    public String getFatherCurrentAddress() {
        return fatherCurrentAddress;
    }

    /**
     * @param fatherCurrentAddress
     */
    public void setFatherCurrentAddress(String fatherCurrentAddress) {
        this.fatherCurrentAddress = fatherCurrentAddress;
    }

    /**
     * @return father_health_status
     */
    public String getFatherHealthStatus() {
        return fatherHealthStatus;
    }

    /**
     * @param fatherHealthStatus
     */
    public void setFatherHealthStatus(String fatherHealthStatus) {
        this.fatherHealthStatus = fatherHealthStatus;
    }

    /**
     * @return father_disability_type
     */
    public String getFatherDisabilityType() {
        return fatherDisabilityType;
    }

    /**
     * @param fatherDisabilityType
     */
    public void setFatherDisabilityType(String fatherDisabilityType) {
        this.fatherDisabilityType = fatherDisabilityType;
    }

    /**
     * @return father_disability_level
     */
    public String getFatherDisabilityLevel() {
        return fatherDisabilityLevel;
    }

    /**
     * @param fatherDisabilityLevel
     */
    public void setFatherDisabilityLevel(String fatherDisabilityLevel) {
        this.fatherDisabilityLevel = fatherDisabilityLevel;
    }

    /**
     * @return father_disease_type
     */
    public String getFatherDiseaseType() {
        return fatherDiseaseType;
    }

    /**
     * @param fatherDiseaseType
     */
    public void setFatherDiseaseType(String fatherDiseaseType) {
        this.fatherDiseaseType = fatherDiseaseType;
    }

    /**
     * @return father_family_income
     */
    public String getFatherFamilyIncome() {
        return fatherFamilyIncome;
    }

    /**
     * @param fatherFamilyIncome
     */
    public void setFatherFamilyIncome(String fatherFamilyIncome) {
        this.fatherFamilyIncome = fatherFamilyIncome;
    }

    /**
     * @return father_other_cases
     */
    public String getFatherOtherCases() {
        return fatherOtherCases;
    }

    /**
     * @param fatherOtherCases
     */
    public void setFatherOtherCases(String fatherOtherCases) {
        this.fatherOtherCases = fatherOtherCases;
    }

    /**
     * @return mother_name
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * @param motherName
     */
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    /**
     * @return mother_id_no
     */
    public String getMotherIdNo() {
        return motherIdNo;
    }

    /**
     * @param motherIdNo
     */
    public void setMotherIdNo(String motherIdNo) {
        this.motherIdNo = motherIdNo;
    }

    /**
     * @return mother_tel_no
     */
    public String getMotherTelNo() {
        return motherTelNo;
    }

    /**
     * @param motherTelNo
     */
    public void setMotherTelNo(String motherTelNo) {
        this.motherTelNo = motherTelNo;
    }

    /**
     * @return mother_account_address
     */
    public String getMotherAccountAddress() {
        return motherAccountAddress;
    }

    /**
     * @param motherAccountAddress
     */
    public void setMotherAccountAddress(String motherAccountAddress) {
        this.motherAccountAddress = motherAccountAddress;
    }

    /**
     * @return mother_current_address
     */
    public String getMotherCurrentAddress() {
        return motherCurrentAddress;
    }

    /**
     * @param motherCurrentAddress
     */
    public void setMotherCurrentAddress(String motherCurrentAddress) {
        this.motherCurrentAddress = motherCurrentAddress;
    }

    /**
     * @return mother_health_status
     */
    public String getMotherHealthStatus() {
        return motherHealthStatus;
    }

    /**
     * @param motherHealthStatus
     */
    public void setMotherHealthStatus(String motherHealthStatus) {
        this.motherHealthStatus = motherHealthStatus;
    }

    /**
     * @return mother_disability_type
     */
    public String getMotherDisabilityType() {
        return motherDisabilityType;
    }

    /**
     * @param motherDisabilityType
     */
    public void setMotherDisabilityType(String motherDisabilityType) {
        this.motherDisabilityType = motherDisabilityType;
    }

    /**
     * @return mother_disability_level
     */
    public String getMotherDisabilityLevel() {
        return motherDisabilityLevel;
    }

    /**
     * @param motherDisabilityLevel
     */
    public void setMotherDisabilityLevel(String motherDisabilityLevel) {
        this.motherDisabilityLevel = motherDisabilityLevel;
    }

    /**
     * @return mother_disease_type
     */
    public String getMotherDiseaseType() {
        return motherDiseaseType;
    }

    /**
     * @param motherDiseaseType
     */
    public void setMotherDiseaseType(String motherDiseaseType) {
        this.motherDiseaseType = motherDiseaseType;
    }

    /**
     * @return mother_family_income
     */
    public String getMotherFamilyIncome() {
        return motherFamilyIncome;
    }

    /**
     * @param motherFamilyIncome
     */
    public void setMotherFamilyIncome(String motherFamilyIncome) {
        this.motherFamilyIncome = motherFamilyIncome;
    }

    /**
     * @return mother_other_cases
     */
    public String getMotherOtherCases() {
        return motherOtherCases;
    }

    /**
     * @param motherOtherCases
     */
    public void setMotherOtherCases(String motherOtherCases) {
        this.motherOtherCases = motherOtherCases;
    }

    /**
     * @return other_guardian_name
     */
    public String getOtherGuardianName() {
        return otherGuardianName;
    }

    /**
     * @param otherGuardianName
     */
    public void setOtherGuardianName(String otherGuardianName) {
        this.otherGuardianName = otherGuardianName;
    }

    /**
     * @return other_guardian_id_no
     */
    public String getOtherGuardianIdNo() {
        return otherGuardianIdNo;
    }

    /**
     * @param otherGuardianIdNo
     */
    public void setOtherGuardianIdNo(String otherGuardianIdNo) {
        this.otherGuardianIdNo = otherGuardianIdNo;
    }

    /**
     * @return other_guardian_tel_no
     */
    public String getOtherGuardianTelNo() {
        return otherGuardianTelNo;
    }

    /**
     * @param otherGuardianTelNo
     */
    public void setOtherGuardianTelNo(String otherGuardianTelNo) {
        this.otherGuardianTelNo = otherGuardianTelNo;
    }

    /**
     * @return other_guardian_relationship_with_children
     */
    public String getOtherGuardianRelationshipWithChildren() {
        return otherGuardianRelationshipWithChildren;
    }

    /**
     * @param otherGuardianRelationshipWithChildren
     */
    public void setOtherGuardianRelationshipWithChildren(String otherGuardianRelationshipWithChildren) {
        this.otherGuardianRelationshipWithChildren = otherGuardianRelationshipWithChildren;
    }

    /**
     * @return other_guardian_health_status
     */
    public String getOtherGuardianHealthStatus() {
        return otherGuardianHealthStatus;
    }

    /**
     * @param otherGuardianHealthStatus
     */
    public void setOtherGuardianHealthStatus(String otherGuardianHealthStatus) {
        this.otherGuardianHealthStatus = otherGuardianHealthStatus;
    }

    /**
     * @return other_guardian_disability_type
     */
    public String getOtherGuardianDisabilityType() {
        return otherGuardianDisabilityType;
    }

    /**
     * @param otherGuardianDisabilityType
     */
    public void setOtherGuardianDisabilityType(String otherGuardianDisabilityType) {
        this.otherGuardianDisabilityType = otherGuardianDisabilityType;
    }

    /**
     * @return other_guardian_disability_level
     */
    public String getOtherGuardianDisabilityLevel() {
        return otherGuardianDisabilityLevel;
    }

    /**
     * @param otherGuardianDisabilityLevel
     */
    public void setOtherGuardianDisabilityLevel(String otherGuardianDisabilityLevel) {
        this.otherGuardianDisabilityLevel = otherGuardianDisabilityLevel;
    }

    /**
     * @return other_guardian_disease_type
     */
    public String getOtherGuardianDiseaseType() {
        return otherGuardianDiseaseType;
    }

    /**
     * @param otherGuardianDiseaseType
     */
    public void setOtherGuardianDiseaseType(String otherGuardianDiseaseType) {
        this.otherGuardianDiseaseType = otherGuardianDiseaseType;
    }

    /**
     * @return other_guardian_reasons
     */
    public String getOtherGuardianReasons() {
        return otherGuardianReasons;
    }

    /**
     * @param otherGuardianReasons
     */
    public void setOtherGuardianReasons(String otherGuardianReasons) {
        this.otherGuardianReasons = otherGuardianReasons;
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
}