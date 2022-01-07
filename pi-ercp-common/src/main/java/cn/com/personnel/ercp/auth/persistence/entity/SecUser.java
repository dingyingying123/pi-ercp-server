package cn.com.personnel.ercp.auth.persistence.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sec_user")
public class SecUser implements Serializable {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(generator = "JDBC")
    private String userId;

    /**
     * 密码
     */
    private String   pwd;


    /**
     * 密码初始
     */
    @Column(name = "pwd_lock")
    private String pwdLock;

    /**
     * 姓名
     */
    @Column(name = "user_name")
    private String   userName;

    /**
     * 性别
     */
    private String   male;

    /**
     * 手机号
     */
    @Column(name = "tel_no")
    private String telNo;

    /**
     * 邮箱
     */
    private String   email;

    /**
     * 是否管理员
     */
    private String   governor;

    /**
     * 是否锁定
     */
    @Column(name = "lock_flag")
    private String lockFlag;

    /**
     * 用户类型
     */
    @Column(name = "user_type")
    private String userType;

    /**
     * 最后登录IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 状态
     */
    private String   status;

    /**
     * 创建人
     */
    private String   creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人
     */
    private String   updator;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "login_time")
    private Date loginTime;

    private String ischange;

    private String area;

    private String authority;

    @Column(name = "pwd_times")
    private Integer pwdTimes;

    public SecUser() {
        super();
    }

    public SecUser(String userId) {
        super();
        this.userId = userId;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return pwd_lock
     */
    public String getPwdLock() {
        return pwdLock;
    }

    /**
     * @param pwdLock
     */
    public void setPwdLock(String pwdLock) {
        this.pwdLock = pwdLock;
    }

    /**
     * @return male
     */
    public String getMale() {
        return male;
    }

    /**
     * @param male
     */
    public void setMale(String male) {
        this.male = male;
    }

    /**
     * @return tel_no
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return governor
     */
    public String getGovernor() {
        return governor;
    }

    /**
     * @param governor
     */
    public void setGovernor(String governor) {
        this.governor = governor;
    }

    /**
     * @return lock_flag
     */
    public String getLockFlag() {
        return lockFlag;
    }

    /**
     * @param lockFlag
     */
    public void setLockFlag(String lockFlag) {
        this.lockFlag = lockFlag;
    }

    /**
     * @return user_type
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return login_ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * @param loginIp
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
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
     * @return login_time
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * @return ischange
     */
    public String getIschange() {
        return ischange;
    }

    /**
     * @param ischange
     */
    public void setIschange(String ischange) {
        this.ischange = ischange;
    }

    /**
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    public Integer getPwdTimes() {
        return pwdTimes;
    }

    public void setPwdTimes(Integer pwdTimes) {
        this.pwdTimes = pwdTimes;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}