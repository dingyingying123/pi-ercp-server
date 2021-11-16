package cn.com.personnel.ercp.pi.persistence.entity.loan;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_loan_contract_distribution")
public class FssSignLoanContractDistribution {
    /**
     * 分销主键id
     */
    @Id
    @Column(name = "distribution_id")
    @GeneratedValue(generator = "JDBC")
    private String distributionId;

    /**
     * 分销银行
     */
    @Column(name = "distribution_bank")
    private String distributionBank;

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
     * 分销额度
     */
    @Column(name = "distribution_amount")
    private BigDecimal distributionAmount;

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
     * 银行分行ID
     */
    @Column(name = "branch_id")
    private String branchId;

    /**
     * 银行编码
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
     * 获取分销主键id
     *
     * @return distribution_id - 分销主键id
     */
    public String getDistributionId() {
        return distributionId;
    }

    /**
     * 设置分销主键id
     *
     * @param distributionId 分销主键id
     */
    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * 获取分销银行
     *
     * @return distribution_bank - 分销银行
     */
    public String getDistributionBank() {
        return distributionBank;
    }

    /**
     * 设置分销银行
     *
     * @param distributionBank 分销银行
     */
    public void setDistributionBank(String distributionBank) {
        this.distributionBank = distributionBank;
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
     * 获取分销额度
     *
     * @return distribution_amount - 分销额度
     */
    public BigDecimal getDistributionAmount() {
        return distributionAmount;
    }

    /**
     * 设置分销额度
     *
     * @param distributionAmount 分销额度
     */
    public void setDistributionAmount(BigDecimal distributionAmount) {
        this.distributionAmount = distributionAmount;
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
     * 获取银行编码
     *
     * @return branch_code - 银行编码
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * 设置银行编码
     *
     * @param branchCode 银行编码
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
}