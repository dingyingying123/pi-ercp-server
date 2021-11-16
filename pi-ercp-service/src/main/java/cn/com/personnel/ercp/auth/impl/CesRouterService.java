package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.persistence.entity.CesRouter;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.mapper.CesRouterMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRouterButtonMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserRoleMapper;
import cn.com.personnel.ercp.auth.service.ICesRouterService;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CesRouterService extends BaseService implements ICesRouterService {
    @Autowired
    CesRouterMapper cesRouterMapper;

    @Autowired
    SecUserRoleMapper secUserRoleMapper;

    @Autowired
    SecRouterButtonMapper secRouterButtonMapper;

    @Override
    public List<CesRouter> getRouter(String appcode, String valid, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        return cesRouterMapper.selectRouting(appcode,valid);
    }

    @Override
    public int deleteRouter(String [] ids) {
        int i = 0 ;
        for(String id:ids) {
            int a = cesRouterMapper.deleteRouting(id);
            i=a+i;
        }
        return i;
    }

    @Override
    public int updateRouter(CesRouter cesRouter) {
        return cesRouterMapper.updateRouting(cesRouter);
    }

    @Override
    public int insertRouter(CesRouter cesRouter) {
        return cesRouterMapper.insert(cesRouter);
    }

    @Override
    public List<CesRouter> selectCondition(CesRouter cesRouter, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        return cesRouterMapper.selectCondition(cesRouter);
    }

    @Override
    public List<CesRouter> getRouters(String appcode,String valid) {

        return cesRouterMapper.selectRouting(appcode,valid);
    }

    @Override
    public CesRouter getOne(String id) {
        return cesRouterMapper.getOne(id);
    }

    @Override
    public List<String> getUserRoleButtons(SecUser secUser, String routerId, String appCode) {
        String userId = secUser.getUserId();
        String appcod = appCode;
        List<String> roleList = secUserRoleMapper.getRoleIdList(userId, appcod);
        List<String> buttonList = secRouterButtonMapper.getButtonByRoleAndRouter(routerId, roleList);
        return buttonList;
    }
}
