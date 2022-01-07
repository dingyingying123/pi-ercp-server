package cn.com.personnel.ercp.pi.persistence.entity.child;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pi_children_guardian_info")
public class PiChildrenGuardianInfo {
    @Id
    @Column(name = "guardian_id")
    @GeneratedValue(generator = "JDBC")
    private String guardianId;

    @Column(name = "child_id")
    private String childId;

    @Column(name = "child_name")
    private String childName;

    private String name;

    @Column(name = "id_no")
    private String idNo;

    @Column(name = "tel_no")
    private String telNo;

    @Column(name = "account_province")
    private String accountProvince;

    @Column(name = "account_town")
    private String accountTown;

    @Column(name = "account_city")
    private String accountCity;

    @Column(name = "account_county")
    private String accountCounty;

    @Column(name = "account_address")
    private String accountAddress;

    @Column(name = "current_province")
    private String currentProvince;

    @Column(name = "current_town")
    private String currentTown;

    @Column(name = "current_city")
    private String currentCity;

    @Column(name = "current_county")
    private String currentCounty;

    @Column(name = "current_address")
    private String currentAddress;

    @Column(name = "health_status")
    private String healthStatus;

    @Column(name = "disability_type")
    private String disabilityType;

    @Column(name = "disability_level")
    private String disabilityLevel;

    @Column(name = "disease_type")
    private String diseaseType;

    @Column(name = "family_income")
    private String familyIncome;

    @Column(name = "other_cases")
    private String otherCases;

    private String relationship;

    private String reasons;

    private String isdelete;

    private String status;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;


    /**
     * @return guardian_id
     */
    public String getGuardianId() {
        return guardianId;
    }

    /**
     * @param guardianId
     */
    public void setGuardianId(String guardianId) {
        this.guardianId = guardianId;
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return id_no
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * @param idNo
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * @return tel_no
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    /**
     * @return account_town
     */
    public String getAccountTown() {
        return accountTown;
    }

    /**
     * @param accountTown
     */
    public void setAccountTown(String accountTown) {
        this.accountTown = accountTown;
    }

    /**
     * @return account_city
     */
    public String getAccountCity() {
        return accountCity;
    }

    /**
     * @param accountCity
     */
    public void setAccountCity(String accountCity) {
        this.accountCity = accountCity;
    }

    /**
     * @return account_county
     */
    public String getAccountCounty() {
        return accountCounty;
    }

    /**
     * @param accountCounty
     */
    public void setAccountCounty(String accountCounty) {
        this.accountCounty = accountCounty;
    }

    /**
     * @return account_address
     */
    public String getAccountAddress() {
        return accountAddress;
    }

    /**
     * @param accountAddress
     */
    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    /**
     * @return current_town
     */
    public String getCurrentTown() {
        return currentTown;
    }

    /**
     * @param currentTown
     */
    public void setCurrentTown(String currentTown) {
        this.currentTown = currentTown;
    }

    /**
     * @return current_city
     */
    public String getCurrentCity() {
        return currentCity;
    }

    /**
     * @param currentCity
     */
    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    /**
     * @return current_county
     */
    public String getCurrentCounty() {
        return currentCounty;
    }

    /**
     * @param currentCounty
     */
    public void setCurrentCounty(String currentCounty) {
        this.currentCounty = currentCounty;
    }

    /**
     * @return current_address
     */
    public String getCurrentAddress() {
        return currentAddress;
    }

    /**
     * @param currentAddress
     */
    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    /**
     * @return health_status
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * @param healthStatus
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * @return disability_type
     */
    public String getDisabilityType() {
        return disabilityType;
    }

    /**
     * @param disabilityType
     */
    public void setDisabilityType(String disabilityType) {
        this.disabilityType = disabilityType;
    }

    /**
     * @return disability_level
     */
    public String getDisabilityLevel() {
        return disabilityLevel;
    }

    /**
     * @param disabilityLevel
     */
    public void setDisabilityLevel(String disabilityLevel) {
        this.disabilityLevel = disabilityLevel;
    }

    /**
     * @return disease_type
     */
    public String getDiseaseType() {
        return diseaseType;
    }

    /**
     * @param diseaseType
     */
    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }

    /**
     * @return family_income
     */
    public String getFamilyIncome() {
        return familyIncome;
    }

    /**
     * @param familyIncome
     */
    public void setFamilyIncome(String familyIncome) {
        this.familyIncome = familyIncome;
    }

    /**
     * @return other_cases
     */
    public String getOtherCases() {
        return otherCases;
    }

    /**
     * @param otherCases
     */
    public void setOtherCases(String otherCases) {
        this.otherCases = otherCases;
    }

    /**
     * @return relationship
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * @param relationship
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * @return reasons
     */
    public String getReasons() {
        return reasons;
    }

    /**
     * @param reasons
     */
    public void setReasons(String reasons) {
        this.reasons = reasons;
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

    public String getAccountProvince() {
        return accountProvince;
    }

    public void setAccountProvince(String accountProvince) {
        this.accountProvince = accountProvince;
    }

    public String getCurrentProvince() {
        return currentProvince;
    }

    public void setCurrentProvince(String currentProvince) {
        this.currentProvince = currentProvince;
    }
}