package cn.com.personnel.ercp.pi.persistence.entity.bill;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class FssBillInfoReminder {
    private String companyName;
    private String billNumber;
    private String payee;
    private String payeeAccount;
    private String drawerAmount;

    private Date draftStart;
    private Date moneyorderStop;
   private int days;

    @Override
    public String toString() {
        return "FssBillInfoReminder{" +
                "companyName='" + companyName + '\'' +
                ", billNumber='" + billNumber + '\'' +
                ", payee='" + payee + '\'' +
                ", payeeAccount='" + payeeAccount + '\'' +
                ", drawerAmount='" + drawerAmount + '\'' +
                ", draftStart=" + draftStart +
                ", moneyorderStop=" + moneyorderStop +
                ", days=" + days +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getPayeeAccount() {
        return payeeAccount;
    }

    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
    }

    public String getDrawerAmount() {
        return drawerAmount;
    }

    public void setDrawerAmount(String drawerAmount) {
        this.drawerAmount = drawerAmount;
    }

    public Date getDraftStart() {
        return draftStart;
    }

    public void setDraftStart(Date draftStart) {
        this.draftStart = draftStart;
    }

    public Date getMoneyorderStop() {
        return moneyorderStop;
    }

    public void setMoneyorderStop(Date moneyorderStop) {
        this.moneyorderStop = moneyorderStop;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
