package cn.com.personnel.ercp.pi.module.server;

import cn.com.personnel.ercp.pi.persistence.entity.server.ServerAssesseeChild;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerEstimateInfo;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerHighRiskFamilyInfo;

import java.util.List;

public class ServerEstimateInfoVO extends ServerEstimateInfo {
    private ServerHighRiskFamilyInfo serverHighRiskFamilyInfo;

    private List<ServerAssesseeChild> serverAssesseeChildList;

    private String area;
    private String childIdNo;
    private String childTelNo;
    private String childNationality;
    private String childMale;
    private String childAccountAddress;
    private String childCurrentAddress;
    private String childHealthStatus;
    private String childEscalationType;
    private String childDisabilityType;
    private String childDisabilityLevel;
    private String childDiseaseType;
    private String childSchoolAttendance;
    private String childOtherCases;
    private String childPovertyAlleviationImplementation;
    private String childViolationGuardian;
    private String fatherName;
    private String fatherIdNo;
    private String fatherTelNo;
    private String fatherAccountAddress;
    private String fatherCurrentAddress;
    private String fatherHealthStatus;
    private String fatherDisabilityType;
    private String fatherDisabilityLevel;
    private String fatherDiseaseType;
    private String fatherFamilyIncome;
    private String fatherOtherCases;
    private String motherName;
    private String motherIdNo;
    private String motherTelNo;
    private String motherAccountAddress;
    private String motherCurrentAddress;
    private String motherHealthStatus;
    private String motherDisabilityType;
    private String motherDisabilityLevel;
    private String motherDiseaseType;
    private String motherFamilyIncome;
    private String motherOtherCases;
    private String otherGuardianName;
    private String otherGuardianIdNo;
    private String otherGuardianTelNo;
    private String otherGuardianRelationshipWithChildren;
    private String otherGuardianHealthStatus;
    private String otherGuardianDisabilityType;
    private String otherGuardianDisabilityLevel;
    private String otherGuardianDiseaseType;
    private String otherGuardianReasons;
    private String organizationName;
    private String organizationPrincipal;
    private String organizationTelNo;
    private String organizationNature;
    private String organizationResidentialAddress;
    private String helpSuggestions;
    private String securityFeeCollectionMethod;
    private String securityFeeCollector;
    private String securityFeeRecipientRelationship;
    private String securityFeeGuaranteeStandard;

    private String caseStatus;
    private String estimateStatus;
    private String planStatus;
    private String interventionStatus;
    private String evaluateStatus;
    private String caseClosedStatus;

    public ServerHighRiskFamilyInfo getServerHighRiskFamilyInfo() {
        return serverHighRiskFamilyInfo;
    }

    public void setServerHighRiskFamilyInfo(ServerHighRiskFamilyInfo serverHighRiskFamilyInfo) {
        this.serverHighRiskFamilyInfo = serverHighRiskFamilyInfo;
    }

    public List<ServerAssesseeChild> getServerAssesseeChildList() {
        return serverAssesseeChildList;
    }

    public void setServerAssesseeChildList(List<ServerAssesseeChild> serverAssesseeChildList) {
        this.serverAssesseeChildList = serverAssesseeChildList;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getChildIdNo() {
        return childIdNo;
    }

    public void setChildIdNo(String childIdNo) {
        this.childIdNo = childIdNo;
    }

    public String getChildTelNo() {
        return childTelNo;
    }

    public void setChildTelNo(String childTelNo) {
        this.childTelNo = childTelNo;
    }

    public String getChildNationality() {
        return childNationality;
    }

    public void setChildNationality(String childNationality) {
        this.childNationality = childNationality;
    }

    @Override
    public String getChildMale() {
        return childMale;
    }

    @Override
    public void setChildMale(String childMale) {
        this.childMale = childMale;
    }

    public String getChildAccountAddress() {
        return childAccountAddress;
    }

    public void setChildAccountAddress(String childAccountAddress) {
        this.childAccountAddress = childAccountAddress;
    }

    public String getChildCurrentAddress() {
        return childCurrentAddress;
    }

    public void setChildCurrentAddress(String childCurrentAddress) {
        this.childCurrentAddress = childCurrentAddress;
    }

    public String getChildHealthStatus() {
        return childHealthStatus;
    }

    public void setChildHealthStatus(String childHealthStatus) {
        this.childHealthStatus = childHealthStatus;
    }

    public String getChildEscalationType() {
        return childEscalationType;
    }

    public void setChildEscalationType(String childEscalationType) {
        this.childEscalationType = childEscalationType;
    }

    public String getChildDisabilityType() {
        return childDisabilityType;
    }

    public void setChildDisabilityType(String childDisabilityType) {
        this.childDisabilityType = childDisabilityType;
    }

    public String getChildDisabilityLevel() {
        return childDisabilityLevel;
    }

    public void setChildDisabilityLevel(String childDisabilityLevel) {
        this.childDisabilityLevel = childDisabilityLevel;
    }

    public String getChildDiseaseType() {
        return childDiseaseType;
    }

    public void setChildDiseaseType(String childDiseaseType) {
        this.childDiseaseType = childDiseaseType;
    }

    public String getChildSchoolAttendance() {
        return childSchoolAttendance;
    }

    public void setChildSchoolAttendance(String childSchoolAttendance) {
        this.childSchoolAttendance = childSchoolAttendance;
    }

    public String getChildOtherCases() {
        return childOtherCases;
    }

    public void setChildOtherCases(String childOtherCases) {
        this.childOtherCases = childOtherCases;
    }

    public String getChildPovertyAlleviationImplementation() {
        return childPovertyAlleviationImplementation;
    }

    public void setChildPovertyAlleviationImplementation(String childPovertyAlleviationImplementation) {
        this.childPovertyAlleviationImplementation = childPovertyAlleviationImplementation;
    }

    public String getChildViolationGuardian() {
        return childViolationGuardian;
    }

    public void setChildViolationGuardian(String childViolationGuardian) {
        this.childViolationGuardian = childViolationGuardian;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherIdNo() {
        return fatherIdNo;
    }

    public void setFatherIdNo(String fatherIdNo) {
        this.fatherIdNo = fatherIdNo;
    }

    public String getFatherTelNo() {
        return fatherTelNo;
    }

    public void setFatherTelNo(String fatherTelNo) {
        this.fatherTelNo = fatherTelNo;
    }

    public String getFatherAccountAddress() {
        return fatherAccountAddress;
    }

    public void setFatherAccountAddress(String fatherAccountAddress) {
        this.fatherAccountAddress = fatherAccountAddress;
    }

    public String getFatherCurrentAddress() {
        return fatherCurrentAddress;
    }

    public void setFatherCurrentAddress(String fatherCurrentAddress) {
        this.fatherCurrentAddress = fatherCurrentAddress;
    }

    public String getFatherHealthStatus() {
        return fatherHealthStatus;
    }

    public void setFatherHealthStatus(String fatherHealthStatus) {
        this.fatherHealthStatus = fatherHealthStatus;
    }

    public String getFatherDisabilityType() {
        return fatherDisabilityType;
    }

    public void setFatherDisabilityType(String fatherDisabilityType) {
        this.fatherDisabilityType = fatherDisabilityType;
    }

    public String getFatherDisabilityLevel() {
        return fatherDisabilityLevel;
    }

    public void setFatherDisabilityLevel(String fatherDisabilityLevel) {
        this.fatherDisabilityLevel = fatherDisabilityLevel;
    }

    public String getFatherDiseaseType() {
        return fatherDiseaseType;
    }

    public void setFatherDiseaseType(String fatherDiseaseType) {
        this.fatherDiseaseType = fatherDiseaseType;
    }

    public String getFatherFamilyIncome() {
        return fatherFamilyIncome;
    }

    public void setFatherFamilyIncome(String fatherFamilyIncome) {
        this.fatherFamilyIncome = fatherFamilyIncome;
    }

    public String getFatherOtherCases() {
        return fatherOtherCases;
    }

    public void setFatherOtherCases(String fatherOtherCases) {
        this.fatherOtherCases = fatherOtherCases;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherIdNo() {
        return motherIdNo;
    }

    public void setMotherIdNo(String motherIdNo) {
        this.motherIdNo = motherIdNo;
    }

    public String getMotherTelNo() {
        return motherTelNo;
    }

    public void setMotherTelNo(String motherTelNo) {
        this.motherTelNo = motherTelNo;
    }

    public String getMotherAccountAddress() {
        return motherAccountAddress;
    }

    public void setMotherAccountAddress(String motherAccountAddress) {
        this.motherAccountAddress = motherAccountAddress;
    }

    public String getMotherCurrentAddress() {
        return motherCurrentAddress;
    }

    public void setMotherCurrentAddress(String motherCurrentAddress) {
        this.motherCurrentAddress = motherCurrentAddress;
    }

    public String getMotherHealthStatus() {
        return motherHealthStatus;
    }

    public void setMotherHealthStatus(String motherHealthStatus) {
        this.motherHealthStatus = motherHealthStatus;
    }

    public String getMotherDisabilityType() {
        return motherDisabilityType;
    }

    public void setMotherDisabilityType(String motherDisabilityType) {
        this.motherDisabilityType = motherDisabilityType;
    }

    public String getMotherDisabilityLevel() {
        return motherDisabilityLevel;
    }

    public void setMotherDisabilityLevel(String motherDisabilityLevel) {
        this.motherDisabilityLevel = motherDisabilityLevel;
    }

    public String getMotherDiseaseType() {
        return motherDiseaseType;
    }

    public void setMotherDiseaseType(String motherDiseaseType) {
        this.motherDiseaseType = motherDiseaseType;
    }

    public String getMotherFamilyIncome() {
        return motherFamilyIncome;
    }

    public void setMotherFamilyIncome(String motherFamilyIncome) {
        this.motherFamilyIncome = motherFamilyIncome;
    }

    public String getMotherOtherCases() {
        return motherOtherCases;
    }

    public void setMotherOtherCases(String motherOtherCases) {
        this.motherOtherCases = motherOtherCases;
    }

    public String getOtherGuardianName() {
        return otherGuardianName;
    }

    public void setOtherGuardianName(String otherGuardianName) {
        this.otherGuardianName = otherGuardianName;
    }

    public String getOtherGuardianIdNo() {
        return otherGuardianIdNo;
    }

    public void setOtherGuardianIdNo(String otherGuardianIdNo) {
        this.otherGuardianIdNo = otherGuardianIdNo;
    }

    public String getOtherGuardianTelNo() {
        return otherGuardianTelNo;
    }

    public void setOtherGuardianTelNo(String otherGuardianTelNo) {
        this.otherGuardianTelNo = otherGuardianTelNo;
    }

    public String getOtherGuardianRelationshipWithChildren() {
        return otherGuardianRelationshipWithChildren;
    }

    public void setOtherGuardianRelationshipWithChildren(String otherGuardianRelationshipWithChildren) {
        this.otherGuardianRelationshipWithChildren = otherGuardianRelationshipWithChildren;
    }

    public String getOtherGuardianHealthStatus() {
        return otherGuardianHealthStatus;
    }

    public void setOtherGuardianHealthStatus(String otherGuardianHealthStatus) {
        this.otherGuardianHealthStatus = otherGuardianHealthStatus;
    }

    public String getOtherGuardianDisabilityType() {
        return otherGuardianDisabilityType;
    }

    public void setOtherGuardianDisabilityType(String otherGuardianDisabilityType) {
        this.otherGuardianDisabilityType = otherGuardianDisabilityType;
    }

    public String getOtherGuardianDisabilityLevel() {
        return otherGuardianDisabilityLevel;
    }

    public void setOtherGuardianDisabilityLevel(String otherGuardianDisabilityLevel) {
        this.otherGuardianDisabilityLevel = otherGuardianDisabilityLevel;
    }

    public String getOtherGuardianDiseaseType() {
        return otherGuardianDiseaseType;
    }

    public void setOtherGuardianDiseaseType(String otherGuardianDiseaseType) {
        this.otherGuardianDiseaseType = otherGuardianDiseaseType;
    }

    public String getOtherGuardianReasons() {
        return otherGuardianReasons;
    }

    public void setOtherGuardianReasons(String otherGuardianReasons) {
        this.otherGuardianReasons = otherGuardianReasons;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationPrincipal() {
        return organizationPrincipal;
    }

    public void setOrganizationPrincipal(String organizationPrincipal) {
        this.organizationPrincipal = organizationPrincipal;
    }

    public String getOrganizationTelNo() {
        return organizationTelNo;
    }

    public void setOrganizationTelNo(String organizationTelNo) {
        this.organizationTelNo = organizationTelNo;
    }

    public String getOrganizationNature() {
        return organizationNature;
    }

    public void setOrganizationNature(String organizationNature) {
        this.organizationNature = organizationNature;
    }

    public String getOrganizationResidentialAddress() {
        return organizationResidentialAddress;
    }

    public void setOrganizationResidentialAddress(String organizationResidentialAddress) {
        this.organizationResidentialAddress = organizationResidentialAddress;
    }

    public String getHelpSuggestions() {
        return helpSuggestions;
    }

    public void setHelpSuggestions(String helpSuggestions) {
        this.helpSuggestions = helpSuggestions;
    }

    public String getSecurityFeeCollectionMethod() {
        return securityFeeCollectionMethod;
    }

    public void setSecurityFeeCollectionMethod(String securityFeeCollectionMethod) {
        this.securityFeeCollectionMethod = securityFeeCollectionMethod;
    }

    public String getSecurityFeeCollector() {
        return securityFeeCollector;
    }

    public void setSecurityFeeCollector(String securityFeeCollector) {
        this.securityFeeCollector = securityFeeCollector;
    }

    public String getSecurityFeeRecipientRelationship() {
        return securityFeeRecipientRelationship;
    }

    public void setSecurityFeeRecipientRelationship(String securityFeeRecipientRelationship) {
        this.securityFeeRecipientRelationship = securityFeeRecipientRelationship;
    }

    public String getSecurityFeeGuaranteeStandard() {
        return securityFeeGuaranteeStandard;
    }

    public void setSecurityFeeGuaranteeStandard(String securityFeeGuaranteeStandard) {
        this.securityFeeGuaranteeStandard = securityFeeGuaranteeStandard;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getEstimateStatus() {
        return estimateStatus;
    }

    public void setEstimateStatus(String estimateStatus) {
        this.estimateStatus = estimateStatus;
    }

    public String getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
    }

    public String getInterventionStatus() {
        return interventionStatus;
    }

    public void setInterventionStatus(String interventionStatus) {
        this.interventionStatus = interventionStatus;
    }

    public String getEvaluateStatus() {
        return evaluateStatus;
    }

    public void setEvaluateStatus(String evaluateStatus) {
        this.evaluateStatus = evaluateStatus;
    }

    public String getCaseClosedStatus() {
        return caseClosedStatus;
    }

    public void setCaseClosedStatus(String caseClosedStatus) {
        this.caseClosedStatus = caseClosedStatus;
    }
}