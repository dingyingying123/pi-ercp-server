package cn.com.personnel.ercp.pi.persistence.entity.sap;

import javax.persistence.*;

public class Skb1 {
    @Id
    private String bukrs;

    @Id
    private String mandt;

    @Id
    @GeneratedValue(generator = "JDBC")
    private String saknr;

    private String begru;

    private String busab;

    private String datlz;

    private String erdat;

    private String ernam;

    private String fdgrv;

    private String fdlev;

    private String fipls;

    private String fstag;

    private String hbkid;

    private String hktid;

    private String kdfsl;

    private String mitkz;

    private String mwskz;

    private String stext;

    private String vzskz;

    private String waers;

    private String wmeth;

    private String xgkon;

    private String xintb;

    private String xkres;

    private String xloeb;

    private String xnkon;

    private String xopvw;

    private String xspeb;

    private String zindt;

    private String zinrt;

    private String zuawa;

    private String altkt;

    private String xmitk;

    private String recid;

    private String fipos;

    private String xmwno;

    private String xsalh;

    private String bewgp;

    private String infky;

    private String togru;

    private String xlgclr;

    private String mcakey;

    private String cochanged;

    @Column(name = "last_changed_ts")
    private Long lastChangedTs;

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
     * @return saknr
     */
    public String getSaknr() {
        return saknr;
    }

    /**
     * @param saknr
     */
    public void setSaknr(String saknr) {
        this.saknr = saknr;
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
     * @return fdlev
     */
    public String getFdlev() {
        return fdlev;
    }

    /**
     * @param fdlev
     */
    public void setFdlev(String fdlev) {
        this.fdlev = fdlev;
    }

    /**
     * @return fipls
     */
    public String getFipls() {
        return fipls;
    }

    /**
     * @param fipls
     */
    public void setFipls(String fipls) {
        this.fipls = fipls;
    }

    /**
     * @return fstag
     */
    public String getFstag() {
        return fstag;
    }

    /**
     * @param fstag
     */
    public void setFstag(String fstag) {
        this.fstag = fstag;
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
     * @return hktid
     */
    public String getHktid() {
        return hktid;
    }

    /**
     * @param hktid
     */
    public void setHktid(String hktid) {
        this.hktid = hktid;
    }

    /**
     * @return kdfsl
     */
    public String getKdfsl() {
        return kdfsl;
    }

    /**
     * @param kdfsl
     */
    public void setKdfsl(String kdfsl) {
        this.kdfsl = kdfsl;
    }

    /**
     * @return mitkz
     */
    public String getMitkz() {
        return mitkz;
    }

    /**
     * @param mitkz
     */
    public void setMitkz(String mitkz) {
        this.mitkz = mitkz;
    }

    /**
     * @return mwskz
     */
    public String getMwskz() {
        return mwskz;
    }

    /**
     * @param mwskz
     */
    public void setMwskz(String mwskz) {
        this.mwskz = mwskz;
    }

    /**
     * @return stext
     */
    public String getStext() {
        return stext;
    }

    /**
     * @param stext
     */
    public void setStext(String stext) {
        this.stext = stext;
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
     * @return wmeth
     */
    public String getWmeth() {
        return wmeth;
    }

    /**
     * @param wmeth
     */
    public void setWmeth(String wmeth) {
        this.wmeth = wmeth;
    }

    /**
     * @return xgkon
     */
    public String getXgkon() {
        return xgkon;
    }

    /**
     * @param xgkon
     */
    public void setXgkon(String xgkon) {
        this.xgkon = xgkon;
    }

    /**
     * @return xintb
     */
    public String getXintb() {
        return xintb;
    }

    /**
     * @param xintb
     */
    public void setXintb(String xintb) {
        this.xintb = xintb;
    }

    /**
     * @return xkres
     */
    public String getXkres() {
        return xkres;
    }

    /**
     * @param xkres
     */
    public void setXkres(String xkres) {
        this.xkres = xkres;
    }

    /**
     * @return xloeb
     */
    public String getXloeb() {
        return xloeb;
    }

    /**
     * @param xloeb
     */
    public void setXloeb(String xloeb) {
        this.xloeb = xloeb;
    }

    /**
     * @return xnkon
     */
    public String getXnkon() {
        return xnkon;
    }

    /**
     * @param xnkon
     */
    public void setXnkon(String xnkon) {
        this.xnkon = xnkon;
    }

    /**
     * @return xopvw
     */
    public String getXopvw() {
        return xopvw;
    }

    /**
     * @param xopvw
     */
    public void setXopvw(String xopvw) {
        this.xopvw = xopvw;
    }

    /**
     * @return xspeb
     */
    public String getXspeb() {
        return xspeb;
    }

    /**
     * @param xspeb
     */
    public void setXspeb(String xspeb) {
        this.xspeb = xspeb;
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
     * @return altkt
     */
    public String getAltkt() {
        return altkt;
    }

    /**
     * @param altkt
     */
    public void setAltkt(String altkt) {
        this.altkt = altkt;
    }

    /**
     * @return xmitk
     */
    public String getXmitk() {
        return xmitk;
    }

    /**
     * @param xmitk
     */
    public void setXmitk(String xmitk) {
        this.xmitk = xmitk;
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
     * @return fipos
     */
    public String getFipos() {
        return fipos;
    }

    /**
     * @param fipos
     */
    public void setFipos(String fipos) {
        this.fipos = fipos;
    }

    /**
     * @return xmwno
     */
    public String getXmwno() {
        return xmwno;
    }

    /**
     * @param xmwno
     */
    public void setXmwno(String xmwno) {
        this.xmwno = xmwno;
    }

    /**
     * @return xsalh
     */
    public String getXsalh() {
        return xsalh;
    }

    /**
     * @param xsalh
     */
    public void setXsalh(String xsalh) {
        this.xsalh = xsalh;
    }

    /**
     * @return bewgp
     */
    public String getBewgp() {
        return bewgp;
    }

    /**
     * @param bewgp
     */
    public void setBewgp(String bewgp) {
        this.bewgp = bewgp;
    }

    /**
     * @return infky
     */
    public String getInfky() {
        return infky;
    }

    /**
     * @param infky
     */
    public void setInfky(String infky) {
        this.infky = infky;
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
     * @return xlgclr
     */
    public String getXlgclr() {
        return xlgclr;
    }

    /**
     * @param xlgclr
     */
    public void setXlgclr(String xlgclr) {
        this.xlgclr = xlgclr;
    }

    /**
     * @return mcakey
     */
    public String getMcakey() {
        return mcakey;
    }

    /**
     * @param mcakey
     */
    public void setMcakey(String mcakey) {
        this.mcakey = mcakey;
    }

    /**
     * @return cochanged
     */
    public String getCochanged() {
        return cochanged;
    }

    /**
     * @param cochanged
     */
    public void setCochanged(String cochanged) {
        this.cochanged = cochanged;
    }

    /**
     * @return last_changed_ts
     */
    public Long getLastChangedTs() {
        return lastChangedTs;
    }

    /**
     * @param lastChangedTs
     */
    public void setLastChangedTs(Long lastChangedTs) {
        this.lastChangedTs = lastChangedTs;
    }
}