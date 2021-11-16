package cn.com.personnel.ercp.pi.controller.bps;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.auth.service.ISecUserService;
import cn.com.personnel.ercp.common.autoconfig.ToDoVo;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.kit.CommonConfig;
import cn.com.personnel.ercp.common.kit.JwtUtil;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.common.service.IBpmService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import com.alibaba.fastjson.JSONObject;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/fss/bps")
public class BpsLoginController extends PageController {

    @Autowired
    private ISecUserService secUserService;

    @Value("${vue.port}")
    private String port;
    @Value("${vue.ip}")
    private String ip;
    @Value("${vue.eisport}")
    private String eisport;
    @Value("${vue.eisip}")
    private String eisip;
    @Value("${vue.outer}")
    private String outer;
    @Autowired
    private CommonConfig commonConfig;
    @Autowired
    IBpmService bpmService;
//    @Autowired
//    private SecUserCAMapper secUserCAMapper;
    @Autowired
    private SecUserMapper secUserMapper;

    @RequestMapping("/openFlow")
    public String openFlow() throws IOException, ServletException {
        logger.info("===============外部跳转开始===============");
        Subject subject = SecurityUtils.getSubject();
        String userId = verifyUser(subject);
        if(userId==null)userId=request.getParameter("userId");
        /*----------------------后台验证结束-------------------*/
        String type = request.getParameter("type");
        String c = request.getParameter("c");
        String sessionId = subject.getSession().getId().toString();
        String url = "";
        ToDoVo toDoVo = convert(request);
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        logger.info("类型type:" + type);
        if(StringUtils.isEmpty(type)){
            type = "todo";
        }
        url = bpmService.getTaskRoute(returnEntity,toDoVo,type);
        logger.info("路径url:"+url);
        logger.info("请求路径url:"+ request.getRemoteAddr());
        String http=ip+":"+port;//服务器vueip
        if(request.getRemoteAddr().contains(outer)){
            http=eisip+":"+eisport;//服务器vueip
        }
        url = "redirect:"+http+"/#"+url+"&Admin-Token="+sessionId+"&userId="+userId+"&c="+c;
        logger.info("完整路径url:"+url);
        return url;
    }

    private String getRemortIP(HttpServletRequest request) {
        if (request.getHeader("x-forwarded-for") == null) {
            return request.getRemoteAddr();
        }
        return request.getHeader("x-forwarded-for");
    }

    public ToDoVo convert(HttpServletRequest request){
        Properties initProp = new Properties(System.getProperties());
        logger.info("当前系统编码:" + initProp.getProperty("file.encoding"));
        logger.info("当前系统语言:" + initProp.getProperty("user.language"));
        ToDoVo toDoVo = new ToDoVo();
        List<ToDoVo.ToDoDetial> content=new ArrayList<ToDoVo.ToDoDetial>();
        ToDoVo.ToDoDetial detail=toDoVo.new ToDoDetial();
        detail.setApp(request.getParameter("app"));
        detail.setActionURL(request.getParameter("actionURL"));
        detail.setActivityDefID(request.getParameter("activityDefID"));
        detail.setCreateTime(request.getParameter("createTime"));
        detail.setActivityInstID(request.getParameter("activityInstID"));
        detail.setCreator(request.getParameter("createTime"));
        detail.setCreatorName(request.getParameter("creatorName"));
        detail.setProcessDefID(request.getParameter("activityDefID"));
        detail.setProcessDefName(request.getParameter("processDefName"));
        detail.setProcessInstID(request.getParameter("processInstID"));
        if(request.getParameter("processInstName")!=null) {
            detail.setProcessInstName(request.getParameter("processInstName"));
//            detail.setProcessInstName(new String(Base64.getDecoder().decode(request.getParameter("processInstName").
//                    replaceAll(" ", "+")), StandardCharsets.UTF_8).replaceAll("【SFS】", ""));
        }
        detail.setWorkItemID(request.getParameter("workItemID"));
        if(request.getParameter("activityInstName")!=null) {
            detail.setActivityInstName(request.getParameter("activityInstName"));
//            detail.setActivityInstName(new String(Base64.getDecoder().decode(request.getParameter("activityInstName").
//                    replaceAll(" ", "+")), StandardCharsets.UTF_8));
        }
        if(request.getParameter("workItemName")!=null) {
            detail.setWorkItemName(request.getParameter("workItemName"));
//            detail.setWorkItemName(new String(Base64.getDecoder().decode(request.getParameter("workItemName").
//                    replaceAll(" ", "+")), StandardCharsets.UTF_8));
        }
        content.add(detail);
        toDoVo.setContent(content);
        return toDoVo;
    }

    public String verifyToken(String token, Subject subject) throws Exception{
        String userId = JwtUtil.getUID(token);
        logger.info("==============用户信息:" + userId);
        Map<String, Object> tokenMap = JwtUtil.verify(token, userId, "access_token");
        logger.info("==============token验证：" + tokenMap);
        if(!(Boolean) (tokenMap.get("success"))){
//             return (String) tokenMap.get("message");
            throw new Exception((String) tokenMap.get("message"));
        }
        SecUser secUser = new SecUser();
        secUser.setUserId(userId);
        secUser.setUserName(JwtUtil.getUsername(token));
        setLoginUser(secUser);
        subject.getSession().setAttribute("token", token);
        logger.info("===============查看session中的token" + subject.getSession().getAttribute("token"));
        return userId;
    }

    public String verifyUser(Subject subject){
        String userId = "";
        SecUser secUser = new SecUser();
        //判断是否是移动
        UserAgent ua = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        OperatingSystem os = ua.getOperatingSystem();
        logger.info("设备类型：" + os.getDeviceType());
//        if(DeviceType.MOBILE.getName().equals(os.getDeviceType().getName())) {//移动端
//            secUser = (SfsUser) getLoginUser();
//            userId = secUser.getUserId();
//            logger.info("SfsUser对象：" + userId);
//        }else{
            logger.info("pc连接");
            //pc段rul
            userId = request.getParameter("userId");
            logger.info("==============用户信息:" + userId);
//            String sign = request.getParameter("sign") == null ? "" : request.getParameter("sign");
//            String genKey = DigestUtils.md5DigestAsHex((userId + "@" + commonConfig.getEisPassword()).getBytes());
//            if (!genKey.equals(sign)) {
//                logger.info("验证错误");
//                return null;
//            }
            Map<String, Object> userMap = new HashMap<String, Object>();
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
//            secUser = secUserService.selectByUserId(userId);
            UsernamePasswordToken token = new UsernamePasswordToken(secUser.getUserId(), secUser.getPwd());
            subject.login(token);
            if (subject.isAuthenticated()) {
                setLoginUser(secUser);
            }
//        }
        return userId;
    }

    @RequestMapping("sign")
    @ResponseBody
    public Map<String, Object> sign(@RequestBody JSONObject jsonObject){
        return JwtUtil.sign((String)(jsonObject.get("userId")), (String)(jsonObject.get("userName")),
                (String)(jsonObject.get("appCode")), (String)(jsonObject.get("deviceCode")));
    }

    @RequestMapping("/openInnerFlow")
    public String openInnerFlow() throws IOException, ServletException {
        logger.info("===============外部跳转开始===============");
        Subject subject = SecurityUtils.getSubject();

        /*----------------------后台验证结束-------------------*/
        String type = request.getParameter("type");
        String sessionId = subject.getSession().getId().toString();
        String url = "";
        ToDoVo toDoVo = convert(request);
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        logger.info("类型type:" + type);
        if(StringUtils.isEmpty(type)){
            type = "todo";
        }
        url = bpmService.getTaskRoute(returnEntity,toDoVo,type);
        logger.info("路径url:"+url);
        logger.info("请求路径url:"+ request.getRemoteAddr());
        String http=ip+":"+port;//服务器vueip
        if(request.getRemoteAddr().contains(outer)){
            http=eisip+":"+eisport;//服务器vueip
        }
        url = "redirect:"+http+"/#"+url+"&Admin-Token="+sessionId+"&userId="+request.getParameter("userId");
        logger.info("完整路径url:"+url);
        return url;
    }
}
