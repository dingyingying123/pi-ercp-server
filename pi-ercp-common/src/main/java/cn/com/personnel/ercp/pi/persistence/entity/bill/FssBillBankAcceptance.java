package cn.com.personnel.ercp.pi.persistence.entity.bill;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
@Table(name = "fss_bill_bank_acceptance")
public class FssBillBankAcceptance {
  @Id
  @Column(name = "accep_id")
  @GeneratedValue(generator = "JDBC")
  private String accepId;
  @Column(name = "apply_number")
  private String applyNumber;
  @Column(name = "apply_date")
  private Date applyDate;
  @Column(name = "proposer_id")
  private String proposerId;
  @Column(name = "proposer")
  private String proposer;
  @Column(name = "apply_part_id")
  private String applyPartId;
  @Column(name = "apply_part")
  private String applyPart;
  @Column(name = "company_id")
  private String companyId;
  @Column(name = "company_name")
  private String companyName;
  @Column(name = "bank_id")
  private String bankId;
  @Column(name = "bank_name")
  private String bankName;
  @Column(name = "bank_account")
  private String bankAccount;
  @Column(name = "bill_money")
  private BigDecimal billMoney;
  @Column(name = "bill_form")
  private String billForm;
  @Column(name = "bill_rate")
  private Double billRate;
  @Column(name = "estimate_money")
  private BigDecimal estimateMoney;
  @Column(name = "bill_term")
  private Integer billTerm;
  @Column(name = "bill_start_date")
  private String billStartDate;
  @Column(name = "bill_end_date")
  private String billEndDate;
  @Column(name = "is_transfer")
  private String isTransfer;
  @Column(name = "is_bill_pool")
  private String isBillPool;
  @Column(name = "remarks_text")
  private String remarksText;
  @Column(name = "apply_staue")
  private String applyStaue;
  @Column(name = "approval_staus")
  private String approvalStaus;
  @Column(name = "approval_date")
  private Date approvalDate;
  @Column(name = "approval_id")
  private String approvalId;
  @Column(name = "creator_id")
  private String creatorId;
  @Column(name = "creator_name")
  private String creatorName;
  @Column(name = "create_time")
  private Date createTime;
  @Column(name = "updater_id")
  private String updaterId;
  @Column(name = "updater_name")
  private String updaterName;
  @Column(name = "update_time")
  private Date updateTime;



  public String getAccepId() {
    return accepId;
  }

  public void setAccepId(String accepId) {
    this.accepId = accepId;
  }

  public String getApplyNumber() {
    return applyNumber;
  }

  public void setApplyNumber(String applyNumber) {
    this.applyNumber = applyNumber;
  }

  public Date getApplyDate() {
    return applyDate;
  }

  public void setApplyDate(Date applyDate) {
    this.applyDate = applyDate;
  }

  public String getProposerId() {
    return proposerId;
  }

  public void setProposerId(String proposerId) {
    this.proposerId = proposerId;
  }

  public String getProposer() {
    return proposer;
  }

  public void setProposer(String proposer) {
    this.proposer = proposer;
  }

  public String getApplyPartId() {
    return applyPartId;
  }

  public void setApplyPartId(String applyPartId) {
    this.applyPartId = applyPartId;
  }

  public String getApplyPart() {
    return applyPart;
  }

  public void setApplyPart(String applyPart) {
    this.applyPart = applyPart;
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

  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public String getBillForm() {
    return billForm;
  }

  public void setBillForm(String billForm) {
    this.billForm = billForm;
  }

  public Double getBillRate() {
    return billRate;
  }

  public void setBillRate(Double billRate) {
    this.billRate = billRate;
  }

  public BigDecimal getBillMoney() {
    return billMoney;
  }

  public void setBillMoney(BigDecimal billMoney) {
    this.billMoney = billMoney;
  }

  public BigDecimal getEstimateMoney() {
    return estimateMoney;
  }

  public void setEstimateMoney(BigDecimal estimateMoney) {
    this.estimateMoney = estimateMoney;
  }

  public Integer getBillTerm() {
    return billTerm;
  }

  public void setBillTerm(Integer billTerm) {
    this.billTerm = billTerm;
  }

  public String getBillStartDate() {
    return billStartDate;
  }

  public void setBillStartDate(String billStartDate) {
    this.billStartDate = billStartDate;
  }

  public String getBillEndDate() {
    return billEndDate;
  }

  public void setBillEndDate(String billEndDate) {
    this.billEndDate = billEndDate;
  }

  public String getIsTransfer() {
    return isTransfer;
  }

  public void setIsTransfer(String isTransfer) {
    this.isTransfer = isTransfer;
  }

  public String getIsBillPool() {
    return isBillPool;
  }

  public void setIsBillPool(String isBillPool) {
    this.isBillPool = isBillPool;
  }

  public String getRemarksText() {
    return remarksText;
  }

  public void setRemarksText(String remarksText) {
    this.remarksText = remarksText;
  }

  public String getApplyStaue() {
    return applyStaue;
  }

  public void setApplyStaue(String applyStaue) {
    this.applyStaue = applyStaue;
  }

  public String getApprovalStaus() {
    return approvalStaus;
  }

  public void setApprovalStaus(String approvalStaus) {
    this.approvalStaus = approvalStaus;
  }

  public Date getApprovalDate() {
    return approvalDate;
  }

  public void setApprovalDate(Date approvalDate) {
    this.approvalDate = approvalDate;
  }

  public String getApprovalId() {
    return approvalId;
  }

  public void setApprovalId(String approvalId) {
    this.approvalId = approvalId;
  }

  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public String getCreatorName() {
    return creatorName;
  }

  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
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

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}
