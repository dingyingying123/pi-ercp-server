package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * TODO
 * 票据主表
 * @author DongAiHua
 * @Date 2020/7/22 8:59
 */

@Table(name = "fss_bill_receivable_info" )
public class FssBillReceivableInfoEntity {
    @Id
    @Column(name = "rece_id")
    private String receId;/*主建*/
    @Column(name = "rece_number")
    private String receNumber;/*票据编号*/
    @Column(name = "s_date")
    private Date sDate;/*收票日期*/
    @Column(name = "rece_money")
    private BigDecimal receMoney;/*票据金额*/
    @Column(name = "c_date")
    private Date cDate;/*出票日期*/
    @Column(name = "stop_date")
    private Date stopDate;/*汇票到期日*/
    @Column(name = "rece_state")
    private String receState;/*票据状态*/
    @Column(name = "rece_form")
    private String receForm;/*票据形式*/
    @Column(name = "is_transfer")
    private String isTransfer;/*是否可转让*/
    @Column(name = "is_state")
    private Integer isState;/*是否为零时数据1是0否*/
    @Column(name = "currency")
    private String currency;/*币种*/
    @Column(name = "creator_id")
    private String creatorId;/*创建人id*/
    @Column(name = "creator")
    private String creator;/*创建人*/
    @Column(name = "create_time")
    private Date createTime;/*创建日期*/
    @Column(name = "storage_state")
    private String storageState; /*收存状态*/
    @Column(name = "transfer_id")
    private String transferId; /*调拨单id*/
    @Column(name = "signature_state")
    private String signatureState; /*调拨单签收状态*/
    @Column(name = "bill_id")
    private String billId; /*这个是对应的应付票据的id*/

    @Column(name = "signature_one")
    private String signatureOne; /*这个是第一次背书的id*/
    @Column(name = "signature_two")
    private String signatureTwo; /*这个是第二次背书的id*/
    @Column(name = "signature_all")
    private String signatureAll; /*这个是第三次背书的id*/

    /**
     * 贴现利率
     */
    @Column(name = "discount_rate_self")
    private BigDecimal discountRateSelf;
    @Column(name = "upd_time")
    private Date updTime; /*数据修改时间*/
    @Column(name = "currency_code")
    private String currencyCode; /*币种类型*/
    @Column(name = "company_id")
    private String companyId; /*公司标识*/
    @Column(name = "company_name")
    private String companyName; /*公司名称*/
    @Column(name = "rr_id")
    private String rrId; /*背书表主建*/
    @Column(name = "rd_id")
    private String rdId; /*保存部门主建*/
    @Column(name = "discount_id")
    private String discountId; /*贴现表主键*/
    @Column(name = "acceptor_name")
    private String acceptorName; /*承兑人全称*/
    @Column(name = "acceptor_bank_name")
    private String acceptorBankName; /*承兑人开户行*/
    @Column(name = "acceptor_bank_number")
    private String acceptorBankNumber; /*承兑人开户行行号*/
    @Column(name = "acceptor_bank_car_id")
    private String acceptorBankCarId; /*承兑人账号*/
    @Column(name = "rece_prctr")
    private String recePrctr;/*收入利润中心编码*/
    @Column(name = "rece_ltext")
    private String receLtext;/*收入利润中心名称*/
    @Column(name = "other_money")
    private BigDecimal otherMoney;/*其他综合收益*/
    @Column(name = "updater_id")
    private String updaterId;
    @Column(name = "updater_name")
    private String updaterName;
    @Column(name = "enter_transfer_id")
    private String enterTransferId; /*调入内部调拨单号*/
    /**
     * 发送SAP或CES汇总的状态
     */
    /*认领状态*/
    @Column(name = "claim_status")
    private String claimStatus;
    @Column(name = "summary_id")
    private String summaryId;

    public String getEnterTransferId() {
        return enterTransferId;
    }

    public void setEnterTransferId(String enterTransferId) {
        this.enterTransferId = enterTransferId;
    }

    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    public String getUpdaterName() {
        return updaterName;
    }

    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    public BigDecimal getDiscountRateSelf() {
        return discountRateSelf;
    }

    public void setDiscountRateSelf(BigDecimal discountRateSelf) {
        this.discountRateSelf = discountRateSelf;
    }

    public BigDecimal getOtherMoney() {
        return otherMoney;
    }

    public void setOtherMoney(BigDecimal otherMoney) {
        this.otherMoney = otherMoney;
    }
    public String getSignatureOne() {
        return signatureOne;
    }

    public void setSignatureOne(String signatureOne) {
        this.signatureOne = signatureOne;
    }

    public String getSignatureTwo() {
        return signatureTwo;
    }

    public void setSignatureTwo(String signatureTwo) {
        this.signatureTwo = signatureTwo;
    }

    public String getSignatureAll() {
        return signatureAll;
    }

    public void setSignatureAll(String signatureAll) {
        this.signatureAll = signatureAll;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getRecePrctr() {
        return recePrctr;
    }

    public void setRecePrctr(String recePrctr) {
        this.recePrctr = recePrctr;
    }

    public String getReceLtext() {
        return receLtext;
    }

    public void setReceLtext(String receLtext) {
        this.receLtext = receLtext;
    }

    public String getAcceptorName() {
        return acceptorName;
    }

    public void setAcceptorName(String acceptorName) {
        this.acceptorName = acceptorName;
    }

    public String getAcceptorBankName() {
        return acceptorBankName;
    }

    public void setAcceptorBankName(String acceptorBankName) {
        this.acceptorBankName = acceptorBankName;
    }

    public String getAcceptorBankNumber() {
        return acceptorBankNumber;
    }

    public void setAcceptorBankNumber(String acceptorBankNumber) {
        this.acceptorBankNumber = acceptorBankNumber;
    }

    public String getAcceptorBankCarId() {
        return acceptorBankCarId;
    }

    public void setAcceptorBankCarId(String acceptorBankCarId) {
        this.acceptorBankCarId = acceptorBankCarId;
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public String getSignatureState() {
        return signatureState;
    }

    public void setSignatureState(String signatureState) {
        this.signatureState = signatureState;
    }

    public String getRrId() {
        return rrId;
    }

    public void setRrId(String rrId) {
        this.rrId = rrId;
    }

    public String getRdId() {
        return rdId;
    }

    public void setRdId(String rdId) {
        this.rdId = rdId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getStorageState() {
        return storageState;
    }

    public void setStorageState(String storageState) {
        this.storageState = storageState;
    }

    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }


    public String getReceNumber() {
        return receNumber;
    }

    public void setReceNumber(String receNumber) {
        this.receNumber = receNumber;
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }


    public BigDecimal getReceMoney() {
        return receMoney;
    }

    public void setReceMoney(BigDecimal receMoney) {
        this.receMoney = receMoney;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }



    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }



    public String getReceState() {
        return receState;
    }

    public void setReceState(String receState) {
        this.receState = receState;
    }



    public String getReceForm() {
        return receForm;
    }

    public void setReceForm(String receForm) {
        this.receForm = receForm;
    }



    public String getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(String isTransfer) {
        this.isTransfer = isTransfer;
    }


    public Integer getIsState() {
        return isState;
    }

    public void setIsState(Integer isState) {
        this.isState = isState;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }



    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }



    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }



    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getSummaryId() {
        return summaryId;
    }

    public void setSummaryId(String summaryId) {
        this.summaryId = summaryId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(receId, receNumber, sDate, receMoney, cDate, stopDate, receState, receForm, isTransfer, isState, currency, creatorId, creator, createTime, storageState, transferId, signatureState, billId, signatureOne, signatureTwo, signatureAll, discountRateSelf, updTime, currencyCode, companyId, companyName, rrId, rdId, discountId, acceptorName, acceptorBankName, acceptorBankNumber, acceptorBankCarId, recePrctr, receLtext, otherMoney, updaterId, updaterName, enterTransferId, claimStatus, summaryId);
    }

    @Override
    public String toString() {
        return "FssBillReceivableInfoEntity{" +
                "receId='" + receId + '\'' +
                ", receNumber='" + receNumber + '\'' +
                ", sDate=" + sDate +
                ", receMoney=" + receMoney +
                ", cDate=" + cDate +
                ", stopDate=" + stopDate +
                ", receState='" + receState + '\'' +
                ", receForm='" + receForm + '\'' +
                ", isTransfer='" + isTransfer + '\'' +
                ", isState=" + isState +
                ", currency='" + currency + '\'' +
                ", creatorId='" + creatorId + '\'' +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", storageState='" + storageState + '\'' +
                ", transferId='" + transferId + '\'' +
                ", signatureState='" + signatureState + '\'' +
                ", billId='" + billId + '\'' +
                ", signatureOne='" + signatureOne + '\'' +
                ", signatureTwo='" + signatureTwo + '\'' +
                ", signatureAll='" + signatureAll + '\'' +
                ", discountRateSelf=" + discountRateSelf +
                ", updTime=" + updTime +
                ", currencyCode='" + currencyCode + '\'' +
                ", companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", rrId='" + rrId + '\'' +
                ", rdId='" + rdId + '\'' +
                ", discountId='" + discountId + '\'' +
                ", acceptorName='" + acceptorName + '\'' +
                ", acceptorBankName='" + acceptorBankName + '\'' +
                ", acceptorBankNumber='" + acceptorBankNumber + '\'' +
                ", acceptorBankCarId='" + acceptorBankCarId + '\'' +
                ", recePrctr='" + recePrctr + '\'' +
                ", receLtext='" + receLtext + '\'' +
                ", otherMoney=" + otherMoney +
                ", updaterId='" + updaterId + '\'' +
                ", updaterName='" + updaterName + '\'' +
                ", enterTransferId='" + enterTransferId + '\'' +
                ", claimStatus='" + claimStatus + '\'' +
                ", summaryId='" + summaryId + '\'' +
                '}';
    }
}
