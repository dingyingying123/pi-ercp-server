package cn.com.personnel.ercp.common.filter;

import cn.com.personnel.ercp.auth.impl.SecUserService;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.kit.JwtUtil;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.common.service.IPortalTokenService;
import cn.com.personnel.ercp.framework.auth.SecurityContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import eu.bitwalker.useragentutils.DeviceType;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
public class AuthorInterceptor implements HandlerInterceptor {
    private Logger logger  = LoggerFactory.getLogger(AuthorInterceptor.class);
    @Autowired
    SecUserService secUserService;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("============AuthorFilter执行=============");

        if(!checkHeaderAuth(request, response)){
            response.setStatus(401);
            response.setHeader("Cache-Control", "no-store");
            response.setDateHeader("Expires", 0);
            response.setHeader("WWW-authenticate", "Basic Realm=\"auth\"");
            ReturnEntity returnEntity = new ReturnEntity(CommonConstants.Login_ERROR_CODE,"请登录","");
            JSONObject jsonObject =   (JSONObject) JSONObject.toJSON(returnEntity);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
            return false;
        }
        return true;
    }

    private boolean checkHeaderAuth(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            Subject subject = SecurityUtils.getSubject();
            String userId = "";
            SecUser secUser = new SecUser();
//            //判断是否是移动
//            UserAgent ua = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
//            OperatingSystem os = ua.getOperatingSystem();
//            logger.info("设备类型：" + os.getDeviceType());
////            if(DeviceType.MOBILE.getName().equals(os.getDeviceType().getName())) {//移动端
//                logger.info("移动连接");
                String token = request.getHeader("token");
//                String deviceCode = request.getParameter("deviceCode");
//                logger.info("==============token: " + token + ", deviceCode: " + deviceCode);
//                if(!StringUtils.isEmpty(token)){
                    userId = JwtUtil.getUID(token);
//                    logger.info("==============用户信息:" + userId);
////                    Map<String, Object> check = portalTokenService.checkToken(token, "access_token", deviceCode);
////                    logger.info("==============access_token:" + check);
////                    if (check == null || !"success".equals(check.get("message"))) {
////                        return false;
////                    }
//                    //验证token
//                    Map<String, Object> tokenMap = JwtUtil.verify(token, userId, "access_token", deviceCode);
//                    logger.info("==============token验证：" + tokenMap);
//                    if(!(Boolean) (tokenMap.get("success"))){
//                        return false;
//                    }
//
//                    //向session中插入用户信息，可以按需插入相关用户信息
                    secUser.setUserId(userId);
                    secUser.setUserName(JwtUtil.getUsername(token));
                    subject.getSession().setAttribute(SecurityContext.Authentication, secUser);
//                }
//            }else{
//                logger.info("pc连接");
//                userId = request.getParameter("userId");
//                //前后端分离的系统，用sign方式验证，非前后端分离的系统不用sign方式验证
//                String sign = request.getParameter("sign") == null ? "" : request.getParameter("sign");
//                String genKey = DigestUtils.md5DigestAsHex((userId + "@" ).getBytes());
////                        + wbsApiConfig.getEisPassword()).getBytes()
//
//                if (!genKey.equals(sign)) {
//                    logger.info("验证错误");
//                    return false;
//                }
//                Map<String, Object> userMap = new HashMap<String, Object>();
//                secUser = secUserService.selectByUserId(userId);
//                UsernamePasswordToken tokenUser = new UsernamePasswordToken(secUser.getUserId(), secUser.getPwd());
//                subject.login(tokenUser);
//                if (subject.isAuthenticated()) {
//                    subject.getSession().setAttribute(SecurityContext.Authentication, secUser);
//                }
//            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
