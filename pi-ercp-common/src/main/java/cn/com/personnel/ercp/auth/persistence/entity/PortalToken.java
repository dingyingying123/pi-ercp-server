package cn.com.personnel.ercp.auth.persistence.entity;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "portal_token")
public class PortalToken {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 申请用户id
     */
    @Column(name = "userid")
    private String userId;

    /**
     * token
     */
    @Column(name = "token")
    private String token;

    /**
     * 过期时间
     */
    @Column(name = "exp_date")
    private Date expDate;

    /**
     * token类型(refresh_type,access_type)
     */
    @Column(name = "token_type")
    private String tokenType;

    /**
     * 设备编码
     */
    @Column(name = "device_code")
    private String deviceCode;

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
     * 获取token
     *
     * @return token - token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置token
     *
     * @param token token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取过期时间
     *
     * @return exp_date - 过期时间
     */
    public Date getExpDate() {
        return expDate;
    }

    /**
     * 设置过期时间
     *
     * @param expDate 过期时间
     */
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}


