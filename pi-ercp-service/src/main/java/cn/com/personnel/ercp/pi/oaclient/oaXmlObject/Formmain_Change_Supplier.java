/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.oaclient.oaXmlObject;

/**
 * @author 36837 更新供应商数据
 */
public class Formmain_Change_Supplier {
    private String instanceNO;          // 实例号 传空
    private String userDepartment;      // 所属部门 传空
    private String userOaId;            // 申请人
    private String applicationDate;     // 申请时间
    private String supplierId;          // 实例号
    private String lifnr;          // 供应商编码
    private String oldLanguage;         //语言旧
    private String newLanguage;         //语言新
    private String oldStreet;           // 街道地址
    private String oldHouseNumber;      // 门牌号
    private String oldOrganizationCode; // 组织机构代码
    private String oldEinType;          // 税号类别
    private String oldEinNo;            // 1.三证合一的时候用统一社会信用代码填写
                                        // 2.三证不合一的时候用税务登记证号码填写
                                        // 3.国外供应商的时候用商业执照号填写
    private String oldName;             // 供应商名称
    private String oldAbbreviation;     // 企业简称--xml中的搜索项
    private String oldPostNO;           // 邮编
    private String oldCountry_code;     // 国家 传的是编码值非中文
    private String oldCity;             // 城市
    private String oldAddress;          // 地址描述 传空

    private String newStreet;           // 变更后街道地址
    private String newHouseNumber;      // 变更后门牌号
    private String newOrganizationCode; // 变更后组织机构代码
    private String newEinType;          // 变更后税号类别
    private String newEinNo;            // 变更后税号1.三证合一的时候用统一社会信用代码填写
                                        // 2.三证不合一的时候用税务登记证号码填写
                                        // 3.国外供应商的时候用商业执照号填写
    private String newName;             // 变更后供应商名称
    private String newAbbreviation;     // 变更后企业简称--xml中的搜索项
    private String newPostNO;           // 变更后邮编
    private String newCountry_code;     // 变更后 国家 传的是编码值非中文
    private String newCity;             // 变更后 城市
    private String newAddress;          // 变更后地址描述

    public String getOldLanguage() {
        return oldLanguage;
    }

    public void setOldLanguage(String oldLanguage) {
        this.oldLanguage = oldLanguage;
    }

    public String getNewLanguage() {
        return newLanguage;
    }

    public void setNewLanguage(String newLanguage) {
        this.newLanguage = newLanguage;
    }

    public String getLifnr() {
        return lifnr;
    }

    public void setLifnr(String lifnr) {
        this.lifnr = lifnr;
    }

    /**
     * @return the instanceNO
     */
    public String getInstanceNO() {
        return instanceNO;
    }

    /**
     * @param instanceNO
     *            the instanceNO to set
     */
    public void setInstanceNO(String instanceNO) {
        this.instanceNO = instanceNO;
    }

    /**
     * @return the userDepartment
     */
    public String getUserDepartment() {
        return userDepartment;
    }

    /**
     * @param userDepartment
     *            the userDepartment to set
     */
    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }

    /**
     * @return the userOaId
     */
    public String getUserOaId() {
        return userOaId;
    }

    /**
     * @param userOaId
     *            the userOaId to set
     */
    public void setUserOaId(String userOaId) {
        this.userOaId = userOaId;
    }

    /**
     * @return the applicationDate
     */
    public String getApplicationDate() {
        return applicationDate;
    }

    /**
     * @param applicationDate
     *            the applicationDate to set
     */
    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    /**
     * @return the supplierId
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId
     *            the supplierId to set
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the oldStreet
     */
    public String getOldStreet() {
        return oldStreet;
    }

    /**
     * @param oldStreet
     *            the oldStreet to set
     */
    public void setOldStreet(String oldStreet) {
        this.oldStreet = oldStreet;
    }

    /**
     * @return the oldHouseNumber
     */
    public String getOldHouseNumber() {
        return oldHouseNumber;
    }

    /**
     * @param oldHouseNumber
     *            the oldHouseNumber to set
     */
    public void setOldHouseNumber(String oldHouseNumber) {
        this.oldHouseNumber = oldHouseNumber;
    }

    /**
     * @return the oldOrganizationCode
     */
    public String getOldOrganizationCode() {
        return oldOrganizationCode;
    }

    /**
     * @param oldOrganizationCode
     *            the oldOrganizationCode to set
     */
    public void setOldOrganizationCode(String oldOrganizationCode) {
        this.oldOrganizationCode = oldOrganizationCode;
    }

    /**
     * @return the oldEinType
     */
    public String getOldEinType() {
        return oldEinType;
    }

    /**
     * @param oldEinType
     *            the oldEinType to set
     */
    public void setOldEinType(String oldEinType) {
        this.oldEinType = oldEinType;
    }

    /**
     * @return the oldEinNo
     */
    public String getOldEinNo() {
        return oldEinNo;
    }

    /**
     * @param oldEinNo
     *            the oldEinNo to set
     */
    public void setOldEinNo(String oldEinNo) {
        this.oldEinNo = oldEinNo;
    }

    /**
     * @return the oldName
     */
    public String getOldName() {
        return oldName;
    }

    /**
     * @param oldName
     *            the oldName to set
     */
    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    /**
     * @return the oldAbbreviation
     */
    public String getOldAbbreviation() {
        return oldAbbreviation;
    }

    /**
     * @param oldAbbreviation
     *            the oldAbbreviation to set
     */
    public void setOldAbbreviation(String oldAbbreviation) {
        this.oldAbbreviation = oldAbbreviation;
    }

    /**
     * @return the oldPostNO
     */
    public String getOldPostNO() {
        return oldPostNO;
    }

    /**
     * @param oldPostNO
     *            the oldPostNO to set
     */
    public void setOldPostNO(String oldPostNO) {
        this.oldPostNO = oldPostNO;
    }

    /**
     * @return the oldCountry_code
     */
    public String getOldCountry_code() {
        return oldCountry_code;
    }

    /**
     * @param oldCountry_code
     *            the oldCountry_code to set
     */
    public void setOldCountry_code(String oldCountry_code) {
        this.oldCountry_code = oldCountry_code;
    }

    /**
     * @return the oldCity
     */
    public String getOldCity() {
        return oldCity;
    }

    /**
     * @param oldCity
     *            the oldCity to set
     */
    public void setOldCity(String oldCity) {
        this.oldCity = oldCity;
    }

    /**
     * @return the oldAddress
     */
    public String getOldAddress() {
        return oldAddress;
    }

    /**
     * @param oldAddress
     *            the oldAddress to set
     */
    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    /**
     * @return the newStreet
     */
    public String getNewStreet() {
        return newStreet;
    }

    /**
     * @param newStreet
     *            the newStreet to set
     */
    public void setNewStreet(String newStreet) {
        this.newStreet = newStreet;
    }

    /**
     * @return the newHouseNumber
     */
    public String getNewHouseNumber() {
        return newHouseNumber;
    }

    /**
     * @param newHouseNumber
     *            the newHouseNumber to set
     */
    public void setNewHouseNumber(String newHouseNumber) {
        this.newHouseNumber = newHouseNumber;
    }

    /**
     * @return the newOrganizationCode
     */
    public String getNewOrganizationCode() {
        return newOrganizationCode;
    }

    /**
     * @param newOrganizationCode
     *            the newOrganizationCode to set
     */
    public void setNewOrganizationCode(String newOrganizationCode) {
        this.newOrganizationCode = newOrganizationCode;
    }

    /**
     * @return the newEinType
     */
    public String getNewEinType() {
        return newEinType;
    }

    /**
     * @param newEinType
     *            the newEinType to set
     */
    public void setNewEinType(String newEinType) {
        this.newEinType = newEinType;
    }

    /**
     * @return the newEinNo
     */
    public String getNewEinNo() {
        return newEinNo;
    }

    /**
     * @param newEinNo
     *            the newEinNo to set
     */
    public void setNewEinNo(String newEinNo) {
        this.newEinNo = newEinNo;
    }

    /**
     * @return the newName
     */
    public String getNewName() {
        return newName;
    }

    /**
     * @param newName
     *            the newName to set
     */
    public void setNewName(String newName) {
        this.newName = newName;
    }

    /**
     * @return the newAbbreviation
     */
    public String getNewAbbreviation() {
        return newAbbreviation;
    }

    /**
     * @param newAbbreviation
     *            the newAbbreviation to set
     */
    public void setNewAbbreviation(String newAbbreviation) {
        this.newAbbreviation = newAbbreviation;
    }

    /**
     * @return the newPostNO
     */
    public String getNewPostNO() {
        return newPostNO;
    }

    /**
     * @param newPostNO
     *            the newPostNO to set
     */
    public void setNewPostNO(String newPostNO) {
        this.newPostNO = newPostNO;
    }

    /**
     * @return the newCountry_code
     */
    public String getNewCountry_code() {
        return newCountry_code;
    }

    /**
     * @param newCountry_code
     *            the newCountry_code to set
     */
    public void setNewCountry_code(String newCountry_code) {
        this.newCountry_code = newCountry_code;
    }

    /**
     * @return the newCity
     */
    public String getNewCity() {
        return newCity;
    }

    /**
     * @param newCity
     *            the newCity to set
     */
    public void setNewCity(String newCity) {
        this.newCity = newCity;
    }

    /**
     * @return the newAddress
     */
    public String getNewAddress() {
        return newAddress;
    }

    /**
     * @param newAddress
     *            the newAddress to set
     */
    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

}
