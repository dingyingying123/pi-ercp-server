package cn.com.personnel.ercp.pi.persistence.entity.bill;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bill_expense_info_detail")
public class FssBillExpenseInfoDetail {
    /**
     * 费用表详情主键
     */
    @Id
    @Column(name = "expense_id_detail")
    @GeneratedValue(generator = "JDBC")
    private String expenseIdDetail;

    /**
     * 费用表的主键
     */
    @Column(name = "expense_id")
    private String expenseId;

    /**
     * 费用总金额
     */
    @Column(name = "expense_total_amount")
    private BigDecimal expenseTotalAmount;

    /**
     * 收费日期
     */
    @Column(name = "expense_data")
    private String expenseData;

    /**
     * 收费金额
     */
    @Column(name = "expense_amount")
    private BigDecimal expenseAmount;

    /**
     * 合计金额
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 费率
     */
    private BigDecimal rate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否显示
     */
    private String deleted;

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

    /**
     * update_time
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取费用表详情主键
     *
     * @return expense_id_detail - 费用表详情主键
     */
    public String getExpenseIdDetail() {
        return expenseIdDetail;
    }

    /**
     * 设置费用表详情主键
     *
     * @param expenseIdDetail 费用表详情主键
     */
    public void setExpenseIdDetail(String expenseIdDetail) {
        this.expenseIdDetail = expenseIdDetail;
    }

    /**
     * 获取费用表的主键
     *
     * @return expense_id - 费用表的主键
     */
    public String getExpenseId() {
        return expenseId;
    }

    /**
     * 设置费用表的主键
     *
     * @param expenseId 费用表的主键
     */
    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
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
     * 获取收费日期
     *
     * @return expense_data - 收费日期
     */
    public String getExpenseData() {
        return expenseData;
    }

    /**
     * 设置收费日期
     *
     * @param expenseData 收费日期
     */
    public void setExpenseData(String expenseData) {
        this.expenseData = expenseData;
    }

    /**
     * 获取收费金额
     *
     * @return expense_amount - 收费金额
     */
    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }

    /**
     * 设置收费金额
     *
     * @param expenseAmount 收费金额
     */
    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    /**
     * 获取合计金额
     *
     * @return total_amount - 合计金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置合计金额
     *
     * @param totalAmount 合计金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取费率
     *
     * @return rate - 费率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置费率
     *
     * @param rate 费率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
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