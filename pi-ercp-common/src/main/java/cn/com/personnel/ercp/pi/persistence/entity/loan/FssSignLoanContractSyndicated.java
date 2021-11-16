package cn.com.personnel.ercp.pi.persistence.entity.loan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_loan_contract_syndicated")
public class FssSignLoanContractSyndicated {
    /**
     * 银团贷主键id
     */
    @Id
    @Column(name = "syndicated_id")
    @GeneratedValue(generator = "JDBC")
    private String syndicatedId;

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
     * 主表id
     */
    @Column(name = "main_id")
    private String mainId;

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
     * 逻辑删除
     */
    private String deleted;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 是否分销
     */
    @Column(name = "if_distribution")
    private String ifDistribution;

    /**
     * 本次申请金额
     */
    @Column(name = "this_application_amount")
    private BigDecimal thisApplicationAmount;

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
     * 获取银团贷主键id
     *
     * @return syndicated_id - 银团贷主键id
     */
    public String getSyndicatedId() {
        return syndicatedId;
    }

    /**
     * 设置银团贷主键id
     *
     * @param syndicatedId 银团贷主键id
     */
    public void setSyndicatedId(String syndicatedId) {
        this.syndicatedId = syndicatedId;
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
     * 获取创建者
     *
     * @return creator - 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator 创建者
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
     * 获取更新者
     *
     * @return updater - 更新者
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设置更新者
     *
     * @param updater 更新者
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * 获取逻辑删除
     *
     * @return deleted - 逻辑删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置逻辑删除
     *
     * @param deleted 逻辑删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取乐观锁
     *
     * @return version - 乐观锁
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置乐观锁
     *
     * @param version 乐观锁
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取是否分销
     *
     * @return if_distribution - 是否分销
     */
    public String getIfDistribution() {
        return ifDistribution;
    }

    /**
     * 设置是否分销
     *
     * @param ifDistribution 是否分销
     */
    public void setIfDistribution(String ifDistribution) {
        this.ifDistribution = ifDistribution;
    }

    /**
     * 获取本次申请金额
     *
     * @return this_application_amount - 本次申请金额
     */
    public BigDecimal getThisApplicationAmount() {
        return thisApplicationAmount;
    }

    /**
     * 设置本次申请金额
     *
     * @param thisApplicationAmount 本次申请金额
     */
    public void setThisApplicationAmount(BigDecimal thisApplicationAmount) {
        this.thisApplicationAmount = thisApplicationAmount;
    }

    /**
     * 获取银行分行ID
     *
     * @return branch_id - 银行分行ID
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * 设置银行分行ID
     *
     * @param branchId 银行分行ID
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
}