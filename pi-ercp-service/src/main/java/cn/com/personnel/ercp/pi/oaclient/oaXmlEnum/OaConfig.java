/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.oaclient.oaXmlEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qinerhu
 *
 */
public enum OaConfig {
    XUNJIADAN("询价单号", "prDetailNo"),
    XUNJIAHANG("询价行项", "bnfpo"),
    JIEZHIRIQI("报价截止日期", "deadline"),
    CAIGOUZUZHI("采购组织", "ekorg"),
    WULIAOBIANMA("物料编码", "matnr"),
    WULIAOMIAOSHU("物料服务描述", "txz01"),
    TUZHIBIANMA("图纸编码", "zzdwcode"),
    XUNJIASHULIANG("询价数量", "menge"),
    XUNJIADANWEI("询价单位", "meins"),
    GONGYINGSHANG("供应商", "supplierIdAndName"),
    BAOJIA("人民币报价", "containTaxTotalPrice"),
    ZHENGCHANGHUOQI("正常货期", "normalGoodsTime"),
    ZHIBAOQI("质保期", "warrantyTime"),
    SHUIE("税额", "taxRate"),
    FUKUANTIAOJIAN("付款条件", "paymentTerms"),
    QUEDINGGONGYINGSHANG("确定供应商", "supplierName_duo"),
    BILIGUANXI("供应商比例关系", "proportion_duo"),
    BILIYOUXIAOQIC("比例有效期从", "nowTime"),
    BILIYOUXIAOQID("比例有效期到", "activeTime"),
    SHIJISHULIANG("实际数量分配", "menge_duo"),
    DINGDANXINGSHI("订单形式", "poType"),
    JIAGESHENGXIAOGONGCHANG("价格生效工厂", "werksText"),
    REMARK("比价格结果说明", "remark"),
    DINGJIA_ID("定价汇总ID", "parityId"),
    OANUM("申请人OA号", "userId"),
    // 工厂变更信息
    OLDFACTORYCOUNTRYCODE("变更前-国家", "oldFactoryCountry_code"),
    NEWFACTORYCOUNTRYCODE("变更后-国家", "newFactoryCountry_code"),
    OLDFACTORYCITYCODE("变更前-城市", "oldCity_code"),
    NEWFACTORYCITYCODE("变更后-城市", "newCity_code"),
    OLDTIMESTAMP("变更前-外部地址编号", "oldTimeStamp"),
    NEWTIMESTAMP("变更后-外部地址编号", "newTimeStamp"),
    OLDFACTORYADDRESS("变更前-地址描述", "oldFactoryAddress"),
    NEWFACTORYADDRESS("变更后-地址描述", "newFactoryAddress"),
    // 变更供应商信息
    SHILIHAO("实例号", "instanceNO"),
    SUOSHUBUMEN("申请部门", "userDepartment"),
    USEROAID("申请人", "userOaId"),
    SHENQINGSHIJIAN("申请时间", "applicationDate"),
    GONGYINGSHANGBIANHAO("实例号", "supplierId"),
    GONGYINGSHANGSAP("供应商编号", "lifnr"),
    JIEDAODIZHI("街道地址", "oldStreet"),
    MENPAIHAO("门牌号", "oldHouseNumber"),
    ZUZHIJIGOUDAIMA("组织机构代码", "oldOrganizationCode"),
    SHUIHAOLEIBIE("税号类别", "oldEinType"),
    SHUIHAO("税号", "oldEinNo"),
    GONGINGSHANGMINGCHENG("供应商名称", "oldName"),
    YOUBIAN("邮编", "oldPostNO"),
    SOUSUOXIANG("搜索项", "oldAbbreviation"),
    GUOJIA("国家", "oldCountry_code"),
    CHENGSHI("城市", "oldCity"),
    DIZHIMIAOSHU("地址描述", "oldAddress"),
    XINGONGYINGSHANGMINGCHENG("变更-供应商名称", "newName"),
    XINJIEDAODIZHI("变更-街道地址", "newStreet"),
    XINMENPAIHAO("变更-门牌号", "newHouseNumber"),
    XINZUZHIJIGOUDAIMA("变更-组织机构代码", "newOrganizationCode"),
    XINSHUIHAOLEIBIE("变更-税号类别", "newEinType"),
    XINSHUIHAO("变更-税号", "newEinNo"),
    XINDIZHIMIAOSHU("变更-地址描述", "newAddress"),
    XINYOUBIAN("变更-邮编", "newPostNO"),
    XINSOUSUOXIANG("变更-搜索项", "newAbbreviation"),
    XINGUOJIA("变更-国家", "newCountry_code"),
    XINCHENGSHI("变更-城市", "newCity"),
    YUYAN("语言", "oldLanguage"),
    BIANGENGYUYAN("变更-语言", "newLanguage"),

    YINHANGGUOJIA("银行国家重", "oldBankCountry"),
    YINHANGDAIMA("银行代码重", "oldBankcode"),
    YINHANGZHANGHU("银行账户重", "oldAccount"),
    YINHANGBIAOSHI("银行表示重", "oldBankLink"),
    YINHANGMINGCHENG("银行名称重", "oldBranch"),
    YOUXIAORIQIKAI("有效日期开", "oldAccountStartTime"),
    YOUXIAORIQIJIESHU("有效日期洁", "oldAccountDeadTime"),
    ZHANGHUCHIYOUREN("账户持有人重", "oldAccountCompany"),
    YINHANGGONGSIBIANMA("银行公司编码原", "oldBukrs"),
    YINHANGGONGSIMINGCHENG("银行公司名称原", "oldButxt"),


    XINYINHANGGUOJIA("变更-银行国家", "newBankCountry"),
    XINYINHANGDAIMA("变更-银行代码", "newBankcode"),
    XINYINHANGZHANGHU("变更-银行账户", "newAccount"),
    XINYINHANGBIAOSHI("变更-银行标识", "newBankLink"),
    XINYINHANGMINGCHENG("变更-持有人", "newAccountCompany"),
    XINYOUXIAORIQIKAI("变更-开始日期", "newAccountStartTime"),
    XINYOUXIAORIQIJIESHU("变更-结束日期", "newAccountDeadTime"),
    XINZHANGHUCHIYOUREN("变更-银行名称", "newBranch"),
    XINYINHANGGONGSIMINGCHENG("银行公司名称", "newButxt"),
    XINYINHANGGONGSIBIANMA("银行公司编码", "newBukrs"),


    GONGYINGSHANGMINCHEN("供应商名称", "supplierName"),
    FUKUANFANGSHI("付款方式", "payTerms"),
    FUKUANTIAOKUAN("付款条款", "payCondition"),
    BIZHONG("币种", "currency"),
    HUILV("汇率", "exchangeRate"),
    SHUILV("税率", "taxRate"),
    HANSHUIZONGJIA("合作总金额", "containTaxTotalPrice"),
    BUHANSHUIZONGJIA("标的合作总金额", "containTotalPrice"),

    TEMPLATE_NO("合同模板编号", "templateNo"),
    TEMPLATE_NAME("合同模板名称", "templateName"),
    CATEGORY("合同类别", "category"),
    PARTY("我方合同地位", "party"),
    TEMPLATE_DESC("合同模板说明", "templateDesc"),
    EKORG("采购组织代码", "ekorg"),
    EKOTX("采购组织名称", "ekotx"),


    SEALTYPE("印章类型", "sealType"),
    SEAL_NAME("印章名称", "sealName"),
//    SEAL_USER("用印人", "sealUser"),
    SYSTEMSOURCE("系统来源", "systemSource"),

    IS_ElECTRONIC_SIGNATURE("是否电子签", "isElectronicSignature"),
    PDF_FILE_NAME("文件名称", "pdfFileName"),
    COPIES("份数", "copies"),
    SEAL_NUMBER("印数", "sealNumber"),
    SEAL_USE_DATE("用印时间", "sealUseDate"),
    CONTRACT_NO("合同编号", "contractNo"),
    LIFNR_TEXT("合同对象名称", "lifnrText"),
    MONEY("合同金额", "money"),
    CONTRACT_INSTANCE_NUMBER("评审单号", "contractInstanceNumber"),

    SENDDEPARTMENT("发起部门", "sendDepartment"),
    SENDDATE("发起时间", "sendDate"),
    SENDUSER("发起人", "sendUser"),
    OURCONTRACTSUBJECT("合同主体", "ourContractSubject"),
    CONTRACTMONEY("合同金额", "contractMoney"),
    GUARANTEEPERIOD("质保期", "guaranteePeriod"),
    PAYMENTTERMSTEXT("付款条款", "paymentTermsText"),
    ISINSIDERTRADING("是否内部交易", "isInsiderTrading"),
    SUPPLIERNAMELINE("供应商名称-多行", "supplierNameLine"),


    OURCONTRACTSUBJECTFRAME("我方签约主体", "ourContractSubjectFrame"),
    GENERALCONTRACTNO("通用合同编号", "generalContractNo"),
    GENERALCONTRACTDATESTART("通用合同有效期", "generalContractDateStart"),
    GENERALCONTRACTDATEEND("通用合同有效期止", "generalContractDateEnd"),
    SPECIALCONTRACTNO("专用合同编号", "specialContractNo"),
    SPECIALCONTRACTDATESTART("专用合同的有效期", "specialContractDateStart"),
    SPECIALCONTRACTDATEEND("专用合同的有效期止", "specialContractDateEnd"),
    ISCONSIGNMENT("是否VMI合同", "isConsignment"),
    ISSTANDARDTEMPLATE("是否标准模板", "isStandardTemplate"),
    VALUATIONTYPE("合同计价方式", "valuationType"),
    OBJECTTOTALAMOUNT("合作总金额未税", "objectTotalAmount"),
//    MATERIALCATEGORY("物料类别-新", "materialCategory"),
    CURRENCYNew("币种-新", "currencyNew"),
    COMPAREFILEURL("文本对比", "compareFileUrl"),
    VMICONTRACTNO("VMI合同编号", "VMIContractNo"),
    VALIDUNTIL("有效期至", "validUntil")
    ;
    // 成员变量
    String name;
    String index;

    private static final Map<String, String> ENUM_MAP = new HashMap<String, String>();
    static {
        for (final OaConfig oaConfig : OaConfig.values()) {
            ENUM_MAP.put(oaConfig.getIndex(), oaConfig.getName());
        }
    }

    OaConfig(String name, String index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public static String index2Name(final String index) {
        return ENUM_MAP.get(index);
    }
}
