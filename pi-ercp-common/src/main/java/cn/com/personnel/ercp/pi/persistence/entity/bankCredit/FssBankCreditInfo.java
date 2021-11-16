package cn.com.personnel.ercp.pi.persistence.entity.bankCredit;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_bank_credit_info")
public class FssBankCreditInfo {
    /**
     * 银行授信ID
     */
    @Id
    @Column(name = "bc_id")
    @GeneratedValue(generator = "JDBC")
    private String bcId;

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
     * 申请部门ID
     */
    @Column(name = "applicant_dept_id")
    private String applicantDeptId;

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
     * 计划授信总金额（元）
     */
    @Column(name = "credit_amount")
    private BigDecimal creditAmount;

    /**
     * 授信品种字典项ID
     */
    @Column(name = "credit_varieties_id")
    private String creditVarietiesId;

    /**
     * 授信品种
     */
    @Column(name = "credit_varieties")
    private String creditVarieties;

    /**
     * 授信到期日
     */
    @Column(name = "credit_expiry_date")
    private String creditExpiryDate;

    /**
     * 银行评级
     */
    @Column(name = "bank_rating")
    private String bankRating;

    /**
     * 评级到期日
     */
    @Column(name = "rating_expiry_date")
    private String ratingExpiryDate;

    /**
     * 计划审批日期
     */
    @Column(name = "plan_approval_date")
    private String planApprovalDate;

    /**
     * 状态 0：未提交流程，1：流程审批中，2：流程审批通过
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
     * 获取银行授信ID
     *
     * @return bc_id - 银行授信ID
     */
    public String getBcId() {
        return bcId;
    }

    /**
     * 设置银行授信ID
     *
     * @param bcId 银行授信ID
     */
    public void setBcId(String bcId) {
        this.bcId = bcId;
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
     * 获取申请部门ID
     *
     * @return applicant_dept_id - 申请部门ID
     */
    public String getApplicantDeptId() {
        return applicantDeptId;
    }

    /**
     * 设置申请部门ID
     *
     * @param applicantDeptId 申请部门ID
     */
    public void setApplicantDeptId(String applicantDeptId) {
        this.applicantDeptId = applicantDeptId;
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
     * 获取计划授信总金额（元）
     *
     * @return credit_amount - 计划授信总金额（元）
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * 设置计划授信总金额（元）
     *
     * @param creditAmount 计划授信总金额（元）
     */
    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * 获取授信品种字典项ID
     *
     * @return credit_varieties_id - 授信品种字典项ID
     */
    public String getCreditVarietiesId() {
        return creditVarietiesId;
    }

    /**
     * 设置授信品种字典项ID
     *
     * @param creditVarietiesId 授信品种字典项ID
     */
    public void setCreditVarietiesId(String creditVarietiesId) {
        this.creditVarietiesId = creditVarietiesId;
    }

    /**
     * 获取授信品种
     *
     * @return credit_varieties - 授信品种
     */
    public String getCreditVarieties() {
        return creditVarieties;
    }

    /**
     * 设置授信品种
     *
     * @param creditVarieties 授信品种
     */
    public void setCreditVarieties(String creditVarieties) {
        this.creditVarieties = creditVarieties;
    }

    /**
     * 获取授信到期日
     *
     * @return credit_expiry_date - 授信到期日
     */
    public String getCreditExpiryDate() {
        return creditExpiryDate;
    }

    /**
     * 设置授信到期日
     *
     * @param creditExpiryDate 授信到期日
     */
    public void setCreditExpiryDate(String creditExpiryDate) {
        this.creditExpiryDate = creditExpiryDate;
    }

    /**
     * 获取银行评级
     *
     * @return bank_rating - 银行评级
     */
    public String getBankRating() {
        return bankRating;
    }

    /**
     * 设置银行评级
     *
     * @param bankRating 银行评级
     */
    public void setBankRating(String bankRating) {
        this.bankRating = bankRating;
    }

    /**
     * 获取评级到期日
     *
     * @return rating_expiry_date - 评级到期日
     */
    public String getRatingExpiryDate() {
        return ratingExpiryDate;
    }

    /**
     * 设置评级到期日
     *
     * @param ratingExpiryDate 评级到期日
     */
    public void setRatingExpiryDate(String ratingExpiryDate) {
        this.ratingExpiryDate = ratingExpiryDate;
    }

    /**
     * 获取计划审批日期
     *
     * @return plan_approval_date - 计划审批日期
     */
    public String getPlanApprovalDate() {
        return planApprovalDate;
    }

    /**
     * 设置计划审批日期
     *
     * @param planApprovalDate 计划审批日期
     */
    public void setPlanApprovalDate(String planApprovalDate) {
        this.planApprovalDate = planApprovalDate;
    }

    /**
     * 获取状态 0：未提交流程，1：流程审批中，2：流程审批通过
     *
     * @return status - 状态 0：未提交流程，1：流程审批中，2：流程审批通过
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 0：未提交流程，1：流程审批中，2：流程审批通过
     *
     * @param status 状态 0：未提交流程，1：流程审批中，2：流程审批通过
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

    /**
     * 获取是否删除 0：未删除，1：已删除
     *
     * @return deleted - 是否删除 0：未删除，1：已删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除 0：未删除，1：已删除
     *
     * @param deleted 是否删除 0：未删除，1：已删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}