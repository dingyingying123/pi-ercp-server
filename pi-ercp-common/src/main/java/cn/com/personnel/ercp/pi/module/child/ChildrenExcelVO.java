package cn.com.personnel.ercp.pi.module.child;

import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenGuardianInfo;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.List;

public class ChildrenExcelVO implements Serializable {
    private static final long serialVersionUID=298765454332345359L;
    private List<PiChildrenGuardianInfo> piChildrenGuardianInfoList;
    private String childId;
    private String area;

    @Excel(name = "姓 名")
    private String childName;

    @Excel(name = "身份证号")
    private String childIdNo;

    @Excel(name = "联系电话")
    private String childTelNo;

    @Excel(name = "民 族")
    private String childNationality;

    @Excel(name = "性 别")
    private String childMale;

    @Excel(name = "户口地址")
    private String childAccountAddress;

    @Excel(name = "现住址")
    private String childCurrentAddress;

    @Excel(name = "健康状况")
    private String childHealthStatus;

    @Excel(name = "上报类型")
    private String childEscalationType;

    @Excel(name = "残疾类型")
    private String childDisabilityType;

    @Excel(name = "残疾等级")
    private String childDisabilityLevel;

    @Excel(name = "患病病种")
    private String childDiseaseType;

    @Excel(name = "就学情况")
    private String childSchoolAttendance;

    @Excel(name = "其他情况")
    private String childOtherCases;

    @Excel(name = "社会福利救助扶贫落实情况")
    private String childPovertyAlleviationImplementation;

    @Excel(name = "遭受监护人侵害的情形")
    private String childViolationGuardian;

    @Excel(name = "机构名称")
    private String organizationName;

    @Excel(name = "负责人")
    private String organizationPrincipal;

    @Excel(name = "联系电话")
    private String organizationTelNo;

    @Excel(name = "单位性质")
    private String organizationNature;

    @Excel(name = "居住地址")
    private String organizationResidentialAddress;

    @Excel(name = "帮扶计划")
    private String helpSuggestions;

    @Excel(name = "领取方式")
    private String securityFeeCollectionMethod;

    @Excel(name = "领取人（开户人）")
    private String securityFeeCollector;

    @Excel(name = "领取人与儿童关系")
    private String securityFeeRecipientRelationship;

    @Excel(name = "保障标准")
    private String securityFeeGuaranteeStandard;

    @Excel(name = "核查人签字")
    private String creator;

    @Excel(name = "申请人签字")
    private String applier;

    public List<PiChildrenGuardianInfo> getPiChildrenGuardianInfoList() {
        return piChildrenGuardianInfoList;
    }

    public void setPiChildrenGuardianInfoList(List<PiChildrenGuardianInfo> piChildrenGuardianInfoList) {
        this.piChildrenGuardianInfoList = piChildrenGuardianInfoList;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
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

    public String getChildMale() {
        return childMale;
    }

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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getApplier() {
        return applier;
    }

    public void setApplier(String applier) {
        this.applier = applier;
    }
}
