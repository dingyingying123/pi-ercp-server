package cn.com.personnel.ercp.pi.persistence.entity.credit.guarantee;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_guarantee_info")
public class FssGuaranteeInfo {
    /**
     * 保函ID
     */
    @Id
    @Column(name = "guarantee_id")
    @GeneratedValue(generator = "JDBC")
    private String guaranteeId;

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
     * 保函负责人ID
     */
    @Column(name = "responsible_person_id")
    private String responsiblePersonId;

    /**
     * 保函负责人姓名
     */
    @Column(name = "responsible_person_name")
    private String responsiblePersonName;

    /**
     * 保函负责人部门
     */
    @Column(name = "responsible_person_dept")
    private String responsiblePersonDept;

    /**
     * 申请时间
     */
    @Column(name = "applicant_date")
    private String applicantDate;

    /**
     * 业务单元ID
     */
    @Column(name = "commercian_unit_id")
    private String commercianUnitId;

    /**
     * 业务单元
     */
    @Column(name = "commercian_unit")
    private String commercianUnit;

    /**
     * 商机号
     */
    @Column(name = "opportunity_number")
    private String opportunityNumber;

    /**
     * 流程摘要
     */
    @Column(name = "process_summary")
    private String processSummary;

    /**
     * 合同编号
     */
    @Column(name = "contract_no")
    private String contractNo;

    /**
     * 合同金额
     */
    @Column(name = "contract_amount")
    private BigDecimal contractAmount;

    /**
     * 保函比例（%）
     */
    @Column(name = "guarantee_ratio")
    private String guaranteeRatio;

    /**
     * 保函金额
     */
    @Column(name = "guarantee_amount")
    private BigDecimal guaranteeAmount;

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
     * 开立方式ID
     */
    @Column(name = "opening_method_id")
    private String openingMethodId;

    /**
     * 开立方式
     */
    @Column(name = "opening_method")
    private String openingMethod;

    /**
     * 保函份数
     */
    @Column(name = "number_of_guarantees")
    private String numberOfGuarantees;

    /**
     * 保函性质编号，合同编号
     */
    @Column(name = "contract_code")
    private String contractCode;

    /**
     * 保函性质，合同类型
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 保函日期（起）
     */
    @Column(name = "guarantee_date_from")
    private String guaranteeDateFrom;

    /**
     * 保函日期（止）
     */
    @Column(name = "guarantee_date_to")
    private String guaranteeDateTo;

    /**
     * 公司ID，组织ID
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 公司名称，合同主体
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 被担保人ID 公司ID，组织ID
     */
    @Column(name = "warrantee_organ_id")
    private String warranteeOrganId;

    /**
     * 被担保人 公司名称
     */
    @Column(name = "warrantee_organ_name")
    private String warranteeOrganName;

    /**
     * 转开行
     */
    @Column(name = "turn_bank")
    private String turnBank;

    /**
     * 受益人
     */
    private String beneficiary;

    /**
     * 受益人地址
     */
    @Column(name = "beneficiary_address")
    private String beneficiaryAddress;

    /**
     * 邮寄信息
     */
    @Column(name = "mailing_information")
    private String mailingInformation;

    /**
     * 保函背景
     */
    @Column(name = "guarantee_background")
    private String guaranteeBackground;

    /**
     * 申请原因
     */
    @Column(name = "reason_for_application")
    private String reasonForApplication;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 是否国际，0：非国际，1国际
     */
    @Column(name = "is_international")
    private String isInternational;

    /**
     * 信用证状态 0：未提交流程，1：流程审批中，2：流程审批通过
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
     * 申请人部门ID
     */
    @Column(name = "applicant_dept_id")
    private String applicantDeptId;

    /**
     * 保函负责人部门ID
     */
    @Column(name = "responsible_person_dept_id")
    private String responsiblePersonDeptId;

    /**
     * 流程实例id
     */
    @Column(name = "process_inst_id")
    private String processInstId;

    /**
     * 开立银行
     */
    @Column(name = "open_bank")
    private String openBank;

    /**
     * 开立银行ID
     */
    @Column(name = "head_id")
    private String headId;

    /**
     * 费率
     */
    private BigDecimal rate;

    /**
     * 预估费用
     */
    @Column(name = "estimated_cost")
    private BigDecimal estimatedCost;

    /**
     * 银行编码
     */
    @Column(name = "head_code")
    private String headCode;

    /**
     * 国际区域数据字典ID
     */
    @Column(name = "international_area_id")
    private String internationalAreaId;

    /**
     * 国际区域
     */
    @Column(name = "international_area")
    private String internationalArea;

    /**
     * 获取保函ID
     *
     * @return guarantee_id - 保函ID
     */
    public String getGuaranteeId() {
        return guaranteeId;
    }

    /**
     * 设置保函ID
     *
     * @param guaranteeId 保函ID
     */
    public void setGuaranteeId(String guaranteeId) {
        this.guaranteeId = guaranteeId;
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
     * 获取保函负责人ID
     *
     * @return responsible_person_id - 保函负责人ID
     */
    public String getResponsiblePersonId() {
        return responsiblePersonId;
    }

    /**
     * 设置保函负责人ID
     *
     * @param responsiblePersonId 保函负责人ID
     */
    public void setResponsiblePersonId(String responsiblePersonId) {
        this.responsiblePersonId = responsiblePersonId;
    }

    /**
     * 获取保函负责人姓名
     *
     * @return responsible_person_name - 保函负责人姓名
     */
    public String getResponsiblePersonName() {
        return responsiblePersonName;
    }

    /**
     * 设置保函负责人姓名
     *
     * @param responsiblePersonName 保函负责人姓名
     */
    public void setResponsiblePersonName(String responsiblePersonName) {
        this.responsiblePersonName = responsiblePersonName;
    }

    /**
     * 获取保函负责人部门
     *
     * @return responsible_person_dept - 保函负责人部门
     */
    public String getResponsiblePersonDept() {
        return responsiblePersonDept;
    }

    /**
     * 设置保函负责人部门
     *
     * @param responsiblePersonDept 保函负责人部门
     */
    public void setResponsiblePersonDept(String responsiblePersonDept) {
        this.responsiblePersonDept = responsiblePersonDept;
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
     * 获取业务单元ID
     *
     * @return commercian_unit_id - 业务单元ID
     */
    public String getCommercianUnitId() {
        return commercianUnitId;
    }

    /**
     * 设置业务单元ID
     *
     * @param commercianUnitId 业务单元ID
     */
    public void setCommercianUnitId(String commercianUnitId) {
        this.commercianUnitId = commercianUnitId;
    }

    /**
     * 获取业务单元
     *
     * @return commercian_unit - 业务单元
     */
    public String getCommercianUnit() {
        return commercianUnit;
    }

    /**
     * 设置业务单元
     *
     * @param commercianUnit 业务单元
     */
    public void setCommercianUnit(String commercianUnit) {
        this.commercianUnit = commercianUnit;
    }

    /**
     * 获取商机号
     *
     * @return opportunity_number - 商机号
     */
    public String getOpportunityNumber() {
        return opportunityNumber;
    }

    /**
     * 设置商机号
     *
     * @param opportunityNumber 商机号
     */
    public void setOpportunityNumber(String opportunityNumber) {
        this.opportunityNumber = opportunityNumber;
    }

    /**
     * 获取流程摘要
     *
     * @return process_summary - 流程摘要
     */
    public String getProcessSummary() {
        return processSummary;
    }

    /**
     * 设置流程摘要
     *
     * @param processSummary 流程摘要
     */
    public void setProcessSummary(String processSummary) {
        this.processSummary = processSummary;
    }

    /**
     * 获取合同编号
     *
     * @return contract_no - 合同编号
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * 设置合同编号
     *
     * @param contractNo 合同编号
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    /**
     * 获取合同金额
     *
     * @return contract_amount - 合同金额
     */
    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    /**
     * 设置合同金额
     *
     * @param contractAmount 合同金额
     */
    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    /**
     * 获取保函比例（%）
     *
     * @return guarantee_ratio - 保函比例（%）
     */
    public String getGuaranteeRatio() {
        return guaranteeRatio;
    }

    /**
     * 设置保函比例（%）
     *
     * @param guaranteeRatio 保函比例（%）
     */
    public void setGuaranteeRatio(String guaranteeRatio) {
        this.guaranteeRatio = guaranteeRatio;
    }

    /**
     * 获取保函金额
     *
     * @return guarantee_amount - 保函金额
     */
    public BigDecimal getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /**
     * 设置保函金额
     *
     * @param guaranteeAmount 保函金额
     */
    public void setGuaranteeAmount(BigDecimal guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
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
     * 获取开立方式ID
     *
     * @return opening_method_id - 开立方式ID
     */
    public String getOpeningMethodId() {
        return openingMethodId;
    }

    /**
     * 设置开立方式ID
     *
     * @param openingMethodId 开立方式ID
     */
    public void setOpeningMethodId(String openingMethodId) {
        this.openingMethodId = openingMethodId;
    }

    /**
     * 获取开立方式
     *
     * @return opening_method - 开立方式
     */
    public String getOpeningMethod() {
        return openingMethod;
    }

    /**
     * 设置开立方式
     *
     * @param openingMethod 开立方式
     */
    public void setOpeningMethod(String openingMethod) {
        this.openingMethod = openingMethod;
    }

    /**
     * 获取保函份数
     *
     * @return number_of_guarantees - 保函份数
     */
    public String getNumberOfGuarantees() {
        return numberOfGuarantees;
    }

    /**
     * 设置保函份数
     *
     * @param numberOfGuarantees 保函份数
     */
    public void setNumberOfGuarantees(String numberOfGuarantees) {
        this.numberOfGuarantees = numberOfGuarantees;
    }

    /**
     * 获取保函性质编号，合同编号
     *
     * @return contract_code - 保函性质编号，合同编号
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置保函性质编号，合同编号
     *
     * @param contractCode 保函性质编号，合同编号
     */
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    /**
     * 获取保函性质，合同类型
     *
     * @return contract_name - 保函性质，合同类型
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * 设置保函性质，合同类型
     *
     * @param contractName 保函性质，合同类型
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * 获取保函日期（起）
     *
     * @return guarantee_date_from - 保函日期（起）
     */
    public String getGuaranteeDateFrom() {
        return guaranteeDateFrom;
    }

    /**
     * 设置保函日期（起）
     *
     * @param guaranteeDateFrom 保函日期（起）
     */
    public void setGuaranteeDateFrom(String guaranteeDateFrom) {
        this.guaranteeDateFrom = guaranteeDateFrom;
    }

    /**
     * 获取保函日期（止）
     *
     * @return guarantee_date_to - 保函日期（止）
     */
    public String getGuaranteeDateTo() {
        return guaranteeDateTo;
    }

    /**
     * 设置保函日期（止）
     *
     * @param guaranteeDateTo 保函日期（止）
     */
    public void setGuaranteeDateTo(String guaranteeDateTo) {
        this.guaranteeDateTo = guaranteeDateTo;
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
     * 获取公司名称，合同主体
     *
     * @return organ_name - 公司名称，合同主体
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * 设置公司名称，合同主体
     *
     * @param organName 公司名称，合同主体
     */
    public void setOrganName(String organName) {
        this.organName = organName;
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
     * 获取被担保人ID 公司ID，组织ID
     *
     * @return warrantee_organ_id - 被担保人ID 公司ID，组织ID
     */
    public String getWarranteeOrganId() {
        return warranteeOrganId;
    }

    /**
     * 设置被担保人ID 公司ID，组织ID
     *
     * @param warranteeOrganId 被担保人ID 公司ID，组织ID
     */
    public void setWarranteeOrganId(String warranteeOrganId) {
        this.warranteeOrganId = warranteeOrganId;
    }

    /**
     * 获取被担保人 公司名称
     *
     * @return warrantee_organ_name - 被担保人 公司名称
     */
    public String getWarranteeOrganName() {
        return warranteeOrganName;
    }

    /**
     * 设置被担保人 公司名称
     *
     * @param warranteeOrganName 被担保人 公司名称
     */
    public void setWarranteeOrganName(String warranteeOrganName) {
        this.warranteeOrganName = warranteeOrganName;
    }

    /**
     * 获取转开行
     *
     * @return turn_bank - 转开行
     */
    public String getTurnBank() {
        return turnBank;
    }

    /**
     * 设置转开行
     *
     * @param turnBank 转开行
     */
    public void setTurnBank(String turnBank) {
        this.turnBank = turnBank;
    }

    /**
     * 获取受益人
     *
     * @return beneficiary - 受益人
     */
    public String getBeneficiary() {
        return beneficiary;
    }

    /**
     * 设置受益人
     *
     * @param beneficiary 受益人
     */
    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    /**
     * 获取受益人地址
     *
     * @return beneficiary_address - 受益人地址
     */
    public String getBeneficiaryAddress() {
        return beneficiaryAddress;
    }

    /**
     * 设置受益人地址
     *
     * @param beneficiaryAddress 受益人地址
     */
    public void setBeneficiaryAddress(String beneficiaryAddress) {
        this.beneficiaryAddress = beneficiaryAddress;
    }

    /**
     * 获取邮寄信息
     *
     * @return mailing_information - 邮寄信息
     */
    public String getMailingInformation() {
        return mailingInformation;
    }

    /**
     * 设置邮寄信息
     *
     * @param mailingInformation 邮寄信息
     */
    public void setMailingInformation(String mailingInformation) {
        this.mailingInformation = mailingInformation;
    }

    /**
     * 获取保函背景
     *
     * @return guarantee_background - 保函背景
     */
    public String getGuaranteeBackground() {
        return guaranteeBackground;
    }

    /**
     * 设置保函背景
     *
     * @param guaranteeBackground 保函背景
     */
    public void setGuaranteeBackground(String guaranteeBackground) {
        this.guaranteeBackground = guaranteeBackground;
    }

    /**
     * 获取申请原因
     *
     * @return reason_for_application - 申请原因
     */
    public String getReasonForApplication() {
        return reasonForApplication;
    }

    /**
     * 设置申请原因
     *
     * @param reasonForApplication 申请原因
     */
    public void setReasonForApplication(String reasonForApplication) {
        this.reasonForApplication = reasonForApplication;
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
     * 获取是否国际，0：非国际，1国际
     *
     * @return is_international - 是否国际，0：非国际，1国际
     */
    public String getIsInternational() {
        return isInternational;
    }

    /**
     * 设置是否国际，0：非国际，1国际
     *
     * @param isInternational 是否国际，0：非国际，1国际
     */
    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    /**
     * 获取信用证状态 0：未提交流程，1：流程审批中，2：流程审批通过
     *
     * @return status - 信用证状态 0：未提交流程，1：流程审批中，2：流程审批通过
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置信用证状态 0：未提交流程，1：流程审批中，2：流程审批通过
     *
     * @param status 信用证状态 0：未提交流程，1：流程审批中，2：流程审批通过
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

    /**
     * 获取申请人部门ID
     *
     * @return applicant_dept_id - 申请人部门ID
     */
    public String getApplicantDeptId() {
        return applicantDeptId;
    }

    /**
     * 设置申请人部门ID
     *
     * @param applicantDeptId 申请人部门ID
     */
    public void setApplicantDeptId(String applicantDeptId) {
        this.applicantDeptId = applicantDeptId;
    }

    /**
     * 获取保函负责人部门ID
     *
     * @return responsible_person_dept_id - 保函负责人部门ID
     */
    public String getResponsiblePersonDeptId() {
        return responsiblePersonDeptId;
    }

    /**
     * 设置保函负责人部门ID
     *
     * @param responsiblePersonDeptId 保函负责人部门ID
     */
    public void setResponsiblePersonDeptId(String responsiblePersonDeptId) {
        this.responsiblePersonDeptId = responsiblePersonDeptId;
    }

    /**
     * 获取流程实例id
     *
     * @return process_inst_id - 流程实例id
     */
    public String getProcessInstId() {
        return processInstId;
    }

    /**
     * 设置流程实例id
     *
     * @param processInstId 流程实例id
     */
    public void setProcessInstId(String processInstId) {
        this.processInstId = processInstId;
    }

    /**
     * 获取开立银行
     *
     * @return open_bank - 开立银行
     */
    public String getOpenBank() {
        return openBank;
    }

    /**
     * 设置开立银行
     *
     * @param openBank 开立银行
     */
    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    /**
     * 获取开立银行ID
     *
     * @return head_id - 开立银行ID
     */
    public String getHeadId() {
        return headId;
    }

    /**
     * 设置开立银行ID
     *
     * @param headId 开立银行ID
     */
    public void setHeadId(String headId) {
        this.headId = headId;
    }

    /**
     * 获取费率
     *
     * @return rate - 费率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置费率
     *
     * @param rate 费率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取预估费用
     *
     * @return estimated_cost - 预估费用
     */
    public BigDecimal getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * 设置预估费用
     *
     * @param estimatedCost 预估费用
     */
    public void setEstimatedCost(BigDecimal estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    /**
     * 获取银行编码
     *
     * @return head_code - 银行编码
     */
    public String getHeadCode() {
        return headCode;
    }

    /**
     * 设置银行编码
     *
     * @param headCode 银行编码
     */
    public void setHeadCode(String headCode) {
        this.headCode = headCode;
    }

    public String getInternationalAreaId() {
        return internationalAreaId;
    }

    public void setInternationalAreaId(String internationalAreaId) {
        this.internationalAreaId = internationalAreaId;
    }

    public String getInternationalArea() {
        return internationalArea;
    }

    public void setInternationalArea(String internationalArea) {
        this.internationalArea = internationalArea;
    }
}