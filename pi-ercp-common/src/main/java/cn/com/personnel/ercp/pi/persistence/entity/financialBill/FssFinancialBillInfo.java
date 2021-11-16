package cn.com.personnel.ercp.pi.persistence.entity.financialBill;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_financial_bill_info")
public class FssFinancialBillInfo {
    /**
     * 财司票据业务申请ID
     */
    @Id
    @Column(name = "fina_id")
    @GeneratedValue(generator = "JDBC")
    private String finaId;

    /**
     * 申请单号
     */
    @Column(name = "apply_number")
    private String applyNumber;

    /**
     * 申请人ID
     */
    @Column(name = "applicant_id")
    private String applicantId;

    /**
     * 申请人姓名
     */
    @Column(name = "applicant_name")
    private String applicantName;

    /**
     * 申请人部门ID
     */
    @Column(name = "applicant_dept_id")
    private String applicantDeptId;

    /**
     * 申请部门
     */
    @Column(name = "applicant_dept")
    private String applicantDept;

    /**
     * 申请时间
     */
    @Column(name = "applicant_date")
    private String applicantDate;

    /**
     * 交易类型
     */
    @Column(name = "trans_type")
    private String transType;

    /**
     * 交易对手
     */
    private String counterparty;

    /**
     * 票面总额
     */
    @Column(name = "total_face_value")
    private BigDecimal totalFaceValue;

    /**
     * 再贴现率
     */
    @Column(name = "rediscount_rate")
    private BigDecimal rediscountRate;

    /**
     * 再贴现起息日
     */
    @Column(name = "rediscount_value_date")
    private String rediscountValueDate;

    /**
     * 再贴现到期日
     */
    @Column(name = "rediscount_maturity_date")
    private String rediscountMaturityDate;

    /**
     * 再贴现利息
     */
    @Column(name = "rediscounted_interest")
    private BigDecimal rediscountedInterest;

    /**
     * 再贴现首期交易金额
     */
    @Column(name = "rediscount_first_transaction_amount")
    private BigDecimal rediscountFirstTransactionAmount;

    /**
     * 再贴现到期交易金额
     */
    @Column(name = "rediscount_maturity_transaction_amount")
    private BigDecimal rediscountMaturityTransactionAmount;

    /**
     * 回购利率
     */
    @Column(name = "repurchase_rate")
    private BigDecimal repurchaseRate;

    /**
     * 首期结算日
     */
    @Column(name = "first_settlement_date")
    private String firstSettlementDate;

    /**
     * 到期结算日
     */
    @Column(name = "maturity_settlement_date")
    private String maturitySettlementDate;

    /**
     * 应付利息
     */
    @Column(name = "interest_payable")
    private BigDecimal interestPayable;

    /**
     * 首期结算金额
     */
    @Column(name = "initial_settlement_amount")
    private BigDecimal initialSettlementAmount;

    /**
     * 到期结算金额
     */
    @Column(name = "settlement_amount_due")
    private BigDecimal settlementAmountDue;

    /**
     * 首期交易利率
     */
    @Column(name = "first_transaction_interest_rate")
    private BigDecimal firstTransactionInterestRate;

    /**
     * 到期交易利率
     */
    @Column(name = "maturity_transaction_interest_rate")
    private BigDecimal maturityTransactionInterestRate;

    /**
     * 首期应付利息
     */
    @Column(name = "initial_interest_payable")
    private BigDecimal initialInterestPayable;

    /**
     * 到期应付利息
     */
    @Column(name = "interest_payable_maturity")
    private BigDecimal interestPayableMaturity;

    /**
     * 回购业务应付利息
     */
    @Column(name = "interest_payable_repurchase_business")
    private BigDecimal interestPayableRepurchaseBusiness;

    /**
     * 流程审批状态
     */
    @Column(name = "approval_status")
    private String approvalStatus;

    /**
     * 流程审批时间
     */
    @Column(name = "approval_time")
    private String approvalTime;

    /**
     * 版本号
     */
    private String version;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 是否删除 0：未删除，1：已删除
     */
    private String deleted;

    /**
     * 预留
     */
    private String reverse;

    /**
     * 获取财司票据业务申请ID
     *
     * @return fina_id - 财司票据业务申请ID
     */
    public String getFinaId() {
        return finaId;
    }

    /**
     * 设置财司票据业务申请ID
     *
     * @param finaId 财司票据业务申请ID
     */
    public void setFinaId(String finaId) {
        this.finaId = finaId;
    }

    /**
     * 获取申请单号
     *
     * @return apply_number - 申请单号
     */
    public String getApplyNumber() {
        return applyNumber;
    }

    /**
     * 设置申请单号
     *
     * @param applyNumber 申请单号
     */
    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
    }

    /**
     * 获取申请人ID
     *
     * @return applicant_id - 申请人ID
     */
    public String getApplicantId() {
        return applicantId;
    }

    /**
     * 设置申请人ID
     *
     * @param applicantId 申请人ID
     */
    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * 获取申请人姓名
     *
     * @return applicant_name - 申请人姓名
     */
    public String getApplicantName() {
        return applicantName;
    }

    /**
     * 设置申请人姓名
     *
     * @param applicantName 申请人姓名
     */
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    /**
     * 获取申请人部门ID
     *
     * @return applicant_dept_id - 申请人部门ID
     */
    public String getApplicantDeptId() {
        return applicantDeptId;
    }

    /**
     * 设置申请人部门ID
     *
     * @param applicantDeptId 申请人部门ID
     */
    public void setApplicantDeptId(String applicantDeptId) {
        this.applicantDeptId = applicantDeptId;
    }

    /**
     * 获取申请部门
     *
     * @return applicant_dept - 申请部门
     */
    public String getApplicantDept() {
        return applicantDept;
    }

    /**
     * 设置申请部门
     *
     * @param applicantDept 申请部门
     */
    public void setApplicantDept(String applicantDept) {
        this.applicantDept = applicantDept;
    }

    /**
     * 获取申请时间
     *
     * @return applicant_date - 申请时间
     */
    public String getApplicantDate() {
        return applicantDate;
    }

    /**
     * 设置申请时间
     *
     * @param applicantDate 申请时间
     */
    public void setApplicantDate(String applicantDate) {
        this.applicantDate = applicantDate;
    }

    /**
     * 获取交易类型
     *
     * @return trans_type - 交易类型
     */
    public String getTransType() {
        return transType;
    }

    /**
     * 设置交易类型
     *
     * @param transType 交易类型
     */
    public void setTransType(String transType) {
        this.transType = transType;
    }

    /**
     * 获取交易对手
     *
     * @return counterparty - 交易对手
     */
    public String getCounterparty() {
        return counterparty;
    }

    /**
     * 设置交易对手
     *
     * @param counterparty 交易对手
     */
    public void setCounterparty(String counterparty) {
        this.counterparty = counterparty;
    }

    /**
     * 获取票面总额
     *
     * @return total_face_value - 票面总额
     */
    public BigDecimal getTotalFaceValue() {
        return totalFaceValue;
    }

    /**
     * 设置票面总额
     *
     * @param totalFaceValue 票面总额
     */
    public void setTotalFaceValue(BigDecimal totalFaceValue) {
        this.totalFaceValue = totalFaceValue;
    }

    /**
     * 获取再贴现率
     *
     * @return rediscount_rate - 再贴现率
     */
    public BigDecimal getRediscountRate() {
        return rediscountRate;
    }

    /**
     * 设置再贴现率
     *
     * @param rediscountRate 再贴现率
     */
    public void setRediscountRate(BigDecimal rediscountRate) {
        this.rediscountRate = rediscountRate;
    }

    /**
     * 获取再贴现起息日
     *
     * @return rediscount_value_date - 再贴现起息日
     */
    public String getRediscountValueDate() {
        return rediscountValueDate;
    }

    /**
     * 设置再贴现起息日
     *
     * @param rediscountValueDate 再贴现起息日
     */
    public void setRediscountValueDate(String rediscountValueDate) {
        this.rediscountValueDate = rediscountValueDate;
    }

    /**
     * 获取再贴现到期日
     *
     * @return rediscount_maturity_date - 再贴现到期日
     */
    public String getRediscountMaturityDate() {
        return rediscountMaturityDate;
    }

    /**
     * 设置再贴现到期日
     *
     * @param rediscountMaturityDate 再贴现到期日
     */
    public void setRediscountMaturityDate(String rediscountMaturityDate) {
        this.rediscountMaturityDate = rediscountMaturityDate;
    }

    /**
     * 获取再贴现利息
     *
     * @return rediscounted_interest - 再贴现利息
     */
    public BigDecimal getRediscountedInterest() {
        return rediscountedInterest;
    }

    /**
     * 设置再贴现利息
     *
     * @param rediscountedInterest 再贴现利息
     */
    public void setRediscountedInterest(BigDecimal rediscountedInterest) {
        this.rediscountedInterest = rediscountedInterest;
    }

    /**
     * 获取再贴现首期交易金额
     *
     * @return rediscount_first_transaction_amount - 再贴现首期交易金额
     */
    public BigDecimal getRediscountFirstTransactionAmount() {
        return rediscountFirstTransactionAmount;
    }

    /**
     * 设置再贴现首期交易金额
     *
     * @param rediscountFirstTransactionAmount 再贴现首期交易金额
     */
    public void setRediscountFirstTransactionAmount(BigDecimal rediscountFirstTransactionAmount) {
        this.rediscountFirstTransactionAmount = rediscountFirstTransactionAmount;
    }

    /**
     * 获取再贴现到期交易金额
     *
     * @return rediscount_maturity_transaction_amount - 再贴现到期交易金额
     */
    public BigDecimal getRediscountMaturityTransactionAmount() {
        return rediscountMaturityTransactionAmount;
    }

    /**
     * 设置再贴现到期交易金额
     *
     * @param rediscountMaturityTransactionAmount 再贴现到期交易金额
     */
    public void setRediscountMaturityTransactionAmount(BigDecimal rediscountMaturityTransactionAmount) {
        this.rediscountMaturityTransactionAmount = rediscountMaturityTransactionAmount;
    }

    /**
     * 获取回购利率
     *
     * @return repurchase_rate - 回购利率
     */
    public BigDecimal getRepurchaseRate() {
        return repurchaseRate;
    }

    /**
     * 设置回购利率
     *
     * @param repurchaseRate 回购利率
     */
    public void setRepurchaseRate(BigDecimal repurchaseRate) {
        this.repurchaseRate = repurchaseRate;
    }

    /**
     * 获取首期结算日
     *
     * @return first_settlement_date - 首期结算日
     */
    public String getFirstSettlementDate() {
        return firstSettlementDate;
    }

    /**
     * 设置首期结算日
     *
     * @param firstSettlementDate 首期结算日
     */
    public void setFirstSettlementDate(String firstSettlementDate) {
        this.firstSettlementDate = firstSettlementDate;
    }

    /**
     * 获取到期结算日
     *
     * @return maturity_settlement_date - 到期结算日
     */
    public String getMaturitySettlementDate() {
        return maturitySettlementDate;
    }

    /**
     * 设置到期结算日
     *
     * @param maturitySettlementDate 到期结算日
     */
    public void setMaturitySettlementDate(String maturitySettlementDate) {
        this.maturitySettlementDate = maturitySettlementDate;
    }

    /**
     * 获取应付利息
     *
     * @return interest_payable - 应付利息
     */
    public BigDecimal getInterestPayable() {
        return interestPayable;
    }

    /**
     * 设置应付利息
     *
     * @param interestPayable 应付利息
     */
    public void setInterestPayable(BigDecimal interestPayable) {
        this.interestPayable = interestPayable;
    }

    /**
     * 获取首期结算金额
     *
     * @return initial_settlement_amount - 首期结算金额
     */
    public BigDecimal getInitialSettlementAmount() {
        return initialSettlementAmount;
    }

    /**
     * 设置首期结算金额
     *
     * @param initialSettlementAmount 首期结算金额
     */
    public void setInitialSettlementAmount(BigDecimal initialSettlementAmount) {
        this.initialSettlementAmount = initialSettlementAmount;
    }

    /**
     * 获取到期结算金额
     *
     * @return settlement_amount_due - 到期结算金额
     */
    public BigDecimal getSettlementAmountDue() {
        return settlementAmountDue;
    }

    /**
     * 设置到期结算金额
     *
     * @param settlementAmountDue 到期结算金额
     */
    public void setSettlementAmountDue(BigDecimal settlementAmountDue) {
        this.settlementAmountDue = settlementAmountDue;
    }

    /**
     * 获取首期交易利率
     *
     * @return first_transaction_interest_rate - 首期交易利率
     */
    public BigDecimal getFirstTransactionInterestRate() {
        return firstTransactionInterestRate;
    }

    /**
     * 设置首期交易利率
     *
     * @param firstTransactionInterestRate 首期交易利率
     */
    public void setFirstTransactionInterestRate(BigDecimal firstTransactionInterestRate) {
        this.firstTransactionInterestRate = firstTransactionInterestRate;
    }

    /**
     * 获取到期交易利率
     *
     * @return maturity_transaction_interest_rate - 到期交易利率
     */
    public BigDecimal getMaturityTransactionInterestRate() {
        return maturityTransactionInterestRate;
    }

    /**
     * 设置到期交易利率
     *
     * @param maturityTransactionInterestRate 到期交易利率
     */
    public void setMaturityTransactionInterestRate(BigDecimal maturityTransactionInterestRate) {
        this.maturityTransactionInterestRate = maturityTransactionInterestRate;
    }

    /**
     * 获取首期应付利息
     *
     * @return initial_interest_payable - 首期应付利息
     */
    public BigDecimal getInitialInterestPayable() {
        return initialInterestPayable;
    }

    /**
     * 设置首期应付利息
     *
     * @param initialInterestPayable 首期应付利息
     */
    public void setInitialInterestPayable(BigDecimal initialInterestPayable) {
        this.initialInterestPayable = initialInterestPayable;
    }

    /**
     * 获取到期应付利息
     *
     * @return interest_payable_maturity - 到期应付利息
     */
    public BigDecimal getInterestPayableMaturity() {
        return interestPayableMaturity;
    }

    /**
     * 设置到期应付利息
     *
     * @param interestPayableMaturity 到期应付利息
     */
    public void setInterestPayableMaturity(BigDecimal interestPayableMaturity) {
        this.interestPayableMaturity = interestPayableMaturity;
    }

    /**
     * 获取回购业务应付利息
     *
     * @return interest_payable_repurchase_business - 回购业务应付利息
     */
    public BigDecimal getInterestPayableRepurchaseBusiness() {
        return interestPayableRepurchaseBusiness;
    }

    /**
     * 设置回购业务应付利息
     *
     * @param interestPayableRepurchaseBusiness 回购业务应付利息
     */
    public void setInterestPayableRepurchaseBusiness(BigDecimal interestPayableRepurchaseBusiness) {
        this.interestPayableRepurchaseBusiness = interestPayableRepurchaseBusiness;
    }

    /**
     * 获取流程审批状态
     *
     * @return approval_status - 流程审批状态
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * 设置流程审批状态
     *
     * @param approvalStatus 流程审批状态
     */
    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    /**
     * 获取流程审批时间
     *
     * @return approval_time - 流程审批时间
     */
    public String getApprovalTime() {
        return approvalTime;
    }

    /**
     * 设置流程审批时间
     *
     * @param approvalTime 流程审批时间
     */
    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新人
     *
     * @return updater - 更新人
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设置更新人
     *
     * @param updater 更新人
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * 获取是否删除 0：未删除，1：已删除
     *
     * @return deleted - 是否删除 0：未删除，1：已删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除 0：未删除，1：已删除
     *
     * @param deleted 是否删除 0：未删除，1：已删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getReverse() {
        return reverse;
    }

    public void setReverse(String reverse) {
        this.reverse = reverse;
    }
}