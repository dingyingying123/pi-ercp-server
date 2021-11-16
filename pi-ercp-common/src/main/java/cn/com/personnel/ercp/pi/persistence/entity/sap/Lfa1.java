package cn.com.personnel.ercp.pi.persistence.entity.sap;

import java.math.BigDecimal;
import javax.persistence.*;

public class Lfa1 {
    @Id
    private String lifnr;

    @Id
    private String mandt;

    private String land1;

    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String ort01;

    private String ort02;

    private String pfach;

    private String pstl2;

    private String pstlz;

    private String regio;

    private String sortl;

    private String stras;

    private String adrnr;

    private String mcod1;

    private String mcod2;

    private String mcod3;

    private String anred;

    private String bahns;

    private String bbbnr;

    private String bbsnr;

    private String begru;

    private String brsch;

    private String bubkz;

    private String datlt;

    private String dtams;

    private String dtaws;

    private String erdat;

    private String ernam;

    private String esrnr;

    private String konzs;

    private String ktokk;

    private String kunnr;

    private String lnrza;

    private String loevm;

    private String sperr;

    private String sperm;

    private String spras;

    private String stcd1;

    private String stcd2;

    private String stkza;

    private String stkzu;

    private String telbx;

    private String telf1;

    private String telf2;

    private String telfx;

    private String teltx;

    private String telx1;

    private String xcpdk;

    private String xzemp;

    private String vbund;

    private String fiskn;

    private String stceg;

    private String stkzn;

    private String sperq;

    private String gbort;

    private String gbdat;

    private String sexkz;

    private String kraus;

    private String revdb;

    private String qssys;

    private String ktock;

    private String pfort;

    private String werks;

    private String ltsna;

    private String werkr;

    private String plkal;

    private String duefl;

    private String txjcd;

    private String sperz;

    private String scacd;

    private String sfrgr;

    private String lzone;

    private String xlfza;

    private String dlgrp;

    private String fityp;

    private String stcdt;

    private String regss;

    private String actss;

    private String stcd3;

    private String stcd4;

    private String stcd5;

    private String ipisp;

    private String taxbs;

    private String profs;

    private String stgdl;

    private String emnfr;

    private String lfurl;

    @Column(name = "j_1kfrepre")
    private String j1kfrepre;

    @Column(name = "j_1kftbus")
    private String j1kftbus;

    @Column(name = "j_1kftind")
    private String j1kftind;

    private String confs;

    private String updat;

    private String uptim;

    private String nodel;

    private String qssysdat;

    private String podkzb;

    private String fisku;

    private String stenr;

    @Column(name = "carrier_conf")
    private String carrierConf;

    @Column(name = "min_comp")
    private String minComp;

    @Column(name = "term_li")
    private String termLi;

    @Column(name = "crc_num")
    private String crcNum;

    @Column(name = "cvp_xblck")
    private String cvpXblck;

    private String rg;

    private String exp;

    private String uf;

    private String rgdate;

    private String ric;

    private String rne;

    private String rnedate;

    private String cnae;

    private String legalnat;

    private String crtn;

    private String icmstaxpay;

    private String indtyp;

    private String tdt;

    private String comsize;

    private String decregpc;

    @Column(name = "lfa1_eew_supp")
    private String lfa1EewSupp;

    @Column(name = "j_sc_capital")
    private BigDecimal jScCapital;

    @Column(name = "j_sc_currency")
    private String jScCurrency;

    private String alc;

    @Column(name = "pmt_office")
    private String pmtOffice;

    @Column(name = "ppa_relevant")
    private String ppaRelevant;

    private String psofg;

    private String psois;

    private String pson1;

    private String pson2;

    private String pson3;

    private String psovn;

    private String psotl;

    private String psohs;

    private String psost;

    @Column(name = "borgr_datun")
    private String borgrDatun;

    @Column(name = "borgr_yeaun")
    private String borgrYeaun;

    @Column(name = "addr2_street")
    private String addr2Street;

    @Column(name = "addr2_house_num")
    private String addr2HouseNum;

    @Column(name = "addr2_post")
    private String addr2Post;

    @Column(name = "addr2_city")
    private String addr2City;

    @Column(name = "addr2_country")
    private String addr2Country;

    private String categ;

    @Column(name = "partner_name")
    private String partnerName;

    @Column(name = "partner_utr")
    private String partnerUtr;

    private String status;

    private String vfnum;

    private String vfnid;

    private String crn;

    @Column(name = "j_1iexcd")
    private String j1iexcd;

    @Column(name = "j_1iexrn")
    private String j1iexrn;

    @Column(name = "j_1iexrg")
    private String j1iexrg;

    @Column(name = "j_1iexdi")
    private String j1iexdi;

    @Column(name = "j_1iexco")
    private String j1iexco;

    @Column(name = "j_1icstno")
    private String j1icstno;

    @Column(name = "j_1ilstno")
    private String j1ilstno;

    @Column(name = "j_1ipanno")
    private String j1ipanno;

    @Column(name = "j_1iexcive")
    private String j1iexcive;

    @Column(name = "j_1issist")
    private String j1issist;

    @Column(name = "j_1ivtyp")
    private String j1ivtyp;

    @Column(name = "j_1ivencre")
    private String j1ivencre;

    private String aedat;

    private String usnam;

    @Column(name = "j_1isern")
    private String j1isern;

    @Column(name = "j_1ipanref")
    private String j1ipanref;

    @Column(name = "j_1ipanvaldt")
    private String j1ipanvaldt;

    @Column(name = "j_1i_customs")
    private String j1iCustoms;

    @Column(name = "j_1idedref")
    private String j1idedref;

    @Column(name = "transport_chain")
    private String transportChain;

    @Column(name = "staging_time")
    private Short stagingTime;

    @Column(name = "scheduling_type")
    private String schedulingType;

    @Column(name = "submi_relevant")
    private String submiRelevant;

    @Column(name = "ven_class")
    private String venClass;

    private String entpub;

    private String escrit;

    private String dvalss;

    private String frmcss;

    private String codcae;

    private String ausdiv;

    /**
     * @return lifnr
     */
    public String getLifnr() {
        return lifnr;
    }

    /**
     * @param lifnr
     */
    public void setLifnr(String lifnr) {
        this.lifnr = lifnr;
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
     * @return sortl
     */
    public String getSortl() {
        return sortl;
    }

    /**
     * @param sortl
     */
    public void setSortl(String sortl) {
        this.sortl = sortl;
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
     * @return adrnr
     */
    public String getAdrnr() {
        return adrnr;
    }

    /**
     * @param adrnr
     */
    public void setAdrnr(String adrnr) {
        this.adrnr = adrnr;
    }

    /**
     * @return mcod1
     */
    public String getMcod1() {
        return mcod1;
    }

    /**
     * @param mcod1
     */
    public void setMcod1(String mcod1) {
        this.mcod1 = mcod1;
    }

    /**
     * @return mcod2
     */
    public String getMcod2() {
        return mcod2;
    }

    /**
     * @param mcod2
     */
    public void setMcod2(String mcod2) {
        this.mcod2 = mcod2;
    }

    /**
     * @return mcod3
     */
    public String getMcod3() {
        return mcod3;
    }

    /**
     * @param mcod3
     */
    public void setMcod3(String mcod3) {
        this.mcod3 = mcod3;
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
     * @return bahns
     */
    public String getBahns() {
        return bahns;
    }

    /**
     * @param bahns
     */
    public void setBahns(String bahns) {
        this.bahns = bahns;
    }

    /**
     * @return bbbnr
     */
    public String getBbbnr() {
        return bbbnr;
    }

    /**
     * @param bbbnr
     */
    public void setBbbnr(String bbbnr) {
        this.bbbnr = bbbnr;
    }

    /**
     * @return bbsnr
     */
    public String getBbsnr() {
        return bbsnr;
    }

    /**
     * @param bbsnr
     */
    public void setBbsnr(String bbsnr) {
        this.bbsnr = bbsnr;
    }

    /**
     * @return begru
     */
    public String getBegru() {
        return begru;
    }

    /**
     * @param begru
     */
    public void setBegru(String begru) {
        this.begru = begru;
    }

    /**
     * @return brsch
     */
    public String getBrsch() {
        return brsch;
    }

    /**
     * @param brsch
     */
    public void setBrsch(String brsch) {
        this.brsch = brsch;
    }

    /**
     * @return bubkz
     */
    public String getBubkz() {
        return bubkz;
    }

    /**
     * @param bubkz
     */
    public void setBubkz(String bubkz) {
        this.bubkz = bubkz;
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
     * @return dtams
     */
    public String getDtams() {
        return dtams;
    }

    /**
     * @param dtams
     */
    public void setDtams(String dtams) {
        this.dtams = dtams;
    }

    /**
     * @return dtaws
     */
    public String getDtaws() {
        return dtaws;
    }

    /**
     * @param dtaws
     */
    public void setDtaws(String dtaws) {
        this.dtaws = dtaws;
    }

    /**
     * @return erdat
     */
    public String getErdat() {
        return erdat;
    }

    /**
     * @param erdat
     */
    public void setErdat(String erdat) {
        this.erdat = erdat;
    }

    /**
     * @return ernam
     */
    public String getErnam() {
        return ernam;
    }

    /**
     * @param ernam
     */
    public void setErnam(String ernam) {
        this.ernam = ernam;
    }

    /**
     * @return esrnr
     */
    public String getEsrnr() {
        return esrnr;
    }

    /**
     * @param esrnr
     */
    public void setEsrnr(String esrnr) {
        this.esrnr = esrnr;
    }

    /**
     * @return konzs
     */
    public String getKonzs() {
        return konzs;
    }

    /**
     * @param konzs
     */
    public void setKonzs(String konzs) {
        this.konzs = konzs;
    }

    /**
     * @return ktokk
     */
    public String getKtokk() {
        return ktokk;
    }

    /**
     * @param ktokk
     */
    public void setKtokk(String ktokk) {
        this.ktokk = ktokk;
    }

    /**
     * @return kunnr
     */
    public String getKunnr() {
        return kunnr;
    }

    /**
     * @param kunnr
     */
    public void setKunnr(String kunnr) {
        this.kunnr = kunnr;
    }

    /**
     * @return lnrza
     */
    public String getLnrza() {
        return lnrza;
    }

    /**
     * @param lnrza
     */
    public void setLnrza(String lnrza) {
        this.lnrza = lnrza;
    }

    /**
     * @return loevm
     */
    public String getLoevm() {
        return loevm;
    }

    /**
     * @param loevm
     */
    public void setLoevm(String loevm) {
        this.loevm = loevm;
    }

    /**
     * @return sperr
     */
    public String getSperr() {
        return sperr;
    }

    /**
     * @param sperr
     */
    public void setSperr(String sperr) {
        this.sperr = sperr;
    }

    /**
     * @return sperm
     */
    public String getSperm() {
        return sperm;
    }

    /**
     * @param sperm
     */
    public void setSperm(String sperm) {
        this.sperm = sperm;
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
     * @return stcd1
     */
    public String getStcd1() {
        return stcd1;
    }

    /**
     * @param stcd1
     */
    public void setStcd1(String stcd1) {
        this.stcd1 = stcd1;
    }

    /**
     * @return stcd2
     */
    public String getStcd2() {
        return stcd2;
    }

    /**
     * @param stcd2
     */
    public void setStcd2(String stcd2) {
        this.stcd2 = stcd2;
    }

    /**
     * @return stkza
     */
    public String getStkza() {
        return stkza;
    }

    /**
     * @param stkza
     */
    public void setStkza(String stkza) {
        this.stkza = stkza;
    }

    /**
     * @return stkzu
     */
    public String getStkzu() {
        return stkzu;
    }

    /**
     * @param stkzu
     */
    public void setStkzu(String stkzu) {
        this.stkzu = stkzu;
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
     * @return xcpdk
     */
    public String getXcpdk() {
        return xcpdk;
    }

    /**
     * @param xcpdk
     */
    public void setXcpdk(String xcpdk) {
        this.xcpdk = xcpdk;
    }

    /**
     * @return xzemp
     */
    public String getXzemp() {
        return xzemp;
    }

    /**
     * @param xzemp
     */
    public void setXzemp(String xzemp) {
        this.xzemp = xzemp;
    }

    /**
     * @return vbund
     */
    public String getVbund() {
        return vbund;
    }

    /**
     * @param vbund
     */
    public void setVbund(String vbund) {
        this.vbund = vbund;
    }

    /**
     * @return fiskn
     */
    public String getFiskn() {
        return fiskn;
    }

    /**
     * @param fiskn
     */
    public void setFiskn(String fiskn) {
        this.fiskn = fiskn;
    }

    /**
     * @return stceg
     */
    public String getStceg() {
        return stceg;
    }

    /**
     * @param stceg
     */
    public void setStceg(String stceg) {
        this.stceg = stceg;
    }

    /**
     * @return stkzn
     */
    public String getStkzn() {
        return stkzn;
    }

    /**
     * @param stkzn
     */
    public void setStkzn(String stkzn) {
        this.stkzn = stkzn;
    }

    /**
     * @return sperq
     */
    public String getSperq() {
        return sperq;
    }

    /**
     * @param sperq
     */
    public void setSperq(String sperq) {
        this.sperq = sperq;
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
     * @return sexkz
     */
    public String getSexkz() {
        return sexkz;
    }

    /**
     * @param sexkz
     */
    public void setSexkz(String sexkz) {
        this.sexkz = sexkz;
    }

    /**
     * @return kraus
     */
    public String getKraus() {
        return kraus;
    }

    /**
     * @param kraus
     */
    public void setKraus(String kraus) {
        this.kraus = kraus;
    }

    /**
     * @return revdb
     */
    public String getRevdb() {
        return revdb;
    }

    /**
     * @param revdb
     */
    public void setRevdb(String revdb) {
        this.revdb = revdb;
    }

    /**
     * @return qssys
     */
    public String getQssys() {
        return qssys;
    }

    /**
     * @param qssys
     */
    public void setQssys(String qssys) {
        this.qssys = qssys;
    }

    /**
     * @return ktock
     */
    public String getKtock() {
        return ktock;
    }

    /**
     * @param ktock
     */
    public void setKtock(String ktock) {
        this.ktock = ktock;
    }

    /**
     * @return pfort
     */
    public String getPfort() {
        return pfort;
    }

    /**
     * @param pfort
     */
    public void setPfort(String pfort) {
        this.pfort = pfort;
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
     * @return ltsna
     */
    public String getLtsna() {
        return ltsna;
    }

    /**
     * @param ltsna
     */
    public void setLtsna(String ltsna) {
        this.ltsna = ltsna;
    }

    /**
     * @return werkr
     */
    public String getWerkr() {
        return werkr;
    }

    /**
     * @param werkr
     */
    public void setWerkr(String werkr) {
        this.werkr = werkr;
    }

    /**
     * @return plkal
     */
    public String getPlkal() {
        return plkal;
    }

    /**
     * @param plkal
     */
    public void setPlkal(String plkal) {
        this.plkal = plkal;
    }

    /**
     * @return duefl
     */
    public String getDuefl() {
        return duefl;
    }

    /**
     * @param duefl
     */
    public void setDuefl(String duefl) {
        this.duefl = duefl;
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
     * @return sperz
     */
    public String getSperz() {
        return sperz;
    }

    /**
     * @param sperz
     */
    public void setSperz(String sperz) {
        this.sperz = sperz;
    }

    /**
     * @return scacd
     */
    public String getScacd() {
        return scacd;
    }

    /**
     * @param scacd
     */
    public void setScacd(String scacd) {
        this.scacd = scacd;
    }

    /**
     * @return sfrgr
     */
    public String getSfrgr() {
        return sfrgr;
    }

    /**
     * @param sfrgr
     */
    public void setSfrgr(String sfrgr) {
        this.sfrgr = sfrgr;
    }

    /**
     * @return lzone
     */
    public String getLzone() {
        return lzone;
    }

    /**
     * @param lzone
     */
    public void setLzone(String lzone) {
        this.lzone = lzone;
    }

    /**
     * @return xlfza
     */
    public String getXlfza() {
        return xlfza;
    }

    /**
     * @param xlfza
     */
    public void setXlfza(String xlfza) {
        this.xlfza = xlfza;
    }

    /**
     * @return dlgrp
     */
    public String getDlgrp() {
        return dlgrp;
    }

    /**
     * @param dlgrp
     */
    public void setDlgrp(String dlgrp) {
        this.dlgrp = dlgrp;
    }

    /**
     * @return fityp
     */
    public String getFityp() {
        return fityp;
    }

    /**
     * @param fityp
     */
    public void setFityp(String fityp) {
        this.fityp = fityp;
    }

    /**
     * @return stcdt
     */
    public String getStcdt() {
        return stcdt;
    }

    /**
     * @param stcdt
     */
    public void setStcdt(String stcdt) {
        this.stcdt = stcdt;
    }

    /**
     * @return regss
     */
    public String getRegss() {
        return regss;
    }

    /**
     * @param regss
     */
    public void setRegss(String regss) {
        this.regss = regss;
    }

    /**
     * @return actss
     */
    public String getActss() {
        return actss;
    }

    /**
     * @param actss
     */
    public void setActss(String actss) {
        this.actss = actss;
    }

    /**
     * @return stcd3
     */
    public String getStcd3() {
        return stcd3;
    }

    /**
     * @param stcd3
     */
    public void setStcd3(String stcd3) {
        this.stcd3 = stcd3;
    }

    /**
     * @return stcd4
     */
    public String getStcd4() {
        return stcd4;
    }

    /**
     * @param stcd4
     */
    public void setStcd4(String stcd4) {
        this.stcd4 = stcd4;
    }

    /**
     * @return stcd5
     */
    public String getStcd5() {
        return stcd5;
    }

    /**
     * @param stcd5
     */
    public void setStcd5(String stcd5) {
        this.stcd5 = stcd5;
    }

    /**
     * @return ipisp
     */
    public String getIpisp() {
        return ipisp;
    }

    /**
     * @param ipisp
     */
    public void setIpisp(String ipisp) {
        this.ipisp = ipisp;
    }

    /**
     * @return taxbs
     */
    public String getTaxbs() {
        return taxbs;
    }

    /**
     * @param taxbs
     */
    public void setTaxbs(String taxbs) {
        this.taxbs = taxbs;
    }

    /**
     * @return profs
     */
    public String getProfs() {
        return profs;
    }

    /**
     * @param profs
     */
    public void setProfs(String profs) {
        this.profs = profs;
    }

    /**
     * @return stgdl
     */
    public String getStgdl() {
        return stgdl;
    }

    /**
     * @param stgdl
     */
    public void setStgdl(String stgdl) {
        this.stgdl = stgdl;
    }

    /**
     * @return emnfr
     */
    public String getEmnfr() {
        return emnfr;
    }

    /**
     * @param emnfr
     */
    public void setEmnfr(String emnfr) {
        this.emnfr = emnfr;
    }

    /**
     * @return lfurl
     */
    public String getLfurl() {
        return lfurl;
    }

    /**
     * @param lfurl
     */
    public void setLfurl(String lfurl) {
        this.lfurl = lfurl;
    }

    /**
     * @return j_1kfrepre
     */
    public String getJ1kfrepre() {
        return j1kfrepre;
    }

    /**
     * @param j1kfrepre
     */
    public void setJ1kfrepre(String j1kfrepre) {
        this.j1kfrepre = j1kfrepre;
    }

    /**
     * @return j_1kftbus
     */
    public String getJ1kftbus() {
        return j1kftbus;
    }

    /**
     * @param j1kftbus
     */
    public void setJ1kftbus(String j1kftbus) {
        this.j1kftbus = j1kftbus;
    }

    /**
     * @return j_1kftind
     */
    public String getJ1kftind() {
        return j1kftind;
    }

    /**
     * @param j1kftind
     */
    public void setJ1kftind(String j1kftind) {
        this.j1kftind = j1kftind;
    }

    /**
     * @return confs
     */
    public String getConfs() {
        return confs;
    }

    /**
     * @param confs
     */
    public void setConfs(String confs) {
        this.confs = confs;
    }

    /**
     * @return updat
     */
    public String getUpdat() {
        return updat;
    }

    /**
     * @param updat
     */
    public void setUpdat(String updat) {
        this.updat = updat;
    }

    /**
     * @return uptim
     */
    public String getUptim() {
        return uptim;
    }

    /**
     * @param uptim
     */
    public void setUptim(String uptim) {
        this.uptim = uptim;
    }

    /**
     * @return nodel
     */
    public String getNodel() {
        return nodel;
    }

    /**
     * @param nodel
     */
    public void setNodel(String nodel) {
        this.nodel = nodel;
    }

    /**
     * @return qssysdat
     */
    public String getQssysdat() {
        return qssysdat;
    }

    /**
     * @param qssysdat
     */
    public void setQssysdat(String qssysdat) {
        this.qssysdat = qssysdat;
    }

    /**
     * @return podkzb
     */
    public String getPodkzb() {
        return podkzb;
    }

    /**
     * @param podkzb
     */
    public void setPodkzb(String podkzb) {
        this.podkzb = podkzb;
    }

    /**
     * @return fisku
     */
    public String getFisku() {
        return fisku;
    }

    /**
     * @param fisku
     */
    public void setFisku(String fisku) {
        this.fisku = fisku;
    }

    /**
     * @return stenr
     */
    public String getStenr() {
        return stenr;
    }

    /**
     * @param stenr
     */
    public void setStenr(String stenr) {
        this.stenr = stenr;
    }

    /**
     * @return carrier_conf
     */
    public String getCarrierConf() {
        return carrierConf;
    }

    /**
     * @param carrierConf
     */
    public void setCarrierConf(String carrierConf) {
        this.carrierConf = carrierConf;
    }

    /**
     * @return min_comp
     */
    public String getMinComp() {
        return minComp;
    }

    /**
     * @param minComp
     */
    public void setMinComp(String minComp) {
        this.minComp = minComp;
    }

    /**
     * @return term_li
     */
    public String getTermLi() {
        return termLi;
    }

    /**
     * @param termLi
     */
    public void setTermLi(String termLi) {
        this.termLi = termLi;
    }

    /**
     * @return crc_num
     */
    public String getCrcNum() {
        return crcNum;
    }

    /**
     * @param crcNum
     */
    public void setCrcNum(String crcNum) {
        this.crcNum = crcNum;
    }

    /**
     * @return cvp_xblck
     */
    public String getCvpXblck() {
        return cvpXblck;
    }

    /**
     * @param cvpXblck
     */
    public void setCvpXblck(String cvpXblck) {
        this.cvpXblck = cvpXblck;
    }

    /**
     * @return rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return exp
     */
    public String getExp() {
        return exp;
    }

    /**
     * @param exp
     */
    public void setExp(String exp) {
        this.exp = exp;
    }

    /**
     * @return uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return rgdate
     */
    public String getRgdate() {
        return rgdate;
    }

    /**
     * @param rgdate
     */
    public void setRgdate(String rgdate) {
        this.rgdate = rgdate;
    }

    /**
     * @return ric
     */
    public String getRic() {
        return ric;
    }

    /**
     * @param ric
     */
    public void setRic(String ric) {
        this.ric = ric;
    }

    /**
     * @return rne
     */
    public String getRne() {
        return rne;
    }

    /**
     * @param rne
     */
    public void setRne(String rne) {
        this.rne = rne;
    }

    /**
     * @return rnedate
     */
    public String getRnedate() {
        return rnedate;
    }

    /**
     * @param rnedate
     */
    public void setRnedate(String rnedate) {
        this.rnedate = rnedate;
    }

    /**
     * @return cnae
     */
    public String getCnae() {
        return cnae;
    }

    /**
     * @param cnae
     */
    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    /**
     * @return legalnat
     */
    public String getLegalnat() {
        return legalnat;
    }

    /**
     * @param legalnat
     */
    public void setLegalnat(String legalnat) {
        this.legalnat = legalnat;
    }

    /**
     * @return crtn
     */
    public String getCrtn() {
        return crtn;
    }

    /**
     * @param crtn
     */
    public void setCrtn(String crtn) {
        this.crtn = crtn;
    }

    /**
     * @return icmstaxpay
     */
    public String getIcmstaxpay() {
        return icmstaxpay;
    }

    /**
     * @param icmstaxpay
     */
    public void setIcmstaxpay(String icmstaxpay) {
        this.icmstaxpay = icmstaxpay;
    }

    /**
     * @return indtyp
     */
    public String getIndtyp() {
        return indtyp;
    }

    /**
     * @param indtyp
     */
    public void setIndtyp(String indtyp) {
        this.indtyp = indtyp;
    }

    /**
     * @return tdt
     */
    public String getTdt() {
        return tdt;
    }

    /**
     * @param tdt
     */
    public void setTdt(String tdt) {
        this.tdt = tdt;
    }

    /**
     * @return comsize
     */
    public String getComsize() {
        return comsize;
    }

    /**
     * @param comsize
     */
    public void setComsize(String comsize) {
        this.comsize = comsize;
    }

    /**
     * @return decregpc
     */
    public String getDecregpc() {
        return decregpc;
    }

    /**
     * @param decregpc
     */
    public void setDecregpc(String decregpc) {
        this.decregpc = decregpc;
    }

    /**
     * @return lfa1_eew_supp
     */
    public String getLfa1EewSupp() {
        return lfa1EewSupp;
    }

    /**
     * @param lfa1EewSupp
     */
    public void setLfa1EewSupp(String lfa1EewSupp) {
        this.lfa1EewSupp = lfa1EewSupp;
    }

    /**
     * @return j_sc_capital
     */
    public BigDecimal getjScCapital() {
        return jScCapital;
    }

    /**
     * @param jScCapital
     */
    public void setjScCapital(BigDecimal jScCapital) {
        this.jScCapital = jScCapital;
    }

    /**
     * @return j_sc_currency
     */
    public String getjScCurrency() {
        return jScCurrency;
    }

    /**
     * @param jScCurrency
     */
    public void setjScCurrency(String jScCurrency) {
        this.jScCurrency = jScCurrency;
    }

    /**
     * @return alc
     */
    public String getAlc() {
        return alc;
    }

    /**
     * @param alc
     */
    public void setAlc(String alc) {
        this.alc = alc;
    }

    /**
     * @return pmt_office
     */
    public String getPmtOffice() {
        return pmtOffice;
    }

    /**
     * @param pmtOffice
     */
    public void setPmtOffice(String pmtOffice) {
        this.pmtOffice = pmtOffice;
    }

    /**
     * @return ppa_relevant
     */
    public String getPpaRelevant() {
        return ppaRelevant;
    }

    /**
     * @param ppaRelevant
     */
    public void setPpaRelevant(String ppaRelevant) {
        this.ppaRelevant = ppaRelevant;
    }

    /**
     * @return psofg
     */
    public String getPsofg() {
        return psofg;
    }

    /**
     * @param psofg
     */
    public void setPsofg(String psofg) {
        this.psofg = psofg;
    }

    /**
     * @return psois
     */
    public String getPsois() {
        return psois;
    }

    /**
     * @param psois
     */
    public void setPsois(String psois) {
        this.psois = psois;
    }

    /**
     * @return pson1
     */
    public String getPson1() {
        return pson1;
    }

    /**
     * @param pson1
     */
    public void setPson1(String pson1) {
        this.pson1 = pson1;
    }

    /**
     * @return pson2
     */
    public String getPson2() {
        return pson2;
    }

    /**
     * @param pson2
     */
    public void setPson2(String pson2) {
        this.pson2 = pson2;
    }

    /**
     * @return pson3
     */
    public String getPson3() {
        return pson3;
    }

    /**
     * @param pson3
     */
    public void setPson3(String pson3) {
        this.pson3 = pson3;
    }

    /**
     * @return psovn
     */
    public String getPsovn() {
        return psovn;
    }

    /**
     * @param psovn
     */
    public void setPsovn(String psovn) {
        this.psovn = psovn;
    }

    /**
     * @return psotl
     */
    public String getPsotl() {
        return psotl;
    }

    /**
     * @param psotl
     */
    public void setPsotl(String psotl) {
        this.psotl = psotl;
    }

    /**
     * @return psohs
     */
    public String getPsohs() {
        return psohs;
    }

    /**
     * @param psohs
     */
    public void setPsohs(String psohs) {
        this.psohs = psohs;
    }

    /**
     * @return psost
     */
    public String getPsost() {
        return psost;
    }

    /**
     * @param psost
     */
    public void setPsost(String psost) {
        this.psost = psost;
    }

    /**
     * @return borgr_datun
     */
    public String getBorgrDatun() {
        return borgrDatun;
    }

    /**
     * @param borgrDatun
     */
    public void setBorgrDatun(String borgrDatun) {
        this.borgrDatun = borgrDatun;
    }

    /**
     * @return borgr_yeaun
     */
    public String getBorgrYeaun() {
        return borgrYeaun;
    }

    /**
     * @param borgrYeaun
     */
    public void setBorgrYeaun(String borgrYeaun) {
        this.borgrYeaun = borgrYeaun;
    }

    /**
     * @return addr2_street
     */
    public String getAddr2Street() {
        return addr2Street;
    }

    /**
     * @param addr2Street
     */
    public void setAddr2Street(String addr2Street) {
        this.addr2Street = addr2Street;
    }

    /**
     * @return addr2_house_num
     */
    public String getAddr2HouseNum() {
        return addr2HouseNum;
    }

    /**
     * @param addr2HouseNum
     */
    public void setAddr2HouseNum(String addr2HouseNum) {
        this.addr2HouseNum = addr2HouseNum;
    }

    /**
     * @return addr2_post
     */
    public String getAddr2Post() {
        return addr2Post;
    }

    /**
     * @param addr2Post
     */
    public void setAddr2Post(String addr2Post) {
        this.addr2Post = addr2Post;
    }

    /**
     * @return addr2_city
     */
    public String getAddr2City() {
        return addr2City;
    }

    /**
     * @param addr2City
     */
    public void setAddr2City(String addr2City) {
        this.addr2City = addr2City;
    }

    /**
     * @return addr2_country
     */
    public String getAddr2Country() {
        return addr2Country;
    }

    /**
     * @param addr2Country
     */
    public void setAddr2Country(String addr2Country) {
        this.addr2Country = addr2Country;
    }

    /**
     * @return categ
     */
    public String getCateg() {
        return categ;
    }

    /**
     * @param categ
     */
    public void setCateg(String categ) {
        this.categ = categ;
    }

    /**
     * @return partner_name
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * @param partnerName
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    /**
     * @return partner_utr
     */
    public String getPartnerUtr() {
        return partnerUtr;
    }

    /**
     * @param partnerUtr
     */
    public void setPartnerUtr(String partnerUtr) {
        this.partnerUtr = partnerUtr;
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
     * @return vfnum
     */
    public String getVfnum() {
        return vfnum;
    }

    /**
     * @param vfnum
     */
    public void setVfnum(String vfnum) {
        this.vfnum = vfnum;
    }

    /**
     * @return vfnid
     */
    public String getVfnid() {
        return vfnid;
    }

    /**
     * @param vfnid
     */
    public void setVfnid(String vfnid) {
        this.vfnid = vfnid;
    }

    /**
     * @return crn
     */
    public String getCrn() {
        return crn;
    }

    /**
     * @param crn
     */
    public void setCrn(String crn) {
        this.crn = crn;
    }

    /**
     * @return j_1iexcd
     */
    public String getJ1iexcd() {
        return j1iexcd;
    }

    /**
     * @param j1iexcd
     */
    public void setJ1iexcd(String j1iexcd) {
        this.j1iexcd = j1iexcd;
    }

    /**
     * @return j_1iexrn
     */
    public String getJ1iexrn() {
        return j1iexrn;
    }

    /**
     * @param j1iexrn
     */
    public void setJ1iexrn(String j1iexrn) {
        this.j1iexrn = j1iexrn;
    }

    /**
     * @return j_1iexrg
     */
    public String getJ1iexrg() {
        return j1iexrg;
    }

    /**
     * @param j1iexrg
     */
    public void setJ1iexrg(String j1iexrg) {
        this.j1iexrg = j1iexrg;
    }

    /**
     * @return j_1iexdi
     */
    public String getJ1iexdi() {
        return j1iexdi;
    }

    /**
     * @param j1iexdi
     */
    public void setJ1iexdi(String j1iexdi) {
        this.j1iexdi = j1iexdi;
    }

    /**
     * @return j_1iexco
     */
    public String getJ1iexco() {
        return j1iexco;
    }

    /**
     * @param j1iexco
     */
    public void setJ1iexco(String j1iexco) {
        this.j1iexco = j1iexco;
    }

    /**
     * @return j_1icstno
     */
    public String getJ1icstno() {
        return j1icstno;
    }

    /**
     * @param j1icstno
     */
    public void setJ1icstno(String j1icstno) {
        this.j1icstno = j1icstno;
    }

    /**
     * @return j_1ilstno
     */
    public String getJ1ilstno() {
        return j1ilstno;
    }

    /**
     * @param j1ilstno
     */
    public void setJ1ilstno(String j1ilstno) {
        this.j1ilstno = j1ilstno;
    }

    /**
     * @return j_1ipanno
     */
    public String getJ1ipanno() {
        return j1ipanno;
    }

    /**
     * @param j1ipanno
     */
    public void setJ1ipanno(String j1ipanno) {
        this.j1ipanno = j1ipanno;
    }

    /**
     * @return j_1iexcive
     */
    public String getJ1iexcive() {
        return j1iexcive;
    }

    /**
     * @param j1iexcive
     */
    public void setJ1iexcive(String j1iexcive) {
        this.j1iexcive = j1iexcive;
    }

    /**
     * @return j_1issist
     */
    public String getJ1issist() {
        return j1issist;
    }

    /**
     * @param j1issist
     */
    public void setJ1issist(String j1issist) {
        this.j1issist = j1issist;
    }

    /**
     * @return j_1ivtyp
     */
    public String getJ1ivtyp() {
        return j1ivtyp;
    }

    /**
     * @param j1ivtyp
     */
    public void setJ1ivtyp(String j1ivtyp) {
        this.j1ivtyp = j1ivtyp;
    }

    /**
     * @return j_1ivencre
     */
    public String getJ1ivencre() {
        return j1ivencre;
    }

    /**
     * @param j1ivencre
     */
    public void setJ1ivencre(String j1ivencre) {
        this.j1ivencre = j1ivencre;
    }

    /**
     * @return aedat
     */
    public String getAedat() {
        return aedat;
    }

    /**
     * @param aedat
     */
    public void setAedat(String aedat) {
        this.aedat = aedat;
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
     * @return j_1isern
     */
    public String getJ1isern() {
        return j1isern;
    }

    /**
     * @param j1isern
     */
    public void setJ1isern(String j1isern) {
        this.j1isern = j1isern;
    }

    /**
     * @return j_1ipanref
     */
    public String getJ1ipanref() {
        return j1ipanref;
    }

    /**
     * @param j1ipanref
     */
    public void setJ1ipanref(String j1ipanref) {
        this.j1ipanref = j1ipanref;
    }

    /**
     * @return j_1ipanvaldt
     */
    public String getJ1ipanvaldt() {
        return j1ipanvaldt;
    }

    /**
     * @param j1ipanvaldt
     */
    public void setJ1ipanvaldt(String j1ipanvaldt) {
        this.j1ipanvaldt = j1ipanvaldt;
    }

    /**
     * @return j_1i_customs
     */
    public String getJ1iCustoms() {
        return j1iCustoms;
    }

    /**
     * @param j1iCustoms
     */
    public void setJ1iCustoms(String j1iCustoms) {
        this.j1iCustoms = j1iCustoms;
    }

    /**
     * @return j_1idedref
     */
    public String getJ1idedref() {
        return j1idedref;
    }

    /**
     * @param j1idedref
     */
    public void setJ1idedref(String j1idedref) {
        this.j1idedref = j1idedref;
    }

    /**
     * @return transport_chain
     */
    public String getTransportChain() {
        return transportChain;
    }

    /**
     * @param transportChain
     */
    public void setTransportChain(String transportChain) {
        this.transportChain = transportChain;
    }

    /**
     * @return staging_time
     */
    public Short getStagingTime() {
        return stagingTime;
    }

    /**
     * @param stagingTime
     */
    public void setStagingTime(Short stagingTime) {
        this.stagingTime = stagingTime;
    }

    /**
     * @return scheduling_type
     */
    public String getSchedulingType() {
        return schedulingType;
    }

    /**
     * @param schedulingType
     */
    public void setSchedulingType(String schedulingType) {
        this.schedulingType = schedulingType;
    }

    /**
     * @return submi_relevant
     */
    public String getSubmiRelevant() {
        return submiRelevant;
    }

    /**
     * @param submiRelevant
     */
    public void setSubmiRelevant(String submiRelevant) {
        this.submiRelevant = submiRelevant;
    }

    /**
     * @return ven_class
     */
    public String getVenClass() {
        return venClass;
    }

    /**
     * @param venClass
     */
    public void setVenClass(String venClass) {
        this.venClass = venClass;
    }

    /**
     * @return entpub
     */
    public String getEntpub() {
        return entpub;
    }

    /**
     * @param entpub
     */
    public void setEntpub(String entpub) {
        this.entpub = entpub;
    }

    /**
     * @return escrit
     */
    public String getEscrit() {
        return escrit;
    }

    /**
     * @param escrit
     */
    public void setEscrit(String escrit) {
        this.escrit = escrit;
    }

    /**
     * @return dvalss
     */
    public String getDvalss() {
        return dvalss;
    }

    /**
     * @param dvalss
     */
    public void setDvalss(String dvalss) {
        this.dvalss = dvalss;
    }

    /**
     * @return frmcss
     */
    public String getFrmcss() {
        return frmcss;
    }

    /**
     * @param frmcss
     */
    public void setFrmcss(String frmcss) {
        this.frmcss = frmcss;
    }

    /**
     * @return codcae
     */
    public String getCodcae() {
        return codcae;
    }

    /**
     * @param codcae
     */
    public void setCodcae(String codcae) {
        this.codcae = codcae;
    }

    /**
     * @return ausdiv
     */
    public String getAusdiv() {
        return ausdiv;
    }

    /**
     * @param ausdiv
     */
    public void setAusdiv(String ausdiv) {
        this.ausdiv = ausdiv;
    }
}