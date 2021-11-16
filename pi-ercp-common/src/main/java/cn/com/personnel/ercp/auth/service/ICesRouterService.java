package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.persistence.entity.CesRouter;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;

public interface ICesRouterService extends IService {

    List<CesRouter> getRouter(String appcode, String valid, PagenationQueryParameter buildPagenation);

    int deleteRouter(String[] ids);

    int updateRouter(CesRouter cesRouter);

    int insertRouter(CesRouter cesRouter);

    List<CesRouter> selectCondition(CesRouter cesRouter, PagenationQueryParameter buildPagenation);


    List<CesRouter> getRouters(String appcode, String valid);

    CesRouter getOne(String id);

    List<String> getUserRoleButtons(SecUser secUser, String routerId, String appCode);
}
