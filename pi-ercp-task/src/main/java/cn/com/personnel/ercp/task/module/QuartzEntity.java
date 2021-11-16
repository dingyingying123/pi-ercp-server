package cn.com.personnel.ercp.task.module;

public class QuartzEntity {
    private String schedName;//计划名
    private String jobName;//任务名称
    private String jobGroup;//任务分组
    private String description;//任务描述
    private String jobClassName;//执行类
    private String cronExpression;//执行时间
    private String triggerName;//执行时间
    private String triggerState;//任务状态
    private String prevFireTime;//上次触发时间
    private String nextFireTime;//下次触发时间
    private String priority;//触发次数
    
    private String oldJobName;//任务名称 用于修改
    private String oldJobGroup;//任务分组 用于修改
    private String jobJsonData;//任务数据
    
    public QuartzEntity() {
        super();
    }
    public QuartzEntity(String schedName, String jobName, String jobGroup, String description, String jobClassName, String cronExpression, String triggerName) {
        super();
        this.schedName = schedName;
        this.jobName = jobName;
        this.jobGroup = jobGroup;
        this.description = description;
        this.jobClassName = jobClassName;
        this.cronExpression = cronExpression;
        this.triggerName = triggerName;
    }

    public String getSchedName() {
        return schedName;
    }
    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }
    public String getPrevFireTime() {
        return prevFireTime;
    }
    public void setPrevFireTime(String prevFireTime) {
        this.prevFireTime = prevFireTime;
    }
    public String getNextFireTime() {
        return nextFireTime;
    }
    public void setNextFireTime(String nextFireTime) {
        this.nextFireTime = nextFireTime;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getJobName() {
        return jobName;
    }
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    public String getJobGroup() {
        return jobGroup;
    }
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getJobClassName() {
        return jobClassName;
    }
    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }
    public String getCronExpression() {
        return cronExpression;
    }
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }
    public String getTriggerName() {
        return triggerName;
    }
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }
    public String getTriggerState() {
        return triggerState;
    }
    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState;
    }
    public String getOldJobName() {
        return oldJobName;
    }
    public void setOldJobName(String oldJobName) {
        this.oldJobName = oldJobName;
    }
    public String getOldJobGroup() {
        return oldJobGroup;
    }
    public void setOldJobGroup(String oldJobGroup) {
        this.oldJobGroup = oldJobGroup;
    }

    public String getJobJsonData() {
        return jobJsonData;
    }

    public void setJobJsonData(String jobJsonData) {
        this.jobJsonData = jobJsonData;
    }
}