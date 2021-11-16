package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.SecRouterButton;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecRouterButtonMapper extends BaseMapper<SecRouterButton> {
    List<SecRouterButton> getRouterButtonList(SecRouterButton secRouterButton);

    List<String> getButtonByRoleAndRouter(@Param("routerId") String routerId, @Param("queryList") List<String> queryList);

    List<SecRouterButton> getButtonsByModuleIds(@Param("appcod") String appCode, @Param("roleId") String roleId, @Param("moduleIds") List<String> moduleIds);
}