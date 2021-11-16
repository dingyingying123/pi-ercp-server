package cn.com.personnel.ercp.pi.persistence.entity.credit.factoring;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Table(name = "fss_factoring_prewithdraw")
public class FssFactoringPrewithdraw {
    /**
     * 主键
     */
    @Id
    @Column(name = "fp_id")
    private String fpId;

    /**
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 合同文本编号
     */
    @Column(name = "contract_code")
    private String contractCode;

    /**
     * 利息承担方
     */
    @Column(name = "interest_bearer")
    private String interestBearer;

    /**
     * 币种
     */
    @Column(name = "currency_name")
    private String currencyName;

    /**
     * 提款金额
     */
    @Column(name = "withdraw_amount")
    private BigDecimal withdrawAmount;

    /**
     * 来源
     */
    private String source;

    /**
     * 入账日期
     */
    @Column(name = "credit_date")
    private Date creditDate;

    /**
     * 入账状态
     */
    @Column(name = "credit_status")
    private String creditStatus;

    /**
     * 业务日期
     */
    @Column(name = "business_date")
    private Date businessDate;

    /**
     * 付息方式
     */
    @Column(name = "payment_method")
    private String paymentMethod;

    /**
     * 借据信息
     */
    @Column(name = "debit_information")
    private String debitInformation;

    /**
     * 还款金额
     */
    @Column(name = "repayment_amount")
    private BigDecimal repaymentAmount;

    /**
     * 借据余额
     */
    @Column(name = "debit_balance")
    private BigDecimal debitBalance;

    /**
     * 开始日期
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 结束日期
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * 天数
     */
    private Integer days;

    /**
     * 年利率
     */
    @Column(name = "annual_interest_rate")
    private BigDecimal annualInterestRate;

    /**
     * 计息天数
     */
    @Column(name = "interest_bearing_days")
    private Integer interestBearingDays;

    /**
     * 本次预提(元)
     */
    @Column(name = "this_withdraw_amount")
    private BigDecimal thisWithdrawAmount;

    /**
     * 补提预提(元)
     */
    @Column(name = "make_withdraw_amount")
    private BigDecimal makeWithdrawAmount;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 预提主表Id
     */
    @Column(name = "fpi_id")
    private String fpiId;

    /**
     * 预提主表集合
     */
    @Transient
    private List fpiList;

    /**
     * 保理合同Id
     */
    @Column(name = "fc_id")
    private String fcId;

    /**
     * 类型
     */
    private String type;

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
     * 修改人
     */
    private String updator;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否可用
     */
    private String active;

    /**
     * 提款Id
     */
    @Column(name = "fw_id")
    private String fwId;

    /**
     * 币种编号
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 币种编号
     */
    @Column(name = "currency_id")
    private String currencyId;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * 获取主键
     *
     * @return fp_id - 主键
     */
    public String getFpId() {
        return fpId;
    }

    /**
     * 设置主键
     *
     * @param fpId 主键
     */
    public void setFpId(String fpId) {
        this.fpId = fpId;
    }

    /**
     * 获取合同名称
     *
     * @return contract_name - 合同名称
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * 设置合同名称
     *
     * @param contractName 合同名称
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * 获取合同文本编号
     *
     * @return contract_code - 合同文本编号
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置合同文本编号
     *
     * @param contractCode 合同文本编号
     */
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    /**
     * 获取利息承担方
     *
     * @return interest_bearer - 利息承担方
     */
    public String getInterestBearer() {
        return interestBearer;
    }

    /**
     * 设置利息承担方
     *
     * @param interestBearer 利息承担方
     */
    public void setInterestBearer(String interestBearer) {
        this.interestBearer = interestBearer;
    }

    /**
     * 获取币种
     *
     * @return currencyName - 币种
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * 设置币种
     *
     * @param currencyName 币种
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /**
     * 获取提款金额
     *
     * @return withdraw_amount - 提款金额
     */
    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    /**
     * 设置提款金额
     *
     * @param withdrawAmount 提款金额
     */
    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    /**
     * 获取来源
     *
     * @return source - 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源
     *
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取入账日期
     *
     * @return credit_date - 入账日期
     */
    public Date getCreditDate() {
        return creditDate;
    }

    /**
     * 设置入账日期
     *
     * @param creditDate 入账日期
     */
    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }

    /**
     * 获取入账状态
     *
     * @return credit_status - 入账状态
     */
    public String getCreditStatus() {
        return creditStatus;
    }

    /**
     * 设置入账状态
     *
     * @param creditStatus 入账状态
     */
    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    /**
     * 获取业务日期
     *
     * @return business_date - 业务日期
     */
    public Date getBusinessDate() {
        return businessDate;
    }

    /**
     * 设置业务日期
     *
     * @param businessDate 业务日期
     */
    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    /**
     * 获取付息方式
     *
     * @return payment_method - 付息方式
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置付息方式
     *
     * @param paymentMethod 付息方式
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取借据信息
     *
     * @return debit_information - 借据信息
     */
    public String getDebitInformation() {
        return debitInformation;
    }

    /**
     * 设置借据信息
     *
     * @param debitInformation 借据信息
     */
    public void setDebitInformation(String debitInformation) {
        this.debitInformation = debitInformation;
    }

    /**
     * 获取还款金额
     *
     * @return repayment_amount - 还款金额
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * 设置还款金额
     *
     * @param repaymentAmount 还款金额
     */
    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    /**
     * 获取借据余额
     *
     * @return debit_balance - 借据余额
     */
    public BigDecimal getDebitBalance() {
        return debitBalance;
    }

    /**
     * 设置借据余额
     *
     * @param debitBalance 借据余额
     */
    public void setDebitBalance(BigDecimal debitBalance) {
        this.debitBalance = debitBalance;
    }

    /**
     * 获取开始日期
     *
     * @return start_date - 开始日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始日期
     *
     * @param startDate 开始日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束日期
     *
     * @return end_date - 结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结束日期
     *
     * @param endDate 结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取天数
     *
     * @return days - 天数
     */
    public Integer getDays() {
        return days;
    }

    /**
     * 设置天数
     *
     * @param days 天数
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * 获取年利率
     *
     * @return annual_interest_rate - 年利率
     */
    public BigDecimal getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * 设置年利率
     *
     * @param annualInterestRate 年利率
     */
    public void setAnnualInterestRate(BigDecimal annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 获取计息天数
     *
     * @return interest_bearing_days - 计息天数
     */
    public Integer getInterestBearingDays() {
        return interestBearingDays;
    }

    /**
     * 设置计息天数
     *
     * @param interestBearingDays 计息天数
     */
    public void setInterestBearingDays(Integer interestBearingDays) {
        this.interestBearingDays = interestBearingDays;
    }

    /**
     * 获取本次预提(元)
     *
     * @return this_withdraw_amount - 本次预提(元)
     */
    public BigDecimal getThisWithdrawAmount() {
        return thisWithdrawAmount;
    }

    /**
     * 设置本次预提(元)
     *
     * @param thisWithdrawAmount 本次预提(元)
     */
    public void setThisWithdrawAmount(BigDecimal thisWithdrawAmount) {
        this.thisWithdrawAmount = thisWithdrawAmount;
    }

    /**
     * 获取补提预提(元)
     *
     * @return make_withdraw_amount - 补提预提(元)
     */
    public BigDecimal getMakeWithdrawAmount() {
        return makeWithdrawAmount;
    }

    /**
     * 设置补提预提(元)
     *
     * @param makeWithdrawAmount 补提预提(元)
     */
    public void setMakeWithdrawAmount(BigDecimal makeWithdrawAmount) {
        this.makeWithdrawAmount = makeWithdrawAmount;
    }

    /**
     * 获取摘要
     *
     * @return summary - 摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置摘要
     *
     * @param summary 摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取预提主表Id
     *
     * @return fpi_id - 预提主表Id
     */
    public String getFpiId() {
        return fpiId;
    }

    /**
     * 设置预提主表Id
     *
     * @param fpiId 预提主表Id
     */
    public void setFpiId(String fpiId) {
        this.fpiId = fpiId;
    }

    /**
     * 获取保理合同Id
     *
     * @return fc_id - 保理合同Id
     */
    public String getFcId() {
        return fcId;
    }

    /**
     * 设置保理合同Id
     *
     * @param fcId 保理合同Id
     */
    public void setFcId(String fcId) {
        this.fcId = fcId;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
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
     * 获取修改人
     *
     * @return updator - 修改人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置修改人
     *
     * @param updator 修改人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否可用
     *
     * @return active - 是否可用
     */
    public String getActive() {
        return active;
    }

    /**
     * 设置是否可用
     *
     * @param active 是否可用
     */
    public void setActive(String active) {
        this.active = active;
    }

    public String getFwId() {
        return fwId;
    }

    public void setFwId(String fwId) {
        this.fwId = fwId;
    }

    public List getFpiList() {
        return fpiList;
    }

    public void setFpiList(List fpiList) {
        this.fpiList = fpiList;
    }
}