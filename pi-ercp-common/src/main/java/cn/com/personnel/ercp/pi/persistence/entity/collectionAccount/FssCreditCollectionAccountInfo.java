package cn.com.personnel.ercp.pi.persistence.entity.collectionAccount;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_credit_collection_account_info")
public class FssCreditCollectionAccountInfo {
    /**
     * 信用类回款台账信息ID
     */
    @Id
    @Column(name = "cca_id")
    @GeneratedValue(generator = "JDBC")
    private String ccaId;

    /**
     * 录入人ID
     */
    @Column(name = "applicant_id")
    private String applicantId;

    /**
     * 录入人姓名
     */
    @Column(name = "applicant_name")
    private String applicantName;

    /**
     * 申请时间
     */
    @Column(name = "applicant_date")
    private String applicantDate;

    /**
     * 融资方式字典表ID
     */
    @Column(name = "financing_method_id")
    private String financingMethodId;

    /**
     * 融资方式
     */
    @Column(name = "financing_method")
    private String financingMethod;

    /**
     * 收款单位ID
     */
    @Column(name = "receiving_unit_id")
    private String receivingUnitId;

    /**
     * 收款单位
     */
    @Column(name = "receiving_unit")
    private String receivingUnit;

    /**
     * 融资金额
     */
    @Column(name = "financing_amount")
    private BigDecimal financingAmount;

    /**
     * 融资日期
     */
    @Column(name = "financing_date")
    private String financingDate;

    /**
     * 融资编号
     */
    @Column(name = "financing_number")
    private String financingNumber;

    /**
     * 承诺付款方ID
     */
    @Column(name = "promise_payer_id")
    private String promisePayerId;

    /**
     * 承诺付款方
     */
    @Column(name = "promise_payer")
    private String promisePayer;

    /**
     * 资金方（银行）ID
     */
    @Column(name = "funder_id")
    private String funderId;

    /**
     * 资金方（银行）
     */
    private String funder;

    /**
     * 承诺付款日期
     */
    @Column(name = "commitment_payment_date")
    private String commitmentPaymentDate;

    /**
     * 融资状态
     */
    @Column(name = "financing_status")
    private String financingStatus;

    /**
     * 业务负责人ID
     */
    @Column(name = "business_owners_id")
    private String businessOwnersId;

    /**
     * 业务负责人
     */
    @Column(name = "business_owners")
    private String businessOwners;

    /**
     * 放款日期
     */
    @Column(name = "loan_date")
    private String loanDate;

    /**
     * 版本号
     */
    private String version;

    /**
     * 备注
     */
    private String remark;

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
     * 预留
     */
    private String reverse;

    /**
     * 获取信用类回款台账信息ID
     *
     * @return cca_id - 信用类回款台账信息ID
     */
    public String getCcaId() {
        return ccaId;
    }

    /**
     * 设置信用类回款台账信息ID
     *
     * @param ccaId 信用类回款台账信息ID
     */
    public void setCcaId(String ccaId) {
        this.ccaId = ccaId;
    }

    /**
     * 获取录入人ID
     *
     * @return applicant_id - 录入人ID
     */
    public String getApplicantId() {
        return applicantId;
    }

    /**
     * 设置录入人ID
     *
     * @param applicantId 录入人ID
     */
    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * 获取录入人姓名
     *
     * @return applicant_name - 录入人姓名
     */
    public String getApplicantName() {
        return applicantName;
    }

    /**
     * 设置录入人姓名
     *
     * @param applicantName 录入人姓名
     */
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
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
     * 获取融资方式字典表ID
     *
     * @return financing_method_id - 融资方式字典表ID
     */
    public String getFinancingMethodId() {
        return financingMethodId;
    }

    /**
     * 设置融资方式字典表ID
     *
     * @param financingMethodId 融资方式字典表ID
     */
    public void setFinancingMethodId(String financingMethodId) {
        this.financingMethodId = financingMethodId;
    }

    /**
     * 获取融资方式
     *
     * @return financing_method - 融资方式
     */
    public String getFinancingMethod() {
        return financingMethod;
    }

    /**
     * 设置融资方式
     *
     * @param financingMethod 融资方式
     */
    public void setFinancingMethod(String financingMethod) {
        this.financingMethod = financingMethod;
    }

    /**
     * 获取收款单位ID
     *
     * @return receiving_unit_id - 收款单位ID
     */
    public String getReceivingUnitId() {
        return receivingUnitId;
    }

    /**
     * 设置收款单位ID
     *
     * @param receivingUnitId 收款单位ID
     */
    public void setReceivingUnitId(String receivingUnitId) {
        this.receivingUnitId = receivingUnitId;
    }

    /**
     * 获取收款单位
     *
     * @return receiving_unit - 收款单位
     */
    public String getReceivingUnit() {
        return receivingUnit;
    }

    /**
     * 设置收款单位
     *
     * @param receivingUnit 收款单位
     */
    public void setReceivingUnit(String receivingUnit) {
        this.receivingUnit = receivingUnit;
    }

    /**
     * 获取融资金额
     *
     * @return financing_amount - 融资金额
     */
    public BigDecimal getFinancingAmount() {
        return financingAmount;
    }

    /**
     * 设置融资金额
     *
     * @param financingAmount 融资金额
     */
    public void setFinancingAmount(BigDecimal financingAmount) {
        this.financingAmount = financingAmount;
    }

    /**
     * 获取融资日期
     *
     * @return financing_date - 融资日期
     */
    public String getFinancingDate() {
        return financingDate;
    }

    /**
     * 设置融资日期
     *
     * @param financingDate 融资日期
     */
    public void setFinancingDate(String financingDate) {
        this.financingDate = financingDate;
    }

    /**
     * 获取融资编号
     *
     * @return financing_number - 融资编号
     */
    public String getFinancingNumber() {
        return financingNumber;
    }

    /**
     * 设置融资编号
     *
     * @param financingNumber 融资编号
     */
    public void setFinancingNumber(String financingNumber) {
        this.financingNumber = financingNumber;
    }

    /**
     * 获取承诺付款方ID
     *
     * @return promise_payer_id - 承诺付款方ID
     */
    public String getPromisePayerId() {
        return promisePayerId;
    }

    /**
     * 设置承诺付款方ID
     *
     * @param promisePayerId 承诺付款方ID
     */
    public void setPromisePayerId(String promisePayerId) {
        this.promisePayerId = promisePayerId;
    }

    /**
     * 获取承诺付款方
     *
     * @return promise_payer - 承诺付款方
     */
    public String getPromisePayer() {
        return promisePayer;
    }

    /**
     * 设置承诺付款方
     *
     * @param promisePayer 承诺付款方
     */
    public void setPromisePayer(String promisePayer) {
        this.promisePayer = promisePayer;
    }

    /**
     * 获取资金方（银行）ID
     *
     * @return funder_id - 资金方（银行）ID
     */
    public String getFunderId() {
        return funderId;
    }

    /**
     * 设置资金方（银行）ID
     *
     * @param funderId 资金方（银行）ID
     */
    public void setFunderId(String funderId) {
        this.funderId = funderId;
    }

    /**
     * 获取资金方（银行）
     *
     * @return funder - 资金方（银行）
     */
    public String getFunder() {
        return funder;
    }

    /**
     * 设置资金方（银行）
     *
     * @param funder 资金方（银行）
     */
    public void setFunder(String funder) {
        this.funder = funder;
    }

    /**
     * 获取承诺付款日期
     *
     * @return commitment_payment_date - 承诺付款日期
     */
    public String getCommitmentPaymentDate() {
        return commitmentPaymentDate;
    }

    /**
     * 设置承诺付款日期
     *
     * @param commitmentPaymentDate 承诺付款日期
     */
    public void setCommitmentPaymentDate(String commitmentPaymentDate) {
        this.commitmentPaymentDate = commitmentPaymentDate;
    }

    /**
     * 获取融资状态
     *
     * @return financing_status - 融资状态
     */
    public String getFinancingStatus() {
        return financingStatus;
    }

    /**
     * 设置融资状态
     *
     * @param financingStatus 融资状态
     */
    public void setFinancingStatus(String financingStatus) {
        this.financingStatus = financingStatus;
    }

    /**
     * 获取业务负责人ID
     *
     * @return business_owners_id - 业务负责人ID
     */
    public String getBusinessOwnersId() {
        return businessOwnersId;
    }

    /**
     * 设置业务负责人ID
     *
     * @param businessOwnersId 业务负责人ID
     */
    public void setBusinessOwnersId(String businessOwnersId) {
        this.businessOwnersId = businessOwnersId;
    }

    /**
     * 获取业务负责人
     *
     * @return business_owners - 业务负责人
     */
    public String getBusinessOwners() {
        return businessOwners;
    }

    /**
     * 设置业务负责人
     *
     * @param businessOwners 业务负责人
     */
    public void setBusinessOwners(String businessOwners) {
        this.businessOwners = businessOwners;
    }

    /**
     * 获取放款日期
     *
     * @return loan_date - 放款日期
     */
    public String getLoanDate() {
        return loanDate;
    }

    /**
     * 设置放款日期
     *
     * @param loanDate 放款日期
     */
    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
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
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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

    /**
     * 获取预留
     *
     * @return reverse - 预留
     */
    public String getReverse() {
        return reverse;
    }

    /**
     * 设置预留
     *
     * @param reverse 预留
     */
    public void setReverse(String reverse) {
        this.reverse = reverse;
    }
}