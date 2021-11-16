package cn.com.personnel.ercp.auth.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ces_role_module_button")
public class CesRoleModuleButton {
    @Id
    private String id;

    /**
     * 是否删除0删除1未删除
     */
    private Short isdelete;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     * 菜单id
     */
    @Column(name = "meun_id")
    private String meunId;

    /**
     * 按钮id
     */
    @Column(name = "button_id")
    private String buttonId;

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
     * 获取是否删除0删除1未删除
     *
     * @return isdelete - 是否删除0删除1未删除
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 设置是否删除0删除1未删除
     *
     * @param isdelete 是否删除0删除1未删除
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取菜单id
     *
     * @return meun_id - 菜单id
     */
    public String getMeunId() {
        return meunId;
    }

    /**
     * 设置菜单id
     *
     * @param meunId 菜单id
     */
    public void setMeunId(String meunId) {
        this.meunId = meunId;
    }

    /**
     * 获取按钮id
     *
     * @return button_id - 按钮id
     */
    public String getButtonId() {
        return buttonId;
    }

    /**
     * 设置按钮id
     *
     * @param buttonId 按钮id
     */
    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
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