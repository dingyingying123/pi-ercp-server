package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_report_work_tax_project_expand")
public class FssReportWorkTaxProjectExpand {
    /**
     * 项目扩展ID
     */
    @Id
    @Column(name = "expand_id")
    @GeneratedValue(generator = "JDBC")
    private String expandId;

    /**
     * 立项主体
     */
    private String bukrs;

    /**
     * SAP项目编号
     */
    @Column(name = "project_no")
    private String projectNo;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 项目编号
     */
    @Column(name = "proj_no")
    private String projNo;

    /**
     * 财务编号
     */
    @Column(name = "finance_no")
    private String financeNo;

    /**
     * 项目开始时间
     */
    @Column(name = "project_start_time")
    private String projectStartTime;

    /**
     * 项目结束时间
     */
    @Column(name = "project_end_time")
    private String projectEndTime;

    /**
     * 项目类型
     */
    @Column(name = "project_type")
    private String projectType;

    /**
     * 核算类型
     */
    @Column(name = "accounting_type")
    private String accountingType;

    /**
     * 是否重点项目
     */
    @Column(name = "is_key_project")
    private String isKeyProject;

    /**
     * 项目预算
     */
    @Column(name = "project_budget")
    private String projectBudget;

    /**
     * 状态
     */
    private String status;

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
     * 获取项目扩展ID
     *
     * @return expand_id - 项目扩展ID
     */
    public String getExpandId() {
        return expandId;
    }

    /**
     * 设置项目扩展ID
     *
     * @param expandId 项目扩展ID
     */
    public void setExpandId(String expandId) {
        this.expandId = expandId;
    }

    /**
     * 获取立项主体
     *
     * @return bukrs - 立项主体
     */
    public String getBukrs() {
        return bukrs;
    }

    /**
     * 设置立项主体
     *
     * @param bukrs 立项主体
     */
    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    /**
     * 获取SAP项目编号
     *
     * @return project_no - SAP项目编号
     */
    public String getProjectNo() {
        return projectNo;
    }

    /**
     * 设置SAP项目编号
     *
     * @param projectNo SAP项目编号
     */
    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
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
     * @return proj_no - 项目编号
     */
    public String getProjNo() {
        return projNo;
    }

    /**
     * 设置项目编号
     *
     * @param projNo 项目编号
     */
    public void setProjNo(String projNo) {
        this.projNo = projNo;
    }

    /**
     * 获取财务编号
     *
     * @return finance_no - 财务编号
     */
    public String getFinanceNo() {
        return financeNo;
    }

    /**
     * 设置财务编号
     *
     * @param financeNo 财务编号
     */
    public void setFinanceNo(String financeNo) {
        this.financeNo = financeNo;
    }

    /**
     * 获取项目开始时间
     *
     * @return project_start_time - 项目开始时间
     */
    public String getProjectStartTime() {
        return projectStartTime;
    }

    /**
     * 设置项目开始时间
     *
     * @param projectStartTime 项目开始时间
     */
    public void setProjectStartTime(String projectStartTime) {
        this.projectStartTime = projectStartTime;
    }

    /**
     * 获取项目结束时间
     *
     * @return project_end_time - 项目结束时间
     */
    public String getProjectEndTime() {
        return projectEndTime;
    }

    /**
     * 设置项目结束时间
     *
     * @param projectEndTime 项目结束时间
     */
    public void setProjectEndTime(String projectEndTime) {
        this.projectEndTime = projectEndTime;
    }

    /**
     * 获取项目类型
     *
     * @return project_type - 项目类型
     */
    public String getProjectType() {
        return projectType;
    }

    /**
     * 设置项目类型
     *
     * @param projectType 项目类型
     */
    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    /**
     * 获取核算类型
     *
     * @return accounting_type - 核算类型
     */
    public String getAccountingType() {
        return accountingType;
    }

    /**
     * 设置核算类型
     *
     * @param accountingType 核算类型
     */
    public void setAccountingType(String accountingType) {
        this.accountingType = accountingType;
    }

    /**
     * 获取是否重点项目
     *
     * @return is_key_project - 是否重点项目
     */
    public String getIsKeyProject() {
        return isKeyProject;
    }

    /**
     * 设置是否重点项目
     *
     * @param isKeyProject 是否重点项目
     */
    public void setIsKeyProject(String isKeyProject) {
        this.isKeyProject = isKeyProject;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
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

    public String getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(String projectBudget) {
        this.projectBudget = projectBudget;
    }
}