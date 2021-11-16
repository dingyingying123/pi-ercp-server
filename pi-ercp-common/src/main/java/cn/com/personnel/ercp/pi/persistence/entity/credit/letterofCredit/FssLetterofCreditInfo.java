package cn.com.personnel.ercp.pi.persistence.entity.credit.letterofCredit;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_letter_of_credit_info")
public class FssLetterofCreditInfo {
    /**
     * 信用证ID
     */
    @Id
    @Column(name = "letter_id")
    @GeneratedValue(generator = "JDBC")
    private String letterId;

    /**
     * 申请单号
     */
    @Column(name = "letter_number")
    private String letterNumber;

    /**
     * 申请人ID
     */
    @Column(name = "applicant_id")
    private String applicantId;

    /**
     * 申请人姓名
     */
    @Column(name = "applicant_name")
    private String applicantName;

    /**
     * 申请部门
     */
    @Column(name = "applicant_dept")
    private String applicantDept;

    /**
     * 申请时间
     */
    @Column(name = "applicant_date")
    private String applicantDate;

    /**
     * 事件描述
     */
    @Column(name = "event_description")
    private String eventDescription;

    /**
     * 公司ID，组织ID
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 公司名称
     */
    @Column(name = "organ_name")
    private String organName;

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
     * 信用证金额（元）
     */
    @Column(name = "credit_amount")
    private BigDecimal creditAmount;

    /**
     * 合同号
     */
    @Column(name = "contract_no")
    private String contractNo;

    /**
     * 信用证编号
     */
    @Column(name = "credit_no")
    private String creditNo;

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
     * 业务描述
     */
    @Column(name = "business_description")
    private String businessDescription;

    /**
     * 信用证状态
     */
    private String status;

    /**
     * 流程审批状态
     */
    @Column(name = "approval_status")
    private String approvalStatus;

    /**
     * 流程审批时间
     */
    @Column(name = "approval_time")
    private String approvalTime;

    /**
     * 版本号
     */
    private String version;

    /**
     * 预留
     */
    private String reserve;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 是否删除 0：未删除，1：已删除
     */
    private String deleted;

    /**
     * 获取信用证ID
     *
     * @return letter_id - 信用证ID
     */
    public String getLetterId() {
        return letterId;
    }

    /**
     * 设置信用证ID
     *
     * @param letterId 信用证ID
     */
    public void setLetterId(String letterId) {
        this.letterId = letterId;
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
     * 获取申请人ID
     *
     * @return applicant_id - 申请人ID
     */
    public String getApplicantId() {
        return applicantId;
    }

    /**
     * 设置申请人ID
     *
     * @param applicantId 申请人ID
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
     * 获取申请部门
     *
     * @return applicant_dept - 申请部门
     */
    public String getApplicantDept() {
        return applicantDept;
    }

    /**
     * 设置申请部门
     *
     * @param applicantDept 申请部门
     */
    public void setApplicantDept(String applicantDept) {
        this.applicantDept = applicantDept;
    }

    /**
     * 获取申请时间
     *
     * @return applicant_date - 申请时间
     */
    public String getApplicantDate() {
        return applicantDate;
    }

    /**
     * 设置申请时间
     *
     * @param applicantDate 申请时间
     */
    public void setApplicantDate(String applicantDate) {
        this.applicantDate = applicantDate;
    }

    /**
     * 获取事件描述
     *
     * @return event_description - 事件描述
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * 设置事件描述
     *
     * @param eventDescription 事件描述
     */
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    /**
     * 获取公司ID，组织ID
     *
     * @return organ_id - 公司ID，组织ID
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置公司ID，组织ID
     *
     * @param organId 公司ID，组织ID
     */
    public void setOrganId(String organId) {
        this.organId = organId;
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
     * 获取信用证金额（元）
     *
     * @return credit_amount - 信用证金额（元）
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * 设置信用证金额（元）
     *
     * @param creditAmount 信用证金额（元）
     */
    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
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
     * 获取业务描述
     *
     * @return business_description - 业务描述
     */
    public String getBusinessDescription() {
        return businessDescription;
    }

    /**
     * 设置业务描述
     *
     * @param businessDescription 业务描述
     */
    public void setBusinessDescription(String businessDescription) {
        this.businessDescription = businessDescription;
    }

    /**
     * 获取信用证状态
     *
     * @return status - 信用证状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置信用证状态
     *
     * @param status 信用证状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取流程审批状态
     *
     * @return approval_status - 流程审批状态
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * 设置流程审批状态
     *
     * @param approvalStatus 流程审批状态
     */
    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    /**
     * 获取流程审批时间
     *
     * @return approval_time - 流程审批时间
     */
    public String getApprovalTime() {
        return approvalTime;
    }

    /**
     * 设置流程审批时间
     *
     * @param approvalTime 流程审批时间
     */
    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取预留
     *
     * @return reserve - 预留
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * 设置预留
     *
     * @param reserve 预留
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
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

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}