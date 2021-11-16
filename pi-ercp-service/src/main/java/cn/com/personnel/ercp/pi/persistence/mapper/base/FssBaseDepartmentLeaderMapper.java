package cn.com.personnel.ercp.pi.persistence.mapper.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseDepartmentLeader;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;

public interface FssBaseDepartmentLeaderMapper extends BaseMapper<FssBaseDepartmentLeader> {
    List<FssBaseDepartmentLeader> queryDepartmentLeaderList(FssBaseDepartmentLeader fssBaseDepartmentLeader);
}