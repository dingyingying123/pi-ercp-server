package cn.com.personnel.ercp.pi.persistence.entity.loan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_loan_contract_actual_repayment_plan")
public class FssLoanContractActualRepaymentPlan {
    /**
     * 主键id
     */
    @Id
    @Column(name = "actual_repayment_id")
    @GeneratedValue(generator = "JDBC")
    private String actualRepaymentId;

    /**
     * 计划日期
     */
    @Column(name = "plan_date")
    private Date planDate;

    /**
     * 实际计划还款金额
     */
    @Column(name = "actual_planned_repayment_amount")
    private BigDecimal actualPlannedRepaymentAmount;

    /**
     * 计划还款金额
     */
    @Column(name = "plan_repayment_amount")
    private BigDecimal planRepaymentAmount;
    /**
     * 主表提款申请id
     */
    @Column(name = "main_id")
    private String mainId;

    /**
     * 合同管理manageId
     */
    @Column(name = "manage_id")
    private String manageId;

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
     * @return actual_repayment_id - 主键id
     */
    public String getActualRepaymentId() {
        return actualRepaymentId;
    }

    /**
     * 设置主键id
     *
     * @param actualRepaymentId 主键id
     */
    public void setActualRepaymentId(String actualRepaymentId) {
        this.actualRepaymentId = actualRepaymentId;
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

    public BigDecimal getActualPlannedRepaymentAmount() {
        return actualPlannedRepaymentAmount;
    }

    public void setActualPlannedRepaymentAmount(BigDecimal actualPlannedRepaymentAmount) {
        this.actualPlannedRepaymentAmount = actualPlannedRepaymentAmount;
    }

    /**
     * 获取主表提款申请id
     *
     * @return main_id - 主表提款申请id
     */
    public String getMainId() {
        return mainId;
    }

    /**
     * 设置主表提款申请id
     *
     * @param mainId 主表提款申请id
     */
    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    /**
     * 获取合同管理manageId
     *
     * @return manage_id - 合同管理manageId
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置合同管理manageId
     *
     * @param manageId 合同管理manageId
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
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

    public BigDecimal getPlanRepaymentAmount() {
        return planRepaymentAmount;
    }

    public void setPlanRepaymentAmount(BigDecimal planRepaymentAmount) {
        this.planRepaymentAmount = planRepaymentAmount;
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