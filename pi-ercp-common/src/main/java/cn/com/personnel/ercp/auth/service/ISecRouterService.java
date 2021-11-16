package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecRouter;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;

public interface ISecRouterService extends IService {

    List<SecRouter> getRouter(String appcode, String valid, PagenationQueryParameter buildPagenation);

    int deleteRouter(String[] ids);

    int updateRouter(SecRouter secRouter);

    int insertRouter(SecRouter secRouter);

    List<SecRouter> selectCondition(SecRouter secRouter, PagenationQueryParameter buildPagenation);


    List<SecRouter> getRouters(String appcode, String valid);

    SecRouter getOne(String id);
}
