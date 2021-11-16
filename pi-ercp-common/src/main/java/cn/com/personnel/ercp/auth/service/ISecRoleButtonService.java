package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecRoleButton;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;
import java.util.Map;

public interface ISecRoleButtonService extends IService {
    void insertRoleButton(SecRoleButton secRoleButton, String appCode);
    void deleteRoleButton(SecRoleButton secRoleButton);
    void updateRoleButton(SecRoleButton secRoleButton);
    Map<String,Object> getRoleButtonList(SecRoleButton secRoleButton, String appCode);
    List<SecRoleButton> save(List<SecRoleButton> list, String appCode);
}
