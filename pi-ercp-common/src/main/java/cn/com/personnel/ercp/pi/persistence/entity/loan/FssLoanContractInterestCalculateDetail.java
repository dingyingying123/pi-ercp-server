package cn.com.personnel.ercp.pi.persistence.entity.loan;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_loan_contract_interest_calculate_detail")
public class FssLoanContractInterestCalculateDetail {
    /**
     * 主键id
     */    /**
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
     * 折后利率
     */
    @Column(name = "after_discount_amount")
    private BigDecimal afterDiscountAmount;
    /**
     * 补提金额
     */
    @Column(name = "make_withdraw_amount")
    private BigDecimal makeWithdrawAmount;

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    /**
     * 还款金额
     */
    @Column(name = "repayment_amount")
    private BigDecimal repaymentAmount;
    @Column(name = "business_date")
    private Date businessDate;
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
     * 主表id
     */
    @Column(name = "main_id")
    private String mainId;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 贷款机构
     */
    @Column(name = "loan_organization")
    private String loanOrganization;
    /**
     * 业务开始时间
     */
    @Column(name = "business_start_date")
    private Date businessStartDate;
    /**
     * 业务结束时间
     */
    @Column(name = "business_end_date")
    private Date businessEndDate;
    /**
     * 摘要
     */
    private String summary;
    /**
     * 合计预提
     */
    @Column(name = "total_pre_interest_amount")
    private BigDecimal totalPreInterestAmount;

    @Column(name="exchange_rate")
    private BigDecimal ExchangeRate;

    /**
     * 贷款机构id
     */
    @Column(name="bank_id")
    private String bankId;
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

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public BigDecimal getTotalPreInterestAmount() {
        return totalPreInterestAmount;
    }

    public void setTotalPreInterestAmount(BigDecimal totalPreInterestAmount) {
        this.totalPreInterestAmount = totalPreInterestAmount;
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

    public Date getBusinessStartDate() {
        return businessStartDate;
    }

    public void setBusinessStartDate(Date businessStartDate) {
        this.businessStartDate = businessStartDate;
    }

    public Date getBusinessEndDate() {
        return businessEndDate;
    }

    public void setBusinessEndDate(Date businessEndDate) {
        this.businessEndDate = businessEndDate;
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
     * 获取项目名称
     *
     * @return project_name - 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目名称
     *
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
     * 获取贷款机构
     *
     * @return loan_organization - 贷款机构
     */
    public String getLoanOrganization() {
        return loanOrganization;
    }

    public BigDecimal getAfterDiscountAmount() {
        return afterDiscountAmount;
    }

    public void setAfterDiscountAmount(BigDecimal afterDiscountAmount) {
        this.afterDiscountAmount = afterDiscountAmount;
    }

    public BigDecimal getMakeWithdrawAmount() {
        return makeWithdrawAmount;
    }

    public void setMakeWithdrawAmount(BigDecimal makeWithdrawAmount) {
        this.makeWithdrawAmount = makeWithdrawAmount;
    }

    /**
     * 设置贷款机构
     *
     * @param loanOrganization 贷款机构
     */
    public void setLoanOrganization(String loanOrganization) {
        this.loanOrganization = loanOrganization;
    }

    public BigDecimal getExchangeRate() {
        return ExchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        ExchangeRate = exchangeRate;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
}