package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.persistence.entity.SecRouter;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRouterMapper;
import cn.com.personnel.ercp.auth.service.ISecRouterService;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SecRouterService extends BaseService implements ISecRouterService {
    @Autowired
    SecRouterMapper secRouterMapper;

    @Override
    public List<SecRouter> getRouter(String appcode, String valid, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        return secRouterMapper.selectRouting(appcode,valid);
    }

    @Override
    public int deleteRouter(String [] ids) {
        int i = 0 ;
        for(String id:ids) {
            int a = secRouterMapper.deleteRouting(id);
            i=a+i;
        }
        return i;
    }

    @Override
    public int updateRouter(SecRouter secRouter) {
        return secRouterMapper.updateRouting(secRouter);
    }

    @Override
    public int insertRouter(SecRouter secRouter) {
        return secRouterMapper.insert(secRouter);
    }

    @Override
    public List<SecRouter> selectCondition(SecRouter secRouter,PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        return secRouterMapper.selectCondition(secRouter);
    }

    @Override
    public List<SecRouter> getRouters(String appcode,String valid) {

        return secRouterMapper.selectRouting(appcode,valid);
    }

    @Override
    public SecRouter getOne(String id) {
        return secRouterMapper.getOne(id);
    }
}
