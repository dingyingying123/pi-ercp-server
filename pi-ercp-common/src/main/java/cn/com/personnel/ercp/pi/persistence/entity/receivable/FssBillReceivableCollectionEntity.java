package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TODO
 * 托收
 * @author DongAiHua
 * @Date 2020/8/1 13:03
 */
@Table(name = "fss_bill_receivable_collection")
public class FssBillReceivableCollectionEntity {
    @Id
    @Column(name = "rece_id")
    @GeneratedValue(generator = "JDBC")
    private String receId; //票据表主建
    @Column(name = "col_date")
    private Date colDate; //托收日期
    @Column(name = "col_bank_id")
    private String colBankId; //托收银行id
    @Column(name = "col_bank_name")
    private String colBankName; //托收银行名称
    @Column(name = "col_bank_number")
    private String colBankNumber; //托收账号
    @Column(name = "col_money")
    private BigDecimal colMoney; //托收金额
    @Column(name = "col_remark")
    private String colRemark; //托收备注
    @Column(name = "group_no")
    private String groupNo;
    @Column(name = "entry_number")
    private String entryNumber;
    @Column(name = "document_no")
    private String documentNo;
    @Column(name = "entry_status")
    private String entryStatus;
    @Column(name = "error_message")
    private String errorMessage;
    @Column(name = "updater")
    private String updater;
    @Column(name = "update_time")
    private Date updateTime;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
    }

    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }

    public Date getColDate() {
        return colDate;
    }

    public void setColDate(Date colDate) {
        this.colDate = colDate;
    }


    public String getColBankId() {
        return colBankId;
    }

    public void setColBankId(String colBankId) {
        this.colBankId = colBankId;
    }

    public String getColBankName() {
        return colBankName;
    }

    public void setColBankName(String colBankName) {
        this.colBankName = colBankName;
    }

    public String getColBankNumber() {
        return colBankNumber;
    }

    public void setColBankNumber(String colBankNumber) {
        this.colBankNumber = colBankNumber;
    }

    public BigDecimal getColMoney() {
        return colMoney;
    }

    public void setColMoney(BigDecimal colMoney) {
        this.colMoney = colMoney;
    }

    public String getColRemark() {
        return colRemark;
    }

    public void setColRemark(String colRemark) {
        this.colRemark = colRemark;
    }
}
