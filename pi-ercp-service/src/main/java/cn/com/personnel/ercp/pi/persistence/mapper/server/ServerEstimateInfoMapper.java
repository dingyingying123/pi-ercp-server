package cn.com.personnel.ercp.pi.persistence.mapper.server;

import cn.com.personnel.ercp.pi.module.server.ServerEstimateInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerEstimateInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;

public interface ServerEstimateInfoMapper extends BaseMapper<ServerEstimateInfo> {
    List<ServerEstimateInfoVO> queryEstimateList(ServerEstimateInfoVO serverEstimateInfoVO);

    ServerEstimateInfoVO queryEstimateInfo(ServerEstimateInfoVO serverEstimateInfoVO);
}