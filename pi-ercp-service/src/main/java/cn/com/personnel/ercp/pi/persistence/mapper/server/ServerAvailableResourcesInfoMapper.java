package cn.com.personnel.ercp.pi.persistence.mapper.server;

import cn.com.personnel.ercp.pi.module.server.ServerAvailableResourcesInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerAvailableResourcesInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;

public interface ServerAvailableResourcesInfoMapper extends BaseMapper<ServerAvailableResourcesInfo> {
    List<ServerAvailableResourcesInfoVO> queryAvailableResourcesList(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO);

    ServerAvailableResourcesInfoVO queryAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO);
}