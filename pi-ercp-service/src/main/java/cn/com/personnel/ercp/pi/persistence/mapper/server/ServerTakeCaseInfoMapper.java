package cn.com.personnel.ercp.pi.persistence.mapper.server;

import cn.com.personnel.ercp.pi.module.server.ServerTakeCaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerTakeCaseInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;

public interface ServerTakeCaseInfoMapper extends BaseMapper<ServerTakeCaseInfo> {
    List<ServerTakeCaseInfoVO> queryTakeCaseList(ServerTakeCaseInfoVO serverTakeCaseInfoVO);
}