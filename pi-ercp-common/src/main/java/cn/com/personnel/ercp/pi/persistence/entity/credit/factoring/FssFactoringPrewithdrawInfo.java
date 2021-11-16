package cn.com.personnel.ercp.pi.persistence.entity.credit.factoring;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_factoring_prewithdraw_info")
public class FssFactoringPrewithdrawInfo {
    /**
     * 主键
     */
    @Id
    @Column(name = "fpi_id")
    private String fpiId;

    /**
     * 保理银行
     */
    @Column(name = "factoring_bank")
    private String factoringBank;

    /**
     * 保理银行编号
     */
    @Column(name = "factoring_bank_id")
    private String factoringBankId;

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
     * 业务日期起
     */
    @Transient
    private Date upCreditDate;

    /**
     * 业务日期止
     */
    @Transient
    private Date onlyCreditDate;

    /**
     * 计算状态
     */
    @Column(name = "calculation_status")
    private String calculationStatus;

    /**
     * 入账状态
     */
    @Column(name = "credit_status")
    private String creditStatus;

    /**
     * 付息方式
     */
    @Column(name = "payment_method")
    private String paymentMethod;

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
     * 保理合同Id
     */
    @Column(name = "fc_id")
    private String fcId;

    /**
     * 类型（自动、手动）
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
     * 生成分录组编号
     */
    @Column(name = "group_no")
    private String groupNo;

    /**
     * 生成分录分录编号
     */
    @Column(name = "entry_number")
    private String entryNumber;

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
     * @return fpi_id - 主键
     */
    public String getFpiId() {
        return fpiId;
    }

    /**
     * 设置主键
     *
     * @param fpiId 主键
     */
    public void setFpiId(String fpiId) {
        this.fpiId = fpiId;
    }

    /**
     * 获取保理银行
     *
     * @return factoring_bank - 保理银行
     */
    public String getFactoringBank() {
        return factoringBank;
    }

    /**
     * 设置保理银行
     *
     * @param factoringBank 保理银行
     */
    public void setFactoringBank(String factoringBank) {
        this.factoringBank = factoringBank;
    }

    /**
     * 获取保理银行编号
     *
     * @return factoring_bank_id - 保理银行编号
     */
    public String getFactoringBankId() {
        return factoringBankId;
    }

    /**
     * 设置保理银行编号
     *
     * @param factoringBankId 保理银行编号
     */
    public void setFactoringBankId(String factoringBankId) {
        this.factoringBankId = factoringBankId;
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
     * 获取计算状态
     *
     * @return calculation_status - 计算状态
     */
    public String getCalculationStatus() {
        return calculationStatus;
    }

    /**
     * 设置计算状态
     *
     * @param calculationStatus 计算状态
     */
    public void setCalculationStatus(String calculationStatus) {
        this.calculationStatus = calculationStatus;
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
     * 获取报错消息
     *
     * @return error_message - 报错消息
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 设置报错消息
     *
     * @param errorMessage 报错消息
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * 获取SAP凭证编号
     *
     * @return sap_document_no - SAP凭证编号
     */
    public String getSapDocumentNo() {
        return sapDocumentNo;
    }

    /**
     * 设置SAP凭证编号
     *
     * @param sapDocumentNo SAP凭证编号
     */
    public void setSapDocumentNo(String sapDocumentNo) {
        this.sapDocumentNo = sapDocumentNo;
    }

    /**
     * 获取冲销状态
     *
     * @return reversal_status - 冲销状态
     */
    public String getReversalStatus() {
        return reversalStatus;
    }

    /**
     * 设置冲销状态
     *
     * @param reversalStatus 冲销状态
     */
    public void setReversalStatus(String reversalStatus) {
        this.reversalStatus = reversalStatus;
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
     * 获取类型（自动、手动）
     *
     * @return type - 类型（自动、手动）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型（自动、手动）
     *
     * @param type 类型（自动、手动）
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

    public Date getUpCreditDate() {
        return upCreditDate;
    }

    public void setUpCreditDate(Date upCreditDate) {
        this.upCreditDate = upCreditDate;
    }

    public Date getOnlyCreditDate() {
        return onlyCreditDate;
    }

    public void setOnlyCreditDate(Date onlyCreditDate) {
        this.onlyCreditDate = onlyCreditDate;
    }

    public String getFwId() {
        return fwId;
    }

    public void setFwId(String fwId) {
        this.fwId = fwId;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }
}