/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.common.controller.SecUser;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.ercp.framework.exception.AuthenticationException;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @author 33925
 *
 */
public abstract class BaseLoginService extends BaseService implements ILoginService {


    private Logger logger = LoggerFactory.getLogger(LoginService.class);
    
    @Autowired
    private GwOpenApiService gwOpenApiService;
    
//    @Value("${app.manager}")
//    private String mananger = "";
    /**
     * 
     * @param secUser
     * @return
     * @throws AuthenticationException
     */
    protected SecUser innerLogin(SecUser secUser,boolean needCheck) throws AuthenticationException{
        if(StringUtils.isEmpty(secUser.getUserId())){
            throw new AuthenticationException("1001","用户信息不存在！");
        }
//
//        if(!secUser.getUserId().equals(mananger)){
//            throw new AuthenticationException("1001","用户信息不存在！");
//        }
         
        if(needCheck) {
            if (ApplicationConfig.APP_MODULE.equals(ApplicationConfig.DEV_MODULE)) {

            } else {
                try {
                    // 新的认证
                    Map<String, Object> authByRest = gwOpenApiService.authenticate(secUser.getUserId(), secUser.getPwd(),secUser.getLoginIp());
                    if (!"000".equals(authByRest.get("code"))) {
                        throw new AuthenticationException("1002", "用户密码不正确！");
                    }

                } catch (Exception e) {
                    logger.error("idm 认证错误 " + e.getMessage());
                    throw new AuthenticationException("1002", "用户密码不正确！");
                }
            }
        }
        return secUser;
    }
    
    protected SecUser beforeLogin(SecUser result ) {
        return result;
    }
    
    protected SecUser afterLogin(SecUser result ) {
        return result;
    }
    
    
    /**
     * @param secUser
     * @return
     */
    public SecUser login(SecUser secUser) throws AuthenticationException {
    	beforeLogin(secUser);
        SecUser result =  innerLogin(secUser,true); 
        return afterLogin(result);
    }
    
    /**
     * 自动登录
     */
     public SecUser autoLogin(SecUser secUser) throws AuthenticationException{
         SecUser result =  innerLogin(secUser,false); 
         return afterLogin(result);
     }
     

}
