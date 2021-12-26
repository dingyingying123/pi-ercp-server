package cn.com.personnel.ercp.pi.persistence.mapper.server;

import cn.com.personnel.ercp.pi.module.server.ServerEvaluateInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerEvaluateInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;

public interface ServerEvaluateInfoMapper extends BaseMapper<ServerEvaluateInfo> {
    List<ServerEvaluateInfoVO> queryEvaluateList(ServerEvaluateInfoVO serverEvaluateInfoVO);
}