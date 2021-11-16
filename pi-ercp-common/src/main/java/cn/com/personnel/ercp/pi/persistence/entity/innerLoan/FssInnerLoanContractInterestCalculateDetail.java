package cn.com.personnel.ercp.pi.persistence.entity.innerLoan;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_inner_loan_contract_interest_calculate_detail")
public class FssInnerLoanContractInterestCalculateDetail {
    /**
     * 主键id
     */
    @Id
    @Column(name = "detail_id")
    @GeneratedValue(generator = "JDBC")
    private String detailId;

    /**
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 借据名称
     */
    @Column(name = "iou_name")
    private String iouName;

    /**
     * 借据金额
     */
    @Column(name = "iou_amount")
    private BigDecimal iouAmount;

    /**
     * 借据还款金额
     */
    @Column(name = "iou_repayment_amount")
    private BigDecimal iouRepaymentAmount;

    /**
     * 借据余额
     */
    @Column(name = "iou_balance")
    private BigDecimal iouBalance;

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
     * 天数
     */
    private Integer days;

    @Column(name = "main_id")
    private String mainId;

    /**
     * 年利率
     */
    @Column(name = "annual_interest_rate")
    private BigDecimal annualInterestRate;

    /**
     * 计息天数
     */
    @Column(name = "interest_days")
    private Integer interestDays;

    /**
     * 日利率
     */
    @Column(name = "day_interest")
    private BigDecimal dayInterest;

    /**
     * 利息
     */
    @Column(name = "interest_amount")
    private BigDecimal interestAmount;

    /**
     * 借据id
     */
    @Column(name = "iou_id")
    private String iouId;

    /**
     * 合同id
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 付息类型
     */
    @Column(name = "pay_interest_type")
    private String payInterestType;

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
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    private String summary;

    @Column(name="business_date")
    private Date businessDate;

    @Column(name="catch_up_amount")
    private BigDecimal catchUpAmount;

    @Column(name="discount_amount")
    private BigDecimal discountAmount;

    @Column(name="exchange_rate")
    private BigDecimal exchangeRate;
    /**
     * 获取主键id
     *
     * @return detail_id - 主键id
     */
    public String getDetailId() {
        return detailId;
    }

    /**
     * 设置主键id
     *
     * @param detailId 主键id
     */
    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    /**
     * 获取合同名称
     *
     * @return contract_name - 合同名称
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * 设置合同名称
     *
     * @param contractName 合同名称
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * 获取借据名称
     *
     * @return iou_name - 借据名称
     */
    public String getIouName() {
        return iouName;
    }

    /**
     * 设置借据名称
     *
     * @param iouName 借据名称
     */
    public void setIouName(String iouName) {
        this.iouName = iouName;
    }

    /**
     * 获取借据金额
     *
     * @return iou_amount - 借据金额
     */
    public BigDecimal getIouAmount() {
        return iouAmount;
    }

    /**
     * 设置借据金额
     *
     * @param iouAmount 借据金额
     */
    public void setIouAmount(BigDecimal iouAmount) {
        this.iouAmount = iouAmount;
    }

    /**
     * 获取借据还款金额
     *
     * @return iou_repayment_amount - 借据还款金额
     */
    public BigDecimal getIouRepaymentAmount() {
        return iouRepaymentAmount;
    }

    /**
     * 设置借据还款金额
     *
     * @param iouRepaymentAmount 借据还款金额
     */
    public void setIouRepaymentAmount(BigDecimal iouRepaymentAmount) {
        this.iouRepaymentAmount = iouRepaymentAmount;
    }

    /**
     * 获取借据余额
     *
     * @return iou_balance - 借据余额
     */
    public BigDecimal getIouBalance() {
        return iouBalance;
    }

    /**
     * 设置借据余额
     *
     * @param iouBalance 借据余额
     */
    public void setIouBalance(BigDecimal iouBalance) {
        this.iouBalance = iouBalance;
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

    /**
     * 获取天数
     *
     * @return days - 天数
     */
    public Integer getDays() {
        return days;
    }

    /**
     * 设置天数
     *
     * @param days 天数
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * 获取年利率
     *
     * @return annual_interest_rate - 年利率
     */
    public BigDecimal getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * 设置年利率
     *
     * @param annualInterestRate 年利率
     */
    public void setAnnualInterestRate(BigDecimal annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 获取计息天数
     *
     * @return interest_days - 计息天数
     */
    public Integer getInterestDays() {
        return interestDays;
    }

    /**
     * 设置计息天数
     *
     * @param interestDays 计息天数
     */
    public void setInterestDays(Integer interestDays) {
        this.interestDays = interestDays;
    }

    /**
     * 获取日利率
     *
     * @return day_interest - 日利率
     */
    public BigDecimal getDayInterest() {
        return dayInterest;
    }

    /**
     * 设置日利率
     *
     * @param dayInterest 日利率
     */
    public void setDayInterest(BigDecimal dayInterest) {
        this.dayInterest = dayInterest;
    }

    /**
     * 获取利息
     *
     * @return interest_amount - 利息
     */
    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    /**
     * 设置利息
     *
     * @param interestAmount 利息
     */
    public void setInterestAmount(BigDecimal interestAmount) {
        this.interestAmount = interestAmount;
    }

    /**
     * 获取借据id
     *
     * @return iou_id - 借据id
     */
    public String getIouId() {
        return iouId;
    }

    /**
     * 设置借据id
     *
     * @param iouId 借据id
     */
    public void setIouId(String iouId) {
        this.iouId = iouId;
    }

    /**
     * 获取合同id
     *
     * @return manage_id - 合同id
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置合同id
     *
     * @param manageId 合同id
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    /**
     * 获取付息类型
     *
     * @return pay_interest_type - 付息类型
     */
    public String getPayInterestType() {
        return payInterestType;
    }

    /**
     * 设置付息类型
     *
     * @param payInterestType 付息类型
     */
    public void setPayInterestType(String payInterestType) {
        this.payInterestType = payInterestType;
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

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public BigDecimal getCatchUpAmount() {
        return catchUpAmount;
    }

    public void setCatchUpAmount(BigDecimal catchUpAmount) {
        this.catchUpAmount = catchUpAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}