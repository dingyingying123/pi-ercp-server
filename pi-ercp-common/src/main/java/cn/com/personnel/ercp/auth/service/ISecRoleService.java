/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecRole;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author 34351
 *
 */
public interface ISecRoleService extends IService {
  
    public List<SecRole> queryRole(SecRole secRole, PagenationQueryParameter pageParam);

    public List<SecRole> queryUserRoleByUid(String appCode, String uid);

    public SecRole queryUserRoleBySystemCode(String systemCode);

    public SecRole addRole(SecRole secRole);

    public SecRole updateRole(SecRole secRole);

    public int deleteRole(SecRole secRole);

    public List<SecRole> findAllRole(String appCode, PagenationQueryParameter pageParam) ;

    public String queryAppcod(String userId);

    public SecRole queryUserRoleByRoleName(String roleName);

    public List<Map>  findAllRoles(String appCode);
    
}
