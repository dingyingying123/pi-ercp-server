package cn.com.personnel.ercp.auth.module;

import java.util.List;

public class UserRolesForm {
    private String       roleId;
    private List<String> users;

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

}
