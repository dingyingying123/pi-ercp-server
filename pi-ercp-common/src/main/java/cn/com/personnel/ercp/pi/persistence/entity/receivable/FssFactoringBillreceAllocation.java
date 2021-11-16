package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TODO
 * 应收票据生成分录实体
 * @author DongAiHua
 * @Date 2020/9/18 14:31
 */
@Table(name = "fss_bill_receivable_allocation")
public class FssFactoringBillreceAllocation {
    /**
     * 会计分录ID
     */
    @Id
    @Column(name = "documents_id")
    @GeneratedValue(generator = "JDBC")
    private String documentsId;

    /**
     * 生成分录各功能id
     */
    @Column(name = "main_id")
    private String mainId;

    /**
     * 规则ID
     */
    @Column(name = "rule_id")
    private String ruleId;
    /**
     * 冲销信息
     * */
    @Column(name = "reversal_msg")
    private String reversalMsg;
    @Column(name = "succes_date")
    private String succesDate;
    @Column(name = "reversal_date")
    private String reversalDate;
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
    @Column(name = "summary")
    private String summary;

    /**
     * 币种编码
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 币种名称
     */
    @Column(name = "currency")
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
     * 科目类型
     */
    @Column(name = "subject_type")
    private String subjectType;

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
     * 到期日
     */
    @Column(name = "expiry_date")
    private String expiryDate;

    /**
     * 金额
     */
    @Column(name = "amount")
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
     * 对方利润中心
     */
    @Column(name = "opposite_profit_center_code")
    private String oppositeProfitCenterCode;
    /**
     * 对方利润中心名称
     */
    @Column(name = "opposite_profit_center")
    private String oppositeProfitCenter;
    /**
     * 票据后十位
     */
    @Column(name = "check_no")
    private String checkNo;
    /**
     * 票据编号
     */
    @Column(name = "bill_number")
    private String billNumber;
    @Column(name = "sub_id")
    private String subId;
    @Column(name = "tran_type")
    private String tranType;
    @Column(name = "rece_id_text")
    private String receIdText;

    @Column(name = "reversal_status")
    private String reversalStatus;
    @Column(name = "reversal_sap_no")
    private String reversalSapNo;
    @Column(name = "i_guid")
    private String iGuid;
    @Column(name = "tr_type")
    private String trType;

    @Column(name = "rr_type")
    private String rrType;

    public String getTrType() {
        return trType;
    }

    public void setTrType(String trType) {
        this.trType = trType;
    }

    public String getReversalSapNo() {
        return reversalSapNo;
    }

    public void setReversalSapNo(String reversalSapNo) {
        this.reversalSapNo = reversalSapNo;
    }

    public String getIGuid() {
        return iGuid;
    }

    public void setIGuid(String iGuid) {
        this.iGuid = iGuid;
    }

    public String getSuccesDate() {
        return succesDate;
    }

    public void setSuccesDate(String succesDate) {
        this.succesDate = succesDate;
    }

    public String getReversalDate() {
        return reversalDate;
    }

    public void setReversalDate(String reversalDate) {
        this.reversalDate = reversalDate;
    }

    public String getReversalStatus() {
        return reversalStatus;
    }

    public void setReversalStatus(String reversalStatus) {
        this.reversalStatus = reversalStatus;
    }

    public String getReceIdText() {
        return receIdText;
    }

    public void setReceIdText(String receIdText) {
        this.receIdText = receIdText;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    public String getDocumentsId() {
        return documentsId;
    }

    public void setDocumentsId(String documentsId) {
        this.documentsId = documentsId;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCreditDate() {
        return creditDate;
    }

    public void setCreditDate(String creditDate) {
        this.creditDate = creditDate;
    }

    public String getCommercianUnitId() {
        return commercianUnitId;
    }

    public void setCommercianUnitId(String commercianUnitId) {
        this.commercianUnitId = commercianUnitId;
    }

    public String getCommercianUnit() {
        return commercianUnit;
    }

    public void setCommercianUnit(String commercianUnit) {
        this.commercianUnit = commercianUnit;
    }

    public String getBusinessModuleId() {
        return businessModuleId;
    }

    public void setBusinessModuleId(String businessModuleId) {
        this.businessModuleId = businessModuleId;
    }

    public String getBusinessModule() {
        return businessModule;
    }

    public void setBusinessModule(String businessModule) {
        this.businessModule = businessModule;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBorrowLoan() {
        return borrowLoan;
    }

    public void setBorrowLoan(String borrowLoan) {
        this.borrowLoan = borrowLoan;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubjectText() {
        return subjectText;
    }

    public void setSubjectText(String subjectText) {
        this.subjectText = subjectText;
    }

    public String getLifnr() {
        return lifnr;
    }

    public void setLifnr(String lifnr) {
        this.lifnr = lifnr;
    }

    public String getLifnrText() {
        return lifnrText;
    }

    public void setLifnrText(String lifnrText) {
        this.lifnrText = lifnrText;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public String getProfitCenterCode() {
        return profitCenterCode;
    }

    public void setProfitCenterCode(String profitCenterCode) {
        this.profitCenterCode = profitCenterCode;
    }

    public String getProfitCenter() {
        return profitCenter;
    }

    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getWbsElementCode() {
        return wbsElementCode;
    }

    public void setWbsElementCode(String wbsElementCode) {
        this.wbsElementCode = wbsElementCode;
    }

    public String getWbsElement() {
        return wbsElement;
    }

    public void setWbsElement(String wbsElement) {
        this.wbsElement = wbsElement;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonCodeText() {
        return reasonCodeText;
    }

    public void setReasonCodeText(String reasonCodeText) {
        this.reasonCodeText = reasonCodeText;
    }

    public String getAssignedNumber() {
        return assignedNumber;
    }

    public void setAssignedNumber(String assignedNumber) {
        this.assignedNumber = assignedNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public String getMessageNumber() {
        return messageNumber;
    }

    public void setMessageNumber(String messageNumber) {
        this.messageNumber = messageNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getBusinessTypeList() {
        return businessTypeList;
    }

    public void setBusinessTypeList(String businessTypeList) {
        this.businessTypeList = businessTypeList;
    }

    public String getSubjectTypeList() {
        return subjectTypeList;
    }

    public void setSubjectTypeList(String subjectTypeList) {
        this.subjectTypeList = subjectTypeList;
    }

    public String getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }


    public String getOppositeProfitCenterCode() {
        return oppositeProfitCenterCode;
    }

    public void setOppositeProfitCenterCode(String oppositeProfitCenterCode) {
        this.oppositeProfitCenterCode = oppositeProfitCenterCode;
    }

    public String getOppositeProfitCenter() {
        return oppositeProfitCenter;
    }

    public void setOppositeProfitCenter(String oppositeProfitCenter) {
        this.oppositeProfitCenter = oppositeProfitCenter;
    }

    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getiGuid() {
        return iGuid;
    }

    public void setiGuid(String iGuid) {
        this.iGuid = iGuid;
    }

    public String getReversalMsg() {
        return reversalMsg;
    }

    public void setReversalMsg(String reversalMsg) {
        this.reversalMsg = reversalMsg;
    }

    public String getRrType() {
        return rrType;
    }

    public void setRrType(String rrType) {
        this.rrType = rrType;
    }
}
