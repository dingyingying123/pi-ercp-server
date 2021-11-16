package cn.com.personnel.ercp.pi.persistence.entity.sap;

import javax.persistence.*;

public class Csks {
    @Id
    private String datbi;

    @Id
    @GeneratedValue(generator = "JDBC")
    private String kokrs;

    @Id
    private String kostl;

    @Id
    private String mandt;

    private String datab;

    private String bkzkp;

    private String pkzkp;

    private String bukrs;

    private String gsber;

    private String kosar;

    private String verak;

    @Column(name = "verak_user")
    private String verakUser;

    private String waers;

    private String kalsm;

    private String txjcd;

    private String prctr;

    private String werks;

    private String logsystem;

    private String ersda;

    private String usnam;

    private String bkzks;

    private String bkzer;

    private String bkzob;

    private String pkzks;

    private String pkzer;

    private String vmeth;

    private String mgefl;

    private String abtei;

    private String nkost;

    private String kvewe;

    private String kappl;

    private String koszschl;

    private String land1;

    private String anred;

    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String ort01;

    private String ort02;

    private String stras;

    private String pfach;

    private String pstlz;

    private String pstl2;

    private String regio;

    private String spras;

    private String telbx;

    private String telf1;

    private String telf2;

    private String telfx;

    private String teltx;

    private String telx1;

    private String datlt;

    private String drnam;

    private String khinr;

    private String cckey;

    private String kompl;

    private String stakz;

    private String objnr;

    private String funkt;

    private String afunk;

    @Column(name = "cpi_templ")
    private String cpiTempl;

    @Column(name = "cpd_templ")
    private String cpdTempl;

    @Column(name = "func_area")
    private String funcArea;

    @Column(name = "sci_templ")
    private String sciTempl;

    @Column(name = "scd_templ")
    private String scdTempl;

    @Column(name = "ski_templ")
    private String skiTempl;

    @Column(name = "skd_templ")
    private String skdTempl;

    private String vname;

    private String recid;

    private String etype;

    @Column(name = "jv_otype")
    private String jvOtype;

    @Column(name = "jv_jibcl")
    private String jvJibcl;

    @Column(name = "jv_jibsa")
    private String jvJibsa;

    @Column(name = "ferc_ind")
    private String fercInd;

    @Column(name = "eew_csks_ps_dummy")
    private String eewCsksPsDummy;

    @Column(name = "zz_cctxt")
    private String zzCctxt;

    @Column(name = "zz_jgbm")
    private String zzJgbm;

    @Column(name = "zz_jglb")
    private String zzJglb;

    @Column(name = "zz_bmmc")
    private String zzBmmc;

    @Column(name = "zz_aedtm")
    private String zzAedtm;

    @Column(name = "zz_bmmc2")
    private String zzBmmc2;

    @Column(name = "zz_objid")
    private String zzObjid;

    /**
     * @return datbi
     */
    public String getDatbi() {
        return datbi;
    }

    /**
     * @param datbi
     */
    public void setDatbi(String datbi) {
        this.datbi = datbi;
    }

    /**
     * @return kokrs
     */
    public String getKokrs() {
        return kokrs;
    }

    /**
     * @param kokrs
     */
    public void setKokrs(String kokrs) {
        this.kokrs = kokrs;
    }

    /**
     * @return kostl
     */
    public String getKostl() {
        return kostl;
    }

    /**
     * @param kostl
     */
    public void setKostl(String kostl) {
        this.kostl = kostl;
    }

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
     * @return datab
     */
    public String getDatab() {
        return datab;
    }

    /**
     * @param datab
     */
    public void setDatab(String datab) {
        this.datab = datab;
    }

    /**
     * @return bkzkp
     */
    public String getBkzkp() {
        return bkzkp;
    }

    /**
     * @param bkzkp
     */
    public void setBkzkp(String bkzkp) {
        this.bkzkp = bkzkp;
    }

    /**
     * @return pkzkp
     */
    public String getPkzkp() {
        return pkzkp;
    }

    /**
     * @param pkzkp
     */
    public void setPkzkp(String pkzkp) {
        this.pkzkp = pkzkp;
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
     * @return gsber
     */
    public String getGsber() {
        return gsber;
    }

    /**
     * @param gsber
     */
    public void setGsber(String gsber) {
        this.gsber = gsber;
    }

    /**
     * @return kosar
     */
    public String getKosar() {
        return kosar;
    }

    /**
     * @param kosar
     */
    public void setKosar(String kosar) {
        this.kosar = kosar;
    }

    /**
     * @return verak
     */
    public String getVerak() {
        return verak;
    }

    /**
     * @param verak
     */
    public void setVerak(String verak) {
        this.verak = verak;
    }

    /**
     * @return verak_user
     */
    public String getVerakUser() {
        return verakUser;
    }

    /**
     * @param verakUser
     */
    public void setVerakUser(String verakUser) {
        this.verakUser = verakUser;
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
     * @return kalsm
     */
    public String getKalsm() {
        return kalsm;
    }

    /**
     * @param kalsm
     */
    public void setKalsm(String kalsm) {
        this.kalsm = kalsm;
    }

    /**
     * @return txjcd
     */
    public String getTxjcd() {
        return txjcd;
    }

    /**
     * @param txjcd
     */
    public void setTxjcd(String txjcd) {
        this.txjcd = txjcd;
    }

    /**
     * @return prctr
     */
    public String getPrctr() {
        return prctr;
    }

    /**
     * @param prctr
     */
    public void setPrctr(String prctr) {
        this.prctr = prctr;
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
     * @return logsystem
     */
    public String getLogsystem() {
        return logsystem;
    }

    /**
     * @param logsystem
     */
    public void setLogsystem(String logsystem) {
        this.logsystem = logsystem;
    }

    /**
     * @return ersda
     */
    public String getErsda() {
        return ersda;
    }

    /**
     * @param ersda
     */
    public void setErsda(String ersda) {
        this.ersda = ersda;
    }

    /**
     * @return usnam
     */
    public String getUsnam() {
        return usnam;
    }

    /**
     * @param usnam
     */
    public void setUsnam(String usnam) {
        this.usnam = usnam;
    }

    /**
     * @return bkzks
     */
    public String getBkzks() {
        return bkzks;
    }

    /**
     * @param bkzks
     */
    public void setBkzks(String bkzks) {
        this.bkzks = bkzks;
    }

    /**
     * @return bkzer
     */
    public String getBkzer() {
        return bkzer;
    }

    /**
     * @param bkzer
     */
    public void setBkzer(String bkzer) {
        this.bkzer = bkzer;
    }

    /**
     * @return bkzob
     */
    public String getBkzob() {
        return bkzob;
    }

    /**
     * @param bkzob
     */
    public void setBkzob(String bkzob) {
        this.bkzob = bkzob;
    }

    /**
     * @return pkzks
     */
    public String getPkzks() {
        return pkzks;
    }

    /**
     * @param pkzks
     */
    public void setPkzks(String pkzks) {
        this.pkzks = pkzks;
    }

    /**
     * @return pkzer
     */
    public String getPkzer() {
        return pkzer;
    }

    /**
     * @param pkzer
     */
    public void setPkzer(String pkzer) {
        this.pkzer = pkzer;
    }

    /**
     * @return vmeth
     */
    public String getVmeth() {
        return vmeth;
    }

    /**
     * @param vmeth
     */
    public void setVmeth(String vmeth) {
        this.vmeth = vmeth;
    }

    /**
     * @return mgefl
     */
    public String getMgefl() {
        return mgefl;
    }

    /**
     * @param mgefl
     */
    public void setMgefl(String mgefl) {
        this.mgefl = mgefl;
    }

    /**
     * @return abtei
     */
    public String getAbtei() {
        return abtei;
    }

    /**
     * @param abtei
     */
    public void setAbtei(String abtei) {
        this.abtei = abtei;
    }

    /**
     * @return nkost
     */
    public String getNkost() {
        return nkost;
    }

    /**
     * @param nkost
     */
    public void setNkost(String nkost) {
        this.nkost = nkost;
    }

    /**
     * @return kvewe
     */
    public String getKvewe() {
        return kvewe;
    }

    /**
     * @param kvewe
     */
    public void setKvewe(String kvewe) {
        this.kvewe = kvewe;
    }

    /**
     * @return kappl
     */
    public String getKappl() {
        return kappl;
    }

    /**
     * @param kappl
     */
    public void setKappl(String kappl) {
        this.kappl = kappl;
    }

    /**
     * @return koszschl
     */
    public String getKoszschl() {
        return koszschl;
    }

    /**
     * @param koszschl
     */
    public void setKoszschl(String koszschl) {
        this.koszschl = koszschl;
    }

    /**
     * @return land1
     */
    public String getLand1() {
        return land1;
    }

    /**
     * @param land1
     */
    public void setLand1(String land1) {
        this.land1 = land1;
    }

    /**
     * @return anred
     */
    public String getAnred() {
        return anred;
    }

    /**
     * @param anred
     */
    public void setAnred(String anred) {
        this.anred = anred;
    }

    /**
     * @return name1
     */
    public String getName1() {
        return name1;
    }

    /**
     * @param name1
     */
    public void setName1(String name1) {
        this.name1 = name1;
    }

    /**
     * @return name2
     */
    public String getName2() {
        return name2;
    }

    /**
     * @param name2
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     * @return name3
     */
    public String getName3() {
        return name3;
    }

    /**
     * @param name3
     */
    public void setName3(String name3) {
        this.name3 = name3;
    }

    /**
     * @return name4
     */
    public String getName4() {
        return name4;
    }

    /**
     * @param name4
     */
    public void setName4(String name4) {
        this.name4 = name4;
    }

    /**
     * @return ort01
     */
    public String getOrt01() {
        return ort01;
    }

    /**
     * @param ort01
     */
    public void setOrt01(String ort01) {
        this.ort01 = ort01;
    }

    /**
     * @return ort02
     */
    public String getOrt02() {
        return ort02;
    }

    /**
     * @param ort02
     */
    public void setOrt02(String ort02) {
        this.ort02 = ort02;
    }

    /**
     * @return stras
     */
    public String getStras() {
        return stras;
    }

    /**
     * @param stras
     */
    public void setStras(String stras) {
        this.stras = stras;
    }

    /**
     * @return pfach
     */
    public String getPfach() {
        return pfach;
    }

    /**
     * @param pfach
     */
    public void setPfach(String pfach) {
        this.pfach = pfach;
    }

    /**
     * @return pstlz
     */
    public String getPstlz() {
        return pstlz;
    }

    /**
     * @param pstlz
     */
    public void setPstlz(String pstlz) {
        this.pstlz = pstlz;
    }

    /**
     * @return pstl2
     */
    public String getPstl2() {
        return pstl2;
    }

    /**
     * @param pstl2
     */
    public void setPstl2(String pstl2) {
        this.pstl2 = pstl2;
    }

    /**
     * @return regio
     */
    public String getRegio() {
        return regio;
    }

    /**
     * @param regio
     */
    public void setRegio(String regio) {
        this.regio = regio;
    }

    /**
     * @return spras
     */
    public String getSpras() {
        return spras;
    }

    /**
     * @param spras
     */
    public void setSpras(String spras) {
        this.spras = spras;
    }

    /**
     * @return telbx
     */
    public String getTelbx() {
        return telbx;
    }

    /**
     * @param telbx
     */
    public void setTelbx(String telbx) {
        this.telbx = telbx;
    }

    /**
     * @return telf1
     */
    public String getTelf1() {
        return telf1;
    }

    /**
     * @param telf1
     */
    public void setTelf1(String telf1) {
        this.telf1 = telf1;
    }

    /**
     * @return telf2
     */
    public String getTelf2() {
        return telf2;
    }

    /**
     * @param telf2
     */
    public void setTelf2(String telf2) {
        this.telf2 = telf2;
    }

    /**
     * @return telfx
     */
    public String getTelfx() {
        return telfx;
    }

    /**
     * @param telfx
     */
    public void setTelfx(String telfx) {
        this.telfx = telfx;
    }

    /**
     * @return teltx
     */
    public String getTeltx() {
        return teltx;
    }

    /**
     * @param teltx
     */
    public void setTeltx(String teltx) {
        this.teltx = teltx;
    }

    /**
     * @return telx1
     */
    public String getTelx1() {
        return telx1;
    }

    /**
     * @param telx1
     */
    public void setTelx1(String telx1) {
        this.telx1 = telx1;
    }

    /**
     * @return datlt
     */
    public String getDatlt() {
        return datlt;
    }

    /**
     * @param datlt
     */
    public void setDatlt(String datlt) {
        this.datlt = datlt;
    }

    /**
     * @return drnam
     */
    public String getDrnam() {
        return drnam;
    }

    /**
     * @param drnam
     */
    public void setDrnam(String drnam) {
        this.drnam = drnam;
    }

    /**
     * @return khinr
     */
    public String getKhinr() {
        return khinr;
    }

    /**
     * @param khinr
     */
    public void setKhinr(String khinr) {
        this.khinr = khinr;
    }

    /**
     * @return cckey
     */
    public String getCckey() {
        return cckey;
    }

    /**
     * @param cckey
     */
    public void setCckey(String cckey) {
        this.cckey = cckey;
    }

    /**
     * @return kompl
     */
    public String getKompl() {
        return kompl;
    }

    /**
     * @param kompl
     */
    public void setKompl(String kompl) {
        this.kompl = kompl;
    }

    /**
     * @return stakz
     */
    public String getStakz() {
        return stakz;
    }

    /**
     * @param stakz
     */
    public void setStakz(String stakz) {
        this.stakz = stakz;
    }

    /**
     * @return objnr
     */
    public String getObjnr() {
        return objnr;
    }

    /**
     * @param objnr
     */
    public void setObjnr(String objnr) {
        this.objnr = objnr;
    }

    /**
     * @return funkt
     */
    public String getFunkt() {
        return funkt;
    }

    /**
     * @param funkt
     */
    public void setFunkt(String funkt) {
        this.funkt = funkt;
    }

    /**
     * @return afunk
     */
    public String getAfunk() {
        return afunk;
    }

    /**
     * @param afunk
     */
    public void setAfunk(String afunk) {
        this.afunk = afunk;
    }

    /**
     * @return cpi_templ
     */
    public String getCpiTempl() {
        return cpiTempl;
    }

    /**
     * @param cpiTempl
     */
    public void setCpiTempl(String cpiTempl) {
        this.cpiTempl = cpiTempl;
    }

    /**
     * @return cpd_templ
     */
    public String getCpdTempl() {
        return cpdTempl;
    }

    /**
     * @param cpdTempl
     */
    public void setCpdTempl(String cpdTempl) {
        this.cpdTempl = cpdTempl;
    }

    /**
     * @return func_area
     */
    public String getFuncArea() {
        return funcArea;
    }

    /**
     * @param funcArea
     */
    public void setFuncArea(String funcArea) {
        this.funcArea = funcArea;
    }

    /**
     * @return sci_templ
     */
    public String getSciTempl() {
        return sciTempl;
    }

    /**
     * @param sciTempl
     */
    public void setSciTempl(String sciTempl) {
        this.sciTempl = sciTempl;
    }

    /**
     * @return scd_templ
     */
    public String getScdTempl() {
        return scdTempl;
    }

    /**
     * @param scdTempl
     */
    public void setScdTempl(String scdTempl) {
        this.scdTempl = scdTempl;
    }

    /**
     * @return ski_templ
     */
    public String getSkiTempl() {
        return skiTempl;
    }

    /**
     * @param skiTempl
     */
    public void setSkiTempl(String skiTempl) {
        this.skiTempl = skiTempl;
    }

    /**
     * @return skd_templ
     */
    public String getSkdTempl() {
        return skdTempl;
    }

    /**
     * @param skdTempl
     */
    public void setSkdTempl(String skdTempl) {
        this.skdTempl = skdTempl;
    }

    /**
     * @return vname
     */
    public String getVname() {
        return vname;
    }

    /**
     * @param vname
     */
    public void setVname(String vname) {
        this.vname = vname;
    }

    /**
     * @return recid
     */
    public String getRecid() {
        return recid;
    }

    /**
     * @param recid
     */
    public void setRecid(String recid) {
        this.recid = recid;
    }

    /**
     * @return etype
     */
    public String getEtype() {
        return etype;
    }

    /**
     * @param etype
     */
    public void setEtype(String etype) {
        this.etype = etype;
    }

    /**
     * @return jv_otype
     */
    public String getJvOtype() {
        return jvOtype;
    }

    /**
     * @param jvOtype
     */
    public void setJvOtype(String jvOtype) {
        this.jvOtype = jvOtype;
    }

    /**
     * @return jv_jibcl
     */
    public String getJvJibcl() {
        return jvJibcl;
    }

    /**
     * @param jvJibcl
     */
    public void setJvJibcl(String jvJibcl) {
        this.jvJibcl = jvJibcl;
    }

    /**
     * @return jv_jibsa
     */
    public String getJvJibsa() {
        return jvJibsa;
    }

    /**
     * @param jvJibsa
     */
    public void setJvJibsa(String jvJibsa) {
        this.jvJibsa = jvJibsa;
    }

    /**
     * @return ferc_ind
     */
    public String getFercInd() {
        return fercInd;
    }

    /**
     * @param fercInd
     */
    public void setFercInd(String fercInd) {
        this.fercInd = fercInd;
    }

    /**
     * @return eew_csks_ps_dummy
     */
    public String getEewCsksPsDummy() {
        return eewCsksPsDummy;
    }

    /**
     * @param eewCsksPsDummy
     */
    public void setEewCsksPsDummy(String eewCsksPsDummy) {
        this.eewCsksPsDummy = eewCsksPsDummy;
    }

    /**
     * @return zz_cctxt
     */
    public String getZzCctxt() {
        return zzCctxt;
    }

    /**
     * @param zzCctxt
     */
    public void setZzCctxt(String zzCctxt) {
        this.zzCctxt = zzCctxt;
    }

    /**
     * @return zz_jgbm
     */
    public String getZzJgbm() {
        return zzJgbm;
    }

    /**
     * @param zzJgbm
     */
    public void setZzJgbm(String zzJgbm) {
        this.zzJgbm = zzJgbm;
    }

    /**
     * @return zz_jglb
     */
    public String getZzJglb() {
        return zzJglb;
    }

    /**
     * @param zzJglb
     */
    public void setZzJglb(String zzJglb) {
        this.zzJglb = zzJglb;
    }

    /**
     * @return zz_bmmc
     */
    public String getZzBmmc() {
        return zzBmmc;
    }

    /**
     * @param zzBmmc
     */
    public void setZzBmmc(String zzBmmc) {
        this.zzBmmc = zzBmmc;
    }

    /**
     * @return zz_aedtm
     */
    public String getZzAedtm() {
        return zzAedtm;
    }

    /**
     * @param zzAedtm
     */
    public void setZzAedtm(String zzAedtm) {
        this.zzAedtm = zzAedtm;
    }

    /**
     * @return zz_bmmc2
     */
    public String getZzBmmc2() {
        return zzBmmc2;
    }

    /**
     * @param zzBmmc2
     */
    public void setZzBmmc2(String zzBmmc2) {
        this.zzBmmc2 = zzBmmc2;
    }

    /**
     * @return zz_objid
     */
    public String getZzObjid() {
        return zzObjid;
    }

    /**
     * @param zzObjid
     */
    public void setZzObjid(String zzObjid) {
        this.zzObjid = zzObjid;
    }
}