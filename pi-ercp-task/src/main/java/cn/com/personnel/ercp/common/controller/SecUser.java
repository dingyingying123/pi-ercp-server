package cn.com.personnel.ercp.common.controller;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sec_user")
public class SecUser {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
	protected String userId;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 密码初始
     */
    @Column(name = "pwd_lock")
    private String pwdLock;

    /**
     * 姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 性别
     */
    private String male;

    /**
     * 手机号
     */
    @Column(name = "tel_no")
    private String telNo;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 是否管理员
     */
    private String governor;

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
    private String status;

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

    @Column(name = "login_time")
    private Date loginTime;
    
    public SecUser() {
		super();
	}

	public SecUser(String userId) {
		super();
		this.userId = userId;
	}

	/**
     * 激活状态
     */
    private String activeType;

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取密码
     *
     * @return pwd - 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码
     *
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取密码初始
     *
     * @return pwd_lock - 密码初始
     */
    public String getPwdLock() {
        return pwdLock;
    }

    /**
     * 设置密码初始
     *
     * @param pwdLock 密码初始
     */
    public void setPwdLock(String pwdLock) {
        this.pwdLock = pwdLock;
    }

    /**
     * 获取姓名
     *
     * @return user_name - 姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置姓名
     *
     * @param userName 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取性别
     *
     * @return male - 性别
     */
    public String getMale() {
        return male;
    }

    /**
     * 设置性别
     *
     * @param male 性别
     */
    public void setMale(String male) {
        this.male = male;
    }

    /**
     * 获取手机号
     *
     * @return tel_no - 手机号
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * 设置手机号
     *
     * @param telNo 手机号
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取是否管理员
     *
     * @return governor - 是否管理员
     */
    public String getGovernor() {
        return governor;
    }

    /**
     * 设置是否管理员
     *
     * @param governor 是否管理员
     */
    public void setGovernor(String governor) {
        this.governor = governor;
    }

    /**
     * 获取是否锁定
     *
     * @return lock_flag - 是否锁定
     */
    public String getLockFlag() {
        return lockFlag;
    }

    /**
     * 设置是否锁定
     *
     * @param lockFlag 是否锁定
     */
    public void setLockFlag(String lockFlag) {
        this.lockFlag = lockFlag;
    }

    /**
     * 获取用户类型
     *
     * @return user_type - 用户类型
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型
     *
     * @param userType 用户类型
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 获取最后登录IP
     *
     * @return login_ip - 最后登录IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置最后登录IP
     *
     * @param loginIp 最后登录IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
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

	public String getActiveType() {
		return activeType;
	}

	public void setActiveType(String activeType) {
		this.activeType = activeType;
	}
    
    
}