package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

import java.math.BigDecimal;

public class FssReportSalaryVO extends FssReportWorkSalary{
    /**
     * 公司编码
     */
    private String organId;

    /**
     * 公司名称
     */
    private String organName;
    /**
     * 部门ID
     */
    private String departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 类型
     */
    private String type;

    /**
     * 岗位
     */
    private String job;

    /**
     * 报税比例
     */
    private BigDecimal proportion;


    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public BigDecimal getProportion() {
        return proportion;
    }

    public void setProportion(BigDecimal proportion) {
        this.proportion = proportion;
    }

}
