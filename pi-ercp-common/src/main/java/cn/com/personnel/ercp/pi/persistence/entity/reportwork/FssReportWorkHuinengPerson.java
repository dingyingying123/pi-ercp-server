package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_report_work_huineng_person")
public class FssReportWorkHuinengPerson {
    /**
     * 主键
     */
    @Column(name = "p_id")
    @GeneratedValue(generator = "JDBC")
    private String pId;

    /**
     * 用户名ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 年月
     */
    private String month;

    /**
     * 公司编码
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 公司名称
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 项目编码
     */
    @Column(name = "project_no")
    private String projectNo;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 人员工时占比
     */
    private BigDecimal propertion;

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
     * 起始日期
     */
    @Column(name = "start_date")
    private String startDate;

    /**
     * 结束日期
     */
    @Column(name = "end_date")
    private String endDate;

    /**
     * 成本中心
     */
    @Column(name = "cost_center_id")
    private String costCenterId;

    /**
     * 部门ID
     */
    @Column(name = "department_id")
    private String departmentId;

    /**
     * 部门
     */
    private String department;

    /**
     * 业务报工类型
     */
    private String kstar;

    private String pspnr;

    private String psptx;

    /**
     * 获取主键
     *
     * @return p_id - 主键
     */
    public String getpId() {
        return pId;
    }

    /**
     * 设置主键
     *
     * @param pId 主键
     */
    public void setpId(String pId) {
        this.pId = pId;
    }

    /**
     * 获取用户名ID
     *
     * @return user_id - 用户名ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户名ID
     *
     * @param userId 用户名ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取年月
     *
     * @return month - 年月
     */
    public String getMonth() {
        return month;
    }

    /**
     * 设置年月
     *
     * @param month 年月
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * 获取公司编码
     *
     * @return organ_id - 公司编码
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置公司编码
     *
     * @param organId 公司编码
     */
    public void setOrganId(String organId) {
        this.organId = organId;
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
     * 获取项目编码
     *
     * @return project_no - 项目编码
     */
    public String getProjectNo() {
        return projectNo;
    }

    /**
     * 设置项目编码
     *
     * @param projectNo 项目编码
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
     * 获取人员工时占比
     *
     * @return propertion - 人员工时占比
     */
    public BigDecimal getPropertion() {
        return propertion;
    }

    /**
     * 设置人员工时占比
     *
     * @param propertion 人员工时占比
     */
    public void setPropertion(BigDecimal propertion) {
        this.propertion = propertion;
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
     * 获取起始日期
     *
     * @return start_date - 起始日期
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 设置起始日期
     *
     * @param startDate 起始日期
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束日期
     *
     * @return end_date - 结束日期
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 设置结束日期
     *
     * @param endDate 结束日期
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取成本中心
     *
     * @return cost_center_id - 成本中心
     */
    public String getCostCenterId() {
        return costCenterId;
    }

    /**
     * 设置成本中心
     *
     * @param costCenterId 成本中心
     */
    public void setCostCenterId(String costCenterId) {
        this.costCenterId = costCenterId;
    }

    /**
     * 获取部门ID
     *
     * @return department_id - 部门ID
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门ID
     *
     * @param departmentId 部门ID
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取部门
     *
     * @return department - 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门
     *
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取业务报工类型
     *
     * @return kstar - 业务报工类型
     */
    public String getKstar() {
        return kstar;
    }

    /**
     * 设置业务报工类型
     *
     * @param kstar 业务报工类型
     */
    public void setKstar(String kstar) {
        this.kstar = kstar;
    }

    /**
     * @return pspnr
     */
    public String getPspnr() {
        return pspnr;
    }

    /**
     * @param pspnr
     */
    public void setPspnr(String pspnr) {
        this.pspnr = pspnr;
    }

    /**
     * @return psptx
     */
    public String getPsptx() {
        return psptx;
    }

    /**
     * @param psptx
     */
    public void setPsptx(String psptx) {
        this.psptx = psptx;
    }
}