package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;

public interface ISecUserLoginLogService {
    void saveUserLoginLog(SecUser secUser, String appCode, String ipAddress);
}
