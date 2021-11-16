package cn.com.personnel.ercp.pi.persistence.entity.financialBill;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_financial_bill_detail")
public class FssFinancialBillDetail {
    /**
     * 票据明细ID
     */
    @Id
    @Column(name = "detail_id")
    @GeneratedValue(generator = "JDBC")
    private String detailId;

    /**
     * 财司票据业务申请ID
     */
    @Column(name = "fina_id")
    private String finaId;

    /**
     * 票据编号
     */
    @Column(name = "bill_number")
    private String billNumber;

    /**
     * 票据出票日
     */
    @Column(name = "bill_issuance_date")
    private String billIssuanceDate;

    /**
     * 票据到期日
     */
    @Column(name = "maturity_date")
    private String maturityDate;

    /**
     * 票据金额
     */
    @Column(name = "bill_amount")
    private BigDecimal billAmount;

    /**
     * 票据承兑人ID
     */
    @Column(name = "bill_acceptor_id")
    private String billAcceptorId;

    /**
     * 票据承兑人
     */
    @Column(name = "bill_acceptor")
    private String billAcceptor;

    /**
     * 节假日调整天数
     */
    @Column(name = "holiday_adjustment_days")
    private String holidayAdjustmentDays;

    /**
     * 备注
     */
    private String remark;

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
     * 获取票据明细ID
     *
     * @return detail_id - 票据明细ID
     */
    public String getDetailId() {
        return detailId;
    }

    /**
     * 设置票据明细ID
     *
     * @param detailId 票据明细ID
     */
    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    /**
     * 获取财司票据业务申请ID
     *
     * @return fina_id - 财司票据业务申请ID
     */
    public String getFinaId() {
        return finaId;
    }

    /**
     * 设置财司票据业务申请ID
     *
     * @param finaId 财司票据业务申请ID
     */
    public void setFinaId(String finaId) {
        this.finaId = finaId;
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
     * 获取票据出票日
     *
     * @return bill_issuance_date - 票据出票日
     */
    public String getBillIssuanceDate() {
        return billIssuanceDate;
    }

    /**
     * 设置票据出票日
     *
     * @param billIssuanceDate 票据出票日
     */
    public void setBillIssuanceDate(String billIssuanceDate) {
        this.billIssuanceDate = billIssuanceDate;
    }

    /**
     * 获取票据到期日
     *
     * @return maturity_date - 票据到期日
     */
    public String getMaturityDate() {
        return maturityDate;
    }

    /**
     * 设置票据到期日
     *
     * @param maturityDate 票据到期日
     */
    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    /**
     * 获取票据金额
     *
     * @return bill_amount - 票据金额
     */
    public BigDecimal getBillAmount() {
        return billAmount;
    }

    /**
     * 设置票据金额
     *
     * @param billAmount 票据金额
     */
    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    /**
     * 获取票据承兑人ID
     *
     * @return bill_acceptor_id - 票据承兑人ID
     */
    public String getBillAcceptorId() {
        return billAcceptorId;
    }

    /**
     * 设置票据承兑人ID
     *
     * @param billAcceptorId 票据承兑人ID
     */
    public void setBillAcceptorId(String billAcceptorId) {
        this.billAcceptorId = billAcceptorId;
    }

    /**
     * 获取票据承兑人
     *
     * @return bill_acceptor - 票据承兑人
     */
    public String getBillAcceptor() {
        return billAcceptor;
    }

    /**
     * 设置票据承兑人
     *
     * @param billAcceptor 票据承兑人
     */
    public void setBillAcceptor(String billAcceptor) {
        this.billAcceptor = billAcceptor;
    }

    /**
     * 获取节假日调整天数
     *
     * @return holiday_adjustment_days - 节假日调整天数
     */
    public String getHolidayAdjustmentDays() {
        return holidayAdjustmentDays;
    }

    /**
     * 设置节假日调整天数
     *
     * @param holidayAdjustmentDays 节假日调整天数
     */
    public void setHolidayAdjustmentDays(String holidayAdjustmentDays) {
        this.holidayAdjustmentDays = holidayAdjustmentDays;
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
}