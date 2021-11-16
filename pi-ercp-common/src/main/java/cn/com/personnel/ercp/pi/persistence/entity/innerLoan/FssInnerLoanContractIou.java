package cn.com.personnel.ercp.pi.persistence.entity.innerLoan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_inner_loan_contract_iou")
public class FssInnerLoanContractIou {
    /**
     * 借据主键id
     */
    @Id
    @Column(name = "iou_id")
    @GeneratedValue(generator = "JDBC")
    private String iouId;

    /**
     * 借据名称
     */
    @Column(name = "iou_name")
    private String iouName;

    /**
     * 提款日期
     */
    @Column(name = "withdraw_date")
    private Date withdrawDate;

    /**
     * 入账日期
     */
    @Column(name = "credit_date")
    private Date creditDate;

    /**
     * 币种
     */
    @Column(name = "currency_type")
    private String currencyType;

    /**
     * 提款金额
     */
    @Column(name = "withdraw_amount")
    private BigDecimal withdrawAmount;

    /**
     * 汇率
     */
    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * 提款金额折后金额（元）
     */
    @Column(name = "withdraw_after_discount_amount")
    private BigDecimal withdrawAfterDiscountAmount;

    /**
     * 利率类型
     */
    @Column(name = "interest_rate_type")
    private String interestRateType;

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
     * 借据利率
     */
    @Column(name = "iou_interest_rate")
    private BigDecimal iouInterestRate;

    /**
     * 调息方式
     */
    @Column(name = "adjust_interest_way")
    private String adjustInterestWay;

    /**
     * 调息日
     */
    @Column(name = "adjust_interest_date")
    private String adjustInterestDate;

    /**
     * 调息具体日期
     */
    @Column(name = "adjust_interest_specific_time")
    private Date adjustInterestSpecificTime;

    /**
     * 调息间隔
     */
    @Column(name = "adjust_interest_interval")
    private String adjustInterestInterval;

    /**
     * 首次付息日
     */
    @Column(name = "first_interest_payment_date")
    private Date firstInterestPaymentDate;

    /**
     * 付息间隔
     */
    @Column(name = "interest_payment_interval")
    private String interestPaymentInterval;

    /**
     * 是否已上传盖章版合同
     */
    @Column(name = "seal_contract_upload")
    private String sealContractUpload;

    /**
     * 入账状态
     */
    @Column(name = "credit_status")
    private String creditStatus;

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
     * 备注
     */
    private String remarks;

    /**
     * 提款金额合计
     */
    @Column(name = "total_withdraw_amount")
    private BigDecimal totalWithdrawAmount;

    /**
     * 提款金额折后金额合计
     */
    @Column(name = "total_withdraw_after_discount_amount")
    private BigDecimal totalWithdrawAfterDiscountAmount;

    /**
     * 合同id
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 乐观锁
     */
    private Integer revision;

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
     * 更新人
     */
    private String updater;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 合同文本编号
     */
    @Column(name = "contract_num")
    private String contractNum;

    /**
     * 借款方,公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 借款方ID,公司id
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 贷款方,公司名称
     */
    @Column(name = "lender_company_name")
    private String lenderCompanyName;

    /**
     * 贷款方ID,公司id
     */
    @Column(name = "lender_company_id")
    private String lenderCompanyId;

    /**
     * 利率浮动方式描述
     */
    @Column(name = "float_interest_way_desc")
    private String floatInterestWayDesc;

    /**
     * 贷款期限（年）
     */
    @Column(name = "loan_term_year")
    private String loanTermYear;

    /**
     * 借款起始日期
     */
    @Column(name = "loan_start_date")
    private String loanStartDate;

    /**
     * 借款到期日期
     */
    @Column(name = "loan_end_date")
    private String loanEndDate;

    /**
     * 计息天数
     */
    @Column(name="interest_days")
    private int interestDays;
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
     * 利率类型id
     */
    @Column(name = "interest_rate_type_id")
    private String interestRateTypeId;

    @Column(name="calculation_status")
    private String calculationStatus;

    @Column(name="iou_balance")
    private BigDecimal iouBalance;

    @Column(name="sap_reversal_document_no")
    private String sapReversalDocumentNo;

    @Column(name="reversal_error_message")
    private String reversalErrorMessage;
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
     * 获取借据名称
     *
     * @return iou_name - 借据名称
     */
    public String getIouName() {
        return iouName;
    }

    /**
     * 设置借据名称
     *
     * @param iouName 借据名称
     */
    public void setIouName(String iouName) {
        this.iouName = iouName;
    }

    /**
     * 获取提款日期
     *
     * @return withdraw_date - 提款日期
     */
    public Date getWithdrawDate() {
        return withdrawDate;
    }

    /**
     * 设置提款日期
     *
     * @param withdrawDate 提款日期
     */
    public void setWithdrawDate(Date withdrawDate) {
        this.withdrawDate = withdrawDate;
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
     * 获取币种
     *
     * @return currency_type - 币种
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * 设置币种
     *
     * @param currencyType 币种
     */
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
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
     * 获取提款金额折后金额（元）
     *
     * @return withdraw_after_discount_amount - 提款金额折后金额（元）
     */
    public BigDecimal getWithdrawAfterDiscountAmount() {
        return withdrawAfterDiscountAmount;
    }

    /**
     * 设置提款金额折后金额（元）
     *
     * @param withdrawAfterDiscountAmount 提款金额折后金额（元）
     */
    public void setWithdrawAfterDiscountAmount(BigDecimal withdrawAfterDiscountAmount) {
        this.withdrawAfterDiscountAmount = withdrawAfterDiscountAmount;
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
     * 获取借据利率
     *
     * @return iou_interest_rate - 借据利率
     */
    public BigDecimal getIouInterestRate() {
        return iouInterestRate;
    }

    /**
     * 设置借据利率
     *
     * @param iouInterestRate 借据利率
     */
    public void setIouInterestRate(BigDecimal iouInterestRate) {
        this.iouInterestRate = iouInterestRate;
    }

    /**
     * 获取调息方式
     *
     * @return adjust_interest_way - 调息方式
     */
    public String getAdjustInterestWay() {
        return adjustInterestWay;
    }

    /**
     * 设置调息方式
     *
     * @param adjustInterestWay 调息方式
     */
    public void setAdjustInterestWay(String adjustInterestWay) {
        this.adjustInterestWay = adjustInterestWay;
    }

    /**
     * 获取调息日
     *
     * @return adjust_interest_date - 调息日
     */
    public String getAdjustInterestDate() {
        return adjustInterestDate;
    }

    /**
     * 设置调息日
     *
     * @param adjustInterestDate 调息日
     */
    public void setAdjustInterestDate(String adjustInterestDate) {
        this.adjustInterestDate = adjustInterestDate;
    }

    /**
     * 获取调息具体日期
     *
     * @return adjust_interest_specific_time - 调息具体日期
     */
    public Date getAdjustInterestSpecificTime() {
        return adjustInterestSpecificTime;
    }

    /**
     * 设置调息具体日期
     *
     * @param adjustInterestSpecificTime 调息具体日期
     */
    public void setAdjustInterestSpecificTime(Date adjustInterestSpecificTime) {
        this.adjustInterestSpecificTime = adjustInterestSpecificTime;
    }

    /**
     * 获取调息间隔
     *
     * @return adjust_interest_interval - 调息间隔
     */
    public String getAdjustInterestInterval() {
        return adjustInterestInterval;
    }

    /**
     * 设置调息间隔
     *
     * @param adjustInterestInterval 调息间隔
     */
    public void setAdjustInterestInterval(String adjustInterestInterval) {
        this.adjustInterestInterval = adjustInterestInterval;
    }

    /**
     * 获取首次付息日
     *
     * @return first_interest_payment_date - 首次付息日
     */
    public Date getFirstInterestPaymentDate() {
        return firstInterestPaymentDate;
    }

    /**
     * 设置首次付息日
     *
     * @param firstInterestPaymentDate 首次付息日
     */
    public void setFirstInterestPaymentDate(Date firstInterestPaymentDate) {
        this.firstInterestPaymentDate = firstInterestPaymentDate;
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
     * 获取是否已上传盖章版合同
     *
     * @return seal_contract_upload - 是否已上传盖章版合同
     */
    public String getSealContractUpload() {
        return sealContractUpload;
    }

    /**
     * 设置是否已上传盖章版合同
     *
     * @param sealContractUpload 是否已上传盖章版合同
     */
    public void setSealContractUpload(String sealContractUpload) {
        this.sealContractUpload = sealContractUpload;
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
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取提款金额合计
     *
     * @return total_withdraw_amount - 提款金额合计
     */
    public BigDecimal getTotalWithdrawAmount() {
        return totalWithdrawAmount;
    }

    /**
     * 设置提款金额合计
     *
     * @param totalWithdrawAmount 提款金额合计
     */
    public void setTotalWithdrawAmount(BigDecimal totalWithdrawAmount) {
        this.totalWithdrawAmount = totalWithdrawAmount;
    }

    /**
     * 获取提款金额折后金额合计
     *
     * @return total_withdraw_after_discount_amount - 提款金额折后金额合计
     */
    public BigDecimal getTotalWithdrawAfterDiscountAmount() {
        return totalWithdrawAfterDiscountAmount;
    }

    /**
     * 设置提款金额折后金额合计
     *
     * @param totalWithdrawAfterDiscountAmount 提款金额折后金额合计
     */
    public void setTotalWithdrawAfterDiscountAmount(BigDecimal totalWithdrawAfterDiscountAmount) {
        this.totalWithdrawAfterDiscountAmount = totalWithdrawAfterDiscountAmount;
    }

    /**
     * 获取合同id
     *
     * @return manageId - 合同id
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置合同id
     *
     * @param manageId 合同id
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    /**
     * 获取乐观锁
     *
     * @return revision - 乐观锁
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * 设置乐观锁
     *
     * @param revision 乐观锁
     */
    public void setRevision(Integer revision) {
        this.revision = revision;
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
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新人
     *
     * @return updater - 更新人
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设置更新人
     *
     * @param updater 更新人
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
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
     * @return contract_num - 合同文本编号
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * 设置合同文本编号
     *
     * @param contractNum 合同文本编号
     */
    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    /**
     * 获取借款方,公司名称
     *
     * @return company_name - 借款方,公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置借款方,公司名称
     *
     * @param companyName 借款方,公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取借款方ID,公司id
     *
     * @return company_id - 借款方ID,公司id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置借款方ID,公司id
     *
     * @param companyId 借款方ID,公司id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取贷款方,公司名称
     *
     * @return lender_company_name - 贷款方,公司名称
     */
    public String getLenderCompanyName() {
        return lenderCompanyName;
    }

    /**
     * 设置贷款方,公司名称
     *
     * @param lenderCompanyName 贷款方,公司名称
     */
    public void setLenderCompanyName(String lenderCompanyName) {
        this.lenderCompanyName = lenderCompanyName;
    }

    /**
     * 获取贷款方ID,公司id
     *
     * @return lender_company_id - 贷款方ID,公司id
     */
    public String getLenderCompanyId() {
        return lenderCompanyId;
    }

    /**
     * 设置贷款方ID,公司id
     *
     * @param lenderCompanyId 贷款方ID,公司id
     */
    public void setLenderCompanyId(String lenderCompanyId) {
        this.lenderCompanyId = lenderCompanyId;
    }

    /**
     * 获取利率浮动方式描述
     *
     * @return float_interest_way_desc - 利率浮动方式描述
     */
    public String getFloatInterestWayDesc() {
        return floatInterestWayDesc;
    }

    /**
     * 设置利率浮动方式描述
     *
     * @param floatInterestWayDesc 利率浮动方式描述
     */
    public void setFloatInterestWayDesc(String floatInterestWayDesc) {
        this.floatInterestWayDesc = floatInterestWayDesc;
    }

    /**
     * 获取贷款期限（年）
     *
     * @return loan_term_year - 贷款期限（年）
     */
    public String getLoanTermYear() {
        return loanTermYear;
    }

    /**
     * 设置贷款期限（年）
     *
     * @param loanTermYear 贷款期限（年）
     */
    public void setLoanTermYear(String loanTermYear) {
        this.loanTermYear = loanTermYear;
    }

    /**
     * 获取借款起始日期
     *
     * @return loan_start_date - 借款起始日期
     */
    public String getLoanStartDate() {
        return loanStartDate;
    }

    /**
     * 设置借款起始日期
     *
     * @param loanStartDate 借款起始日期
     */
    public void setLoanStartDate(String loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    /**
     * 获取借款到期日期
     *
     * @return loan_end_date - 借款到期日期
     */
    public String getLoanEndDate() {
        return loanEndDate;
    }

    /**
     * 设置借款到期日期
     *
     * @param loanEndDate 借款到期日期
     */
    public void setLoanEndDate(String loanEndDate) {
        this.loanEndDate = loanEndDate;
    }

    public int getInterestDays() {
        return interestDays;
    }

    public void setInterestDays(int interestDays) {
        this.interestDays = interestDays;
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

    public String getInterestRateTypeId() {
        return interestRateTypeId;
    }

    public void setInterestRateTypeId(String interestRateTypeId) {
        this.interestRateTypeId = interestRateTypeId;
    }

    public String getCalculationStatus() {
        return calculationStatus;
    }

    public void setCalculationStatus(String calculationStatus) {
        this.calculationStatus = calculationStatus;
    }

    public BigDecimal getIouBalance() {
        return iouBalance;
    }

    public void setIouBalance(BigDecimal iouBalance) {
        this.iouBalance = iouBalance;
    }

    public String getSapReversalDocumentNo() {
        return sapReversalDocumentNo;
    }

    public void setSapReversalDocumentNo(String sapReversalDocumentNo) {
        this.sapReversalDocumentNo = sapReversalDocumentNo;
    }

    public String getReversalErrorMessage() {
        return reversalErrorMessage;
    }

    public void setReversalErrorMessage(String reversalErrorMessage) {
        this.reversalErrorMessage = reversalErrorMessage;
    }
}