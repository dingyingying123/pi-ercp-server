package cn.com.personnel.ercp.pi.persistence.entity.base;

import javax.persistence.*;

@Table(name = "v_organ")
public class VOrgan {
    private String mandt;

    private String bukrs;

    private String name;

    private String butxt;

    @Column(name = "full_name")
    private String fullName;

    private String waers;

    private String busi;

    private String busitext;

    @Column(name = "com_domain_tr")
    private String comDomainTr;

    private String domaintext;

    @Column(name = "zz_invalid")
    private String zzInvalid;

    @Column(name = "zz_inclusion")
    private String zzInclusion;

    /**
     * @return mandt
     */
    public String getMandt() {
        return mandt;
    }

    /**
     * @param mandt
     */
    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    /**
     * @return bukrs
     */
    public String getBukrs() {
        return bukrs;
    }

    /**
     * @param bukrs
     */
    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
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
     * @return butxt
     */
    public String getButxt() {
        return butxt;
    }

    /**
     * @param butxt
     */
    public void setButxt(String butxt) {
        this.butxt = butxt;
    }

    /**
     * @return full_name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return waers
     */
    public String getWaers() {
        return waers;
    }

    /**
     * @param waers
     */
    public void setWaers(String waers) {
        this.waers = waers;
    }

    /**
     * @return busi
     */
    public String getBusi() {
        return busi;
    }

    /**
     * @param busi
     */
    public void setBusi(String busi) {
        this.busi = busi;
    }

    /**
     * @return busitext
     */
    public String getBusitext() {
        return busitext;
    }

    /**
     * @param busitext
     */
    public void setBusitext(String busitext) {
        this.busitext = busitext;
    }

    /**
     * @return com_domain_tr
     */
    public String getComDomainTr() {
        return comDomainTr;
    }

    /**
     * @param comDomainTr
     */
    public void setComDomainTr(String comDomainTr) {
        this.comDomainTr = comDomainTr;
    }

    /**
     * @return domaintext
     */
    public String getDomaintext() {
        return domaintext;
    }

    /**
     * @param domaintext
     */
    public void setDomaintext(String domaintext) {
        this.domaintext = domaintext;
    }

    /**
     * @return zz_invalid
     */
    public String getZzInvalid() {
        return zzInvalid;
    }

    /**
     * @param zzInvalid
     */
    public void setZzInvalid(String zzInvalid) {
        this.zzInvalid = zzInvalid;
    }

    /**
     * @return zz_inclusion
     */
    public String getZzInclusion() {
        return zzInclusion;
    }

    /**
     * @param zzInclusion
     */
    public void setZzInclusion(String zzInclusion) {
        this.zzInclusion = zzInclusion;
    }
}