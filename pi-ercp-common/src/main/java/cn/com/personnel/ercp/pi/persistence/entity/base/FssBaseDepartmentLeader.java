package cn.com.personnel.ercp.pi.persistence.entity.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_base_department_leader")
public class FssBaseDepartmentLeader {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 部门名称
     */
    private String department;

    /**
     * 部门id
     */
    @Column(name = "department_id")
    private String departmentId;

    /**
     * 人员oa号
     */
    private String code;

    /**
     * 姓名
     */
    private String name;

    /**
     * 业务单元名称
     */
    private String unit;

    /**
     * 业务单元id
     */
    @Column(name = "unit_id")
    private String unitId;

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
    private String updater;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    @Override
    public String toString() {
        return "FssBaseDepartmentLeader{" +
                "id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", unitId='" + unitId + '\'' +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", updater='" + updater + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }

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
     * 获取部门名称
     *
     * @return department - 部门名称
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门名称
     *
     * @param department 部门名称
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取部门id
     *
     * @return department_id - 部门id
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门id
     *
     * @param departmentId 部门id
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取人员oa号
     *
     * @return code - 人员oa号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置人员oa号
     *
     * @param code 人员oa号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取业务单元名称
     *
     * @return unit - 业务单元名称
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置业务单元名称
     *
     * @param unit 业务单元名称
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取业务单元id
     *
     * @return unit_id - 业务单元id
     */
    public String getUnitId() {
        return unitId;
    }

    /**
     * 设置业务单元id
     *
     * @param unitId 业务单元id
     */
    public void setUnitId(String unitId) {
        this.unitId = unitId;
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
}