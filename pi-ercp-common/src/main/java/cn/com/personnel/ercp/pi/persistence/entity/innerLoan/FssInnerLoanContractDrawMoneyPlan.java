package cn.com.personnel.ercp.pi.persistence.entity.innerLoan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_inner_loan_contract_draw_money_plan")
public class FssInnerLoanContractDrawMoneyPlan {
    /**
     * 主键id
     */
    @Id
    @Column(name = "draw_id")
    @GeneratedValue(generator = "JDBC")
    private String drawId;

    /**
     * 计划日期
     */
    @Column(name = "plan_date")
    private Date planDate;

    /**
     * 计划提款金额
     */
    @Column(name = "planned_withdrawal_amount")
    private String plannedWithdrawalAmount;

    /**
     * 主表id
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
     * 借款合同名称
     * @return
     */
    @Column(name="contract_name")
    private String contractName;

    /**
     * 获取主键id
     *
     * @return draw_id - 主键id
     */
    public String getDrawId() {
        return drawId;
    }

    /**
     * 设置主键id
     *
     * @param drawId 主键id
     */
    public void setDrawId(String drawId) {
        this.drawId = drawId;
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

    /**
     * 获取计划提款金额
     *
     * @return planned_withdrawal_amount - 计划提款金额
     */
    public String getPlannedWithdrawalAmount() {
        return plannedWithdrawalAmount;
    }

    /**
     * 设置计划提款金额
     *
     * @param plannedWithdrawalAmount 计划提款金额
     */
    public void setPlannedWithdrawalAmount(String plannedWithdrawalAmount) {
        this.plannedWithdrawalAmount = plannedWithdrawalAmount;
    }

    /**
     * 获取主表id
     *
     * @return manage_id - 主表id
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置主表id
     *
     * @param manageId 主表id
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

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }
}