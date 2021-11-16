package cn.com.personnel.ercp.pi.persistence.entity.sap;

import java.math.BigDecimal;
import javax.persistence.*;

public class Prps {
    /**
     * 集团
     */
    @Id
    private String mandt;

    /**
     * WBS 要素
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private String pspnr;

    /**
     * WBS 元素
     */
    private String posid;

    /**
     * 描述
     */
    private String post1;

    /**
     * 对象号
     */
    private String objnr;

    /**
     * 当前项目号
     */
    private String psphi;

    /**
     * 短标识
     */
    private String poski;

    /**
     * 创建者
     */
    private String ernam;

    /**
     * 创建日期
     */
    private String erdat;

    /**
     * 更改者
     */
    private String aenam;

    /**
     * 更改日期
     */
    private String aedat;

    /**
     * 负责人编号
     */
    private String vernr;

    /**
     * 负责人的姓名
     */
    private String verna;

    /**
     * 申请人编号
     */
    private String astnr;

    /**
     * 申请人
     */
    private String astna;

    /**
     * 公司代码
     */
    private String pbukr;

    /**
     * 业务部门
     */
    private String pgsbr;

    /**
     * 成本控制范围
     */
    private String pkokr;

    /**
     * 利润中心
     */
    private String prctr;

    private String prart;

    private Integer stufe;

    private String plakz;

    private String belkz;

    private String fakkz;

    private String npfaz;

    private String zuord;

    private String trmeq;

    private String kvewe;

    private String kappl;

    private String kalsm;

    private String zschl;

    private String abgsl;

    private String akokr;

    private String akstl;

    private String fkokr;

    private String fkstl;

    private String fabkl;

    private String pspri;

    private String equnr;

    private String tplnr;

    private String pwpos;

    private String werks;

    private String txtsp;

    private String slwid;

    private String usr00;

    private String usr01;

    private String usr02;

    private String usr03;

    private BigDecimal usr04;

    private String use04;

    private BigDecimal usr05;

    private String use05;

    private BigDecimal usr06;

    private String use06;

    private BigDecimal usr07;

    private String use07;

    private String usr08;

    private String usr09;

    private String usr10;

    private String usr11;

    private String kostl;

    private String ktrg;

    private String berst;

    private String bertr;

    private String berko;

    private String berbu;

    private String clasf;

    private String spsnr;

    private String scope;

    private String xstat;

    private String txjcd;

    private String zschm;

    private String imprf;

    private Integer evgew;

    private String aennr;

    private String subpr;

    private String postu;

    private String plint;

    private String loevm;

    private String kzbws;

    private String fplnr;

    private String tadat;

    private String izwek;

    private String isize;

    private String iumkz;

    private String abukr;

    private String grpkz;

    private String pgprf;

    private String logsystem;

    @Column(name = "pspnr_logs")
    private String pspnrLogs;

    private String stort;

    @Column(name = "func_area")
    private String funcArea;

    private String klvar;

    private String kalnr;

    @Column(name = "posid_edit")
    private String posidEdit;

    private String pspkz;

    private String matnr;

    private String vlpsp;

    private String vlpkz;

    private String sort1;

    private String sort2;

    private String sort3;

    private String vname;

    private String recid;

    private String etype;

    private String otype;

    private String jibcl;

    private String jibsa;

    @Column(name = "cgpl_logsys")
    private String cgplLogsys;

    @Column(name = "cgpl_objtype")
    private String cgplObjtype;

    private String adpsp;

    private String rfippnt;

    @Column(name = "eew_prps_ps_dummy")
    private String eewPrpsPsDummy;

    @Column(name = "cpd_updat")
    private Long cpdUpdat;

    @Column(name = "ferc_ind")
    private String fercInd;

    @Column(name = "prps_status")
    private Integer prpsStatus;

    private String cp;

    @Column(name = "no_settle")
    private String noSettle;

    @Column(name = "detail_fams")
    private String detailFams;

    @Column(name = "cgpl_guid16")
    private byte[] cgplGuid16;

    /**
     * 获取集团
     *
     * @return mandt - 集团
     */
    public String getMandt() {
        return mandt;
    }

    /**
     * 设置集团
     *
     * @param mandt 集团
     */
    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    /**
     * 获取WBS 要素
     *
     * @return pspnr - WBS 要素
     */
    public String getPspnr() {
        return pspnr;
    }

    /**
     * 设置WBS 要素
     *
     * @param pspnr WBS 要素
     */
    public void setPspnr(String pspnr) {
        this.pspnr = pspnr;
    }

    /**
     * 获取WBS 元素
     *
     * @return posid - WBS 元素
     */
    public String getPosid() {
        return posid;
    }

    /**
     * 设置WBS 元素
     *
     * @param posid WBS 元素
     */
    public void setPosid(String posid) {
        this.posid = posid;
    }

    /**
     * 获取描述
     *
     * @return post1 - 描述
     */
    public String getPost1() {
        return post1;
    }

    /**
     * 设置描述
     *
     * @param post1 描述
     */
    public void setPost1(String post1) {
        this.post1 = post1;
    }

    /**
     * 获取对象号
     *
     * @return objnr - 对象号
     */
    public String getObjnr() {
        return objnr;
    }

    /**
     * 设置对象号
     *
     * @param objnr 对象号
     */
    public void setObjnr(String objnr) {
        this.objnr = objnr;
    }

    /**
     * 获取当前项目号
     *
     * @return psphi - 当前项目号
     */
    public String getPsphi() {
        return psphi;
    }

    /**
     * 设置当前项目号
     *
     * @param psphi 当前项目号
     */
    public void setPsphi(String psphi) {
        this.psphi = psphi;
    }

    /**
     * 获取短标识
     *
     * @return poski - 短标识
     */
    public String getPoski() {
        return poski;
    }

    /**
     * 设置短标识
     *
     * @param poski 短标识
     */
    public void setPoski(String poski) {
        this.poski = poski;
    }

    /**
     * 获取创建者
     *
     * @return ernam - 创建者
     */
    public String getErnam() {
        return ernam;
    }

    /**
     * 设置创建者
     *
     * @param ernam 创建者
     */
    public void setErnam(String ernam) {
        this.ernam = ernam;
    }

    /**
     * 获取创建日期
     *
     * @return erdat - 创建日期
     */
    public String getErdat() {
        return erdat;
    }

    /**
     * 设置创建日期
     *
     * @param erdat 创建日期
     */
    public void setErdat(String erdat) {
        this.erdat = erdat;
    }

    /**
     * 获取更改者
     *
     * @return aenam - 更改者
     */
    public String getAenam() {
        return aenam;
    }

    /**
     * 设置更改者
     *
     * @param aenam 更改者
     */
    public void setAenam(String aenam) {
        this.aenam = aenam;
    }

    /**
     * 获取更改日期
     *
     * @return aedat - 更改日期
     */
    public String getAedat() {
        return aedat;
    }

    /**
     * 设置更改日期
     *
     * @param aedat 更改日期
     */
    public void setAedat(String aedat) {
        this.aedat = aedat;
    }

    /**
     * 获取负责人编号
     *
     * @return vernr - 负责人编号
     */
    public String getVernr() {
        return vernr;
    }

    /**
     * 设置负责人编号
     *
     * @param vernr 负责人编号
     */
    public void setVernr(String vernr) {
        this.vernr = vernr;
    }

    /**
     * 获取负责人的姓名
     *
     * @return verna - 负责人的姓名
     */
    public String getVerna() {
        return verna;
    }

    /**
     * 设置负责人的姓名
     *
     * @param verna 负责人的姓名
     */
    public void setVerna(String verna) {
        this.verna = verna;
    }

    /**
     * 获取申请人编号
     *
     * @return astnr - 申请人编号
     */
    public String getAstnr() {
        return astnr;
    }

    /**
     * 设置申请人编号
     *
     * @param astnr 申请人编号
     */
    public void setAstnr(String astnr) {
        this.astnr = astnr;
    }

    /**
     * 获取申请人
     *
     * @return astna - 申请人
     */
    public String getAstna() {
        return astna;
    }

    /**
     * 设置申请人
     *
     * @param astna 申请人
     */
    public void setAstna(String astna) {
        this.astna = astna;
    }

    /**
     * 获取公司代码
     *
     * @return pbukr - 公司代码
     */
    public String getPbukr() {
        return pbukr;
    }

    /**
     * 设置公司代码
     *
     * @param pbukr 公司代码
     */
    public void setPbukr(String pbukr) {
        this.pbukr = pbukr;
    }

    /**
     * 获取业务部门
     *
     * @return pgsbr - 业务部门
     */
    public String getPgsbr() {
        return pgsbr;
    }

    /**
     * 设置业务部门
     *
     * @param pgsbr 业务部门
     */
    public void setPgsbr(String pgsbr) {
        this.pgsbr = pgsbr;
    }

    /**
     * 获取成本控制范围
     *
     * @return pkokr - 成本控制范围
     */
    public String getPkokr() {
        return pkokr;
    }

    /**
     * 设置成本控制范围
     *
     * @param pkokr 成本控制范围
     */
    public void setPkokr(String pkokr) {
        this.pkokr = pkokr;
    }

    /**
     * 获取利润中心
     *
     * @return prctr - 利润中心
     */
    public String getPrctr() {
        return prctr;
    }

    /**
     * 设置利润中心
     *
     * @param prctr 利润中心
     */
    public void setPrctr(String prctr) {
        this.prctr = prctr;
    }

    /**
     * @return prart
     */
    public String getPrart() {
        return prart;
    }

    /**
     * @param prart
     */
    public void setPrart(String prart) {
        this.prart = prart;
    }

    /**
     * @return stufe
     */
    public Integer getStufe() {
        return stufe;
    }

    /**
     * @param stufe
     */
    public void setStufe(Integer stufe) {
        this.stufe = stufe;
    }

    /**
     * @return plakz
     */
    public String getPlakz() {
        return plakz;
    }

    /**
     * @param plakz
     */
    public void setPlakz(String plakz) {
        this.plakz = plakz;
    }

    /**
     * @return belkz
     */
    public String getBelkz() {
        return belkz;
    }

    /**
     * @param belkz
     */
    public void setBelkz(String belkz) {
        this.belkz = belkz;
    }

    /**
     * @return fakkz
     */
    public String getFakkz() {
        return fakkz;
    }

    /**
     * @param fakkz
     */
    public void setFakkz(String fakkz) {
        this.fakkz = fakkz;
    }

    /**
     * @return npfaz
     */
    public String getNpfaz() {
        return npfaz;
    }

    /**
     * @param npfaz
     */
    public void setNpfaz(String npfaz) {
        this.npfaz = npfaz;
    }

    /**
     * @return zuord
     */
    public String getZuord() {
        return zuord;
    }

    /**
     * @param zuord
     */
    public void setZuord(String zuord) {
        this.zuord = zuord;
    }

    /**
     * @return trmeq
     */
    public String getTrmeq() {
        return trmeq;
    }

    /**
     * @param trmeq
     */
    public void setTrmeq(String trmeq) {
        this.trmeq = trmeq;
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
     * @return zschl
     */
    public String getZschl() {
        return zschl;
    }

    /**
     * @param zschl
     */
    public void setZschl(String zschl) {
        this.zschl = zschl;
    }

    /**
     * @return abgsl
     */
    public String getAbgsl() {
        return abgsl;
    }

    /**
     * @param abgsl
     */
    public void setAbgsl(String abgsl) {
        this.abgsl = abgsl;
    }

    /**
     * @return akokr
     */
    public String getAkokr() {
        return akokr;
    }

    /**
     * @param akokr
     */
    public void setAkokr(String akokr) {
        this.akokr = akokr;
    }

    /**
     * @return akstl
     */
    public String getAkstl() {
        return akstl;
    }

    /**
     * @param akstl
     */
    public void setAkstl(String akstl) {
        this.akstl = akstl;
    }

    /**
     * @return fkokr
     */
    public String getFkokr() {
        return fkokr;
    }

    /**
     * @param fkokr
     */
    public void setFkokr(String fkokr) {
        this.fkokr = fkokr;
    }

    /**
     * @return fkstl
     */
    public String getFkstl() {
        return fkstl;
    }

    /**
     * @param fkstl
     */
    public void setFkstl(String fkstl) {
        this.fkstl = fkstl;
    }

    /**
     * @return fabkl
     */
    public String getFabkl() {
        return fabkl;
    }

    /**
     * @param fabkl
     */
    public void setFabkl(String fabkl) {
        this.fabkl = fabkl;
    }

    /**
     * @return pspri
     */
    public String getPspri() {
        return pspri;
    }

    /**
     * @param pspri
     */
    public void setPspri(String pspri) {
        this.pspri = pspri;
    }

    /**
     * @return equnr
     */
    public String getEqunr() {
        return equnr;
    }

    /**
     * @param equnr
     */
    public void setEqunr(String equnr) {
        this.equnr = equnr;
    }

    /**
     * @return tplnr
     */
    public String getTplnr() {
        return tplnr;
    }

    /**
     * @param tplnr
     */
    public void setTplnr(String tplnr) {
        this.tplnr = tplnr;
    }

    /**
     * @return pwpos
     */
    public String getPwpos() {
        return pwpos;
    }

    /**
     * @param pwpos
     */
    public void setPwpos(String pwpos) {
        this.pwpos = pwpos;
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
     * @return txtsp
     */
    public String getTxtsp() {
        return txtsp;
    }

    /**
     * @param txtsp
     */
    public void setTxtsp(String txtsp) {
        this.txtsp = txtsp;
    }

    /**
     * @return slwid
     */
    public String getSlwid() {
        return slwid;
    }

    /**
     * @param slwid
     */
    public void setSlwid(String slwid) {
        this.slwid = slwid;
    }

    /**
     * @return usr00
     */
    public String getUsr00() {
        return usr00;
    }

    /**
     * @param usr00
     */
    public void setUsr00(String usr00) {
        this.usr00 = usr00;
    }

    /**
     * @return usr01
     */
    public String getUsr01() {
        return usr01;
    }

    /**
     * @param usr01
     */
    public void setUsr01(String usr01) {
        this.usr01 = usr01;
    }

    /**
     * @return usr02
     */
    public String getUsr02() {
        return usr02;
    }

    /**
     * @param usr02
     */
    public void setUsr02(String usr02) {
        this.usr02 = usr02;
    }

    /**
     * @return usr03
     */
    public String getUsr03() {
        return usr03;
    }

    /**
     * @param usr03
     */
    public void setUsr03(String usr03) {
        this.usr03 = usr03;
    }

    /**
     * @return usr04
     */
    public BigDecimal getUsr04() {
        return usr04;
    }

    /**
     * @param usr04
     */
    public void setUsr04(BigDecimal usr04) {
        this.usr04 = usr04;
    }

    /**
     * @return use04
     */
    public String getUse04() {
        return use04;
    }

    /**
     * @param use04
     */
    public void setUse04(String use04) {
        this.use04 = use04;
    }

    /**
     * @return usr05
     */
    public BigDecimal getUsr05() {
        return usr05;
    }

    /**
     * @param usr05
     */
    public void setUsr05(BigDecimal usr05) {
        this.usr05 = usr05;
    }

    /**
     * @return use05
     */
    public String getUse05() {
        return use05;
    }

    /**
     * @param use05
     */
    public void setUse05(String use05) {
        this.use05 = use05;
    }

    /**
     * @return usr06
     */
    public BigDecimal getUsr06() {
        return usr06;
    }

    /**
     * @param usr06
     */
    public void setUsr06(BigDecimal usr06) {
        this.usr06 = usr06;
    }

    /**
     * @return use06
     */
    public String getUse06() {
        return use06;
    }

    /**
     * @param use06
     */
    public void setUse06(String use06) {
        this.use06 = use06;
    }

    /**
     * @return usr07
     */
    public BigDecimal getUsr07() {
        return usr07;
    }

    /**
     * @param usr07
     */
    public void setUsr07(BigDecimal usr07) {
        this.usr07 = usr07;
    }

    /**
     * @return use07
     */
    public String getUse07() {
        return use07;
    }

    /**
     * @param use07
     */
    public void setUse07(String use07) {
        this.use07 = use07;
    }

    /**
     * @return usr08
     */
    public String getUsr08() {
        return usr08;
    }

    /**
     * @param usr08
     */
    public void setUsr08(String usr08) {
        this.usr08 = usr08;
    }

    /**
     * @return usr09
     */
    public String getUsr09() {
        return usr09;
    }

    /**
     * @param usr09
     */
    public void setUsr09(String usr09) {
        this.usr09 = usr09;
    }

    /**
     * @return usr10
     */
    public String getUsr10() {
        return usr10;
    }

    /**
     * @param usr10
     */
    public void setUsr10(String usr10) {
        this.usr10 = usr10;
    }

    /**
     * @return usr11
     */
    public String getUsr11() {
        return usr11;
    }

    /**
     * @param usr11
     */
    public void setUsr11(String usr11) {
        this.usr11 = usr11;
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
     * @return ktrg
     */
    public String getKtrg() {
        return ktrg;
    }

    /**
     * @param ktrg
     */
    public void setKtrg(String ktrg) {
        this.ktrg = ktrg;
    }

    /**
     * @return berst
     */
    public String getBerst() {
        return berst;
    }

    /**
     * @param berst
     */
    public void setBerst(String berst) {
        this.berst = berst;
    }

    /**
     * @return bertr
     */
    public String getBertr() {
        return bertr;
    }

    /**
     * @param bertr
     */
    public void setBertr(String bertr) {
        this.bertr = bertr;
    }

    /**
     * @return berko
     */
    public String getBerko() {
        return berko;
    }

    /**
     * @param berko
     */
    public void setBerko(String berko) {
        this.berko = berko;
    }

    /**
     * @return berbu
     */
    public String getBerbu() {
        return berbu;
    }

    /**
     * @param berbu
     */
    public void setBerbu(String berbu) {
        this.berbu = berbu;
    }

    /**
     * @return clasf
     */
    public String getClasf() {
        return clasf;
    }

    /**
     * @param clasf
     */
    public void setClasf(String clasf) {
        this.clasf = clasf;
    }

    /**
     * @return spsnr
     */
    public String getSpsnr() {
        return spsnr;
    }

    /**
     * @param spsnr
     */
    public void setSpsnr(String spsnr) {
        this.spsnr = spsnr;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * @param scope
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * @return xstat
     */
    public String getXstat() {
        return xstat;
    }

    /**
     * @param xstat
     */
    public void setXstat(String xstat) {
        this.xstat = xstat;
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
     * @return zschm
     */
    public String getZschm() {
        return zschm;
    }

    /**
     * @param zschm
     */
    public void setZschm(String zschm) {
        this.zschm = zschm;
    }

    /**
     * @return imprf
     */
    public String getImprf() {
        return imprf;
    }

    /**
     * @param imprf
     */
    public void setImprf(String imprf) {
        this.imprf = imprf;
    }

    /**
     * @return evgew
     */
    public Integer getEvgew() {
        return evgew;
    }

    /**
     * @param evgew
     */
    public void setEvgew(Integer evgew) {
        this.evgew = evgew;
    }

    /**
     * @return aennr
     */
    public String getAennr() {
        return aennr;
    }

    /**
     * @param aennr
     */
    public void setAennr(String aennr) {
        this.aennr = aennr;
    }

    /**
     * @return subpr
     */
    public String getSubpr() {
        return subpr;
    }

    /**
     * @param subpr
     */
    public void setSubpr(String subpr) {
        this.subpr = subpr;
    }

    /**
     * @return postu
     */
    public String getPostu() {
        return postu;
    }

    /**
     * @param postu
     */
    public void setPostu(String postu) {
        this.postu = postu;
    }

    /**
     * @return plint
     */
    public String getPlint() {
        return plint;
    }

    /**
     * @param plint
     */
    public void setPlint(String plint) {
        this.plint = plint;
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
     * @return kzbws
     */
    public String getKzbws() {
        return kzbws;
    }

    /**
     * @param kzbws
     */
    public void setKzbws(String kzbws) {
        this.kzbws = kzbws;
    }

    /**
     * @return fplnr
     */
    public String getFplnr() {
        return fplnr;
    }

    /**
     * @param fplnr
     */
    public void setFplnr(String fplnr) {
        this.fplnr = fplnr;
    }

    /**
     * @return tadat
     */
    public String getTadat() {
        return tadat;
    }

    /**
     * @param tadat
     */
    public void setTadat(String tadat) {
        this.tadat = tadat;
    }

    /**
     * @return izwek
     */
    public String getIzwek() {
        return izwek;
    }

    /**
     * @param izwek
     */
    public void setIzwek(String izwek) {
        this.izwek = izwek;
    }

    /**
     * @return isize
     */
    public String getIsize() {
        return isize;
    }

    /**
     * @param isize
     */
    public void setIsize(String isize) {
        this.isize = isize;
    }

    /**
     * @return iumkz
     */
    public String getIumkz() {
        return iumkz;
    }

    /**
     * @param iumkz
     */
    public void setIumkz(String iumkz) {
        this.iumkz = iumkz;
    }

    /**
     * @return abukr
     */
    public String getAbukr() {
        return abukr;
    }

    /**
     * @param abukr
     */
    public void setAbukr(String abukr) {
        this.abukr = abukr;
    }

    /**
     * @return grpkz
     */
    public String getGrpkz() {
        return grpkz;
    }

    /**
     * @param grpkz
     */
    public void setGrpkz(String grpkz) {
        this.grpkz = grpkz;
    }

    /**
     * @return pgprf
     */
    public String getPgprf() {
        return pgprf;
    }

    /**
     * @param pgprf
     */
    public void setPgprf(String pgprf) {
        this.pgprf = pgprf;
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
     * @return pspnr_logs
     */
    public String getPspnrLogs() {
        return pspnrLogs;
    }

    /**
     * @param pspnrLogs
     */
    public void setPspnrLogs(String pspnrLogs) {
        this.pspnrLogs = pspnrLogs;
    }

    /**
     * @return stort
     */
    public String getStort() {
        return stort;
    }

    /**
     * @param stort
     */
    public void setStort(String stort) {
        this.stort = stort;
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
     * @return klvar
     */
    public String getKlvar() {
        return klvar;
    }

    /**
     * @param klvar
     */
    public void setKlvar(String klvar) {
        this.klvar = klvar;
    }

    /**
     * @return kalnr
     */
    public String getKalnr() {
        return kalnr;
    }

    /**
     * @param kalnr
     */
    public void setKalnr(String kalnr) {
        this.kalnr = kalnr;
    }

    /**
     * @return posid_edit
     */
    public String getPosidEdit() {
        return posidEdit;
    }

    /**
     * @param posidEdit
     */
    public void setPosidEdit(String posidEdit) {
        this.posidEdit = posidEdit;
    }

    /**
     * @return pspkz
     */
    public String getPspkz() {
        return pspkz;
    }

    /**
     * @param pspkz
     */
    public void setPspkz(String pspkz) {
        this.pspkz = pspkz;
    }

    /**
     * @return matnr
     */
    public String getMatnr() {
        return matnr;
    }

    /**
     * @param matnr
     */
    public void setMatnr(String matnr) {
        this.matnr = matnr;
    }

    /**
     * @return vlpsp
     */
    public String getVlpsp() {
        return vlpsp;
    }

    /**
     * @param vlpsp
     */
    public void setVlpsp(String vlpsp) {
        this.vlpsp = vlpsp;
    }

    /**
     * @return vlpkz
     */
    public String getVlpkz() {
        return vlpkz;
    }

    /**
     * @param vlpkz
     */
    public void setVlpkz(String vlpkz) {
        this.vlpkz = vlpkz;
    }

    /**
     * @return sort1
     */
    public String getSort1() {
        return sort1;
    }

    /**
     * @param sort1
     */
    public void setSort1(String sort1) {
        this.sort1 = sort1;
    }

    /**
     * @return sort2
     */
    public String getSort2() {
        return sort2;
    }

    /**
     * @param sort2
     */
    public void setSort2(String sort2) {
        this.sort2 = sort2;
    }

    /**
     * @return sort3
     */
    public String getSort3() {
        return sort3;
    }

    /**
     * @param sort3
     */
    public void setSort3(String sort3) {
        this.sort3 = sort3;
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
     * @return otype
     */
    public String getOtype() {
        return otype;
    }

    /**
     * @param otype
     */
    public void setOtype(String otype) {
        this.otype = otype;
    }

    /**
     * @return jibcl
     */
    public String getJibcl() {
        return jibcl;
    }

    /**
     * @param jibcl
     */
    public void setJibcl(String jibcl) {
        this.jibcl = jibcl;
    }

    /**
     * @return jibsa
     */
    public String getJibsa() {
        return jibsa;
    }

    /**
     * @param jibsa
     */
    public void setJibsa(String jibsa) {
        this.jibsa = jibsa;
    }

    /**
     * @return cgpl_logsys
     */
    public String getCgplLogsys() {
        return cgplLogsys;
    }

    /**
     * @param cgplLogsys
     */
    public void setCgplLogsys(String cgplLogsys) {
        this.cgplLogsys = cgplLogsys;
    }

    /**
     * @return cgpl_objtype
     */
    public String getCgplObjtype() {
        return cgplObjtype;
    }

    /**
     * @param cgplObjtype
     */
    public void setCgplObjtype(String cgplObjtype) {
        this.cgplObjtype = cgplObjtype;
    }

    /**
     * @return adpsp
     */
    public String getAdpsp() {
        return adpsp;
    }

    /**
     * @param adpsp
     */
    public void setAdpsp(String adpsp) {
        this.adpsp = adpsp;
    }

    /**
     * @return rfippnt
     */
    public String getRfippnt() {
        return rfippnt;
    }

    /**
     * @param rfippnt
     */
    public void setRfippnt(String rfippnt) {
        this.rfippnt = rfippnt;
    }

    /**
     * @return eew_prps_ps_dummy
     */
    public String getEewPrpsPsDummy() {
        return eewPrpsPsDummy;
    }

    /**
     * @param eewPrpsPsDummy
     */
    public void setEewPrpsPsDummy(String eewPrpsPsDummy) {
        this.eewPrpsPsDummy = eewPrpsPsDummy;
    }

    /**
     * @return cpd_updat
     */
    public Long getCpdUpdat() {
        return cpdUpdat;
    }

    /**
     * @param cpdUpdat
     */
    public void setCpdUpdat(Long cpdUpdat) {
        this.cpdUpdat = cpdUpdat;
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
     * @return prps_status
     */
    public Integer getPrpsStatus() {
        return prpsStatus;
    }

    /**
     * @param prpsStatus
     */
    public void setPrpsStatus(Integer prpsStatus) {
        this.prpsStatus = prpsStatus;
    }

    /**
     * @return cp
     */
    public String getCp() {
        return cp;
    }

    /**
     * @param cp
     */
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * @return no_settle
     */
    public String getNoSettle() {
        return noSettle;
    }

    /**
     * @param noSettle
     */
    public void setNoSettle(String noSettle) {
        this.noSettle = noSettle;
    }

    /**
     * @return detail_fams
     */
    public String getDetailFams() {
        return detailFams;
    }

    /**
     * @param detailFams
     */
    public void setDetailFams(String detailFams) {
        this.detailFams = detailFams;
    }

    /**
     * @return cgpl_guid16
     */
    public byte[] getCgplGuid16() {
        return cgplGuid16;
    }

    /**
     * @param cgplGuid16
     */
    public void setCgplGuid16(byte[] cgplGuid16) {
        this.cgplGuid16 = cgplGuid16;
    }
}