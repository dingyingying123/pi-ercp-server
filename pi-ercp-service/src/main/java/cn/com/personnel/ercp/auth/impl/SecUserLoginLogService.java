package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.entity.SecUserLoginLog;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserLoginLogMapper;
import cn.com.personnel.ercp.auth.service.ISecUserLoginLogService;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SecUserLoginLogService extends BaseService implements ISecUserLoginLogService {
    @Autowired
    private SecUserLoginLogMapper secUserLoginLogMapper;
    @Override
    public void saveUserLoginLog(SecUser secUser, String appCode, String ipAddress) {
        SecUserLoginLog user = new SecUserLoginLog();
        user.setId(UUIDKit.getUUID());
        user.setUserId(secUser.getUserId());
        user.setUserName(secUser.getUserName());
        user.setLoginTime(new Date());
        user.setCteateTime(new Date());
        user.setUserIp(ipAddress);
        user.setAppCode(appCode);
        secUserLoginLogMapper.insertSelective(user);
    }
}
