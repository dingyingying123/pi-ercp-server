package cn.com.personnel.ercp.auth.persistence.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "portal_login_info")
public class PortalLoginInfo {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 用户oa号
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 登录时间
     */
    @Column(name = "login_date")
    private Date loginDate;

    /**
     * 登陆类型
     */
    @Column(name = "login_type")
    private String loginType;

    /**
     * 姓名
     */
    @Column(name = "username")
    private String username;
    /**
     * 用户ip
     */
    @Column(name = "user_ip")
    private String userIp;

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }



    /**
     * 获取
     *
     * @return  loginType
     */

    public String getLoginType() {
        return loginType;
    }

    /**
     * 设置
     *
     * @param loginType
     *
     */
    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

