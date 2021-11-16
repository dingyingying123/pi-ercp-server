package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_report_work_tax_month")
public class FssReportWorkTaxMonth {
    /**
     * 报税月份ID
     */
    @Id
    @Column(name = "month_id")
    @GeneratedValue(generator = "JDBC")
    private String monthId;

    /**
     * 月份
     */
    private String month;

    /**
     * 报税金额
     */
    private BigDecimal amount;

    /**
     * 计算状态
     */
    private String status;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新人
     */
    private String updator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取报税月份ID
     *
     * @return month_id - 报税月份ID
     */
    public String getMonthId() {
        return monthId;
    }

    /**
     * 设置报税月份ID
     *
     * @param monthId 报税月份ID
     */
    public void setMonthId(String monthId) {
        this.monthId = monthId;
    }

    /**
     * 获取月份
     *
     * @return month - 月份
     */
    public String getMonth() {
        return month;
    }

    /**
     * 设置月份
     *
     * @param month 月份
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * 获取报税金额
     *
     * @return amount - 报税金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置报税金额
     *
     * @param amount 报税金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取计算状态
     *
     * @return status - 计算状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置计算状态
     *
     * @param status 计算状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
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
     * 获取更新人
     *
     * @return updator - 更新人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置更新人
     *
     * @param updator 更新人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
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