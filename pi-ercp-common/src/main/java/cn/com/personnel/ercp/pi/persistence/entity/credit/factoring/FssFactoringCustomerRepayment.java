package cn.com.personnel.ercp.pi.persistence.entity.credit.factoring;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_factoring_customer_repayment")
public class FssFactoringCustomerRepayment {
    /**
     * 主键
     */
    @Id
    @Column(name = "fcr_id")
    private String fcrId;

    /**
     * 客户还款日期
     */
    @Column(name = "customer_repayment_date")
    private Date customerRepaymentDate;

    /**
     * 保理申请单号
     */
    @Column(name = "letter_number")
    private String letterNumber;

    /**
     * 保理申请单号
     */
    @Column(name = "fa_id")
    private String faId;

    /**
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 银行合同文本编号
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
     * 客户还利息金额
     */
    @Column(name = "customer_repayment_amount")
    private BigDecimal customerRepaymentAmount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 类型
     */
    private String type;

    /**
     * 合同Id
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
     * 获取主键
     *
     * @return fcr_id - 主键
     */
    public String getFcrId() {
        return fcrId;
    }

    /**
     * 设置主键
     *
     * @param fcrId 主键
     */
    public void setFcrId(String fcrId) {
        this.fcrId = fcrId;
    }

    /**
     * 获取客户还款日期
     *
     * @return customer_repayment_date - 客户还款日期
     */
    public Date getCustomerRepaymentDate() {
        return customerRepaymentDate;
    }

    /**
     * 设置客户还款日期
     *
     * @param customerRepaymentDate 客户还款日期
     */
    public void setCustomerRepaymentDate(Date customerRepaymentDate) {
        this.customerRepaymentDate = customerRepaymentDate;
    }

    /**
     * 获取保理申请单号
     *
     * @return letter_number - 保理申请单号
     */
    public String getLetterNumber() {
        return letterNumber;
    }

    /**
     * 设置保理申请单号
     *
     * @param letterNumber 保理申请单号
     */
    public void setLetterNumber(String letterNumber) {
        this.letterNumber = letterNumber;
    }

    /**
     * 获取保理申请单号
     *
     * @return fa_id - 保理申请单号
     */
    public String getFaId() {
        return faId;
    }

    /**
     * 设置保理申请单号
     *
     * @param faId 保理申请单号
     */
    public void setFaId(String faId) {
        this.faId = faId;
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
     * 获取银行合同文本编号
     *
     * @return contract_code - 银行合同文本编号
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置银行合同文本编号
     *
     * @param contractCode 银行合同文本编号
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
     * 获取客户还利息金额
     *
     * @return customer_repayment_amount - 客户还利息金额
     */
    public BigDecimal getCustomerRepaymentAmount() {
        return customerRepaymentAmount;
    }

    /**
     * 设置客户还利息金额
     *
     * @param customerRepaymentAmount 客户还利息金额
     */
    public void setCustomerRepaymentAmount(BigDecimal customerRepaymentAmount) {
        this.customerRepaymentAmount = customerRepaymentAmount;
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
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取合同Id
     *
     * @return fc_id - 合同Id
     */
    public String getFcId() {
        return fcId;
    }

    /**
     * 设置合同Id
     *
     * @param fcId 合同Id
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
}