package cn.com.personnel.ercp.auth.module;

import cn.com.personnel.ercp.auth.persistence.entity.PortalLoginInfo;

public class LoginInfoBean extends PortalLoginInfo {

    /**
     * 统计登录次数
     */
    private Integer countNum;

    private String userName;

    public Integer getCountNum() {
        return countNum;
    }

    public void setCountNum(Integer countNum) {
        this.countNum = countNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
