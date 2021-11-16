package cn.com.personnel.ercp.pi.persistence.entity.sap;

import javax.persistence.*;

public class T001 {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String bukrs;

    @Id
    @GeneratedValue(generator = "JDBC")
    private String mandt;

    private String butxt;

    private String ort01;

    private String land1;

    private String waers;

    private String spras;

    private String ktopl;

    private String waabw;

    private String periv;

    private String kokfi;

    private String rcomp;

    private String adrnr;

    private String stceg;

    private String fikrs;

    private String xfmco;

    private String xfmcb;

    private String xfmca;

    private String txjcd;

    private String fmhrdate;

    private String xtemplt;

    private String buvar;

    private String fdbuk;

    private String xfdis;

    private String xvalv;

    private String xskfn;

    private String kkber;

    private String xmwsn;

    private String mregl;

    private String xgsbe;

    private String xgjrv;

    private String xkdft;

    private String xprod;

    private String xeink;

    private String xjvaa;

    private String xvvwa;

    private String xslta;

    private String xfdmm;

    private String xfdsd;

    private String xextb;

    private String ebukr;

    private String ktop2;

    private String umkrs;

    @Column(name = "bukrs_glob")
    private String bukrsGlob;

    private String fstva;

    private String opvar;

    private String xcovr;

    private String txkrs;

    private String wfvar;

    private String xbbbf;

    private String xbbbe;

    private String xbbba;

    private String xbbko;

    private String xstdt;

    private String mwskv;

    private String mwska;

    private String impda;

    private String xnegp;

    private String xkkbi;

    @Column(name = "wt_newwt")
    private String wtNewwt;

    @Column(name = "pp_pdate")
    private String ppPdate;

    private String infmt;

    private String fstvare;

    private String kopim;

    private String dkweg;

    private String offsacct;

    private String bapovar;

    private String xcos;

    private String xcession;

    private String xsplt;

    private String surccm;

    private String dtprov;

    private String dtamtc;

    private String dttaxc;

    private String dttdsp;

    private String dtaxr;

    private String xvatdate;

    @Column(name = "pst_per_var")
    private String pstPerVar;

    private String xbbsc;

    @Column(name = "fm_derive_acc")
    private String fmDeriveAcc;

    @Column(name = "f_obsolete")
    private String fObsolete;

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
     * @return ktopl
     */
    public String getKtopl() {
        return ktopl;
    }

    /**
     * @param ktopl
     */
    public void setKtopl(String ktopl) {
        this.ktopl = ktopl;
    }

    /**
     * @return waabw
     */
    public String getWaabw() {
        return waabw;
    }

    /**
     * @param waabw
     */
    public void setWaabw(String waabw) {
        this.waabw = waabw;
    }

    /**
     * @return periv
     */
    public String getPeriv() {
        return periv;
    }

    /**
     * @param periv
     */
    public void setPeriv(String periv) {
        this.periv = periv;
    }

    /**
     * @return kokfi
     */
    public String getKokfi() {
        return kokfi;
    }

    /**
     * @param kokfi
     */
    public void setKokfi(String kokfi) {
        this.kokfi = kokfi;
    }

    /**
     * @return rcomp
     */
    public String getRcomp() {
        return rcomp;
    }

    /**
     * @param rcomp
     */
    public void setRcomp(String rcomp) {
        this.rcomp = rcomp;
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
     * @return fikrs
     */
    public String getFikrs() {
        return fikrs;
    }

    /**
     * @param fikrs
     */
    public void setFikrs(String fikrs) {
        this.fikrs = fikrs;
    }

    /**
     * @return xfmco
     */
    public String getXfmco() {
        return xfmco;
    }

    /**
     * @param xfmco
     */
    public void setXfmco(String xfmco) {
        this.xfmco = xfmco;
    }

    /**
     * @return xfmcb
     */
    public String getXfmcb() {
        return xfmcb;
    }

    /**
     * @param xfmcb
     */
    public void setXfmcb(String xfmcb) {
        this.xfmcb = xfmcb;
    }

    /**
     * @return xfmca
     */
    public String getXfmca() {
        return xfmca;
    }

    /**
     * @param xfmca
     */
    public void setXfmca(String xfmca) {
        this.xfmca = xfmca;
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
     * @return fmhrdate
     */
    public String getFmhrdate() {
        return fmhrdate;
    }

    /**
     * @param fmhrdate
     */
    public void setFmhrdate(String fmhrdate) {
        this.fmhrdate = fmhrdate;
    }

    /**
     * @return xtemplt
     */
    public String getXtemplt() {
        return xtemplt;
    }

    /**
     * @param xtemplt
     */
    public void setXtemplt(String xtemplt) {
        this.xtemplt = xtemplt;
    }

    /**
     * @return buvar
     */
    public String getBuvar() {
        return buvar;
    }

    /**
     * @param buvar
     */
    public void setBuvar(String buvar) {
        this.buvar = buvar;
    }

    /**
     * @return fdbuk
     */
    public String getFdbuk() {
        return fdbuk;
    }

    /**
     * @param fdbuk
     */
    public void setFdbuk(String fdbuk) {
        this.fdbuk = fdbuk;
    }

    /**
     * @return xfdis
     */
    public String getXfdis() {
        return xfdis;
    }

    /**
     * @param xfdis
     */
    public void setXfdis(String xfdis) {
        this.xfdis = xfdis;
    }

    /**
     * @return xvalv
     */
    public String getXvalv() {
        return xvalv;
    }

    /**
     * @param xvalv
     */
    public void setXvalv(String xvalv) {
        this.xvalv = xvalv;
    }

    /**
     * @return xskfn
     */
    public String getXskfn() {
        return xskfn;
    }

    /**
     * @param xskfn
     */
    public void setXskfn(String xskfn) {
        this.xskfn = xskfn;
    }

    /**
     * @return kkber
     */
    public String getKkber() {
        return kkber;
    }

    /**
     * @param kkber
     */
    public void setKkber(String kkber) {
        this.kkber = kkber;
    }

    /**
     * @return xmwsn
     */
    public String getXmwsn() {
        return xmwsn;
    }

    /**
     * @param xmwsn
     */
    public void setXmwsn(String xmwsn) {
        this.xmwsn = xmwsn;
    }

    /**
     * @return mregl
     */
    public String getMregl() {
        return mregl;
    }

    /**
     * @param mregl
     */
    public void setMregl(String mregl) {
        this.mregl = mregl;
    }

    /**
     * @return xgsbe
     */
    public String getXgsbe() {
        return xgsbe;
    }

    /**
     * @param xgsbe
     */
    public void setXgsbe(String xgsbe) {
        this.xgsbe = xgsbe;
    }

    /**
     * @return xgjrv
     */
    public String getXgjrv() {
        return xgjrv;
    }

    /**
     * @param xgjrv
     */
    public void setXgjrv(String xgjrv) {
        this.xgjrv = xgjrv;
    }

    /**
     * @return xkdft
     */
    public String getXkdft() {
        return xkdft;
    }

    /**
     * @param xkdft
     */
    public void setXkdft(String xkdft) {
        this.xkdft = xkdft;
    }

    /**
     * @return xprod
     */
    public String getXprod() {
        return xprod;
    }

    /**
     * @param xprod
     */
    public void setXprod(String xprod) {
        this.xprod = xprod;
    }

    /**
     * @return xeink
     */
    public String getXeink() {
        return xeink;
    }

    /**
     * @param xeink
     */
    public void setXeink(String xeink) {
        this.xeink = xeink;
    }

    /**
     * @return xjvaa
     */
    public String getXjvaa() {
        return xjvaa;
    }

    /**
     * @param xjvaa
     */
    public void setXjvaa(String xjvaa) {
        this.xjvaa = xjvaa;
    }

    /**
     * @return xvvwa
     */
    public String getXvvwa() {
        return xvvwa;
    }

    /**
     * @param xvvwa
     */
    public void setXvvwa(String xvvwa) {
        this.xvvwa = xvvwa;
    }

    /**
     * @return xslta
     */
    public String getXslta() {
        return xslta;
    }

    /**
     * @param xslta
     */
    public void setXslta(String xslta) {
        this.xslta = xslta;
    }

    /**
     * @return xfdmm
     */
    public String getXfdmm() {
        return xfdmm;
    }

    /**
     * @param xfdmm
     */
    public void setXfdmm(String xfdmm) {
        this.xfdmm = xfdmm;
    }

    /**
     * @return xfdsd
     */
    public String getXfdsd() {
        return xfdsd;
    }

    /**
     * @param xfdsd
     */
    public void setXfdsd(String xfdsd) {
        this.xfdsd = xfdsd;
    }

    /**
     * @return xextb
     */
    public String getXextb() {
        return xextb;
    }

    /**
     * @param xextb
     */
    public void setXextb(String xextb) {
        this.xextb = xextb;
    }

    /**
     * @return ebukr
     */
    public String getEbukr() {
        return ebukr;
    }

    /**
     * @param ebukr
     */
    public void setEbukr(String ebukr) {
        this.ebukr = ebukr;
    }

    /**
     * @return ktop2
     */
    public String getKtop2() {
        return ktop2;
    }

    /**
     * @param ktop2
     */
    public void setKtop2(String ktop2) {
        this.ktop2 = ktop2;
    }

    /**
     * @return umkrs
     */
    public String getUmkrs() {
        return umkrs;
    }

    /**
     * @param umkrs
     */
    public void setUmkrs(String umkrs) {
        this.umkrs = umkrs;
    }

    /**
     * @return bukrs_glob
     */
    public String getBukrsGlob() {
        return bukrsGlob;
    }

    /**
     * @param bukrsGlob
     */
    public void setBukrsGlob(String bukrsGlob) {
        this.bukrsGlob = bukrsGlob;
    }

    /**
     * @return fstva
     */
    public String getFstva() {
        return fstva;
    }

    /**
     * @param fstva
     */
    public void setFstva(String fstva) {
        this.fstva = fstva;
    }

    /**
     * @return opvar
     */
    public String getOpvar() {
        return opvar;
    }

    /**
     * @param opvar
     */
    public void setOpvar(String opvar) {
        this.opvar = opvar;
    }

    /**
     * @return xcovr
     */
    public String getXcovr() {
        return xcovr;
    }

    /**
     * @param xcovr
     */
    public void setXcovr(String xcovr) {
        this.xcovr = xcovr;
    }

    /**
     * @return txkrs
     */
    public String getTxkrs() {
        return txkrs;
    }

    /**
     * @param txkrs
     */
    public void setTxkrs(String txkrs) {
        this.txkrs = txkrs;
    }

    /**
     * @return wfvar
     */
    public String getWfvar() {
        return wfvar;
    }

    /**
     * @param wfvar
     */
    public void setWfvar(String wfvar) {
        this.wfvar = wfvar;
    }

    /**
     * @return xbbbf
     */
    public String getXbbbf() {
        return xbbbf;
    }

    /**
     * @param xbbbf
     */
    public void setXbbbf(String xbbbf) {
        this.xbbbf = xbbbf;
    }

    /**
     * @return xbbbe
     */
    public String getXbbbe() {
        return xbbbe;
    }

    /**
     * @param xbbbe
     */
    public void setXbbbe(String xbbbe) {
        this.xbbbe = xbbbe;
    }

    /**
     * @return xbbba
     */
    public String getXbbba() {
        return xbbba;
    }

    /**
     * @param xbbba
     */
    public void setXbbba(String xbbba) {
        this.xbbba = xbbba;
    }

    /**
     * @return xbbko
     */
    public String getXbbko() {
        return xbbko;
    }

    /**
     * @param xbbko
     */
    public void setXbbko(String xbbko) {
        this.xbbko = xbbko;
    }

    /**
     * @return xstdt
     */
    public String getXstdt() {
        return xstdt;
    }

    /**
     * @param xstdt
     */
    public void setXstdt(String xstdt) {
        this.xstdt = xstdt;
    }

    /**
     * @return mwskv
     */
    public String getMwskv() {
        return mwskv;
    }

    /**
     * @param mwskv
     */
    public void setMwskv(String mwskv) {
        this.mwskv = mwskv;
    }

    /**
     * @return mwska
     */
    public String getMwska() {
        return mwska;
    }

    /**
     * @param mwska
     */
    public void setMwska(String mwska) {
        this.mwska = mwska;
    }

    /**
     * @return impda
     */
    public String getImpda() {
        return impda;
    }

    /**
     * @param impda
     */
    public void setImpda(String impda) {
        this.impda = impda;
    }

    /**
     * @return xnegp
     */
    public String getXnegp() {
        return xnegp;
    }

    /**
     * @param xnegp
     */
    public void setXnegp(String xnegp) {
        this.xnegp = xnegp;
    }

    /**
     * @return xkkbi
     */
    public String getXkkbi() {
        return xkkbi;
    }

    /**
     * @param xkkbi
     */
    public void setXkkbi(String xkkbi) {
        this.xkkbi = xkkbi;
    }

    /**
     * @return wt_newwt
     */
    public String getWtNewwt() {
        return wtNewwt;
    }

    /**
     * @param wtNewwt
     */
    public void setWtNewwt(String wtNewwt) {
        this.wtNewwt = wtNewwt;
    }

    /**
     * @return pp_pdate
     */
    public String getPpPdate() {
        return ppPdate;
    }

    /**
     * @param ppPdate
     */
    public void setPpPdate(String ppPdate) {
        this.ppPdate = ppPdate;
    }

    /**
     * @return infmt
     */
    public String getInfmt() {
        return infmt;
    }

    /**
     * @param infmt
     */
    public void setInfmt(String infmt) {
        this.infmt = infmt;
    }

    /**
     * @return fstvare
     */
    public String getFstvare() {
        return fstvare;
    }

    /**
     * @param fstvare
     */
    public void setFstvare(String fstvare) {
        this.fstvare = fstvare;
    }

    /**
     * @return kopim
     */
    public String getKopim() {
        return kopim;
    }

    /**
     * @param kopim
     */
    public void setKopim(String kopim) {
        this.kopim = kopim;
    }

    /**
     * @return dkweg
     */
    public String getDkweg() {
        return dkweg;
    }

    /**
     * @param dkweg
     */
    public void setDkweg(String dkweg) {
        this.dkweg = dkweg;
    }

    /**
     * @return offsacct
     */
    public String getOffsacct() {
        return offsacct;
    }

    /**
     * @param offsacct
     */
    public void setOffsacct(String offsacct) {
        this.offsacct = offsacct;
    }

    /**
     * @return bapovar
     */
    public String getBapovar() {
        return bapovar;
    }

    /**
     * @param bapovar
     */
    public void setBapovar(String bapovar) {
        this.bapovar = bapovar;
    }

    /**
     * @return xcos
     */
    public String getXcos() {
        return xcos;
    }

    /**
     * @param xcos
     */
    public void setXcos(String xcos) {
        this.xcos = xcos;
    }

    /**
     * @return xcession
     */
    public String getXcession() {
        return xcession;
    }

    /**
     * @param xcession
     */
    public void setXcession(String xcession) {
        this.xcession = xcession;
    }

    /**
     * @return xsplt
     */
    public String getXsplt() {
        return xsplt;
    }

    /**
     * @param xsplt
     */
    public void setXsplt(String xsplt) {
        this.xsplt = xsplt;
    }

    /**
     * @return surccm
     */
    public String getSurccm() {
        return surccm;
    }

    /**
     * @param surccm
     */
    public void setSurccm(String surccm) {
        this.surccm = surccm;
    }

    /**
     * @return dtprov
     */
    public String getDtprov() {
        return dtprov;
    }

    /**
     * @param dtprov
     */
    public void setDtprov(String dtprov) {
        this.dtprov = dtprov;
    }

    /**
     * @return dtamtc
     */
    public String getDtamtc() {
        return dtamtc;
    }

    /**
     * @param dtamtc
     */
    public void setDtamtc(String dtamtc) {
        this.dtamtc = dtamtc;
    }

    /**
     * @return dttaxc
     */
    public String getDttaxc() {
        return dttaxc;
    }

    /**
     * @param dttaxc
     */
    public void setDttaxc(String dttaxc) {
        this.dttaxc = dttaxc;
    }

    /**
     * @return dttdsp
     */
    public String getDttdsp() {
        return dttdsp;
    }

    /**
     * @param dttdsp
     */
    public void setDttdsp(String dttdsp) {
        this.dttdsp = dttdsp;
    }

    /**
     * @return dtaxr
     */
    public String getDtaxr() {
        return dtaxr;
    }

    /**
     * @param dtaxr
     */
    public void setDtaxr(String dtaxr) {
        this.dtaxr = dtaxr;
    }

    /**
     * @return xvatdate
     */
    public String getXvatdate() {
        return xvatdate;
    }

    /**
     * @param xvatdate
     */
    public void setXvatdate(String xvatdate) {
        this.xvatdate = xvatdate;
    }

    /**
     * @return pst_per_var
     */
    public String getPstPerVar() {
        return pstPerVar;
    }

    /**
     * @param pstPerVar
     */
    public void setPstPerVar(String pstPerVar) {
        this.pstPerVar = pstPerVar;
    }

    /**
     * @return xbbsc
     */
    public String getXbbsc() {
        return xbbsc;
    }

    /**
     * @param xbbsc
     */
    public void setXbbsc(String xbbsc) {
        this.xbbsc = xbbsc;
    }

    /**
     * @return fm_derive_acc
     */
    public String getFmDeriveAcc() {
        return fmDeriveAcc;
    }

    /**
     * @param fmDeriveAcc
     */
    public void setFmDeriveAcc(String fmDeriveAcc) {
        this.fmDeriveAcc = fmDeriveAcc;
    }

    /**
     * @return f_obsolete
     */
    public String getfObsolete() {
        return fObsolete;
    }

    /**
     * @param fObsolete
     */
    public void setfObsolete(String fObsolete) {
        this.fObsolete = fObsolete;
    }
}