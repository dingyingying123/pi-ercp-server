package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.module.SecUserRoleModule;
import cn.com.personnel.ercp.auth.module.UserRolesForm;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.entity.SecUserRole;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserRoleMapper;
import cn.com.personnel.ercp.auth.service.ISecUserRoleService;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Component
public class SecUserRoleService extends BaseService implements ISecUserRoleService {

    @Autowired
    private SecUserRoleMapper secUserRoleMapper;

    @Autowired
    private SecUserMapper     secUserMapper;

    /**
     * 通过角色ID获取对应的用户
     * 
     * @param secUserRoleModule
     * @param pageParam
     * @return
     */
    @Override
    public List<SecUserRoleModule> queryUserRole(SecUserRoleModule secUserRoleModule,
                                                 PagenationQueryParameter pageParam) {
        if (secUserRoleModule.getAppcod() == null) {
            return null;
        }
        setPageHelper(pageParam);
        return secUserRoleMapper.queryRoleUser(secUserRoleModule);
    }

    @Override
    public List<SecUserRoleModule> queryUserRoleNoPage(SecUserRoleModule secUserRoleModule) {
        if (secUserRoleModule.getAppcod() == null) {
            return null;
        }
        return secUserRoleMapper.queryRoleUser(secUserRoleModule);
    }

    @Override
    public List<SecUserRoleModule> queryUserRoleNoPageByRoleName(SecUserRoleModule secUserRoleModule, PagenationQueryParameter pagenationQueryParameter) {
        if (secUserRoleModule.getAppcod() == null) {
            return null;
        }
        setPageHelper(pagenationQueryParameter);
        return secUserRoleMapper.queryRoleUserByRoleName(secUserRoleModule);
    }

    /**
     * 添加用户角色
     */
    @Override
    public SecUserRoleModule addRole(SecUserRole secUserRole) {
        if (secUserRole.getAppcod() == null) {
            return null;
        }
        //修改添加角色从power中添加,解决sec_user中没有新入职人员导致无法添加用户角色
        String userId="";
        if(StringUtils.isNotBlank(secUserRole.getUserId())){
            int length = secUserRole.getUserId().length();
            int zero = 8-length;
            StringBuffer stringBuffer = new StringBuffer();
            for(int i=0;i<zero;i++){
                stringBuffer.append("0");
            }
            userId=stringBuffer+secUserRole.getUserId();
        }
        SecUserRole ckParam = new SecUserRole();
        ckParam.setRoleId(secUserRole.getRoleId());
        ckParam.setUserId(secUserRole.getUserId());
        int num = secUserRoleMapper.selectCount(ckParam);
        Assert.state(num <= 0, secUserRole.getUserId() + "已经存在该角色");
        secUserRole.setId(UUIDKit.getUUID());
        secUserRole.setUpdateTime(new Date());
        secUserRoleMapper.insert(secUserRole);

        // 获取数据
        SecUserRoleModule result = new SecUserRoleModule();
        BeanUtils.copyProperties(secUserRole, result);
        return result;
    }

    /**
     * 删除用户角色
     * 
     * @param secUserRole
     * @return
     */
    @Override
    public int deleteRole(SecUserRole secUserRole) {
        return secUserRoleMapper.deleteByPrimaryKey(secUserRole.getId());
    }

    /**
     * 删除用户角色信息
     */
    @Override
    public int deleteRoleByCondition(SecUserRole userRole) {
        return secUserRoleMapper.deleteByCondition(userRole);
    }

    @Override
    public List<String> getUserRoleList(String userId, String appCode) {
        return secUserRoleMapper.getUserRoleList(userId,appCode);
    }

    public List<SecUserRole> getUserRoles(String userId, String appCode) {
        return secUserRoleMapper.getUserRoles(userId, appCode);
    }

    @Override
    public List<SecUserRole> getByUserId(String userId) {
        Example example = new Example(SecUserRole.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", userId);
        return secUserRoleMapper.selectByExample(example);
    }


    /**
     * 批量添加用户角色
     */
    @Override
    public void addUserRoles(UserRolesForm userRolesForms, SecUser user) {


        List<String> users = userRolesForms.getUsers();
        String roleId = userRolesForms.getRoleId();
        SecUserRole param = new SecUserRole();
        param.setRoleId(roleId);
        int res = secUserRoleMapper.deleteByCondition(param);

        for(String uid : users){
            SecUserRole newUserRole = new SecUserRole();
            newUserRole.setAppcod(ApplicationConfig.APP_CODE);
            newUserRole.setId(UUIDKit.getUUID());
            newUserRole.setRoleId(roleId);
            newUserRole.setUserId(uid);
            newUserRole.setCreator(user.getUserName());
            newUserRole.setCreateTime(new Date());
            secUserRoleMapper.insert(newUserRole);
        }
    }

}
