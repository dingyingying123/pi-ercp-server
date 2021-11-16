package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.SecRoleModule;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecRoleModuleMapper extends BaseMapper<SecRoleModule> {

    public List<SecRoleModule> selectByCondition(SecRoleModule secRoleModule);

    public List<SecRoleModule> selectByRoleId(SecRoleModule secRoleModule);

    public Integer deleteByRoleId(String roleId);

    public Integer deleteByModuleId(String moduleId);

    public Integer insertBatch(List<SecRoleModule> records);

    public List<String> getModuleIdList(@Param("roleId") String roleId);

    List<String> getPareModuleIdList(String roleId);

    List<String> getNewModuleIdList(@Param("roleId") String roleId, @Param("moduleIds") List<String> moduleIds);
}