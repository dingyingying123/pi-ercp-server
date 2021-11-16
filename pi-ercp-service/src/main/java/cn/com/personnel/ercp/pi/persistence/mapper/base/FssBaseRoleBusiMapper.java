package cn.com.personnel.ercp.pi.persistence.mapper.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseRoleBusi;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FssBaseRoleBusiMapper extends BaseMapper<FssBaseRoleBusi> {
    List<String> queryBusiByRole(@Param("roleId") String roleId);
}