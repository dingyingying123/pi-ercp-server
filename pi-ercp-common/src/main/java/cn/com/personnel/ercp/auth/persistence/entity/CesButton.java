package cn.com.personnel.ercp.auth.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "ces_button")
public class CesButton {
    @Id
    private String id;

    /**
     * 是否删除0未删除 1已删除
     */
    private Short isdelete;

    /**
     * 按钮类型
     */
    @Column(name = "button_type")
    private String buttonType;

    /**
     * 按钮名称
     */
    @Column(name = "button_name")
    private String buttonName;

    @Column(name = "creater_id")
    private String createrId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "updater_id")
    private String updaterId;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 系统码
     */
    @Column(name = "system_code")
    private String systemCode;

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
     * 获取是否删除0未删除 1已删除
     *
     * @return isdelete - 是否删除0未删除 1已删除
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 设置是否删除0未删除 1已删除
     *
     * @param isdelete 是否删除0未删除 1已删除
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 获取按钮类型
     *
     * @return button_type - 按钮类型
     */
    public String getButtonType() {
        return buttonType;
    }

    /**
     * 设置按钮类型
     *
     * @param buttonType 按钮类型
     */
    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }

    /**
     * 获取按钮名称
     *
     * @return button_name - 按钮名称
     */
    public String getButtonName() {
        return buttonName;
    }

    /**
     * 设置按钮名称
     *
     * @param buttonName 按钮名称
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    /**
     * @return creater_id
     */
    public String getCreaterId() {
        return createrId;
    }

    /**
     * @param createrId
     */
    public void setCreaterId(String createrId) {
        this.createrId = createrId;
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
     * @return updater_id
     */
    public String getUpdaterId() {
        return updaterId;
    }

    /**
     * @param updaterId
     */
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
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
     * 获取系统码
     *
     * @return system_code - 系统码
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * 设置系统码
     *
     * @param systemCode 系统码
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }
}