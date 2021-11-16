package cn.com.personnel.ercp.auth.persistence.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sec_enum_type")
public class SecEnumType {
    /**
     * 主键
     */
    @Id
    @Column(name = "type_id")
    @GeneratedValue(generator = "JDBC")
    private String typeId;

    /**
     * 枚举类型名称
     */
    private String name;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除，0：未删除，1：已删除
     */
    private String deleted;

    /**
     * 枚举类型英文名称
     */
    @Column(name = "english_name")
    private String englishName;

    /**
     * 关键字（控制不重复）
     */
    private String key;

    /**
     * 系统标识
     */
    private String appcod;

    /**
     * 描述
     */
    private String description;

    /**
     * 启用状态，0：启用, 1：停用
     */
    private String status;

    /**
     * 获取主键
     *
     * @return type_id - 主键
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 设置主键
     *
     * @param typeId 主键
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取枚举类型名称
     *
     * @return name - 枚举类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置枚举类型名称
     *
     * @param name 枚举类型名称
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * 获取是否删除，0：未删除，1：已删除
     *
     * @return deleted - 是否删除，0：未删除，1：已删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除，0：未删除，1：已删除
     *
     * @param deleted 是否删除，0：未删除，1：已删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取枚举类型英文名称
     *
     * @return english_name - 枚举类型英文名称
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * 设置枚举类型英文名称
     *
     * @param englishName 枚举类型英文名称
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    /**
     * 获取关键字（控制不重复）
     *
     * @return key - 关键字（控制不重复）
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置关键字（控制不重复）
     *
     * @param key 关键字（控制不重复）
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取系统标识
     *
     * @return appcod - 系统标识
     */
    public String getAppcod() {
        return appcod;
    }

    /**
     * 设置系统标识
     *
     * @param appcod 系统标识
     */
    public void setAppcod(String appcod) {
        this.appcod = appcod;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取启用状态，0：启用, 1：停用
     *
     * @return status - 启用状态，0：启用, 1：停用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置启用状态，0：启用, 1：停用
     *
     * @param status 启用状态，0：启用, 1：停用
     */
    public void setStatus(String status) {
        this.status = status;
    }
}