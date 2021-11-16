package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.auth.persistence.entity.SecRoleModule;

public class SecRoleModuleVO extends SecRoleModule {
    private String fromRoleId;

    public String getFromRoleId() {
        return fromRoleId;
    }

    public void setFromRoleId(String fromRoleId) {
        this.fromRoleId = fromRoleId;
    }
}
