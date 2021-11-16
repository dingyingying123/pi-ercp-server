package cn.com.personnel.ercp.pi.persistence.entity.bankCredit;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Table(name = "fss_bank_credit_change")
public class FssBankCreditChange {
    /**
     * 主键
     */
    @Id
    @Column(name = "fbcc_id")
    @GeneratedValue(generator = "JDBC")
    private String fbccId;

    /**
     * 申请单号
     */
    @Column(name = "letter_number")
    private String letterNumber;

    /**
     * 申请人编号
     */
    @Column(name = "applicant_id")
    private String applicantId;

    /**
     * 申请人
     */
    @Column(name = "applicant_name")
    private String applicantName;

    /**
     * 申请部门编号
     */
    @Column(name = "applicant_dept_id")
    private String applicantDeptId;

    /**
     * 申请部门
     */
    @Column(name = "applicant_dept")
    private String applicantDept;

    /**
     * 申请日期
     */
    @Column(name = "applicant_date")
    private Date applicantDate;

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
     * 授信机构
     */
    @Column(name = "credit_institution")
    private String creditInstitution;

    /**
     * 授信机构编号
     */
    @Column(name = "credit_institution_code")
    private String creditInstitutionCode;

    /**
     * 授信机构id
     */
    @Column(name = "credit_institution_id")
    private String creditInstitutionId;

    /**
     * 币种
     */
    @Column(name = "currency_name")
    private String currencyName;

    /**
     * 币种编码
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 币种id
     */
    @Column(name = "currency_id")
    private String currencyId;

    /**
     * 计划授信总金额
     */
    @Column(name = "total_planned_credit_amount")
    private BigDecimal totalPlannedCreditAmount;

    /**
     * 总额度折合人命币金额
     */
    @Column(name = "amount_equivalent_currency")
    private BigDecimal amountEquivalentCurrency;

    /**
     * 占用额度
     */
    @Column(name = "occupy_quota")
    private BigDecimal occupyQuota;

    /**
     * 折合人命币金额-占用额度
     */
    @Column(name = "convert_occupy_quota")
    private BigDecimal convertOccupyQuota;

    /**
     * 使用额度
     */
    @Column(name = "use_quota")
    private BigDecimal useQuota;

    /**
     * 折合人民币金额-使用额度
     */
    @Column(name = "convert_use_quota")
    private BigDecimal convertUseQuota;

    /**
     * 剩余额度
     */
    @Column(name = "remaining_amount")
    private BigDecimal remainingAmount;

    /**
     * 折合人命币额度-剩余额度
     */
    @Column(name = "convert_remaining_amount")
    private BigDecimal convertRemainingAmount;

    /**
     * 并表占用额度
     */
    @Column(name = "consolidated_occupancy_quota")
    private BigDecimal consolidatedOccupancyQuota;

    /**
     * 折合人民币金额-并表占用额度
     */
    @Column(name = "convert_consolidated_occupancy_quota")
    private BigDecimal convertConsolidatedOccupancyQuota;

    /**
     * 非并表占用额度
     */
    @Column(name = "no_consolidated_occupancy_quota")
    private BigDecimal noConsolidatedOccupancyQuota;

    /**
     * 折合人民币金额-非并表占用额度
     */
    @Column(name = "no_convert_consolidated_occupancy_quota")
    private BigDecimal noConvertConsolidatedOccupancyQuota;

    /**
     * 并表使用额度
     */
    @Column(name = "consolidated_use_quota")
    private BigDecimal consolidatedUseQuota;

    /**
     * 折合人民币金额-并表使用额度
     */
    @Column(name = "convert_consolidated_use_quota")
    private BigDecimal convertConsolidatedUseQuota;

    /**
     * 非并表使用额度
     */
    @Column(name = "no_consolidated_use_quota")
    private BigDecimal noConsolidatedUseQuota;

    /**
     * 折合人民币金额-非并表使用额度
     */
    @Column(name = "no_convert_consolidated_use_quota")
    private BigDecimal noConvertConsolidatedUseQuota;

    /**
     * 授信品种
     */
    @Column(name = "credit_varieties")
    private String creditVarieties;

    /**
     * 授信品种
     */
    @Transient
    private List<String> listCreditVarieties;

    /**
     * 授信品种id
     */
    @Column(name = "credit_varieties_id")
    private String creditVarietiesId;

    /**
     * 授信到期日
     */
    @Column(name = "credit_expiry_date")
    private Date creditExpiryDate;

    /**
     * 银行评级
     */
    @Column(name = "bank_rating")
    private String bankRating;

    /**
     * 评级期限
     */
    @Column(name = "rating_period")
    private String ratingPeriod;

    /**
     * 评级到期日
     */
    @Column(name = "rating_expiry_date")
    private Date ratingExpiryDate;

    /**
     * 计划评审日期
     */
    @Column(name = "plan_approval_date")
    private Date planApprovalDate;

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
     * 审批状态
     */
    @Column(name = "approval_status")
    private String approvalStatus;

    /**
     * 审批时间
     */
    @Column(name = "approval_time")
    private Date approvalTime;

    /**
     * 模块类型：1(银行授信管理)，2(银行授信变更)
     */
    @Column(name = "module_type")
    private String moduleType;

    /**
     * 版本关联id
     */
    @Column(name = "level_id")
    private String levelId;

    /**
     * 获取主键
     *
     * @return fbcc_id - 主键
     */
    public String getFbccId() {
        return fbccId;
    }

    /**
     * 设置主键
     *
     * @param fbccId 主键
     */
    public void setFbccId(String fbccId) {
        this.fbccId = fbccId;
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
     * 获取申请人编号
     *
     * @return applicant_id - 申请人编号
     */
    public String getApplicantId() {
        return applicantId;
    }

    /**
     * 设置申请人编号
     *
     * @param applicantId 申请人编号
     */
    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * 获取申请人
     *
     * @return applicant_name - 申请人
     */
    public String getApplicantName() {
        return applicantName;
    }

    /**
     * 设置申请人
     *
     * @param applicantName 申请人
     */
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    /**
     * 获取申请部门编号
     *
     * @return applicant_dept_id - 申请部门编号
     */
    public String getApplicantDeptId() {
        return applicantDeptId;
    }

    /**
     * 设置申请部门编号
     *
     * @param applicantDeptId 申请部门编号
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
     * 获取申请日期
     *
     * @return applicant_date - 申请日期
     */
    public Date getApplicantDate() {
        return applicantDate;
    }

    /**
     * 设置申请日期
     *
     * @param applicantDate 申请日期
     */
    public void setApplicantDate(Date applicantDate) {
        this.applicantDate = applicantDate;
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
     * 获取授信机构
     *
     * @return credit_institution - 授信机构
     */
    public String getCreditInstitution() {
        return creditInstitution;
    }

    /**
     * 设置授信机构
     *
     * @param creditInstitution 授信机构
     */
    public void setCreditInstitution(String creditInstitution) {
        this.creditInstitution = creditInstitution;
    }

    /**
     * 获取授信机构编号
     *
     * @return credit_institution_code - 授信机构编号
     */
    public String getCreditInstitutionCode() {
        return creditInstitutionCode;
    }

    /**
     * 设置授信机构编号
     *
     * @param creditInstitutionCode 授信机构编号
     */
    public void setCreditInstitutionCode(String creditInstitutionCode) {
        this.creditInstitutionCode = creditInstitutionCode;
    }

    /**
     * 获取授信机构id
     *
     * @return credit_institution_id - 授信机构id
     */
    public String getCreditInstitutionId() {
        return creditInstitutionId;
    }

    /**
     * 设置授信机构id
     *
     * @param creditInstitutionId 授信机构id
     */
    public void setCreditInstitutionId(String creditInstitutionId) {
        this.creditInstitutionId = creditInstitutionId;
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
     * 获取计划授信总金额
     *
     * @return total_planned_credit_amount - 计划授信总金额
     */
    public BigDecimal getTotalPlannedCreditAmount() {
        return totalPlannedCreditAmount;
    }

    /**
     * 设置计划授信总金额
     *
     * @param totalPlannedCreditAmount 计划授信总金额
     */
    public void setTotalPlannedCreditAmount(BigDecimal totalPlannedCreditAmount) {
        this.totalPlannedCreditAmount = totalPlannedCreditAmount;
    }

    /**
     * 获取总额度折合人命币金额
     *
     * @return amount_equivalent_currency - 总额度折合人命币金额
     */
    public BigDecimal getAmountEquivalentCurrency() {
        return amountEquivalentCurrency;
    }

    /**
     * 设置总额度折合人命币金额
     *
     * @param amountEquivalentCurrency 总额度折合人命币金额
     */
    public void setAmountEquivalentCurrency(BigDecimal amountEquivalentCurrency) {
        this.amountEquivalentCurrency = amountEquivalentCurrency;
    }

    /**
     * 获取占用额度
     *
     * @return occupy_quota - 占用额度
     */
    public BigDecimal getOccupyQuota() {
        return occupyQuota;
    }

    /**
     * 设置占用额度
     *
     * @param occupyQuota 占用额度
     */
    public void setOccupyQuota(BigDecimal occupyQuota) {
        this.occupyQuota = occupyQuota;
    }

    /**
     * 获取折合人命币金额-占用额度
     *
     * @return convert_occupy_quota - 折合人命币金额-占用额度
     */
    public BigDecimal getConvertOccupyQuota() {
        return convertOccupyQuota;
    }

    /**
     * 设置折合人命币金额-占用额度
     *
     * @param convertOccupyQuota 折合人命币金额-占用额度
     */
    public void setConvertOccupyQuota(BigDecimal convertOccupyQuota) {
        this.convertOccupyQuota = convertOccupyQuota;
    }

    /**
     * 获取使用额度
     *
     * @return use_quota - 使用额度
     */
    public BigDecimal getUseQuota() {
        return useQuota;
    }

    /**
     * 设置使用额度
     *
     * @param useQuota 使用额度
     */
    public void setUseQuota(BigDecimal useQuota) {
        this.useQuota = useQuota;
    }

    /**
     * 获取折合人民币金额-使用额度
     *
     * @return convert_use_quota - 折合人民币金额-使用额度
     */
    public BigDecimal getConvertUseQuota() {
        return convertUseQuota;
    }

    /**
     * 设置折合人民币金额-使用额度
     *
     * @param convertUseQuota 折合人民币金额-使用额度
     */
    public void setConvertUseQuota(BigDecimal convertUseQuota) {
        this.convertUseQuota = convertUseQuota;
    }

    /**
     * 获取剩余额度
     *
     * @return remaining_amount - 剩余额度
     */
    public BigDecimal getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * 设置剩余额度
     *
     * @param remainingAmount 剩余额度
     */
    public void setRemainingAmount(BigDecimal remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    /**
     * 获取折合人命币额度-剩余额度
     *
     * @return convert_remaining_amount - 折合人命币额度-剩余额度
     */
    public BigDecimal getConvertRemainingAmount() {
        return convertRemainingAmount;
    }

    /**
     * 设置折合人命币额度-剩余额度
     *
     * @param convertRemainingAmount 折合人命币额度-剩余额度
     */
    public void setConvertRemainingAmount(BigDecimal convertRemainingAmount) {
        this.convertRemainingAmount = convertRemainingAmount;
    }

    /**
     * 获取并表占用额度
     *
     * @return consolidated_occupancy_quota - 并表占用额度
     */
    public BigDecimal getConsolidatedOccupancyQuota() {
        return consolidatedOccupancyQuota;
    }

    /**
     * 设置并表占用额度
     *
     * @param consolidatedOccupancyQuota 并表占用额度
     */
    public void setConsolidatedOccupancyQuota(BigDecimal consolidatedOccupancyQuota) {
        this.consolidatedOccupancyQuota = consolidatedOccupancyQuota;
    }

    /**
     * 获取折合人民币金额-并表占用额度
     *
     * @return convert_consolidated_occupancy_quota - 折合人民币金额-并表占用额度
     */
    public BigDecimal getConvertConsolidatedOccupancyQuota() {
        return convertConsolidatedOccupancyQuota;
    }

    /**
     * 设置折合人民币金额-并表占用额度
     *
     * @param convertConsolidatedOccupancyQuota 折合人民币金额-并表占用额度
     */
    public void setConvertConsolidatedOccupancyQuota(BigDecimal convertConsolidatedOccupancyQuota) {
        this.convertConsolidatedOccupancyQuota = convertConsolidatedOccupancyQuota;
    }

    /**
     * 获取非并表占用额度
     *
     * @return no_consolidated_occupancy_quota - 非并表占用额度
     */
    public BigDecimal getNoConsolidatedOccupancyQuota() {
        return noConsolidatedOccupancyQuota;
    }

    /**
     * 设置非并表占用额度
     *
     * @param noConsolidatedOccupancyQuota 非并表占用额度
     */
    public void setNoConsolidatedOccupancyQuota(BigDecimal noConsolidatedOccupancyQuota) {
        this.noConsolidatedOccupancyQuota = noConsolidatedOccupancyQuota;
    }

    /**
     * 获取折合人民币金额-非并表占用额度
     *
     * @return no_convert_consolidated_occupancy_quota - 折合人民币金额-非并表占用额度
     */
    public BigDecimal getNoConvertConsolidatedOccupancyQuota() {
        return noConvertConsolidatedOccupancyQuota;
    }

    /**
     * 设置折合人民币金额-非并表占用额度
     *
     * @param noConvertConsolidatedOccupancyQuota 折合人民币金额-非并表占用额度
     */
    public void setNoConvertConsolidatedOccupancyQuota(BigDecimal noConvertConsolidatedOccupancyQuota) {
        this.noConvertConsolidatedOccupancyQuota = noConvertConsolidatedOccupancyQuota;
    }

    /**
     * 获取并表使用额度
     *
     * @return consolidated_use_quota - 并表使用额度
     */
    public BigDecimal getConsolidatedUseQuota() {
        return consolidatedUseQuota;
    }

    /**
     * 设置并表使用额度
     *
     * @param consolidatedUseQuota 并表使用额度
     */
    public void setConsolidatedUseQuota(BigDecimal consolidatedUseQuota) {
        this.consolidatedUseQuota = consolidatedUseQuota;
    }

    /**
     * 获取折合人民币金额-并表使用额度
     *
     * @return convert_consolidated_use_quota - 折合人民币金额-并表使用额度
     */
    public BigDecimal getConvertConsolidatedUseQuota() {
        return convertConsolidatedUseQuota;
    }

    /**
     * 设置折合人民币金额-并表使用额度
     *
     * @param convertConsolidatedUseQuota 折合人民币金额-并表使用额度
     */
    public void setConvertConsolidatedUseQuota(BigDecimal convertConsolidatedUseQuota) {
        this.convertConsolidatedUseQuota = convertConsolidatedUseQuota;
    }

    /**
     * 获取非并表使用额度
     *
     * @return no_consolidated_use_quota - 非并表使用额度
     */
    public BigDecimal getNoConsolidatedUseQuota() {
        return noConsolidatedUseQuota;
    }

    /**
     * 设置非并表使用额度
     *
     * @param noConsolidatedUseQuota 非并表使用额度
     */
    public void setNoConsolidatedUseQuota(BigDecimal noConsolidatedUseQuota) {
        this.noConsolidatedUseQuota = noConsolidatedUseQuota;
    }

    /**
     * 获取折合人民币金额-非并表使用额度
     *
     * @return no_convert_consolidated_use_quota - 折合人民币金额-非并表使用额度
     */
    public BigDecimal getNoConvertConsolidatedUseQuota() {
        return noConvertConsolidatedUseQuota;
    }

    /**
     * 设置折合人民币金额-非并表使用额度
     *
     * @param noConvertConsolidatedUseQuota 折合人民币金额-非并表使用额度
     */
    public void setNoConvertConsolidatedUseQuota(BigDecimal noConvertConsolidatedUseQuota) {
        this.noConvertConsolidatedUseQuota = noConvertConsolidatedUseQuota;
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
     * 获取授信品种id
     *
     * @return credit_varieties_id - 授信品种id
     */
    public String getCreditVarietiesId() {
        return creditVarietiesId;
    }

    /**
     * 设置授信品种id
     *
     * @param creditVarietiesId 授信品种id
     */
    public void setCreditVarietiesId(String creditVarietiesId) {
        this.creditVarietiesId = creditVarietiesId;
    }

    /**
     * 获取授信到期日
     *
     * @return credit_expiry_date - 授信到期日
     */
    public Date getCreditExpiryDate() {
        return creditExpiryDate;
    }

    /**
     * 设置授信到期日
     *
     * @param creditExpiryDate 授信到期日
     */
    public void setCreditExpiryDate(Date creditExpiryDate) {
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
     * 获取评级期限
     *
     * @return rating_period - 评级期限
     */
    public String getRatingPeriod() {
        return ratingPeriod;
    }

    /**
     * 设置评级期限
     *
     * @param ratingPeriod 评级期限
     */
    public void setRatingPeriod(String ratingPeriod) {
        this.ratingPeriod = ratingPeriod;
    }

    /**
     * 获取评级到期日
     *
     * @return rating_expiry_date - 评级到期日
     */
    public Date getRatingExpiryDate() {
        return ratingExpiryDate;
    }

    /**
     * 设置评级到期日
     *
     * @param ratingExpiryDate 评级到期日
     */
    public void setRatingExpiryDate(Date ratingExpiryDate) {
        this.ratingExpiryDate = ratingExpiryDate;
    }

    /**
     * 获取计划评审日期
     *
     * @return plan_approval_date - 计划评审日期
     */
    public Date getPlanApprovalDate() {
        return planApprovalDate;
    }

    /**
     * 设置计划评审日期
     *
     * @param planApprovalDate 计划评审日期
     */
    public void setPlanApprovalDate(Date planApprovalDate) {
        this.planApprovalDate = planApprovalDate;
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

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public List<String> getListCreditVarieties() {
        return listCreditVarieties;
    }

    public void setListCreditVarieties(List<String> listCreditVarieties) {
        this.listCreditVarieties = listCreditVarieties;
    }
}