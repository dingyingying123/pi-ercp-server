/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.controller;

import cn.com.personnel.ercp.auth.impl.SecModuleService;
import cn.com.personnel.ercp.auth.module.MenuList;
import cn.com.personnel.ercp.auth.module.MenuTree;
import cn.com.personnel.ercp.auth.module.MenuTreeChildrenVue;
import cn.com.personnel.ercp.auth.module.MenuTreeVue;
import cn.com.personnel.ercp.auth.persistence.entity.PortalToken;
import cn.com.personnel.ercp.auth.persistence.entity.SecModule;
import cn.com.personnel.ercp.auth.persistence.entity.SecRouter;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.*;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.kit.CommonConfig;
import cn.com.personnel.ercp.common.kit.VerificationCodeKit;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.common.service.ILoginService;
import cn.com.personnel.ercp.common.service.IPortalTokenService;
import cn.com.personnel.ercp.framework.auth.SecurityContext;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.ercp.framework.exception.AuthenticationException;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 33925
 */
@Api(description = "登录接口")
@Controller
@RequestMapping("/")
public class LoginController extends PageController {

    @Autowired
    private ILoginService loginService;

    Base64 base64 = new Base64();

    @Autowired
    private ISecUserRoleService secUserRoleService;

    @Autowired
    private SecModuleService secModuleService;

    @Autowired
    private ISecRouterService secRouterService;
    @Autowired
    private CommonConfig commonConfig;
    @Autowired
    private ISecUserService secUserService;
    @Autowired
    private ICesRouterService cesRouterService;
    @Autowired
    private ISecUserLoginLogService secUserLoginLogService;
    @Autowired
    private IPortalTokenService portalTokenService;
    @Autowired
    private IPortalLoginInfoService portalLoginInfoService;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("home")
    public String home() {
        return "home";
    }

    @RequestMapping("showLogin")
    public String showLogin() {
        return "login";
    }

    /**
     * 邮箱激活-页面
     *
     * @param activateId
     * @return
     */
    @RequestMapping("activate/confirm")
    public ModelAndView activateConfirm(String activateId) {
        ModelAndView modelAndView = new ModelAndView("activate");
        modelAndView.addObject("activateId", new String(base64.decode(activateId), StandardCharsets.UTF_8));
        return modelAndView;
    }

    @RequestMapping("showPopLogin")
    public String showPopLogin() {
        return "pop_login";
    }

    @RequestMapping("showForgetPwd")
    public ModelAndView showForgetPwd() {
        ModelAndView modelAndView = new ModelAndView("forget_pwd");
        modelAndView.addObject("flag", "");
        modelAndView.addObject("userId", "");
        modelAndView.addObject("overtime", "");
        return modelAndView;
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
    @ApiOperation(value = "登录并获取菜单信息", notes = "登录并获取菜单信息",httpMethod = "POST")
    @ApiImplicitParam()
    @RequestMapping("login")
    @ResponseBody
    public ReturnEntity login(@RequestBody SecUserVo loginInfo, Map<String, Object> requestMap, HttpSession session) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        Map<String, Object> userMap = new HashMap<String, Object>();
        try {
            if (loginInfo.getCode() != null && loginInfo.getCode() != "") {
                // 校验验证码
                requestMap.put("inputStr", loginInfo.getCode());
                boolean b = checkVerify(requestMap, session);
                if (!b) {
//                    userMap.put("faild", true);
//                    userMap.put("message", "验证码有误，请重新输入！");
                    returnEntity.setStatus(CommonConstants.ERROR_CODE);
                    returnEntity.setMessage("验证码有误，请重新输入！");
                    return returnEntity;
                }
            }

            loginInfo.setLoginIp(getRemortIP(request));
            // loginService.verifyPwd(loginInfo.getPwd());
            SecUser secUser = loginService.login(loginInfo);
            UsernamePasswordToken token = new UsernamePasswordToken(secUser.getUserId(), secUser.getPwd());
            // 获取当前的Subject
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            if (subject.isAuthenticated()) {
                setLoginUser(secUser);
            }
            String sessionId = subject.getSession().getId().toString();
//            userMap.put("success", true);
//            userMap.put("message", "登陆成功");
            userMap.put("user", secUser);
            userMap.put("menu", getMenuTreeVue());
            userMap.put("sessionId", sessionId);
            List<String> userRoles = new ArrayList<>();
            userRoles = secUserRoleService.getUserRoleList(secUser.getUserId(), ApplicationConfig.APP_CODE);
            userMap.put("roleIds", userRoles);
            session.setAttribute("userId:" + secUser.getUserId(), sessionId);
            //根据登录用户获取菜单
            String othername = java.util.Base64.getEncoder().encodeToString(loginInfo.getPwd().getBytes());
            Cookie cookie = new Cookie("othername", othername);
            returnEntity.setData(userMap);
        } catch (AuthenticationException ex) {
            session.setAttribute("SHOWVERIFYCODE", true);
//            userMap.put("success", false);
//            userMap.put("message", ex.getMessage());
            returnEntity.setStatus(CommonConstants.ERROR_CODE);
            returnEntity.setMessage(ex.getMessage());
        }
        return returnEntity;
    }

    /**
     * 移动端登录
     *
     * @param loginInfo
     * @return
     * @throws ParseException
     */
    @RequestMapping("mobileLogin")
    @ResponseBody
    public ReturnEntity mobileLogin(SecUserVo loginInfo) throws ParseException, AuthenticationException {
        loginInfo.setLoginIp(getRemortIP(request));
        Map<String, Object> userMap = new HashMap<String, Object>();
        try {
            String deviceCode = commonConfig.getDeviceCode();
            response.setCharacterEncoding("UTF-8");
            SecUser secUser = loginService.login(loginInfo);
            UsernamePasswordToken token = new UsernamePasswordToken(secUser.getUserId(), secUser.getPwd());
            // 获取当前的Subject
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            if (subject.isAuthenticated()) {
                setLoginUser(secUser);
            }
            List<String> userRoles = new ArrayList<>();
            userRoles = secUserRoleService.getUserRoleList(secUser.getUserId(), ApplicationConfig.APP_CODE);
            userMap.put("user", secUser);
            userMap.put("roleIds", userRoles);
            // 生成token并返回前端
            Map<String, Object> refreshTokenMap = portalTokenService.sign(secUser.getUserId(), secUser.getUserName(), deviceCode);
            Map<String, Object> accessTokenMap = portalTokenService.accessSign(String.valueOf(refreshTokenMap.get("refresh_token")), deviceCode);
            insertOrUpdateToken(secUser.getUserId(), String.valueOf(refreshTokenMap.get("refresh_token")), deviceCode, "refresh_token", sdf.parse(String.valueOf(refreshTokenMap.get("refresh_token_exipre_time"))));
            insertOrUpdateToken(secUser.getUserId(), String.valueOf(accessTokenMap.get("access_token")), deviceCode, "access_token", sdf.parse(String.valueOf(accessTokenMap.get("access_token_exipre_time"))));
            // 保存登录信息
            portalLoginInfoService.saveLoginInfo(secUser.getUserId(), secUser.getUserName(), "mobile",getRemortIP(request));
            userMap.putAll(refreshTokenMap);
            userMap.putAll(accessTokenMap);
            return ReturnEntity.ok(userMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnEntity.errorMsg("登录失败！");
        }
    }

    /**
     * 移动端注册access_token
     *
     * @param userid
     * @param deviceCode
     * @return
     * @throws ParseException
     */
    @RequestMapping("accessSign")
    @ResponseBody
    public ReturnEntity accessSign(String userid, String deviceCode) throws ParseException {
        try {
            String token = request.getHeader("token");
//          String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIzNjQ2NyIsImV4cCI6MTU1MzA2MTQ1OCwidXNlcm5hbWUiOiLlkLTpnIfpkasifQ.p5QzHYBf9UkpF8pswLjqhJPDZ2IKYvujXXrQSlQsbdQ";
            response.setCharacterEncoding("UTF-8");
            // 检查refreshtoken是否合法
            Map<String, Object> check = portalTokenService.checkToken(token, "refresh_token", deviceCode);
            if (check == null || !"success".equals(check.get("message"))) {
                return ReturnEntity.ok(String.valueOf(check.get("message")));
            }
            // 刷新access_token
            Map<String, Object> accessSign = portalTokenService.accessSign(token, deviceCode);
            Map<String, String> userMap = portalTokenService.parseSign(token);
            PortalToken accessToken = new PortalToken();
            accessToken.setUserId(userMap.get("uid"));
            accessToken.setToken(String.valueOf(accessSign.get("access_token")));
            accessToken.setDeviceCode(deviceCode);
            accessToken.setTokenType("access_token");
            accessToken.setExpDate(sdf.parse(String.valueOf(accessSign.get("access_token_exipre_time"))));
            insertOrUpdateToken(userMap.get("uid"), String.valueOf(accessSign.get("access_token")), deviceCode, "access_token", sdf.parse(String.valueOf(accessSign.get("access_token_exipre_time"))));
            return ReturnEntity.ok(accessSign);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            Map<String,String> map=new HashMap<String,String>();
            map.put("errorMsg",e.getMessage());
            return ReturnEntity.errorMsg("由于你长时间未登陆，导致token失效。请重新登陆");
        }
    }


    /**
     * 登录
     *
     * @param loginInfo
     * @return
     * @throws IOException
     */
    @ApiOperation(value = "登录并获取菜单信息", notes = "登录并获取菜单信息")
    @RequestMapping("login_web")
    @ResponseBody
    public ReturnEntity login_web(@RequestBody SecUserVo loginInfo, Map<String, Object> requestMap,
                                  HttpSession session) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
        Map<String, Object> userMap = new HashMap<String, Object>();
        try {
            if (loginInfo.getCode() != null && loginInfo.getCode() != "") {
                // 校验验证码
                requestMap.put("inputStr", loginInfo.getCode());
                boolean b = checkVerify(requestMap, session);
                if (!b) {
                    returnEntity.setStatus(CommonConstants.ERROR_CODE);
                    returnEntity.setMessage("验证码有误，请重新输入！");
                    userMap.put("faild", true);
                    userMap.put("message", "验证码有误，请重新输入！");
                }
            }

            loginInfo.setLoginIp(getRemortIP(request));
            // loginService.verifyPwd(loginInfo.getPwd());
            SecUser secUser = loginService.login(loginInfo);
            UsernamePasswordToken token = new UsernamePasswordToken(secUser.getUserId(), secUser.getPwd());
            // 获取当前的Subject
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            if (subject.isAuthenticated()) {
                setLoginUser(secUser);
            }
            String sessionId = subject.getSession().getId().toString();
            //保存登陆信息
            String appCode = ApplicationConfig.APP_CODE;
            String ipAddress = getRemortIP(request);
            secUserLoginLogService.saveUserLoginLog(secUser,appCode,ipAddress);

            userMap.put("success", true);
            userMap.put("message", "登陆成功");
            userMap.put("sessionId", sessionId);
            //userMap.put("modules",array.toString());
            userMap.put("user", secUser);
            userMap.put("menu", getMenuTreeVue());
            userMap.put("sessionId", sessionId);
            List<String> userRoles = new ArrayList<>();
            userRoles = secUserRoleService.getUserRoleList(secUser.getUserId(), ApplicationConfig.APP_CODE);
            userMap.put("roleIds", userRoles);
            session.setAttribute("userId:" + secUser.getUserId(), sessionId);
            //根据登录用户获取菜单
            String othername = java.util.Base64.getEncoder().encodeToString(loginInfo.getPwd().getBytes());
            Cookie cookie = new Cookie("othername", othername);
        } catch (AuthenticationException ex) {
            returnEntity.setStatus(CommonConstants.ERROR_CODE);
            returnEntity.setMessage(CommonConstants.ERROR_MESSAGE);
            session.setAttribute("SHOWVERIFYCODE", true);
            userMap.put("success", false);
            userMap.put("message", ex.getMessage());

        }

        returnEntity.setData(userMap);
        return returnEntity;
    }
    /**
     * 登录
     *
     * @param
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "autoLogin_web")
    @ResponseBody
    public ReturnEntity autoLogin_web() {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE,CommonConstants.SUCCESS_MESSAGE,null);
        String userId = request.getParameter("userId");
        String key = request.getParameter("sign") == null ? "" : request.getParameter("sign");
        String genKey = DigestUtils.md5DigestAsHex((userId + "@"+commonConfig.getEisPassword()).getBytes());
//        if(!genKey.equals(key)){
//            return "/common/user_not_exit";
//        }
/*        if(!md5.equals(key)){
            return "/common/user_not_exit";
        }*/
        Map<String, Object> userMap = new HashMap<String, Object>();
        SecUser secUser = secUserService.selectByUserId(userId);

        UsernamePasswordToken token = new UsernamePasswordToken(secUser.getUserId(), secUser.getPwd());
        try {
            secUser = loginService.autoLogin(secUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 获取当前的Subject
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        if (subject.isAuthenticated()) {
            setLoginUser(secUser);
        }

        String sessionId = subject.getSession().getId().toString();
//        SecurityUtils.getSubject().getSession().setTimeout(1800000L);
//        userMap.put("user", secUser);
        userMap.put("sessionId", sessionId);
        List<String> userRoles = new ArrayList<>();
        userRoles = secUserRoleService.getUserRoleList(secUser.getUserId(), ApplicationConfig.APP_CODE);
        userMap.put("roleIds", userRoles);
        //根据登录用户获取菜单
        returnEntity.setData(userMap);
        return returnEntity;
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
        userRule.put("menu", createMenuTree());
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
        userRule.put("menu", getMenuTreeVue());
        return userRule;
    }

    /**
     * 获取用户信息-前端
     *
     * @return
     */
    @RequestMapping("get_user_web")
    @ResponseBody
    public ReturnEntity getUserWeb() {
        String routerTo = request.getParameter("routerTo");
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
        Map userRule = new HashMap();
        SecUser secUser = (SecUser) getLoginUser();
        if(secUser == null){
            return ReturnEntity.ok("NOT_LOGIN_CODE");
        }
        userRule.put("user", secUser);
        userRule.put("menu", getMenuTreeVue());
        String appStr= Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
        if(StringUtils.isNotBlank(routerTo) && secUser!=null) {
            List<String> buttons = cesRouterService.getUserRoleButtons(secUser, routerTo,appStr);
            userRule.put("btnsAuth", buttons);
        }
//        userRule.put("menu", createMenuTree());
        returnEntity.setData(userRule);
        return returnEntity;
    }

    //获取菜单列表
    @ApiOperation(value = "获取菜单列表", notes = "获取菜单列表")
    @RequestMapping(value = "getMenuTreeList")
    @ResponseBody
    public  ReturnEntity getMenuTreeList() {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
        String appCode = ApplicationConfig.APP_CODE;
        SecUser user = (SecUser) getLoginUser();
//        List<SecModule> modules = secModuleService.getUserModule(appCode, user);
        List<SecModule> modules = secModuleService.getUserModuleOneAll(appCode);
        //找到所有的1级菜单
        List<MenuList> mList = new ArrayList<>();
        for (SecModule module : modules) {
            if (null != module.getParentId() && module.getParentId().equals("0")) {
                MenuList node = new MenuList();
                node.setId(module.getModuleId());
                node.setLabel(module.getModuleName());
                mList.add(node);
            }
        }
        //为一级菜单设置子菜单准备递归
        for (MenuList menu : mList) {
            //获取父菜单下所有子菜单调用getChildList
            List<MenuList> childList = getChildList(menu.getId(), modules);
            menu.setChildren(childList);
        }
        returnEntity.setData(mList);
        return returnEntity;
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

    /**
     * 修改密码
     *
     * @return
     */
    @RequestMapping("chaPwd")
    @ResponseBody
    public Map<String, Object> changePwd(String oldpwd, String newpwd) {
        Map<String, Object> map = new HashMap<String, Object>();
        SecUser secUser = (SecUser) getLoginUser();
        try {
            loginService.changepwd(secUser, oldpwd, newpwd);
            getSession().removeAttribute(SecurityContext.Authentication);
            Subject subject = SecurityUtils.getSubject();
            subject.logout();
            map.put("success", "true");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("message", e.getMessage());
            map.put("success", "false");
        }
        return map;
    }

    /**
     * 修改密码
     *
     * @return
     */
    @RequestMapping("getName")
    @ResponseBody
    public String getName() {
        String result = "";
        Cookie[] cookies = request.getCookies();// 这样便可以获取一个cookie数组
        if (null == cookies) {
            System.out.println("没有cookie=========");
        } else {
            for (Cookie cookie : cookies) {
                if ("othername".equals(cookie.getName())) {
                    // System.out.println("name:"+cookie.getName()+",value:"+
                    // cookie.getValue());
                    result = cookie.getValue();
                }
            }
        }
        JSONObject jo = new JSONObject();
        jo.put("result", result);
        return jo.toString();
    }



    /**
     * 生成验证码
     */
    @RequestMapping(value = "getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("image/jpeg");// 设置相应类型,告诉浏览器输出的内容为图片
            response.setHeader("Pragma", "No-cache");// 设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            VerificationCodeKit.getRandcode(request, response);// 输出验证码图片方法
        } catch (Exception e) {
            logger.error("获取验证码失败", e);
        }
    }

    /**
     * 校验验证码
     */
    @RequestMapping(value = "/checkVerify", method = RequestMethod.POST, headers = "Accept=application/json")
    public boolean checkVerify(@RequestBody Map<String, Object> requestMap, HttpSession session) {
        try {
            // 从session中获取随机数
            String inputStr = requestMap.get("inputStr").toString();
            String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
            boolean isShowCode = session.getAttribute("SHOWVERIFYCODE") == null;
            if (isShowCode) {
                return true;
            }
            if (random == null) {
                return false;
            }
            return random.equalsIgnoreCase(inputStr);
        } catch (Exception e) {
            logger.error("验证码校验失败", e);
            return false;
        }
    }

    private List<MenuTree> createMenuTree() {
        SecUser user = (SecUser) getLoginUser();
        List<SecModule> modules = secModuleService.getUserModule(ApplicationConfig.APP_CODE, user);
        List<MenuTree> nodes = new ArrayList<MenuTree>();
        for (SecModule module : modules) {
            if (!"0".equals(module.getParentId())) {
                continue;
            }
            MenuTree node = new MenuTree();
            node.setMenuId("n_" + module.getModuleId());
            node.setMenuName(module.getModuleName());
            node.setMenuIcon(module.getIcon());

            List<MenuTree> subMenu = new ArrayList<MenuTree>();
            for (SecModule subModule : modules) {
                if (!module.getModuleId().equals(subModule.getParentId())) {
                    continue;
                }
                MenuTree subNode = new MenuTree();
                subNode.setMenuName(subModule.getModuleName());
                subNode.setUrl(subModule.getModuleUrl());
                subMenu.add(subNode);
            }
            if (subMenu.size() > 0) {
                node.setHasSubMenu(true);
                node.setSubMenu(subMenu);
            }
            nodes.add(node);
        }
        return nodes;
    }

    //层级获取菜单
    public List<MenuTreeVue> getMenuTreeVue() {
        String appCode = ApplicationConfig.APP_CODE;
        SecRouter cesRouter = new SecRouter();
        cesRouter.setAppcod(appCode);
        SecUser user = (SecUser) getLoginUser();
        List<SecModule> modules = secModuleService.getUserModule(appCode, user);
        List<SecRouter> routers = secRouterService.getRouters(appCode,"1");
        //找到所有的1级菜单
        List<MenuTreeVue> mList = new ArrayList<>();
        for (SecModule module : modules) {
            if (null != module.getParentId() && module.getParentId().equals("0")) {
                MenuTreeVue node = new MenuTreeVue();
                node.setMenuId(module.getModuleId());
                node.setComponent(module.getVueComponent());
                node.setPath(module.getVuePath());
                node.setName(module.getVueTitle());
                Map<String, Object> metaMap = new HashMap<>();
                metaMap.put("title", module.getVueTitle());
                metaMap.put("icon", module.getVueIcon());
                metaMap.put("curId",module.getModuleId());
                node.setMeta(metaMap);
                mList.add(node);
            }
        }
        //为一级菜单设置子菜单准备递归
        for (MenuTreeVue menu : mList) {
            //获取父菜单下所有子菜单调用getChildList
            List<MenuTreeChildrenVue> childList = getChildList(String.valueOf(menu.getMenuId()), modules, routers);
            menu.setChildren(childList);
        }
        return mList;
    }

    public List<MenuList> getChildList(String id, List<SecModule> menuList) {
        //构建子菜单
        List<MenuList> childList = new ArrayList<>();
        //遍历传入的list
        for (SecModule menu : menuList) {
            //所有菜单的父id与传入的根节点id比较，若相等则为该级菜单的子菜单
            if (String.valueOf(menu.getParentId()).equals(id)) {
                Map<String, Object> map = new HashMap<>();
                MenuList node = new MenuList();
                node.setId(menu.getModuleId());
                node.setLabel(menu.getModuleName());
                childList.add(node);
            }
        }
        //添加路由表信息
        //递归
        for (MenuList m : childList) {
            m.setChildren(getChildList(m.getId(), menuList));
        }
        if (childList.size() == 0) {
            return null;
        }
        return childList;
    }

    public List<MenuTreeChildrenVue> getChildList(String id, List<SecModule> menuList, List<SecRouter> routers) {
        //构建子菜单
        List<MenuTreeChildrenVue> childList = new ArrayList<>();
        //遍历传入的list
        for (SecModule menu : menuList) {
            //所有菜单的父id与传入的根节点id比较，若相等则为该级菜单的子菜单
            if (String.valueOf(menu.getParentId()).equals(id)) {
                Map<String, Object> map = new HashMap<>();
                MenuTreeChildrenVue node = new MenuTreeChildrenVue();
                node.setMenuId(menu.getModuleId());
                node.setComponent(menu.getVueComponent());
                node.setPath(menu.getVuePath());
                node.setName(menu.getVueTitle());
                node.setHidden(menu.getVueHidden()==null?false:menu.getVueHidden().equals("true"));
                Map<String, Object> meta = new HashMap<>();
                meta.put("title", menu.getVueTitle());
                meta.put("icon", menu.getVueIcon());
                meta.put("noCache", menu.getVueNocach()==null?false:menu.getVueNocach().equals("true"));
                meta.put("notAdd", menu.getVueNotAdd()==null?false:menu.getVueNotAdd().equals("true"));
                meta.put("curId",menu.getModuleId());
                node.setMeta(meta);
                childList.add(node);
            }
        }
        //添加路由表信息
        for (SecRouter router : routers) {
            //所有菜单的父id与传入的根节点id比较，若相等则为该级菜单的子菜单
            if (String.valueOf(router.getPlace()).equals(id)) {
                MenuTreeChildrenVue node = new MenuTreeChildrenVue();
                node.setComponent(router.getComponent());
                node.setPath(router.getPath());
                node.setName(router.getName());
                node.setHidden(true);
                Map<String, Object> meta = new HashMap<>();
                meta.put("title", router.getTitle());
                meta.put("icon", "");
                meta.put("noCache", router.getNoCache().equals("true"));
                meta.put("notAdd", router.getNotAdd().equals("true"));
                node.setMeta(meta);
                childList.add(node);
            }
        }
        //递归
        for (MenuTreeChildrenVue m : childList) {
            m.setChildren(getChildList(String.valueOf(m.getMenuId()), menuList, routers));
        }
        if (childList.size() == 0) {
            return null;
        }
        return childList;
    }

    private void insertOrUpdateToken(String uid, String tokenStr, String deviceCode, String tokenType, Date exipreTime) {
        PortalToken token = new PortalToken();
        token.setUserId(uid);
        token.setToken(tokenStr);
        token.setDeviceCode(deviceCode);
        token.setTokenType(tokenType);
        token.setExpDate(exipreTime);
        PortalToken existToken = portalTokenService.getTokenByUserIDAndType(uid, tokenType);
        if (existToken != null) {
            token.setId(existToken.getId());
            portalTokenService.updateToken(token);
        } else {
            token.setId(UUIDKit.getUUID());
            portalTokenService.saveToken(token);
        }
    }

}

class SecUserVo extends SecUser {
    private String code;    // 验证码

    private Boolean ischange;// 登录时是否修改密码

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}