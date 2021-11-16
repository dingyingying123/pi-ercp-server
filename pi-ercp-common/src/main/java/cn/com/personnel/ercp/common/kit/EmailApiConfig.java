/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.kit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 配置email相关配置信息
 * 
 * @author 34351
 *
 */
@Component
public class EmailApiConfig {
    @Autowired
    private Environment env;

    public String getMailServer() {
        return env.getProperty("email.mailServer");
    }

    public String getUserName() {
        return env.getProperty("email.username");
    }

    public String getPassword() {
        return env.getProperty("email.password");
    }

    public String getActivateUrl() {
        return env.getProperty("email.activateUrl");
    }

    public String getResetPwdUrl() {
        return env.getProperty("email.resetPwdUrl");
    }
    
    public String getOfferUrl() {
        return env.getProperty("email.offerUrl");
    }

}
