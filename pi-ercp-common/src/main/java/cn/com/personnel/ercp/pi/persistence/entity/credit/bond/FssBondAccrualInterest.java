package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_bond_accrual_interest")
public class FssBondAccrualInterest {
    /**
     * 发行利息主键
     */
    @Id
    @Column(name = "accrual_id")
    @GeneratedValue(generator = "JDBC")
    private String accrualId;

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
     * 票面金额，本金
     */
    @Column(name = "face_amount")
    private BigDecimal faceAmount;

    /**
     * 利率
     */
    @Column(name = "issue_rate")
    private BigDecimal issueRate;

    /**
     * 承销费用合计
     */
    @Column(name = "underwriting_expenses")
    private BigDecimal underwritingExpenses;

    /**
     * 发行日现值 = 优先级票面金额合计 - 承销费用合计
     */
    @Column(name = "present_value")
    private BigDecimal presentValue;

    /**
     * 票面利息
     */
    @Column(name = "face_interest")
    private BigDecimal faceInterest;

    /**
     * 到期应付款
     */
    @Column(name = "payable_due")
    private BigDecimal payableDue;

    /**
     * 发行期限（年）
     */
    @Column(name = "issuance_period")
    private String issuancePeriod;

    /**
     * 起息日
     */
    @Column(name = "value_date")
    private String valueDate;

    /**
     * 月实际利率
     */
    @Column(name = "monthly_effective_rate")
    private BigDecimal monthlyEffectiveRate;

    /**
     * 现金流
     */
    @Column(name = "cash_flow")
    private BigDecimal cashFlow;

    /**
     * 月利息
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
     * 入账状态
     */
    @Column(name = "entry_status")
    private String entryStatus;

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
     * 状态
     */
    @Column(name = "status")
    private String status;

    /**
     * 生成分录分录编号
     */
    @Column(name = "entry_number")
    private String entryNumber;

    /**
     * 生成分录组编号
     */
    @Column(name = "group_no")
    private String groupNo;

    /**
     * 报错消息
     */
    @Column(name = "error_message")
    private String errorMessage;

    /**
     * SAP凭证编号
     */
    @Column(name = "sap_document_no")
    private String sapDocumentNo;

    /**
     * 冲销状态
     */
    @Column(name = "reversal_status")
    private String reversalStatus;

    /**
     * 分配号
     */
    @Column(name = "assigned_number")
    private String assignedNumber;

    /**
     * 货币主键
     */
    @Column(name = "currency_id")
    private String currencyId;

    /**
     * 货币编码
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 货币
     */
    @Column(name = "currency")
    private String currency;

    /**
     * 获取发行利息主键
     *
     * @return accrual_id - 发行利息主键
     */
    public String getAccrualId() {
        return accrualId;
    }

    /**
     * 设置发行利息主键
     *
     * @param accrualId 发行利息主键
     */
    public void setAccrualId(String accrualId) {
        this.accrualId = accrualId;
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
     * 获取承销费用合计
     *
     * @return underwriting_expenses - 承销费用合计
     */
    public BigDecimal getUnderwritingExpenses() {
        return underwritingExpenses;
    }

    /**
     * 设置承销费用合计
     *
     * @param underwritingExpenses 承销费用合计
     */
    public void setUnderwritingExpenses(BigDecimal underwritingExpenses) {
        this.underwritingExpenses = underwritingExpenses;
    }

    /**
     * 获取发行日现值 = 优先级票面金额合计 - 承销费用合计
     *
     * @return present_value - 发行日现值 = 优先级票面金额合计 - 承销费用合计
     */
    public BigDecimal getPresentValue() {
        return presentValue;
    }

    /**
     * 设置发行日现值 = 优先级票面金额合计 - 承销费用合计
     *
     * @param presentValue 发行日现值 = 优先级票面金额合计 - 承销费用合计
     */
    public void setPresentValue(BigDecimal presentValue) {
        this.presentValue = presentValue;
    }

    /**
     * 获取票面利息
     *
     * @return face_interest - 票面利息
     */
    public BigDecimal getFaceInterest() {
        return faceInterest;
    }

    /**
     * 设置票面利息
     *
     * @param faceInterest 票面利息
     */
    public void setFaceInterest(BigDecimal faceInterest) {
        this.faceInterest = faceInterest;
    }

    /**
     * 获取到期应付款
     *
     * @return payable_due - 到期应付款
     */
    public BigDecimal getPayableDue() {
        return payableDue;
    }

    /**
     * 设置到期应付款
     *
     * @param payableDue 到期应付款
     */
    public void setPayableDue(BigDecimal payableDue) {
        this.payableDue = payableDue;
    }

    /**
     * 获取发行期限（年）
     *
     * @return issuance_period - 发行期限（年）
     */
    public String getIssuancePeriod() {
        return issuancePeriod;
    }

    /**
     * 设置发行期限（年）
     *
     * @param issuancePeriod 发行期限（年）
     */
    public void setIssuancePeriod(String issuancePeriod) {
        this.issuancePeriod = issuancePeriod;
    }

    /**
     * 获取起息日
     *
     * @return value_date - 起息日
     */
    public String getValueDate() {
        return valueDate;
    }

    /**
     * 设置起息日
     *
     * @param valueDate 起息日
     */
    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    /**
     * 获取月实际利率
     *
     * @return monthly_effective_rate - 月实际利率
     */
    public BigDecimal getMonthlyEffectiveRate() {
        return monthlyEffectiveRate;
    }

    /**
     * 设置月实际利率
     *
     * @param monthlyEffectiveRate 月实际利率
     */
    public void setMonthlyEffectiveRate(BigDecimal monthlyEffectiveRate) {
        this.monthlyEffectiveRate = monthlyEffectiveRate;
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
     * 获取入账状态
     *
     * @return entry_status - 入账状态
     */
    public String getEntryStatus() {
        return entryStatus;
    }

    /**
     * 设置入账状态
     *
     * @param entryStatus 入账状态
     */
    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getSapDocumentNo() {
        return sapDocumentNo;
    }

    public void setSapDocumentNo(String sapDocumentNo) {
        this.sapDocumentNo = sapDocumentNo;
    }

    public String getReversalStatus() {
        return reversalStatus;
    }

    public void setReversalStatus(String reversalStatus) {
        this.reversalStatus = reversalStatus;
    }

    public String getAssignedNumber() {
        return assignedNumber;
    }

    public void setAssignedNumber(String assignedNumber) {
        this.assignedNumber = assignedNumber;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}