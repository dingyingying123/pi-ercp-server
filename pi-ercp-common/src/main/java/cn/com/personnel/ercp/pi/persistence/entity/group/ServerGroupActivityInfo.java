package cn.com.personnel.ercp.pi.persistence.entity.group;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_group_activity_info")
public class ServerGroupActivityInfo {
    @Id
    @Column(name = "group_id")
    @GeneratedValue(generator = "JDBC")
    private String groupId;

    private String area;

    @Column(name = "activity_time")
    private String activityTime;

    @Column(name = "activity_location")
    private String activityLocation;

    @Column(name = "activity_theme")
    private String activityTheme;

    private String host;

    private String recorder;

    private String participants;

    private String activities;

    private String summarize;

    private String isdelete;

    private String status;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "activity_effectiveness")
    private String activityEffectiveness;

    /**
     * @return group_id
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return activity_time
     */
    public String getActivityTime() {
        return activityTime;
    }

    /**
     * @param activityTime
     */
    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }

    /**
     * @return activity_location
     */
    public String getActivityLocation() {
        return activityLocation;
    }

    /**
     * @param activityLocation
     */
    public void setActivityLocation(String activityLocation) {
        this.activityLocation = activityLocation;
    }

    /**
     * @return activity_theme
     */
    public String getActivityTheme() {
        return activityTheme;
    }

    /**
     * @param activityTheme
     */
    public void setActivityTheme(String activityTheme) {
        this.activityTheme = activityTheme;
    }

    /**
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return recorder
     */
    public String getRecorder() {
        return recorder;
    }

    /**
     * @param recorder
     */
    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    /**
     * @return participants
     */
    public String getParticipants() {
        return participants;
    }

    /**
     * @param participants
     */
    public void setParticipants(String participants) {
        this.participants = participants;
    }

    /**
     * @return activities
     */
    public String getActivities() {
        return activities;
    }

    /**
     * @param activities
     */
    public void setActivities(String activities) {
        this.activities = activities;
    }

    /**
     * @return summarize
     */
    public String getSummarize() {
        return summarize;
    }

    /**
     * @param summarize
     */
    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }

    /**
     * @return isdelete
     */
    public String getIsdelete() {
        return isdelete;
    }

    /**
     * @param isdelete
     */
    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return updator
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getActivityEffectiveness() {
        return activityEffectiveness;
    }

    public void setActivityEffectiveness(String activityEffectiveness) {
        this.activityEffectiveness = activityEffectiveness;
    }
}