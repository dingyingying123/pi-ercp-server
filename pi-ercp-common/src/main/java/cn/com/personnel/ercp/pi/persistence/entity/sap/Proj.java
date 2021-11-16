package cn.com.personnel.ercp.pi.persistence.entity.sap;

import javax.persistence.*;

public class Proj {
    @Id
    private String mandt;

    /**
     * 项目定义
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private String pspnr;

    /**
     * 项目定义
     */
    private String pspid;

    /**
     * 描述
     */
    private String post1;

    /**
     * 对象号
     */
    private String objnr;

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
     * 屏蔽短的ID
     */
    private String kimsk;

    /**
     * 转换成定义
     */
    private String autod;

    /**
     * PD状态参数文件
     */
    private String stspd;

    /**
     * WBS状态参数文件
     */
    private String stspr;

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
    private String vbukr;

    /**
     * 业务范围
     */
    private String vgsbr;

    /**
     * 成本控制范围
     */
    private String vkokr;

    /**
     * 利润中心
     */
    private String prctr;

    /**
     * 项目货币
     */
    private String pwhie;

    /**
     * 网络分配
     */
    private String zuord;

    /**
     * 作业日期
     */
    private String trmeq;

    /**
     * 开始日期
     */
    private String plfaz;

    /**
     * 完成日期
     */
    private String plsez;

    /**
     * 工厂
     */
    private String werks;

    /**
     * 工厂日历
     */
    private String kalid;

    /**
     * 计划方法/基本
     */
    private String vgplf;

    /**
     * 计划方法/预测
     */
    private String ewplf;

    /**
     * 时间单位
     */
    private String zteht;

    /**
     * 显示网络号
     */
    private String nzanz;

    /**
     * 应用程序
     */
    private String plnaw;

    /**
     * 网络参数文件
     */
    private String vprof;

    /**
     * 项目参数文件
     */
    private String profl;

    /**
     * 预算参数文件
     */
    private String bprof;

    /**
     * 语言
     */
    private String txtsp;

    /**
     * 成本中心
     */
    private String kostl;

    /**
     * 成本对象
     */
    private String ktrg;

    /**
     * 最后基本排产
     */
    private String aedte;

    /**
     * 最后的年度排产
     */
    private String aedtp;

    /**
     * 主档的数据授权
     */
    private String berst;

    /**
     * 日期授权
     */
    private String bertr;

    /**
     * 成本/收益授权
     */
    private String berko;

    /**
     * 预算授权
     */
    private String berbu;

    /**
     * 当前项目号
     */
    private String spsnr;

    /**
     * 项目存货
     */
    private String besta;

    /**
     * 对象类
     */
    private String scope;

    /**
     * 统计
     */
    private String xstat;

    /**
     * 税务管辖权
     */
    private String txjcd;

    /**
     * 利息参数文件
     */
    private String zschm;

    /**
     * WBS计划概要
     */
    private String scprf;

    /**
     * 投资概况
     */
    private String imprf;

    /**
     * 付款计划概要
     */
    private String fmprf;

    /**
     * RA码
     */
    private String abgsl;

    /**
     * 描述
     */
    private String postu;

    /**
     * 计划参数文件
     */
    private String pprof;

    /**
     * 综合计划
     */
    private String plint;

    /**
     * 删除
     */
    private String loevm;

    /**
     * 不活动的
     */
    private String inact;

    /**
     * 评估
     */
    private String kzbws;

    /**
     * 模拟参数文件
     */
    private String smprf;

    /**
     * 按活动计算
     */
    private String flgvrg;

    /**
     * 自动需求分组
     */
    private String grtop;

    /**
     * 分配参数文件
     */
    private String pgprf;

    /**
     * 地点
     */
    private String stort;

    /**
     * 逻辑系统
     */
    private String logsystem;

    /**
     * 项目汇总主数据
     */
    private String kzerb;

    /**
     * 合伙人确定过程
     */
    private String pargr;

    /**
     * 功能范围
     */
    @Column(name = "func_area")
    private String funcArea;

    /**
     * 销售机构
     */
    private String vkorg;

    /**
     * 分销渠道
     */
    private String vtweg;

    /**
     * 产品组
     */
    private String spart;

    /**
     * DIP参数文件
     */
    private String dppprof;

    /**
     * 级别
     */
    private String vpkstu;

    /**
     * 项目定义
     */
    @Column(name = "pspid_edit")
    private String pspidEdit;

    /**
     * 合资
     */
    private String vname;

    /**
     * 回收标识
     */
    private String recid;

    /**
     * 权益类型
     */
    private String etype;

    /**
     * JV对象类型
     */
    private String otype;

    /**
     * JIB/JIBE类
     */
    private String jibcl;

    /**
     * JIB/JIBE子类A
     */
    private String jibsa;

    /**
     * 长度1中的哑元函数
     */
    @Column(name = "eew_proj_ps_dummy")
    private String eewProjPsDummy;

    /**
     * 计划方案
     */
    private String schtyp;

    /**
     * 预测开始日期
     */
    private String sprog;

    /**
     * 完成日期（F）
     */
    private String eprog;

    /**
     * 时戳
     */
    @Column(name = "cpd_updat")
    private Long cpdUpdat;

    /**
     * Reg. indicator
     */
    @Column(name = "ferc_ind")
    private String fercInd;

    /**
     * 自定义项目货币
     */
    @Column(name = "proj_status")
    private Integer projStatus;

    /**
     * 状态合并
     */
    private String cpcurr;

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
     * 获取项目定义
     *
     * @return pspnr - 项目定义
     */
    public String getPspnr() {
        return pspnr;
    }

    /**
     * 设置项目定义
     *
     * @param pspnr 项目定义
     */
    public void setPspnr(String pspnr) {
        this.pspnr = pspnr;
    }

    /**
     * 获取项目定义
     *
     * @return pspid - 项目定义
     */
    public String getPspid() {
        return pspid;
    }

    /**
     * 设置项目定义
     *
     * @param pspid 项目定义
     */
    public void setPspid(String pspid) {
        this.pspid = pspid;
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
     * 获取屏蔽短的ID
     *
     * @return kimsk - 屏蔽短的ID
     */
    public String getKimsk() {
        return kimsk;
    }

    /**
     * 设置屏蔽短的ID
     *
     * @param kimsk 屏蔽短的ID
     */
    public void setKimsk(String kimsk) {
        this.kimsk = kimsk;
    }

    /**
     * 获取转换成定义
     *
     * @return autod - 转换成定义
     */
    public String getAutod() {
        return autod;
    }

    /**
     * 设置转换成定义
     *
     * @param autod 转换成定义
     */
    public void setAutod(String autod) {
        this.autod = autod;
    }

    /**
     * 获取PD状态参数文件
     *
     * @return stspd - PD状态参数文件
     */
    public String getStspd() {
        return stspd;
    }

    /**
     * 设置PD状态参数文件
     *
     * @param stspd PD状态参数文件
     */
    public void setStspd(String stspd) {
        this.stspd = stspd;
    }

    /**
     * 获取WBS状态参数文件
     *
     * @return stspr - WBS状态参数文件
     */
    public String getStspr() {
        return stspr;
    }

    /**
     * 设置WBS状态参数文件
     *
     * @param stspr WBS状态参数文件
     */
    public void setStspr(String stspr) {
        this.stspr = stspr;
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
     * @return vbukr - 公司代码
     */
    public String getVbukr() {
        return vbukr;
    }

    /**
     * 设置公司代码
     *
     * @param vbukr 公司代码
     */
    public void setVbukr(String vbukr) {
        this.vbukr = vbukr;
    }

    /**
     * 获取业务范围
     *
     * @return vgsbr - 业务范围
     */
    public String getVgsbr() {
        return vgsbr;
    }

    /**
     * 设置业务范围
     *
     * @param vgsbr 业务范围
     */
    public void setVgsbr(String vgsbr) {
        this.vgsbr = vgsbr;
    }

    /**
     * 获取成本控制范围
     *
     * @return vkokr - 成本控制范围
     */
    public String getVkokr() {
        return vkokr;
    }

    /**
     * 设置成本控制范围
     *
     * @param vkokr 成本控制范围
     */
    public void setVkokr(String vkokr) {
        this.vkokr = vkokr;
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
     * 获取项目货币
     *
     * @return pwhie - 项目货币
     */
    public String getPwhie() {
        return pwhie;
    }

    /**
     * 设置项目货币
     *
     * @param pwhie 项目货币
     */
    public void setPwhie(String pwhie) {
        this.pwhie = pwhie;
    }

    /**
     * 获取网络分配
     *
     * @return zuord - 网络分配
     */
    public String getZuord() {
        return zuord;
    }

    /**
     * 设置网络分配
     *
     * @param zuord 网络分配
     */
    public void setZuord(String zuord) {
        this.zuord = zuord;
    }

    /**
     * 获取作业日期
     *
     * @return trmeq - 作业日期
     */
    public String getTrmeq() {
        return trmeq;
    }

    /**
     * 设置作业日期
     *
     * @param trmeq 作业日期
     */
    public void setTrmeq(String trmeq) {
        this.trmeq = trmeq;
    }

    /**
     * 获取开始日期
     *
     * @return plfaz - 开始日期
     */
    public String getPlfaz() {
        return plfaz;
    }

    /**
     * 设置开始日期
     *
     * @param plfaz 开始日期
     */
    public void setPlfaz(String plfaz) {
        this.plfaz = plfaz;
    }

    /**
     * 获取完成日期
     *
     * @return plsez - 完成日期
     */
    public String getPlsez() {
        return plsez;
    }

    /**
     * 设置完成日期
     *
     * @param plsez 完成日期
     */
    public void setPlsez(String plsez) {
        this.plsez = plsez;
    }

    /**
     * 获取工厂
     *
     * @return werks - 工厂
     */
    public String getWerks() {
        return werks;
    }

    /**
     * 设置工厂
     *
     * @param werks 工厂
     */
    public void setWerks(String werks) {
        this.werks = werks;
    }

    /**
     * 获取工厂日历
     *
     * @return kalid - 工厂日历
     */
    public String getKalid() {
        return kalid;
    }

    /**
     * 设置工厂日历
     *
     * @param kalid 工厂日历
     */
    public void setKalid(String kalid) {
        this.kalid = kalid;
    }

    /**
     * 获取计划方法/基本
     *
     * @return vgplf - 计划方法/基本
     */
    public String getVgplf() {
        return vgplf;
    }

    /**
     * 设置计划方法/基本
     *
     * @param vgplf 计划方法/基本
     */
    public void setVgplf(String vgplf) {
        this.vgplf = vgplf;
    }

    /**
     * 获取计划方法/预测
     *
     * @return ewplf - 计划方法/预测
     */
    public String getEwplf() {
        return ewplf;
    }

    /**
     * 设置计划方法/预测
     *
     * @param ewplf 计划方法/预测
     */
    public void setEwplf(String ewplf) {
        this.ewplf = ewplf;
    }

    /**
     * 获取时间单位
     *
     * @return zteht - 时间单位
     */
    public String getZteht() {
        return zteht;
    }

    /**
     * 设置时间单位
     *
     * @param zteht 时间单位
     */
    public void setZteht(String zteht) {
        this.zteht = zteht;
    }

    /**
     * 获取显示网络号
     *
     * @return nzanz - 显示网络号
     */
    public String getNzanz() {
        return nzanz;
    }

    /**
     * 设置显示网络号
     *
     * @param nzanz 显示网络号
     */
    public void setNzanz(String nzanz) {
        this.nzanz = nzanz;
    }

    /**
     * 获取应用程序
     *
     * @return plnaw - 应用程序
     */
    public String getPlnaw() {
        return plnaw;
    }

    /**
     * 设置应用程序
     *
     * @param plnaw 应用程序
     */
    public void setPlnaw(String plnaw) {
        this.plnaw = plnaw;
    }

    /**
     * 获取网络参数文件
     *
     * @return vprof - 网络参数文件
     */
    public String getVprof() {
        return vprof;
    }

    /**
     * 设置网络参数文件
     *
     * @param vprof 网络参数文件
     */
    public void setVprof(String vprof) {
        this.vprof = vprof;
    }

    /**
     * 获取项目参数文件
     *
     * @return profl - 项目参数文件
     */
    public String getProfl() {
        return profl;
    }

    /**
     * 设置项目参数文件
     *
     * @param profl 项目参数文件
     */
    public void setProfl(String profl) {
        this.profl = profl;
    }

    /**
     * 获取预算参数文件
     *
     * @return bprof - 预算参数文件
     */
    public String getBprof() {
        return bprof;
    }

    /**
     * 设置预算参数文件
     *
     * @param bprof 预算参数文件
     */
    public void setBprof(String bprof) {
        this.bprof = bprof;
    }

    /**
     * 获取语言
     *
     * @return txtsp - 语言
     */
    public String getTxtsp() {
        return txtsp;
    }

    /**
     * 设置语言
     *
     * @param txtsp 语言
     */
    public void setTxtsp(String txtsp) {
        this.txtsp = txtsp;
    }

    /**
     * 获取成本中心
     *
     * @return kostl - 成本中心
     */
    public String getKostl() {
        return kostl;
    }

    /**
     * 设置成本中心
     *
     * @param kostl 成本中心
     */
    public void setKostl(String kostl) {
        this.kostl = kostl;
    }

    /**
     * 获取成本对象
     *
     * @return ktrg - 成本对象
     */
    public String getKtrg() {
        return ktrg;
    }

    /**
     * 设置成本对象
     *
     * @param ktrg 成本对象
     */
    public void setKtrg(String ktrg) {
        this.ktrg = ktrg;
    }

    /**
     * 获取最后基本排产
     *
     * @return aedte - 最后基本排产
     */
    public String getAedte() {
        return aedte;
    }

    /**
     * 设置最后基本排产
     *
     * @param aedte 最后基本排产
     */
    public void setAedte(String aedte) {
        this.aedte = aedte;
    }

    /**
     * 获取最后的年度排产
     *
     * @return aedtp - 最后的年度排产
     */
    public String getAedtp() {
        return aedtp;
    }

    /**
     * 设置最后的年度排产
     *
     * @param aedtp 最后的年度排产
     */
    public void setAedtp(String aedtp) {
        this.aedtp = aedtp;
    }

    /**
     * 获取主档的数据授权
     *
     * @return berst - 主档的数据授权
     */
    public String getBerst() {
        return berst;
    }

    /**
     * 设置主档的数据授权
     *
     * @param berst 主档的数据授权
     */
    public void setBerst(String berst) {
        this.berst = berst;
    }

    /**
     * 获取日期授权
     *
     * @return bertr - 日期授权
     */
    public String getBertr() {
        return bertr;
    }

    /**
     * 设置日期授权
     *
     * @param bertr 日期授权
     */
    public void setBertr(String bertr) {
        this.bertr = bertr;
    }

    /**
     * 获取成本/收益授权
     *
     * @return berko - 成本/收益授权
     */
    public String getBerko() {
        return berko;
    }

    /**
     * 设置成本/收益授权
     *
     * @param berko 成本/收益授权
     */
    public void setBerko(String berko) {
        this.berko = berko;
    }

    /**
     * 获取预算授权
     *
     * @return berbu - 预算授权
     */
    public String getBerbu() {
        return berbu;
    }

    /**
     * 设置预算授权
     *
     * @param berbu 预算授权
     */
    public void setBerbu(String berbu) {
        this.berbu = berbu;
    }

    /**
     * 获取当前项目号
     *
     * @return spsnr - 当前项目号
     */
    public String getSpsnr() {
        return spsnr;
    }

    /**
     * 设置当前项目号
     *
     * @param spsnr 当前项目号
     */
    public void setSpsnr(String spsnr) {
        this.spsnr = spsnr;
    }

    /**
     * 获取项目存货
     *
     * @return besta - 项目存货
     */
    public String getBesta() {
        return besta;
    }

    /**
     * 设置项目存货
     *
     * @param besta 项目存货
     */
    public void setBesta(String besta) {
        this.besta = besta;
    }

    /**
     * 获取对象类
     *
     * @return scope - 对象类
     */
    public String getScope() {
        return scope;
    }

    /**
     * 设置对象类
     *
     * @param scope 对象类
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * 获取统计
     *
     * @return xstat - 统计
     */
    public String getXstat() {
        return xstat;
    }

    /**
     * 设置统计
     *
     * @param xstat 统计
     */
    public void setXstat(String xstat) {
        this.xstat = xstat;
    }

    /**
     * 获取税务管辖权
     *
     * @return txjcd - 税务管辖权
     */
    public String getTxjcd() {
        return txjcd;
    }

    /**
     * 设置税务管辖权
     *
     * @param txjcd 税务管辖权
     */
    public void setTxjcd(String txjcd) {
        this.txjcd = txjcd;
    }

    /**
     * 获取利息参数文件
     *
     * @return zschm - 利息参数文件
     */
    public String getZschm() {
        return zschm;
    }

    /**
     * 设置利息参数文件
     *
     * @param zschm 利息参数文件
     */
    public void setZschm(String zschm) {
        this.zschm = zschm;
    }

    /**
     * 获取WBS计划概要
     *
     * @return scprf - WBS计划概要
     */
    public String getScprf() {
        return scprf;
    }

    /**
     * 设置WBS计划概要
     *
     * @param scprf WBS计划概要
     */
    public void setScprf(String scprf) {
        this.scprf = scprf;
    }

    /**
     * 获取投资概况
     *
     * @return imprf - 投资概况
     */
    public String getImprf() {
        return imprf;
    }

    /**
     * 设置投资概况
     *
     * @param imprf 投资概况
     */
    public void setImprf(String imprf) {
        this.imprf = imprf;
    }

    /**
     * 获取付款计划概要
     *
     * @return fmprf - 付款计划概要
     */
    public String getFmprf() {
        return fmprf;
    }

    /**
     * 设置付款计划概要
     *
     * @param fmprf 付款计划概要
     */
    public void setFmprf(String fmprf) {
        this.fmprf = fmprf;
    }

    /**
     * 获取RA码
     *
     * @return abgsl - RA码
     */
    public String getAbgsl() {
        return abgsl;
    }

    /**
     * 设置RA码
     *
     * @param abgsl RA码
     */
    public void setAbgsl(String abgsl) {
        this.abgsl = abgsl;
    }

    /**
     * 获取描述
     *
     * @return postu - 描述
     */
    public String getPostu() {
        return postu;
    }

    /**
     * 设置描述
     *
     * @param postu 描述
     */
    public void setPostu(String postu) {
        this.postu = postu;
    }

    /**
     * 获取计划参数文件
     *
     * @return pprof - 计划参数文件
     */
    public String getPprof() {
        return pprof;
    }

    /**
     * 设置计划参数文件
     *
     * @param pprof 计划参数文件
     */
    public void setPprof(String pprof) {
        this.pprof = pprof;
    }

    /**
     * 获取综合计划
     *
     * @return plint - 综合计划
     */
    public String getPlint() {
        return plint;
    }

    /**
     * 设置综合计划
     *
     * @param plint 综合计划
     */
    public void setPlint(String plint) {
        this.plint = plint;
    }

    /**
     * 获取删除
     *
     * @return loevm - 删除
     */
    public String getLoevm() {
        return loevm;
    }

    /**
     * 设置删除
     *
     * @param loevm 删除
     */
    public void setLoevm(String loevm) {
        this.loevm = loevm;
    }

    /**
     * 获取不活动的
     *
     * @return inact - 不活动的
     */
    public String getInact() {
        return inact;
    }

    /**
     * 设置不活动的
     *
     * @param inact 不活动的
     */
    public void setInact(String inact) {
        this.inact = inact;
    }

    /**
     * 获取评估
     *
     * @return kzbws - 评估
     */
    public String getKzbws() {
        return kzbws;
    }

    /**
     * 设置评估
     *
     * @param kzbws 评估
     */
    public void setKzbws(String kzbws) {
        this.kzbws = kzbws;
    }

    /**
     * 获取模拟参数文件
     *
     * @return smprf - 模拟参数文件
     */
    public String getSmprf() {
        return smprf;
    }

    /**
     * 设置模拟参数文件
     *
     * @param smprf 模拟参数文件
     */
    public void setSmprf(String smprf) {
        this.smprf = smprf;
    }

    /**
     * 获取按活动计算
     *
     * @return flgvrg - 按活动计算
     */
    public String getFlgvrg() {
        return flgvrg;
    }

    /**
     * 设置按活动计算
     *
     * @param flgvrg 按活动计算
     */
    public void setFlgvrg(String flgvrg) {
        this.flgvrg = flgvrg;
    }

    /**
     * 获取自动需求分组
     *
     * @return grtop - 自动需求分组
     */
    public String getGrtop() {
        return grtop;
    }

    /**
     * 设置自动需求分组
     *
     * @param grtop 自动需求分组
     */
    public void setGrtop(String grtop) {
        this.grtop = grtop;
    }

    /**
     * 获取分配参数文件
     *
     * @return pgprf - 分配参数文件
     */
    public String getPgprf() {
        return pgprf;
    }

    /**
     * 设置分配参数文件
     *
     * @param pgprf 分配参数文件
     */
    public void setPgprf(String pgprf) {
        this.pgprf = pgprf;
    }

    /**
     * 获取地点
     *
     * @return stort - 地点
     */
    public String getStort() {
        return stort;
    }

    /**
     * 设置地点
     *
     * @param stort 地点
     */
    public void setStort(String stort) {
        this.stort = stort;
    }

    /**
     * 获取逻辑系统
     *
     * @return logsystem - 逻辑系统
     */
    public String getLogsystem() {
        return logsystem;
    }

    /**
     * 设置逻辑系统
     *
     * @param logsystem 逻辑系统
     */
    public void setLogsystem(String logsystem) {
        this.logsystem = logsystem;
    }

    /**
     * 获取项目汇总主数据
     *
     * @return kzerb - 项目汇总主数据
     */
    public String getKzerb() {
        return kzerb;
    }

    /**
     * 设置项目汇总主数据
     *
     * @param kzerb 项目汇总主数据
     */
    public void setKzerb(String kzerb) {
        this.kzerb = kzerb;
    }

    /**
     * 获取合伙人确定过程
     *
     * @return pargr - 合伙人确定过程
     */
    public String getPargr() {
        return pargr;
    }

    /**
     * 设置合伙人确定过程
     *
     * @param pargr 合伙人确定过程
     */
    public void setPargr(String pargr) {
        this.pargr = pargr;
    }

    /**
     * 获取功能范围
     *
     * @return func_area - 功能范围
     */
    public String getFuncArea() {
        return funcArea;
    }

    /**
     * 设置功能范围
     *
     * @param funcArea 功能范围
     */
    public void setFuncArea(String funcArea) {
        this.funcArea = funcArea;
    }

    /**
     * 获取销售机构
     *
     * @return vkorg - 销售机构
     */
    public String getVkorg() {
        return vkorg;
    }

    /**
     * 设置销售机构
     *
     * @param vkorg 销售机构
     */
    public void setVkorg(String vkorg) {
        this.vkorg = vkorg;
    }

    /**
     * 获取分销渠道
     *
     * @return vtweg - 分销渠道
     */
    public String getVtweg() {
        return vtweg;
    }

    /**
     * 设置分销渠道
     *
     * @param vtweg 分销渠道
     */
    public void setVtweg(String vtweg) {
        this.vtweg = vtweg;
    }

    /**
     * 获取产品组
     *
     * @return spart - 产品组
     */
    public String getSpart() {
        return spart;
    }

    /**
     * 设置产品组
     *
     * @param spart 产品组
     */
    public void setSpart(String spart) {
        this.spart = spart;
    }

    /**
     * 获取DIP参数文件
     *
     * @return dppprof - DIP参数文件
     */
    public String getDppprof() {
        return dppprof;
    }

    /**
     * 设置DIP参数文件
     *
     * @param dppprof DIP参数文件
     */
    public void setDppprof(String dppprof) {
        this.dppprof = dppprof;
    }

    /**
     * 获取级别
     *
     * @return vpkstu - 级别
     */
    public String getVpkstu() {
        return vpkstu;
    }

    /**
     * 设置级别
     *
     * @param vpkstu 级别
     */
    public void setVpkstu(String vpkstu) {
        this.vpkstu = vpkstu;
    }

    /**
     * 获取项目定义
     *
     * @return pspid_edit - 项目定义
     */
    public String getPspidEdit() {
        return pspidEdit;
    }

    /**
     * 设置项目定义
     *
     * @param pspidEdit 项目定义
     */
    public void setPspidEdit(String pspidEdit) {
        this.pspidEdit = pspidEdit;
    }

    /**
     * 获取合资
     *
     * @return vname - 合资
     */
    public String getVname() {
        return vname;
    }

    /**
     * 设置合资
     *
     * @param vname 合资
     */
    public void setVname(String vname) {
        this.vname = vname;
    }

    /**
     * 获取回收标识
     *
     * @return recid - 回收标识
     */
    public String getRecid() {
        return recid;
    }

    /**
     * 设置回收标识
     *
     * @param recid 回收标识
     */
    public void setRecid(String recid) {
        this.recid = recid;
    }

    /**
     * 获取权益类型
     *
     * @return etype - 权益类型
     */
    public String getEtype() {
        return etype;
    }

    /**
     * 设置权益类型
     *
     * @param etype 权益类型
     */
    public void setEtype(String etype) {
        this.etype = etype;
    }

    /**
     * 获取JV对象类型
     *
     * @return otype - JV对象类型
     */
    public String getOtype() {
        return otype;
    }

    /**
     * 设置JV对象类型
     *
     * @param otype JV对象类型
     */
    public void setOtype(String otype) {
        this.otype = otype;
    }

    /**
     * 获取JIB/JIBE类
     *
     * @return jibcl - JIB/JIBE类
     */
    public String getJibcl() {
        return jibcl;
    }

    /**
     * 设置JIB/JIBE类
     *
     * @param jibcl JIB/JIBE类
     */
    public void setJibcl(String jibcl) {
        this.jibcl = jibcl;
    }

    /**
     * 获取JIB/JIBE子类A
     *
     * @return jibsa - JIB/JIBE子类A
     */
    public String getJibsa() {
        return jibsa;
    }

    /**
     * 设置JIB/JIBE子类A
     *
     * @param jibsa JIB/JIBE子类A
     */
    public void setJibsa(String jibsa) {
        this.jibsa = jibsa;
    }

    /**
     * 获取长度1中的哑元函数
     *
     * @return eew_proj_ps_dummy - 长度1中的哑元函数
     */
    public String getEewProjPsDummy() {
        return eewProjPsDummy;
    }

    /**
     * 设置长度1中的哑元函数
     *
     * @param eewProjPsDummy 长度1中的哑元函数
     */
    public void setEewProjPsDummy(String eewProjPsDummy) {
        this.eewProjPsDummy = eewProjPsDummy;
    }

    /**
     * 获取计划方案
     *
     * @return schtyp - 计划方案
     */
    public String getSchtyp() {
        return schtyp;
    }

    /**
     * 设置计划方案
     *
     * @param schtyp 计划方案
     */
    public void setSchtyp(String schtyp) {
        this.schtyp = schtyp;
    }

    /**
     * 获取预测开始日期
     *
     * @return sprog - 预测开始日期
     */
    public String getSprog() {
        return sprog;
    }

    /**
     * 设置预测开始日期
     *
     * @param sprog 预测开始日期
     */
    public void setSprog(String sprog) {
        this.sprog = sprog;
    }

    /**
     * 获取完成日期（F）
     *
     * @return eprog - 完成日期（F）
     */
    public String getEprog() {
        return eprog;
    }

    /**
     * 设置完成日期（F）
     *
     * @param eprog 完成日期（F）
     */
    public void setEprog(String eprog) {
        this.eprog = eprog;
    }

    /**
     * 获取时戳
     *
     * @return cpd_updat - 时戳
     */
    public Long getCpdUpdat() {
        return cpdUpdat;
    }

    /**
     * 设置时戳
     *
     * @param cpdUpdat 时戳
     */
    public void setCpdUpdat(Long cpdUpdat) {
        this.cpdUpdat = cpdUpdat;
    }

    /**
     * 获取Reg. indicator
     *
     * @return ferc_ind - Reg. indicator
     */
    public String getFercInd() {
        return fercInd;
    }

    /**
     * 设置Reg. indicator
     *
     * @param fercInd Reg. indicator
     */
    public void setFercInd(String fercInd) {
        this.fercInd = fercInd;
    }

    /**
     * 获取自定义项目货币
     *
     * @return proj_status - 自定义项目货币
     */
    public Integer getProjStatus() {
        return projStatus;
    }

    /**
     * 设置自定义项目货币
     *
     * @param projStatus 自定义项目货币
     */
    public void setProjStatus(Integer projStatus) {
        this.projStatus = projStatus;
    }

    /**
     * 获取状态合并
     *
     * @return cpcurr - 状态合并
     */
    public String getCpcurr() {
        return cpcurr;
    }

    /**
     * 设置状态合并
     *
     * @param cpcurr 状态合并
     */
    public void setCpcurr(String cpcurr) {
        this.cpcurr = cpcurr;
    }
}