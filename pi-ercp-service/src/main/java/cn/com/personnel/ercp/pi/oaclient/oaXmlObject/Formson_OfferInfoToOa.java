package cn.com.personnel.ercp.pi.oaclient.oaXmlObject;

public class Formson_OfferInfoToOa {
    private String supplierName; //供应商名称
    private String lifnr;  //供应商代码
    private String payTerms; //付款方式
    private String warrantyTime; //质保期
    private String payCondition; //付款条款
    private String currency; //币种
    private String exchangeRate; //汇率
    private String taxRate; //税率
    private String containTaxTotalPrice; //标的合作总金额(含税)
    private String containTotalPrice; //标的合作总金额(不含税)

    public String getLifnr() {
        return lifnr;
    }

    public void setLifnr(String lifnr) {
        this.lifnr = lifnr;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getPayTerms() {
        return payTerms;
    }

    public void setPayTerms(String payTerms) {
        this.payTerms = payTerms;
    }

    public String getPayCondition() {
        return payCondition;
    }

    public void setPayCondition(String payCondition) {
        this.payCondition = payCondition;
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

    public String getContainTaxTotalPrice() {
        return containTaxTotalPrice;
    }

    public void setContainTaxTotalPrice(String containTaxTotalPrice) {
        this.containTaxTotalPrice = containTaxTotalPrice;
    }

    public String getContainTotalPrice() {
        return containTotalPrice;
    }

    public void setContainTotalPrice(String containTotalPrice) {
        this.containTotalPrice = containTotalPrice;
    }

    public String getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(String warrantyTime) {
        this.warrantyTime = warrantyTime;
    }
}
