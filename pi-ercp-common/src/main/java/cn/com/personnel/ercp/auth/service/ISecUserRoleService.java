/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.module.SecUserRoleModule;
import cn.com.personnel.ercp.auth.module.UserRolesForm;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.entity.SecUserRole;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;

/**
 * @author 34351
 *
 */
public interface ISecUserRoleService extends IService {

    List<SecUserRoleModule> queryUserRole(SecUserRoleModule secUserRoleModule,
                                          PagenationQueryParameter pageParam);

    List<SecUserRoleModule> queryUserRoleNoPage(SecUserRoleModule secUserRoleModule);

    List<SecUserRoleModule> queryUserRoleNoPageByRoleName(SecUserRoleModule secUserRoleModule, PagenationQueryParameter pagenationQueryParameter);


    SecUserRoleModule addRole(SecUserRole secUserRole);

    void addUserRoles(UserRolesForm userRolesForms, SecUser user);

    int deleteRole(SecUserRole secUserRole);


    /**
     * 删除用户角色信息
     * 
     * @param userRole
     * @return
     */
    int deleteRoleByCondition(SecUserRole userRole);

    List<String> getUserRoleList(String userId, String appCode);

    public List<SecUserRole> getUserRoles(String userId, String appCode);

    /**
     * 描述: 根据用户ID查询用户角色
     *
     * @param userId
     * @author: cuilibo
     * @create: 2020/9/8 下午1:34
     * @return: java.util.List<cn.com.personnel.ercp.auth.persistence.entity.SecUserRole>
     */
    List<SecUserRole> getByUserId(String userId);
}
