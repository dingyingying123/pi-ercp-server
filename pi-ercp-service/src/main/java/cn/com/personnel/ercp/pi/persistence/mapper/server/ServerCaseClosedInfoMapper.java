package cn.com.personnel.ercp.pi.persistence.mapper.server;

import cn.com.personnel.ercp.pi.module.server.ServerCaseClosedInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerCaseClosedInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServerCaseClosedInfoMapper extends BaseMapper<ServerCaseClosedInfo> {
    List<ServerCaseClosedInfoVO> queryCaseClosedList(ServerCaseClosedInfoVO serverCaseClosedInfoVO);

    ServerCaseClosedInfoVO queryCaseClosedInfo(ServerCaseClosedInfoVO serverCaseClosedInfoVO);

    String getLetterNumber(@Param("prefix") String prefix);
}