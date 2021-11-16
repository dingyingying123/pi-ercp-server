package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_bond_issue_interest")
public class FssBondIssueInterest {
    /**
     * 发行利息主键
     */
    @Id
    @Column(name = "interest_id")
    @GeneratedValue(generator = "JDBC")
    private String interestId;

    /**
     * 新增发行主键
     */
    @Column(name = "dw_id")
    private String dwId;

    /**
     * 债券注册主键
     */
    @Column(name = "bond_id")
    private String bondId;

    /**
     * 付款日期
     */
    @Column(name = "payment_date")
    private String paymentDate;

    /**
     * 期限（月）
     */
    @Column(name = "bond_maturity_month")
    private Short bondMaturityMonth;

    /**
     * 利率
     */
    @Column(name = "issue_rate")
    private BigDecimal issueRate;

    /**
     * 票面金额，本金
     */
    @Column(name = "face_amount")
    private BigDecimal faceAmount;

    /**
     * 现金流
     */
    @Column(name = "cash_flow")
    private BigDecimal cashFlow;

    /**
     * 月利息  票面利息-应付利息
     */
    private BigDecimal interest;

    /**
     * 实际利息-财务费用
     */
    @Column(name = "actual_interest")
    private BigDecimal actualInterest;

    /**
     * 摊余金额
     */
    @Column(name = "amortized_amount")
    private BigDecimal amortizedAmount;

    /**
     * 分摊金额
     */
    @Column(name = "apportioned_amount")
    private BigDecimal apportionedAmount;

    /**
     * 还本
     */
    @Column(name = "principal_repayment")
    private BigDecimal principalRepayment;

    /**
     * 状态 0：发行初始，1，计提中，2、付息日，3、完结
     */
    private String status;

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
     * 获取发行利息主键
     *
     * @return interest_id - 发行利息主键
     */
    public String getInterestId() {
        return interestId;
    }

    /**
     * 设置发行利息主键
     *
     * @param interestId 发行利息主键
     */
    public void setInterestId(String interestId) {
        this.interestId = interestId;
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
     * 获取付款日期
     *
     * @return payment_date - 付款日期
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * 设置付款日期
     *
     * @param paymentDate 付款日期
     */
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * 获取期限（月）
     *
     * @return bond_maturity_month - 期限（月）
     */
    public Short getBondMaturityMonth() {
        return bondMaturityMonth;
    }

    /**
     * 设置期限（月）
     *
     * @param bondMaturityMonth 期限（月）
     */
    public void setBondMaturityMonth(Short bondMaturityMonth) {
        this.bondMaturityMonth = bondMaturityMonth;
    }

    /**
     * 获取利率
     *
     * @return issue_rate - 利率
     */
    public BigDecimal getIssueRate() {
        return issueRate;
    }

    /**
     * 设置利率
     *
     * @param issueRate 利率
     */
    public void setIssueRate(BigDecimal issueRate) {
        this.issueRate = issueRate;
    }

    /**
     * 获取票面金额，本金
     *
     * @return face_amount - 票面金额，本金
     */
    public BigDecimal getFaceAmount() {
        return faceAmount;
    }

    /**
     * 设置票面金额，本金
     *
     * @param faceAmount 票面金额，本金
     */
    public void setFaceAmount(BigDecimal faceAmount) {
        this.faceAmount = faceAmount;
    }

    /**
     * 获取现金流
     *
     * @return cash_flow - 现金流
     */
    public BigDecimal getCashFlow() {
        return cashFlow;
    }

    /**
     * 设置现金流
     *
     * @param cashFlow 现金流
     */
    public void setCashFlow(BigDecimal cashFlow) {
        this.cashFlow = cashFlow;
    }

    /**
     * 获取月利息
     *
     * @return interest - 月利息
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * 设置月利息
     *
     * @param interest 月利息
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * 获取实际利息-财务费用
     *
     * @return actual_interest - 实际利息-财务费用
     */
    public BigDecimal getActualInterest() {
        return actualInterest;
    }

    /**
     * 设置实际利息-财务费用
     *
     * @param actualInterest 实际利息-财务费用
     */
    public void setActualInterest(BigDecimal actualInterest) {
        this.actualInterest = actualInterest;
    }

    /**
     * 获取摊余金额
     *
     * @return amortized_amount - 摊余金额
     */
    public BigDecimal getAmortizedAmount() {
        return amortizedAmount;
    }

    /**
     * 设置摊余金额
     *
     * @param amortizedAmount 摊余金额
     */
    public void setAmortizedAmount(BigDecimal amortizedAmount) {
        this.amortizedAmount = amortizedAmount;
    }

    /**
     * 获取分摊金额
     *
     * @return apportioned_amount - 分摊金额
     */
    public BigDecimal getApportionedAmount() {
        return apportionedAmount;
    }

    /**
     * 设置分摊金额
     *
     * @param apportionedAmount 分摊金额
     */
    public void setApportionedAmount(BigDecimal apportionedAmount) {
        this.apportionedAmount = apportionedAmount;
    }

    /**
     * 获取还本
     *
     * @return principal_repayment - 还本
     */
    public BigDecimal getPrincipalRepayment() {
        return principalRepayment;
    }

    /**
     * 设置还本
     *
     * @param principalRepayment 还本
     */
    public void setPrincipalRepayment(BigDecimal principalRepayment) {
        this.principalRepayment = principalRepayment;
    }

    /**
     * 获取状态 0：发行初始，1，计提中，2、付息日，3、完结
     *
     * @return status - 状态 0：发行初始，1，计提中，2、付息日，3、完结
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 0：发行初始，1，计提中，2、付息日，3、完结
     *
     * @param status 状态 0：发行初始，1，计提中，2、付息日，3、完结
     */
    public void setStatus(String status) {
        this.status = status;
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