package cn.com.personnel.ercp.auth.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sec_user_login_log")
public class SecUserLoginLog {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 用户工号
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 登陆时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 创建时间
     */
    @Column(name = "cteate_time")
    private Date cteateTime;

    /**
     * ip
     */
    @Column(name = "user_ip")
    private String userIp;

    /**
     * 系统
     */
    @Column(name = "app_code")
    private String appCode;

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
     * 获取用户工号
     *
     * @return user_id - 用户工号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户工号
     *
     * @param userId 用户工号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取登陆时间
     *
     * @return login_time - 登陆时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登陆时间
     *
     * @param loginTime 登陆时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取创建时间
     *
     * @return cteate_time - 创建时间
     */
    public Date getCteateTime() {
        return cteateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cteateTime 创建时间
     */
    public void setCteateTime(Date cteateTime) {
        this.cteateTime = cteateTime;
    }

    /**
     * 获取ip
     *
     * @return user_ip - ip
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * 设置ip
     *
     * @param userIp ip
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    /**
     * 获取系统
     *
     * @return app_code - 系统
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * 设置系统
     *
     * @param appCode 系统
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }
}