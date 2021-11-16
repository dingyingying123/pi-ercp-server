package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bond_info")
public class FssBondInfo {
    /**
     * 债券ID
     */
    @Id
    @Column(name = "bond_id")
    @GeneratedValue(generator = "JDBC")
    private String bondId;

    /**
     * 业务单元ID
     */
    @Column(name = "commercian_unit_id")
    private String commercianUnitId;

    /**
     * 业务单元名称
     */
    @Column(name = "commercian_unit")
    private String commercianUnit;

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
     * 合同编码，产品编码
     */
    @Column(name = "contract_code")
    private String contractCode;

    /**
     * 合同名称，产品名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 项目ID
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 项目简称
     */
    @Column(name = "project_abbreviation")
    private String projectAbbreviation;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 是否占用授信，0：是，1：否
     */
    @Column(name = "is_use_credit")
    private String isUseCredit;

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
     * 是否联合承销，0：是，1：否
     */
    @Column(name = "is_jointly_underwrite")
    private String isJointlyUnderwrite;

    /**
     * 注册额度
     */
    @Column(name = "registration_quota")
    private BigDecimal registrationQuota;

    /**
     * 注册机构
     */
    @Column(name = "registration_agency")
    private String registrationAgency;

    /**
     * 托管机构编码，供应商编码
     */
    @Column(name = "trusteeship_lifnr")
    private String trusteeshipLifnr;

    /**
     * 托管机构，供应商名称
     */
    @Column(name = "trusteeship_name")
    private String trusteeshipName;

    /**
     * 注册文号
     */
    @Column(name = "registration_number")
    private String registrationNumber;

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
     * 批文开始日期
     */
    @Column(name = "approval_start_date")
    private String approvalStartDate;

    /**
     * 批文结束日期
     */
    @Column(name = "approval_end_date")
    private String approvalEndDate;

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
     * 币种名称
     */
    @Column(name = "currency_name")
    private String currencyName;

    /**
     * 备注
     */
    private String description;

    /**
     * 数据校验 0：未通过，1：已通过
     */
    @Column(name = "data_validation")
    private String dataValidation;

    /**
     * 清户 0：未清户，1已清户
     */
    private String liquidation;

    /**
     * 预留
     */
    private String reserve;

    /**
     * 状态
     */
    private String status;

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
     * 已删除 0：未删除，1：已删除
     */
    private String deleted;

    /**
     * 获取债券ID
     *
     * @return bond_id - 债券ID
     */
    public String getBondId() {
        return bondId;
    }

    /**
     * 设置债券ID
     *
     * @param bondId 债券ID
     */
    public void setBondId(String bondId) {
        this.bondId = bondId;
    }

    /**
     * 获取公司ID
     *
     * @return commercian_unit_id - 公司ID
     */
    public String getCommercianUnitId() {
        return commercianUnitId;
    }

    /**
     * 设置公司ID
     *
     * @param commercianUnitId 公司ID
     */
    public void setCommercianUnitId(String commercianUnitId) {
        this.commercianUnitId = commercianUnitId;
    }

    /**
     * 获取公司名称
     *
     * @return commercian_unit - 公司名称
     */
    public String getCommercianUnit() {
        return commercianUnit;
    }

    /**
     * 设置公司名称
     *
     * @param commercianUnit 公司名称
     */
    public void setCommercianUnit(String commercianUnit) {
        this.commercianUnit = commercianUnit;
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
     * 获取合同编码，产品编码
     *
     * @return contract_code - 合同编码，产品编码
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置合同编码，产品编码
     *
     * @param contractCode 合同编码，产品编码
     */
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    /**
     * 获取合同名称，产品名称
     *
     * @return contract_name - 合同名称，产品名称
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * 设置合同名称，产品名称
     *
     * @param contractName 合同名称，产品名称
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * 获取项目ID
     *
     * @return project_id - 项目ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目ID
     *
     * @param projectId 项目ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取项目简称
     *
     * @return project_abbreviation - 项目简称
     */
    public String getProjectAbbreviation() {
        return projectAbbreviation;
    }

    /**
     * 设置项目简称
     *
     * @param projectAbbreviation 项目简称
     */
    public void setProjectAbbreviation(String projectAbbreviation) {
        this.projectAbbreviation = projectAbbreviation;
    }

    /**
     * 获取项目名称
     *
     * @return project_name - 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目名称
     *
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取是否占用授信，0：是，1：否
     *
     * @return is_use_credit - 是否占用授信，0：是，1：否
     */
    public String getIsUseCredit() {
        return isUseCredit;
    }

    /**
     * 设置是否占用授信，0：是，1：否
     *
     * @param isUseCredit 是否占用授信，0：是，1：否
     */
    public void setIsUseCredit(String isUseCredit) {
        this.isUseCredit = isUseCredit;
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
     * 获取是否联合承销，0：是，1：否
     *
     * @return is_jointly_underwrite - 是否联合承销，0：是，1：否
     */
    public String getIsJointlyUnderwrite() {
        return isJointlyUnderwrite;
    }

    /**
     * 设置是否联合承销，0：是，1：否
     *
     * @param isJointlyUnderwrite 是否联合承销，0：是，1：否
     */
    public void setIsJointlyUnderwrite(String isJointlyUnderwrite) {
        this.isJointlyUnderwrite = isJointlyUnderwrite;
    }

    /**
     * 获取注册额度
     *
     * @return registration_quota - 注册额度
     */
    public BigDecimal getRegistrationQuota() {
        return registrationQuota;
    }

    /**
     * 设置注册额度
     *
     * @param registrationQuota 注册额度
     */
    public void setRegistrationQuota(BigDecimal registrationQuota) {
        this.registrationQuota = registrationQuota;
    }

    /**
     * 获取注册机构
     *
     * @return registration_agency - 注册机构
     */
    public String getRegistrationAgency() {
        return registrationAgency;
    }

    /**
     * 设置注册机构
     *
     * @param registrationAgency 注册机构
     */
    public void setRegistrationAgency(String registrationAgency) {
        this.registrationAgency = registrationAgency;
    }

    /**
     * 获取托管机构编码，供应商编码
     *
     * @return trusteeship_lifnr - 托管机构编码，供应商编码
     */
    public String getTrusteeshipLifnr() {
        return trusteeshipLifnr;
    }

    /**
     * 设置托管机构编码，供应商编码
     *
     * @param trusteeshipLifnr 托管机构编码，供应商编码
     */
    public void setTrusteeshipLifnr(String trusteeshipLifnr) {
        this.trusteeshipLifnr = trusteeshipLifnr;
    }

    /**
     * 获取托管机构，供应商名称
     *
     * @return trusteeship_name - 托管机构，供应商名称
     */
    public String getTrusteeshipName() {
        return trusteeshipName;
    }

    /**
     * 设置托管机构，供应商名称
     *
     * @param trusteeshipName 托管机构，供应商名称
     */
    public void setTrusteeshipName(String trusteeshipName) {
        this.trusteeshipName = trusteeshipName;
    }

    /**
     * 获取注册文号
     *
     * @return registration_number - 注册文号
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * 设置注册文号
     *
     * @param registrationNumber 注册文号
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * 获取期限方式，d:天，m:月
     *
     * @return deadline_method - 期限方式，d:天，m:月
     */
    public String getDeadlineMethod() {
        return deadlineMethod;
    }

    /**
     * 设置期限方式，d:天，m:月
     *
     * @param deadlineMethod 期限方式，d:天，m:月
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
     * 获取批文开始日期
     *
     * @return approval_start_date - 批文开始日期
     */
    public String getApprovalStartDate() {
        return approvalStartDate;
    }

    /**
     * 设置批文开始日期
     *
     * @param approvalStartDate 批文开始日期
     */
    public void setApprovalStartDate(String approvalStartDate) {
        this.approvalStartDate = approvalStartDate;
    }

    /**
     * 获取批文结束日期
     *
     * @return approval_end_date - 批文结束日期
     */
    public String getApprovalEndDate() {
        return approvalEndDate;
    }

    /**
     * 设置批文结束日期
     *
     * @param approvalEndDate 批文结束日期
     */
    public void setApprovalEndDate(String approvalEndDate) {
        this.approvalEndDate = approvalEndDate;
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
     * 获取币种名称
     *
     * @return currency_name - 币种名称
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * 设置币种名称
     *
     * @param currencyName 币种名称
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
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
     * 获取数据校验 0：未通过，1：已通过
     *
     * @return data_validation - 数据校验 0：未通过，1：已通过
     */
    public String getDataValidation() {
        return dataValidation;
    }

    /**
     * 设置数据校验 0：未通过，1：已通过
     *
     * @param dataValidation 数据校验 0：未通过，1：已通过
     */
    public void setDataValidation(String dataValidation) {
        this.dataValidation = dataValidation;
    }

    /**
     * 获取清户 0：未清户，1已清户
     *
     * @return liquidation - 清户 0：未清户，1已清户
     */
    public String getLiquidation() {
        return liquidation;
    }

    /**
     * 设置清户 0：未清户，1已清户
     *
     * @param liquidation 清户 0：未清户，1已清户
     */
    public void setLiquidation(String liquidation) {
        this.liquidation = liquidation;
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
     * 获取已删除 0：未删除，1：已删除
     *
     * @return deleted - 已删除 0：未删除，1：已删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置已删除 0：未删除，1：已删除
     *
     * @param deleted 已删除 0：未删除，1：已删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}