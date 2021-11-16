package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Table(name = "fss_bond_issue_application")
public class FssBondIssueApplication {
    /**
     * 主键
     */
    @Id
    @Column(name = "fbia_id")
    @GeneratedValue(generator = "JDBC")
    private String fbiaId;

    /**
     * 申请单号
     */
    @Column(name = "application_number")
    private String applicationNumber;

    /**
     * 申请人ID
     */
    @Column(name = "applicant_id")
    private String applicantId;

    /**
     * 申请人
     */
    private String applicant;

    /**
     * 申请时间
     */
    @Column(name = "time_application")
    private String timeApplication;

    /**
     * 起息日
     */
    @Column(name = "value_date")
    private Date valueDate;

    /**
     * 是否动态机制
     */
    @Column(name = "is_dynamic_mechanism")
    private String isDynamicMechanism;

    /**
     * 拟发行金额
     */
    @Column(name = "amount_to_be_issued")
    private BigDecimal amountToBeIssued;

    /**
     * 发行上限金额
     */
    @Column(name = "maximum_amount_issue")
    private BigDecimal maximumAmountIssue;

    /**
     * 发行下限金额
     */
    @Column(name = "minimum_amount_issue")
    private BigDecimal minimumAmountIssue;

    /**
     * 承销费率
     */
    @Column(name = "underwriting_fees")
    private String underwritingFees;

    /**
     * 综合成本
     */
    @Column(name = "composite_cost")
    private BigDecimal compositeCost;

    /**
     * 备注
     */
    @Column(name = "bond_remark")
    private String bondRemark;

    /**
     * 期限方式，d:天，m:月
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
    * 拟发行利率上限 proposedInterestRateCeiling
    */
    private String proposedInterestRateCeiling;
    /** 
    * 拟发行利率下限 lowerLimitInterestRateIssued
    */
    private String lowerLimitInterestRateIssued;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;

    /**
    * 债券注册主键
    */
    private String bondId;
    /**
    * 审批状态
    */
    private String approvalStatus;
    /**
    * 发行结果
    */
    private String  issuingResults;

    /**
    * 其他中介费
    */
    @Transient
    private List<FssBondIssueAgencyFeeInfo> fssBondIssueAgencyFeeInfos;

    /**
    * 流程实例id
    */
    private String  processInstId;

    /**
     * 获取主键
     *
     * @return fbia_id - 主键
     */
    public String getFbiaId() {
        return fbiaId;
    }

    /**
     * 设置主键
     *
     * @param fbiaId 主键
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

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * 获取申请人
     *
     * @return applicant - 申请人
     */
    public String getApplicant() {
        return applicant;
    }

    /**
     * 设置申请人
     *
     * @param applicant 申请人
     */
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    /**
     * 获取申请时间
     *
     * @return time_application - 申请时间
     */
    public String getTimeApplication() {
        return timeApplication;
    }

    /**
     * 设置申请时间
     *
     * @param timeApplication 申请时间
     */
    public void setTimeApplication(String timeApplication) {
        this.timeApplication = timeApplication;
    }

    /**
     * 获取起息日
     *
     * @return value_date - 起息日
     */
    public Date getValueDate() {
        return valueDate;
    }

    /**
     * 设置起息日
     *
     * @param valueDate 起息日
     */
    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    /**
     * 获取是否动态机制
     *
     * @return is_dynamic_mechanism - 是否动态机制
     */
    public String getIsDynamicMechanism() {
        return isDynamicMechanism;
    }

    /**
     * 设置是否动态机制
     *
     * @param isDynamicMechanism 是否动态机制
     */
    public void setIsDynamicMechanism(String isDynamicMechanism) {
        this.isDynamicMechanism = isDynamicMechanism;
    }

    /**
     * 获取拟发行金额
     *
     * @return amount_to_be_issued - 拟发行金额
     */
    public BigDecimal getAmountToBeIssued() {
        return amountToBeIssued;
    }

    /**
     * 设置拟发行金额
     *
     * @param amountToBeIssued 拟发行金额
     */
    public void setAmountToBeIssued(BigDecimal amountToBeIssued) {
        this.amountToBeIssued = amountToBeIssued;
    }

    /**
     * 获取发行上限金额
     *
     * @return maximum_amount_issue - 发行上限金额
     */
    public BigDecimal getMaximumAmountIssue() {
        return maximumAmountIssue;
    }

    /**
     * 设置发行上限金额
     *
     * @param maximumAmountIssue 发行上限金额
     */
    public void setMaximumAmountIssue(BigDecimal maximumAmountIssue) {
        this.maximumAmountIssue = maximumAmountIssue;
    }

    /**
     * 获取发行下限金额
     *
     * @return minimum_amount_issue - 发行下限金额
     */
    public BigDecimal getMinimumAmountIssue() {
        return minimumAmountIssue;
    }

    /**
     * 设置发行下限金额
     *
     * @param minimumAmountIssue 发行下限金额
     */
    public void setMinimumAmountIssue(BigDecimal minimumAmountIssue) {
        this.minimumAmountIssue = minimumAmountIssue;
    }

    /**
     * 获取承销费率
     *
     * @return underwriting_fees - 承销费率
     */
    public String getUnderwritingFees() {
        return underwritingFees;
    }

    /**
     * 设置承销费率
     *
     * @param underwritingFees 承销费率
     */
    public void setUnderwritingFees(String underwritingFees) {
        this.underwritingFees = underwritingFees;
    }

    /**
     * 获取综合成本
     *
     * @return composite_cost - 综合成本
     */
    public BigDecimal getCompositeCost() {
        return compositeCost;
    }

    /**
     * 设置综合成本
     *
     * @param compositeCost 综合成本
     */
    public void setCompositeCost(BigDecimal compositeCost) {
        this.compositeCost = compositeCost;
    }

    /**
     * 获取备注
     *
     * @return bond_remark - 备注
     */
    public String getBondRemark() {
        return bondRemark;
    }

    /**
     * 设置备注
     *
     * @param bondRemark 备注
     */
    public void setBondRemark(String bondRemark) {
        this.bondRemark = bondRemark;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return updator
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBondId() {
        return bondId;
    }

    public void setBondId(String bondId) {
        this.bondId = bondId;
    }

    public List<FssBondIssueAgencyFeeInfo> getFssBondIssueAgencyFeeInfos() {
        return fssBondIssueAgencyFeeInfos;
    }

    public void setFssBondIssueAgencyFeeInfos(List<FssBondIssueAgencyFeeInfo> fssBondIssueAgencyFeeInfos) {
        this.fssBondIssueAgencyFeeInfos = fssBondIssueAgencyFeeInfos;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getIssuingResults() {
        return issuingResults;
    }

    public void setIssuingResults(String issuingResults) {
        this.issuingResults = issuingResults;
    }

    public String getDeadlineMethod() {
        return deadlineMethod;
    }

    public void setDeadlineMethod(String deadlineMethod) {
        this.deadlineMethod = deadlineMethod;
    }

    public String getBondMaturityId() {
        return bondMaturityId;
    }

    public void setBondMaturityId(String bondMaturityId) {
        this.bondMaturityId = bondMaturityId;
    }

    public String getBondMaturity() {
        return bondMaturity;
    }

    public void setBondMaturity(String bondMaturity) {
        this.bondMaturity = bondMaturity;
    }

    public String getProposedInterestRateCeiling() {
        return proposedInterestRateCeiling;
    }

    public void setProposedInterestRateCeiling(String proposedInterestRateCeiling) {
        this.proposedInterestRateCeiling = proposedInterestRateCeiling;
    }

    public String getLowerLimitInterestRateIssued() {
        return lowerLimitInterestRateIssued;
    }

    public void setLowerLimitInterestRateIssued(String lowerLimitInterestRateIssued) {
        this.lowerLimitInterestRateIssued = lowerLimitInterestRateIssued;
    }

    public String getProcessInstId() {
        return processInstId;
    }

    public void setProcessInstId(String processInstId) {
        this.processInstId = processInstId;
    }
}