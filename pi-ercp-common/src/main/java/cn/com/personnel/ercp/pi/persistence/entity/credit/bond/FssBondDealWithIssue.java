package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_bond_deal_with_issue")
public class FssBondDealWithIssue {
    /**
     * 主键
     */
    @Id
    @Column(name = "dw_id")
    @GeneratedValue(generator = "JDBC")
    private String dwId;

    /**
     * 注册主键
     */
    @Column(name = "bond_id")
    private String bondId;

    /**
     * 发行申请主键
     */
    @Column(name = "fbia_id")
    private String fbiaId;

    /**
     * 申请单号
     */
    @Column(name = "application_number")
    private String applicationNumber;

    /**
     * 债券名称
     */
    @Column(name = "bond_name")
    private String bondName;

    /**
     * 债券简称
     */
    @Column(name = "bond_abbreviation")
    private String bondAbbreviation;

    /**
     * 银行总行ID，主承销商ID
     */
    @Column(name = "head_id")
    private String headId;

    /**
     * 银行总行编码，主承销商编码
     */
    @Column(name = "head_code")
    private String headCode;

    /**
     * 银行总行，主承销商
     */
    @Column(name = "head_name")
    private String headName;

    /**
     * 债券代码
     */
    @Column(name = "bond_code")
    private String bondCode;

    /**
     * 债券级别字典表主键
     */
    @Column(name = "bond_level_id")
    private String bondLevelId;

    /**
     * 债券级别
     */
    @Column(name = "bond_level")
    private String bondLevel;

    /**
     * 实际募集资金
     */
    @Column(name = "actual_raised_funds")
    private BigDecimal actualRaisedFunds;

    /**
     * 票面金额,已发行金额
     */
    @Column(name = "face_amount")
    private BigDecimal faceAmount;

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
    @Column(name = "currency_name")
    private String currencyName;

    /**
     * 发行日期
     */
    @Column(name = "issue_date")
    private String issueDate;

    /**
     * 发行利率
     */
    @Column(name = "issue_rate")
    private BigDecimal issueRate;

    /**
     * 期限方式，
     */
    @Column(name = "deadline_method")
    private String deadlineMethod;

    /**
     * 债券期限ID
     */
    @Column(name = "bond_maturity_id")
    private String bondMaturityId;

    /**
     * 债券期限
     */
    @Column(name = "bond_maturity")
    private String bondMaturity;

    /**
     * 起息日期
     */
    @Column(name = "value_date")
    private String valueDate;

    /**
     * 兑付日期
     */
    @Column(name = "redemption_date")
    private String redemptionDate;

    /**
     * 付息期数
     */
    @Column(name = "interest_payment_periods")
    private String interestPaymentPeriods;

    /**
     * 付息间隔
     */
    @Column(name = "interest_payment_interval")
    private String interestPaymentInterval;

    /**
     * 承销费用
     */
    @Column(name = "underwriting_expenses")
    private BigDecimal underwritingExpenses;

    /**
     * 承销费用说明
     */
    @Column(name = "underwriting_expenses_description")
    private String underwritingExpensesDescription;

    /**
     * 备注
     */
    private String description;

    /**
     * 状态
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
     * 付息方式
     */
    @Column(name = "interest_payment_method")
    private String interestPaymentMethod;

    /**
     * 获取主键
     *
     * @return dw_id - 主键
     */
    public String getDwId() {
        return dwId;
    }

    /**
     * 设置主键
     *
     * @param dwId 主键
     */
    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    /**
     * 获取注册主键
     *
     * @return bond_id - 注册主键
     */
    public String getBondId() {
        return bondId;
    }

    /**
     * 设置注册主键
     *
     * @param bondId 注册主键
     */
    public void setBondId(String bondId) {
        this.bondId = bondId;
    }

    /**
     * 获取发行申请主键
     *
     * @return fbia_id - 发行申请主键
     */
    public String getFbiaId() {
        return fbiaId;
    }

    /**
     * 设置发行申请主键
     *
     * @param fbiaId 发行申请主键
     */
    public void setFbiaId(String fbiaId) {
        this.fbiaId = fbiaId;
    }

    /**
     * 获取申请单号
     *
     * @return application_number - 申请单号
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * 设置申请单号
     *
     * @param applicationNumber 申请单号
     */
    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    /**
     * 获取债券名称
     *
     * @return bond_name - 债券名称
     */
    public String getBondName() {
        return bondName;
    }

    /**
     * 设置债券名称
     *
     * @param bondName 债券名称
     */
    public void setBondName(String bondName) {
        this.bondName = bondName;
    }

    /**
     * 获取债券简称
     *
     * @return bond_abbreviation - 债券简称
     */
    public String getBondAbbreviation() {
        return bondAbbreviation;
    }

    /**
     * 设置债券简称
     *
     * @param bondAbbreviation 债券简称
     */
    public void setBondAbbreviation(String bondAbbreviation) {
        this.bondAbbreviation = bondAbbreviation;
    }

    /**
     * 获取银行总行ID，主承销商ID
     *
     * @return head_id - 银行总行ID，主承销商ID
     */
    public String getHeadId() {
        return headId;
    }

    /**
     * 设置银行总行ID，主承销商ID
     *
     * @param headId 银行总行ID，主承销商ID
     */
    public void setHeadId(String headId) {
        this.headId = headId;
    }

    /**
     * 获取银行总行编码，主承销商编码
     *
     * @return head_code - 银行总行编码，主承销商编码
     */
    public String getHeadCode() {
        return headCode;
    }

    /**
     * 设置银行总行编码，主承销商编码
     *
     * @param headCode 银行总行编码，主承销商编码
     */
    public void setHeadCode(String headCode) {
        this.headCode = headCode;
    }

    /**
     * 获取银行总行，主承销商
     *
     * @return head_name - 银行总行，主承销商
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * 设置银行总行，主承销商
     *
     * @param headName 银行总行，主承销商
     */
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    /**
     * 获取债券代码
     *
     * @return bond_code - 债券代码
     */
    public String getBondCode() {
        return bondCode;
    }

    /**
     * 设置债券代码
     *
     * @param bondCode 债券代码
     */
    public void setBondCode(String bondCode) {
        this.bondCode = bondCode;
    }

    /**
     * 获取债券级别字典表主键
     *
     * @return bond_level_id - 债券级别字典表主键
     */
    public String getBondLevelId() {
        return bondLevelId;
    }

    /**
     * 设置债券级别字典表主键
     *
     * @param bondLevelId 债券级别字典表主键
     */
    public void setBondLevelId(String bondLevelId) {
        this.bondLevelId = bondLevelId;
    }

    /**
     * 获取债券级别
     *
     * @return bond_level - 债券级别
     */
    public String getBondLevel() {
        return bondLevel;
    }

    /**
     * 设置债券级别
     *
     * @param bondLevel 债券级别
     */
    public void setBondLevel(String bondLevel) {
        this.bondLevel = bondLevel;
    }

    /**
     * 获取实际募集资金
     *
     * @return actual_raised_funds - 实际募集资金
     */
    public BigDecimal getActualRaisedFunds() {
        return actualRaisedFunds;
    }

    /**
     * 设置实际募集资金
     *
     * @param actualRaisedFunds 实际募集资金
     */
    public void setActualRaisedFunds(BigDecimal actualRaisedFunds) {
        this.actualRaisedFunds = actualRaisedFunds;
    }

    /**
     * 获取票面金额,已发行金额
     *
     * @return face_amount - 票面金额,已发行金额
     */
    public BigDecimal getFaceAmount() {
        return faceAmount;
    }

    /**
     * 设置票面金额,已发行金额
     *
     * @param faceAmount 票面金额,已发行金额
     */
    public void setFaceAmount(BigDecimal faceAmount) {
        this.faceAmount = faceAmount;
    }

    /**
     * 获取货币主键
     *
     * @return currency_id - 货币主键
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * 设置货币主键
     *
     * @param currencyId 货币主键
     */
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * 获取货币编码
     *
     * @return currency_code - 货币编码
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置货币编码
     *
     * @param currencyCode 货币编码
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * 获取货币
     *
     * @return currency_name - 货币
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * 设置货币
     *
     * @param currencyName 货币
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /**
     * 获取发行日期
     *
     * @return issue_date - 发行日期
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * 设置发行日期
     *
     * @param issueDate 发行日期
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * 获取发行利率
     *
     * @return issue_rate - 发行利率
     */
    public BigDecimal getIssueRate() {
        return issueRate;
    }

    /**
     * 设置发行利率
     *
     * @param issueRate 发行利率
     */
    public void setIssueRate(BigDecimal issueRate) {
        this.issueRate = issueRate;
    }

    /**
     * 获取期限方式，
     *
     * @return deadline_method - 期限方式，
     */
    public String getDeadlineMethod() {
        return deadlineMethod;
    }

    /**
     * 设置期限方式，
     *
     * @param deadlineMethod 期限方式，
     */
    public void setDeadlineMethod(String deadlineMethod) {
        this.deadlineMethod = deadlineMethod;
    }

    /**
     * 获取债券期限ID
     *
     * @return bond_maturity_id - 债券期限ID
     */
    public String getBondMaturityId() {
        return bondMaturityId;
    }

    /**
     * 设置债券期限ID
     *
     * @param bondMaturityId 债券期限ID
     */
    public void setBondMaturityId(String bondMaturityId) {
        this.bondMaturityId = bondMaturityId;
    }

    /**
     * 获取债券期限
     *
     * @return bond_maturity - 债券期限
     */
    public String getBondMaturity() {
        return bondMaturity;
    }

    /**
     * 设置债券期限
     *
     * @param bondMaturity 债券期限
     */
    public void setBondMaturity(String bondMaturity) {
        this.bondMaturity = bondMaturity;
    }

    /**
     * 获取起息日期
     *
     * @return value_date - 起息日期
     */
    public String getValueDate() {
        return valueDate;
    }

    /**
     * 设置起息日期
     *
     * @param valueDate 起息日期
     */
    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    /**
     * 获取兑付日期
     *
     * @return redemption_date - 兑付日期
     */
    public String getRedemptionDate() {
        return redemptionDate;
    }

    /**
     * 设置兑付日期
     *
     * @param redemptionDate 兑付日期
     */
    public void setRedemptionDate(String redemptionDate) {
        this.redemptionDate = redemptionDate;
    }

    /**
     * 获取付息期数
     *
     * @return interest_payment_periods - 付息期数
     */
    public String getInterestPaymentPeriods() {
        return interestPaymentPeriods;
    }

    /**
     * 设置付息期数
     *
     * @param interestPaymentPeriods 付息期数
     */
    public void setInterestPaymentPeriods(String interestPaymentPeriods) {
        this.interestPaymentPeriods = interestPaymentPeriods;
    }

    /**
     * 获取付息间隔
     *
     * @return interest_payment_interval - 付息间隔
     */
    public String getInterestPaymentInterval() {
        return interestPaymentInterval;
    }

    /**
     * 设置付息间隔
     *
     * @param interestPaymentInterval 付息间隔
     */
    public void setInterestPaymentInterval(String interestPaymentInterval) {
        this.interestPaymentInterval = interestPaymentInterval;
    }

    /**
     * 获取承销费用
     *
     * @return underwriting_expenses - 承销费用
     */
    public BigDecimal getUnderwritingExpenses() {
        return underwritingExpenses;
    }

    /**
     * 设置承销费用
     *
     * @param underwritingExpenses 承销费用
     */
    public void setUnderwritingExpenses(BigDecimal underwritingExpenses) {
        this.underwritingExpenses = underwritingExpenses;
    }

    /**
     * 获取承销费用说明
     *
     * @return underwriting_expenses_description - 承销费用说明
     */
    public String getUnderwritingExpensesDescription() {
        return underwritingExpensesDescription;
    }

    /**
     * 设置承销费用说明
     *
     * @param underwritingExpensesDescription 承销费用说明
     */
    public void setUnderwritingExpensesDescription(String underwritingExpensesDescription) {
        this.underwritingExpensesDescription = underwritingExpensesDescription;
    }

    /**
     * 获取备注
     *
     * @return description - 备注
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置备注
     *
     * @param description 备注
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
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

    public String getInterestPaymentMethod() {
        return interestPaymentMethod;
    }

    public void setInterestPaymentMethod(String interestPaymentMethod) {
        this.interestPaymentMethod = interestPaymentMethod;
    }
}