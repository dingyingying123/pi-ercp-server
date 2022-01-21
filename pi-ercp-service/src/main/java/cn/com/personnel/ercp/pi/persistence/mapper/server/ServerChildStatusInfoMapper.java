package cn.com.personnel.ercp.pi.persistence.mapper.server;

import cn.com.personnel.ercp.pi.persistence.entity.server.ServerChildStatusInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface ServerChildStatusInfoMapper extends BaseMapper<ServerChildStatusInfo> {
    ServerChildStatusInfo queryOneStatusByChildId(@Param("childId") String childId);
}