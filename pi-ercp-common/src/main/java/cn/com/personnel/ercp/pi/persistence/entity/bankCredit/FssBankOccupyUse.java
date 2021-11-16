package cn.com.personnel.ercp.pi.persistence.entity.bankCredit;

import java.math.BigDecimal;

public class FssBankOccupyUse {

    /**
     *  业务类型
     */
    private String businesstype;

    /**
     *  授信占用主体
     */
    private String creditoccupier;

    /**
     *  业务单元
     */
    private String commercianunit;

    /**
     *  公司名称
     */
    private String companyname;

    /**
     *  公司编号
     */
    private String companyid;

    /**
     *  合同名称
     */
    private String contractname;

    /**
     *  项目名称
     */
    private String projectname;

    /**
     * 银行code
     */
    private String bankcode;

    /**
     *  银行名称
     */
    private String bankname;

    /**
     *  种类
     */
    private String kind;

    /**
     *  授信品种
     */
    private String creditvarieties;

    /**
     *  币种
     */
    private String currency;

    /**
     *  币种code
     */
    private String currencycode;

    /**
     *  占用金额
     */
    private BigDecimal occupiedamount;

    /**
     *  占用金额人民币
     */
    private BigDecimal cnyoccupiedamount;

    /**
     *  使用金额
     */
    private BigDecimal useamount;

    /**
     *  使用金额人民币
     */
    private BigDecimal cnyuseamount;

    /**
     *  生效日期
     */
    private String startdate;

    /**
     *  截止日期
     */
    private String enddate;

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    public String getCreditoccupier() {
        return creditoccupier;
    }

    public void setCreditoccupier(String creditoccupier) {
        this.creditoccupier = creditoccupier;
    }

    public String getCommercianunit() {
        return commercianunit;
    }

    public void setCommercianunit(String commercianunit) {
        this.commercianunit = commercianunit;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getContractname() {
        return contractname;
    }

    public void setContractname(String contractname) {
        this.contractname = contractname;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCreditvarieties() {
        return creditvarieties;
    }

    public void setCreditvarieties(String creditvarieties) {
        this.creditvarieties = creditvarieties;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getOccupiedamount() {
        return occupiedamount;
    }

    public void setOccupiedamount(BigDecimal occupiedamount) {
        this.occupiedamount = occupiedamount;
    }

    public BigDecimal getUseamount() {
        return useamount;
    }

    public void setUseamount(BigDecimal useamount) {
        this.useamount = useamount;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getCurrencycode() {
        return currencycode;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    public BigDecimal getCnyoccupiedamount() {
        return cnyoccupiedamount;
    }

    public void setCnyoccupiedamount(BigDecimal cnyoccupiedamount) {
        this.cnyoccupiedamount = cnyoccupiedamount;
    }

    public BigDecimal getCnyuseamount() {
        return cnyuseamount;
    }

    public void setCnyuseamount(BigDecimal cnyuseamount) {
        this.cnyuseamount = cnyuseamount;
    }
}
