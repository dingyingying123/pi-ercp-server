package cn.com.personnel.ercp.pi.persistence.entity.accounting;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "v_accounting")
public class VAccounting {
    private String typename;

    @Column(name = "documents_id")
    private String documentsId;

    @Column(name = "sub_id")
    private String subId;

    @Column(name = "main_id")
    private String mainId;

    @Column(name = "rule_id")
    private String ruleId;

    @Column(name = "contract_name")
    private String contractName;

    @Column(name = "contract_num")
    private String contractNum;

    @Column(name = "organ_id")
    private String organId;

    @Column(name = "organ_name")
    private String organName;

    private String summary;

    @Column(name = "currency_code")
    private String currencyCode;

    private String currency;

    @Column(name = "credit_date")
    private String creditDate;

    @Column(name = "commercian_unit_id")
    private String commercianUnitId;

    @Column(name = "commercian_unit")
    private String commercianUnit;

    @Column(name = "business_module_id")
    private String businessModuleId;

    @Column(name = "business_module")
    private String businessModule;

    @Column(name = "business_type")
    private String businessType;

    @Column(name = "borrow_loan")
    private String borrowLoan;

    private String subject;

    @Column(name = "subject_text")
    private String subjectText;

    private String lifnr;

    @Column(name = "lifnr_text")
    private String lifnrText;

    @Column(name = "loan_term")
    private String loanTerm;

    @Column(name = "project_stage")
    private String projectStage;

    @Column(name = "subject_type")
    private String subjectType;

    @Column(name = "project_code")
    private String projectCode;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "profit_center_code")
    private String profitCenterCode;

    @Column(name = "profit_center")
    private String profitCenter;

    @Column(name = "cost_center_code")
    private String costCenterCode;

    @Column(name = "cost_center")
    private String costCenter;

    @Column(name = "wbs_element_code")
    private String wbsElementCode;

    @Column(name = "wbs_element")
    private String wbsElement;

    @Column(name = "reason_code")
    private String reasonCode;

    @Column(name = "reason_code_text")
    private String reasonCodeText;

    @Column(name = "assigned_number")
    private String assignedNumber;

    private BigDecimal amount;

    @Column(name = "entry_status")
    private String entryStatus;

    @Column(name = "document_no")
    private String documentNo;

    @Column(name = "message_number")
    private String messageNumber;

    @Column(name = "internal_order")
    private String internalOrder;

    @Column(name = "is_clear")
    private String isClear;

    private String type;

    private String remarks;

    private String status;

    private String reserve;

    @Column(name = "create_time")
    private Date createTime;

    private String creator;

    @Column(name = "update_time")
    private Date updateTime;

    private String updater;

    private String deleted;

    @Column(name = "business_type_list")
    private String businessTypeList;

    @Column(name = "subject_type_list")
    private String subjectTypeList;

    @Column(name = "entry_number")
    private String entryNumber;

    @Column(name = "group_no")
    private String groupNo;

    @Column(name = "entry_type")
    private String entryType;

    @Column(name = "expiry_date")
    private String expiryDate;

    @Column(name = "tran_type")
        private String tranType;

    @Column(name = "check_no")
    private String checkNo;

    @Column(name = "bill_number")
    private String billNumber;

    @Column(name = "payer_account")
    private String payerAccount;

    @Column(name = "opposite_profit_center_code")
    private String oppositeProfitCenterCode;

    @Column(name = "opposite_profit_center")
    private String oppositeProfitCenter;

    @Column(name = "reversal_status")
    private String reversalStatus;

    @Column(name = "reversal_sap_no")
    private String reversalSapNo;

    @Column(name = "i_guid")
    private String iGuid;

    @Column(name = "reversal_error_message")
    private String reversalErrorMessage;

    @Column(name = "business_partner_id")
    private String businessPartnerId;

    @Column(name = "business_partner")
    private String businessPartner;

    @Column(name = "succes_date")
    private String succesDate;

    @Column(name = "reversal_date")
    private String reversalDate;

    @Column(name = "rece_id_text")
    private String receIdText;

    @Column(name = "value_date")
    private String valueDate;

    @Column(name = "is_edit")
    private String isEdit;

    @Column(name = "anti_accounting_indicator")
    private String antiAccountingIndicator;

    @Column(name = "functiontype")
    private String functionType;

    public String getFunctionType() {
        return functionType;
    }

    public void setFunctionType(String functionType) {
        this.functionType = functionType;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    /**
     * @return typename
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param typename
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }

    /**
     * @return documents_id
     */
    public String getDocumentsId() {
        return documentsId;
    }

    /**
     * @param documentsId
     */
    public void setDocumentsId(String documentsId) {
        this.documentsId = documentsId;
    }

    /**
     * @return sub_id
     */
    public String getSubId() {
        return subId;
    }

    /**
     * @param subId
     */
    public void setSubId(String subId) {
        this.subId = subId;
    }

    /**
     * @return main_id
     */
    public String getMainId() {
        return mainId;
    }

    /**
     * @param mainId
     */
    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    /**
     * @return rule_id
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * @param ruleId
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * @return contract_name
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * @param contractName
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * @return contract_num
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * @param contractNum
     */
    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    /**
     * @return organ_id
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * @param organId
     */
    public void setOrganId(String organId) {
        this.organId = organId;
    }

    /**
     * @return organ_name
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * @param organName
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return currency_code
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return credit_date
     */
    public String getCreditDate() {
        return creditDate;
    }

    /**
     * @param creditDate
     */
    public void setCreditDate(String creditDate) {
        this.creditDate = creditDate;
    }

    /**
     * @return commercian_unit_id
     */
    public String getCommercianUnitId() {
        return commercianUnitId;
    }

    /**
     * @param commercianUnitId
     */
    public void setCommercianUnitId(String commercianUnitId) {
        this.commercianUnitId = commercianUnitId;
    }

    /**
     * @return commercian_unit
     */
    public String getCommercianUnit() {
        return commercianUnit;
    }

    /**
     * @param commercianUnit
     */
    public void setCommercianUnit(String commercianUnit) {
        this.commercianUnit = commercianUnit;
    }

    /**
     * @return business_module_id
     */
    public String getBusinessModuleId() {
        return businessModuleId;
    }

    /**
     * @param businessModuleId
     */
    public void setBusinessModuleId(String businessModuleId) {
        this.businessModuleId = businessModuleId;
    }

    /**
     * @return business_module
     */
    public String getBusinessModule() {
        return businessModule;
    }

    /**
     * @param businessModule
     */
    public void setBusinessModule(String businessModule) {
        this.businessModule = businessModule;
    }

    /**
     * @return business_type
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * @param businessType
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    /**
     * @return borrow_loan
     */
    public String getBorrowLoan() {
        return borrowLoan;
    }

    /**
     * @param borrowLoan
     */
    public void setBorrowLoan(String borrowLoan) {
        this.borrowLoan = borrowLoan;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return subject_text
     */
    public String getSubjectText() {
        return subjectText;
    }

    /**
     * @param subjectText
     */
    public void setSubjectText(String subjectText) {
        this.subjectText = subjectText;
    }

    /**
     * @return lifnr
     */
    public String getLifnr() {
        return lifnr;
    }

    /**
     * @param lifnr
     */
    public void setLifnr(String lifnr) {
        this.lifnr = lifnr;
    }

    /**
     * @return lifnr_text
     */
    public String getLifnrText() {
        return lifnrText;
    }

    /**
     * @param lifnrText
     */
    public void setLifnrText(String lifnrText) {
        this.lifnrText = lifnrText;
    }

    /**
     * @return loan_term
     */
    public String getLoanTerm() {
        return loanTerm;
    }

    /**
     * @param loanTerm
     */
    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }

    /**
     * @return project_stage
     */
    public String getProjectStage() {
        return projectStage;
    }

    /**
     * @param projectStage
     */
    public void setProjectStage(String projectStage) {
        this.projectStage = projectStage;
    }

    /**
     * @return subject_type
     */
    public String getSubjectType() {
        return subjectType;
    }

    /**
     * @param subjectType
     */
    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    /**
     * @return project_code
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * @param projectCode
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    /**
     * @return project_name
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return profit_center_code
     */
    public String getProfitCenterCode() {
        return profitCenterCode;
    }

    /**
     * @param profitCenterCode
     */
    public void setProfitCenterCode(String profitCenterCode) {
        this.profitCenterCode = profitCenterCode;
    }

    /**
     * @return profit_center
     */
    public String getProfitCenter() {
        return profitCenter;
    }

    /**
     * @param profitCenter
     */
    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
    }

    /**
     * @return cost_center_code
     */
    public String getCostCenterCode() {
        return costCenterCode;
    }

    /**
     * @param costCenterCode
     */
    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    /**
     * @return cost_center
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * @param costCenter
     */
    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    /**
     * @return wbs_element_code
     */
    public String getWbsElementCode() {
        return wbsElementCode;
    }

    /**
     * @param wbsElementCode
     */
    public void setWbsElementCode(String wbsElementCode) {
        this.wbsElementCode = wbsElementCode;
    }

    /**
     * @return wbs_element
     */
    public String getWbsElement() {
        return wbsElement;
    }

    /**
     * @param wbsElement
     */
    public void setWbsElement(String wbsElement) {
        this.wbsElement = wbsElement;
    }

    /**
     * @return reason_code
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * @param reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * @return reason_code_text
     */
    public String getReasonCodeText() {
        return reasonCodeText;
    }

    /**
     * @param reasonCodeText
     */
    public void setReasonCodeText(String reasonCodeText) {
        this.reasonCodeText = reasonCodeText;
    }

    /**
     * @return assigned_number
     */
    public String getAssignedNumber() {
        return assignedNumber;
    }

    /**
     * @param assignedNumber
     */
    public void setAssignedNumber(String assignedNumber) {
        this.assignedNumber = assignedNumber;
    }

    /**
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return entry_status
     */
    public String getEntryStatus() {
        return entryStatus;
    }

    /**
     * @param entryStatus
     */
    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
    }

    /**
     * @return document_no
     */
    public String getDocumentNo() {
        return documentNo;
    }

    /**
     * @param documentNo
     */
    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    /**
     * @return message_number
     */
    public String getMessageNumber() {
        return messageNumber;
    }

    /**
     * @param messageNumber
     */
    public void setMessageNumber(String messageNumber) {
        this.messageNumber = messageNumber;
    }

    /**
     * @return internal_order
     */
    public String getInternalOrder() {
        return internalOrder;
    }

    /**
     * @param internalOrder
     */
    public void setInternalOrder(String internalOrder) {
        this.internalOrder = internalOrder;
    }

    /**
     * @return is_clear
     */
    public String getIsClear() {
        return isClear;
    }

    /**
     * @param isClear
     */
    public void setIsClear(String isClear) {
        this.isClear = isClear;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return reserve
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * @param reserve
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
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

    /**
     * @return updater
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * @param updater
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * @return deleted
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * @return business_type_list
     */
    public String getBusinessTypeList() {
        return businessTypeList;
    }

    /**
     * @param businessTypeList
     */
    public void setBusinessTypeList(String businessTypeList) {
        this.businessTypeList = businessTypeList;
    }

    /**
     * @return subject_type_list
     */
    public String getSubjectTypeList() {
        return subjectTypeList;
    }

    /**
     * @param subjectTypeList
     */
    public void setSubjectTypeList(String subjectTypeList) {
        this.subjectTypeList = subjectTypeList;
    }

    /**
     * @return entry_number
     */
    public String getEntryNumber() {
        return entryNumber;
    }

    /**
     * @param entryNumber
     */
    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    /**
     * @return group_no
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * @param groupNo
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    /**
     * @return entry_type
     */
    public String getEntryType() {
        return entryType;
    }

    /**
     * @param entryType
     */
    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    /**
     * @return expiry_date
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return tran_type
     */
    public String getTranType() {
        return tranType;
    }

    /**
     * @param tranType
     */
    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    /**
     * @return check_no
     */
    public String getCheckNo() {
        return checkNo;
    }

    /**
     * @param checkNo
     */
    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    /**
     * @return bill_number
     */
    public String getBillNumber() {
        return billNumber;
    }

    /**
     * @param billNumber
     */
    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    /**
     * @return payer_account
     */
    public String getPayerAccount() {
        return payerAccount;
    }

    /**
     * @param payerAccount
     */
    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
    }

    /**
     * @return opposite_profit_center_code
     */
    public String getOppositeProfitCenterCode() {
        return oppositeProfitCenterCode;
    }

    /**
     * @param oppositeProfitCenterCode
     */
    public void setOppositeProfitCenterCode(String oppositeProfitCenterCode) {
        this.oppositeProfitCenterCode = oppositeProfitCenterCode;
    }

    /**
     * @return opposite_profit_center
     */
    public String getOppositeProfitCenter() {
        return oppositeProfitCenter;
    }

    /**
     * @param oppositeProfitCenter
     */
    public void setOppositeProfitCenter(String oppositeProfitCenter) {
        this.oppositeProfitCenter = oppositeProfitCenter;
    }

    /**
     * @return reversal_status
     */
    public String getReversalStatus() {
        return reversalStatus;
    }

    /**
     * @param reversalStatus
     */
    public void setReversalStatus(String reversalStatus) {
        this.reversalStatus = reversalStatus;
    }

    /**
     * @return reversal_sap_no
     */
    public String getReversalSapNo() {
        return reversalSapNo;
    }

    /**
     * @param reversalSapNo
     */
    public void setReversalSapNo(String reversalSapNo) {
        this.reversalSapNo = reversalSapNo;
    }

    /**
     * @return i_guid
     */
    public String getiGuid() {
        return iGuid;
    }

    /**
     * @param iGuid
     */
    public void setiGuid(String iGuid) {
        this.iGuid = iGuid;
    }

    /**
     * @return reversal_error_message
     */
    public String getReversalErrorMessage() {
        return reversalErrorMessage;
    }

    /**
     * @param reversalErrorMessage
     */
    public void setReversalErrorMessage(String reversalErrorMessage) {
        this.reversalErrorMessage = reversalErrorMessage;
    }

    /**
     * @return business_partner_id
     */
    public String getBusinessPartnerId() {
        return businessPartnerId;
    }

    /**
     * @param businessPartnerId
     */
    public void setBusinessPartnerId(String businessPartnerId) {
        this.businessPartnerId = businessPartnerId;
    }

    /**
     * @return business_partner
     */
    public String getBusinessPartner() {
        return businessPartner;
    }

    /**
     * @param businessPartner
     */
    public void setBusinessPartner(String businessPartner) {
        this.businessPartner = businessPartner;
    }

    /**
     * @return succes_date
     */
    public String getSuccesDate() {
        return succesDate;
    }

    /**
     * @param succesDate
     */
    public void setSuccesDate(String succesDate) {
        this.succesDate = succesDate;
    }

    /**
     * @return reversal_date
     */
    public String getReversalDate() {
        return reversalDate;
    }

    /**
     * @param reversalDate
     */
    public void setReversalDate(String reversalDate) {
        this.reversalDate = reversalDate;
    }

    /**
     * @return rece_id_text
     */
    public String getReceIdText() {
        return receIdText;
    }

    /**
     * @param receIdText
     */
    public void setReceIdText(String receIdText) {
        this.receIdText = receIdText;
    }

    public String getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit;
    }

    public String getAntiAccountingIndicator() {
        return antiAccountingIndicator;
    }

    public void setAntiAccountingIndicator(String antiAccountingIndicator) {
        this.antiAccountingIndicator = antiAccountingIndicator;
    }
}