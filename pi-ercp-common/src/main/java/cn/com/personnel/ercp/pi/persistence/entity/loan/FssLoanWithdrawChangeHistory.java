package cn.com.personnel.ercp.pi.persistence.entity.loan;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_loan_withdraw_change_history")
public class FssLoanWithdrawChangeHistory {
    /**
     * 变更历史记录主键id
     */
    @Id
    @Column(name = "history_id")
    @GeneratedValue(generator = "JDBC")
    private String historyId;

    /**
     * 借据主键id
     */
    @Column(name = "iou_id")
    private String iouId;

    /**
     * 主键id
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 利率类型
     */
    @Column(name = "interest_rate_type")
    private String interestRateType;
    /**
     * 利率类型id
     */
    @Column(name = "interest_rate_type_id")
    private String interestRateTypeId;
    /**
     * 利率浮动方式
     */
    @Column(name = "interest_rate_float_way")
    private String interestRateFloatWay;

    /**
     * 浮动比例
     */
    @Column(name = "float_rate")
    private BigDecimal floatRate;

    /**
     * 变更日期
     */
    @Column(name = "change_date")
    private String changeDate;

    /**
     * 借据利率
     */
    @Column(name = "iou_interest_rate")
    private BigDecimal iouInterestRate;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;
    /**
     * 摘要
     */
    private String summary;
    /**
     * 获取变更历史记录主键id
     *
     * @return history_id - 变更历史记录主键id
     */
    public String getHistoryId() {
        return historyId;
    }

    /**
     * 设置变更历史记录主键id
     *
     * @param historyId 变更历史记录主键id
     */
    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

    /**
     * 获取借据主键id
     *
     * @return iou_id - 借据主键id
     */
    public String getIouId() {
        return iouId;
    }

    /**
     * 设置借据主键id
     *
     * @param iouId 借据主键id
     */
    public void setIouId(String iouId) {
        this.iouId = iouId;
    }

    /**
     * 获取主键id
     *
     * @return manage_id - 主键id
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置主键id
     *
     * @param manageId 主键id
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取利率类型
     *
     * @return interest_rate_type - 利率类型
     */
    public String getInterestRateType() {
        return interestRateType;
    }

    /**
     * 设置利率类型
     *
     * @param interestRateType 利率类型
     */
    public void setInterestRateType(String interestRateType) {
        this.interestRateType = interestRateType;
    }

    /**
     * 获取利率浮动方式
     *
     * @return interest_rate_float_way - 利率浮动方式
     */
    public String getInterestRateFloatWay() {
        return interestRateFloatWay;
    }

    /**
     * 设置利率浮动方式
     *
     * @param interestRateFloatWay 利率浮动方式
     */
    public void setInterestRateFloatWay(String interestRateFloatWay) {
        this.interestRateFloatWay = interestRateFloatWay;
    }

    public String getInterestRateTypeId() {
        return interestRateTypeId;
    }

    public void setInterestRateTypeId(String interestRateTypeId) {
        this.interestRateTypeId = interestRateTypeId;
    }

    /**
     * 获取浮动比例
     *
     * @return float_rate - 浮动比例
     */
    public BigDecimal getFloatRate() {
        return floatRate;
    }

    /**
     * 设置浮动比例
     *
     * @param floatRate 浮动比例
     */
    public void setFloatRate(BigDecimal floatRate) {
        this.floatRate = floatRate;
    }

    /**
     * 获取变更日期
     *
     * @return change_date - 变更日期
     */
    public String getChangeDate() {
        return changeDate;
    }

    /**
     * 设置变更日期
     *
     * @param changeDate 变更日期
     */
    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    public BigDecimal getIouInterestRate() {
        return iouInterestRate;
    }

    public void setIouInterestRate(BigDecimal iouInterestRate) {
        this.iouInterestRate = iouInterestRate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}