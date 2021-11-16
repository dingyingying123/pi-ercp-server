package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bond_summary_redeem")
public class FssBondSummaryRedeem {
    /**
     * 兑付汇总主键
     */
    @Id
    @Column(name = "summary_id")
    @GeneratedValue(generator = "JDBC")
    private String summaryId;

    /**
     * 债券注册主键
     */
    @Column(name = "bond_id")
    private String bondId;

    /**
     * 业务日期
     */
    @Column(name = "business_date")
    private String businessDate;

    /**
     * 汇率
     */
    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 还款金额合计
     */
    @Column(name = "this_repayment_sum")
    private BigDecimal thisRepaymentSum;

    /**
     * 折后金额合计
     */
    @Column(name = "amount_after_discount_sum")
    private BigDecimal amountAfterDiscountSum;

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
     * 获取债券注册主键
     *
     * @return bond_id - 债券注册主键
     */
    public String getBondId() {
        return bondId;
    }

    /**
     * 设置债券注册主键
     *
     * @param bondId 债券注册主键
     */
    public void setBondId(String bondId) {
        this.bondId = bondId;
    }

    /**
     * 获取业务日期
     *
     * @return business_date - 业务日期
     */
    public String getBusinessDate() {
        return businessDate;
    }

    /**
     * 设置业务日期
     *
     * @param businessDate 业务日期
     */
    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
    }

    /**
     * 获取汇率
     *
     * @return exchange_rate - 汇率
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * 设置汇率
     *
     * @param exchangeRate 汇率
     */
    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取还款金额合计
     *
     * @return this_repayment_sum - 还款金额合计
     */
    public BigDecimal getThisRepaymentSum() {
        return thisRepaymentSum;
    }

    /**
     * 设置还款金额合计
     *
     * @param thisRepaymentSum 还款金额合计
     */
    public void setThisRepaymentSum(BigDecimal thisRepaymentSum) {
        this.thisRepaymentSum = thisRepaymentSum;
    }

    /**
     * 获取折后金额合计
     *
     * @return amount_after_discount_sum - 折后金额合计
     */
    public BigDecimal getAmountAfterDiscountSum() {
        return amountAfterDiscountSum;
    }

    /**
     * 设置折后金额合计
     *
     * @param amountAfterDiscountSum 折后金额合计
     */
    public void setAmountAfterDiscountSum(BigDecimal amountAfterDiscountSum) {
        this.amountAfterDiscountSum = amountAfterDiscountSum;
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