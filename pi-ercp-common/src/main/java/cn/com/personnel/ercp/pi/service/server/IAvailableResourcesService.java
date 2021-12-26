package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerAvailableResourcesInfoVO;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

public interface IAvailableResourcesService {
    ReturnEntity queryAvailableResourcesList(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO, PagenationQueryParameter buildPagenation);

    ReturnEntity queryAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO);

    ReturnEntity saveAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO, SecUser secUser);

    ReturnEntity submitAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO, SecUser secUser);

    ReturnEntity deleteAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO);
}
