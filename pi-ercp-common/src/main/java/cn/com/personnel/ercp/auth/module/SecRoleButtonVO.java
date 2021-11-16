package cn.com.personnel.ercp.auth.module;

import cn.com.personnel.ercp.auth.persistence.entity.SecRoleButton;

import java.util.List;

public class SecRoleButtonVO {
    private List<SecRoleButton> list;
    private String roleId;
    private String routerId;

    public List<SecRoleButton> getList() {
        return list;
    }

    public void setList(List<SecRoleButton> list) {
        this.list = list;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }
}
