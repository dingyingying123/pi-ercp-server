package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_report_work_tax_compute_result")
public class FssReportWorkTaxComputeResult {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 月份（yyyyMM）
     */
    private String month;

    /**
     * 法人
     */
    private String corporation;

    private String employee;

    @Column(name = "employee_code")
    private String employeeCode;

    private String department;

    /**
     * 岗位
     */
    private String post;

    /**
     * 部门编码
     */
    @Column(name = "department_no")
    private String departmentNo;

    /**
     * 项目
     */
    private String project;

    /**
     * 项目编码
     */
    @Column(name = "project_no")
    private String projectNo;

    /**
     * 可用薪资
     */
    @Column(name = "available_salary")
    private BigDecimal availableSalary;

    /**
     * 可用工时
     */
    @Column(name = "available_hours")
    private String availableHours;

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
     * 报税月主键
     */
    @Column(name = "month_id")
    private String monthId;
    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取月份（yyyyMM）
     *
     * @return month - 月份（yyyyMM）
     */
    public String getMonth() {
        return month;
    }

    /**
     * 设置月份（yyyyMM）
     *
     * @param month 月份（yyyyMM）
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * 获取法人
     *
     * @return corporation - 法人
     */
    public String getCorporation() {
        return corporation;
    }

    /**
     * 设置法人
     *
     * @param corporation 法人
     */
    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    /**
     * @return employee
     */
    public String getEmployee() {
        return employee;
    }

    /**
     * @param employee
     */
    public void setEmployee(String employee) {
        this.employee = employee;
    }

    /**
     * @return employee_code
     */
    public String getEmployeeCode() {
        return employeeCode;
    }

    /**
     * @param employeeCode
     */
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取岗位
     *
     * @return post - 岗位
     */
    public String getPost() {
        return post;
    }

    /**
     * 设置岗位
     *
     * @param post 岗位
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * 获取部门编码
     *
     * @return department_no - 部门编码
     */
    public String getDepartmentNo() {
        return departmentNo;
    }

    /**
     * 设置部门编码
     *
     * @param departmentNo 部门编码
     */
    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    /**
     * 获取项目
     *
     * @return project - 项目
     */
    public String getProject() {
        return project;
    }

    /**
     * 设置项目
     *
     * @param project 项目
     */
    public void setProject(String project) {
        this.project = project;
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
     * 获取可用薪资
     *
     * @return available_salary - 可用薪资
     */
    public BigDecimal getAvailableSalary() {
        return availableSalary;
    }

    /**
     * 设置可用薪资
     *
     * @param availableSalary 可用薪资
     */
    public void setAvailableSalary(BigDecimal availableSalary) {
        this.availableSalary = availableSalary;
    }

    /**
     * 获取可用工时
     *
     * @return available_hours - 可用工时
     */
    public String getAvailableHours() {
        return availableHours;
    }

    /**
     * 设置可用工时
     *
     * @param availableHours 可用工时
     */
    public void setAvailableHours(String availableHours) {
        this.availableHours = availableHours;
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

    public String getMonthId() {
        return monthId;
    }

    public void setMonthId(String monthId) {
        this.monthId = monthId;
    }
}