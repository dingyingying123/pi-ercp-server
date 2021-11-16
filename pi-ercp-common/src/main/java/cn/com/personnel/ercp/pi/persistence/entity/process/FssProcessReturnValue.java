package cn.com.personnel.ercp.pi.persistence.entity.process;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_process_return_value")
public class FssProcessReturnValue {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "frev_id")
    @GeneratedValue(generator = "JDBC")
    private String frevId;

    /**
     * 项目ID
     */
    @Column(name = "primary_key_id")
    private String primaryKeyId;

    /**
     * 流程实例ID
     */
    @Column(name = "process_inst_id")
    private String processInstId;

    /**
     * 流程实例名称
     */
    @Column(name = "process_inst_name")
    private String processInstName;

    /**
     * 流程定义ID
     */
    @Column(name = "process_def_id")
    private String processDefId;

    /**
     * 流程定义名称
     */
    @Column(name = "process_def_name")
    private String processDefName;

    /**
     * 待办任务ID
     */
    @Column(name = "work_item_id")
    private String workItemId;

    /**
     * 待办任务名称
     */
    @Column(name = "work_item_name")
    private String workItemName;

    /**
     * 流程访问路径
     */
    @Column(name = "action_url")
    private String actionUrl;

    /**
     * 活动流程节点
     */
    @Column(name = "activity_inst_id")
    private String activityInstId;

    /**
     * 活动实例名称
     */
    @Column(name = "activity_inst_name")
    private String activityInstName;

    /**
     * 活动定义ID
     */
    @Column(name = "activity_def_id")
    private String activityDefId;

    @Column(name = "biz_state")
    private String bizState;

    /**
     * 系统
     */
    private String app;

    /**
     * 对应查询表名称
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 流程状态
     */
    @Column(name = "process_status")
    private String processStatus;

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
     * 预留字段
     */
    private String reserved1;

    /**
     * 获取主键ID
     *
     * @return frev_id - 主键ID
     */
    public String getFrevId() {
        return frevId;
    }

    /**
     * 设置主键ID
     *
     * @param frevId 主键ID
     */
    public void setFrevId(String frevId) {
        this.frevId = frevId;
    }

    /**
     * 获取项目ID
     *
     * @return primary_key_id - 项目ID
     */
    public String getPrimaryKeyId() {
        return primaryKeyId;
    }

    /**
     * 设置项目ID
     *
     * @param primaryKeyId 项目ID
     */
    public void setPrimaryKeyId(String primaryKeyId) {
        this.primaryKeyId = primaryKeyId;
    }

    /**
     * 获取流程实例ID
     *
     * @return process_inst_id - 流程实例ID
     */
    public String getProcessInstId() {
        return processInstId;
    }

    /**
     * 设置流程实例ID
     *
     * @param processInstId 流程实例ID
     */
    public void setProcessInstId(String processInstId) {
        this.processInstId = processInstId;
    }

    /**
     * 获取流程实例名称
     *
     * @return process_inst_name - 流程实例名称
     */
    public String getProcessInstName() {
        return processInstName;
    }

    /**
     * 设置流程实例名称
     *
     * @param processInstName 流程实例名称
     */
    public void setProcessInstName(String processInstName) {
        this.processInstName = processInstName;
    }

    /**
     * 获取流程定义ID
     *
     * @return process_def_id - 流程定义ID
     */
    public String getProcessDefId() {
        return processDefId;
    }

    /**
     * 设置流程定义ID
     *
     * @param processDefId 流程定义ID
     */
    public void setProcessDefId(String processDefId) {
        this.processDefId = processDefId;
    }

    /**
     * 获取流程定义名称
     *
     * @return process_def_name - 流程定义名称
     */
    public String getProcessDefName() {
        return processDefName;
    }

    /**
     * 设置流程定义名称
     *
     * @param processDefName 流程定义名称
     */
    public void setProcessDefName(String processDefName) {
        this.processDefName = processDefName;
    }

    /**
     * 获取待办任务ID
     *
     * @return work_item_id - 待办任务ID
     */
    public String getWorkItemId() {
        return workItemId;
    }

    /**
     * 设置待办任务ID
     *
     * @param workItemId 待办任务ID
     */
    public void setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
    }

    /**
     * 获取待办任务名称
     *
     * @return work_item_name - 待办任务名称
     */
    public String getWorkItemName() {
        return workItemName;
    }

    /**
     * 设置待办任务名称
     *
     * @param workItemName 待办任务名称
     */
    public void setWorkItemName(String workItemName) {
        this.workItemName = workItemName;
    }

    /**
     * 获取流程访问路径
     *
     * @return action_url - 流程访问路径
     */
    public String getActionUrl() {
        return actionUrl;
    }

    /**
     * 设置流程访问路径
     *
     * @param actionUrl 流程访问路径
     */
    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    /**
     * 获取活动流程节点
     *
     * @return activity_inst_id - 活动流程节点
     */
    public String getActivityInstId() {
        return activityInstId;
    }

    /**
     * 设置活动流程节点
     *
     * @param activityInstId 活动流程节点
     */
    public void setActivityInstId(String activityInstId) {
        this.activityInstId = activityInstId;
    }

    /**
     * 获取活动实例名称
     *
     * @return activity_inst_name - 活动实例名称
     */
    public String getActivityInstName() {
        return activityInstName;
    }

    /**
     * 设置活动实例名称
     *
     * @param activityInstName 活动实例名称
     */
    public void setActivityInstName(String activityInstName) {
        this.activityInstName = activityInstName;
    }

    /**
     * 获取活动定义ID
     *
     * @return activity_def_id - 活动定义ID
     */
    public String getActivityDefId() {
        return activityDefId;
    }

    /**
     * 设置活动定义ID
     *
     * @param activityDefId 活动定义ID
     */
    public void setActivityDefId(String activityDefId) {
        this.activityDefId = activityDefId;
    }

    /**
     * @return biz_state
     */
    public String getBizState() {
        return bizState;
    }

    /**
     * @param bizState
     */
    public void setBizState(String bizState) {
        this.bizState = bizState;
    }

    /**
     * 获取系统
     *
     * @return app - 系统
     */
    public String getApp() {
        return app;
    }

    /**
     * 设置系统
     *
     * @param app 系统
     */
    public void setApp(String app) {
        this.app = app;
    }

    /**
     * 获取对应查询表名称
     *
     * @return table_name - 对应查询表名称
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置对应查询表名称
     *
     * @param tableName 对应查询表名称
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * 获取流程状态
     *
     * @return process_status - 流程状态
     */
    public String getProcessStatus() {
        return processStatus;
    }

    /**
     * 设置流程状态
     *
     * @param processStatus 流程状态
     */
    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
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
     * 获取预留字段
     *
     * @return reserved1 - 预留字段
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * 设置预留字段
     *
     * @param reserved1 预留字段
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }
}