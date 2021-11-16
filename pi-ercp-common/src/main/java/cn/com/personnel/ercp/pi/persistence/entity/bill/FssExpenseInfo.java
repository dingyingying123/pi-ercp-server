package cn.com.personnel.ercp.pi.persistence.entity.bill;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bill_expense_info")
public class FssExpenseInfo {
    /**
     * 主键
     */
    @Id
    @Column(name = "expense_id")
    @GeneratedValue(generator = "JDBC")
    private String expenseId;

    /**
     * 开票银行名称
     */
     @Column(name = "drawer_bankd")
    private String drawerBankd;

    /**
     * 开票银行id
     */
    @Column(name = "bank_id")
    private String bankId;

    /**
     * 开票银行code
     */
    @Column(name = "bank_code")
    private String bankCode;

    /**
     * 付款人账号
     */
    @Column(name = "payer_account")
    private String payerAccount;

    /**
     * 费用总金额
     */
    @Column(name = "expense_total_amount")
    private BigDecimal expenseTotalAmount;


    /**
     * 备注
     */
    private String remark;

    /**
     * creator
     */
    private String creator;

    /**
     * create_time
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * updator
     */
    private String updator;
    private String deleted;

    /**
     * update_time
     */
    @Column(name = "update_time")
    private Date updateTime;

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取主键
     *
     * @return expense_id - 主键
     */
    public String getExpenseId() {
        return expenseId;
    }

    /**
     * 设置主键
     *
     * @param expenseId 主键
     */
    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }

    /**
     * 获取开票银行名称
     *
     * @return drawer_bankd - 开票银行名称
     */
    public String getDrawerBankd() {
        return drawerBankd;
    }

    /**
     * 设置开票银行名称
     *
     * @param drawerBankd 开票银行名称
     */
    public void setDrawerBankd(String drawerBankd) {
        this.drawerBankd = drawerBankd;
    }

    /**
     * 获取开票银行id
     *
     * @return bank_id - 开票银行id
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * 设置开票银行id
     *
     * @param bankId 开票银行id
     */
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    /**
     * 获取开票银行code
     *
     * @return bank_code - 开票银行code
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置开票银行code
     *
     * @param bankCode 开票银行code
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
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
     * 获取费用总金额
     *
     * @return expense_total_amount - 费用总金额
     */
    public BigDecimal getExpenseTotalAmount() {
        return expenseTotalAmount;
    }

    /**
     * 设置费用总金额
     *
     * @param expenseTotalAmount 费用总金额
     */
    public void setExpenseTotalAmount(BigDecimal expenseTotalAmount) {
        this.expenseTotalAmount = expenseTotalAmount;
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
     * 获取creator
     *
     * @return creator - creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置creator
     *
     * @param creator creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取create_time
     *
     * @return create_time - create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置create_time
     *
     * @param createTime create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取updator
     *
     * @return updator - updator
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置updator
     *
     * @param updator updator
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * 获取update_time
     *
     * @return update_time - update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置update_time
     *
     * @param updateTime update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}