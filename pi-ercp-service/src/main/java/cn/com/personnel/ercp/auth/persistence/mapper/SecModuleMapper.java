package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.SecModule;
import cn.com.personnel.ercp.auth.persistence.entity.SecUserRole;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecModuleMapper extends BaseMapper<SecModule> {


    public List<SecModule> selectUserModule(@Param("appcod") String appCode, @Param("userId") String uid);

    /**
     * @param
     * @return
     */
    public List<SecModule> selectOderByOrderId(String appCode);

    public  List<SecModule> getModuleByUserId(String userId);

    List<SecModule> selectMenusAll(@Param("appcod") String appCode);

    public List<SecModule> getModuleByRoleId(@Param("appcod")String appCode,@Param("roleId")String roleId);

    public List<SecModule> getParentModuleByRoleId(@Param("appcod")String appCode,@Param("roleId") List<String> roleId);

    public List<SecModule> getAllModulesByRoles(@Param("SecUserRole") List<SecUserRole> secUserRoleList, @Param("appCode") String  appCode);
}