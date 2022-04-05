package cn.com.personnel.ercp.pi.module.child;

import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;

public class ChildrenBaseInfoExcelVO implements Serializable {
    private static final long serialVersionUID=298765454332345359L;

    private String area;

    @Excel(name = "child_name")
    private String childName;

    @Excel(name = "child_id_no")
    private String childIdNo;

    @Excel(name = "child_tel_no")
    private String childTelNo;

    @Excel(name = "child_nationality")
    private String childNationality;

    @Excel(name = "child_male")
    private String childMale;

    @Excel(name = "child_account_province")
    private String childAccountProvince;

    @Excel(name = "child_account_town")
    private String childAccountTown;

    @Excel(name = "child_account_city")
    private String childAccountCity;

    @Excel(name = "child_account_county")
    private String childAccountCounty;

    @Excel(name = "child_account_address")
    private String childAccountAddress;

    @Excel(name = "child_current_province")
    private String childCurrentProvince;

    @Excel(name = "child_current_city")
    private String childCurrentCity;

    @Excel(name = "child_current_county")
    private String childCurrentCounty;

    @Excel(name = "child_current_town")
    private String childCurrentTown;

    @Excel(name = "child_current_address")
    private String childCurrentAddress;

    @Excel(name = "child_health_status")
    private String childHealthStatus;

    @Excel(name = "child_escalation_type")
    private String childEscalationType;

    @Excel(name = "child_disability_type")
    private String childDisabilityType;

    @Excel(name = "child_disability_level")
    private String childDisabilityLevel;

    @Excel(name = "child_disease_type")
    private String childDiseaseType;

    @Excel(name = "child_school_attendance")
    private String childSchoolAttendance;

    @Excel(name = "child_other_cases")
    private String childOtherCases;

    @Excel(name = "child_poverty_alleviation_implementation")
    private String childPovertyAlleviationImplementation;

    @Excel(name = "child_violation_guardian")
    private String childViolationGuardian;

    @Excel(name = "organization_name")
    private String organizationName;

    @Excel(name = "organization_principal")
    private String organizationPrincipal;

    @Excel(name = "organization_tel_no")
    private String organizationTelNo;

    @Excel(name = "organization_nature")
    private String organizationNature;

    @Excel(name = "organization_residential_province")
    private String organizationResidentialProvince;

    @Excel(name = "organization_residential_city")
    private String organizationResidentialCity;

    @Excel(name = "organization_residential_county")
    private String organizationResidentialCounty;

    @Excel(name = "organization_residential_town")
    private String organizationResidentialTown;

    @Excel(name = "organization_residential_address")
    private String organizationResidentialAddress;

    @Excel(name = "help_suggestions")
    private String helpSuggestions;

    @Excel(name = "security_fee_collection_method")
    private String securityFeeCollectionMethod;

    @Excel(name = "security_fee_collector")
    private String securityFeeCollector;

    @Excel(name = "security_fee_recipient_relationship")
    private String securityFeeRecipientRelationship;

    @Excel(name = "security_fee_guarantee_standard")
    private String securityFeeGuaranteeStandard;

}
