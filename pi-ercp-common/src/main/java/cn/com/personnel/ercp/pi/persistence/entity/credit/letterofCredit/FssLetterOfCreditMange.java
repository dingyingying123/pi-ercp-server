package cn.com.personnel.ercp.pi.persistence.entity.credit.letterofCredit;

import java.math.BigDecimal;
import java.text.Bidi;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_letter_of_credit_mange")
public class FssLetterOfCreditMange {
    /**
     * 主键
     */
    @Id
    @Column(name = "flocm_id")
    private String flocmId;

    /**
     * 申请单号
     */
    @Column(name = "letter_number")
    private String letterNumber;

    /**
     * 申请人id
     */
    @Column(name = "applicant_id")
    private String applicantId;

    /**
     * 申请人姓名
     */
    @Column(name = "applicant_name")
    private String applicantName;

    /**
     * 合同号
     */
    @Column(name = "contract_no")
    private String contractNo;

    /**
     * 档案号
     */
    @Column(name = "file_number")
    private String fileNumber;

    /**
     * 信用证编号
     */
    @Column(name = "credit_no")
    private String creditNo;

    /**
     * 公司名称
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 公司id
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 开立银行总行ID
     */
    @Column(name = "head_id")
    private String headId;

    /**
     * 开立银行总行编码
     */
    @Column(name = "head_code")
    private String headCode;

    /**
     * 开立银行总行名称
     */
    @Column(name = "head_name")
    private String headName;

    /**
     * 信用证性质
     */
    @Column(name = "form_credit")
    private String formCredit;

    /**
     * 币种id
     */
    @Column(name = "currency_id")
    private String currencyId;

    /**
     * 币种编码
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 币种
     */
    @Column(name = "currency_name")
    private String currencyName;

    /**
     * 汇率
     */
    private String exchange;

    /**
     * 信用证金额
     */
    @Column(name = "credit_amount")
    private BigDecimal creditAmount;

    /**
     * 折后金额
     */
    @Column(name = "after_discount")
    private BigDecimal afterDiscount;

    /**
     * 生效日期
     */
    @Column(name = "effective_date")
    private Date effectiveDate;

    /**
     * 预计截止日期
     */
    @Column(name = "stimatede_deadline")
    private Date stimatedeDeadline;

    /**
     * 受益人ID，供应商编码
     */
    @Column(name = "beneficiary_id")
    private String beneficiaryId;

    /**
     * 受益人名称，供应商名称
     */
    @Column(name = "beneficiary_name")
    private String beneficiaryName;

    /**
    * 状态  在办中 结清
    */
    private String status;

    /**
     * 备注
     */
    private String remarks;
    
    /** 
    * 通知状态 
    */
    private String noticeStatus;
    
    /** 
    * 手续费总计
    */
    private BigDecimal serviceChargeTotal;

    /**
    * 通知时间
    */
    private Date noticeTime;

    /**
    * 信用证申请id
    */
    private String letterId;

    /**
    * 合同余额
    */
    private BigDecimal balanceContract;
    private Date updateTime;
    private Date createTime;
    private String updator;
    private String creator;

    /**
     * 获取主键
     *
     * @return flocm_id - 主键
     */
    public String getFlocmId() {
        return flocmId;
    }

    /**
     * 设置主键
     *
     * @param flocmId 主键
     */
    public void setFlocmId(String flocmId) {
        this.flocmId = flocmId;
    }

    /**
     * 获取申请单号
     *
     * @return letter_number - 申请单号
     */
    public String getLetterNumber() {
        return letterNumber;
    }

    /**
     * 设置申请单号
     *
     * @param letterNumber 申请单号
     */
    public void setLetterNumber(String letterNumber) {
        this.letterNumber = letterNumber;
    }

    /**
     * 获取申请人id
     *
     * @return applicant_id - 申请人id
     */
    public String getApplicantId() {
        return applicantId;
    }

    /**
     * 设置申请人id
     *
     * @param applicantId 申请人id
     */
    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * 获取申请人姓名
     *
     * @return applicant_name - 申请人姓名
     */
    public String getApplicantName() {
        return applicantName;
    }

    /**
     * 设置申请人姓名
     *
     * @param applicantName 申请人姓名
     */
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    /**
     * 获取合同号
     *
     * @return contract_no - 合同号
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * 设置合同号
     *
     * @param contractNo 合同号
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    /**
     * 获取档案号
     *
     * @return file_number - 档案号
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * 设置档案号
     *
     * @param fileNumber 档案号
     */
    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    /**
     * 获取信用证编号
     *
     * @return credit_no - 信用证编号
     */
    public String getCreditNo() {
        return creditNo;
    }

    /**
     * 设置信用证编号
     *
     * @param creditNo 信用证编号
     */
    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo;
    }

    /**
     * 获取公司名称
     *
     * @return organ_name - 公司名称
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * 设置公司名称
     *
     * @param organName 公司名称
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * 获取公司id
     *
     * @return organ_id - 公司id
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置公司id
     *
     * @param organId 公司id
     */
    public void setOrganId(String organId) {
        this.organId = organId;
    }

    /**
     * 获取开立银行总行ID
     *
     * @return head_id - 开立银行总行ID
     */
    public String getHeadId() {
        return headId;
    }

    /**
     * 设置开立银行总行ID
     *
     * @param headId 开立银行总行ID
     */
    public void setHeadId(String headId) {
        this.headId = headId;
    }

    /**
     * 获取开立银行总行编码
     *
     * @return head_code - 开立银行总行编码
     */
    public String getHeadCode() {
        return headCode;
    }

    /**
     * 设置开立银行总行编码
     *
     * @param headCode 开立银行总行编码
     */
    public void setHeadCode(String headCode) {
        this.headCode = headCode;
    }

    /**
     * 获取开立银行总行名称
     *
     * @return head_name - 开立银行总行名称
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * 设置开立银行总行名称
     *
     * @param headName 开立银行总行名称
     */
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    /**
     * 获取信用证性质
     *
     * @return form _credit - 信用证性质
     */
    public String getFormCredit() {
        return formCredit;
    }

    /**
     * 设置信用证性质
     *
     * @param formCredit 信用证性质
     */
    public void setFormCredit(String formCredit) {
        this.formCredit = formCredit;
    }

    /**
     * 获取币种id
     *
     * @return currency_id - 币种id
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * 设置币种id
     *
     * @param currencyId 币种id
     */
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * 获取币种编码
     *
     * @return currency_code - 币种编码
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置币种编码
     *
     * @param currencyCode 币种编码
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * 获取币种
     *
     * @return currency_name - 币种
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
     * 获取汇率
     *
     * @return exchange - 汇率
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * 设置汇率
     *
     * @param exchange 汇率
     */
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /**
     * 获取信用证金额
     *
     * @return credit_amount - 信用证金额
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * 设置信用证金额
     *
     * @param creditAmount 信用证金额
     */
    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * 获取折后金额
     *
     * @return after_discount - 折后金额
     */
    public BigDecimal getAfterDiscount() {
        return afterDiscount;
    }

    /**
     * 设置折后金额
     *
     * @param afterDiscount 折后金额
     */
    public void setAfterDiscount(BigDecimal afterDiscount) {
        this.afterDiscount = afterDiscount;
    }

    /**
     * 获取生效日期
     *
     * @return effective_date  - 生效日期
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置生效日期
     *
     * @param effectiveDate 生效日期
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * 获取预计截止日期
     *
     * @return stimatede_deadline - 预计截止日期
     */
    public Date getStimatedeDeadline() {
        return stimatedeDeadline;
    }

    /**
     * 设置预计截止日期
     *
     * @param stimatedeDeadline 预计截止日期
     */
    public void setStimatedeDeadline(Date stimatedeDeadline) {
        this.stimatedeDeadline = stimatedeDeadline;
    }

    /**
     * 获取受益人ID，供应商编码
     *
     * @return beneficiary_id - 受益人ID，供应商编码
     */
    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    /**
     * 设置受益人ID，供应商编码
     *
     * @param beneficiaryId 受益人ID，供应商编码
     */
    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    /**
     * 获取受益人名称，供应商名称
     *
     * @return beneficiary_name - 受益人名称，供应商名称
     */
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    /**
     * 设置受益人名称，供应商名称
     *
     * @param beneficiaryName 受益人名称，供应商名称
     */
    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public BigDecimal getBalanceContract() {
        return balanceContract;
    }

    public void setBalanceContract(BigDecimal balanceContract) {
        this.balanceContract = balanceContract;
    }

    public String getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(String noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public BigDecimal getServiceChargeTotal() {
        return serviceChargeTotal;
    }

    public void setServiceChargeTotal(BigDecimal serviceChargeTotal) {
        this.serviceChargeTotal = serviceChargeTotal;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getLetterId() {
        return letterId;
    }

    public void setLetterId(String letterId) {
        this.letterId = letterId;
    }
}