package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_guarantee_reminder")
public class FssBaseGuaranteeReminder {
    /**
     * 提醒人ID
     */
    @Id
    @Column(name = "reminder_id")
    @GeneratedValue(generator = "JDBC")
    private String reminderId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 条件
     */
    private String condition;

    /**
     * 说明
     */
    private String description;

    /**
     * 启动状态，0启用，1禁用
     */
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    private String updater;

    @Column(name = "commercian_unit_id")
    private String commercianUnitId;

    @Column(name = "commercian_unit")
    private String commercianUnit;

    @Column(name = "dept_id")
    private String deptId;


    @Column(name = "dept")
    private String dept;


    @Column(name = "reminder_type")
    private String reminderType;


    /**
     * 获取提醒人ID
     *
     * @return reminder_id - 提醒人ID
     */
    public String getReminderId() {
        return reminderId;
    }

    /**
     * 设置提醒人ID
     *
     * @param reminderId 提醒人ID
     */
    public void setReminderId(String reminderId) {
        this.reminderId = reminderId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
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
     * 获取条件
     *
     * @return condition - 条件
     */
    public String getCondition() {
        return condition;
    }

    /**
     * 设置条件
     *
     * @param condition 条件
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * 获取说明
     *
     * @return description - 说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置说明
     *
     * @param description 说明
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取启动状态，0启用，1禁用
     *
     * @return status - 启动状态，0启用，1禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置启动状态，0启用，1禁用
     *
     * @param status 启动状态，0启用，1禁用
     */
    public void setStatus(String status) {
        this.status = status;
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


    public String getCommercianUnitId() {
        return commercianUnitId;
    }

    public void setCommercianUnitId(String commercianUnitId) {
        this.commercianUnitId = commercianUnitId;
    }

    public String getCommercianUnit() {
        return commercianUnit;
    }

    public void setCommercianUnit(String commercianUnit) {
        this.commercianUnit = commercianUnit;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getReminderType() {
        return reminderType;
    }

    public void setReminderType(String reminderType) {
        this.reminderType = reminderType;
    }
}