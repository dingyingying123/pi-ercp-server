/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.common.controller.SecUser;
import cn.com.personnel.ercp.framework.exception.AuthenticationException;
import cn.com.personnel.springboot.framework.core.service.IService;

/**
 * @author 33925
 *
 */
public interface ILoginService extends IService { 
    
    public SecUser login(SecUser user) throws AuthenticationException;
    
}
