package cn.com.personnel.ercp.pi.module.server;

import cn.com.personnel.ercp.pi.persistence.entity.server.ServerTakeCaseFamilyMember;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerTakeCaseInfo;

import java.util.List;

public class ServerTakeCaseInfoVO extends ServerTakeCaseInfo {
    private List<ServerTakeCaseFamilyMember> serverTakeCaseFamilyMemberList;

    private String area;
    private String childIdNo;
    private String childTelNo;
    private String childNationality;
    private String childMale;
    private String childAccountProvince;
    private String childAccountCity;
    private String childAccountCounty;
    private String childAccountAddress;
    private String childCurrentProvince;
    private String childCurrentCity;
    private String childCurrentCounty;
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
    private String organizationName;
    private String organizationPrincipal;
    private String organizationTelNo;
    private String organizationNature;
    private String organizationResidentialProvince;
    private String organizationResidentialCity;
    private String organizationResidentialCounty;
    private String organizationResidentialAddress;
    private String helpSuggestions;
    private String securityFeeCollectionMethod;
    private String securityFeeCollector;
    private String securityFeeRecipientRelationship;
    private String securityFeeGuaranteeStandard;

    private String staId;
    private String caseStatus;
    private String estimateStatus;
    private String planStatus;
    private String interventionStatus;
    private String evaluateStatus;
    private String caseClosedStatus;

    @Override
    public String toString() {
        return "ServerTakeCaseInfoVO{" +
                "serverTakeCaseFamilyMemberList=" + serverTakeCaseFamilyMemberList +
                ", area='" + area + '\'' +
                ", childIdNo='" + childIdNo + '\'' +
                ", childTelNo='" + childTelNo + '\'' +
                ", childNationality='" + childNationality + '\'' +
                ", childMale='" + childMale + '\'' +
                ", childAccountProvince='" + childAccountProvince + '\'' +
                ", childAccountCity='" + childAccountCity + '\'' +
                ", childAccountCounty='" + childAccountCounty + '\'' +
                ", childAccountAddress='" + childAccountAddress + '\'' +
                ", childCurrentProvince='" + childCurrentProvince + '\'' +
                ", childCurrentCity='" + childCurrentCity + '\'' +
                ", childCurrentCounty='" + childCurrentCounty + '\'' +
                ", childCurrentAddress='" + childCurrentAddress + '\'' +
                ", childHealthStatus='" + childHealthStatus + '\'' +
                ", childEscalationType='" + childEscalationType + '\'' +
                ", childDisabilityType='" + childDisabilityType + '\'' +
                ", childDisabilityLevel='" + childDisabilityLevel + '\'' +
                ", childDiseaseType='" + childDiseaseType + '\'' +
                ", childSchoolAttendance='" + childSchoolAttendance + '\'' +
                ", childOtherCases='" + childOtherCases + '\'' +
                ", childPovertyAlleviationImplementation='" + childPovertyAlleviationImplementation + '\'' +
                ", childViolationGuardian='" + childViolationGuardian + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", organizationPrincipal='" + organizationPrincipal + '\'' +
                ", organizationTelNo='" + organizationTelNo + '\'' +
                ", organizationNature='" + organizationNature + '\'' +
                ", organizationResidentialProvince='" + organizationResidentialProvince + '\'' +
                ", organizationResidentialCity='" + organizationResidentialCity + '\'' +
                ", organizationResidentialCounty='" + organizationResidentialCounty + '\'' +
                ", organizationResidentialAddress='" + organizationResidentialAddress + '\'' +
                ", helpSuggestions='" + helpSuggestions + '\'' +
                ", securityFeeCollectionMethod='" + securityFeeCollectionMethod + '\'' +
                ", securityFeeCollector='" + securityFeeCollector + '\'' +
                ", securityFeeRecipientRelationship='" + securityFeeRecipientRelationship + '\'' +
                ", securityFeeGuaranteeStandard='" + securityFeeGuaranteeStandard + '\'' +
                ", staId='" + staId + '\'' +
                ", caseStatus='" + caseStatus + '\'' +
                ", estimateStatus='" + estimateStatus + '\'' +
                ", planStatus='" + planStatus + '\'' +
                ", interventionStatus='" + interventionStatus + '\'' +
                ", evaluateStatus='" + evaluateStatus + '\'' +
                ", caseClosedStatus='" + caseClosedStatus + '\'' +
                '}';
    }

    public List<ServerTakeCaseFamilyMember> getServerTakeCaseFamilyMemberList() {
        return serverTakeCaseFamilyMemberList;
    }

    public void setServerTakeCaseFamilyMemberList(List<ServerTakeCaseFamilyMember> serverTakeCaseFamilyMemberList) {
        this.serverTakeCaseFamilyMemberList = serverTakeCaseFamilyMemberList;
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

    public String getChildAccountProvince() {
        return childAccountProvince;
    }

    public void setChildAccountProvince(String childAccountProvince) {
        this.childAccountProvince = childAccountProvince;
    }

    public String getChildAccountCity() {
        return childAccountCity;
    }

    public void setChildAccountCity(String childAccountCity) {
        this.childAccountCity = childAccountCity;
    }

    public String getChildAccountCounty() {
        return childAccountCounty;
    }

    public void setChildAccountCounty(String childAccountCounty) {
        this.childAccountCounty = childAccountCounty;
    }

    public String getChildAccountAddress() {
        return childAccountAddress;
    }

    public void setChildAccountAddress(String childAccountAddress) {
        this.childAccountAddress = childAccountAddress;
    }

    public String getChildCurrentProvince() {
        return childCurrentProvince;
    }

    public void setChildCurrentProvince(String childCurrentProvince) {
        this.childCurrentProvince = childCurrentProvince;
    }

    public String getChildCurrentCity() {
        return childCurrentCity;
    }

    public void setChildCurrentCity(String childCurrentCity) {
        this.childCurrentCity = childCurrentCity;
    }

    public String getChildCurrentCounty() {
        return childCurrentCounty;
    }

    public void setChildCurrentCounty(String childCurrentCounty) {
        this.childCurrentCounty = childCurrentCounty;
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

    public String getOrganizationResidentialProvince() {
        return organizationResidentialProvince;
    }

    public void setOrganizationResidentialProvince(String organizationResidentialProvince) {
        this.organizationResidentialProvince = organizationResidentialProvince;
    }

    public String getOrganizationResidentialCity() {
        return organizationResidentialCity;
    }

    public void setOrganizationResidentialCity(String organizationResidentialCity) {
        this.organizationResidentialCity = organizationResidentialCity;
    }

    public String getOrganizationResidentialCounty() {
        return organizationResidentialCounty;
    }

    public void setOrganizationResidentialCounty(String organizationResidentialCounty) {
        this.organizationResidentialCounty = organizationResidentialCounty;
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

    @Override
    public String getStaId() {
        return staId;
    }

    @Override
    public void setStaId(String staId) {
        this.staId = staId;
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
