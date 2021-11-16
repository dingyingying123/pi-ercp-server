/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.shiro;

import cn.com.personnel.springboot.framework.kit.JsonKit;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.apache.shiro.web.servlet.ShiroHttpServletResponse;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 33925
 *
 */
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        String acceptType = ((ShiroHttpServletRequest)request).getHeader("accept");
        if(acceptType!=null && acceptType.indexOf("application/json") > -1){
            Map<String,String> massage = new HashMap<String,String> ();
            massage.put("NOT_LOGIN_CODE", "true");
            String msgStr = JsonKit.toJson(massage);
            try {  
                ((ShiroHttpServletResponse)response).setHeader("Content-type", "text/html;charset=UTF-8");
                response.setCharacterEncoding("UTF-8");  
                PrintWriter writer = response.getWriter(); 
                writer.write(msgStr);  
                writer.flush();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
            return false;
        }
        return super.onAccessDenied(request, response);
    }
}
