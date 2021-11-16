package cn.com.personnel.ercp.auth.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sec_router_button")
public class SecRouterButton {
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
     * 路由id
     */
    @Column(name = "router_id")
    private String routerId;

    /**
     * 路由父id
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 路由地址
     */
    private String router;

    /**
     * 按钮
     */
    private String button;

    /**
     * 按钮名称
     */
    @Column(name = "button_name")
    private String buttonName;

    /**
     * 按钮描述
     */
    @Column(name = "button_desc")
    private String buttonDesc;

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
     * 获取路由父id
     *
     * @return parent_id - 路由父id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置路由父id
     *
     * @param parentId 路由父id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取路由地址
     *
     * @return router - 路由地址
     */
    public String getRouter() {
        return router;
    }

    /**
     * 设置路由地址
     *
     * @param router 路由地址
     */
    public void setRouter(String router) {
        this.router = router;
    }

    /**
     * 获取按钮
     *
     * @return button - 按钮
     */
    public String getButton() {
        return button;
    }

    /**
     * 设置按钮
     *
     * @param button 按钮
     */
    public void setButton(String button) {
        this.button = button;
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
     * 获取按钮描述
     *
     * @return button_desc - 按钮描述
     */
    public String getButtonDesc() {
        return buttonDesc;
    }

    /**
     * 设置按钮描述
     *
     * @param buttonDesc 按钮描述
     */
    public void setButtonDesc(String buttonDesc) {
        this.buttonDesc = buttonDesc;
    }
}