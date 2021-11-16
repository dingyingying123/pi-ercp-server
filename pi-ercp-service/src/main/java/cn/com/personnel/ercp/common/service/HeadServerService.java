package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.ISecUserLoginLogService;
import cn.com.personnel.ercp.common.kit.CommonConfig;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.persistence.entity.base.PortalTsapp;
import cn.com.personnel.ercp.pi.persistence.mapper.base.PortalTsappMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class HeadServerService implements IHeadServerService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    PortalTsappMapper portalTsappMapper;
    @Autowired
    CommonConfig commonConfig;
    @Autowired
    private ISecUserLoginLogService secUserLoginLogService;

    @Override
    public ReturnEntity getServiceInfo() {
        String appCod = commonConfig.getAppCode();
        return ReturnEntity.ok(portalTsappMapper.getServiceInfo(appCod));
    }

    private String getRemortIP(HttpServletRequest request) {
        if (request.getHeader("x-forwarded-for") == null) {
            return request.getRemoteAddr();
        }
        return request.getHeader("x-forwarded-for");
    }

    @Override
    public String openService(String key,HttpServletRequest request, SecUser secUser) {
        PortalTsapp portalTsapp = portalTsappMapper.selectByPrimaryKey(key);
        Subject subject = SecurityUtils.getSubject();
        String adminToken = subject.getSession().getId().toString();
        String userId = secUser.getUserId();
        String url = "redirect:"+portalTsapp.getDoneUrl() + "?Admin-Token=" + adminToken + "&userId="+userId;
        logger.info("完整路径url:"+url);
        //保存登陆信息
        String ipAddress = getRemortIP(request);
        secUserLoginLogService.saveUserLoginLog(secUser,key,ipAddress);
        return url;
    }
}
