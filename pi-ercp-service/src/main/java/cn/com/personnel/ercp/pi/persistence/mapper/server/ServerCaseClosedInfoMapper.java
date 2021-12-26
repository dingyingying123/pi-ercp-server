package cn.com.personnel.ercp.pi.persistence.mapper.server;

import cn.com.personnel.ercp.pi.module.server.ServerCaseClosedInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerCaseClosedInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;

public interface ServerCaseClosedInfoMapper extends BaseMapper<ServerCaseClosedInfo> {
    List<ServerCaseClosedInfoVO> queryCaseClosedList(ServerCaseClosedInfoVO serverCaseClosedInfoVO);
}