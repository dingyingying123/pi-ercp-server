/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.entity.SecUserRole;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.core.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 34351
 *
 */
public interface ISecUserService extends IService {

    public List<SecUser> queryUser(SecUser secUser, PagenationQueryParameter pageParam);

    public List<SecUser> findUser();

    public SecUser addUser(SecUser secUser);

    public SecUser updateUser(SecUser secUser);

    public int deleteUser(SecUser secUser);

    /**
     * 在数据库表中删除用户
     *
     * @param userId
     * @return
     */
    public int deleteUserReally(String userId);

    /**
     * 根据角色名称查询该角色下的所有人员
     *
     * @param roleName
     * @return
     */
    List<SecUser> findUserByRoleName(@Param("roleName") String roleName);

    /**
     * 导入保存
     * @param secUserList
     * @return
     */
    public int importData(List<SecUser> secUserList, List<SecUserRole> secUserRoleList);

    String addRestUser(SecUser secUser);

    String updateRestUser(SecUser secUser);

    String deleteRestUser(String account, String type);

    SecUser selectByUserId(String userId);

    boolean checkAuth(String api, String ip, String userName, String password);
}
