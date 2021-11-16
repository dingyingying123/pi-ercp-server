package cn.com.personnel.ercp.common.controller;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.auth.service.ISecUserService;
import cn.com.personnel.ercp.ca.mydbpersistence.entity.SecUserCA;
import cn.com.personnel.ercp.common.kit.CommonConfig;
import cn.com.personnel.ercp.common.service.ILoginService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.Date;

/**
 * @author 33925
 *
 */
@Controller
@RequestMapping("/autoLogin")
public class LoginController2 extends PageController {

    @Autowired
    private ILoginService loginService;
//    @Autowired
//    private SecUserCAMapper secUserCAMapper;
    @Autowired
    private SecUserMapper secUserMapper;
    Base64 base64 = new Base64();
    @Autowired
    private ISecUserService secUserService;
    @Value("${vue.ip}")
    private String ip;
    @Value("${vue.port}")
    private String port;
    @Autowired
    private CommonConfig commonConfig;

    /**
     * 登录
     *
     * @param
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/autoLogin")
    public String autoLogin() {
        String userId = request.getParameter("userId");
        String key = request.getParameter("sign") == null ? "" : request.getParameter("sign");
        String session = request.getSession().getId();
        String md5 =  DigestUtils.md5DigestAsHex((userId + "@"+ commonConfig.getEisPassword()).getBytes());

        if(!md5.equals(key)){
            return null;
        }
        SecUser secUser = new SecUser();
        SecUser secUserCA = secUserMapper.selectByPrimaryKey(userId);
        secUser.setUserId(secUserCA.getUserId());
        secUser.setLoginIp(secUserCA.getLoginIp());
        secUser.setLoginTime(new Date());
        secUserMapper.updateByPrimaryKeySelective(secUser);
        secUser.setPwd(secUserCA.getPwd());
        if(secUserCA!=null&&secUserCA.getMale()!=null&&secUserCA.getMale().equals("男"))
            secUser.setMale("男");
        else secUser.setMale("女");
        if(secUserCA!=null) {
            secUser.setUserName(secUserCA.getUserName());
        }
//        SecUser secUser = secUserService.selectByUserId(userId);

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

        String http=ip+":"+port;//服务器vueip
        String url = "redirect:"+http+"/#/dashboard"+"&Admin-Token="+sessionId+"&userId="+userId;
        return url;
}

        }