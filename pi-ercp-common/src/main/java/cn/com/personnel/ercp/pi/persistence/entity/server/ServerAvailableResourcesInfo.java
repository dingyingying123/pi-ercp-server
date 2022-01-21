package cn.com.personnel.ercp.pi.persistence.entity.server;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_available_resources_info")
public class ServerAvailableResourcesInfo {
    @Id
    @Column(name = "ava_id")
    @GeneratedValue(generator = "JDBC")
    private String avaId;

    @Column(name = "sta_id")
    private String staId;

    @Column(name = "child_id")
    private String childId;

    @Column(name = "available_no")
    private String availableNo;

    @Column(name = "child_name")
    private String childName;

    @Column(name = "available_date")
    private String availableDate;

    @Column(name = "children_service_agency_tel")
    private String childrenServiceAgencyTel;

    @Column(name = "children_service_agency_address")
    private String childrenServiceAgencyAddress;

    @Column(name = "children_service_agency_can_help")
    private String childrenServiceAgencyCanHelp;

    @Column(name = "children_hospital_tel")
    private String childrenHospitalTel;

    @Column(name = "children_hospital_address")
    private String childrenHospitalAddress;

    @Column(name = "children_hospital_can_help")
    private String childrenHospitalCanHelp;

    @Column(name = "private_service_organization_tel")
    private String privateServiceOrganizationTel;

    @Column(name = "private_service_organization_address")
    private String privateServiceOrganizationAddress;

    @Column(name = "private_service_organization_can_help")
    private String privateServiceOrganizationCanHelp;

    @Column(name = "various_foundations_tel")
    private String variousFoundationsTel;

    @Column(name = "various_foundations_address")
    private String variousFoundationsAddress;

    @Column(name = "various_foundations_can_help")
    private String variousFoundationsCanHelp;

    @Column(name = "community_committees_tel")
    private String communityCommitteesTel;

    @Column(name = "community_committees_address")
    private String communityCommitteesAddress;

    @Column(name = "community_committees_can_help")
    private String communityCommitteesCanHelp;

    @Column(name = "community_hospital_tel")
    private String communityHospitalTel;

    @Column(name = "community_hospital_address")
    private String communityHospitalAddress;

    @Column(name = "community_hospital_can_help")
    private String communityHospitalCanHelp;

    @Column(name = "community_volunteers_tel")
    private String communityVolunteersTel;

    @Column(name = "community_volunteers_address")
    private String communityVolunteersAddress;

    @Column(name = "community_volunteers_can_help")
    private String communityVolunteersCanHelp;

    @Column(name = "community_organization_community_hospital_tel")
    private String communityOrganizationCommunityHospitalTel;

    @Column(name = "community_organization_community_hospital_address")
    private String communityOrganizationCommunityHospitalAddress;

    @Column(name = "community_organization_community_hospital_can_help")
    private String communityOrganizationCommunityHospitalCanHelp;

    @Column(name = "community_unit_tel")
    private String communityUnitTel;

    @Column(name = "community_unit_address")
    private String communityUnitAddress;

    @Column(name = "community_unit_can_help")
    private String communityUnitCanHelp;

    @Column(name = "nearby_police_station_tel")
    private String nearbyPoliceStationTel;

    @Column(name = "nearby_police_station_address")
    private String nearbyPoliceStationAddress;

    @Column(name = "nearby_police_station_can_help")
    private String nearbyPoliceStationCanHelp;

    @Column(name = "school_principal_tel")
    private String schoolPrincipalTel;

    @Column(name = "school_principal_address")
    private String schoolPrincipalAddress;

    @Column(name = "school_principal_can_help")
    private String schoolPrincipalCanHelp;

    @Column(name = "school_counselor_tel")
    private String schoolCounselorTel;

    @Column(name = "school_counselor_address")
    private String schoolCounselorAddress;

    @Column(name = "school_counselor_can_help")
    private String schoolCounselorCanHelp;

    @Column(name = "head_teacher_tel")
    private String headTeacherTel;

    @Column(name = "head_teacher_address")
    private String headTeacherAddress;

    @Column(name = "head_teacher_can_help")
    private String headTeacherCanHelp;

    @Column(name = "school_counseling_teacher_tel")
    private String schoolCounselingTeacherTel;

    @Column(name = "school_counseling_teacher_address")
    private String schoolCounselingTeacherAddress;

    @Column(name = "school_counseling_teacher_can_help")
    private String schoolCounselingTeacherCanHelp;

    @Column(name = "various_related_policies_tel")
    private String variousRelatedPoliciesTel;

    @Column(name = "various_related_policies_address")
    private String variousRelatedPoliciesAddress;

    @Column(name = "various_related_policies_can_help")
    private String variousRelatedPoliciesCanHelp;

    @Column(name = "care_next_generation_committee_tel")
    private String careNextGenerationCommitteeTel;

    @Column(name = "care_next_generation_committee_address")
    private String careNextGenerationCommitteeAddress;

    @Column(name = "care_next_generation_committee_can_help")
    private String careNextGenerationCommitteeCanHelp;

    @Column(name = "local_civil_affairs_department_tel")
    private String localCivilAffairsDepartmentTel;

    @Column(name = "local_civil_affairs_department_address")
    private String localCivilAffairsDepartmentAddress;

    @Column(name = "local_civil_affairs_department_can_help")
    private String localCivilAffairsDepartmentCanHelp;

    @Column(name = "local_women_federation_tel")
    private String localWomenFederationTel;

    @Column(name = "local_women_federation_address")
    private String localWomenFederationAddress;

    @Column(name = "local_women_federation_can_help")
    private String localWomenFederationCanHelp;

    @Column(name = "local_education_expert_tel")
    private String localEducationExpertTel;

    @Column(name = "local_education_expert_address")
    private String localEducationExpertAddress;

    @Column(name = "local_education_expert_can_help")
    private String localEducationExpertCanHelp;

    @Column(name = "local_childcare_expert_tel")
    private String localChildcareExpertTel;

    @Column(name = "local_childcare_expert_address")
    private String localChildcareExpertAddress;

    @Column(name = "local_childcare_expert_can_help")
    private String localChildcareExpertCanHelp;

    @Column(name = "policy_resources_other_tel")
    private String policyResourcesOtherTel;

    @Column(name = "policy_resources_other_address")
    private String policyResourcesOtherAddress;

    @Column(name = "policy_resources_other_can_help")
    private String policyResourcesOtherCanHelp;

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
        return "ServerAvailableResourcesInfo{" +
                "avaId='" + avaId + '\'' +
                ", staId='" + staId + '\'' +
                ", childId='" + childId + '\'' +
                ", availableNo='" + availableNo + '\'' +
                ", childName='" + childName + '\'' +
                ", availableDate='" + availableDate + '\'' +
                ", childrenServiceAgencyTel='" + childrenServiceAgencyTel + '\'' +
                ", childrenServiceAgencyAddress='" + childrenServiceAgencyAddress + '\'' +
                ", childrenServiceAgencyCanHelp='" + childrenServiceAgencyCanHelp + '\'' +
                ", childrenHospitalTel='" + childrenHospitalTel + '\'' +
                ", childrenHospitalAddress='" + childrenHospitalAddress + '\'' +
                ", childrenHospitalCanHelp='" + childrenHospitalCanHelp + '\'' +
                ", privateServiceOrganizationTel='" + privateServiceOrganizationTel + '\'' +
                ", privateServiceOrganizationAddress='" + privateServiceOrganizationAddress + '\'' +
                ", privateServiceOrganizationCanHelp='" + privateServiceOrganizationCanHelp + '\'' +
                ", variousFoundationsTel='" + variousFoundationsTel + '\'' +
                ", variousFoundationsAddress='" + variousFoundationsAddress + '\'' +
                ", variousFoundationsCanHelp='" + variousFoundationsCanHelp + '\'' +
                ", communityCommitteesTel='" + communityCommitteesTel + '\'' +
                ", communityCommitteesAddress='" + communityCommitteesAddress + '\'' +
                ", communityCommitteesCanHelp='" + communityCommitteesCanHelp + '\'' +
                ", communityHospitalTel='" + communityHospitalTel + '\'' +
                ", communityHospitalAddress='" + communityHospitalAddress + '\'' +
                ", communityHospitalCanHelp='" + communityHospitalCanHelp + '\'' +
                ", communityVolunteersTel='" + communityVolunteersTel + '\'' +
                ", communityVolunteersAddress='" + communityVolunteersAddress + '\'' +
                ", communityVolunteersCanHelp='" + communityVolunteersCanHelp + '\'' +
                ", communityOrganizationCommunityHospitalTel='" + communityOrganizationCommunityHospitalTel + '\'' +
                ", communityOrganizationCommunityHospitalAddress='" + communityOrganizationCommunityHospitalAddress + '\'' +
                ", communityOrganizationCommunityHospitalCanHelp='" + communityOrganizationCommunityHospitalCanHelp + '\'' +
                ", communityUnitTel='" + communityUnitTel + '\'' +
                ", communityUnitAddress='" + communityUnitAddress + '\'' +
                ", communityUnitCanHelp='" + communityUnitCanHelp + '\'' +
                ", nearbyPoliceStationTel='" + nearbyPoliceStationTel + '\'' +
                ", nearbyPoliceStationAddress='" + nearbyPoliceStationAddress + '\'' +
                ", nearbyPoliceStationCanHelp='" + nearbyPoliceStationCanHelp + '\'' +
                ", schoolPrincipalTel='" + schoolPrincipalTel + '\'' +
                ", schoolPrincipalAddress='" + schoolPrincipalAddress + '\'' +
                ", schoolPrincipalCanHelp='" + schoolPrincipalCanHelp + '\'' +
                ", schoolCounselorTel='" + schoolCounselorTel + '\'' +
                ", schoolCounselorAddress='" + schoolCounselorAddress + '\'' +
                ", schoolCounselorCanHelp='" + schoolCounselorCanHelp + '\'' +
                ", headTeacherTel='" + headTeacherTel + '\'' +
                ", headTeacherAddress='" + headTeacherAddress + '\'' +
                ", headTeacherCanHelp='" + headTeacherCanHelp + '\'' +
                ", schoolCounselingTeacherTel='" + schoolCounselingTeacherTel + '\'' +
                ", schoolCounselingTeacherAddress='" + schoolCounselingTeacherAddress + '\'' +
                ", schoolCounselingTeacherCanHelp='" + schoolCounselingTeacherCanHelp + '\'' +
                ", variousRelatedPoliciesTel='" + variousRelatedPoliciesTel + '\'' +
                ", variousRelatedPoliciesAddress='" + variousRelatedPoliciesAddress + '\'' +
                ", variousRelatedPoliciesCanHelp='" + variousRelatedPoliciesCanHelp + '\'' +
                ", careNextGenerationCommitteeTel='" + careNextGenerationCommitteeTel + '\'' +
                ", careNextGenerationCommitteeAddress='" + careNextGenerationCommitteeAddress + '\'' +
                ", careNextGenerationCommitteeCanHelp='" + careNextGenerationCommitteeCanHelp + '\'' +
                ", localCivilAffairsDepartmentTel='" + localCivilAffairsDepartmentTel + '\'' +
                ", localCivilAffairsDepartmentAddress='" + localCivilAffairsDepartmentAddress + '\'' +
                ", localCivilAffairsDepartmentCanHelp='" + localCivilAffairsDepartmentCanHelp + '\'' +
                ", localWomenFederationTel='" + localWomenFederationTel + '\'' +
                ", localWomenFederationAddress='" + localWomenFederationAddress + '\'' +
                ", localWomenFederationCanHelp='" + localWomenFederationCanHelp + '\'' +
                ", localEducationExpertTel='" + localEducationExpertTel + '\'' +
                ", localEducationExpertAddress='" + localEducationExpertAddress + '\'' +
                ", localEducationExpertCanHelp='" + localEducationExpertCanHelp + '\'' +
                ", localChildcareExpertTel='" + localChildcareExpertTel + '\'' +
                ", localChildcareExpertAddress='" + localChildcareExpertAddress + '\'' +
                ", localChildcareExpertCanHelp='" + localChildcareExpertCanHelp + '\'' +
                ", policyResourcesOtherTel='" + policyResourcesOtherTel + '\'' +
                ", policyResourcesOtherAddress='" + policyResourcesOtherAddress + '\'' +
                ", policyResourcesOtherCanHelp='" + policyResourcesOtherCanHelp + '\'' +
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
     * @return ava_id
     */
    public String getAvaId() {
        return avaId;
    }

    /**
     * @param avaId
     */
    public void setAvaId(String avaId) {
        this.avaId = avaId;
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
     * @return available_no
     */
    public String getAvailableNo() {
        return availableNo;
    }

    /**
     * @param availableNo
     */
    public void setAvailableNo(String availableNo) {
        this.availableNo = availableNo;
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
     * @return available_date
     */
    public String getAvailableDate() {
        return availableDate;
    }

    /**
     * @param availableDate
     */
    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }

    /**
     * @return children_service_agency_tel
     */
    public String getChildrenServiceAgencyTel() {
        return childrenServiceAgencyTel;
    }

    /**
     * @param childrenServiceAgencyTel
     */
    public void setChildrenServiceAgencyTel(String childrenServiceAgencyTel) {
        this.childrenServiceAgencyTel = childrenServiceAgencyTel;
    }

    /**
     * @return children_service_agency_address
     */
    public String getChildrenServiceAgencyAddress() {
        return childrenServiceAgencyAddress;
    }

    /**
     * @param childrenServiceAgencyAddress
     */
    public void setChildrenServiceAgencyAddress(String childrenServiceAgencyAddress) {
        this.childrenServiceAgencyAddress = childrenServiceAgencyAddress;
    }

    /**
     * @return children_service_agency_can_help
     */
    public String getChildrenServiceAgencyCanHelp() {
        return childrenServiceAgencyCanHelp;
    }

    /**
     * @param childrenServiceAgencyCanHelp
     */
    public void setChildrenServiceAgencyCanHelp(String childrenServiceAgencyCanHelp) {
        this.childrenServiceAgencyCanHelp = childrenServiceAgencyCanHelp;
    }

    /**
     * @return children_hospital_tel
     */
    public String getChildrenHospitalTel() {
        return childrenHospitalTel;
    }

    /**
     * @param childrenHospitalTel
     */
    public void setChildrenHospitalTel(String childrenHospitalTel) {
        this.childrenHospitalTel = childrenHospitalTel;
    }

    /**
     * @return children_hospital_address
     */
    public String getChildrenHospitalAddress() {
        return childrenHospitalAddress;
    }

    /**
     * @param childrenHospitalAddress
     */
    public void setChildrenHospitalAddress(String childrenHospitalAddress) {
        this.childrenHospitalAddress = childrenHospitalAddress;
    }

    /**
     * @return children_hospital_can_help
     */
    public String getChildrenHospitalCanHelp() {
        return childrenHospitalCanHelp;
    }

    /**
     * @param childrenHospitalCanHelp
     */
    public void setChildrenHospitalCanHelp(String childrenHospitalCanHelp) {
        this.childrenHospitalCanHelp = childrenHospitalCanHelp;
    }

    /**
     * @return private_service_organization_tel
     */
    public String getPrivateServiceOrganizationTel() {
        return privateServiceOrganizationTel;
    }

    /**
     * @param privateServiceOrganizationTel
     */
    public void setPrivateServiceOrganizationTel(String privateServiceOrganizationTel) {
        this.privateServiceOrganizationTel = privateServiceOrganizationTel;
    }

    /**
     * @return private_service_organization_address
     */
    public String getPrivateServiceOrganizationAddress() {
        return privateServiceOrganizationAddress;
    }

    /**
     * @param privateServiceOrganizationAddress
     */
    public void setPrivateServiceOrganizationAddress(String privateServiceOrganizationAddress) {
        this.privateServiceOrganizationAddress = privateServiceOrganizationAddress;
    }

    /**
     * @return private_service_organization_can_help
     */
    public String getPrivateServiceOrganizationCanHelp() {
        return privateServiceOrganizationCanHelp;
    }

    /**
     * @param privateServiceOrganizationCanHelp
     */
    public void setPrivateServiceOrganizationCanHelp(String privateServiceOrganizationCanHelp) {
        this.privateServiceOrganizationCanHelp = privateServiceOrganizationCanHelp;
    }

    /**
     * @return various_foundations_tel
     */
    public String getVariousFoundationsTel() {
        return variousFoundationsTel;
    }

    /**
     * @param variousFoundationsTel
     */
    public void setVariousFoundationsTel(String variousFoundationsTel) {
        this.variousFoundationsTel = variousFoundationsTel;
    }

    /**
     * @return various_foundations_address
     */
    public String getVariousFoundationsAddress() {
        return variousFoundationsAddress;
    }

    /**
     * @param variousFoundationsAddress
     */
    public void setVariousFoundationsAddress(String variousFoundationsAddress) {
        this.variousFoundationsAddress = variousFoundationsAddress;
    }

    /**
     * @return various_foundations_can_help
     */
    public String getVariousFoundationsCanHelp() {
        return variousFoundationsCanHelp;
    }

    /**
     * @param variousFoundationsCanHelp
     */
    public void setVariousFoundationsCanHelp(String variousFoundationsCanHelp) {
        this.variousFoundationsCanHelp = variousFoundationsCanHelp;
    }

    /**
     * @return community_committees_tel
     */
    public String getCommunityCommitteesTel() {
        return communityCommitteesTel;
    }

    /**
     * @param communityCommitteesTel
     */
    public void setCommunityCommitteesTel(String communityCommitteesTel) {
        this.communityCommitteesTel = communityCommitteesTel;
    }

    /**
     * @return community_committees_address
     */
    public String getCommunityCommitteesAddress() {
        return communityCommitteesAddress;
    }

    /**
     * @param communityCommitteesAddress
     */
    public void setCommunityCommitteesAddress(String communityCommitteesAddress) {
        this.communityCommitteesAddress = communityCommitteesAddress;
    }

    /**
     * @return community_committees_can_help
     */
    public String getCommunityCommitteesCanHelp() {
        return communityCommitteesCanHelp;
    }

    /**
     * @param communityCommitteesCanHelp
     */
    public void setCommunityCommitteesCanHelp(String communityCommitteesCanHelp) {
        this.communityCommitteesCanHelp = communityCommitteesCanHelp;
    }

    /**
     * @return community_hospital_tel
     */
    public String getCommunityHospitalTel() {
        return communityHospitalTel;
    }

    /**
     * @param communityHospitalTel
     */
    public void setCommunityHospitalTel(String communityHospitalTel) {
        this.communityHospitalTel = communityHospitalTel;
    }

    /**
     * @return community_hospital_address
     */
    public String getCommunityHospitalAddress() {
        return communityHospitalAddress;
    }

    /**
     * @param communityHospitalAddress
     */
    public void setCommunityHospitalAddress(String communityHospitalAddress) {
        this.communityHospitalAddress = communityHospitalAddress;
    }

    /**
     * @return community_hospital_can_help
     */
    public String getCommunityHospitalCanHelp() {
        return communityHospitalCanHelp;
    }

    /**
     * @param communityHospitalCanHelp
     */
    public void setCommunityHospitalCanHelp(String communityHospitalCanHelp) {
        this.communityHospitalCanHelp = communityHospitalCanHelp;
    }

    /**
     * @return community_volunteers_tel
     */
    public String getCommunityVolunteersTel() {
        return communityVolunteersTel;
    }

    /**
     * @param communityVolunteersTel
     */
    public void setCommunityVolunteersTel(String communityVolunteersTel) {
        this.communityVolunteersTel = communityVolunteersTel;
    }

    /**
     * @return community_volunteers_address
     */
    public String getCommunityVolunteersAddress() {
        return communityVolunteersAddress;
    }

    /**
     * @param communityVolunteersAddress
     */
    public void setCommunityVolunteersAddress(String communityVolunteersAddress) {
        this.communityVolunteersAddress = communityVolunteersAddress;
    }

    /**
     * @return community_volunteers_can_help
     */
    public String getCommunityVolunteersCanHelp() {
        return communityVolunteersCanHelp;
    }

    /**
     * @param communityVolunteersCanHelp
     */
    public void setCommunityVolunteersCanHelp(String communityVolunteersCanHelp) {
        this.communityVolunteersCanHelp = communityVolunteersCanHelp;
    }

    /**
     * @return community_organization_community_hospital_tel
     */
    public String getCommunityOrganizationCommunityHospitalTel() {
        return communityOrganizationCommunityHospitalTel;
    }

    /**
     * @param communityOrganizationCommunityHospitalTel
     */
    public void setCommunityOrganizationCommunityHospitalTel(String communityOrganizationCommunityHospitalTel) {
        this.communityOrganizationCommunityHospitalTel = communityOrganizationCommunityHospitalTel;
    }

    /**
     * @return community_organization_community_hospital_address
     */
    public String getCommunityOrganizationCommunityHospitalAddress() {
        return communityOrganizationCommunityHospitalAddress;
    }

    /**
     * @param communityOrganizationCommunityHospitalAddress
     */
    public void setCommunityOrganizationCommunityHospitalAddress(String communityOrganizationCommunityHospitalAddress) {
        this.communityOrganizationCommunityHospitalAddress = communityOrganizationCommunityHospitalAddress;
    }

    /**
     * @return community_organization_community_hospital_can_help
     */
    public String getCommunityOrganizationCommunityHospitalCanHelp() {
        return communityOrganizationCommunityHospitalCanHelp;
    }

    /**
     * @param communityOrganizationCommunityHospitalCanHelp
     */
    public void setCommunityOrganizationCommunityHospitalCanHelp(String communityOrganizationCommunityHospitalCanHelp) {
        this.communityOrganizationCommunityHospitalCanHelp = communityOrganizationCommunityHospitalCanHelp;
    }

    /**
     * @return community_unit_tel
     */
    public String getCommunityUnitTel() {
        return communityUnitTel;
    }

    /**
     * @param communityUnitTel
     */
    public void setCommunityUnitTel(String communityUnitTel) {
        this.communityUnitTel = communityUnitTel;
    }

    /**
     * @return community_unit_address
     */
    public String getCommunityUnitAddress() {
        return communityUnitAddress;
    }

    /**
     * @param communityUnitAddress
     */
    public void setCommunityUnitAddress(String communityUnitAddress) {
        this.communityUnitAddress = communityUnitAddress;
    }

    /**
     * @return community_unit_can_help
     */
    public String getCommunityUnitCanHelp() {
        return communityUnitCanHelp;
    }

    /**
     * @param communityUnitCanHelp
     */
    public void setCommunityUnitCanHelp(String communityUnitCanHelp) {
        this.communityUnitCanHelp = communityUnitCanHelp;
    }

    /**
     * @return nearby_police_station_tel
     */
    public String getNearbyPoliceStationTel() {
        return nearbyPoliceStationTel;
    }

    /**
     * @param nearbyPoliceStationTel
     */
    public void setNearbyPoliceStationTel(String nearbyPoliceStationTel) {
        this.nearbyPoliceStationTel = nearbyPoliceStationTel;
    }

    /**
     * @return nearby_police_station_address
     */
    public String getNearbyPoliceStationAddress() {
        return nearbyPoliceStationAddress;
    }

    /**
     * @param nearbyPoliceStationAddress
     */
    public void setNearbyPoliceStationAddress(String nearbyPoliceStationAddress) {
        this.nearbyPoliceStationAddress = nearbyPoliceStationAddress;
    }

    /**
     * @return nearby_police_station_can_help
     */
    public String getNearbyPoliceStationCanHelp() {
        return nearbyPoliceStationCanHelp;
    }

    /**
     * @param nearbyPoliceStationCanHelp
     */
    public void setNearbyPoliceStationCanHelp(String nearbyPoliceStationCanHelp) {
        this.nearbyPoliceStationCanHelp = nearbyPoliceStationCanHelp;
    }

    /**
     * @return school_principal_tel
     */
    public String getSchoolPrincipalTel() {
        return schoolPrincipalTel;
    }

    /**
     * @param schoolPrincipalTel
     */
    public void setSchoolPrincipalTel(String schoolPrincipalTel) {
        this.schoolPrincipalTel = schoolPrincipalTel;
    }

    /**
     * @return school_principal_address
     */
    public String getSchoolPrincipalAddress() {
        return schoolPrincipalAddress;
    }

    /**
     * @param schoolPrincipalAddress
     */
    public void setSchoolPrincipalAddress(String schoolPrincipalAddress) {
        this.schoolPrincipalAddress = schoolPrincipalAddress;
    }

    /**
     * @return school_principal_can_help
     */
    public String getSchoolPrincipalCanHelp() {
        return schoolPrincipalCanHelp;
    }

    /**
     * @param schoolPrincipalCanHelp
     */
    public void setSchoolPrincipalCanHelp(String schoolPrincipalCanHelp) {
        this.schoolPrincipalCanHelp = schoolPrincipalCanHelp;
    }

    /**
     * @return school_counselor_tel
     */
    public String getSchoolCounselorTel() {
        return schoolCounselorTel;
    }

    /**
     * @param schoolCounselorTel
     */
    public void setSchoolCounselorTel(String schoolCounselorTel) {
        this.schoolCounselorTel = schoolCounselorTel;
    }

    /**
     * @return school_counselor_address
     */
    public String getSchoolCounselorAddress() {
        return schoolCounselorAddress;
    }

    /**
     * @param schoolCounselorAddress
     */
    public void setSchoolCounselorAddress(String schoolCounselorAddress) {
        this.schoolCounselorAddress = schoolCounselorAddress;
    }

    /**
     * @return school_counselor_can_help
     */
    public String getSchoolCounselorCanHelp() {
        return schoolCounselorCanHelp;
    }

    /**
     * @param schoolCounselorCanHelp
     */
    public void setSchoolCounselorCanHelp(String schoolCounselorCanHelp) {
        this.schoolCounselorCanHelp = schoolCounselorCanHelp;
    }

    /**
     * @return head_teacher_tel
     */
    public String getHeadTeacherTel() {
        return headTeacherTel;
    }

    /**
     * @param headTeacherTel
     */
    public void setHeadTeacherTel(String headTeacherTel) {
        this.headTeacherTel = headTeacherTel;
    }

    /**
     * @return head_teacher_address
     */
    public String getHeadTeacherAddress() {
        return headTeacherAddress;
    }

    /**
     * @param headTeacherAddress
     */
    public void setHeadTeacherAddress(String headTeacherAddress) {
        this.headTeacherAddress = headTeacherAddress;
    }

    /**
     * @return head_teacher_can_help
     */
    public String getHeadTeacherCanHelp() {
        return headTeacherCanHelp;
    }

    /**
     * @param headTeacherCanHelp
     */
    public void setHeadTeacherCanHelp(String headTeacherCanHelp) {
        this.headTeacherCanHelp = headTeacherCanHelp;
    }

    /**
     * @return school_counseling_teacher_tel
     */
    public String getSchoolCounselingTeacherTel() {
        return schoolCounselingTeacherTel;
    }

    /**
     * @param schoolCounselingTeacherTel
     */
    public void setSchoolCounselingTeacherTel(String schoolCounselingTeacherTel) {
        this.schoolCounselingTeacherTel = schoolCounselingTeacherTel;
    }

    /**
     * @return school_counseling_teacher_address
     */
    public String getSchoolCounselingTeacherAddress() {
        return schoolCounselingTeacherAddress;
    }

    /**
     * @param schoolCounselingTeacherAddress
     */
    public void setSchoolCounselingTeacherAddress(String schoolCounselingTeacherAddress) {
        this.schoolCounselingTeacherAddress = schoolCounselingTeacherAddress;
    }

    /**
     * @return school_counseling_teacher_can_help
     */
    public String getSchoolCounselingTeacherCanHelp() {
        return schoolCounselingTeacherCanHelp;
    }

    /**
     * @param schoolCounselingTeacherCanHelp
     */
    public void setSchoolCounselingTeacherCanHelp(String schoolCounselingTeacherCanHelp) {
        this.schoolCounselingTeacherCanHelp = schoolCounselingTeacherCanHelp;
    }

    /**
     * @return various_related_policies_tel
     */
    public String getVariousRelatedPoliciesTel() {
        return variousRelatedPoliciesTel;
    }

    /**
     * @param variousRelatedPoliciesTel
     */
    public void setVariousRelatedPoliciesTel(String variousRelatedPoliciesTel) {
        this.variousRelatedPoliciesTel = variousRelatedPoliciesTel;
    }

    /**
     * @return various_related_policies_address
     */
    public String getVariousRelatedPoliciesAddress() {
        return variousRelatedPoliciesAddress;
    }

    /**
     * @param variousRelatedPoliciesAddress
     */
    public void setVariousRelatedPoliciesAddress(String variousRelatedPoliciesAddress) {
        this.variousRelatedPoliciesAddress = variousRelatedPoliciesAddress;
    }

    /**
     * @return various_related_policies_can_help
     */
    public String getVariousRelatedPoliciesCanHelp() {
        return variousRelatedPoliciesCanHelp;
    }

    /**
     * @param variousRelatedPoliciesCanHelp
     */
    public void setVariousRelatedPoliciesCanHelp(String variousRelatedPoliciesCanHelp) {
        this.variousRelatedPoliciesCanHelp = variousRelatedPoliciesCanHelp;
    }

    /**
     * @return care_next_generation_committee_tel
     */
    public String getCareNextGenerationCommitteeTel() {
        return careNextGenerationCommitteeTel;
    }

    /**
     * @param careNextGenerationCommitteeTel
     */
    public void setCareNextGenerationCommitteeTel(String careNextGenerationCommitteeTel) {
        this.careNextGenerationCommitteeTel = careNextGenerationCommitteeTel;
    }

    /**
     * @return care_next_generation_committee_address
     */
    public String getCareNextGenerationCommitteeAddress() {
        return careNextGenerationCommitteeAddress;
    }

    /**
     * @param careNextGenerationCommitteeAddress
     */
    public void setCareNextGenerationCommitteeAddress(String careNextGenerationCommitteeAddress) {
        this.careNextGenerationCommitteeAddress = careNextGenerationCommitteeAddress;
    }

    /**
     * @return care_next_generation_committee_can_help
     */
    public String getCareNextGenerationCommitteeCanHelp() {
        return careNextGenerationCommitteeCanHelp;
    }

    /**
     * @param careNextGenerationCommitteeCanHelp
     */
    public void setCareNextGenerationCommitteeCanHelp(String careNextGenerationCommitteeCanHelp) {
        this.careNextGenerationCommitteeCanHelp = careNextGenerationCommitteeCanHelp;
    }

    /**
     * @return local_civil_affairs_department_tel
     */
    public String getLocalCivilAffairsDepartmentTel() {
        return localCivilAffairsDepartmentTel;
    }

    /**
     * @param localCivilAffairsDepartmentTel
     */
    public void setLocalCivilAffairsDepartmentTel(String localCivilAffairsDepartmentTel) {
        this.localCivilAffairsDepartmentTel = localCivilAffairsDepartmentTel;
    }

    /**
     * @return local_civil_affairs_department_address
     */
    public String getLocalCivilAffairsDepartmentAddress() {
        return localCivilAffairsDepartmentAddress;
    }

    /**
     * @param localCivilAffairsDepartmentAddress
     */
    public void setLocalCivilAffairsDepartmentAddress(String localCivilAffairsDepartmentAddress) {
        this.localCivilAffairsDepartmentAddress = localCivilAffairsDepartmentAddress;
    }

    /**
     * @return local_civil_affairs_department_can_help
     */
    public String getLocalCivilAffairsDepartmentCanHelp() {
        return localCivilAffairsDepartmentCanHelp;
    }

    /**
     * @param localCivilAffairsDepartmentCanHelp
     */
    public void setLocalCivilAffairsDepartmentCanHelp(String localCivilAffairsDepartmentCanHelp) {
        this.localCivilAffairsDepartmentCanHelp = localCivilAffairsDepartmentCanHelp;
    }

    /**
     * @return local_women_federation_tel
     */
    public String getLocalWomenFederationTel() {
        return localWomenFederationTel;
    }

    /**
     * @param localWomenFederationTel
     */
    public void setLocalWomenFederationTel(String localWomenFederationTel) {
        this.localWomenFederationTel = localWomenFederationTel;
    }

    /**
     * @return local_women_federation_address
     */
    public String getLocalWomenFederationAddress() {
        return localWomenFederationAddress;
    }

    /**
     * @param localWomenFederationAddress
     */
    public void setLocalWomenFederationAddress(String localWomenFederationAddress) {
        this.localWomenFederationAddress = localWomenFederationAddress;
    }

    /**
     * @return local_women_federation_can_help
     */
    public String getLocalWomenFederationCanHelp() {
        return localWomenFederationCanHelp;
    }

    /**
     * @param localWomenFederationCanHelp
     */
    public void setLocalWomenFederationCanHelp(String localWomenFederationCanHelp) {
        this.localWomenFederationCanHelp = localWomenFederationCanHelp;
    }

    /**
     * @return local_education_expert_tel
     */
    public String getLocalEducationExpertTel() {
        return localEducationExpertTel;
    }

    /**
     * @param localEducationExpertTel
     */
    public void setLocalEducationExpertTel(String localEducationExpertTel) {
        this.localEducationExpertTel = localEducationExpertTel;
    }

    /**
     * @return local_education_expert_address
     */
    public String getLocalEducationExpertAddress() {
        return localEducationExpertAddress;
    }

    /**
     * @param localEducationExpertAddress
     */
    public void setLocalEducationExpertAddress(String localEducationExpertAddress) {
        this.localEducationExpertAddress = localEducationExpertAddress;
    }

    /**
     * @return local_education_expert_can_help
     */
    public String getLocalEducationExpertCanHelp() {
        return localEducationExpertCanHelp;
    }

    /**
     * @param localEducationExpertCanHelp
     */
    public void setLocalEducationExpertCanHelp(String localEducationExpertCanHelp) {
        this.localEducationExpertCanHelp = localEducationExpertCanHelp;
    }

    /**
     * @return local_childcare_expert_tel
     */
    public String getLocalChildcareExpertTel() {
        return localChildcareExpertTel;
    }

    /**
     * @param localChildcareExpertTel
     */
    public void setLocalChildcareExpertTel(String localChildcareExpertTel) {
        this.localChildcareExpertTel = localChildcareExpertTel;
    }

    /**
     * @return local_childcare_expert_address
     */
    public String getLocalChildcareExpertAddress() {
        return localChildcareExpertAddress;
    }

    /**
     * @param localChildcareExpertAddress
     */
    public void setLocalChildcareExpertAddress(String localChildcareExpertAddress) {
        this.localChildcareExpertAddress = localChildcareExpertAddress;
    }

    /**
     * @return local_childcare_expert_can_help
     */
    public String getLocalChildcareExpertCanHelp() {
        return localChildcareExpertCanHelp;
    }

    /**
     * @param localChildcareExpertCanHelp
     */
    public void setLocalChildcareExpertCanHelp(String localChildcareExpertCanHelp) {
        this.localChildcareExpertCanHelp = localChildcareExpertCanHelp;
    }

    /**
     * @return policy_resources_other_tel
     */
    public String getPolicyResourcesOtherTel() {
        return policyResourcesOtherTel;
    }

    /**
     * @param policyResourcesOtherTel
     */
    public void setPolicyResourcesOtherTel(String policyResourcesOtherTel) {
        this.policyResourcesOtherTel = policyResourcesOtherTel;
    }

    /**
     * @return policy_resources_other_address
     */
    public String getPolicyResourcesOtherAddress() {
        return policyResourcesOtherAddress;
    }

    /**
     * @param policyResourcesOtherAddress
     */
    public void setPolicyResourcesOtherAddress(String policyResourcesOtherAddress) {
        this.policyResourcesOtherAddress = policyResourcesOtherAddress;
    }

    /**
     * @return policy_resources_other_can_help
     */
    public String getPolicyResourcesOtherCanHelp() {
        return policyResourcesOtherCanHelp;
    }

    /**
     * @param policyResourcesOtherCanHelp
     */
    public void setPolicyResourcesOtherCanHelp(String policyResourcesOtherCanHelp) {
        this.policyResourcesOtherCanHelp = policyResourcesOtherCanHelp;
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