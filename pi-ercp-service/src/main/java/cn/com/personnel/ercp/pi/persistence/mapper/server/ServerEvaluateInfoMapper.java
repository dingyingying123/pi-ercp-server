package cn.com.personnel.ercp.pi.persistence.mapper.server;

import cn.com.personnel.ercp.pi.module.server.ServerCaseClosedInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerEvaluateInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerEvaluateInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServerEvaluateInfoMapper extends BaseMapper<ServerEvaluateInfo> {
    List<ServerEvaluateInfoVO> queryEvaluateList(ServerEvaluateInfoVO serverEvaluateInfoVO);

    ServerEvaluateInfoVO queryEvaluateInfo(ServerEvaluateInfoVO serverEvaluateInfoVO);

    ServerEvaluateInfoVO queryCaseClosedInfo(ServerCaseClosedInfoVO serverCaseClosedInfoVO);

    String getLetterNumber(@Param("prefix") String prefix);
}