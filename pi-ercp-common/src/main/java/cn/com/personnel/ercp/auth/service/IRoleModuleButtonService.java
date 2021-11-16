/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.persistence.entity.CesRoleModuleButton;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;

/**
 * @author liujf
 *
 */
public interface IRoleModuleButtonService extends IService {


    void saveRoleMouuleButton(String appCode, String roleId, String meunId, List<String> buttons, SecUser user);

    List<CesRoleModuleButton> queryButtons(String roleId, String meunId, String systemCode);
}
