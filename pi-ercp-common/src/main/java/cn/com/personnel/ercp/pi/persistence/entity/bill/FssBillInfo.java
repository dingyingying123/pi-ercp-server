package cn.com.personnel.ercp.pi.persistence.entity.bill;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Table(name = "fss_bill_info")
public class FssBillInfo {

    /**
     * 是否删除，0未删除，1已删除
     */
    private String deleted;
    /**
     * 这个是主键
     */
    @Id
    @Column(name = "bill_id")
    @GeneratedValue(generator = "JDBC")
    private String billId;

    /**
     * 公司名称
     * 公司名称
     */
    @Excel(name = "公司名称")
    @Column(name = "company_name")
    private String companyName;

    /**
     * 公司id
     */
    @Column(name = "company_id")
    private String companyId;
    /**
     * 这个是对应的应收票据的id
     */
    @Column(name = "rece_id")
    private String receId;

    /**
     * 是否取消内部调拨单的状态  标记关联了取消内部调拨单的操作
     */
    @Column(name = "is_cacel_trasfer")
    private String isCacelTrasfer;

    public String getIsJoin() {
        return isJoin;
    }

    public void seIsJoin(String isJoin) {
        this.isJoin = isJoin;
    }

    /**
     * 公司是否并表
     */

    @Column(name = "is_join")
    private String isJoin;
    /**
     * 公司id
     */
    @Column(name = "is_transfer_staue")
    private String isTransferStaue;

    public String getIsTransferStaue() {
        return isTransferStaue;
    }

    public void setIsTransferStaue(String isTransferStaue) {
        this.isTransferStaue = isTransferStaue;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    /**
     * 对应的调拨单id
     */
    @Column(name = "transfer_id")
    private String transferId;

    public String getTransferIdOld() {
        return transferIdOld;
    }

    public void setTransferIdOld(String transferIdOld) {
        this.transferIdOld = transferIdOld;
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

    @Column(name = "drawer_head_bank")
    private String drawerHeadBank; /*银行总行名称*/
    @Column(name = "drawer_head_bank_id")
    private String drawerHeadBankId;/*银行总行id*/

    public String getDrawerHeadBank() {
        return drawerHeadBank;
    }

    public void setDrawerHeadBank(String drawerHeadBank) {
        this.drawerHeadBank = drawerHeadBank;
    }

    public String getDrawerHeadBankId() {
        return drawerHeadBankId;
    }

    public void setDrawerHeadBankId(String drawerHeadBankId) {
        this.drawerHeadBankId = drawerHeadBankId;
    }

    public String getTransferIdOldOld() {
        return transferIdOldOld;
    }

    public void setTransferIdOldOld(String transferIdOldOld) {
        this.transferIdOldOld = transferIdOldOld;
    }

    public String getIsCacelTrasfer() {
        return isCacelTrasfer;
    }

    public void setIsCacelTrasfer(String isCacelTrasfer) {
        this.isCacelTrasfer = isCacelTrasfer;
    }

    public String getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
    }

    public String getAcceptorName() {
        return acceptorName;
    }

    public void setAcceptorName(String acceptorName) {
        this.acceptorName = acceptorName;
    }

    public String getAcceptorBankName() {
        return acceptorBankName;
    }

    public void setAcceptorBankName(String acceptorBankName) {
        this.acceptorBankName = acceptorBankName;
    }

    public String getAcceptorBankNumber() {
        return acceptorBankNumber;
    }

    public void setAcceptorBankNumber(String acceptorBankNumber) {
        this.acceptorBankNumber = acceptorBankNumber;
    }

    public String getAcceptorBankCarId() {
        return acceptorBankCarId;
    }

    public void setAcceptorBankCarId(String acceptorBankCarId) {
        this.acceptorBankCarId = acceptorBankCarId;
    }

    /**
     * 对应的调拨单申请单号
     */
    @Column(name = "apply_number")
    private String applyNumber;
    /**
     * 应付票据关联的取消的内部调拨单申请单号
     */
    @Column(name = "apply_number_old")
    private String applyNumberOld;

    /**
     * 票据编号
     */
    @Excel(name = "票据编号")
    @Column(name = "bill_number")
    private String billNumber;

    /**
     * 出票人
     */
    @Excel(name = "出票人")
    private String drawer;

    /**
     * 供应商id
     */
    @Column(name = "drawer_id")
    private String drawerId;
    /**
     * 承兑人全称
     */
    @Excel(name = "承兑人全称")
    @Column(name = "acceptor_name")
    private String acceptorName;
    /**
     * 承兑人开户行
     */
    @Excel(name = "承兑人开户行")
    @Column(name = "acceptor_bank_name")
    private String acceptorBankName;
    /**
     * 承兑人开户行行号
     */
    @Excel(name = "承兑人开户行行号")
    @Column(name = "acceptor_bank_number")
    private String acceptorBankNumber;
    /**
     * 承兑人账号
     */
    @Excel(name = "承兑人账号")
    @Column(name = "acceptor_bank_car_id")
    private String acceptorBankCarId;

    /**
     * 出票银行
     */
    @Excel(name = "出票银行")
    @Column(name = "drawer_bank")
    private String drawerBank;

    /**
     * 出票银行code
     */
    @Column(name = "bank_code")
    private String bankCode;

    /**
     * 出票银行id
     */
    @Column(name = "bank_id")
    private String bankId;

    /**
     * 协议编号
     */
    @Excel(name = "协议编号")
    @Column(name = "contract_number")
    private String contractNumber;

    /**
     * 0到期 1没到期
     */
    @Excel(name = "是否到期")
    @Column(name = "is_expire")
    private String isExpire;

    /**
     * 金额（起）
     */
    @Excel(name = "金额（起）")
    @Column(name = "money_start")
    private BigDecimal moneyStart;

    /**
     * 金额（止）
     */
    @Excel(name = "金额（止）")
    @Column(name = "money_stop")
    private BigDecimal moneyStop;

    /**
     * 付款人账号
     */
    @Excel(name = "付款人账号")
    @Column(name = "payer_account")
    private String payerAccount;

    /**
     * 收款人账号
     */
    @Excel(name = "收款人账号")
    @Column(name = "payee_account")
    private String payeeAccount;

    /**
     * 收款人
     */
    @Excel(name = "收款人")
    private String payee;

    /**
     * 收款人id
     */
    @Column(name = "payee_id")
    private String payeeId;

    /**
     * 票据金额
     */
    @Excel(name = "票据金额")
    @Column(name = "drawer_amount")
    private BigDecimal drawerAmount;

    /**
     * 出票日期（始）
     */

    @Column(name = "draft_start")
    private Date draftStart;

    /**
     * 出票日期（止）
     */

    @Excel(name = "出票日期（止）")
    @Column(name = "draft_stop")
    private Date draftStop;

    /**
     * 汇票到期日（始）
     */

    @Column(name = "moneyorder_start")
    private Date moneyorderStart;

    /**
     * 汇票到期日（止）
     */
    @Excel(name = "汇票到期日（止）")
    @Column(name = "moneyorder_stop")
    private Date moneyorderStop;

    /**
     * 是否转让
     */
    @Excel(name = "是否可转让")
    @Column(name = "is_transfer")
    private String isTransfer;

    /**
     * 0表示是  1表示否
     */
    @Excel(name = "是否票据池质押开票")
    @Column(name = "is_guaranty")
    private String isGuaranty;

    /**
     * 票据状态
     */
    @Excel(name = "票据状态")
    @Column(name = "bill_staue")
    private String billStaue;

    /**
     * 票据形式  1到4 4种
     */
    @Excel(name = "票据形式")
    @Column(name = "bill_class")
    private String billClass;

    /**
     * 备注
     */
    @Excel(name = "备注")
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
     * 利润中心编码
     */
    @Excel(name = "收入利润中心编码")
    @Column(name = "prctr")
    private String prctr;
    /**
     * 利润中心名称
     */
    @Column(name = "ltext")
    private String ltext;

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
     * 币种
     */
    @Excel(name = "币种")
    private String currency;
    /**
     * 这个是取消内部调拨单的id
     */
    @Column(name = "transfer_id_cacel")
    private String transferIdCacel;
    /**
     * 币种的id
     */
    @Column(name = "currency_id")
    private String currencyId;
    /**
     * 币种的code
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 票据的收存日期
     */
    @Column(name = "data_collect")
    private Date dataCollect;
    /**
     * 票据类型 正常0，回退1
     */
    @Column(name = "bill_case")
    private String billCase;

    public String getTransferIdCacel() {
        return transferIdCacel;
    }

    public void setTransferIdCacel(String transferIdCacel) {
        this.transferIdCacel = transferIdCacel;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getPrctr() {
        return prctr;
    }

    public void setPrctr(String prctr) {
        this.prctr = prctr;
    }

    public String getLtext() {
        return ltext;
    }

    public void setLtext(String ltext) {
        this.ltext = ltext;
    }

    public void setIsJoin(String isJoin) {
        this.isJoin = isJoin;
    }

    public String getBillCase() {
        return billCase;
    }

    public void setBillCase(String billCase) {
        this.billCase = billCase;
    }

    public Date getDataCollect() {
        return dataCollect;

/*
        if (dataCollect == null) {
            return null;
        }else {
            return new SimpleDateFormat("yyyy-MM-dd").format(dataCollect);
        }*/
    }

    public void setDataCollect(Date dataCollect) {
        this.dataCollect = dataCollect;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }


    /**
     * 获取这个是主键
     *
     * @return bill_id - 这个是主键
     */
    public String getBillId() {
        return billId;
    }

    /**
     * 设置这个是主键
     *
     * @param billId 这个是主键
     */
    public void setBillId(String billId) {
        this.billId = billId;
    }

    /**
     * 获取公司名称
     * 公司名称
     *
     * @return company_name - 公司名称
     * 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     * 公司名称
     *
     * @param companyName 公司名称
     *                    公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取公司id
     *
     * @return company_id - 公司id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置公司id
     *
     * @param companyId 公司id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
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
     * 获取供应商id
     *
     * @return drawer_id - 供应商id
     */
    public String getDrawerId() {
        return drawerId;
    }

    /**
     * 设置供应商id
     *
     * @param drawerId 供应商id
     */
    public void setDrawerId(String drawerId) {
        this.drawerId = drawerId;
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
     * 获取出票银行code
     *
     * @return bank_code - 出票银行code
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置出票银行code
     *
     * @param bankCode 出票银行code
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 获取出票银行id
     *
     * @return bank_id - 出票银行id
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * 设置出票银行id
     *
     * @param bankId 出票银行id
     */
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    /**
     * 获取协议编号
     *
     * @return contract_number - 协议编号
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * 设置协议编号
     *
     * @param contractNumber 协议编号
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    /**
     * 获取0到期 1没到期
     *
     * @return is_expire - 0到期 1没到期
     */
    public String getIsExpire() {
        return isExpire;
    }

    /**
     * 设置0到期 1没到期
     *
     * @param isExpire 0到期 1没到期
     */
    public void setIsExpire(String isExpire) {
        this.isExpire = isExpire;
    }

    /**
     * 获取金额（起）
     *
     * @return money_start - 金额（起）
     */
    public BigDecimal getMoneyStart() {
        return moneyStart;
    }

    /**
     * 设置金额（起）
     *
     * @param moneyStart 金额（起）
     */
    public void setMoneyStart(BigDecimal moneyStart) {
        this.moneyStart = moneyStart;
    }

    /**
     * 获取金额（止）
     *
     * @return money_stop - 金额（止）
     */
    public BigDecimal getMoneyStop() {
        return moneyStop;
    }

    /**
     * 设置金额（止）
     *
     * @param moneyStop 金额（止）
     */
    public void setMoneyStop(BigDecimal moneyStop) {
        this.moneyStop = moneyStop;
    }

    public String getApplyNumberOld() {
        return applyNumberOld;
    }

    public void setApplyNumberOld(String applyNumberOld) {
        this.applyNumberOld = applyNumberOld;
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
     * 获取收款人id
     *
     * @return payee_id - 收款人id
     */
    public String getPayeeId() {
        return payeeId;
    }

    /**
     * 设置收款人id
     *
     * @param payeeId 收款人id
     */
    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    /**
     * 获取票据金额
     *
     * @return drawer_amount - 票据金额
     */
    public BigDecimal getDrawerAmount() {
        return drawerAmount;
    }

    /**
     * 设置票据金额
     *
     * @param drawerAmount 票据金额
     */
    public void setDrawerAmount(BigDecimal drawerAmount) {
        this.drawerAmount = drawerAmount;
    }

    /**
     * 获取出票日期（始）
     *
     * @return draft_start - 出票日期（始）
     */
    public Date getDraftStart() {
        return draftStart;


      /*  if (draftStart == null) {
            return null;
        }else {
            return new SimpleDateFormat("yyyy-MM-dd").format(draftStart);
        }*/
    }

    /**
     * 设置出票日期（始）
     *
     * @param draftStart 出票日期（始）
     */
    public void setDraftStart(Date draftStart) {
        this.draftStart = draftStart;
    }

    /**
     * 获取出票日期（止）
     *
     * @return draft_stop - 出票日期（止）
     */
    public Date getDraftStop() {

        return draftStop;
       /* if (draftStop == null) {
            return null;
        }else {
            return new SimpleDateFormat("yyyy-MM-dd").format(draftStop);
        }*/
    }

    /**
     * 设置出票日期（止）
     *
     * @param draftStop 出票日期（止）
     */
    public void setDraftStop(Date draftStop) {
        this.draftStop = draftStop;
    }

    /**
     * 获取汇票到期日（始）
     *
     * @return moneyorder_start - 汇票到期日（始）
     */
    public Date getMoneyorderStart() {
        return moneyorderStart;

      /*  if (moneyorderStart == null) {
            return null;
        }else {
            return new SimpleDateFormat("yyyy-MM-dd").format(moneyorderStart);
        }*/
    }

    /**
     * 设置汇票到期日（始）
     *
     * @param moneyorderStart 汇票到期日（始）
     */
    public void setMoneyorderStart(Date moneyorderStart) {
        this.moneyorderStart = moneyorderStart;
    }

    /**
     * 获取汇票到期日（止）
     *
     * @return moneyorder_stop - 汇票到期日（止）
     */
    public Date getMoneyorderStop() {

        return moneyorderStop;
      /*  if (moneyorderStop == null) {
            return null;
        }else {
            return new SimpleDateFormat("yyyy-MM-dd").format(moneyorderStop);
        }*/
    }

    /**
     * 设置汇票到期日（止）
     *
     * @param moneyorderStop 汇票到期日（止）
     */
    public void setMoneyorderStop(Date moneyorderStop) {
        this.moneyorderStop = moneyorderStop;
    }

    /**
     * 获取是否转让
     *
     * @return is_transfer - 是否转让
     */
    public String getIsTransfer() {
        return isTransfer;
    }

    /**
     * 设置是否转让
     *
     * @param isTransfer 是否转让
     */
    public void setIsTransfer(String isTransfer) {
        this.isTransfer = isTransfer;
    }

    /**
     * 获取0表示是  1表示否
     *
     * @return is_guaranty - 0表示是  1表示否
     */
    public String getIsGuaranty() {
        return isGuaranty;
    }

    /**
     * 设置0表示是  1表示否
     *
     * @param isGuaranty 0表示是  1表示否
     */
    public void setIsGuaranty(String isGuaranty) {
        this.isGuaranty = isGuaranty;
    }

    /**
     * 获取票据状态
     *
     * @return bill_staue - 票据状态
     */
    public String getBillStaue() {
        return billStaue;
    }

    /**
     * 设置票据状态
     *
     * @param billStaue 票据状态
     */
    public void setBillStaue(String billStaue) {
        this.billStaue = billStaue;
    }

    /**
     * 获取票据形式  1到4 4种
     *
     * @return bill_class - 票据形式  1到4 4种
     */
    public String getBillClass() {
        return billClass;
    }

    /**
     * 设置票据形式  1到4 4种
     *
     * @param billClass 票据形式  1到4 4种
     */
    public void setBillClass(String billClass) {
        this.billClass = billClass;
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
}
