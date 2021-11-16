/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecRoleModule;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;

/**
 * @author 33925
 *
 */
public interface ISecRoleModuleService  extends IService {
    
    public void saveRoleModuleRecords(String appcode, List<SecRoleModule> records, String roleId, SecUser user);

    public void roleSave(String appCode, List<String> moduleIds, String roleId, SecUser user);
}
