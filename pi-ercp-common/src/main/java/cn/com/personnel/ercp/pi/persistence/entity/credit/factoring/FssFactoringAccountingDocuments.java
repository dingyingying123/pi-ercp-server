package cn.com.personnel.ercp.pi.persistence.entity.credit.factoring;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_factoring_accounting_documents")
public class FssFactoringAccountingDocuments {
    /**
     * 会计分录ID
     */
    @Id
    @Column(name = "documents_id")
    @GeneratedValue(generator = "JDBC")
    private String documentsId;

    /**
     * 提款ID
     */
    @Column(name = "sub_id")
    private String subId;

    /**
     * 管理ID
     */
    @Column(name = "main_id")
    private String mainId;

    /**
     * 规则ID
     */
    @Column(name = "rule_id")
    private String ruleId;

    /**
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 合同编号
     */
    @Column(name = "contract_num")
    private String contractNum;

    /**
     * 公司编码
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 公司名称
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 币种编码
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 币种名称
     */
    private String currency;

    /**
     * 入账日期
     */
    @Column(name = "credit_date")
    private String creditDate;

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
     * 业务模块ID
     */
    @Column(name = "business_module_id")
    private String businessModuleId;

    /**
     * 业务模块
     */
    @Column(name = "business_module")
    private String businessModule;

    /**
     * 业务类型
     */
    @Column(name = "business_type")
    private String businessType;

    /**
     * 借/贷
     */
    @Column(name = "borrow_loan")
    private String borrowLoan;

    /**
     * 科目
     */
    private String subject;

    /**
     * 科目名称
     */
    @Column(name = "subject_text")
    private String subjectText;

    /**
     * 供应商/客户编码
     */
    private String lifnr;

    /**
     * 供应商/客户
     */
    @Column(name = "lifnr_text")
    private String lifnrText;

    /**
     * 贷款期限
     */
    @Column(name = "loan_term")
    private String loanTerm;

    /**
     * 项目阶段
     */
    @Column(name = "project_stage")
    private String projectStage;

    /**
     * 科目类型
     */
    @Column(name = "subject_type")
    private String subjectType;

    /**
     * 项目编码
     */
    @Column(name = "project_code")
    private String projectCode;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 利润中心编码
     */
    @Column(name = "profit_center_code")
    private String profitCenterCode;

    /**
     * 利润中心文本
     */
    @Column(name = "profit_center")
    private String profitCenter;

    /**
     * 成本中心编码
     */
    @Column(name = "cost_center_code")
    private String costCenterCode;

    /**
     * 成本中心
     */
    @Column(name = "cost_center")
    private String costCenter;

    /**
     * WBS元素编码
     */
    @Column(name = "wbs_element_code")
    private String wbsElementCode;

    /**
     * WBS元素
     */
    @Column(name = "wbs_element")
    private String wbsElement;

    /**
     * 原因码
     */
    @Column(name = "reason_code")
    private String reasonCode;

    /**
     * 原因码描述
     */
    @Column(name = "reason_code_text")
    private String reasonCodeText;

    /**
     * 分配号
     */
    @Column(name = "assigned_number")
    private String assignedNumber;

    /**
     * 合同还款日期，到期日
     */
    @Column(name = "expiry_date")
    private String expiryDate;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 入账状态
     */
    @Column(name = "entry_status")
    private String entryStatus;

    /**
     * SAP凭证编号
     */
    @Column(name = "document_no")
    private String documentNo;

    /**
     * 消息号
     */
    @Column(name = "message_number")
    private String messageNumber;

    /**
     * 内部订单
     */
    @Column(name = "internal_order")
    private String internalOrder;

    /**
     * 是否清账
     */
    @Column(name = "is_clear")
    private String isClear;

    /**
     * 类型
     */
    private String type;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 信用证状态 0：未提交流程，1：流程审批中，2：流程审批通过
     */
    private String status;

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
     * 前端专用
     */
    @Column(name = "business_type_list")
    private String businessTypeList;

    /**
     * 前端专用
     */
    @Column(name = "subject_type_list")
    private String subjectTypeList;

    /**
     * 生成分录时的编号
     */
    @Column(name = "entry_number")
    private String entryNumber;

    /**
     * 分录组编号
     */
    @Column(name = "group_no")
    private String groupNo;

    /**
     * 分录类型
     */
    @Column(name = "entry_type")
    private String entryType;

    /**
     * 事务类型
     * */
    @Column(name = "tran_type")
    private String tranType;

    /**
     * 冲销状态
     */
    @Column(name = "reversal_status")
    private String reversalStatus;

    /**
     * 获取会计分录ID
     *
     * @return documents_id - 会计分录ID
     */
    public String getDocumentsId() {
        return documentsId;
    }

    /**
     * 设置会计分录ID
     *
     * @param documentsId 会计分录ID
     */
    public void setDocumentsId(String documentsId) {
        this.documentsId = documentsId;
    }

    /**
     * 获取提款ID
     *
     * @return sub_id - 提款ID
     */
    public String getSubId() {
        return subId;
    }

    /**
     * 设置提款ID
     *
     * @param subId 提款ID
     */
    public void setSubId(String subId) {
        this.subId = subId;
    }

    /**
     * 获取管理ID
     *
     * @return main_id - 管理ID
     */
    public String getMainId() {
        return mainId;
    }

    /**
     * 设置管理ID
     *
     * @param mainId 管理ID
     */
    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    /**
     * 获取规则ID
     *
     * @return rule_id - 规则ID
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * 设置规则ID
     *
     * @param ruleId 规则ID
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
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
     * 获取合同编号
     *
     * @return contract_num - 合同编号
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * 设置合同编号
     *
     * @param contractNum 合同编号
     */
    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    /**
     * 获取公司编码
     *
     * @return organ_id - 公司编码
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置公司编码
     *
     * @param organId 公司编码
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
     * 获取摘要
     *
     * @return summary - 摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置摘要
     *
     * @param summary 摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
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
     * @return currency - 币种名称
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置币种名称
     *
     * @param currency 币种名称
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 获取入账日期
     *
     * @return credit_date - 入账日期
     */
    public String getCreditDate() {
        return creditDate;
    }

    /**
     * 设置入账日期
     *
     * @param creditDate 入账日期
     */
    public void setCreditDate(String creditDate) {
        this.creditDate = creditDate;
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
     * 获取业务模块ID
     *
     * @return business_module_id - 业务模块ID
     */
    public String getBusinessModuleId() {
        return businessModuleId;
    }

    /**
     * 设置业务模块ID
     *
     * @param businessModuleId 业务模块ID
     */
    public void setBusinessModuleId(String businessModuleId) {
        this.businessModuleId = businessModuleId;
    }

    /**
     * 获取业务模块
     *
     * @return business_module - 业务模块
     */
    public String getBusinessModule() {
        return businessModule;
    }

    /**
     * 设置业务模块
     *
     * @param businessModule 业务模块
     */
    public void setBusinessModule(String businessModule) {
        this.businessModule = businessModule;
    }

    /**
     * 获取业务类型
     *
     * @return business_type - 业务类型
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 设置业务类型
     *
     * @param businessType 业务类型
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    /**
     * 获取借/贷
     *
     * @return borrow_loan - 借/贷
     */
    public String getBorrowLoan() {
        return borrowLoan;
    }

    /**
     * 设置借/贷
     *
     * @param borrowLoan 借/贷
     */
    public void setBorrowLoan(String borrowLoan) {
        this.borrowLoan = borrowLoan;
    }

    /**
     * 获取科目
     *
     * @return subject - 科目
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置科目
     *
     * @param subject 科目
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 获取科目名称
     *
     * @return subject_text - 科目名称
     */
    public String getSubjectText() {
        return subjectText;
    }

    /**
     * 设置科目名称
     *
     * @param subjectText 科目名称
     */
    public void setSubjectText(String subjectText) {
        this.subjectText = subjectText;
    }

    /**
     * 获取供应商/客户编码
     *
     * @return lifnr - 供应商/客户编码
     */
    public String getLifnr() {
        return lifnr;
    }

    /**
     * 设置供应商/客户编码
     *
     * @param lifnr 供应商/客户编码
     */
    public void setLifnr(String lifnr) {
        this.lifnr = lifnr;
    }

    /**
     * 获取供应商/客户
     *
     * @return lifnr_text - 供应商/客户
     */
    public String getLifnrText() {
        return lifnrText;
    }

    /**
     * 设置供应商/客户
     *
     * @param lifnrText 供应商/客户
     */
    public void setLifnrText(String lifnrText) {
        this.lifnrText = lifnrText;
    }

    /**
     * 获取贷款期限
     *
     * @return loan_term - 贷款期限
     */
    public String getLoanTerm() {
        return loanTerm;
    }

    /**
     * 设置贷款期限
     *
     * @param loanTerm 贷款期限
     */
    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }

    /**
     * 获取项目阶段
     *
     * @return project_stage - 项目阶段
     */
    public String getProjectStage() {
        return projectStage;
    }

    /**
     * 设置项目阶段
     *
     * @param projectStage 项目阶段
     */
    public void setProjectStage(String projectStage) {
        this.projectStage = projectStage;
    }

    /**
     * 获取科目类型
     *
     * @return subject_type - 科目类型
     */
    public String getSubjectType() {
        return subjectType;
    }

    /**
     * 设置科目类型
     *
     * @param subjectType 科目类型
     */
    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    /**
     * 获取项目编码
     *
     * @return project_code - 项目编码
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 设置项目编码
     *
     * @param projectCode 项目编码
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
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
     * 获取利润中心编码
     *
     * @return profit_center_code - 利润中心编码
     */
    public String getProfitCenterCode() {
        return profitCenterCode;
    }

    /**
     * 设置利润中心编码
     *
     * @param profitCenterCode 利润中心编码
     */
    public void setProfitCenterCode(String profitCenterCode) {
        this.profitCenterCode = profitCenterCode;
    }

    /**
     * 获取利润中心文本
     *
     * @return profit_center - 利润中心文本
     */
    public String getProfitCenter() {
        return profitCenter;
    }

    /**
     * 设置利润中心文本
     *
     * @param profitCenter 利润中心文本
     */
    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
    }

    /**
     * 获取成本中心编码
     *
     * @return cost_center_code - 成本中心编码
     */
    public String getCostCenterCode() {
        return costCenterCode;
    }

    /**
     * 设置成本中心编码
     *
     * @param costCenterCode 成本中心编码
     */
    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    /**
     * 获取成本中心
     *
     * @return cost_center - 成本中心
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * 设置成本中心
     *
     * @param costCenter 成本中心
     */
    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    /**
     * 获取WBS元素编码
     *
     * @return wbs_element_code - WBS元素编码
     */
    public String getWbsElementCode() {
        return wbsElementCode;
    }

    /**
     * 设置WBS元素编码
     *
     * @param wbsElementCode WBS元素编码
     */
    public void setWbsElementCode(String wbsElementCode) {
        this.wbsElementCode = wbsElementCode;
    }

    /**
     * 获取WBS元素
     *
     * @return wbs_element - WBS元素
     */
    public String getWbsElement() {
        return wbsElement;
    }

    /**
     * 设置WBS元素
     *
     * @param wbsElement WBS元素
     */
    public void setWbsElement(String wbsElement) {
        this.wbsElement = wbsElement;
    }

    /**
     * 获取原因码
     *
     * @return reason_code - 原因码
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * 设置原因码
     *
     * @param reasonCode 原因码
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * 获取原因码描述
     *
     * @return reason_code_text - 原因码描述
     */
    public String getReasonCodeText() {
        return reasonCodeText;
    }

    /**
     * 设置原因码描述
     *
     * @param reasonCodeText 原因码描述
     */
    public void setReasonCodeText(String reasonCodeText) {
        this.reasonCodeText = reasonCodeText;
    }

    /**
     * 获取分配号
     *
     * @return assigned_number - 分配号
     */
    public String getAssignedNumber() {
        return assignedNumber;
    }

    /**
     * 设置分配号
     *
     * @param assignedNumber 分配号
     */
    public void setAssignedNumber(String assignedNumber) {
        this.assignedNumber = assignedNumber;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取入账状态
     *
     * @return entry_status - 入账状态
     */
    public String getEntryStatus() {
        return entryStatus;
    }

    /**
     * 设置入账状态
     *
     * @param entryStatus 入账状态
     */
    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
    }

    /**
     * 获取SAP凭证编号
     *
     * @return document_no - SAP凭证编号
     */
    public String getDocumentNo() {
        return documentNo;
    }

    /**
     * 设置SAP凭证编号
     *
     * @param documentNo SAP凭证编号
     */
    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    /**
     * 获取消息号
     *
     * @return message_number - 消息号
     */
    public String getMessageNumber() {
        return messageNumber;
    }

    /**
     * 设置消息号
     *
     * @param messageNumber 消息号
     */
    public void setMessageNumber(String messageNumber) {
        this.messageNumber = messageNumber;
    }

    /**
     * 获取内部订单
     *
     * @return internal_order - 内部订单
     */
    public String getInternalOrder() {
        return internalOrder;
    }

    /**
     * 设置内部订单
     *
     * @param internalOrder 内部订单
     */
    public void setInternalOrder(String internalOrder) {
        this.internalOrder = internalOrder;
    }

    /**
     * 获取是否清账
     *
     * @return is_clear - 是否清账
     */
    public String getIsClear() {
        return isClear;
    }

    /**
     * 设置是否清账
     *
     * @param isClear 是否清账
     */
    public void setIsClear(String isClear) {
        this.isClear = isClear;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
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
     * 获取前端专用
     *
     * @return business_type_list - 前端专用
     */
    public String getBusinessTypeList() {
        return businessTypeList;
    }

    /**
     * 设置前端专用
     *
     * @param businessTypeList 前端专用
     */
    public void setBusinessTypeList(String businessTypeList) {
        this.businessTypeList = businessTypeList;
    }

    /**
     * 获取前端专用
     *
     * @return subject_type_list - 前端专用
     */
    public String getSubjectTypeList() {
        return subjectTypeList;
    }

    /**
     * 设置前端专用
     *
     * @param subjectTypeList 前端专用
     */
    public void setSubjectTypeList(String subjectTypeList) {
        this.subjectTypeList = subjectTypeList;
    }

    /**
     * 获取生成分录时的编号
     *
     * @return entry_number - 生成分录时的编号
     */
    public String getEntryNumber() {
        return entryNumber;
    }

    /**
     * 设置生成分录时的编号
     *
     * @param entryNumber 生成分录时的编号
     */
    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    /**
     * 获取分录组编号
     *
     * @return group_no - 分录组编号
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * 设置分录组编号
     *
     * @param groupNo 分录组编号
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getReversalStatus() {
        return reversalStatus;
    }

    public void setReversalStatus(String reversalStatus) {
        this.reversalStatus = reversalStatus;
    }
}