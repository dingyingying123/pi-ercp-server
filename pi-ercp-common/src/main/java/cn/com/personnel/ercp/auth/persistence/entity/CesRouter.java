package cn.com.personnel.ercp.auth.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "ces_router")
public class CesRouter {
    /**
     * 路由id
     */
    @Id
    private String id;

    /**
     * 路由名称(zh)
     */
    @Column(name = "zh_Name")
    private String zhName;

    /**
     * 路由名称(en)
     */
    @Column(name = "en_Name")
    private String enName;

    /**
     * 国际化i18n
     */
    private String title;

    /**
     * 路由地址
     */
    private String path;

    /**
     * 模块名称
     */
    private String component;

    /**
     * 不需缓存
     */
    @Column(name = "no_cache")
    private String noCache;

    /**
     * 缓存标记
     */
    private String name;

    /**
     * 不创建tab
     */
    @Column(name = "not_add")
    private String notAdd;

    /**
     * 有效性
     */
    private String valid;

    /**
     * 路由位置
     */
    private String place;

    /**
     * 权限类型
     */
    private String auth;

    /**
     * 角色id
     */
    @Column(name = "custom_auth")
    private String customAuth;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建日期
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人
     */
    private String updator;

    /**
     * 修改日期
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 系统标识
     */
    private String appcod;

    /**
     * 获取路由id
     *
     * @return id - 路由id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置路由id
     *
     * @param id 路由id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取路由名称(zh)
     *
     * @return zh_Name - 路由名称(zh)
     */
    public String getZhName() {
        return zhName;
    }

    /**
     * 设置路由名称(zh)
     *
     * @param zhName 路由名称(zh)
     */
    public void setZhName(String zhName) {
        this.zhName = zhName;
    }

    /**
     * 获取路由名称(en)
     *
     * @return en_Name - 路由名称(en)
     */
    public String getEnName() {
        return enName;
    }

    /**
     * 设置路由名称(en)
     *
     * @param enName 路由名称(en)
     */
    public void setEnName(String enName) {
        this.enName = enName;
    }

    /**
     * 获取国际化i18n
     *
     * @return title - 国际化i18n
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置国际化i18n
     *
     * @param title 国际化i18n
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取路由地址
     *
     * @return path - 路由地址
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置路由地址
     *
     * @param path 路由地址
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取模块名称
     *
     * @return component - 模块名称
     */
    public String getComponent() {
        return component;
    }

    /**
     * 设置模块名称
     *
     * @param component 模块名称
     */
    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * 获取不需缓存
     *
     * @return no_cache - 不需缓存
     */
    public String getNoCache() {
        return noCache;
    }

    /**
     * 设置不需缓存
     *
     * @param noCache 不需缓存
     */
    public void setNoCache(String noCache) {
        this.noCache = noCache;
    }

    /**
     * 获取缓存标记
     *
     * @return name - 缓存标记
     */
    public String getName() {
        return name;
    }

    /**
     * 设置缓存标记
     *
     * @param name 缓存标记
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取不创建tab
     *
     * @return not_add - 不创建tab
     */
    public String getNotAdd() {
        return notAdd;
    }

    /**
     * 设置不创建tab
     *
     * @param notAdd 不创建tab
     */
    public void setNotAdd(String notAdd) {
        this.notAdd = notAdd;
    }

    /**
     * 获取有效性
     *
     * @return valid - 有效性
     */
    public String getValid() {
        return valid;
    }

    /**
     * 设置有效性
     *
     * @param valid 有效性
     */
    public void setValid(String valid) {
        this.valid = valid;
    }

    /**
     * 获取路由位置
     *
     * @return place - 路由位置
     */
    public String getPlace() {
        return place;
    }

    /**
     * 设置路由位置
     *
     * @param place 路由位置
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * 获取权限类型
     *
     * @return auth - 权限类型
     */
    public String getAuth() {
        return auth;
    }

    /**
     * 设置权限类型
     *
     * @param auth 权限类型
     */
    public void setAuth(String auth) {
        this.auth = auth;
    }

    /**
     * 获取角色id
     *
     * @return customAuth - 角色id
     */
    public String getCustomAuth() {
        return customAuth;
    }

    /**
     * 设置角色id
     *
     * @param customAuth 角色id
     */
    public void setCustomAuth(String customAuth) {
        this.customAuth = customAuth;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
     * 获取创建日期
     *
     * @return create_time - 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建日期
     *
     * @param createTime 创建日期
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
     * 获取修改日期
     *
     * @return update_time - 修改日期
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改日期
     *
     * @param updateTime 修改日期
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
}