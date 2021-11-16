package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_project_change_record")
public class FssBaseProjectChangeRecord {
    /**
     * 项目变更ID
     */
    @Id
    @Column(name = "change_id")
    @GeneratedValue(generator = "JDBC")
    private String changeId;

    /**
     * 项目ID
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 项目简称
     */
    @Column(name = "project_abbreviation")
    private String projectAbbreviation;

    /**
     * 变更内容名称
     */
    @Column(name = "column_name")
    private String columnName;

    /**
     * 变更前内容
     */
    @Column(name = "old_value")
    private String oldValue;

    /**
     * 变更后内容
     */
    @Column(name = "new_value")
    private String newValue;

    /**
     * 预留
     */
    private String reserve;

    /**
     * 变更时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 变更人
     */
    private String creator;

    /**
     * 获取项目变更ID
     *
     * @return change_id - 项目变更ID
     */
    public String getChangeId() {
        return changeId;
    }

    /**
     * 设置项目变更ID
     *
     * @param changeId 项目变更ID
     */
    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    /**
     * 获取项目ID
     *
     * @return project_id - 项目ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目ID
     *
     * @param projectId 项目ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取项目简称
     *
     * @return project_abbreviation - 项目简称
     */
    public String getProjectAbbreviation() {
        return projectAbbreviation;
    }

    /**
     * 设置项目简称
     *
     * @param projectAbbreviation 项目简称
     */
    public void setProjectAbbreviation(String projectAbbreviation) {
        this.projectAbbreviation = projectAbbreviation;
    }

    /**
     * 获取变更内容名称
     *
     * @return column_name - 变更内容名称
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 设置变更内容名称
     *
     * @param columnName 变更内容名称
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * 获取变更前内容
     *
     * @return old_value - 变更前内容
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * 设置变更前内容
     *
     * @param oldValue 变更前内容
     */
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    /**
     * 获取变更后内容
     *
     * @return new_value - 变更后内容
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * 设置变更后内容
     *
     * @param newValue 变更后内容
     */
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    /**
     * 获取预留
     *
     * @return reserve - 预留
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * 设置预留
     *
     * @param reserve 预留
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    /**
     * 获取变更时间
     *
     * @return create_time - 变更时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置变更时间
     *
     * @param createTime 变更时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取变更人
     *
     * @return creator - 变更人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置变更人
     *
     * @param creator 变更人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
}