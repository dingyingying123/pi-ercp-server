/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.controller;

import cn.com.personnel.ercp.common.service.ILoginService;
import cn.com.personnel.ercp.framework.auth.SecurityContext;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 33925
 *
 */
@Controller
@RequestMapping("/")
public class LoginController extends PageController {

	@Autowired
	private ILoginService loginService;
	
    @RequestMapping("home")
    public String home() {
        return "home";
    }
    
    @RequestMapping("showLogin")
    public String showLogin() {
    	return "login";
    }


    @RequestMapping("showPopLogin")
    public String showPopLogin() {
        return "pop_login";
    }

    private String getRemortIP(HttpServletRequest request) {
        if (request.getHeader("x-forwarded-for") == null) {
            return request.getRemoteAddr();
        }
        return request.getHeader("x-forwarded-for");
    }

    /**
     * 登录
     * 
     * @param loginInfo
     * @return
     * @throws IOException
     */
    @RequestMapping("login")
    @ResponseBody
    public Map login(@RequestBody SecUser loginInfo) {
        Map userMap = new HashMap();
        try {
            loginInfo.setLoginIp(getRemortIP(request));
            SecUser secUser = loginService.login(loginInfo);
            UsernamePasswordToken token = new UsernamePasswordToken(secUser.getUserId(), secUser.getPwd());
            // 获取当前的Subject
            Subject subject = SecurityUtils.getSubject();
            secUser.setUserName(secUser.getUserId());
            secUser.setPwd("");
            secUser.setUserType("内部");
            subject.login(token);
            if (subject.isAuthenticated()) {
                setLoginUser(secUser);
            }
            userMap.put("success", true);
            userMap.put("message", "登陆成功");

        } catch (Exception ex) {
            userMap.put("success", false);
            userMap.put("message", ex.getMessage());
        }
        return userMap;
    }

    /**
     * 获取用户菜单
     * 
     * @return
     */
    @RequestMapping("user_rule")
    @ResponseBody
    public Map getUserRule() {
        Map userRule = new HashMap();
        SecUser secUser = (SecUser) getLoginUser();
        userRule.put("user", secUser);
        userRule.put("menu", new ArrayList());
        return userRule;
    }
    
    /**
     * 获取用户判断用户是否在线
     * 
     * @return
     */
    @RequestMapping("get_user")
    @ResponseBody
    public Map getUser() {
        Map userRule = new HashMap();
        SecUser secUser = (SecUser) getLoginUser();
        userRule.put("user", secUser);
        return userRule;
    }

    /**
     * 退出
     * 
     * @return
     */
    @RequestMapping("loginOut")
    public String outLogin() {
        getSession().removeAttribute(SecurityContext.Authentication);
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/";
    }

}
