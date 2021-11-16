package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.SecRoleButton;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecRoleButtonMapper extends BaseMapper<SecRoleButton> {
    List<SecRoleButton> getRoleButtonList(SecRoleButton secRoleButton);
    void deleteByRoleIdAndRouterId(@Param("roleId") String roleId, @Param("routerId") String routerId);
}