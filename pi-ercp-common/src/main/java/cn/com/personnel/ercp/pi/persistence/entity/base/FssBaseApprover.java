package cn.com.personnel.ercp.pi.persistence.entity.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_base_approver")
public class FssBaseApprover {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 流程定义id
     */
    @Column(name = "processdef_id")
    private String processdefId;

    /**
     * 节点id
     */
    @Column(name = "activitydef_id")
    private String activitydefId;

    /**
     * 人员oa号
     */
    @Column(name = "people_code")
    private String peopleCode;

    /**
     * 姓名
     */
    @Column(name = "people_name")
    private String peopleName;

    /**
     * 部门id
     */
    @Column(name = "departent_id")
    private String departentId;

    /**
     * 业务单元id
     */
    @Column(name = "unit_id")
    private String unitId;

    @Column(name = "system_id")
    private String systemId;

    @Column(name = "orgeh_id")
    private String orgehId;

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

    /**
     * 中心id
     */
    @Column(name = "center_id")
    private String centerId;

    /**
     * 流程定义名称
     */
    @Column(name = "processdef_name")
    private String processdefName;

    /**
     * 活动定义名称
     */
    @Column(name = "activitydef_name")
    private String activitydefName;

    /**
     * 人员标识
     */
    @Column(name = "person_flag")
    private String personFlag;

    /**
     * 人员类型
     */
    @Column(name = "person_type")
    private String personType;

    /**
     * 公司编码
     */
    private String bukrs;

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
     * 获取流程定义id
     *
     * @return processdef_id - 流程定义id
     */
    public String getProcessdefId() {
        return processdefId;
    }

    /**
     * 设置流程定义id
     *
     * @param processdefId 流程定义id
     */
    public void setProcessdefId(String processdefId) {
        this.processdefId = processdefId;
    }

    /**
     * 获取节点id
     *
     * @return activitydef_id - 节点id
     */
    public String getActivitydefId() {
        return activitydefId;
    }

    /**
     * 设置节点id
     *
     * @param activitydefId 节点id
     */
    public void setActivitydefId(String activitydefId) {
        this.activitydefId = activitydefId;
    }

    /**
     * 获取人员oa号
     *
     * @return people_code - 人员oa号
     */
    public String getPeopleCode() {
        return peopleCode;
    }

    /**
     * 设置人员oa号
     *
     * @param peopleCode 人员oa号
     */
    public void setPeopleCode(String peopleCode) {
        this.peopleCode = peopleCode;
    }

    /**
     * 获取姓名
     *
     * @return people_name - 姓名
     */
    public String getPeopleName() {
        return peopleName;
    }

    /**
     * 设置姓名
     *
     * @param peopleName 姓名
     */
    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    /**
     * 获取部门id
     *
     * @return departent_id - 部门id
     */
    public String getDepartentId() {
        return departentId;
    }

    /**
     * 设置部门id
     *
     * @param departentId 部门id
     */
    public void setDepartentId(String departentId) {
        this.departentId = departentId;
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
     * @return system_id
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * @param systemId
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /**
     * @return orgeh_id
     */
    public String getOrgehId() {
        return orgehId;
    }

    /**
     * @param orgehId
     */
    public void setOrgehId(String orgehId) {
        this.orgehId = orgehId;
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

    /**
     * 获取中心id
     *
     * @return center_id - 中心id
     */
    public String getCenterId() {
        return centerId;
    }

    /**
     * 设置中心id
     *
     * @param centerId 中心id
     */
    public void setCenterId(String centerId) {
        this.centerId = centerId;
    }

    /**
     * 获取流程定义名称
     *
     * @return processdef_name - 流程定义名称
     */
    public String getProcessdefName() {
        return processdefName;
    }

    /**
     * 设置流程定义名称
     *
     * @param processdefName 流程定义名称
     */
    public void setProcessdefName(String processdefName) {
        this.processdefName = processdefName;
    }

    /**
     * 获取活动定义名称
     *
     * @return activitydef_name - 活动定义名称
     */
    public String getActivitydefName() {
        return activitydefName;
    }

    /**
     * 设置活动定义名称
     *
     * @param activitydefName 活动定义名称
     */
    public void setActivitydefName(String activitydefName) {
        this.activitydefName = activitydefName;
    }

    public String getPersonFlag() {
        return personFlag;
    }

    public void setPersonFlag(String personFlag) {
        this.personFlag = personFlag;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getBukrs() {
        return bukrs;
    }

    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }
}