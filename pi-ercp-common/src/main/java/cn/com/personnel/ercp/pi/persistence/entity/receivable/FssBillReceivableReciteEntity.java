package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * TODO
 * 背书信息
 * @author DongAiHua
 * @Date 2020/7/22 8:59
 */
@Entity
@Table(name = "fss_bill_receivable_recite")
public class FssBillReceivableReciteEntity {
    @Id
    @Column(name = "rr_id")
    private String rrId;/*主建*/
    @Column(name = "rece_id")
    private String receId;/*票据信息表主建*/
    private String rrType;/*背书类型*/
    private String customerAId;/*背书人编码*/
    private String customerAName;/*背书人名称*/
    private BigDecimal rrSumMoney; /*背书金额*/
    private String rrCBankName; /*背书银行名称*/
    private String rrCNumber; /*背书人银行账户*/
    private String rrCBankId; /*背书人银行id*/
    private Date rrDate; /*背书时间*/
    private String rrForm; /*背书形式*/
    private String rrFormNumber; /*背书形式编号*/
    private String rrNumber; /*背书编号*/
    private String paymentInNumber; /*付款实例号*/
    private BigDecimal paymentInMoney; /*付款实例号应付金额*/
    private String cpdingProcedure; /*对应手续*/
    private String handoverPerson; /*交接人名称*/
    private String handoverPersoId; /*交接人id handover_perso_id*/
    private String remarks; /*背书备注*/
    private String customerBId; /*被背书人id*/
    private String customerBName; /*被背书人名称*/
    private String rrCbBankName; /*被背书人银行*/
    private String rrCbBankId; /*被背书人银行id*/
    private String rrCbNumber;/*被背书人银行账号*/
    private String upRrType; /*上手背书类型*/
    private String upCustomerId; /*上手背书人id*/
    private String upCustomerName; /*上手背书人名称*/

    private String rrPrctr; /*支出利润中心编码*/
    private String rrLtext; /*支出利润中心名称*/

    public BigDecimal getPaymentInMoney() {
        return paymentInMoney;
    }

    public void setPaymentInMoney(BigDecimal paymentInMoney) {
        this.paymentInMoney = paymentInMoney;
    }

    public BigDecimal getRrSumMoney() {
        return rrSumMoney;
    }

    public void setRrSumMoney(BigDecimal rrSumMoney) {
        this.rrSumMoney = rrSumMoney;
    }

    public String getRrPrctr() {
        return rrPrctr;
    }

    public void setRrPrctr(String rrPrctr) {
        this.rrPrctr = rrPrctr;
    }

    public String getRrLtext() {
        return rrLtext;
    }

    public void setRrLtext(String rrLtext) {
        this.rrLtext = rrLtext;
    }

    public String getUpRrType() {
        return upRrType;
    }

    public void setUpRrType(String upRrType) {
        this.upRrType = upRrType;
    }

    public String getUpCustomerId() {
        return upCustomerId;
    }

    public void setUpCustomerId(String upCustomerId) {
        this.upCustomerId = upCustomerId;
    }

    public String getUpCustomerName() {
        return upCustomerName;
    }

    public void setUpCustomerName(String upCustomerName) {
        this.upCustomerName = upCustomerName;
    }

    public String getRrType() {
        return rrType;
    }

    public void setRrType(String rrType) {
        this.rrType = rrType;
    }

    public String getRrId() {
        return rrId;
    }

    public void setRrId(String rrId) {
        this.rrId = rrId;
    }

    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }

    public String getCustomerAId() {
        return customerAId;
    }

    public void setCustomerAId(String customerAId) {
        this.customerAId = customerAId;
    }

    public String getCustomerAName() {
        return customerAName;
    }

    public void setCustomerAName(String customerAName) {
        this.customerAName = customerAName;
    }


    public String getRrCBankName() {
        return rrCBankName;
    }

    public void setRrCBankName(String rrCBankName) {
        this.rrCBankName = rrCBankName;
    }

    public String getRrCNumber() {
        return rrCNumber;
    }

    public void setRrCNumber(String rrCNumber) {
        this.rrCNumber = rrCNumber;
    }

    public String getRrCBankId() {
        return rrCBankId;
    }

    public void setRrCBankId(String rrCBankId) {
        this.rrCBankId = rrCBankId;
    }

    public Date getRrDate() {
        return rrDate;
    }

    public void setRrDate(Date rrDate) {
        this.rrDate = rrDate;
    }

    public String getRrForm() {
        return rrForm;
    }

    public void setRrForm(String rrForm) {
        this.rrForm = rrForm;
    }

    public String getRrFormNumber() {
        return rrFormNumber;
    }

    public void setRrFormNumber(String rrFormNumber) {
        this.rrFormNumber = rrFormNumber;
    }

    public String getRrNumber() {
        return rrNumber;
    }

    public void setRrNumber(String rrNumber) {
        this.rrNumber = rrNumber;
    }

    public String getPaymentInNumber() {
        return paymentInNumber;
    }

    public void setPaymentInNumber(String paymentInNumber) {
        this.paymentInNumber = paymentInNumber;
    }

    public String getCpdingProcedure() {
        return cpdingProcedure;
    }

    public void setCpdingProcedure(String cpdingProcedure) {
        this.cpdingProcedure = cpdingProcedure;
    }

    public String getHandoverPerson() {
        return handoverPerson;
    }

    public void setHandoverPerson(String handoverPerson) {
        this.handoverPerson = handoverPerson;
    }

    public String getHandoverPersoId() {
        return handoverPersoId;
    }

    public void setHandoverPersoId(String handoverPersoId) {
        this.handoverPersoId = handoverPersoId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCustomerBId() {
        return customerBId;
    }

    public void setCustomerBId(String customerBId) {
        this.customerBId = customerBId;
    }

    public String getCustomerBName() {
        return customerBName;
    }

    public void setCustomerBName(String customerBName) {
        this.customerBName = customerBName;
    }

    public String getRrCbBankName() {
        return rrCbBankName;
    }

    public void setRrCbBankName(String rrCbBankName) {
        this.rrCbBankName = rrCbBankName;
    }

    public String getRrCbBankId() {
        return rrCbBankId;
    }

    public void setRrCbBankId(String rrCbBankId) {
        this.rrCbBankId = rrCbBankId;
    }

    public String getRrCbNumber() {
        return rrCbNumber;
    }

    public void setRrCbNumber(String rrCbNumber) {
        this.rrCbNumber = rrCbNumber;
    }

    @Override
    public String toString() {
        return "FssBillReceivableReciteEntity{" +
                "rrId='" + rrId + '\'' +
                ", receId='" + receId + '\'' +
                ", customerAId='" + customerAId + '\'' +
                ", customerAName='" + customerAName + '\'' +
                ", rrSumMoney='" + rrSumMoney + '\'' +
                ", rrCBankName='" + rrCBankName + '\'' +
                ", rrCNumber='" + rrCNumber + '\'' +
                ", rrCBankId='" + rrCBankId + '\'' +
                ", rrDate=" + rrDate +
                ", rrForm='" + rrForm + '\'' +
                ", rrFormNumber='" + rrFormNumber + '\'' +
                ", rrNumber='" + rrNumber + '\'' +
                ", paymentInNumber='" + paymentInNumber + '\'' +
                ", cpdingProcedure='" + cpdingProcedure + '\'' +
                ", handoverPerson='" + handoverPerson + '\'' +
                ", handoverPersoId='" + handoverPersoId + '\'' +
                ", remarks='" + remarks + '\'' +
                ", customerBId='" + customerBId + '\'' +
                ", customerBName='" + customerBName + '\'' +
                ", rrCbBankName='" + rrCbBankName + '\'' +
                ", rrCbBankId='" + rrCbBankId + '\'' +
                ", rrCbNumber='" + rrCbNumber + '\'' +
                '}';
    }
}
