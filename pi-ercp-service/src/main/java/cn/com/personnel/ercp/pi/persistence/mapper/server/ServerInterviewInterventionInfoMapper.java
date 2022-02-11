package cn.com.personnel.ercp.pi.persistence.mapper.server;

import cn.com.personnel.ercp.pi.module.server.ServerInterviewInterventionVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerInterviewInterventionInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServerInterviewInterventionInfoMapper extends BaseMapper<ServerInterviewInterventionInfo> {
    List<ServerInterviewInterventionVO> queryInterviewInterventionList(ServerInterviewInterventionVO serverInterviewInterventionVO);

    ServerInterviewInterventionVO queryInterviewInterventionInfo(ServerInterviewInterventionVO serverInterviewInterventionVO);

    List<ServerInterviewInterventionVO> queryInterventionList(ServerInterviewInterventionVO serverInterviewInterventionVO);
    String getLetterNumber(@Param("prefix") String prefix);
}