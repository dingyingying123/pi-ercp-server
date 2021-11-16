package cn.com.personnel.ercp.ca.mydbpersistence.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "v_zhr_employee")
public class VHrEmployee {

    private String pernr;

    private String ename;

    private String inits;

    private String gesc;

    private String orgeh;

    private String plans;

    @Column(name = "zhr_otext")
    private String zhrOtext;

    @Column(name = "zhr_ptext")
    private String zhrPtext;

    @Column(name = "unit_id")
    private String unitId;

    @Column(name = "unit_txt")
    private String unitTxt;

    @Column(name = "system_id")
    private String systemId;

    @Column(name = "system_txt")
    private String systemTxt;

    @Column(name = "center_id")
    private String centerId;

    @Column(name = "center_txt")
    private String centerTxt;

    @Column(name = "dept_id")
    private String deptId;

    @Column(name = "dept_name")
    private String deptName;

    @Column(name = "office_id")
    private String officeId;

    @Column(name = "office_name")
    private String officeName;

    private String stell;

    @Column(name = "zhr_stext")
    private String zhrStext;

    private String usrid;

    private String landx50;

    private String ltext;

    private String ptext;

    @Column(name = "zhr_time1")
    private String zhrTime1;

    @Column(name = "zhr_ptype")
    private String zhrPtype;

    private String ftext;

    @Column(name = "zhr_email")
    private String zhrEmail;

    @Column(name = "zhr_cell")
    private String zhrCell;

    @Column(name = "zhr_tell")
    private String zhrTell;

    @Column(name = "zhr_loca")
    private String zhrLoca;

    @Column(name = "zhr_xqtc")
    private String zhrXqtc;

    @Column(name = "zhr_prov")
    private String zhrProv;

    @Column(name = "zhr_city")
    private String zhrCity;

    @Column(name = "zhr_bank")
    private String zhrBank;

    @Column(name = "zhr_account")
    private String zhrAccount;

    private String gbdat;

    private String gbort;

    @Column(name = "zhr_btype")
    private String zhrBtype;

    @Column(name = "zhr_zsfbs")
    private String zhrZsfbs;

    @Column(name = "zhr_cjgz")
    private String zhrCjgz;

    private String locat;

    @Column(name = "zhr_rzrq")
    private String zhrRzrq;

    @Column(name = "zhr_lzrq")
    private String zhrLzrq;

    @Column(name = "zz_khhs")
    private String zzKhhs;

    @Column(name = "zz_khhd")
    private String zzKhhd;

    @Column(name = "zz_khh")
    private String zzKhh;

    @Column(name = "zz_yhh")
    private String zzYhh;

    @Column(name = "zz_lhh")
    private String zzLhh;

    private String trfgr;

    private String werks;

    @Column(name = "werks_t")
    private String werksT;

    private String btrtl;

    @Column(name = "btrtl_t")
    private String btrtlT;

    private String qdzt;

    @Column(name = "qdzt_t")
    private String qdztT;

    private String persg;

    private String persk;

    private String levelpk;

    @Column(name = "zhr_cost")
    private String zhrCost;

    @Column(name = "zhr_costtxt")
    private String zhrCosttxt;

    @Column(name = "zhr_yglx")
    private String zhrYglx;

    /**
     * @return pernr
     */
    public String getPernr() {
        return pernr;
    }

    /**
     * @param pernr
     */
    public void setPernr(String pernr) {
        this.pernr = pernr;
    }

    /**
     * @return ename
     */
    public String getEname() {
        return ename;
    }

    /**
     * @param ename
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * @return inits
     */
    public String getInits() {
        return inits;
    }

    /**
     * @param inits
     */
    public void setInits(String inits) {
        this.inits = inits;
    }

    /**
     * @return gesc
     */
    public String getGesc() {
        return gesc;
    }

    /**
     * @param gesc
     */
    public void setGesc(String gesc) {
        this.gesc = gesc;
    }

    /**
     * @return orgeh
     */
    public String getOrgeh() {
        return orgeh;
    }

    /**
     * @param orgeh
     */
    public void setOrgeh(String orgeh) {
        this.orgeh = orgeh;
    }

    /**
     * @return plans
     */
    public String getPlans() {
        return plans;
    }

    /**
     * @param plans
     */
    public void setPlans(String plans) {
        this.plans = plans;
    }

    /**
     * @return zhr_otext
     */
    public String getZhrOtext() {
        return zhrOtext;
    }

    /**
     * @param zhrOtext
     */
    public void setZhrOtext(String zhrOtext) {
        this.zhrOtext = zhrOtext;
    }

    /**
     * @return zhr_ptext
     */
    public String getZhrPtext() {
        return zhrPtext;
    }

    /**
     * @param zhrPtext
     */
    public void setZhrPtext(String zhrPtext) {
        this.zhrPtext = zhrPtext;
    }

    /**
     * @return unit_id
     */
    public String getUnitId() {
        return unitId;
    }

    /**
     * @param unitId
     */
    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    /**
     * @return unit_txt
     */
    public String getUnitTxt() {
        return unitTxt;
    }

    /**
     * @param unitTxt
     */
    public void setUnitTxt(String unitTxt) {
        this.unitTxt = unitTxt;
    }

    /**
     * @return system_id
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * @param systemId
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /**
     * @return system_txt
     */
    public String getSystemTxt() {
        return systemTxt;
    }

    /**
     * @param systemTxt
     */
    public void setSystemTxt(String systemTxt) {
        this.systemTxt = systemTxt;
    }

    /**
     * @return center_id
     */
    public String getCenterId() {
        return centerId;
    }

    /**
     * @param centerId
     */
    public void setCenterId(String centerId) {
        this.centerId = centerId;
    }

    /**
     * @return center_txt
     */
    public String getCenterTxt() {
        return centerTxt;
    }

    /**
     * @param centerTxt
     */
    public void setCenterTxt(String centerTxt) {
        this.centerTxt = centerTxt;
    }

    /**
     * @return dept_id
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * @param deptId
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    /**
     * @return dept_name
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return office_id
     */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * @param officeId
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    /**
     * @return office_name
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * @param officeName
     */
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    /**
     * @return stell
     */
    public String getStell() {
        return stell;
    }

    /**
     * @param stell
     */
    public void setStell(String stell) {
        this.stell = stell;
    }

    /**
     * @return zhr_stext
     */
    public String getZhrStext() {
        return zhrStext;
    }

    /**
     * @param zhrStext
     */
    public void setZhrStext(String zhrStext) {
        this.zhrStext = zhrStext;
    }

    /**
     * @return usrid
     */
    public String getUsrid() {
        return usrid;
    }

    /**
     * @param usrid
     */
    public void setUsrid(String usrid) {
        this.usrid = usrid;
    }

    /**
     * @return landx50
     */
    public String getLandx50() {
        return landx50;
    }

    /**
     * @param landx50
     */
    public void setLandx50(String landx50) {
        this.landx50 = landx50;
    }

    /**
     * @return ltext
     */
    public String getLtext() {
        return ltext;
    }

    /**
     * @param ltext
     */
    public void setLtext(String ltext) {
        this.ltext = ltext;
    }

    /**
     * @return ptext
     */
    public String getPtext() {
        return ptext;
    }

    /**
     * @param ptext
     */
    public void setPtext(String ptext) {
        this.ptext = ptext;
    }

    /**
     * @return zhr_time1
     */
    public String getZhrTime1() {
        return zhrTime1;
    }

    /**
     * @param zhrTime1
     */
    public void setZhrTime1(String zhrTime1) {
        this.zhrTime1 = zhrTime1;
    }

    /**
     * @return zhr_ptype
     */
    public String getZhrPtype() {
        return zhrPtype;
    }

    /**
     * @param zhrPtype
     */
    public void setZhrPtype(String zhrPtype) {
        this.zhrPtype = zhrPtype;
    }

    /**
     * @return ftext
     */
    public String getFtext() {
        return ftext;
    }

    /**
     * @param ftext
     */
    public void setFtext(String ftext) {
        this.ftext = ftext;
    }

    /**
     * @return zhr_email
     */
    public String getZhrEmail() {
        return zhrEmail;
    }

    /**
     * @param zhrEmail
     */
    public void setZhrEmail(String zhrEmail) {
        this.zhrEmail = zhrEmail;
    }

    /**
     * @return zhr_cell
     */
    public String getZhrCell() {
        return zhrCell;
    }

    /**
     * @param zhrCell
     */
    public void setZhrCell(String zhrCell) {
        this.zhrCell = zhrCell;
    }

    /**
     * @return zhr_tell
     */
    public String getZhrTell() {
        return zhrTell;
    }

    /**
     * @param zhrTell
     */
    public void setZhrTell(String zhrTell) {
        this.zhrTell = zhrTell;
    }

    /**
     * @return zhr_loca
     */
    public String getZhrLoca() {
        return zhrLoca;
    }

    /**
     * @param zhrLoca
     */
    public void setZhrLoca(String zhrLoca) {
        this.zhrLoca = zhrLoca;
    }

    /**
     * @return zhr_xqtc
     */
    public String getZhrXqtc() {
        return zhrXqtc;
    }

    /**
     * @param zhrXqtc
     */
    public void setZhrXqtc(String zhrXqtc) {
        this.zhrXqtc = zhrXqtc;
    }

    /**
     * @return zhr_prov
     */
    public String getZhrProv() {
        return zhrProv;
    }

    /**
     * @param zhrProv
     */
    public void setZhrProv(String zhrProv) {
        this.zhrProv = zhrProv;
    }

    /**
     * @return zhr_city
     */
    public String getZhrCity() {
        return zhrCity;
    }

    /**
     * @param zhrCity
     */
    public void setZhrCity(String zhrCity) {
        this.zhrCity = zhrCity;
    }

    /**
     * @return zhr_bank
     */
    public String getZhrBank() {
        return zhrBank;
    }

    /**
     * @param zhrBank
     */
    public void setZhrBank(String zhrBank) {
        this.zhrBank = zhrBank;
    }

    /**
     * @return zhr_account
     */
    public String getZhrAccount() {
        return zhrAccount;
    }

    /**
     * @param zhrAccount
     */
    public void setZhrAccount(String zhrAccount) {
        this.zhrAccount = zhrAccount;
    }

    /**
     * @return gbdat
     */
    public String getGbdat() {
        return gbdat;
    }

    /**
     * @param gbdat
     */
    public void setGbdat(String gbdat) {
        this.gbdat = gbdat;
    }

    /**
     * @return gbort
     */
    public String getGbort() {
        return gbort;
    }

    /**
     * @param gbort
     */
    public void setGbort(String gbort) {
        this.gbort = gbort;
    }

    /**
     * @return zhr_btype
     */
    public String getZhrBtype() {
        return zhrBtype;
    }

    /**
     * @param zhrBtype
     */
    public void setZhrBtype(String zhrBtype) {
        this.zhrBtype = zhrBtype;
    }

    /**
     * @return zhr_zsfbs
     */
    public String getZhrZsfbs() {
        return zhrZsfbs;
    }

    /**
     * @param zhrZsfbs
     */
    public void setZhrZsfbs(String zhrZsfbs) {
        this.zhrZsfbs = zhrZsfbs;
    }

    /**
     * @return zhr_cjgz
     */
    public String getZhrCjgz() {
        return zhrCjgz;
    }

    /**
     * @param zhrCjgz
     */
    public void setZhrCjgz(String zhrCjgz) {
        this.zhrCjgz = zhrCjgz;
    }

    /**
     * @return locat
     */
    public String getLocat() {
        return locat;
    }

    /**
     * @param locat
     */
    public void setLocat(String locat) {
        this.locat = locat;
    }

    /**
     * @return zhr_rzrq
     */
    public String getZhrRzrq() {
        return zhrRzrq;
    }

    /**
     * @param zhrRzrq
     */
    public void setZhrRzrq(String zhrRzrq) {
        this.zhrRzrq = zhrRzrq;
    }

    /**
     * @return zhr_lzrq
     */
    public String getZhrLzrq() {
        return zhrLzrq;
    }

    /**
     * @param zhrLzrq
     */
    public void setZhrLzrq(String zhrLzrq) {
        this.zhrLzrq = zhrLzrq;
    }

    /**
     * @return zz_khhs
     */
    public String getZzKhhs() {
        return zzKhhs;
    }

    /**
     * @param zzKhhs
     */
    public void setZzKhhs(String zzKhhs) {
        this.zzKhhs = zzKhhs;
    }

    /**
     * @return zz_khhd
     */
    public String getZzKhhd() {
        return zzKhhd;
    }

    /**
     * @param zzKhhd
     */
    public void setZzKhhd(String zzKhhd) {
        this.zzKhhd = zzKhhd;
    }

    /**
     * @return zz_khh
     */
    public String getZzKhh() {
        return zzKhh;
    }

    /**
     * @param zzKhh
     */
    public void setZzKhh(String zzKhh) {
        this.zzKhh = zzKhh;
    }

    /**
     * @return zz_yhh
     */
    public String getZzYhh() {
        return zzYhh;
    }

    /**
     * @param zzYhh
     */
    public void setZzYhh(String zzYhh) {
        this.zzYhh = zzYhh;
    }

    /**
     * @return zz_lhh
     */
    public String getZzLhh() {
        return zzLhh;
    }

    /**
     * @param zzLhh
     */
    public void setZzLhh(String zzLhh) {
        this.zzLhh = zzLhh;
    }

    /**
     * @return trfgr
     */
    public String getTrfgr() {
        return trfgr;
    }

    /**
     * @param trfgr
     */
    public void setTrfgr(String trfgr) {
        this.trfgr = trfgr;
    }

    /**
     * @return werks
     */
    public String getWerks() {
        return werks;
    }

    /**
     * @param werks
     */
    public void setWerks(String werks) {
        this.werks = werks;
    }

    /**
     * @return werks_t
     */
    public String getWerksT() {
        return werksT;
    }

    /**
     * @param werksT
     */
    public void setWerksT(String werksT) {
        this.werksT = werksT;
    }

    /**
     * @return btrtl
     */
    public String getBtrtl() {
        return btrtl;
    }

    /**
     * @param btrtl
     */
    public void setBtrtl(String btrtl) {
        this.btrtl = btrtl;
    }

    /**
     * @return btrtl_t
     */
    public String getBtrtlT() {
        return btrtlT;
    }

    /**
     * @param btrtlT
     */
    public void setBtrtlT(String btrtlT) {
        this.btrtlT = btrtlT;
    }

    /**
     * @return qdzt
     */
    public String getQdzt() {
        return qdzt;
    }

    /**
     * @param qdzt
     */
    public void setQdzt(String qdzt) {
        this.qdzt = qdzt;
    }

    /**
     * @return qdzt_t
     */
    public String getQdztT() {
        return qdztT;
    }

    /**
     * @param qdztT
     */
    public void setQdztT(String qdztT) {
        this.qdztT = qdztT;
    }

    /**
     * @return persg
     */
    public String getPersg() {
        return persg;
    }

    /**
     * @param persg
     */
    public void setPersg(String persg) {
        this.persg = persg;
    }

    /**
     * @return persk
     */
    public String getPersk() {
        return persk;
    }

    /**
     * @param persk
     */
    public void setPersk(String persk) {
        this.persk = persk;
    }

    /**
     * @return levelpk
     */
    public String getLevelpk() {
        return levelpk;
    }

    /**
     * @param levelpk
     */
    public void setLevelpk(String levelpk) {
        this.levelpk = levelpk;
    }

    public String getZhrCost() {
        return zhrCost;
    }

    public void setZhrCost(String zhrCost) {
        this.zhrCost = zhrCost;
    }

    public String getZhrCosttxt() {
        return zhrCosttxt;
    }

    public void setZhrCosttxt(String zhrCosttxt) {
        this.zhrCosttxt = zhrCosttxt;
    }

    public String getZhrYglx() {
        return zhrYglx;
    }

    public void setZhrYglx(String zhrYglx) {
        this.zhrYglx = zhrYglx;
    }
}