/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.module.JSTreeNode;
import cn.com.personnel.ercp.auth.persistence.entity.SecModule;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.base.SecRoleModuleVO;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;

/**
 * @author 34351
 *
 */
public interface ISecModuleService extends IService {
    public int addModule(SecModule secModule);

    public int updateModule(SecModule secModule);

    public int deleteModule(SecModule secModule);

    public List<SecModule> getAllModules(String appCode);

    public List<SecModule> getUserModule(String appCode, SecUser user);

    public List<JSTreeNode> getRoleModuleTree(String appCode, String roleId);

    SecModule getMenuById(String moduleId);

    List<String> getModuleIdList(String roleId);

    List<String> getPareModuleIdList(String roleId);

    List<SecModule> getUserModuleOneAll(String appCode);

    ReturnEntity getRoleMenuTree(String roleId,String appCode);

    ReturnEntity getAllMenuTree(String appCode);

    public List<SecModule> getAllModulesByRoles(SecUser user,String appCode);

    ReturnEntity copyModuleFromRole(String appCode, SecRoleModuleVO secRoleModuleVO, SecUser secUser);
}
