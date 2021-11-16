/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.kit;

import cn.com.personnel.ercp.framework.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 配置PO相关配置信息
 * @author 33925
 *
 */
@Component
public class PoApiConfig {
    @Autowired  
    private Environment env;  
    
    /**
     * 根据配置，获取终端配置
     * @param url
     * @return
     * @throws MalformedURLException 
     */
    public String getPoEndPointAddress(String url){
        String serverUrl = env.getProperty("po.serverUrl");
        URL urls;
        try {
            urls = new URL(url);
        } catch (MalformedURLException e) {
            throw new BusinessException(e);
        }  
        return serverUrl + urls.getFile();
    }


    public String getUserName() {
        return env.getProperty("po.userName");
    }


    public String getPassword() {
        return env.getProperty("po.password");
    }
    
    public String getEnvironmentCode() {
        return env.getProperty("po.environment");
    }
    
}
