package cn.com.personnel.ercp.pi.persistence.entity.sap;

import java.math.BigDecimal;
import javax.persistence.*;

public class Kna1 {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String kunnr;

    @Id
    private String mandt;

    private String land1;

    private String name1;

    private String name2;

    private String ort01;

    private String pstlz;

    private String regio;

    private String sortl;

    private String stras;

    private String telf1;

    private String telfx;

    private String xcpdk;

    private String adrnr;

    private String mcod1;

    private String mcod2;

    private String mcod3;

    private String anred;

    private String aufsd;

    private String bahne;

    private String bahns;

    private String bbbnr;

    private String bbsnr;

    private String begru;

    private String brsch;

    private String bubkz;

    private String datlt;

    private String erdat;

    private String ernam;

    private String exabl;

    private String faksd;

    private String fiskn;

    private String knazk;

    private String knrza;

    private String konzs;

    private String ktokd;

    private String kukla;

    private String lifnr;

    private String lifsd;

    private String locco;

    private String loevm;

    private String name3;

    private String name4;

    private String niels;

    private String ort02;

    private String pfach;

    private String pstl2;

    private String counc;

    private String cityc;

    private String rpmkr;

    private String sperr;

    private String spras;

    private String stcd1;

    private String stcd2;

    private String stkza;

    private String stkzu;

    private String telbx;

    private String telf2;

    private String teltx;

    private String telx1;

    private String lzone;

    private String xzemp;

    private String vbund;

    private String stceg;

    private String dear1;

    private String dear2;

    private String dear3;

    private String dear4;

    private String dear5;

    private String gform;

    private String bran1;

    private String bran2;

    private String bran3;

    private String bran4;

    private String bran5;

    private String ekont;

    private BigDecimal umsat;

    private String umjah;

    private String uwaer;

    private String jmzah;

    private String jmjah;

    private String katr1;

    private String katr2;

    private String katr3;

    private String katr4;

    private String katr5;

    private String katr6;

    private String katr7;

    private String katr8;

    private String katr9;

    private String katr10;

    private String stkzn;

    private BigDecimal umsa1;

    private String txjcd;

    private String periv;

    private String abrvw;

    private String inspbydebi;

    private String inspatdebi;

    private String ktocd;

    private String pfort;

    private String werks;

    private String dtams;

    private String dtaws;

    private String duefl;

    private String hzuor;

    private String sperz;

    private String etikg;

    private String civve;

    private String milve;

    private String kdkg1;

    private String kdkg2;

    private String kdkg3;

    private String kdkg4;

    private String kdkg5;

    private String xknza;

    private String fityp;

    private String stcdt;

    private String stcd3;

    private String stcd4;

    private String stcd5;

    private String xicms;

    private String xxipi;

    private String xsubt;

    private String cfopc;

    private String txlw1;

    private String txlw2;

    private String ccc01;

    private String ccc02;

    private String ccc03;

    private String ccc04;

    private String cassd;

    private String knurl;

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

    private String dear6;

    @Column(name = "cvp_xblck")
    private String cvpXblck;

    private String suframa;

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

    @Column(name = "kna1_eew_cust")
    private String kna1EewCust;

    @Column(name = "/vso/r_palhgt")
    private BigDecimal vsoRPalhgt;

    @Column(name = "/vso/r_pal_ul")
    private String vsoRPalUl;

    @Column(name = "/vso/r_pk_mat")
    private String vsoRPkMat;

    @Column(name = "/vso/r_matpal")
    private String vsoRMatpal;

    @Column(name = "/vso/r_i_no_lyr")
    private String vsoRINoLyr;

    @Column(name = "/vso/r_one_mat")
    private String vsoROneMat;

    @Column(name = "/vso/r_one_sort")
    private String vsoROneSort;

    @Column(name = "/vso/r_uld_side")
    private String vsoRUldSide;

    @Column(name = "/vso/r_load_pref")
    private String vsoRLoadPref;

    @Column(name = "/vso/r_dpoint")
    private String vsoRDpoint;

    private String alc;

    @Column(name = "pmt_office")
    private String pmtOffice;

    @Column(name = "fee_schedule")
    private String feeSchedule;

    private String duns;

    private String duns4;

    private String psofg;

    private String psois;

    private String pson1;

    private String pson2;

    private String pson3;

    private String psovn;

    private String psotl;

    private String psohs;

    private String psost;

    private String psoo1;

    private String psoo2;

    private String psoo3;

    private String psoo4;

    private String psoo5;

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

    @Column(name = "j_1iexcicu")
    private String j1iexcicu;

    private String aedat;

    private String usnam;

    @Column(name = "j_1isern")
    private String j1isern;

    @Column(name = "j_1ipanref")
    private String j1ipanref;

    @Column(name = "j_3getyp")
    private String j3getyp;

    @Column(name = "j_3greftyp")
    private String j3greftyp;

    private String pspnr;

    private String coaufnr;

    @Column(name = "j_3gagext")
    private String j3gagext;

    @Column(name = "j_3gagint")
    private String j3gagint;

    @Column(name = "j_3gagdumi")
    private String j3gagdumi;

    @Column(name = "j_3gagstdi")
    private String j3gagstdi;

    private String lgort;

    private String kokrs;

    private String kostl;

    @Column(name = "j_3gabglg")
    private String j3gabglg;

    @Column(name = "j_3gabgvg")
    private String j3gabgvg;

    @Column(name = "j_3gabrart")
    private String j3gabrart;

    @Column(name = "j_3gstdmon")
    private BigDecimal j3gstdmon;

    @Column(name = "j_3gstdtag")
    private BigDecimal j3gstdtag;

    @Column(name = "j_3gtagmon")
    private BigDecimal j3gtagmon;

    @Column(name = "j_3gzugtag")
    private String j3gzugtag;

    @Column(name = "j_3gmaschb")
    private String j3gmaschb;

    @Column(name = "j_3gmeinsa")
    private String j3gmeinsa;

    @Column(name = "j_3gkeinsa")
    private String j3gkeinsa;

    @Column(name = "j_3gblsper")
    private String j3gblsper;

    @Column(name = "j_3gkleivo")
    private String j3gkleivo;

    @Column(name = "j_3gcalid")
    private String j3gcalid;

    @Column(name = "j_3gvmonat")
    private String j3gvmonat;

    @Column(name = "j_3gabrken")
    private String j3gabrken;

    @Column(name = "j_3glabrech")
    private String j3glabrech;

    @Column(name = "j_3gaabrech")
    private String j3gaabrech;

    @Column(name = "j_3gzutvhlg")
    private String j3gzutvhlg;

    @Column(name = "j_3gnegmen")
    private String j3gnegmen;

    @Column(name = "j_3gfristlo")
    private String j3gfristlo;

    @Column(name = "j_3geminbe")
    private String j3geminbe;

    @Column(name = "j_3gfmgue")
    private String j3gfmgue;

    @Column(name = "j_3gzuschue")
    private String j3gzuschue;

    @Column(name = "j_3gschprs")
    private String j3gschprs;

    @Column(name = "j_3ginvsta")
    private String j3ginvsta;

    @Column(name = "/sapcem/dber")
    private String sapcemDber;

    @Column(name = "/sapcem/kvmeq")
    private String sapcemKvmeq;

    @Column(name = "bonded_area_confirm")
    private String bondedAreaConfirm;

    @Column(name = "donate_mark")
    private String donateMark;

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
     * @return aufsd
     */
    public String getAufsd() {
        return aufsd;
    }

    /**
     * @param aufsd
     */
    public void setAufsd(String aufsd) {
        this.aufsd = aufsd;
    }

    /**
     * @return bahne
     */
    public String getBahne() {
        return bahne;
    }

    /**
     * @param bahne
     */
    public void setBahne(String bahne) {
        this.bahne = bahne;
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
     * @return exabl
     */
    public String getExabl() {
        return exabl;
    }

    /**
     * @param exabl
     */
    public void setExabl(String exabl) {
        this.exabl = exabl;
    }

    /**
     * @return faksd
     */
    public String getFaksd() {
        return faksd;
    }

    /**
     * @param faksd
     */
    public void setFaksd(String faksd) {
        this.faksd = faksd;
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
     * @return knazk
     */
    public String getKnazk() {
        return knazk;
    }

    /**
     * @param knazk
     */
    public void setKnazk(String knazk) {
        this.knazk = knazk;
    }

    /**
     * @return knrza
     */
    public String getKnrza() {
        return knrza;
    }

    /**
     * @param knrza
     */
    public void setKnrza(String knrza) {
        this.knrza = knrza;
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
     * @return ktokd
     */
    public String getKtokd() {
        return ktokd;
    }

    /**
     * @param ktokd
     */
    public void setKtokd(String ktokd) {
        this.ktokd = ktokd;
    }

    /**
     * @return kukla
     */
    public String getKukla() {
        return kukla;
    }

    /**
     * @param kukla
     */
    public void setKukla(String kukla) {
        this.kukla = kukla;
    }

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
     * @return lifsd
     */
    public String getLifsd() {
        return lifsd;
    }

    /**
     * @param lifsd
     */
    public void setLifsd(String lifsd) {
        this.lifsd = lifsd;
    }

    /**
     * @return locco
     */
    public String getLocco() {
        return locco;
    }

    /**
     * @param locco
     */
    public void setLocco(String locco) {
        this.locco = locco;
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
     * @return niels
     */
    public String getNiels() {
        return niels;
    }

    /**
     * @param niels
     */
    public void setNiels(String niels) {
        this.niels = niels;
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
     * @return counc
     */
    public String getCounc() {
        return counc;
    }

    /**
     * @param counc
     */
    public void setCounc(String counc) {
        this.counc = counc;
    }

    /**
     * @return cityc
     */
    public String getCityc() {
        return cityc;
    }

    /**
     * @param cityc
     */
    public void setCityc(String cityc) {
        this.cityc = cityc;
    }

    /**
     * @return rpmkr
     */
    public String getRpmkr() {
        return rpmkr;
    }

    /**
     * @param rpmkr
     */
    public void setRpmkr(String rpmkr) {
        this.rpmkr = rpmkr;
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
     * @return dear1
     */
    public String getDear1() {
        return dear1;
    }

    /**
     * @param dear1
     */
    public void setDear1(String dear1) {
        this.dear1 = dear1;
    }

    /**
     * @return dear2
     */
    public String getDear2() {
        return dear2;
    }

    /**
     * @param dear2
     */
    public void setDear2(String dear2) {
        this.dear2 = dear2;
    }

    /**
     * @return dear3
     */
    public String getDear3() {
        return dear3;
    }

    /**
     * @param dear3
     */
    public void setDear3(String dear3) {
        this.dear3 = dear3;
    }

    /**
     * @return dear4
     */
    public String getDear4() {
        return dear4;
    }

    /**
     * @param dear4
     */
    public void setDear4(String dear4) {
        this.dear4 = dear4;
    }

    /**
     * @return dear5
     */
    public String getDear5() {
        return dear5;
    }

    /**
     * @param dear5
     */
    public void setDear5(String dear5) {
        this.dear5 = dear5;
    }

    /**
     * @return gform
     */
    public String getGform() {
        return gform;
    }

    /**
     * @param gform
     */
    public void setGform(String gform) {
        this.gform = gform;
    }

    /**
     * @return bran1
     */
    public String getBran1() {
        return bran1;
    }

    /**
     * @param bran1
     */
    public void setBran1(String bran1) {
        this.bran1 = bran1;
    }

    /**
     * @return bran2
     */
    public String getBran2() {
        return bran2;
    }

    /**
     * @param bran2
     */
    public void setBran2(String bran2) {
        this.bran2 = bran2;
    }

    /**
     * @return bran3
     */
    public String getBran3() {
        return bran3;
    }

    /**
     * @param bran3
     */
    public void setBran3(String bran3) {
        this.bran3 = bran3;
    }

    /**
     * @return bran4
     */
    public String getBran4() {
        return bran4;
    }

    /**
     * @param bran4
     */
    public void setBran4(String bran4) {
        this.bran4 = bran4;
    }

    /**
     * @return bran5
     */
    public String getBran5() {
        return bran5;
    }

    /**
     * @param bran5
     */
    public void setBran5(String bran5) {
        this.bran5 = bran5;
    }

    /**
     * @return ekont
     */
    public String getEkont() {
        return ekont;
    }

    /**
     * @param ekont
     */
    public void setEkont(String ekont) {
        this.ekont = ekont;
    }

    /**
     * @return umsat
     */
    public BigDecimal getUmsat() {
        return umsat;
    }

    /**
     * @param umsat
     */
    public void setUmsat(BigDecimal umsat) {
        this.umsat = umsat;
    }

    /**
     * @return umjah
     */
    public String getUmjah() {
        return umjah;
    }

    /**
     * @param umjah
     */
    public void setUmjah(String umjah) {
        this.umjah = umjah;
    }

    /**
     * @return uwaer
     */
    public String getUwaer() {
        return uwaer;
    }

    /**
     * @param uwaer
     */
    public void setUwaer(String uwaer) {
        this.uwaer = uwaer;
    }

    /**
     * @return jmzah
     */
    public String getJmzah() {
        return jmzah;
    }

    /**
     * @param jmzah
     */
    public void setJmzah(String jmzah) {
        this.jmzah = jmzah;
    }

    /**
     * @return jmjah
     */
    public String getJmjah() {
        return jmjah;
    }

    /**
     * @param jmjah
     */
    public void setJmjah(String jmjah) {
        this.jmjah = jmjah;
    }

    /**
     * @return katr1
     */
    public String getKatr1() {
        return katr1;
    }

    /**
     * @param katr1
     */
    public void setKatr1(String katr1) {
        this.katr1 = katr1;
    }

    /**
     * @return katr2
     */
    public String getKatr2() {
        return katr2;
    }

    /**
     * @param katr2
     */
    public void setKatr2(String katr2) {
        this.katr2 = katr2;
    }

    /**
     * @return katr3
     */
    public String getKatr3() {
        return katr3;
    }

    /**
     * @param katr3
     */
    public void setKatr3(String katr3) {
        this.katr3 = katr3;
    }

    /**
     * @return katr4
     */
    public String getKatr4() {
        return katr4;
    }

    /**
     * @param katr4
     */
    public void setKatr4(String katr4) {
        this.katr4 = katr4;
    }

    /**
     * @return katr5
     */
    public String getKatr5() {
        return katr5;
    }

    /**
     * @param katr5
     */
    public void setKatr5(String katr5) {
        this.katr5 = katr5;
    }

    /**
     * @return katr6
     */
    public String getKatr6() {
        return katr6;
    }

    /**
     * @param katr6
     */
    public void setKatr6(String katr6) {
        this.katr6 = katr6;
    }

    /**
     * @return katr7
     */
    public String getKatr7() {
        return katr7;
    }

    /**
     * @param katr7
     */
    public void setKatr7(String katr7) {
        this.katr7 = katr7;
    }

    /**
     * @return katr8
     */
    public String getKatr8() {
        return katr8;
    }

    /**
     * @param katr8
     */
    public void setKatr8(String katr8) {
        this.katr8 = katr8;
    }

    /**
     * @return katr9
     */
    public String getKatr9() {
        return katr9;
    }

    /**
     * @param katr9
     */
    public void setKatr9(String katr9) {
        this.katr9 = katr9;
    }

    /**
     * @return katr10
     */
    public String getKatr10() {
        return katr10;
    }

    /**
     * @param katr10
     */
    public void setKatr10(String katr10) {
        this.katr10 = katr10;
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
     * @return umsa1
     */
    public BigDecimal getUmsa1() {
        return umsa1;
    }

    /**
     * @param umsa1
     */
    public void setUmsa1(BigDecimal umsa1) {
        this.umsa1 = umsa1;
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
     * @return abrvw
     */
    public String getAbrvw() {
        return abrvw;
    }

    /**
     * @param abrvw
     */
    public void setAbrvw(String abrvw) {
        this.abrvw = abrvw;
    }

    /**
     * @return inspbydebi
     */
    public String getInspbydebi() {
        return inspbydebi;
    }

    /**
     * @param inspbydebi
     */
    public void setInspbydebi(String inspbydebi) {
        this.inspbydebi = inspbydebi;
    }

    /**
     * @return inspatdebi
     */
    public String getInspatdebi() {
        return inspatdebi;
    }

    /**
     * @param inspatdebi
     */
    public void setInspatdebi(String inspatdebi) {
        this.inspatdebi = inspatdebi;
    }

    /**
     * @return ktocd
     */
    public String getKtocd() {
        return ktocd;
    }

    /**
     * @param ktocd
     */
    public void setKtocd(String ktocd) {
        this.ktocd = ktocd;
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
     * @return hzuor
     */
    public String getHzuor() {
        return hzuor;
    }

    /**
     * @param hzuor
     */
    public void setHzuor(String hzuor) {
        this.hzuor = hzuor;
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
     * @return etikg
     */
    public String getEtikg() {
        return etikg;
    }

    /**
     * @param etikg
     */
    public void setEtikg(String etikg) {
        this.etikg = etikg;
    }

    /**
     * @return civve
     */
    public String getCivve() {
        return civve;
    }

    /**
     * @param civve
     */
    public void setCivve(String civve) {
        this.civve = civve;
    }

    /**
     * @return milve
     */
    public String getMilve() {
        return milve;
    }

    /**
     * @param milve
     */
    public void setMilve(String milve) {
        this.milve = milve;
    }

    /**
     * @return kdkg1
     */
    public String getKdkg1() {
        return kdkg1;
    }

    /**
     * @param kdkg1
     */
    public void setKdkg1(String kdkg1) {
        this.kdkg1 = kdkg1;
    }

    /**
     * @return kdkg2
     */
    public String getKdkg2() {
        return kdkg2;
    }

    /**
     * @param kdkg2
     */
    public void setKdkg2(String kdkg2) {
        this.kdkg2 = kdkg2;
    }

    /**
     * @return kdkg3
     */
    public String getKdkg3() {
        return kdkg3;
    }

    /**
     * @param kdkg3
     */
    public void setKdkg3(String kdkg3) {
        this.kdkg3 = kdkg3;
    }

    /**
     * @return kdkg4
     */
    public String getKdkg4() {
        return kdkg4;
    }

    /**
     * @param kdkg4
     */
    public void setKdkg4(String kdkg4) {
        this.kdkg4 = kdkg4;
    }

    /**
     * @return kdkg5
     */
    public String getKdkg5() {
        return kdkg5;
    }

    /**
     * @param kdkg5
     */
    public void setKdkg5(String kdkg5) {
        this.kdkg5 = kdkg5;
    }

    /**
     * @return xknza
     */
    public String getXknza() {
        return xknza;
    }

    /**
     * @param xknza
     */
    public void setXknza(String xknza) {
        this.xknza = xknza;
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
     * @return xicms
     */
    public String getXicms() {
        return xicms;
    }

    /**
     * @param xicms
     */
    public void setXicms(String xicms) {
        this.xicms = xicms;
    }

    /**
     * @return xxipi
     */
    public String getXxipi() {
        return xxipi;
    }

    /**
     * @param xxipi
     */
    public void setXxipi(String xxipi) {
        this.xxipi = xxipi;
    }

    /**
     * @return xsubt
     */
    public String getXsubt() {
        return xsubt;
    }

    /**
     * @param xsubt
     */
    public void setXsubt(String xsubt) {
        this.xsubt = xsubt;
    }

    /**
     * @return cfopc
     */
    public String getCfopc() {
        return cfopc;
    }

    /**
     * @param cfopc
     */
    public void setCfopc(String cfopc) {
        this.cfopc = cfopc;
    }

    /**
     * @return txlw1
     */
    public String getTxlw1() {
        return txlw1;
    }

    /**
     * @param txlw1
     */
    public void setTxlw1(String txlw1) {
        this.txlw1 = txlw1;
    }

    /**
     * @return txlw2
     */
    public String getTxlw2() {
        return txlw2;
    }

    /**
     * @param txlw2
     */
    public void setTxlw2(String txlw2) {
        this.txlw2 = txlw2;
    }

    /**
     * @return ccc01
     */
    public String getCcc01() {
        return ccc01;
    }

    /**
     * @param ccc01
     */
    public void setCcc01(String ccc01) {
        this.ccc01 = ccc01;
    }

    /**
     * @return ccc02
     */
    public String getCcc02() {
        return ccc02;
    }

    /**
     * @param ccc02
     */
    public void setCcc02(String ccc02) {
        this.ccc02 = ccc02;
    }

    /**
     * @return ccc03
     */
    public String getCcc03() {
        return ccc03;
    }

    /**
     * @param ccc03
     */
    public void setCcc03(String ccc03) {
        this.ccc03 = ccc03;
    }

    /**
     * @return ccc04
     */
    public String getCcc04() {
        return ccc04;
    }

    /**
     * @param ccc04
     */
    public void setCcc04(String ccc04) {
        this.ccc04 = ccc04;
    }

    /**
     * @return cassd
     */
    public String getCassd() {
        return cassd;
    }

    /**
     * @param cassd
     */
    public void setCassd(String cassd) {
        this.cassd = cassd;
    }

    /**
     * @return knurl
     */
    public String getKnurl() {
        return knurl;
    }

    /**
     * @param knurl
     */
    public void setKnurl(String knurl) {
        this.knurl = knurl;
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
     * @return dear6
     */
    public String getDear6() {
        return dear6;
    }

    /**
     * @param dear6
     */
    public void setDear6(String dear6) {
        this.dear6 = dear6;
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
     * @return suframa
     */
    public String getSuframa() {
        return suframa;
    }

    /**
     * @param suframa
     */
    public void setSuframa(String suframa) {
        this.suframa = suframa;
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
     * @return kna1_eew_cust
     */
    public String getKna1EewCust() {
        return kna1EewCust;
    }

    /**
     * @param kna1EewCust
     */
    public void setKna1EewCust(String kna1EewCust) {
        this.kna1EewCust = kna1EewCust;
    }

    /**
     * @return /vso/r_palhgt
     */
    public BigDecimal getVsoRPalhgt() {
        return vsoRPalhgt;
    }

    /**
     * @param vsoRPalhgt
     */
    public void setVsoRPalhgt(BigDecimal vsoRPalhgt) {
        this.vsoRPalhgt = vsoRPalhgt;
    }

    /**
     * @return /vso/r_pal_ul
     */
    public String getVsoRPalUl() {
        return vsoRPalUl;
    }

    /**
     * @param vsoRPalUl
     */
    public void setVsoRPalUl(String vsoRPalUl) {
        this.vsoRPalUl = vsoRPalUl;
    }

    /**
     * @return /vso/r_pk_mat
     */
    public String getVsoRPkMat() {
        return vsoRPkMat;
    }

    /**
     * @param vsoRPkMat
     */
    public void setVsoRPkMat(String vsoRPkMat) {
        this.vsoRPkMat = vsoRPkMat;
    }

    /**
     * @return /vso/r_matpal
     */
    public String getVsoRMatpal() {
        return vsoRMatpal;
    }

    /**
     * @param vsoRMatpal
     */
    public void setVsoRMatpal(String vsoRMatpal) {
        this.vsoRMatpal = vsoRMatpal;
    }

    /**
     * @return /vso/r_i_no_lyr
     */
    public String getVsoRINoLyr() {
        return vsoRINoLyr;
    }

    /**
     * @param vsoRINoLyr
     */
    public void setVsoRINoLyr(String vsoRINoLyr) {
        this.vsoRINoLyr = vsoRINoLyr;
    }

    /**
     * @return /vso/r_one_mat
     */
    public String getVsoROneMat() {
        return vsoROneMat;
    }

    /**
     * @param vsoROneMat
     */
    public void setVsoROneMat(String vsoROneMat) {
        this.vsoROneMat = vsoROneMat;
    }

    /**
     * @return /vso/r_one_sort
     */
    public String getVsoROneSort() {
        return vsoROneSort;
    }

    /**
     * @param vsoROneSort
     */
    public void setVsoROneSort(String vsoROneSort) {
        this.vsoROneSort = vsoROneSort;
    }

    /**
     * @return /vso/r_uld_side
     */
    public String getVsoRUldSide() {
        return vsoRUldSide;
    }

    /**
     * @param vsoRUldSide
     */
    public void setVsoRUldSide(String vsoRUldSide) {
        this.vsoRUldSide = vsoRUldSide;
    }

    /**
     * @return /vso/r_load_pref
     */
    public String getVsoRLoadPref() {
        return vsoRLoadPref;
    }

    /**
     * @param vsoRLoadPref
     */
    public void setVsoRLoadPref(String vsoRLoadPref) {
        this.vsoRLoadPref = vsoRLoadPref;
    }

    /**
     * @return /vso/r_dpoint
     */
    public String getVsoRDpoint() {
        return vsoRDpoint;
    }

    /**
     * @param vsoRDpoint
     */
    public void setVsoRDpoint(String vsoRDpoint) {
        this.vsoRDpoint = vsoRDpoint;
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
     * @return fee_schedule
     */
    public String getFeeSchedule() {
        return feeSchedule;
    }

    /**
     * @param feeSchedule
     */
    public void setFeeSchedule(String feeSchedule) {
        this.feeSchedule = feeSchedule;
    }

    /**
     * @return duns
     */
    public String getDuns() {
        return duns;
    }

    /**
     * @param duns
     */
    public void setDuns(String duns) {
        this.duns = duns;
    }

    /**
     * @return duns4
     */
    public String getDuns4() {
        return duns4;
    }

    /**
     * @param duns4
     */
    public void setDuns4(String duns4) {
        this.duns4 = duns4;
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
     * @return psoo1
     */
    public String getPsoo1() {
        return psoo1;
    }

    /**
     * @param psoo1
     */
    public void setPsoo1(String psoo1) {
        this.psoo1 = psoo1;
    }

    /**
     * @return psoo2
     */
    public String getPsoo2() {
        return psoo2;
    }

    /**
     * @param psoo2
     */
    public void setPsoo2(String psoo2) {
        this.psoo2 = psoo2;
    }

    /**
     * @return psoo3
     */
    public String getPsoo3() {
        return psoo3;
    }

    /**
     * @param psoo3
     */
    public void setPsoo3(String psoo3) {
        this.psoo3 = psoo3;
    }

    /**
     * @return psoo4
     */
    public String getPsoo4() {
        return psoo4;
    }

    /**
     * @param psoo4
     */
    public void setPsoo4(String psoo4) {
        this.psoo4 = psoo4;
    }

    /**
     * @return psoo5
     */
    public String getPsoo5() {
        return psoo5;
    }

    /**
     * @param psoo5
     */
    public void setPsoo5(String psoo5) {
        this.psoo5 = psoo5;
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
     * @return j_1iexcicu
     */
    public String getJ1iexcicu() {
        return j1iexcicu;
    }

    /**
     * @param j1iexcicu
     */
    public void setJ1iexcicu(String j1iexcicu) {
        this.j1iexcicu = j1iexcicu;
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
     * @return j_3getyp
     */
    public String getJ3getyp() {
        return j3getyp;
    }

    /**
     * @param j3getyp
     */
    public void setJ3getyp(String j3getyp) {
        this.j3getyp = j3getyp;
    }

    /**
     * @return j_3greftyp
     */
    public String getJ3greftyp() {
        return j3greftyp;
    }

    /**
     * @param j3greftyp
     */
    public void setJ3greftyp(String j3greftyp) {
        this.j3greftyp = j3greftyp;
    }

    /**
     * @return pspnr
     */
    public String getPspnr() {
        return pspnr;
    }

    /**
     * @param pspnr
     */
    public void setPspnr(String pspnr) {
        this.pspnr = pspnr;
    }

    /**
     * @return coaufnr
     */
    public String getCoaufnr() {
        return coaufnr;
    }

    /**
     * @param coaufnr
     */
    public void setCoaufnr(String coaufnr) {
        this.coaufnr = coaufnr;
    }

    /**
     * @return j_3gagext
     */
    public String getJ3gagext() {
        return j3gagext;
    }

    /**
     * @param j3gagext
     */
    public void setJ3gagext(String j3gagext) {
        this.j3gagext = j3gagext;
    }

    /**
     * @return j_3gagint
     */
    public String getJ3gagint() {
        return j3gagint;
    }

    /**
     * @param j3gagint
     */
    public void setJ3gagint(String j3gagint) {
        this.j3gagint = j3gagint;
    }

    /**
     * @return j_3gagdumi
     */
    public String getJ3gagdumi() {
        return j3gagdumi;
    }

    /**
     * @param j3gagdumi
     */
    public void setJ3gagdumi(String j3gagdumi) {
        this.j3gagdumi = j3gagdumi;
    }

    /**
     * @return j_3gagstdi
     */
    public String getJ3gagstdi() {
        return j3gagstdi;
    }

    /**
     * @param j3gagstdi
     */
    public void setJ3gagstdi(String j3gagstdi) {
        this.j3gagstdi = j3gagstdi;
    }

    /**
     * @return lgort
     */
    public String getLgort() {
        return lgort;
    }

    /**
     * @param lgort
     */
    public void setLgort(String lgort) {
        this.lgort = lgort;
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
     * @return j_3gabglg
     */
    public String getJ3gabglg() {
        return j3gabglg;
    }

    /**
     * @param j3gabglg
     */
    public void setJ3gabglg(String j3gabglg) {
        this.j3gabglg = j3gabglg;
    }

    /**
     * @return j_3gabgvg
     */
    public String getJ3gabgvg() {
        return j3gabgvg;
    }

    /**
     * @param j3gabgvg
     */
    public void setJ3gabgvg(String j3gabgvg) {
        this.j3gabgvg = j3gabgvg;
    }

    /**
     * @return j_3gabrart
     */
    public String getJ3gabrart() {
        return j3gabrart;
    }

    /**
     * @param j3gabrart
     */
    public void setJ3gabrart(String j3gabrart) {
        this.j3gabrart = j3gabrart;
    }

    /**
     * @return j_3gstdmon
     */
    public BigDecimal getJ3gstdmon() {
        return j3gstdmon;
    }

    /**
     * @param j3gstdmon
     */
    public void setJ3gstdmon(BigDecimal j3gstdmon) {
        this.j3gstdmon = j3gstdmon;
    }

    /**
     * @return j_3gstdtag
     */
    public BigDecimal getJ3gstdtag() {
        return j3gstdtag;
    }

    /**
     * @param j3gstdtag
     */
    public void setJ3gstdtag(BigDecimal j3gstdtag) {
        this.j3gstdtag = j3gstdtag;
    }

    /**
     * @return j_3gtagmon
     */
    public BigDecimal getJ3gtagmon() {
        return j3gtagmon;
    }

    /**
     * @param j3gtagmon
     */
    public void setJ3gtagmon(BigDecimal j3gtagmon) {
        this.j3gtagmon = j3gtagmon;
    }

    /**
     * @return j_3gzugtag
     */
    public String getJ3gzugtag() {
        return j3gzugtag;
    }

    /**
     * @param j3gzugtag
     */
    public void setJ3gzugtag(String j3gzugtag) {
        this.j3gzugtag = j3gzugtag;
    }

    /**
     * @return j_3gmaschb
     */
    public String getJ3gmaschb() {
        return j3gmaschb;
    }

    /**
     * @param j3gmaschb
     */
    public void setJ3gmaschb(String j3gmaschb) {
        this.j3gmaschb = j3gmaschb;
    }

    /**
     * @return j_3gmeinsa
     */
    public String getJ3gmeinsa() {
        return j3gmeinsa;
    }

    /**
     * @param j3gmeinsa
     */
    public void setJ3gmeinsa(String j3gmeinsa) {
        this.j3gmeinsa = j3gmeinsa;
    }

    /**
     * @return j_3gkeinsa
     */
    public String getJ3gkeinsa() {
        return j3gkeinsa;
    }

    /**
     * @param j3gkeinsa
     */
    public void setJ3gkeinsa(String j3gkeinsa) {
        this.j3gkeinsa = j3gkeinsa;
    }

    /**
     * @return j_3gblsper
     */
    public String getJ3gblsper() {
        return j3gblsper;
    }

    /**
     * @param j3gblsper
     */
    public void setJ3gblsper(String j3gblsper) {
        this.j3gblsper = j3gblsper;
    }

    /**
     * @return j_3gkleivo
     */
    public String getJ3gkleivo() {
        return j3gkleivo;
    }

    /**
     * @param j3gkleivo
     */
    public void setJ3gkleivo(String j3gkleivo) {
        this.j3gkleivo = j3gkleivo;
    }

    /**
     * @return j_3gcalid
     */
    public String getJ3gcalid() {
        return j3gcalid;
    }

    /**
     * @param j3gcalid
     */
    public void setJ3gcalid(String j3gcalid) {
        this.j3gcalid = j3gcalid;
    }

    /**
     * @return j_3gvmonat
     */
    public String getJ3gvmonat() {
        return j3gvmonat;
    }

    /**
     * @param j3gvmonat
     */
    public void setJ3gvmonat(String j3gvmonat) {
        this.j3gvmonat = j3gvmonat;
    }

    /**
     * @return j_3gabrken
     */
    public String getJ3gabrken() {
        return j3gabrken;
    }

    /**
     * @param j3gabrken
     */
    public void setJ3gabrken(String j3gabrken) {
        this.j3gabrken = j3gabrken;
    }

    /**
     * @return j_3glabrech
     */
    public String getJ3glabrech() {
        return j3glabrech;
    }

    /**
     * @param j3glabrech
     */
    public void setJ3glabrech(String j3glabrech) {
        this.j3glabrech = j3glabrech;
    }

    /**
     * @return j_3gaabrech
     */
    public String getJ3gaabrech() {
        return j3gaabrech;
    }

    /**
     * @param j3gaabrech
     */
    public void setJ3gaabrech(String j3gaabrech) {
        this.j3gaabrech = j3gaabrech;
    }

    /**
     * @return j_3gzutvhlg
     */
    public String getJ3gzutvhlg() {
        return j3gzutvhlg;
    }

    /**
     * @param j3gzutvhlg
     */
    public void setJ3gzutvhlg(String j3gzutvhlg) {
        this.j3gzutvhlg = j3gzutvhlg;
    }

    /**
     * @return j_3gnegmen
     */
    public String getJ3gnegmen() {
        return j3gnegmen;
    }

    /**
     * @param j3gnegmen
     */
    public void setJ3gnegmen(String j3gnegmen) {
        this.j3gnegmen = j3gnegmen;
    }

    /**
     * @return j_3gfristlo
     */
    public String getJ3gfristlo() {
        return j3gfristlo;
    }

    /**
     * @param j3gfristlo
     */
    public void setJ3gfristlo(String j3gfristlo) {
        this.j3gfristlo = j3gfristlo;
    }

    /**
     * @return j_3geminbe
     */
    public String getJ3geminbe() {
        return j3geminbe;
    }

    /**
     * @param j3geminbe
     */
    public void setJ3geminbe(String j3geminbe) {
        this.j3geminbe = j3geminbe;
    }

    /**
     * @return j_3gfmgue
     */
    public String getJ3gfmgue() {
        return j3gfmgue;
    }

    /**
     * @param j3gfmgue
     */
    public void setJ3gfmgue(String j3gfmgue) {
        this.j3gfmgue = j3gfmgue;
    }

    /**
     * @return j_3gzuschue
     */
    public String getJ3gzuschue() {
        return j3gzuschue;
    }

    /**
     * @param j3gzuschue
     */
    public void setJ3gzuschue(String j3gzuschue) {
        this.j3gzuschue = j3gzuschue;
    }

    /**
     * @return j_3gschprs
     */
    public String getJ3gschprs() {
        return j3gschprs;
    }

    /**
     * @param j3gschprs
     */
    public void setJ3gschprs(String j3gschprs) {
        this.j3gschprs = j3gschprs;
    }

    /**
     * @return j_3ginvsta
     */
    public String getJ3ginvsta() {
        return j3ginvsta;
    }

    /**
     * @param j3ginvsta
     */
    public void setJ3ginvsta(String j3ginvsta) {
        this.j3ginvsta = j3ginvsta;
    }

    /**
     * @return /sapcem/dber
     */
    public String getSapcemDber() {
        return sapcemDber;
    }

    /**
     * @param sapcemDber
     */
    public void setSapcemDber(String sapcemDber) {
        this.sapcemDber = sapcemDber;
    }

    /**
     * @return /sapcem/kvmeq
     */
    public String getSapcemKvmeq() {
        return sapcemKvmeq;
    }

    /**
     * @param sapcemKvmeq
     */
    public void setSapcemKvmeq(String sapcemKvmeq) {
        this.sapcemKvmeq = sapcemKvmeq;
    }

    /**
     * @return bonded_area_confirm
     */
    public String getBondedAreaConfirm() {
        return bondedAreaConfirm;
    }

    /**
     * @param bondedAreaConfirm
     */
    public void setBondedAreaConfirm(String bondedAreaConfirm) {
        this.bondedAreaConfirm = bondedAreaConfirm;
    }

    /**
     * @return donate_mark
     */
    public String getDonateMark() {
        return donateMark;
    }

    /**
     * @param donateMark
     */
    public void setDonateMark(String donateMark) {
        this.donateMark = donateMark;
    }
}