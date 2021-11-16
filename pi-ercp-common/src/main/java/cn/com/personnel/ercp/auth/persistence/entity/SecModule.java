package cn.com.personnel.ercp.auth.persistence.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sec_module")
public class SecModule {
    /**
     * 模块ID
     */
    @Id
    @Column(name = "module_id")
    @GeneratedValue(generator = "JDBC")
    private String moduleId;

    /**
     * appcod
     */
    private String appcod;

    /**
     * 图标
     */
    private String icon;

    /**
     * 功能点名称
     */
    @Column(name = "module_name")
    private String moduleName;

    /**
     * 功能点URI
     */
    @Column(name = "module_url")
    private String moduleUrl;

    /**
     * 功能点描述
     */
    @Column(name = "module_desc")
    private String moduleDesc;

    /**
     * 父节点id
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 是否叶子节点
     */
    @Column(name = "is_leaf")
    private String isLeaf;

    /**
     * 是否有效
     */
    private String valid;

    private Integer orderid;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人
     */
    private String updator;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 功能点英文名称
     */
    @Column(name = "module_name_en")
    private String moduleNameEn;

    /**
     * 菜单名称
     */
    @Column(name = "vue_title")
    private String vueTitle;

    /**
     * 图标
     */
    @Column(name = "vue_icon")
    private String vueIcon;

    /**
     * 有无缓存
     */
    @Column(name = "vue_nocach")
    private String vueNocach;

    /**
     * 组件
     */
    @Column(name = "vue_component")
    private String vueComponent;

    /**
     * vuepath
     */
    @Column(name = "vue_path")
    private String vuePath;

    /**
     * 是否添加标签
     */
    @Column(name = "vue_not_add")
    private String vueNotAdd;

    /**
     * 缓存标识
     */
    private String name;

    /**
     * 重定向
     */
    private String redirect;

    private String i18n;

    @Column(name = "en_name")
    private String enName;

    /**
     * 是否隐藏
     */
    @Column(name = "vue_hidden")
    private String vueHidden;

    /**
     * 获取模块ID
     *
     * @return module_id - 模块ID
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * 设置模块ID
     *
     * @param moduleId 模块ID
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * 获取appcod
     *
     * @return appcod - appcod
     */
    public String getAppcod() {
        return appcod;
    }

    /**
     * 设置appcod
     *
     * @param appcod appcod
     */
    public void setAppcod(String appcod) {
        this.appcod = appcod;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取功能点名称
     *
     * @return module_name - 功能点名称
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * 设置功能点名称
     *
     * @param moduleName 功能点名称
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * 获取功能点URI
     *
     * @return module_url - 功能点URI
     */
    public String getModuleUrl() {
        return moduleUrl;
    }

    /**
     * 设置功能点URI
     *
     * @param moduleUrl 功能点URI
     */
    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    /**
     * 获取功能点描述
     *
     * @return module_desc - 功能点描述
     */
    public String getModuleDesc() {
        return moduleDesc;
    }

    /**
     * 设置功能点描述
     *
     * @param moduleDesc 功能点描述
     */
    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc;
    }

    /**
     * 获取父节点id
     *
     * @return parent_id - 父节点id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父节点id
     *
     * @param parentId 父节点id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取是否叶子节点
     *
     * @return is_leaf - 是否叶子节点
     */
    public String getIsLeaf() {
        return isLeaf;
    }

    /**
     * 设置是否叶子节点
     *
     * @param isLeaf 是否叶子节点
     */
    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    /**
     * 获取是否有效
     *
     * @return valid - 是否有效
     */
    public String getValid() {
        return valid;
    }

    /**
     * 设置是否有效
     *
     * @param valid 是否有效
     */
    public void setValid(String valid) {
        this.valid = valid;
    }

    /**
     * @return orderid
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * @param orderid
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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
     * 获取修改人
     *
     * @return updator - 修改人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置修改人
     *
     * @param updator 修改人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取功能点英文名称
     *
     * @return module_name_en - 功能点英文名称
     */
    public String getModuleNameEn() {
        return moduleNameEn;
    }

    /**
     * 设置功能点英文名称
     *
     * @param moduleNameEn 功能点英文名称
     */
    public void setModuleNameEn(String moduleNameEn) {
        this.moduleNameEn = moduleNameEn;
    }

    /**
     * 获取菜单名称
     *
     * @return vue_title - 菜单名称
     */
    public String getVueTitle() {
        return vueTitle;
    }

    /**
     * 设置菜单名称
     *
     * @param vueTitle 菜单名称
     */
    public void setVueTitle(String vueTitle) {
        this.vueTitle = vueTitle;
    }

    /**
     * 获取图标
     *
     * @return vue_icon - 图标
     */
    public String getVueIcon() {
        return vueIcon;
    }

    /**
     * 设置图标
     *
     * @param vueIcon 图标
     */
    public void setVueIcon(String vueIcon) {
        this.vueIcon = vueIcon;
    }

    /**
     * 获取有无缓存
     *
     * @return vue_nocach - 有无缓存
     */
    public String getVueNocach() {
        return vueNocach;
    }

    /**
     * 设置有无缓存
     *
     * @param vueNocach 有无缓存
     */
    public void setVueNocach(String vueNocach) {
        this.vueNocach = vueNocach;
    }

    /**
     * 获取组件
     *
     * @return vue_component - 组件
     */
    public String getVueComponent() {
        return vueComponent;
    }

    /**
     * 设置组件
     *
     * @param vueComponent 组件
     */
    public void setVueComponent(String vueComponent) {
        this.vueComponent = vueComponent;
    }

    /**
     * 获取vuepath
     *
     * @return vue_path - vuepath
     */
    public String getVuePath() {
        return vuePath;
    }

    /**
     * 设置vuepath
     *
     * @param vuePath vuepath
     */
    public void setVuePath(String vuePath) {
        this.vuePath = vuePath;
    }

    /**
     * 获取是否添加标签
     *
     * @return vue_not_add - 是否添加标签
     */
    public String getVueNotAdd() {
        return vueNotAdd;
    }

    /**
     * 设置是否添加标签
     *
     * @param vueNotAdd 是否添加标签
     */
    public void setVueNotAdd(String vueNotAdd) {
        this.vueNotAdd = vueNotAdd;
    }

    /**
     * 获取缓存标识
     *
     * @return name - 缓存标识
     */
    public String getName() {
        return name;
    }

    /**
     * 设置缓存标识
     *
     * @param name 缓存标识
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取重定向
     *
     * @return redirect - 重定向
     */
    public String getRedirect() {
        return redirect;
    }

    /**
     * 设置重定向
     *
     * @param redirect 重定向
     */
    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    /**
     * @return i18n
     */
    public String getI18n() {
        return i18n;
    }

    /**
     * @param i18n
     */
    public void setI18n(String i18n) {
        this.i18n = i18n;
    }

    /**
     * @return en_name
     */
    public String getEnName() {
        return enName;
    }

    /**
     * @param enName
     */
    public void setEnName(String enName) {
        this.enName = enName;
    }

    /**
     * 获取是否隐藏
     *
     * @return vue_hidden - 是否隐藏
     */
    public String getVueHidden() {
        return vueHidden;
    }

    /**
     * 设置是否隐藏
     *
     * @param vueHidden 是否隐藏
     */
    public void setVueHidden(String vueHidden) {
        this.vueHidden = vueHidden;
    }
}