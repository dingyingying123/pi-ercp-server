package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bond_redeem")
public class FssBondRedeem {
    /**
     * 兑付主键
     */
    @Id
    @Column(name = "redeem_id")
    @GeneratedValue(generator = "JDBC")
    private String redeemId;

    /**
     * 兑付汇总主键
     */
    @Column(name = "summary_id")
    private String summaryId;

    /**
     * 新增发行主键
     */
    @Column(name = "dw_id")
    private String dwId;

    /**
     * 发行信息，债券名称
     */
    @Column(name = "bond_name")
    private String bondName;

    /**
     * 发行余额
     */
    @Column(name = "issuing_balance")
    private BigDecimal issuingBalance;

    /**
     * 还本计划ID
     */
    @Column(name = "plan_id")
    private String planId;

    /**
     * 还本计划，年+月+日|金额（万元）
     */
    @Column(name = "plan_name")
    private String planName;

    /**
     * 计划余额
     */
    @Column(name = "planned_balance")
    private BigDecimal plannedBalance;

    /**
     * 本次还款
     */
    @Column(name = "this_repayment")
    private BigDecimal thisRepayment;

    /**
     * 折后金额
     */
    @Column(name = "amount_after_discount")
    private BigDecimal amountAfterDiscount;

    /**
     * 描述
     */
    private String description;

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
     * 获取兑付主键
     *
     * @return redeem_id - 兑付主键
     */
    public String getRedeemId() {
        return redeemId;
    }

    /**
     * 设置兑付主键
     *
     * @param redeemId 兑付主键
     */
    public void setRedeemId(String redeemId) {
        this.redeemId = redeemId;
    }

    /**
     * 获取兑付汇总主键
     *
     * @return summary_id - 兑付汇总主键
     */
    public String getSummaryId() {
        return summaryId;
    }

    /**
     * 设置兑付汇总主键
     *
     * @param summaryId 兑付汇总主键
     */
    public void setSummaryId(String summaryId) {
        this.summaryId = summaryId;
    }

    /**
     * 获取新增发行主键
     *
     * @return dw_id - 新增发行主键
     */
    public String getDwId() {
        return dwId;
    }

    /**
     * 设置新增发行主键
     *
     * @param dwId 新增发行主键
     */
    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    /**
     * 获取发行信息，债券名称
     *
     * @return bond_name - 发行信息，债券名称
     */
    public String getBondName() {
        return bondName;
    }

    /**
     * 设置发行信息，债券名称
     *
     * @param bondName 发行信息，债券名称
     */
    public void setBondName(String bondName) {
        this.bondName = bondName;
    }

    /**
     * 获取发行余额
     *
     * @return issuing_balance - 发行余额
     */
    public BigDecimal getIssuingBalance() {
        return issuingBalance;
    }

    /**
     * 设置发行余额
     *
     * @param issuingBalance 发行余额
     */
    public void setIssuingBalance(BigDecimal issuingBalance) {
        this.issuingBalance = issuingBalance;
    }

    /**
     * 获取还本计划ID
     *
     * @return plan_id - 还本计划ID
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * 设置还本计划ID
     *
     * @param planId 还本计划ID
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * 获取还本计划，年+月+日|金额（万元）
     *
     * @return plan_name - 还本计划，年+月+日|金额（万元）
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * 设置还本计划，年+月+日|金额（万元）
     *
     * @param planName 还本计划，年+月+日|金额（万元）
     */
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * 获取计划余额
     *
     * @return planned_balance - 计划余额
     */
    public BigDecimal getPlannedBalance() {
        return plannedBalance;
    }

    /**
     * 设置计划余额
     *
     * @param plannedBalance 计划余额
     */
    public void setPlannedBalance(BigDecimal plannedBalance) {
        this.plannedBalance = plannedBalance;
    }

    /**
     * 获取本次还款
     *
     * @return this_repayment - 本次还款
     */
    public BigDecimal getThisRepayment() {
        return thisRepayment;
    }

    /**
     * 设置本次还款
     *
     * @param thisRepayment 本次还款
     */
    public void setThisRepayment(BigDecimal thisRepayment) {
        this.thisRepayment = thisRepayment;
    }

    /**
     * 获取折后金额
     *
     * @return amount_after_discount - 折后金额
     */
    public BigDecimal getAmountAfterDiscount() {
        return amountAfterDiscount;
    }

    /**
     * 设置折后金额
     *
     * @param amountAfterDiscount 折后金额
     */
    public void setAmountAfterDiscount(BigDecimal amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
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