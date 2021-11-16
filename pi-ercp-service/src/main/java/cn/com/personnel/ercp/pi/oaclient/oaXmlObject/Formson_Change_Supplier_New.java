/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.oaclient.oaXmlObject;

/**
 * @author 36837 新银行卡数据
 */
public class Formson_Change_Supplier_New {
    private String newBankCountry;      // 旧银行国家
    private String newBankcode;         // 旧银行代码
    private String newAccount;          // 旧银行账户
    private String newBankLink;         // 旧银行标识(强制)
    private String newBranch;           // 旧银行分行名称
    private String newAccountStartTime; // 旧有效期开始
    private String newAccountDeadTime;  // 旧有效期结束
    private String newAccountCompany;   // 旧账户持有人
    private String newBukrs;            // 公司代码
    private String newButxt;            // 公司名称

    public String getNewBukrs() {
        return newBukrs;
    }

    public void setNewBukrs(String newBukrs) {
        this.newBukrs = newBukrs;
    }

    public String getNewButxt() {
        return newButxt;
    }

    public void setNewButxt(String newButxt) {
        this.newButxt = newButxt;
    }

    /**
     * @return the newBankCountry
     */
    public String getNewBankCountry() {
        return newBankCountry;
    }

    /**
     * @param newBankCountry
     *            the newBankCountry to set
     */
    public void setNewBankCountry(String newBankCountry) {
        this.newBankCountry = newBankCountry;
    }

    /**
     * @return the newBankcode
     */
    public String getNewBankcode() {
        return newBankcode;
    }

    /**
     * @param newBankcode
     *            the newBankcode to set
     */
    public void setNewBankcode(String newBankcode) {
        this.newBankcode = newBankcode;
    }

    /**
     * @return the newAccount
     */
    public String getNewAccount() {
        return newAccount;
    }

    /**
     * @param newAccount
     *            the newAccount to set
     */
    public void setNewAccount(String newAccount) {
        this.newAccount = newAccount;
    }

    /**
     * @return the newBankLink
     */
    public String getNewBankLink() {
        return newBankLink;
    }

    /**
     * @param newBankLink
     *            the newBankLink to set
     */
    public void setNewBankLink(String newBankLink) {
        this.newBankLink = newBankLink;
    }

    /**
     * @return the newbranch
     */
    public String getNewBranch() {
        return newBranch;
    }

    /**
     * @param newBranch
     *            the newbranch to set
     */
    public void setNewBranch(String newBranch) {
        this.newBranch = newBranch;
    }

    /**
     * @return the newAccountStartTime
     */
    public String getNewAccountStartTime() {
        return newAccountStartTime;
    }

    /**
     * @param newAccountStartTime
     *            the newAccountStartTime to set
     */
    public void setNewAccountStartTime(String newAccountStartTime) {
        this.newAccountStartTime = newAccountStartTime;
    }

    /**
     * @return the newAccountDeadTime
     */
    public String getNewAccountDeadTime() {
        return newAccountDeadTime;
    }

    /**
     * @param newAccountDeadTime
     *            the newAccountDeadTime to set
     */
    public void setNewAccountDeadTime(String newAccountDeadTime) {
        this.newAccountDeadTime = newAccountDeadTime;
    }

    /**
     * @return the newAccountCompany
     */
    public String getNewAccountCompany() {
        return newAccountCompany;
    }

    /**
     * @param newAccountCompany
     *            the newAccountCompany to set
     */
    public void setNewAccountCompany(String newAccountCompany) {
        this.newAccountCompany = newAccountCompany;
    }

}
