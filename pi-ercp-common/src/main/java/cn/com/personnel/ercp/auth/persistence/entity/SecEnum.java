package cn.com.personnel.ercp.auth.persistence.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sec_enum")
public class SecEnum {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 枚举类型ID
     */
    @Column(name = "type_id")
    private String typeId;

    /**
     * 编码
     */
    private String code;

    /**
     * 枚举名称
     */
    private String name;

    /**
     * 枚举英文名称
     */
    @Column(name = "english_name")
    private String englishName;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否删除，0：未删除，1：已删除
     */
    private String deleted;

    @Column(name = "create_time")
    private Date createTime;

    private String creator;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 排序
     */
    private Integer sorder;

    /**
     * 启用状态，0：启用, 1：停用
     */
    private String status;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取枚举类型ID
     *
     * @return type_id - 枚举类型ID
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 设置枚举类型ID
     *
     * @param typeId 枚举类型ID
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取编码
     *
     * @return code - 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取枚举名称
     *
     * @return name - 枚举名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置枚举名称
     *
     * @param name 枚举名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取枚举英文名称
     *
     * @return english_name - 枚举英文名称
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * 设置枚举英文名称
     *
     * @param englishName 枚举英文名称
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
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
     * 获取排序
     *
     * @return sorder - 排序
     */
    public Integer getSorder() {
        return sorder;
    }

    /**
     * 设置排序
     *
     * @param sorder 排序
     */
    public void setSorder(Integer sorder) {
        this.sorder = sorder;
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