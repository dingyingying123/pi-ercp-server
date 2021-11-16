package cn.com.personnel.ercp.pi.persistence.entity.loan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_loan_contract_repayment_plan")
public class FssLoanContractRepaymentPlan {
    /**
     * 主键id
     */
    @Id
    @Column(name = "repayment_id")
    @GeneratedValue(generator = "JDBC")
    private String repaymentId;

    /**
     * 计划日期
     */
    @Column(name = "plan_date")
    private Date planDate;

    /**
     * 计划还款金额
     */
    @Column(name = "plan_repayment_amount")
    private BigDecimal planRepaymentAmount;

    /**
     * 实际计划还款金额
     */
    @Column(name = "actual_planned_repayment_amount")
    private BigDecimal actualPlannedRepaymentAmount;

    /**
     * 已还款金额
     */
    @Column(name = "repayment_amount")
    private BigDecimal repaymentAmount;

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
     * 乐观锁
     */
    private Integer version;

    /**
     * 贷款机构ID
     */
    @Column(name = "branch_id")
    private String branchId;

    /**
     * 贷款机构
     */
    @Column(name = "branch_name")
    private String branchName;

    /**
     * 获取主键id
     *
     * @return repayment_id - 主键id
     */
    public String getRepaymentId() {
        return repaymentId;
    }

    /**
     * 设置主键id
     *
     * @param repaymentId 主键id
     */
    public void setRepaymentId(String repaymentId) {
        this.repaymentId = repaymentId;
    }

    /**
     * 获取计划日期
     *
     * @return plan_date - 计划日期
     */
    public Date getPlanDate() {
        return planDate;
    }

    /**
     * 设置计划日期
     *
     * @param planDate 计划日期
     */
    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public BigDecimal getPlanRepaymentAmount() {
        return planRepaymentAmount;
    }

    public void setPlanRepaymentAmount(BigDecimal planRepaymentAmount) {
        this.planRepaymentAmount = planRepaymentAmount;
    }

    /**
     * 获取实际计划还款金额
     *
     * @return actual_planned_repayment_amount - 实际计划还款金额
     */
    public BigDecimal getActualPlannedRepaymentAmount() {
        return actualPlannedRepaymentAmount;
    }

    /**
     * 设置实际计划还款金额
     *
     * @param actualPlannedRepaymentAmount 实际计划还款金额
     */
    public void setActualPlannedRepaymentAmount(BigDecimal actualPlannedRepaymentAmount) {
        this.actualPlannedRepaymentAmount = actualPlannedRepaymentAmount;
    }

    /**
     * 获取已还款金额
     *
     * @return repayment_amount - 已还款金额
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * 设置已还款金额
     *
     * @param repaymentAmount 已还款金额
     */
    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
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

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}