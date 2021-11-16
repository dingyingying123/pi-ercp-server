package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bill_receivable_discount")
public class FssBillReceivableDiscount {
    /**
     * 主键
     */
    @Id
    @Column(name = "discount_id")
    @GeneratedValue(generator = "JDBC")
    private String discountId;

    /**
     * 申请单号
     */
    @Column(name = "apply_number")
    private String applyNumber;
    /**
     * 流程的实例id
     */
    @Column(name = "approval_id")
    private String approvalId;

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
     * 申请部门
     */
    @Column(name = "apply_part_id")
    private String applyPartId;

    /**
     * 申请时间
     */
    @Column(name = "data_apply")
    private String dataApply;

    /**
     * 贴现主体
     */
    @Column(name = "discount_body")
    private String discountBody;

    /**
     * 贴现主体id
     */
    @Column(name = "discount_body_id")
    private String discountBodyId;

    /**
     * 出票人
     */
    private String drawer;

    /**
     * 出票人id
     */
    @Column(name = "drawer_id")
    private String drawerId;

    /**
     * 出票人银行
     */
    @Column(name = "drawer_bank_out")
    private String drawerBankOut;

    /**
     * 出票人银行id
     */
    @Column(name = "drawer_bank_out_id")
    private String drawerBankOutId;

    /**
     * 异地银行
     */
    @Column(name = "out_bank")
    private String outBank;

    /**
     * 异地银行id
     */
    @Column(name = "out_bank_id")
    private String outBankId;

    /**
     * 贴现金额
     */
    @Column(name = "discount_money")
    private BigDecimal discountMoney;

    /**
     * 贴现利率
     */
    @Column(name = "discount_rate")
    private BigDecimal discountRate;

    /**
     * 贴现收款银行
     */
    @Column(name = "discount_bank")
    private String discountBank;

    /**
     * 贴现收款银行id
     */
    @Column(name = "discount_bank_id")
    private String discountBankId;

    /**
     * 贴现收款银行账号
     */
    @Column(name = "discount_bank_acount")
    private String discountBankAcount;

    /**
     * 贴现日期
     */
    @Column(name = "data_discount")
    private String dataDiscount;

    /**
     * 付息方式
     */
    @Column(name = "rate_type")
    private String rateType;

    /**
     * 贴现利息
     */
    @Column(name = "discount_interest")
    private BigDecimal discountInterest;

    /**
     * 备注
     */
    private String remark;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updater;

    @Column(name = "update_time")
    private Date updateTime;
    @Column(name = "rece_id")
    private String receId;

    private String deleted;

    /**
     * 组编号
     */
    @Column(name = "group_no")
    private String groupNo;
    @Column(name = "entry_status")
    private String entryStatus;
    @Column(name = "entry_number")
    private String entryNumber;
    @Column(name = "document_no")
    private String documentNo;
    @Column(name = "error_message")
    private String errorMessage;

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

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }

    /**
     * 获取主键
     *
     * @return discount_id - 主键
     */
    public String getDiscountId() {
        return discountId;
    }

    /**
     * 审批状态
     */
    @Column(name = "approval_status")
    private String approvalStatus;
    /**
     * 审批时间
     */
    @Column(name = "approval_time")
    private String approvalTime;

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    /**
     * 设置主键
     *
     * @param discountId 主键
     */
    public void setDiscountId(String discountId) {
        this.discountId = discountId;
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

    public String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(String approvalId) {
        this.approvalId = approvalId;
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
     * 获取申请部门
     *
     * @return apply_part_id - 申请部门
     */
    public String getApplyPartId() {
        return applyPartId;
    }

    /**
     * 设置申请部门
     *
     * @param applyPartId 申请部门
     */
    public void setApplyPartId(String applyPartId) {
        this.applyPartId = applyPartId;
    }

    /**
     * 获取申请时间
     *
     * @return data_apply - 申请时间
     */
    public String getDataApply() {
        return dataApply;
    }

    /**
     * 设置申请时间
     *
     * @param dataApply 申请时间
     */
    public void setDataApply(String dataApply) {
        this.dataApply = dataApply;
    }

    /**
     * 获取贴现主体
     *
     * @return discount_body - 贴现主体
     */
    public String getDiscountBody() {
        return discountBody;
    }

    /**
     * 设置贴现主体
     *
     * @param discountBody 贴现主体
     */
    public void setDiscountBody(String discountBody) {
        this.discountBody = discountBody;
    }

    /**
     * 获取贴现主体id
     *
     * @return discount_body_id - 贴现主体id
     */
    public String getDiscountBodyId() {
        return discountBodyId;
    }

    /**
     * 设置贴现主体id
     *
     * @param discountBodyId 贴现主体id
     */
    public void setDiscountBodyId(String discountBodyId) {
        this.discountBodyId = discountBodyId;
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
     * 获取出票人id
     *
     * @return drawer_id - 出票人id
     */
    public String getDrawerId() {
        return drawerId;
    }

    /**
     * 设置出票人id
     *
     * @param drawerId 出票人id
     */
    public void setDrawerId(String drawerId) {
        this.drawerId = drawerId;
    }

    /**
     * 获取出票人银行
     *
     * @return drawer_bank_out - 出票人银行
     */
    public String getDrawerBankOut() {
        return drawerBankOut;
    }

    /**
     * 设置出票人银行
     *
     * @param drawerBankOut 出票人银行
     */
    public void setDrawerBankOut(String drawerBankOut) {
        this.drawerBankOut = drawerBankOut;
    }

    /**
     * 获取出票人银行id
     *
     * @return drawer_bank_out_id - 出票人银行id
     */
    public String getDrawerBankOutId() {
        return drawerBankOutId;
    }

    /**
     * 设置出票人银行id
     *
     * @param drawerBankOutId 出票人银行id
     */
    public void setDrawerBankOutId(String drawerBankOutId) {
        this.drawerBankOutId = drawerBankOutId;
    }

    /**
     * 获取异地银行
     *
     * @return out_bank - 异地银行
     */
    public String getOutBank() {
        return outBank;
    }

    /**
     * 设置异地银行
     *
     * @param outBank 异地银行
     */
    public void setOutBank(String outBank) {
        this.outBank = outBank;
    }

    /**
     * 获取异地银行id
     *
     * @return out_bank_id - 异地银行id
     */
    public String getOutBankId() {
        return outBankId;
    }

    /**
     * 设置异地银行id
     *
     * @param outBankId 异地银行id
     */
    public void setOutBankId(String outBankId) {
        this.outBankId = outBankId;
    }

    /**
     * 获取贴现金额
     *
     * @return discount_money - 贴现金额
     */
    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    /**
     * 设置贴现金额
     *
     * @param discountMoney 贴现金额
     */
    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }

    /**
     * 获取贴现利率
     *
     * @return discount_rate - 贴现利率
     */
    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    /**
     * 设置贴现利率
     *
     * @param discountRate 贴现利率
     */
    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * 获取贴现收款银行
     *
     * @return discount_bank - 贴现收款银行
     */
    public String getDiscountBank() {
        return discountBank;
    }

    /**
     * 设置贴现收款银行
     *
     * @param discountBank 贴现收款银行
     */
    public void setDiscountBank(String discountBank) {
        this.discountBank = discountBank;
    }

    /**
     * 获取贴现收款银行id
     *
     * @return discount_bank_id - 贴现收款银行id
     */
    public String getDiscountBankId() {
        return discountBankId;
    }

    /**
     * 设置贴现收款银行id
     *
     * @param discountBankId 贴现收款银行id
     */
    public void setDiscountBankId(String discountBankId) {
        this.discountBankId = discountBankId;
    }

    /**
     * 获取贴现收款银行账号
     *
     * @return discount_bank_acount - 贴现收款银行账号
     */
    public String getDiscountBankAcount() {
        return discountBankAcount;
    }

    /**
     * 设置贴现收款银行账号
     *
     * @param discountBankAcount 贴现收款银行账号
     */
    public void setDiscountBankAcount(String discountBankAcount) {
        this.discountBankAcount = discountBankAcount;
    }

    /**
     * 获取贴现日期
     *
     * @return data_discount - 贴现日期
     */
    public String getDataDiscount() {
        return dataDiscount;
    }

    /**
     * 设置贴现日期
     *
     * @param dataDiscount 贴现日期
     */
    public void setDataDiscount(String dataDiscount) {
        this.dataDiscount = dataDiscount;
    }

    /**
     * 获取付息方式
     *
     * @return rate_type - 付息方式
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * 设置付息方式
     *
     * @param rateType 付息方式
     */
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    /**
     * 获取贴现利息
     *
     * @return discount_interest - 贴现利息
     */
    public BigDecimal getDiscountInterest() {
        return discountInterest;
    }

    /**
     * 设置贴现利息
     *
     * @param discountInterest 贴现利息
     */
    public void setDiscountInterest(BigDecimal discountInterest) {
        this.discountInterest = discountInterest;
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
}
