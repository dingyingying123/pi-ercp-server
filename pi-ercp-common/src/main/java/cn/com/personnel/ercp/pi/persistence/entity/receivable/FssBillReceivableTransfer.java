package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bill_receivable_transfer")
public class FssBillReceivableTransfer {
    /**
     * 主键
     */
    @Id
    @Column(name = "transfer_id")
    @GeneratedValue(generator = "JDBC")
    private String transferId;

    /**
     * 申请单号
     */
    @Column(name = "apply_number")
    private String applyNumber;

    public String getTransferClass() {
        return transferClass;
    }

    public void setTransferClass(String transferClass) {
        this.transferClass = transferClass;
    }

    @Column(name = "s_date")
    private String sDate;/*收票日期*/
    /**
     * 调拨单种类
     */
    @Column(name = "transfer_class")
    private String transferClass;

    /**
     * 申请人
     */
    private String proposer;

    /**
     * 申请人id
     */
    @Column(name = "proposer_id")
    private String proposerId;

    /**
     * 申请部门
     */
    @Column(name = "apply_part")
    private String applyPart;

    /**
     * 申请部门id
     */
    @Column(name = "apply_part_id")
    private String applyPartId;

    /**
     * 申请日期
     */
    @Column(name = "data_apply")
    private String dataApply;

    /**
     * 付款单位名称
     */
    @Column(name = "pay_company")
    private String payCompany;

    /**
     * 付款单位id
     */
    @Column(name = "pay_company_id")
    private String payCompanyId;

    /**
     * 付款实例号
     */
    @Column(name = "pay_instance")
    private String payInstance;

    /**
     * 出票银行
     */
    @Column(name = "drawer_bank")
    private String drawerBank;

    /**
     * 出票银行id
     */
    @Column(name = "drawer_bank_id")
    private String drawerBankId;

    /**
     * 背书形式
     */
    @Column(name = "rr_type")
    private String rrType;

    /**
     * 背书日期
     */
    @Column(name = "rr_date")
    private String rrDate;

    /**
     * 第一单背书类型
     */
    @Column(name = "rr_type_one")
    private String rrTypeOne;

    /**
     * 第一单被背书人
     */
    @Column(name = "rr_people_one")
    private String rrPeopleOne;

    /**
     * 第一单被背书人id
     */
    @Column(name = "rr_people_one_id")
    private String rrPeopleOneId;

    /**
     * 第二单背书类型
     */
    @Column(name = "rr_type_two")
    private String rrTypeTwo;

    /**
     * 第二单被背书人
     */
    @Column(name = "rr_people_two")
    private String rrPeopleTwo;

    /**
     * 第二单被背书人id
     */
    @Column(name = "rr_people_twp_id")
    private String rrPeopleTwpId;

    /**
     * 第三单背书类型
     */
    @Column(name = "rr_type_three")
    private String rrTypeThree;

    /**
     * 第三单被背书人
     */
    @Column(name = "rr_people_three")
    private String rrPeopleThree;

    /**
     * 第三单被背书人id
     */
    @Column(name = "rr_people_three_id")
    private String rrPeopleThreeId;

    /**
     * 金额大写
     */
    @Column(name = "money_big")
    private String moneyBig;

    /**
     * 金额小写
     */
    @Column(name = "money_small")
    private BigDecimal moneySmall;

    /**
     * 用途
     */
    private String use;
    private String type;

    /**
     * 审批状态
     */
    @Column(name = "apply_staue")
    private String applyStaue;

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
     * 流程的实例id
     */
    @Column(name = "approval_id")
    private String approvalId;

    /**
     * 开票银行
     */
    @Column(name = "drawer_bank_out")
    private String drawerBankOut;
    /**
     * 开票银行的id
     */
    @Column(name = "drawer_bank_out_id")
    private String drawerBankOutId;
    /**
     * 开票日期
     */
    @Column(name = "data_invoice")
    private String dataInvoice;


    /**
     * 到期日期
     */
    @Column(name = "data_expire")
    private String dataExpire;
    /**
     * 背书人
     */
    @Column(name = "rr_people")
    private String rrPeople;
    /**
     * 背书人id
     */
    @Column(name = "rr_people_id")
    private String rrPeopleId;
    /**
     * 调拨单状态
     */
    @Column(name = "transfer_type")
    private String transferType;

    /**
     * 执行了一单签收的操作
     */
    @Column(name = "signature_one")
    private String signatureOne;
    /**
     * 执行了二单签收的操作
     */
    @Column(name = "signature_two")
    private String signatureTwo;
    /**
     * 调执行了三单签收的操作
     */
    @Column(name = "signature_all")
    private String signatureAll;
    /**
     * 执行了全单不签收的操作
     */
    @Column(name = "signature_no_all")
    private String signatureNoAll;


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
    private String updater;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 修改时间
     */
    @Column(name = "payee_id")
    private String payeeId;

    /**
     * 批编码
     */
    @Column(name = "entry_number")
    private String entryNumber;

    /**
     * 组编号
     */
    @Column(name = "group_no")
    private String groupNo;
    @Column(name = "entry_status")
    private String entryStatus;

    @Column(name = "document_no")
    private String documentNo;
    @Column(name = "error_message")
    private String errorMessage;
    /**
     * 支出利润中心
     */
    @Column(name = "rr_ltext")
    private String rrLtext;
    /**
     * 支出利润中心编码
     */
    @Column(name = "rr_prctr")
    private String rrPrctr;
    /**
     * 付款单位的业务单元
     */
    private String busi;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRrLtext() {
        return rrLtext;
    }

    public void setRrLtext(String rrLtext) {
        this.rrLtext = rrLtext;
    }

    public String getRrPrctr() {
        return rrPrctr;
    }

    public void setRrPrctr(String rrPrctr) {
        this.rrPrctr = rrPrctr;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
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

    /**
     * 是否显示
     */
    private String deleted;

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public String getDrawerBankOut() {
        return drawerBankOut;
    }

    public void setDrawerBankOut(String drawerBankOut) {
        this.drawerBankOut = drawerBankOut;
    }

    public String getDrawerBankOutId() {
        return drawerBankOutId;
    }

    public void setDrawerBankOutId(String drawerBankOutId) {
        this.drawerBankOutId = drawerBankOutId;
    }

    public String getDataInvoice() {
        return dataInvoice;
    }

    public void setDataInvoice(String dataInvoice) {
        this.dataInvoice = dataInvoice;
    }

    public String getDataExpire() {
        return dataExpire;
    }

    public void setDataExpire(String dataExpire) {
        this.dataExpire = dataExpire;
    }

    public String getRrPeople() {
        return rrPeople;
    }

    public void setRrPeople(String rrPeople) {
        this.rrPeople = rrPeople;
    }

    public String getRrPeopleId() {
        return rrPeopleId;
    }

    public void setRrPeopleId(String rrPeopleId) {
        this.rrPeopleId = rrPeopleId;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    /**
     * 获取主键
     *
     * @return transfer_id - 主键
     */
    public String getTransferId() {
        return transferId;
    }

    /**
     * 设置主键
     *
     * @param transferId 主键
     */
    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    /**
     * 获取申请单号
     *
     * @return apply_number - 申请单号
     */
    public String getApplyNumber() {
        return applyNumber;
    }

    /**
     * 设置申请单号
     *
     * @param applyNumber 申请单号
     */
    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
    }

    /**
     * 获取申请人
     *
     * @return proposer - 申请人
     */
    public String getProposer() {
        return proposer;
    }

    /**
     * 设置申请人
     *
     * @param proposer 申请人
     */
    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    /**
     * 获取申请人id
     *
     * @return proposer_id - 申请人id
     */
    public String getProposerId() {
        return proposerId;
    }

    /**
     * 设置申请人id
     *
     * @param proposerId 申请人id
     */
    public void setProposerId(String proposerId) {
        this.proposerId = proposerId;
    }

    /**
     * 获取申请部门
     *
     * @return apply_part - 申请部门
     */
    public String getApplyPart() {
        return applyPart;
    }

    /**
     * 设置申请部门
     *
     * @param applyPart 申请部门
     */
    public void setApplyPart(String applyPart) {
        this.applyPart = applyPart;
    }

    /**
     * 获取申请部门id
     *
     * @return apply_part_id - 申请部门id
     */
    public String getApplyPartId() {
        return applyPartId;
    }

    /**
     * 设置申请部门id
     *
     * @param applyPartId 申请部门id
     */
    public void setApplyPartId(String applyPartId) {
        this.applyPartId = applyPartId;
    }

    /**
     * 获取申请日期
     *
     * @return data_apply - 申请日期
     */
    public String getDataApply() {
        return dataApply;
    }

    /**
     * 设置申请日期
     *
     * @param dataApply 申请日期
     */
    public void setDataApply(String dataApply) {
        this.dataApply = dataApply;
    }

    /**
     * 获取付款单位名称
     *
     * @return pay_company - 付款单位名称
     */
    public String getPayCompany() {
        return payCompany;
    }

    /**
     * 设置付款单位名称
     *
     * @param payCompany 付款单位名称
     */
    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany;
    }

    /**
     * 获取付款单位id
     *
     * @return pay_company_id - 付款单位id
     */
    public String getPayCompanyId() {
        return payCompanyId;
    }

    /**
     * 设置付款单位id
     *
     * @param payCompanyId 付款单位id
     */
    public void setPayCompanyId(String payCompanyId) {
        this.payCompanyId = payCompanyId;
    }

    /**
     * 获取付款实例号
     *
     * @return pay_instance - 付款实例号
     */
    public String getPayInstance() {
        return payInstance;
    }

    /**
     * 设置付款实例号
     *
     * @param payInstance 付款实例号
     */
    public void setPayInstance(String payInstance) {
        this.payInstance = payInstance;
    }

    /**
     * 获取出票银行
     *
     * @return drawer_bank - 出票银行
     */
    public String getDrawerBank() {
        return drawerBank;
    }

    /**
     * 设置出票银行
     *
     * @param drawerBank 出票银行
     */
    public void setDrawerBank(String drawerBank) {
        this.drawerBank = drawerBank;
    }

    /**
     * 获取出票银行id
     *
     * @return drawer_bank_id - 出票银行id
     */
    public String getDrawerBankId() {
        return drawerBankId;
    }

    /**
     * 设置出票银行id
     *
     * @param drawerBankId 出票银行id
     */
    public void setDrawerBankId(String drawerBankId) {
        this.drawerBankId = drawerBankId;
    }

    /**
     * 获取背书形式
     *
     * @return rr_type - 背书形式
     */
    public String getRrType() {
        return rrType;
    }

    /**
     * 设置背书形式
     *
     * @param rrType 背书形式
     */
    public void setRrType(String rrType) {
        this.rrType = rrType;
    }

    /**
     * 获取背书日期
     *
     * @return rr_date - 背书日期
     */
    public String getRrDate() {
        return rrDate;
    }

    /**
     * 设置背书日期
     *
     * @param rrDate 背书日期
     */
    public void setRrDate(String rrDate) {
        this.rrDate = rrDate;
    }

    /**
     * 获取第一单背书类型
     *
     * @return rr_type_one - 第一单背书类型
     */
    public String getRrTypeOne() {
        return rrTypeOne;
    }

    /**
     * 设置第一单背书类型
     *
     * @param rrTypeOne 第一单背书类型
     */
    public void setRrTypeOne(String rrTypeOne) {
        this.rrTypeOne = rrTypeOne;
    }

    /**
     * 获取第一单被背书人
     *
     * @return rr_people_one - 第一单被背书人
     */
    public String getRrPeopleOne() {
        return rrPeopleOne;
    }

    /**
     * 设置第一单被背书人
     *
     * @param rrPeopleOne 第一单被背书人
     */
    public void setRrPeopleOne(String rrPeopleOne) {
        this.rrPeopleOne = rrPeopleOne;
    }

    /**
     * 获取第一单被背书人id
     *
     * @return rr_people_one_id - 第一单被背书人id
     */
    public String getRrPeopleOneId() {
        return rrPeopleOneId;
    }

    /**
     * 设置第一单被背书人id
     *
     * @param rrPeopleOneId 第一单被背书人id
     */
    public void setRrPeopleOneId(String rrPeopleOneId) {
        this.rrPeopleOneId = rrPeopleOneId;
    }

    /**
     * 获取第二单背书类型
     *
     * @return rr_type_two - 第二单背书类型
     */
    public String getRrTypeTwo() {
        return rrTypeTwo;
    }

    /**
     * 设置第二单背书类型
     *
     * @param rrTypeTwo 第二单背书类型
     */
    public void setRrTypeTwo(String rrTypeTwo) {
        this.rrTypeTwo = rrTypeTwo;
    }

    /**
     * 获取第二单被背书人
     *
     * @return rr_people_two - 第二单被背书人
     */
    public String getRrPeopleTwo() {
        return rrPeopleTwo;
    }

    /**
     * 设置第二单被背书人
     *
     * @param rrPeopleTwo 第二单被背书人
     */
    public void setRrPeopleTwo(String rrPeopleTwo) {
        this.rrPeopleTwo = rrPeopleTwo;
    }

    /**
     * 获取第二单被背书人id
     *
     * @return rr_people_twp_id - 第二单被背书人id
     */
    public String getRrPeopleTwpId() {
        return rrPeopleTwpId;
    }

    /**
     * 设置第二单被背书人id
     *
     * @param rrPeopleTwpId 第二单被背书人id
     */
    public void setRrPeopleTwpId(String rrPeopleTwpId) {
        this.rrPeopleTwpId = rrPeopleTwpId;
    }

    /**
     * 获取第三单背书类型
     *
     * @return rr_type_three - 第三单背书类型
     */
    public String getRrTypeThree() {
        return rrTypeThree;
    }

    /**
     * 设置第三单背书类型
     *
     * @param rrTypeThree 第三单背书类型
     */
    public void setRrTypeThree(String rrTypeThree) {
        this.rrTypeThree = rrTypeThree;
    }

    /**
     * 获取第三单被背书人
     *
     * @return rr_people_three - 第三单被背书人
     */
    public String getRrPeopleThree() {
        return rrPeopleThree;
    }

    /**
     * 设置第三单被背书人
     *
     * @param rrPeopleThree 第三单被背书人
     */
    public void setRrPeopleThree(String rrPeopleThree) {
        this.rrPeopleThree = rrPeopleThree;
    }

    /**
     * 获取第三单被背书人id
     *
     * @return rr_people_three_id - 第三单被背书人id
     */
    public String getRrPeopleThreeId() {
        return rrPeopleThreeId;
    }

    /**
     * 设置第三单被背书人id
     *
     * @param rrPeopleThreeId 第三单被背书人id
     */
    public void setRrPeopleThreeId(String rrPeopleThreeId) {
        this.rrPeopleThreeId = rrPeopleThreeId;
    }

    /**
     * 获取金额大写
     *
     * @return money_big - 金额大写
     */
    public String getMoneyBig() {
        return moneyBig;
    }

    /**
     * 设置金额大写
     *
     * @param moneyBig 金额大写
     */
    public void setMoneyBig(String moneyBig) {
        this.moneyBig = moneyBig;
    }

    /**
     * 获取金额小写
     *
     * @return money_small - 金额小写
     */
    public BigDecimal getMoneySmall() {
        return moneySmall;
    }

    /**
     * 设置金额小写
     *
     * @param moneySmall 金额小写
     */
    public void setMoneySmall(BigDecimal moneySmall) {
        this.moneySmall = moneySmall;
    }

    /**
     * 获取用途
     *
     * @return use - 用途
     */
    public String getUse() {
        return use;
    }

    /**
     * 设置用途
     *
     * @param use 用途
     */
    public void setUse(String use) {
        this.use = use;
    }

    /**
     * 获取审批状态
     *
     * @return apply_staue - 审批状态
     */
    public String getApplyStaue() {
        return applyStaue;
    }

    /**
     * 设置审批状态
     *
     * @param applyStaue 审批状态
     */
    public void setApplyStaue(String applyStaue) {
        this.applyStaue = applyStaue;
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
     * 获取流程的实例id
     *
     * @return approval_id - 流程的实例id
     */
    public String getApprovalId() {
        return approvalId;
    }

    /**
     * 设置流程的实例id
     *
     * @param approvalId 流程的实例id
     */
    public void setApprovalId(String approvalId) {
        this.approvalId = approvalId;
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
     * @return updater - 修改人
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设置修改人
     *
     * @param updater 修改人
     */
    public void setUpdater(String updater) {
        this.updater = updater;
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
     * 获取是否显示
     *
     * @return deleted - 是否显示
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置是否显示
     *
     * @param deleted 是否显示
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getSignatureOne() {
        return signatureOne;
    }

    public void setSignatureOne(String signatureOne) {
        this.signatureOne = signatureOne;
    }

    public String getSignatureTwo() {
        return signatureTwo;
    }

    public void setSignatureTwo(String signatureTwo) {
        this.signatureTwo = signatureTwo;
    }

    public String getSignatureAll() {
        return signatureAll;
    }

    public void setSignatureAll(String signatureAll) {
        this.signatureAll = signatureAll;
    }

    public String getSignatureNoAll() {
        return signatureNoAll;
    }

    public void setSignatureNoAll(String signatureNoAll) {
        this.signatureNoAll = signatureNoAll;
    }

    public String getBusi() {
        return busi;
    }

    public void setBusi(String busi) {
        this.busi = busi;
    }
}
