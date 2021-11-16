package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bond_repayment_plan")
public class FssBondRepaymentPlan {
    @Column(name = "plan_id")
    @GeneratedValue(generator = "JDBC")
    @Id
    private String planId;

    /**
     * 计划还款金额的合计数(计划合计)
     */
    @Column(name = "total_plan")
    private BigDecimal totalPlan;

    /**
     * 计划日期
     */
    @Column(name = "plan_date")
    private String planDate;

    /**
     * 计划还款金额
     */
    @Column(name = "plan_repayment_amount")
    private BigDecimal planRepaymentAmount;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新者
     */
    private String updater;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 发行id
     */
    @Column(name = "dw_id")
    private String dwId;

    /**
     * @return plan_id
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * @param planId
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * 获取计划还款金额的合计数(计划合计)
     *
     * @return total_plan - 计划还款金额的合计数(计划合计)
     */
    public BigDecimal getTotalPlan() {
        return totalPlan;
    }

    /**
     * 设置计划还款金额的合计数(计划合计)
     *
     * @param totalPlan 计划还款金额的合计数(计划合计)
     */
    public void setTotalPlan(BigDecimal totalPlan) {
        this.totalPlan = totalPlan;
    }

    /**
     * 获取计划日期
     *
     * @return plan_date - 计划日期
     */
    public String getPlanDate() {
        return planDate;
    }

    /**
     * 设置计划日期
     *
     * @param planDate 计划日期
     */
    public void setPlanDate(String planDate) {
        this.planDate = planDate;
    }

    /**
     * 获取计划还款金额
     *
     * @return plan_repayment_amount - 计划还款金额
     */
    public BigDecimal getPlanRepaymentAmount() {
        return planRepaymentAmount;
    }

    /**
     * 设置计划还款金额
     *
     * @param planRepaymentAmount 计划还款金额
     */
    public void setPlanRepaymentAmount(BigDecimal planRepaymentAmount) {
        this.planRepaymentAmount = planRepaymentAmount;
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
     * 获取发行id
     *
     * @return dw_id - 发行id
     */
    public String getDwId() {
        return dwId;
    }

    /**
     * 设置发行id
     *
     * @param dwId 发行id
     */
    public void setDwId(String dwId) {
        this.dwId = dwId;
    }
}