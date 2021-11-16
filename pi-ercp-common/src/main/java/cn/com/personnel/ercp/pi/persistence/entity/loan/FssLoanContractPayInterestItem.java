package cn.com.personnel.ercp.pi.persistence.entity.loan;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_loan_contract_pay_interest_item")
public class FssLoanContractPayInterestItem {
    /**
     * 主键id
     */
    @Id
    @Column(name = "item_id")
    private String itemId;

    /**
     * 借据信息
     */
    @Column(name = "iou_message")
    private String iouMessage;

    /**
     * 开始日期
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 结束日期
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * 本次付息(元)
     */
    @Column(name = "this_pay_interest")
    private BigDecimal thisPayInterest;

    /**
     * 折后金额(元)
     */
    @Column(name = "after_discount_amount")
    private BigDecimal afterDiscountAmount;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 主表id
     */
    @Column(name = "main_id")
    private String mainId;

    /**
     * 乐观锁
     */
    private Integer revision;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;
    /**
     * 合同主键id
     */
    @Column(name = "manage_id")
    private String manageId;

    @Column(name="business_date")
    private Date businessDate;

    @Column(name="participate_bank")
    private String participateBank;

    @Column(name="iou_id")
    private String iouId;

    @Column(name="bank_id")
    private String bankId;
    /**
     * 获取主键id
     *
     * @return interest_item_id - 主键id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置主键id
     *
     * @param itemId 主键id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取借据信息
     *
     * @return iou_message - 借据信息
     */
    public String getIouMessage() {
        return iouMessage;
    }

    /**
     * 设置借据信息
     *
     * @param iouMessage 借据信息
     */
    public void setIouMessage(String iouMessage) {
        this.iouMessage = iouMessage;
    }

    /**
     * 获取开始日期
     *
     * @return start_date - 开始日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始日期
     *
     * @param startDate 开始日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束日期
     *
     * @return end_date - 结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结束日期
     *
     * @param endDate 结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getManageId() {
        return manageId;
    }

    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    /**
     * 获取本次付息(元)
     *
     * @return this_pay_interest - 本次付息(元)
     */
    public BigDecimal getThisPayInterest() {
        return thisPayInterest;
    }

    /**
     * 设置本次付息(元)
     *
     * @param thisPayInterest 本次付息(元)
     */
    public void setThisPayInterest(BigDecimal thisPayInterest) {
        this.thisPayInterest = thisPayInterest;
    }

    /**
     * 获取折后金额(元)
     *
     * @return after_discount_amount - 折后金额(元)
     */
    public BigDecimal getAfterDiscountAmount() {
        return afterDiscountAmount;
    }

    /**
     * 设置折后金额(元)
     *
     * @param afterDiscountAmount 折后金额(元)
     */
    public void setAfterDiscountAmount(BigDecimal afterDiscountAmount) {
        this.afterDiscountAmount = afterDiscountAmount;
    }

    /**
     * 获取摘要
     *
     * @return summary - 摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置摘要
     *
     * @param summary 摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取主表id
     *
     * @return main_id - 主表id
     */
    public String getMainId() {
        return mainId;
    }

    /**
     * 设置主表id
     *
     * @param mainId 主表id
     */
    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    /**
     * 获取乐观锁
     *
     * @return revision - 乐观锁
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * 设置乐观锁
     *
     * @param revision 乐观锁
     */
    public void setRevision(Integer revision) {
        this.revision = revision;
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
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public String getParticipateBank() {
        return participateBank;
    }

    public void setParticipateBank(String participateBank) {
        this.participateBank = participateBank;
    }

    public String getIouId() {
        return iouId;
    }

    public void setIouId(String iouId) {
        this.iouId = iouId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
}