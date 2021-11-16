package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.persistence.entity.SecRole;
import cn.com.personnel.ercp.auth.persistence.entity.SecRoleModule;
import cn.com.personnel.ercp.auth.persistence.entity.SecUserRole;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRoleMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRoleModuleMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserRoleMapper;
import cn.com.personnel.ercp.auth.service.ISecRoleService;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class SecRoleService extends BaseService implements ISecRoleService {

    @Autowired
	private SecRoleMapper secRoleMapper;
    @Autowired
	private SecRoleModuleMapper secRoleModuleMapper;
    @Autowired
	private SecUserRoleMapper secUserRoleMapper;
    
	public List<SecRole> queryRole(SecRole secRole, PagenationQueryParameter pageParam){
	    if(secRole.getAppcod()== null) {
	        return new ArrayList<SecRole>();
	    }
	    setPageHelper(pageParam);
		List<SecRole> result  = secRoleMapper.selectByCondition(secRole);
		return result;
	}
	
	public List<SecRole> queryUserRoleByUid(String appCode, String uid){
		List<SecRole> result  = secRoleMapper.selectUserRole(uid, appCode);
		return result;
	}

	@Override
	public SecRole queryUserRoleBySystemCode(String systemCode) {
		return secRoleMapper.queryUserRoleBySystemCode(systemCode);
	}


	public SecRole addRole(SecRole secRole){
	    if(secRole.getAppcod()==null) {
            return null;
        }
	    
		secRole.setStatus("有效");
		secRole.setRoleId(UUIDKit.getUUID());
		secRole.setCreateTime(new Date());
//		secRole.setNote("描述");
		 int result = secRoleMapper.insert(secRole);
	        if(result==1) {
	            return secRole;
	        }else {
	            return null;
	        }
	}
	
	public SecRole updateRole(SecRole secRole){
	    if(secRole.getAppcod()==null) {
            return null;
        }
        
	    
	   secRoleMapper.updateByPrimaryKeySelective(secRole);
	   return secRole;
		
	}
	
	/**
	 * @param secRole
	 * @return
	 */
	public int deleteRole(SecRole secRole){
		if(StringUtils.isEmpty(secRole.getRoleId())){
			return 0;
		}
		Example example = new Example(SecRoleModule.class);
		example.createCriteria().andEqualTo("roleId", secRole.getRoleId());
		secRoleModuleMapper.deleteByExample(example);
		Example example1 = new Example(SecUserRole.class);
		example1.createCriteria().andEqualTo("roleId", secRole.getRoleId());
		secUserRoleMapper.deleteByExample(example);
		return secRoleMapper.deleteByPrimaryKey(secRole);
	}

    public List<SecRole> findAllRole(String appCode, PagenationQueryParameter pageParam) {
		setPageHelper(pageParam);
        SecRole secRole = new SecRole();
        secRole.setStatus("有效");
		secRole.setAppcod(appCode);
        return secRoleMapper.selectByCondition(secRole);
    }

    public String queryAppcod(String userId){
		return secRoleMapper.queryAppcod(userId);
	}

	@Override
	public SecRole queryUserRoleByRoleName(String roleName) {
		return secRoleMapper.queryUserRoleByRoleName(roleName);
	}

	@Override
	public List<Map> findAllRoles(String appCode) {
		return secRoleMapper.findAllRoles(appCode);
	}

}
