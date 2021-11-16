package cn.com.personnel.ercp.auth.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sec_role_button")
public class SecRoleButton {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 0未删除1删除
     */
    private Integer isdelete;

    /**
     * 系统标识
     */
    private String appcod;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     * 路由id
     */
    @Column(name = "router_id")
    private String routerId;

    /**
     * 按钮id
     */
    @Column(name = "button_id")
    private String buttonId;

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
     * 获取0未删除1删除
     *
     * @return isdelete - 0未删除1删除
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * 设置0未删除1删除
     *
     * @param isdelete 0未删除1删除
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
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
     * 获取路由id
     *
     * @return router_id - 路由id
     */
    public String getRouterId() {
        return routerId;
    }

    /**
     * 设置路由id
     *
     * @param routerId 路由id
     */
    public void setRouterId(String routerId) {
        this.routerId = routerId;
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
}