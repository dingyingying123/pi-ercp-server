package cn.com.personnel.ercp.pi.persistence.entity.loan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_loan_contract_manage_syndicated")
public class FssLoanContractManageSyndicated {
    /**
     * 主键id
     */
    @Id
    @Column(name = "manage_syndicated_id")
    @GeneratedValue(generator = "JDBC")
    private String manageSyndicatedId;

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
     * 占比（%）
     */
    private BigDecimal ratio;

    /**
     * 参贷额
     */
    @Column(name = "participate_loan_amount")
    private BigDecimal participateLoanAmount;

    /**
     * 已提款金额
     */
    @Column(name = "total_amount_withdrawn")
    private BigDecimal totalAmountWithdrawn;

    /**
     * 本次申请提款金额
     */
    @Column(name = "this_application_amount")
    private BigDecimal thisApplicationAmount;

    /**
     * 合同管理主键id
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 提款申请主键id
     */
    @Column(name = "draw_apply_id")
    private String drawApplyId;

    /**
     * 借据主键id
     */
    @Column(name = "iou_id")
    private String iouId;

    /**
     * 初始化银团、提款申请、借据数据标识
     */
    @Column(name = "data_flag")
    private String dataFlag;

    /**
     * 提款比例
     */
    @Column(name = "withdraw_ratio")
    private String withdrawRatio;

    /**
     * 银行分行id(包含总行)
     */
    @Column(name = "branch_id")
    private String branchId;

    /**
     * 银行分行编码
     */
    @Column(name = "branch_code")
    private String branchCode;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新者
     */
    private String updater;

    /**
     * 还款户
     */
    @Column(name = "still_bank_account")
    private String stillBankAccount;
    /**
     * 还款户id
     */
    @Column(name = "still_bank_account_id")
    private String stillBankAccountId;

    public String getStillBankAccount() {
        return stillBankAccount;
    }

    public void setStillBankAccount(String stillBankAccount) {
        this.stillBankAccount = stillBankAccount;
    }

    public String getStillBankAccountId() {
        return stillBankAccountId;
    }

    public void setStillBankAccountId(String stillBankAccountId) {
        this.stillBankAccountId = stillBankAccountId;
    }

    /**
     * 获取主键id
     *
     * @return manage_syndicated_id - 主键id
     */
    public String getManageSyndicatedId() {
        return manageSyndicatedId;
    }

    /**
     * 设置主键id
     *
     * @param manageSyndicatedId 主键id
     */
    public void setManageSyndicatedId(String manageSyndicatedId) {
        this.manageSyndicatedId = manageSyndicatedId;
    }

    /**
     * 获取参加行
     *
     * @return participate_bank - 参加行
     */
    public String getParticipateBank() {
        return participateBank;
    }

    /**
     * 设置参加行
     *
     * @param participateBank 参加行
     */
    public void setParticipateBank(String participateBank) {
        this.participateBank = participateBank;
    }

    /**
     * 获取银行账号
     *
     * @return bank_account - 银行账号
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 设置银行账号
     *
     * @param bankAccount 银行账号
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * 获取占比（%）
     *
     * @return ratio - 占比（%）
     */
    public BigDecimal getRatio() {
        return ratio;
    }

    /**
     * 设置占比（%）
     *
     * @param ratio 占比（%）
     */
    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    /**
     * 获取参贷额
     *
     * @return participate_loan_amount - 参贷额
     */
    public BigDecimal getParticipateLoanAmount() {
        return participateLoanAmount;
    }

    /**
     * 设置参贷额
     *
     * @param participateLoanAmount 参贷额
     */
    public void setParticipateLoanAmount(BigDecimal participateLoanAmount) {
        this.participateLoanAmount = participateLoanAmount;
    }

    /**
     * 获取已提款金额
     *
     * @return total_amount_withdrawn - 已提款金额
     */
    public BigDecimal getTotalAmountWithdrawn() {
        return totalAmountWithdrawn;
    }

    /**
     * 设置已提款金额
     *
     * @param totalAmountWithdrawn 已提款金额
     */
    public void setTotalAmountWithdrawn(BigDecimal totalAmountWithdrawn) {
        this.totalAmountWithdrawn = totalAmountWithdrawn;
    }

    /**
     * 获取本次申请提款金额
     *
     * @return this_application_amount - 本次申请提款金额
     */
    public BigDecimal getThisApplicationAmount() {
        return thisApplicationAmount;
    }

    /**
     * 设置本次申请提款金额
     *
     * @param thisApplicationAmount 本次申请提款金额
     */
    public void setThisApplicationAmount(BigDecimal thisApplicationAmount) {
        this.thisApplicationAmount = thisApplicationAmount;
    }

    /**
     * 获取合同管理主键id
     *
     * @return manage_id - 合同管理主键id
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置合同管理主键id
     *
     * @param manageId 合同管理主键id
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    /**
     * 获取提款申请主键id
     *
     * @return draw_apply_id - 提款申请主键id
     */
    public String getDrawApplyId() {
        return drawApplyId;
    }

    /**
     * 设置提款申请主键id
     *
     * @param drawApplyId 提款申请主键id
     */
    public void setDrawApplyId(String drawApplyId) {
        this.drawApplyId = drawApplyId;
    }

    /**
     * 获取借据主键id
     *
     * @return iou_id - 借据主键id
     */
    public String getIouId() {
        return iouId;
    }

    /**
     * 设置借据主键id
     *
     * @param iouId 借据主键id
     */
    public void setIouId(String iouId) {
        this.iouId = iouId;
    }

    /**
     * 获取初始化银团、提款申请、借据数据标识
     *
     * @return data_flag - 初始化银团、提款申请、借据数据标识
     */
    public String getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置初始化银团、提款申请、借据数据标识
     *
     * @param dataFlag 初始化银团、提款申请、借据数据标识
     */
    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag;
    }

    /**
     * 获取提款比例
     *
     * @return withdraw_ratio - 提款比例
     */
    public String getWithdrawRatio() {
        return withdrawRatio;
    }

    /**
     * 设置提款比例
     *
     * @param withdrawRatio 提款比例
     */
    public void setWithdrawRatio(String withdrawRatio) {
        this.withdrawRatio = withdrawRatio;
    }

    /**
     * 获取银行分行id(包含总行)
     *
     * @return branch_id - 银行分行id(包含总行)
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * 设置银行分行id(包含总行)
     *
     * @param branchId 银行分行id(包含总行)
     */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    /**
     * 获取银行分行编码
     *
     * @return branch_code - 银行分行编码
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * 设置银行分行编码
     *
     * @param branchCode 银行分行编码
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }
}