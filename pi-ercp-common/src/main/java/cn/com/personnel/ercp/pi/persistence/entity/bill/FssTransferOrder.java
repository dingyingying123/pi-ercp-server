package cn.com.personnel.ercp.pi.persistence.entity.bill;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bill_transfer_order")
public class FssTransferOrder {
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

    /**
     * 冲销状态
     */
    @Column(name = "reversal_status")
    private String reversalStatus;
    /**
     * 报错消息
     */
    @Column(name = "error_message")
    private String errorMessage;
    /**
     * 申请人
     */
    private String proposer;


    /**
     * 审批的实例id
     */
    @Column(name = "approval_id")
    private String approvalId;

    /**
     * 申请人的id
     */
    @Column(name = "proposer_id")
    private String proposerId;
    /**
     * 收款人的id
     */
    @Column(name = "payee_id")
    private String payeeId;

    /**
     * 申请部门
     */
    @Column(name = "apply_part")
    private String applyPart;

    /**
     * 申请部门的id
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
     * 付款单位名称的id
     */
    @Column(name = "pay_company_id")
    private String payCompanyId;

    /**
     * 收款单位名称
     */
    @Column(name = "get_company")
    private String getCompany;

    /**
     * 收款单位名称的id
     */
    @Column(name = "get_company_id")
    private String getCompanyId;

    /**
     * 开票银行
     */
    @Column(name = "drawer_bank")
    private String drawerBank;

    /**
     * 开票银行的id
     */
    @Column(name = "drawer_bank_id")
    private String drawerBankId;

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
     * 收票日期
     */
    @Column(name = "data_collect")
    private String dataCollect;

    /**
     * 金额大写
     */
    @Column(name = "money_big")
    private String moneyBig;

    /**
     * 这个是内部调拨单的金额  金额小写
     */
    @Column(name = "money_small")
    private BigDecimal moneySmall;

    /**
     * 用途
     */
    private String use;

    /**
     * 审批状态
     */
    @Column(name = "apply_staue")
    private String applyStaue;

    /**
     * 票据编号
     */
    @Column(name = "bill_number")
    private String billNumber;

    /**
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 公司名称的id
     */
    @Column(name = "company_name_id")
    private String companyNameId;

    /**
     * 内部调拨单的票据形式
     */
    @Column(name = "bill_class")
    private String billClass;

    /**
     * 出票人
     */
    private String drawer;

    /**
     * 出票人的id
     */
    @Column(name = "drawer_id")
    private String drawerId;

    /**
     * 出票银行
     */
    @Column(name = "drawer_bank_out")
    private String drawerBankOut;

    /**
     * 出票银行的id
     */
    @Column(name = "drawer_bank_out_id")
    private String drawerBankOutId;

    /**
     * 付款人账号
     */
    @Column(name = "payer_account")
    private String payerAccount;

    /**
     * 收款人
     */
    private String payee;

    /**
     * 收款人账号
     */
    @Column(name = "payee_account")
    private String payeeAccount;

    /**
     * 币种
     */
    private String currency;
    /**
     * 币种的id
     */
    @Column(name = "currency_id")
    private String currencyId;
    /**
     * 这个是内部调拨单的金额  金额起始
     */
    @Column(name = "money_start")
    private BigDecimal moneyStart;

    /**
     * 出票日期
     */
    @Column(name = "data_out_bill")
    private String dataOutBill;

    /**
     * 汇票到期日
     */
    @Column(name = "moneyorder_stop")
    private String moneyorderStop;

    /**
     * 调拨单是否取消
     */
    @Column(name = "is_cancel")
    private String isCancel;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建日期
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人
     */
    private String updater;

    /**
     * 修改日期
     */
    @Column(name = "update_time")
    private Date updateTime;
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
     * 生成分录组编号
     */
    @Column(name = "group_no")
    private String groupNo;
    /**
     * 生成分录分录编号
     */
    @Column(name = "entry_number")
    private String entryNumber;
    /**
     * 入账状态
     */
    @Column(name = "entry_status")
    private String entryStatus;
    /**
     * SAP凭证编号
     */
    @Column(name = "sap_document_no")
    private String sapDocumentNo;

    /**
     * 取消内部调拨单后剩余的金额
     */
    @Column(name = "money_residue ")
    private BigDecimal moneyResidue ;

    public BigDecimal getMoneyResidue() {
        return moneyResidue;
    }

    public void setMoneyResidue(BigDecimal moneyResidue) {
        this.moneyResidue = moneyResidue;
    }

    public String getReversalStatus() {
        return reversalStatus;
    }

    public void setReversalStatus(String reversalStatus) {
        this.reversalStatus = reversalStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
    }

    public String getSapDocumentNo() {
        return sapDocumentNo;
    }

    public void setSapDocumentNo(String sapDocumentNo) {
        this.sapDocumentNo = sapDocumentNo;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    /**
     * 是否显示
     */
    private String deleted;

    public String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(String approvalId) {
        this.approvalId = approvalId;
    }

    /**
     * 对应的老调拨单id
     */
    @Column(name = "transfer_id_old")
    private String transferIdOld;
    /**
     * 这个表示应付票据和内部调拨单永恒的对应关系
     */
    @Column(name = "transfer_id_old_old")
    private String transferIdOldOld;

    public String getTransferIdOldOld() {
        return transferIdOldOld;
    }

    public void setTransferIdOldOld(String transferIdOldOld) {
        this.transferIdOldOld = transferIdOldOld;
    }

    public String getTransferIdOld() {
        return transferIdOld;
    }

    public void setTransferIdOld(String transferIdOld) {
        this.transferIdOld = transferIdOld;
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
     * 获取申请人的id
     *
     * @return proposer_id - 申请人的id
     */
    public String getProposerId() {
        return proposerId;
    }

    /**
     * 设置申请人的id
     *
     * @param proposerId 申请人的id
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
     * 获取申请部门的id
     *
     * @return apply_part_id - 申请部门的id
     */
    public String getApplyPartId() {
        return applyPartId;
    }

    /**
     * 设置申请部门的id
     *
     * @param applyPartId 申请部门的id
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
       /* if (dataApply == null) {
            return null;
        } else {
            return new SimpleDateFormat("yyyy-MM-dd").format(dataApply);
        }*/
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
     * 获取付款单位名称的id
     *
     * @return pay_company_id - 付款单位名称的id
     */
    public String getPayCompanyId() {
        return payCompanyId;
    }

    /**
     * 设置付款单位名称的id
     *
     * @param payCompanyId 付款单位名称的id
     */
    public void setPayCompanyId(String payCompanyId) {
        this.payCompanyId = payCompanyId;
    }

    /**
     * 获取收款单位名称
     *
     * @return get_company - 收款单位名称
     */
    public String getGetCompany() {
        return getCompany;
    }

    /**
     * 设置收款单位名称
     *
     * @param getCompany 收款单位名称
     */
    public void setGetCompany(String getCompany) {
        this.getCompany = getCompany;
    }

    /**
     * 获取收款单位名称的id
     *
     * @return get_company_id - 收款单位名称的id
     */
    public String getGetCompanyId() {
        return getCompanyId;
    }

    /**
     * 设置收款单位名称的id
     *
     * @param getCompanyId 收款单位名称的id
     */
    public void setGetCompanyId(String getCompanyId) {
        this.getCompanyId = getCompanyId;
    }

    /**
     * 获取开票银行
     *
     * @return drawer_bank - 开票银行
     */
    public String getDrawerBank() {
        return drawerBank;
    }

    /**
     * 设置开票银行
     *
     * @param drawerBank 开票银行
     */
    public void setDrawerBank(String drawerBank) {
        this.drawerBank = drawerBank;
    }

    /**
     * 获取开票银行的id
     *
     * @return drawer_bank_id - 开票银行的id
     */
    public String getDrawerBankId() {
        return drawerBankId;
    }

    /**
     * 设置开票银行的id
     *
     * @param drawerBankId 开票银行的id
     */
    public void setDrawerBankId(String drawerBankId) {
        this.drawerBankId = drawerBankId;
    }

    /**
     * 获取开票日期
     *
     * @return data_invoice - 开票日期
     */
    public String getDataInvoice() {
        return dataInvoice;
       /* if (dataInvoice == null) {
            return null;
        } else {
            return new SimpleDateFormat("yyyy-MM-dd").format(dataInvoice);
        }*/
    }

    /**
     * 设置开票日期
     *
     * @param dataInvoice 开票日期
     */
    public void setDataInvoice(String dataInvoice) {
        this.dataInvoice = dataInvoice;
    }

    /**
     * 获取到期日期
     *
     * @return data_expire - 到期日期
     */
    public String getDataExpire() {
        return dataExpire;
       /* if (dataExpire == null) {
            return null;
        } else {
            return new SimpleDateFormat("yyyy-MM-dd").format(dataExpire);
        }*/
    }

    /**
     * 设置到期日期
     *
     * @param dataExpire 到期日期
     */
    public void setDataExpire(String dataExpire) {
        this.dataExpire = dataExpire;
    }

    /**
     * 获取收票日期
     *
     * @return data_collect - 收票日期
     */
    public String getDataCollect() {
        return dataCollect;
       /* if (dataCollect == null) {
            return null;
        } else {
            return new SimpleDateFormat("yyyy-MM-dd").format(dataCollect);
        }*/
    }

    /**
     * 设置收票日期
     *
     * @param dataCollect 收票日期
     */
    public void setDataCollect(String dataCollect) {
        this.dataCollect = dataCollect;
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
     * 获取票据编号
     *
     * @return bill_number - 票据编号
     */
    public String getBillNumber() {
        return billNumber;
    }

    /**
     * 设置票据编号
     *
     * @param billNumber 票据编号
     */
    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    /**
     * 获取公司名称
     *
     * @return company_name - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取公司名称的id
     *
     * @return company_name_id - 公司名称的id
     */
    public String getCompanyNameId() {
        return companyNameId;
    }

    /**
     * 设置公司名称的id
     *
     * @param companyNameId 公司名称的id
     */
    public void setCompanyNameId(String companyNameId) {
        this.companyNameId = companyNameId;
    }

    /**
     * 获取票据形式
     *
     * @return bill_class - 票据形式
     */
    public String getBillClass() {
        return billClass;
    }

    /**
     * 设置票据形式
     *
     * @param billClass 票据形式
     */
    public void setBillClass(String billClass) {
        this.billClass = billClass;
    }

    /**
     * 获取出票人
     *
     * @return drawer - 出票人
     */
    public String getDrawer() {
        return drawer;
    }

    /**
     * 设置出票人
     *
     * @param drawer 出票人
     */
    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    /**
     * 获取出票人的id
     *
     * @return drawer_id - 出票人的id
     */
    public String getDrawerId() {
        return drawerId;
    }

    /**
     * 设置出票人的id
     *
     * @param drawerId 出票人的id
     */
    public void setDrawerId(String drawerId) {
        this.drawerId = drawerId;
    }

    /**
     * 获取出票银行
     *
     * @return drawer_bank_out - 出票银行
     */
    public String getDrawerBankOut() {
        return drawerBankOut;
    }

    /**
     * 设置出票银行
     *
     * @param drawerBankOut 出票银行
     */
    public void setDrawerBankOut(String drawerBankOut) {
        this.drawerBankOut = drawerBankOut;
    }

    /**
     * 获取出票银行的id
     *
     * @return drawer_bank_out_id - 出票银行的id
     */
    public String getDrawerBankOutId() {
        return drawerBankOutId;
    }

    /**
     * 设置出票银行的id
     *
     * @param drawerBankOutId 出票银行的id
     */
    public void setDrawerBankOutId(String drawerBankOutId) {
        this.drawerBankOutId = drawerBankOutId;
    }

    /**
     * 获取付款人账号
     *
     * @return payer_account - 付款人账号
     */
    public String getPayerAccount() {
        return payerAccount;
    }

    /**
     * 设置付款人账号
     *
     * @param payerAccount 付款人账号
     */
    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
    }

    /**
     * 获取收款人
     *
     * @return payee - 收款人
     */
    public String getPayee() {
        return payee;
    }

    /**
     * 设置收款人
     *
     * @param payee 收款人
     */
    public void setPayee(String payee) {
        this.payee = payee;
    }

    /**
     * 获取收款人账号
     *
     * @return payee_account - 收款人账号
     */
    public String getPayeeAccount() {
        return payeeAccount;
    }

    /**
     * 设置收款人账号
     *
     * @param payeeAccount 收款人账号
     */
    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
    }

    /**
     * 获取币种
     *
     * @return currency - 币种
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置币种
     *
     * @param currency 币种
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 获取金额
     *
     * @return money_start - 金额
     */
    public BigDecimal getMoneyStart() {
        return moneyStart;
    }

    /**
     * 设置金额
     *
     * @param moneyStart 金额
     */
    public void setMoneyStart(BigDecimal moneyStart) {
        this.moneyStart = moneyStart;
    }

    /**
     * 获取出票日期
     *
     * @return data_out_bill - 出票日期
     */
    public String getDataOutBill() {

        return dataOutBill;
      /*  if (dataOutBill == null) {
            return null;
        } else {
            return new SimpleDateFormat("yyyy-MM-dd").format(dataOutBill);
        }*/
    }

    /**
     * 设置出票日期
     *
     * @param dataOutBill 出票日期
     */
    public void setDataOutBill(String dataOutBill) {
        this.dataOutBill = dataOutBill;
    }

    /**
     * 获取汇票到期日
     *
     * @return moneyorder_stop - 汇票到期日
     */
    public String getMoneyorderStop() {
        return moneyorderStop;
       /* if (moneyorderStop == null) {
            return null;
        } else {
            return new SimpleDateFormat("yyyy-MM-dd").format(moneyorderStop);
        }*/
    }

    /**
     * 设置汇票到期日
     *
     * @param moneyorderStop 汇票到期日
     */
    public void setMoneyorderStop(String moneyorderStop) {
        this.moneyorderStop = moneyorderStop;
    }

    /**
     * 获取调拨单是否取消
     *
     * @return is_cancel - 调拨单是否取消
     */
    public String getIsCancel() {
        return isCancel;
    }

    /**
     * 设置调拨单是否取消
     *
     * @param isCancel 调拨单是否取消
     */
    public void setIsCancel(String isCancel) {
        this.isCancel = isCancel;
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
     * 获取创建日期
     *
     * @return create_time - 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建日期
     *
     * @param createTime 创建日期
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
     * 获取修改日期
     *
     * @return update_time - 修改日期
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改日期
     *
     * @param updateTime 修改日期
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
}
