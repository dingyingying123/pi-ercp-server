package cn.com.personnel.ercp.ca.mydbpersistence.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "v_zhr_department")
public class VHrDepartment {
    @Column(name = "org_code")
    private String orgCode;

    @Column(name = "org_name")
    private String orgName;

    @Column(name = "parent_org_code")
    private String parentOrgCode;

    @Column(name = "parent_org_name")
    private String parentOrgName;

    @Column(name = "org_director_leader")
    private String orgDirectorLeader;

    @Column(name = "org_post_code")
    private String orgPostCode;

    private String jglb;

    private String jgbm;

    /**
     * @return org_code
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * @param orgCode
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * @return org_name
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * @return parent_org_code
     */
    public String getParentOrgCode() {
        return parentOrgCode;
    }

    /**
     * @param parentOrgCode
     */
    public void setParentOrgCode(String parentOrgCode) {
        this.parentOrgCode = parentOrgCode;
    }

    /**
     * @return parent_org_name
     */
    public String getParentOrgName() {
        return parentOrgName;
    }

    /**
     * @param parentOrgName
     */
    public void setParentOrgName(String parentOrgName) {
        this.parentOrgName = parentOrgName;
    }

    /**
     * @return org_director_leader
     */
    public String getOrgDirectorLeader() {
        return orgDirectorLeader;
    }

    /**
     * @param orgDirectorLeader
     */
    public void setOrgDirectorLeader(String orgDirectorLeader) {
        this.orgDirectorLeader = orgDirectorLeader;
    }

    /**
     * @return org_post_code
     */
    public String getOrgPostCode() {
        return orgPostCode;
    }

    /**
     * @param orgPostCode
     */
    public void setOrgPostCode(String orgPostCode) {
        this.orgPostCode = orgPostCode;
    }

    /**
     * @return jglb
     */
    public String getJglb() {
        return jglb;
    }

    /**
     * @param jglb
     */
    public void setJglb(String jglb) {
        this.jglb = jglb;
    }

    /**
     * @return jgbm
     */
    public String getJgbm() {
        return jgbm;
    }

    /**
     * @param jgbm
     */
    public void setJgbm(String jgbm) {
        this.jgbm = jgbm;
    }
}