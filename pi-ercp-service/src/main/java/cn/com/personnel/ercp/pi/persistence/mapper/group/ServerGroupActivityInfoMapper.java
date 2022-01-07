package cn.com.personnel.ercp.pi.persistence.mapper.group;

import cn.com.personnel.ercp.pi.persistence.entity.group.ServerGroupActivityInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;

public interface ServerGroupActivityInfoMapper extends BaseMapper<ServerGroupActivityInfo> {
    List<ServerGroupActivityInfo> queryGroupActivityList(ServerGroupActivityInfo serverGroupActivityInfo);
}