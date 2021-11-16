/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.oaclient.oaXmlObject;

/**
 * @author 36837 更新供应商数据 旧银行卡数据
 */
public class Formson_Change_Supplier_Old {
    private String oldBankCountry;      // 旧银行国家
    private String oldBankcode;         // 旧银行代码
    private String oldAccount;          // 旧银行账户
    private String oldBankLink;         // 旧银行标识(强制)
    private String oldBranch;           // 旧银行分行名称
    private String oldAccountStartTime; // 旧有效期开始
    private String oldAccountDeadTime;  // 旧有效期结束
    private String oldAccountCompany;   // 旧账户持有人
    private String oldBukrs;            // 公司代码
    private String oldButxt;            // 公司名称

    public String getOldBukrs() {
        return oldBukrs;
    }

    public void setOldBukrs(String oldBukrs) {
        this.oldBukrs = oldBukrs;
    }

    public String getOldButxt() {
        return oldButxt;
    }

    public void setOldButxt(String oldButxt) {
        this.oldButxt = oldButxt;
    }

    /**
     * @return the oldBankCountry
     */
    public String getOldBankCountry() {
        return oldBankCountry;
    }

    /**
     * @param oldBankCountry
     *            the oldBankCountry to set
     */
    public void setOldBankCountry(String oldBankCountry) {
        this.oldBankCountry = oldBankCountry;
    }

    /**
     * @return the oldBankcode
     */
    public String getOldBankcode() {
        return oldBankcode;
    }

    /**
     * @param oldBankcode
     *            the oldBankcode to set
     */
    public void setOldBankcode(String oldBankcode) {
        this.oldBankcode = oldBankcode;
    }

    /**
     * @return the oldAccount
     */
    public String getOldAccount() {
        return oldAccount;
    }

    /**
     * @param oldAccount
     *            the oldAccount to set
     */
    public void setOldAccount(String oldAccount) {
        this.oldAccount = oldAccount;
    }

    /**
     * @return the oldBankLink
     */
    public String getOldBankLink() {
        return oldBankLink;
    }

    /**
     * @param oldBankLink
     *            the oldBankLink to set
     */
    public void setOldBankLink(String oldBankLink) {
        this.oldBankLink = oldBankLink;
    }

    /**
     * @return the oldBranch
     */
    public String getOldBranch() {
        return oldBranch;
    }

    /**
     * @param oldBranch
     *            the oldBranch to set
     */
    public void setOldBranch(String oldBranch) {
        this.oldBranch = oldBranch;
    }

    /**
     * @return the oldAccountStartTime
     */
    public String getOldAccountStartTime() {
        return oldAccountStartTime;
    }

    /**
     * @param oldAccountStartTime
     *            the oldAccountStartTime to set
     */
    public void setOldAccountStartTime(String oldAccountStartTime) {
        this.oldAccountStartTime = oldAccountStartTime;
    }

    /**
     * @return the oldAccountDeadTime
     */
    public String getOldAccountDeadTime() {
        return oldAccountDeadTime;
    }

    /**
     * @param oldAccountDeadTime
     *            the oldAccountDeadTime to set
     */
    public void setOldAccountDeadTime(String oldAccountDeadTime) {
        this.oldAccountDeadTime = oldAccountDeadTime;
    }

    /**
     * @return the oldAccountCompany
     */
    public String getOldAccountCompany() {
        return oldAccountCompany;
    }

    /**
     * @param oldAccountCompany
     *            the oldAccountCompany to set
     */
    public void setOldAccountCompany(String oldAccountCompany) {
        this.oldAccountCompany = oldAccountCompany;
    }

}
