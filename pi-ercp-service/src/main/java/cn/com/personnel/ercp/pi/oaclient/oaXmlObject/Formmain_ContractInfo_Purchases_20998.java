package cn.com.personnel.ercp.pi.oaclient.oaXmlObject;

public class Formmain_ContractInfo_Purchases_20998 {

    private String sendDepartment; //发起部门
//    private String sendUser; //发起人
    private String sendDate; //发起时间
    private String contractNo; //合同编号
    private String isInsiderTrading; //是否内部交易
    private String ourContractSubject; //我方合同主体
    private String currency; //币种
    private String contractMoney; //币种
    private String exchangeRate; //汇率
    private String taxRate; //税率
    private String guaranteePeriod; //质保期
    private String paymentTermsText; //付款条款
    private String isStandardTemplate;
    private String compareFileUrl;  //文本对比路径
    private String systemSource;//系统来源

    public String getSendDepartment() {
        return sendDepartment;
    }

    public void setSendDepartment(String sendDepartment) {
        this.sendDepartment = sendDepartment;
    }

//    public String getSendUser() {
//        return sendUser;
//    }
//
//    public void setSendUser(String sendUser) {
//        this.sendUser = sendUser;
//    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getIsInsiderTrading() {
        return isInsiderTrading;
    }

    public void setIsInsiderTrading(String isInsiderTrading) {
        this.isInsiderTrading = isInsiderTrading;
    }

    public String getOurContractSubject() {
        return ourContractSubject;
    }

    public void setOurContractSubject(String ourContractSubject) {
        this.ourContractSubject = ourContractSubject;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(String guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    public String getPaymentTermsText() {
        return paymentTermsText;
    }

    public void setPaymentTermsText(String paymentTermsText) {
        this.paymentTermsText = paymentTermsText;
    }

    public String getContractMoney() {
        return contractMoney;
    }

    public void setContractMoney(String contractMoney) {
        this.contractMoney = contractMoney;
    }

    public String getIsStandardTemplate() {
        return isStandardTemplate;
    }

    public void setIsStandardTemplate(String isStandardTemplate) {
        this.isStandardTemplate = isStandardTemplate;
    }

    public String getCompareFileUrl() {
        return compareFileUrl;
    }

    public void setCompareFileUrl(String compareFileUrl) {
        this.compareFileUrl = compareFileUrl;
    }

    public String getSystemSource() {
        return systemSource;
    }

    public void setSystemSource(String systemSource) {
        this.systemSource = systemSource;
    }
}