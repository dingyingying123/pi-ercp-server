package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.SecRole;
import cn.com.personnel.ercp.pi.module.base.SecUserRoleVO;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SecRoleMapper extends BaseMapper<SecRole> {
    
    public List<SecRole> selectByCondition(SecRole secRole);
    
    public List<SecRole> selectUserRole(@Param("userId") String userId, @Param("appCode") String appCode);

    /**
     * 根据user_id获取当前角色
     * @param userId
     * @return
     */
	public SecRole selectRoleByUserId(@Param("userId") String userId);

	public SecRole queryUserRoleBySystemCode(String systemCode);

	public List<SecRole> queryAllRole();

	//根据userId获取appcod
	public String queryAppcod(@Param("userId") String userId);

	public SecRole queryUserRoleByRoleName(String roleName);

	public List<Map> findAllRoles(String appCode);

	public List<Map> selectUserRoleInfo(@Param("secUserRole") SecUserRoleVO secUserRole, @Param("appCode") String appCode);
}