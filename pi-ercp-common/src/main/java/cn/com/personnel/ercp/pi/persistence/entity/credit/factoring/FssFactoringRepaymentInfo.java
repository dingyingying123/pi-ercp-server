package cn.com.personnel.ercp.pi.persistence.entity.credit.factoring;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_factoring_repayment_info")
public class FssFactoringRepaymentInfo {
    /**
     * 主键
     */
    @Id
    @Column(name = "fri_id")
    private String friId;

    /**
     * 还款日期
     */
    @Column(name = "repayment_date")
    private Date repaymentDate;

    /**
     * 还款日期起
     */
    @Transient
    private Date upRepaymentDate;

    /**
     * 还款日期止
     */
    @Transient
    private Date onlyRepaymentDate;

    /**
     * 借据信息
     */
    @Column(name = "debit_information")
    private String debitInformation;

    /**
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 合同文本编号
     */
    @Column(name = "contract_code")
    private String contractCode;

    /**
     * 公司名称
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 公司编号
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 项目编号
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 还款金额
     */
    @Column(name = "repayment_amount")
    private BigDecimal repaymentAmount;

    /**
     * 入账日期
     */
    @Column(name = "credit_date")
    private Date creditDate;

    /**
     * 入账状态
     */
    @Column(name = "credit_status")
    private String creditStatus;

    /**
     * 计算状态
     */
    @Column(name = "calculation_status")
    private String calculationStatus;

    /**
     * 报错消息
     */
    @Column(name = "error_message")
    private String errorMessage;

    /**
     * SAP凭证编号
     */
    @Column(name = "sap_document_no")
    private String sapDocumentNo;

    /**
     * 冲销状态
     */
    @Column(name = "reversal_status")
    private String reversalStatus;

    /**
     * 合同关联Id
     */
    @Column(name = "fc_id")
    private String fcId;

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
     * 修改人
     */
    private String updator;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否可用
     */
    private String active;

    /**
     * 摘要
     */
    private String summary;

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
     * 获取主键
     *
     * @return fri_id - 主键
     */
    public String getFriId() {
        return friId;
    }

    /**
     * 设置主键
     *
     * @param friId 主键
     */
    public void setFriId(String friId) {
        this.friId = friId;
    }

    /**
     * 获取还款日期
     *
     * @return repayment_date - 还款日期
     */
    public Date getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * 设置还款日期
     *
     * @param repaymentDate 还款日期
     */
    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    /**
     * 获取借据信息
     *
     * @return debit_information - 借据信息
     */
    public String getDebitInformation() {
        return debitInformation;
    }

    /**
     * 设置借据信息
     *
     * @param debitInformation 借据信息
     */
    public void setDebitInformation(String debitInformation) {
        this.debitInformation = debitInformation;
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
     * 获取合同文本编号
     *
     * @return contract_code - 合同文本编号
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置合同文本编号
     *
     * @param contractCode 合同文本编号
     */
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    /**
     * 获取公司名称
     *
     * @return organ_name - 公司名称
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * 设置公司名称
     *
     * @param organName 公司名称
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * 获取公司编号
     *
     * @return organ_id - 公司编号
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置公司编号
     *
     * @param organId 公司编号
     */
    public void setOrganId(String organId) {
        this.organId = organId;
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
     * 获取项目编号
     *
     * @return project_id - 项目编号
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目编号
     *
     * @param projectId 项目编号
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取还款金额
     *
     * @return repayment_amount - 还款金额
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * 设置还款金额
     *
     * @param repaymentAmount 还款金额
     */
    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    /**
     * 获取入账日期
     *
     * @return credit_date - 入账日期
     */
    public Date getCreditDate() {
        return creditDate;
    }

    /**
     * 设置入账日期
     *
     * @param creditDate 入账日期
     */
    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }

    /**
     * 获取入账状态
     *
     * @return credit_status - 入账状态
     */
    public String getCreditStatus() {
        return creditStatus;
    }

    /**
     * 设置入账状态
     *
     * @param creditStatus 入账状态
     */
    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    /**
     * 获取计算状态
     *
     * @return calculation_status - 计算状态
     */
    public String getCalculationStatus() {
        return calculationStatus;
    }

    /**
     * 设置计算状态
     *
     * @param calculationStatus 计算状态
     */
    public void setCalculationStatus(String calculationStatus) {
        this.calculationStatus = calculationStatus;
    }

    /**
     * 获取报错消息
     *
     * @return error_message - 报错消息
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 设置报错消息
     *
     * @param errorMessage 报错消息
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * 获取SAP凭证编号
     *
     * @return sap_document_no - SAP凭证编号
     */
    public String getSapDocumentNo() {
        return sapDocumentNo;
    }

    /**
     * 设置SAP凭证编号
     *
     * @param sapDocumentNo SAP凭证编号
     */
    public void setSapDocumentNo(String sapDocumentNo) {
        this.sapDocumentNo = sapDocumentNo;
    }

    /**
     * 获取冲销状态
     *
     * @return reversal_status - 冲销状态
     */
    public String getReversalStatus() {
        return reversalStatus;
    }

    /**
     * 设置冲销状态
     *
     * @param reversalStatus 冲销状态
     */
    public void setReversalStatus(String reversalStatus) {
        this.reversalStatus = reversalStatus;
    }

    /**
     * 获取合同关联Id
     *
     * @return fc_id - 合同关联Id
     */
    public String getFcId() {
        return fcId;
    }

    /**
     * 设置合同关联Id
     *
     * @param fcId 合同关联Id
     */
    public void setFcId(String fcId) {
        this.fcId = fcId;
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
     * 获取修改人
     *
     * @return updator - 修改人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置修改人
     *
     * @param updator 修改人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否可用
     *
     * @return active - 是否可用
     */
    public String getActive() {
        return active;
    }

    /**
     * 设置是否可用
     *
     * @param active 是否可用
     */
    public void setActive(String active) {
        this.active = active;
    }

    public Date getUpRepaymentDate() {
        return upRepaymentDate;
    }

    public void setUpRepaymentDate(Date upRepaymentDate) {
        this.upRepaymentDate = upRepaymentDate;
    }

    public Date getOnlyRepaymentDate() {
        return onlyRepaymentDate;
    }

    public void setOnlyRepaymentDate(Date onlyRepaymentDate) {
        this.onlyRepaymentDate = onlyRepaymentDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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
}