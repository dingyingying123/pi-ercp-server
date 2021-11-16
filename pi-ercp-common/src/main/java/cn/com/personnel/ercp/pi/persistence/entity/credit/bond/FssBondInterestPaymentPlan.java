package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bond_interest_payment_plan")
public class FssBondInterestPaymentPlan {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 计划付息合计
     */
    @Column(name = "interest_payment_plan_total")
    private BigDecimal interestPaymentPlanTotal;

    /**
     * 实际付息合计
     */
    @Column(name = "interest_payment_actual_total")
    private BigDecimal interestPaymentActualTotal;

    /**
     * 实际付息金额
     */
    @Column(name = "interest_payment_actual")
    private BigDecimal interestPaymentActual;

    /**
     * 计划日期
     */
    @Column(name = "plan_date")
    private String planDate;

    /**
     * 计划付息金额
     */
    @Column(name = "plan_interest_pay_amount")
    private BigDecimal planInterestPayAmount;

    /**
     * 新增发行id
     */
    @Column(name = "dw_id")
    private String dwId;

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
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取计划付息合计
     *
     * @return 
interest_payment_plan_total - 计划付息合计
     */
    public BigDecimal getInterestPaymentPlanTotal() {
        return interestPaymentPlanTotal;
    }

    /**
     * 设置计划付息合计
     *
     * @param 
interestPaymentPlanTotal 计划付息合计
     */
    public void setInterestPaymentPlanTotal(BigDecimal interestPaymentPlanTotal) {
        this.interestPaymentPlanTotal = interestPaymentPlanTotal;
    }

    /**
     * 获取实际付息合计
     *
     * @return 
interest_payment_actual_total - 实际付息合计
     */
    public BigDecimal getInterestPaymentActualTotal() {
        return interestPaymentActualTotal;
    }

    /**
     * 设置实际付息合计
     *
     * @param 
interestPaymentActualTotal 实际付息合计
     */
    public void setInterestPaymentActualTotal(BigDecimal interestPaymentActualTotal) {
        this.interestPaymentActualTotal = interestPaymentActualTotal;
    }

    /**
     * 获取实际付息金额
     *
     * @return interest_payment_actual - 实际付息金额
     */
    public BigDecimal getInterestPaymentActual() {
        return interestPaymentActual;
    }

    /**
     * 设置实际付息金额
     *
     * @param interestPaymentActual 实际付息金额
     */
    public void setInterestPaymentActual(BigDecimal interestPaymentActual) {
        this.interestPaymentActual = interestPaymentActual;
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
     * 获取计划付息金额
     *
     * @return plan_interest_pay_amount - 计划付息金额
     */
    public BigDecimal getPlanInterestPayAmount() {
        return planInterestPayAmount;
    }

    /**
     * 设置计划付息金额
     *
     * @param planInterestPayAmount 计划付息金额
     */
    public void setPlanInterestPayAmount(BigDecimal planInterestPayAmount) {
        this.planInterestPayAmount = planInterestPayAmount;
    }

    /**
     * 获取新增发行id
     *
     * @return dw_id - 新增发行id
     */
    public String getDwId() {
        return dwId;
    }

    /**
     * 设置新增发行id
     *
     * @param dwId 新增发行id
     */
    public void setDwId(String dwId) {
        this.dwId = dwId;
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
}