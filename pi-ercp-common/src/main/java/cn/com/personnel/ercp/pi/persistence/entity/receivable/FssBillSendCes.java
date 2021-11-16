package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bill_send_ces")
public class FssBillSendCes {
    /**
     * 回款汇总ID
     */
    @Id
    @Column(name = "back_summary_id")
    private String backSummaryId;

    /**
     * 款项类型
     */
    @Column(name = "back_type_name")
    private String backTypeName;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private String startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private String endTime;

    /**
     * 币种
     */
    private String currency;

    /**
     * 金额
     */
    @Column(name = "total_price")
    private BigDecimal totalPrice;

    /**
     * 银行账户
     */
    @Column(name = "bank_accounts")
    private String bankAccounts;

    /**
     * 收款方公司代码
     */
    @Column(name = "supplier_id")
    private String supplierId;

    /**
     * 付款方公司代码
     */
    @Column(name = "buyer_id")
    private String buyerId;

    /**
     * 回款日期
     */
    @Column(name = "back_money_date")
    private String backMoneyDate;

    /**
     * 备注信息
     */
    private String remark;

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
     * 更新人
     */
    private String updator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 预留字段1
     */
    private String field01;

    /**
     * 预留字段2
     */
    private String field02;

    /**
     * 预留字段3
     */
    private String field03;

    /**
     * 预留字段4
     */
    private String field04;

    /**
     * 预留字段5
     */
    private String field05;

    /**
     * 预留字段6
     */
    private String field06;

    @Override
    public String toString() {
        return "FssBillSendCes{" +
                "backSummaryId='" + backSummaryId + '\'' +
                ", backTypeName='" + backTypeName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", currency='" + currency + '\'' +
                ", totalPrice=" + totalPrice +
                ", bankAccounts='" + bankAccounts + '\'' +
                ", supplierId='" + supplierId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", backMoneyDate='" + backMoneyDate + '\'' +
                ", remark='" + remark + '\'' +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", updator='" + updator + '\'' +
                ", updateTime=" + updateTime +
                ", field01='" + field01 + '\'' +
                ", field02='" + field02 + '\'' +
                ", field03='" + field03 + '\'' +
                ", field04='" + field04 + '\'' +
                ", field05='" + field05 + '\'' +
                ", field06='" + field06 + '\'' +
                '}';
    }

    /**
     * 获取回款汇总ID
     *
     * @return back_summary_id - 回款汇总ID
     */
    public String getBackSummaryId() {
        return backSummaryId;
    }

    /**
     * 设置回款汇总ID
     *
     * @param backSummaryId 回款汇总ID
     */
    public void setBackSummaryId(String backSummaryId) {
        this.backSummaryId = backSummaryId;
    }

    /**
     * 获取款项类型
     *
     * @return back_type_name - 款项类型
     */
    public String getBackTypeName() {
        return backTypeName;
    }

    /**
     * 设置款项类型
     *
     * @param backTypeName 款项类型
     */
    public void setBackTypeName(String backTypeName) {
        this.backTypeName = backTypeName;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
     * @return total_price - 金额
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置金额
     *
     * @param totalPrice 金额
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 获取银行账户
     *
     * @return bank_accounts - 银行账户
     */
    public String getBankAccounts() {
        return bankAccounts;
    }

    /**
     * 设置银行账户
     *
     * @param bankAccounts 银行账户
     */
    public void setBankAccounts(String bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    /**
     * 获取收款方公司代码
     *
     * @return supplier_id - 收款方公司代码
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * 设置收款方公司代码
     *
     * @param supplierId 收款方公司代码
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取付款方公司代码
     *
     * @return buyer_id - 付款方公司代码
     */
    public String getBuyerId() {
        return buyerId;
    }

    /**
     * 设置付款方公司代码
     *
     * @param buyerId 付款方公司代码
     */
    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 获取回款日期
     *
     * @return back_money_date - 回款日期
     */
    public String getBackMoneyDate() {
        return backMoneyDate;
    }

    /**
     * 设置回款日期
     *
     * @param backMoneyDate 回款日期
     */
    public void setBackMoneyDate(String backMoneyDate) {
        this.backMoneyDate = backMoneyDate;
    }

    /**
     * 获取备注信息
     *
     * @return remark - 备注信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注信息
     *
     * @param remark 备注信息
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
     * 获取更新人
     *
     * @return updator - 更新人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置更新人
     *
     * @param updator 更新人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
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
     * 获取预留字段1
     *
     * @return field01 - 预留字段1
     */
    public String getField01() {
        return field01;
    }

    /**
     * 设置预留字段1
     *
     * @param field01 预留字段1
     */
    public void setField01(String field01) {
        this.field01 = field01;
    }

    /**
     * 获取预留字段2
     *
     * @return field02 - 预留字段2
     */
    public String getField02() {
        return field02;
    }

    /**
     * 设置预留字段2
     *
     * @param field02 预留字段2
     */
    public void setField02(String field02) {
        this.field02 = field02;
    }

    /**
     * 获取预留字段3
     *
     * @return field03 - 预留字段3
     */
    public String getField03() {
        return field03;
    }

    /**
     * 设置预留字段3
     *
     * @param field03 预留字段3
     */
    public void setField03(String field03) {
        this.field03 = field03;
    }

    /**
     * 获取预留字段4
     *
     * @return field04 - 预留字段4
     */
    public String getField04() {
        return field04;
    }

    /**
     * 设置预留字段4
     *
     * @param field04 预留字段4
     */
    public void setField04(String field04) {
        this.field04 = field04;
    }

    /**
     * 获取预留字段5
     *
     * @return field05 - 预留字段5
     */
    public String getField05() {
        return field05;
    }

    /**
     * 设置预留字段5
     *
     * @param field05 预留字段5
     */
    public void setField05(String field05) {
        this.field05 = field05;
    }

    /**
     * 获取预留字段6
     *
     * @return field06 - 预留字段6
     */
    public String getField06() {
        return field06;
    }

    /**
     * 设置预留字段6
     *
     * @param field06 预留字段6
     */
    public void setField06(String field06) {
        this.field06 = field06;
    }
}