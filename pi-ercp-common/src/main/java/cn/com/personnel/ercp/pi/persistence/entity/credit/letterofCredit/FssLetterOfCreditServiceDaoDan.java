package cn.com.personnel.ercp.pi.persistence.entity.credit.letterofCredit;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_letter_of_credit_service_dao_dan")
public class FssLetterOfCreditServiceDaoDan {
    /**
     * 主键
     */
    @Id
    @Column(name = "flocsdd_id")
    @GeneratedValue(generator = "JDBC")
    private String flocsddId;

    /**
     * 到单日期
     */
    @Column(name = "dao_dan_date")
    private Date daoDanDate;

    /**
     * 到单金额
     */
    @Column(name = "dao_dan_money")
    private BigDecimal daoDanMoney;

    /**
     * 付款金额
     */
    @Column(name = "payment_money")
    private BigDecimal paymentMoney;

    /**
     * 付款日期
     */
    @Column(name = "payment_date")
    private Date paymentDate;

    /**
     * 到单汇率
     */
    @Column(name = "dao_dan_exchange")
    private String daoDanExchange;

    /**
     * 折合人民币金额
     */
    @Column(name = "dao_dan_convert_cny")
    private BigDecimal daoDanConvertCny;

    /**
     * 折合人民币金额
     */
    private BigDecimal paymentConvertCny;

    /**
     * 发票号
     */
    @Column(name = "invoice_number")
    private String invoiceNumber;

    /**
     * 拒付
     */
    private String protest;

    /**
     * 到单备注
     */
    @Column(name = "dao_dan_remarks")
    private String daoDanRemarks;

    /**
    * 付款汇率
    */
    private String paymentExchange;

    private Date updateTime;
    private Date createTime;
    private String updator;
    private String creator;

    private String flocmId;

    /**
     * 获取主键
     *
     * @return flocsdd_id - 主键
     */
    public String getFlocsddId() {
        return flocsddId;
    }

    /**
     * 设置主键
     *
     * @param flocsddId 主键
     */
    public void setFlocsddId(String flocsddId) {
        this.flocsddId = flocsddId;
    }

    /**
     * 获取到单日期
     *
     * @return dao_dan_date - 到单日期
     */
    public Date getDaoDanDate() {
        return daoDanDate;
    }

    /**
     * 设置到单日期
     *
     * @param daoDanDate 到单日期
     */
    public void setDaoDanDate(Date daoDanDate) {
        this.daoDanDate = daoDanDate;
    }

    /**
     * 获取到单金额
     *
     * @return dao_dan_money - 到单金额
     */
    public BigDecimal getDaoDanMoney() {
        return daoDanMoney;
    }

    /**
     * 设置到单金额
     *
     * @param daoDanMoney 到单金额
     */
    public void setDaoDanMoney(BigDecimal daoDanMoney) {
        this.daoDanMoney = daoDanMoney;
    }

    /**
     * 获取付款金额
     *
     * @return payment_money - 付款金额
     */
    public BigDecimal getPaymentMoney() {
        return paymentMoney;
    }

    /**
     * 设置付款金额
     *
     * @param paymentMoney 付款金额
     */
    public void setPaymentMoney(BigDecimal paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    /**
     * 获取付款金额
     *
     * @return payment_date - 付款金额
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * 设置付款金额
     *
     * @param paymentDate 付款金额
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * 获取到单汇率
     *
     * @return dao_dan_exchange - 到单汇率
     */
    public String getDaoDanExchange() {
        return daoDanExchange;
    }

    /**
     * 设置到单汇率
     *
     * @param daoDanExchange 到单汇率
     */
    public void setDaoDanExchange(String daoDanExchange) {
        this.daoDanExchange = daoDanExchange;
    }



    /**
     * 获取发票号
     *
     * @return invoice_number - 发票号
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * 设置发票号
     *
     * @param invoiceNumber 发票号
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * 获取拒付
     *
     * @return protest - 拒付
     */
    public String getProtest() {
        return protest;
    }

    /**
     * 设置拒付
     *
     * @param protest 拒付
     */
    public void setProtest(String protest) {
        this.protest = protest;
    }

    /**
     * 获取到单备注
     *
     * @return dao_dan_remarks - 到单备注
     */
    public String getDaoDanRemarks() {
        return daoDanRemarks;
    }

    /**
     * 设置到单备注
     *
     * @param daoDanRemarks 到单备注
     */
    public void setDaoDanRemarks(String daoDanRemarks) {
        this.daoDanRemarks = daoDanRemarks;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getFlocmId() {
        return flocmId;
    }

    public void setFlocmId(String flocmId) {
        this.flocmId = flocmId;
    }

    public String getPaymentExchange() {
        return paymentExchange;
    }

    public void setPaymentExchange(String paymentExchange) {
        this.paymentExchange = paymentExchange;
    }

    public BigDecimal getDaoDanConvertCny() {
        return daoDanConvertCny;
    }

    public void setDaoDanConvertCny(BigDecimal daoDanConvertCny) {
        this.daoDanConvertCny = daoDanConvertCny;
    }

    public BigDecimal getPaymentConvertCny() {
        return paymentConvertCny;
    }

    public void setPaymentConvertCny(BigDecimal paymentConvertCny) {
        this.paymentConvertCny = paymentConvertCny;
    }
}