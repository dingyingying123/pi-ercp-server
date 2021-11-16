package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_report_work_tax_project_proportion")
public class FssReportWorkTaxProjectProportion {
    /**
     * 报税项目比例ID
     */
    @Id
    @Column(name = "pp_id")
    @GeneratedValue(generator = "JDBC")
    private String ppId;

    /**
     * 报税公司比例ID
     */
    @Column(name = "cp_id")
    private String cpId;

    /**
     * 项目编号
     */
    @Column(name = "project_no")
    private String projectNo;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 报税比例
     */
    private BigDecimal proportion;

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
     * 项目预算
     */
    @Column(name = "project_budget")
    private BigDecimal projectBudget;

    /**
     * 获取报税项目比例ID
     *
     * @return pp_id - 报税项目比例ID
     */
    public String getPpId() {
        return ppId;
    }

    /**
     * 设置报税项目比例ID
     *
     * @param ppId 报税项目比例ID
     */
    public void setPpId(String ppId) {
        this.ppId = ppId;
    }

    /**
     * 获取报税公司比例ID
     *
     * @return cp_id - 报税公司比例ID
     */
    public String getCpId() {
        return cpId;
    }

    /**
     * 设置报税公司比例ID
     *
     * @param cpId 报税公司比例ID
     */
    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    /**
     * 获取项目编号
     *
     * @return project_no - 项目编号
     */
    public String getProjectNo() {
        return projectNo;
    }

    /**
     * 设置项目编号
     *
     * @param projectNo 项目编号
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
     * 获取报税比例
     *
     * @return proportion - 报税比例
     */
    public BigDecimal getProportion() {
        return proportion;
    }

    /**
     * 设置报税比例
     *
     * @param proportion 报税比例
     */
    public void setProportion(BigDecimal proportion) {
        this.proportion = proportion;
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

    public BigDecimal getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(BigDecimal projectBudget) {
        this.projectBudget = projectBudget;
    }
}