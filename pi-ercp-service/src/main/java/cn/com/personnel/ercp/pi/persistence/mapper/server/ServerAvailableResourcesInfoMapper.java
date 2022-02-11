package cn.com.personnel.ercp.pi.persistence.mapper.server;

import cn.com.personnel.ercp.pi.module.server.ServerAvailableResourcesInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerAvailableResourcesInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServerAvailableResourcesInfoMapper extends BaseMapper<ServerAvailableResourcesInfo> {
    List<ServerAvailableResourcesInfoVO> queryAvailableResourcesList(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO);

    ServerAvailableResourcesInfoVO queryAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO);

    String getLetterNumber(@Param("prefix") String prefix);
}