package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;

import javax.servlet.http.HttpServletRequest;

public interface IHeadServerService {
    ReturnEntity getServiceInfo();

    String openService(String key, HttpServletRequest request, SecUser secUser);
}
