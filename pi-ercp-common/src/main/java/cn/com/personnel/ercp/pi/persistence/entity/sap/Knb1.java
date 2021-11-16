package cn.com.personnel.ercp.pi.persistence.entity.sap;

import java.math.BigDecimal;
import javax.persistence.*;

public class Knb1 {
    @Id
    private String bukrs;

    @Id
    @GeneratedValue(generator = "JDBC")
    private String kunnr;

    @Id
    private String mandt;

    private String pernr;

    @Column(name = "knb1_eew_cc")
    private String knb1EewCc;

    private String erdat;

    private String ernam;

    private String sperr;

    private String loevm;

    private String zuawa;

    private String busab;

    private String akont;

    private String begru;

    private String knrze;

    private String knrzb;

    private String zamim;

    private String zamiv;

    private String zamir;

    private String zamib;

    private String zamio;

    private String zwels;

    private String xverr;

    private String zahls;

    private String zterm;

    private String wakon;

    private String vzskz;

    private String zindt;

    private String zinrt;

    private String eikto;

    private String zsabe;

    private String kverm;

    private String fdgrv;

    private String vrbkz;

    private BigDecimal vlibb;

    private Short vrszl;

    private Short vrspr;

    private String vrsnr;

    private String verdt;

    private String perkz;

    private String xdezv;

    private String xausz;

    private BigDecimal webtr;

    private String remit;

    private String datlz;

    private String xzver;

    private String togru;

    private Short kultg;

    private String hbkid;

    private String xpore;

    private String blnkz;

    private String altkn;

    private String zgrup;

    private String urlid;

    private String mgrup;

    private String lockb;

    private String uzawe;

    private String ekvbd;

    private String sregl;

    private String xedip;

    private String frgrp;

    private String vrsdg;

    private String tlfxs;

    private String intad;

    private String xknzb;

    private String guzte;

    private String gricd;

    private String gridt;

    private String wbrsl;

    private String confs;

    private String updat;

    private String uptim;

    private String nodel;

    private String tlfns;

    @Column(name = "cession_kz")
    private String cessionKz;

    private String avsnd;

    @Column(name = "ad_hash")
    private String adHash;

    private String qland;

    @Column(name = "cvp_xblck_b")
    private String cvpXblckB;

    private String ciiucode;

    private String gmvkzd;

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
     * @return knb1_eew_cc
     */
    public String getKnb1EewCc() {
        return knb1EewCc;
    }

    /**
     * @param knb1EewCc
     */
    public void setKnb1EewCc(String knb1EewCc) {
        this.knb1EewCc = knb1EewCc;
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
     * @return zuawa
     */
    public String getZuawa() {
        return zuawa;
    }

    /**
     * @param zuawa
     */
    public void setZuawa(String zuawa) {
        this.zuawa = zuawa;
    }

    /**
     * @return busab
     */
    public String getBusab() {
        return busab;
    }

    /**
     * @param busab
     */
    public void setBusab(String busab) {
        this.busab = busab;
    }

    /**
     * @return akont
     */
    public String getAkont() {
        return akont;
    }

    /**
     * @param akont
     */
    public void setAkont(String akont) {
        this.akont = akont;
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
     * @return knrze
     */
    public String getKnrze() {
        return knrze;
    }

    /**
     * @param knrze
     */
    public void setKnrze(String knrze) {
        this.knrze = knrze;
    }

    /**
     * @return knrzb
     */
    public String getKnrzb() {
        return knrzb;
    }

    /**
     * @param knrzb
     */
    public void setKnrzb(String knrzb) {
        this.knrzb = knrzb;
    }

    /**
     * @return zamim
     */
    public String getZamim() {
        return zamim;
    }

    /**
     * @param zamim
     */
    public void setZamim(String zamim) {
        this.zamim = zamim;
    }

    /**
     * @return zamiv
     */
    public String getZamiv() {
        return zamiv;
    }

    /**
     * @param zamiv
     */
    public void setZamiv(String zamiv) {
        this.zamiv = zamiv;
    }

    /**
     * @return zamir
     */
    public String getZamir() {
        return zamir;
    }

    /**
     * @param zamir
     */
    public void setZamir(String zamir) {
        this.zamir = zamir;
    }

    /**
     * @return zamib
     */
    public String getZamib() {
        return zamib;
    }

    /**
     * @param zamib
     */
    public void setZamib(String zamib) {
        this.zamib = zamib;
    }

    /**
     * @return zamio
     */
    public String getZamio() {
        return zamio;
    }

    /**
     * @param zamio
     */
    public void setZamio(String zamio) {
        this.zamio = zamio;
    }

    /**
     * @return zwels
     */
    public String getZwels() {
        return zwels;
    }

    /**
     * @param zwels
     */
    public void setZwels(String zwels) {
        this.zwels = zwels;
    }

    /**
     * @return xverr
     */
    public String getXverr() {
        return xverr;
    }

    /**
     * @param xverr
     */
    public void setXverr(String xverr) {
        this.xverr = xverr;
    }

    /**
     * @return zahls
     */
    public String getZahls() {
        return zahls;
    }

    /**
     * @param zahls
     */
    public void setZahls(String zahls) {
        this.zahls = zahls;
    }

    /**
     * @return zterm
     */
    public String getZterm() {
        return zterm;
    }

    /**
     * @param zterm
     */
    public void setZterm(String zterm) {
        this.zterm = zterm;
    }

    /**
     * @return wakon
     */
    public String getWakon() {
        return wakon;
    }

    /**
     * @param wakon
     */
    public void setWakon(String wakon) {
        this.wakon = wakon;
    }

    /**
     * @return vzskz
     */
    public String getVzskz() {
        return vzskz;
    }

    /**
     * @param vzskz
     */
    public void setVzskz(String vzskz) {
        this.vzskz = vzskz;
    }

    /**
     * @return zindt
     */
    public String getZindt() {
        return zindt;
    }

    /**
     * @param zindt
     */
    public void setZindt(String zindt) {
        this.zindt = zindt;
    }

    /**
     * @return zinrt
     */
    public String getZinrt() {
        return zinrt;
    }

    /**
     * @param zinrt
     */
    public void setZinrt(String zinrt) {
        this.zinrt = zinrt;
    }

    /**
     * @return eikto
     */
    public String getEikto() {
        return eikto;
    }

    /**
     * @param eikto
     */
    public void setEikto(String eikto) {
        this.eikto = eikto;
    }

    /**
     * @return zsabe
     */
    public String getZsabe() {
        return zsabe;
    }

    /**
     * @param zsabe
     */
    public void setZsabe(String zsabe) {
        this.zsabe = zsabe;
    }

    /**
     * @return kverm
     */
    public String getKverm() {
        return kverm;
    }

    /**
     * @param kverm
     */
    public void setKverm(String kverm) {
        this.kverm = kverm;
    }

    /**
     * @return fdgrv
     */
    public String getFdgrv() {
        return fdgrv;
    }

    /**
     * @param fdgrv
     */
    public void setFdgrv(String fdgrv) {
        this.fdgrv = fdgrv;
    }

    /**
     * @return vrbkz
     */
    public String getVrbkz() {
        return vrbkz;
    }

    /**
     * @param vrbkz
     */
    public void setVrbkz(String vrbkz) {
        this.vrbkz = vrbkz;
    }

    /**
     * @return vlibb
     */
    public BigDecimal getVlibb() {
        return vlibb;
    }

    /**
     * @param vlibb
     */
    public void setVlibb(BigDecimal vlibb) {
        this.vlibb = vlibb;
    }

    /**
     * @return vrszl
     */
    public Short getVrszl() {
        return vrszl;
    }

    /**
     * @param vrszl
     */
    public void setVrszl(Short vrszl) {
        this.vrszl = vrszl;
    }

    /**
     * @return vrspr
     */
    public Short getVrspr() {
        return vrspr;
    }

    /**
     * @param vrspr
     */
    public void setVrspr(Short vrspr) {
        this.vrspr = vrspr;
    }

    /**
     * @return vrsnr
     */
    public String getVrsnr() {
        return vrsnr;
    }

    /**
     * @param vrsnr
     */
    public void setVrsnr(String vrsnr) {
        this.vrsnr = vrsnr;
    }

    /**
     * @return verdt
     */
    public String getVerdt() {
        return verdt;
    }

    /**
     * @param verdt
     */
    public void setVerdt(String verdt) {
        this.verdt = verdt;
    }

    /**
     * @return perkz
     */
    public String getPerkz() {
        return perkz;
    }

    /**
     * @param perkz
     */
    public void setPerkz(String perkz) {
        this.perkz = perkz;
    }

    /**
     * @return xdezv
     */
    public String getXdezv() {
        return xdezv;
    }

    /**
     * @param xdezv
     */
    public void setXdezv(String xdezv) {
        this.xdezv = xdezv;
    }

    /**
     * @return xausz
     */
    public String getXausz() {
        return xausz;
    }

    /**
     * @param xausz
     */
    public void setXausz(String xausz) {
        this.xausz = xausz;
    }

    /**
     * @return webtr
     */
    public BigDecimal getWebtr() {
        return webtr;
    }

    /**
     * @param webtr
     */
    public void setWebtr(BigDecimal webtr) {
        this.webtr = webtr;
    }

    /**
     * @return remit
     */
    public String getRemit() {
        return remit;
    }

    /**
     * @param remit
     */
    public void setRemit(String remit) {
        this.remit = remit;
    }

    /**
     * @return datlz
     */
    public String getDatlz() {
        return datlz;
    }

    /**
     * @param datlz
     */
    public void setDatlz(String datlz) {
        this.datlz = datlz;
    }

    /**
     * @return xzver
     */
    public String getXzver() {
        return xzver;
    }

    /**
     * @param xzver
     */
    public void setXzver(String xzver) {
        this.xzver = xzver;
    }

    /**
     * @return togru
     */
    public String getTogru() {
        return togru;
    }

    /**
     * @param togru
     */
    public void setTogru(String togru) {
        this.togru = togru;
    }

    /**
     * @return kultg
     */
    public Short getKultg() {
        return kultg;
    }

    /**
     * @param kultg
     */
    public void setKultg(Short kultg) {
        this.kultg = kultg;
    }

    /**
     * @return hbkid
     */
    public String getHbkid() {
        return hbkid;
    }

    /**
     * @param hbkid
     */
    public void setHbkid(String hbkid) {
        this.hbkid = hbkid;
    }

    /**
     * @return xpore
     */
    public String getXpore() {
        return xpore;
    }

    /**
     * @param xpore
     */
    public void setXpore(String xpore) {
        this.xpore = xpore;
    }

    /**
     * @return blnkz
     */
    public String getBlnkz() {
        return blnkz;
    }

    /**
     * @param blnkz
     */
    public void setBlnkz(String blnkz) {
        this.blnkz = blnkz;
    }

    /**
     * @return altkn
     */
    public String getAltkn() {
        return altkn;
    }

    /**
     * @param altkn
     */
    public void setAltkn(String altkn) {
        this.altkn = altkn;
    }

    /**
     * @return zgrup
     */
    public String getZgrup() {
        return zgrup;
    }

    /**
     * @param zgrup
     */
    public void setZgrup(String zgrup) {
        this.zgrup = zgrup;
    }

    /**
     * @return urlid
     */
    public String getUrlid() {
        return urlid;
    }

    /**
     * @param urlid
     */
    public void setUrlid(String urlid) {
        this.urlid = urlid;
    }

    /**
     * @return mgrup
     */
    public String getMgrup() {
        return mgrup;
    }

    /**
     * @param mgrup
     */
    public void setMgrup(String mgrup) {
        this.mgrup = mgrup;
    }

    /**
     * @return lockb
     */
    public String getLockb() {
        return lockb;
    }

    /**
     * @param lockb
     */
    public void setLockb(String lockb) {
        this.lockb = lockb;
    }

    /**
     * @return uzawe
     */
    public String getUzawe() {
        return uzawe;
    }

    /**
     * @param uzawe
     */
    public void setUzawe(String uzawe) {
        this.uzawe = uzawe;
    }

    /**
     * @return ekvbd
     */
    public String getEkvbd() {
        return ekvbd;
    }

    /**
     * @param ekvbd
     */
    public void setEkvbd(String ekvbd) {
        this.ekvbd = ekvbd;
    }

    /**
     * @return sregl
     */
    public String getSregl() {
        return sregl;
    }

    /**
     * @param sregl
     */
    public void setSregl(String sregl) {
        this.sregl = sregl;
    }

    /**
     * @return xedip
     */
    public String getXedip() {
        return xedip;
    }

    /**
     * @param xedip
     */
    public void setXedip(String xedip) {
        this.xedip = xedip;
    }

    /**
     * @return frgrp
     */
    public String getFrgrp() {
        return frgrp;
    }

    /**
     * @param frgrp
     */
    public void setFrgrp(String frgrp) {
        this.frgrp = frgrp;
    }

    /**
     * @return vrsdg
     */
    public String getVrsdg() {
        return vrsdg;
    }

    /**
     * @param vrsdg
     */
    public void setVrsdg(String vrsdg) {
        this.vrsdg = vrsdg;
    }

    /**
     * @return tlfxs
     */
    public String getTlfxs() {
        return tlfxs;
    }

    /**
     * @param tlfxs
     */
    public void setTlfxs(String tlfxs) {
        this.tlfxs = tlfxs;
    }

    /**
     * @return intad
     */
    public String getIntad() {
        return intad;
    }

    /**
     * @param intad
     */
    public void setIntad(String intad) {
        this.intad = intad;
    }

    /**
     * @return xknzb
     */
    public String getXknzb() {
        return xknzb;
    }

    /**
     * @param xknzb
     */
    public void setXknzb(String xknzb) {
        this.xknzb = xknzb;
    }

    /**
     * @return guzte
     */
    public String getGuzte() {
        return guzte;
    }

    /**
     * @param guzte
     */
    public void setGuzte(String guzte) {
        this.guzte = guzte;
    }

    /**
     * @return gricd
     */
    public String getGricd() {
        return gricd;
    }

    /**
     * @param gricd
     */
    public void setGricd(String gricd) {
        this.gricd = gricd;
    }

    /**
     * @return gridt
     */
    public String getGridt() {
        return gridt;
    }

    /**
     * @param gridt
     */
    public void setGridt(String gridt) {
        this.gridt = gridt;
    }

    /**
     * @return wbrsl
     */
    public String getWbrsl() {
        return wbrsl;
    }

    /**
     * @param wbrsl
     */
    public void setWbrsl(String wbrsl) {
        this.wbrsl = wbrsl;
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
     * @return tlfns
     */
    public String getTlfns() {
        return tlfns;
    }

    /**
     * @param tlfns
     */
    public void setTlfns(String tlfns) {
        this.tlfns = tlfns;
    }

    /**
     * @return cession_kz
     */
    public String getCessionKz() {
        return cessionKz;
    }

    /**
     * @param cessionKz
     */
    public void setCessionKz(String cessionKz) {
        this.cessionKz = cessionKz;
    }

    /**
     * @return avsnd
     */
    public String getAvsnd() {
        return avsnd;
    }

    /**
     * @param avsnd
     */
    public void setAvsnd(String avsnd) {
        this.avsnd = avsnd;
    }

    /**
     * @return ad_hash
     */
    public String getAdHash() {
        return adHash;
    }

    /**
     * @param adHash
     */
    public void setAdHash(String adHash) {
        this.adHash = adHash;
    }

    /**
     * @return qland
     */
    public String getQland() {
        return qland;
    }

    /**
     * @param qland
     */
    public void setQland(String qland) {
        this.qland = qland;
    }

    /**
     * @return cvp_xblck_b
     */
    public String getCvpXblckB() {
        return cvpXblckB;
    }

    /**
     * @param cvpXblckB
     */
    public void setCvpXblckB(String cvpXblckB) {
        this.cvpXblckB = cvpXblckB;
    }

    /**
     * @return ciiucode
     */
    public String getCiiucode() {
        return ciiucode;
    }

    /**
     * @param ciiucode
     */
    public void setCiiucode(String ciiucode) {
        this.ciiucode = ciiucode;
    }

    /**
     * @return gmvkzd
     */
    public String getGmvkzd() {
        return gmvkzd;
    }

    /**
     * @param gmvkzd
     */
    public void setGmvkzd(String gmvkzd) {
        this.gmvkzd = gmvkzd;
    }
}