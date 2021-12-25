package cn.com.personnel.ercp.pi.persistence.mapper.server;

import cn.com.personnel.ercp.pi.module.server.ServerPlanInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerPlanInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;

public interface ServerPlanInfoMapper extends BaseMapper<ServerPlanInfo> {
    List<ServerPlanInfoVO> queryPlanList(ServerPlanInfoVO serverPlanInfoVO);
}