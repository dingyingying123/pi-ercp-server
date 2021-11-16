/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.ca.mydbpersistence.entity;

/**
 * @author 36467
 *
 */
public class PeopleJson {

    /**
     * 工号
     */
    private String pernr;
    /**
     * 姓名
     */
    private String ename;
    /**
     * 部门ID
     */
    private String deptId;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     *  职务
     */
    private String zhrPtext;
    /**
     * 办公电话
     */
    private String zhrTell;
    /**
     * 手机号码
     */
    private String zhrCell;
    /**
     * 关键字
     */
    private String keyword;

    /**
     * 电子邮件
     */
    private String zhrEmail;

    /**
     *  岗位
     */
    private String zhrStext;

    public String getZhrStext() {
        return zhrStext;
    }

    public void setZhrStext(String zhrStext) {
        this.zhrStext = zhrStext;
    }

    public String getPernr() {
        return pernr;
    }

    public void setPernr(String pernr) {
        this.pernr = pernr;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getZhrPtext() {
        return zhrPtext;
    }

    public void setZhrPtext(String zhrPtext) {
        this.zhrPtext = zhrPtext;
    }

    public String getZhrTell() {
        return zhrTell;
    }

    public void setZhrTell(String zhrTell) {
        this.zhrTell = zhrTell;
    }

    public String getZhrCell() {
        return zhrCell;
    }

    public void setZhrCell(String zhrCell) {
        this.zhrCell = zhrCell;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getZhrEmail() {
        return zhrEmail;
    }

    public void setZhrEmail(String zhrEmail) {
        this.zhrEmail = zhrEmail;
    }
}
