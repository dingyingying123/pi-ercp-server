package cn.com.personnel.ercp.pi.persistence.entity.loan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_loan_contract_repayment_item")
public class FssLoanContractRepaymentItem {
    /**
     * 主键id
     */
    @Id
    @Column(name = "item_id")
    @GeneratedValue(generator = "JDBC")
    private String itemId;

    /**
     * 还款计划
     */
    @Column(name = "repayment_plan")
    private String repaymentPlan;

    /**
     * 计划余额
     */
    @Column(name = "plan_balance")
    private String planBalance;

    /**
     * 借据信息
     */
    @Column(name = "iou_message")
    private String iouMessage;

    /**
     * 借据余额
     */
    @Column(name = "iou_balance")
    private BigDecimal iouBalance;

    /**
     * 本次还款
     */
    @Column(name = "this_repayment_amount")
    private BigDecimal thisRepaymentAmount;

    /**
     * 折后金额（元）
     */
    @Column(name = "after_discount_amount")
    private BigDecimal afterDiscountAmount;
    /**
     * 还款计划id
     */
    @Column(name = "repayment_plan_id")
    private String repaymentPlanId;
    /**
     * 借据id
     */
    @Column(name = "iou_id")
    private String iouId;
    /**
     * 主表id
     */
    @Column(name = "main_id")
    private String mainId;

    /**
     * 乐观锁
     */
    private Integer revision;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 提前还款申请单号
     */
    @Column(name = "apply_no")
    private String applyNo;

    /**
     * 申请还款金额
     */
    @Column(name = "apply_repayment_amount")
    private BigDecimal applyRepaymentAmount;

    /**
     * 该申请剩余还款金额
     */
    @Column(name = "surplus_apply_repayment_amount")
    private BigDecimal surplusApplyRepaymentAmount;

    /**
     * 还款类型
     */
    @Column(name = "repayment_type")
    private String repaymentType;

    /**
     * 利息结清方式
     */
    @Column(name = "interest_settle_way")
    private String interestSettleWay;

    /**
     * 参加行
     */
    @Column(name = "participate_bank")
    private String participateBank;

    /**
     * 银行账号
     */
    @Column(name = "bank_account")
    private String bankAccount;

    /**
     * 合同主键id
     */
    @Column(name = "manage_id")
    private String manageId;
    /**
     * 银行分行ID
     */
    @Column(name = "branch_id")
    private String branchId;

    /**
     * 银行分行编码
     */
    @Column(name = "branch_code")
    private String branchCode;
    /**
     * 借据信息加银行编号方便前端交互
     */
    @Column(name = "random_id")
    private String randomId;

    /**
     * 还款日期
     */
    @Column(name = "repayment_date")
    private Date repaymentDate;

    /**
     * 银团ID
     */
    @Column(name="manage_syndicated_id")
    private String manageSyndicatedId;

    /**
     * 还款计划日期
     */
    @Column(name="plan_date")
    private Date planDate;

    /**
     * 还款计划描述
     */
    @Column(name="plan")
    private String plan;

    /**
     * 还款户
     */
    @Column(name = "still_bank_account")
    private String stillBankAccount;

    /**
     * 获取主键id
     *
     * @return item_id - 主键id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置主键id
     *
     * @param itemId 主键id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取还款计划
     *
     * @return repayment_plan - 还款计划
     */
    public String getRepaymentPlan() {
        return repaymentPlan;
    }

    /**
     * 设置还款计划
     *
     * @param repaymentPlan 还款计划
     */
    public void setRepaymentPlan(String repaymentPlan) {
        this.repaymentPlan = repaymentPlan;
    }

    /**
     * 获取计划余额
     *
     * @return plan_balance - 计划余额
     */
    public String getPlanBalance() {
        return planBalance;
    }

    /**
     * 设置计划余额
     *
     * @param planBalance 计划余额
     */
    public void setPlanBalance(String planBalance) {
        this.planBalance = planBalance;
    }

    /**
     * 获取借据信息
     *
     * @return iou_message - 借据信息
     */
    public String getIouMessage() {
        return iouMessage;
    }

    /**
     * 设置借据信息
     *
     * @param iouMessage 借据信息
     */
    public void setIouMessage(String iouMessage) {
        this.iouMessage = iouMessage;
    }

    /**
     * 获取借据余额
     *
     * @return iou_balance - 借据余额
     */
    public BigDecimal getIouBalance() {
        return iouBalance;
    }

    public String getRandomId() {
        return randomId;
    }

    public void setRandomId(String randomId) {
        this.randomId = randomId;
    }

    /**
     * 设置借据余额
     *
     * @param iouBalance 借据余额
     */
    public void setIouBalance(BigDecimal iouBalance) {
        this.iouBalance = iouBalance;
    }

    /**
     * 获取本次还款
     *
     * @return this_repayment_amount - 本次还款
     */
    public BigDecimal getThisRepaymentAmount() {
        return thisRepaymentAmount;
    }

    /**
     * 设置本次还款
     *
     * @param thisRepaymentAmount 本次还款
     */
    public void setThisRepaymentAmount(BigDecimal thisRepaymentAmount) {
        this.thisRepaymentAmount = thisRepaymentAmount;
    }

    /**
     * 获取折后金额（元）
     *
     * @return after_discount_amount - 折后金额（元）
     */
    public BigDecimal getAfterDiscountAmount() {
        return afterDiscountAmount;
    }

    /**
     * 设置折后金额（元）
     *
     * @param afterDiscountAmount 折后金额（元）
     */
    public void setAfterDiscountAmount(BigDecimal afterDiscountAmount) {
        this.afterDiscountAmount = afterDiscountAmount;
    }

    /**
     * 获取主表id
     *
     * @return main_id - 主表id
     */
    public String getMainId() {
        return mainId;
    }

    /**
     * 设置主表id
     *
     * @param mainId 主表id
     */
    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    /**
     * 获取乐观锁
     *
     * @return revision - 乐观锁
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * 设置乐观锁
     *
     * @param revision 乐观锁
     */
    public void setRevision(Integer revision) {
        this.revision = revision;
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
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 获取提前还款申请单号
     *
     * @return apply_no - 提前还款申请单号
     */
    public String getApplyNo() {
        return applyNo;
    }

    /**
     * 设置提前还款申请单号
     *
     * @param applyNo 提前还款申请单号
     */
    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getManageId() {
        return manageId;
    }

    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    /**
     * 获取申请还款金额
     *
     * @return apply_repayment_amount - 申请还款金额
     */
    public BigDecimal getApplyRepaymentAmount() {
        return applyRepaymentAmount;
    }

    /**
     * 设置申请还款金额
     *
     * @param applyRepaymentAmount 申请还款金额
     */
    public void setApplyRepaymentAmount(BigDecimal applyRepaymentAmount) {
        this.applyRepaymentAmount = applyRepaymentAmount;
    }

    /**
     * 获取该申请剩余还款金额
     *
     * @return surplus_apply_repayment_amount - 该申请剩余还款金额
     */
    public BigDecimal getSurplusApplyRepaymentAmount() {
        return surplusApplyRepaymentAmount;
    }

    /**
     * 设置该申请剩余还款金额
     *
     * @param surplusApplyRepaymentAmount 该申请剩余还款金额
     */
    public void setSurplusApplyRepaymentAmount(BigDecimal surplusApplyRepaymentAmount) {
        this.surplusApplyRepaymentAmount = surplusApplyRepaymentAmount;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    public String getInterestSettleWay() {
        return interestSettleWay;
    }

    public void setInterestSettleWay(String interestSettleWay) {
        this.interestSettleWay = interestSettleWay;
    }

    public String getRepaymentPlanId() {
        return repaymentPlanId;
    }

    public void setRepaymentPlanId(String repaymentPlanId) {
        this.repaymentPlanId = repaymentPlanId;
    }

    public String getIouId() {
        return iouId;
    }

    public String getParticipateBank() {
        return participateBank;
    }

    public void setParticipateBank(String participateBank) {
        this.participateBank = participateBank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public void setIouId(String iouId) {
        this.iouId = iouId;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public String getManageSyndicatedId() {
        return manageSyndicatedId;
    }

    public void setManageSyndicatedId(String manageSyndicatedId) {
        this.manageSyndicatedId = manageSyndicatedId;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getStillBankAccount() {
        return stillBankAccount;
    }

    public void setStillBankAccount(String stillBankAccount) {
        this.stillBankAccount = stillBankAccount;
    }

    @Override
    public String toString(){

        return "[itemId=" + itemId + ", repaymentPlan=" + repaymentPlan + ", participateBank=" + participateBank + ", repaymentDate=" + repaymentDate +
                ", iouId=" + iouId+ ", mainId=" + mainId+ "]";
    }
}