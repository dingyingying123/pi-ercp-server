package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.auth.persistence.entity.SecUserRole;

public class SecUserRoleVO extends SecUserRole {
    private String userName;
    private String roleName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
