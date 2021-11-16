package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.module.SecUserRoleModule;
import cn.com.personnel.ercp.auth.persistence.entity.SecUserRole;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecUserRoleMapper extends BaseMapper<SecUserRole> {
    
    List<SecUserRoleModule> queryRoleUser(SecUserRoleModule secUserRoleModule);
    
    /**
     * 根据userId获取对应的未准入供应商的userRole
     * @param secUserRole
     * @return
     */
	SecUserRole getUnSupplierUserRole(@Param("secUserRole") SecUserRole secUserRole);

	/**
	 * 删除用户角色关系
	 * @param userRole
	 * @return
	 */
	int deleteByCondition(@Param("userRole") SecUserRole userRole);

	/**
	 * 更新角色
	 * @param userRole
	 * @return
	 */
	int updateRoleBySecUserRole(@Param("userRole") SecUserRole userRole);


	/**
     * excel导入时更新角色
     * @param userRole
     * @return
     */
    int importUpdateBySecUserRole(@Param("userRole") SecUserRole userRole);

    /**
     * 根据appcod userid roleid搜索
     * @param userRole
     * @return
     */
    List<SecUserRole> selectRoleUser(@Param("userRole") SecUserRole userRole);

	List<SecUserRoleModule> queryRoleUserByRoleName(SecUserRoleModule userRole);

	SecUserRoleModule selectOneByUserId(@Param("userId") String userId);

	List<String> queryUserListByRole(@Param("queryList") List<String> list);

	List<String> getUserRoleList(@Param("userId") String userId, @Param("appCode") String appCode);

	List<SecUserRole> getUserRoles(@Param("userId")String userId, @Param("appCode")String appCode);

	List<String> getRoleIdList(@Param("userId")String userId, @Param("appCode")String appCode);

	List<String> getUserIdBySystemCode(@Param("appCode")String appCode,@Param("systemCode") String systemCode);

	List<String> getUserIdsByRoleName(@Param("roleName")String roleName,@Param("appCode") String appCode);

    List<SecUserRoleModule> queryUserCKRole(@Param("userId") String userId, @Param("lastKey") String lastKey);
}