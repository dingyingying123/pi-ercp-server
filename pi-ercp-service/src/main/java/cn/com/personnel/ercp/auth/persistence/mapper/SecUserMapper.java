package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecUserMapper extends BaseMapper<SecUser> {

    /**
     * 查询资源工程师
     * 
     * @author 34351
     *
     * @return
     */
    List<SecUser> searchEngineer();


    /**
     * 通过邮箱查询用户信息
     * 
     * @param userId
     * @return
     */
    SecUser selectSecUserByEmail(@Param("userId") String userId);

    /**
     * 检查邮箱唯一
     * 
     * @param comEmail
     * @return
     */
    int secEmailCount(@Param("comEmail") String comEmail);

    /**
     * 根据userId更新邮箱信息
     * 
     * @param user
     */
    int updateEmailByUserId(@Param("user") SecUser user);

    /**
     * 根据角色名称查询该角色下的所有人员
     * 
     * @param roleName
     * @return
     */
    List<SecUser> findUserByRoleName(@Param("roleName") String roleName);

    /**
     * 通过ID查
     * 
     * @author
     *
     * @return
     */
    List<SecUser> searchById(@Param("userId") String userId);



    /**
     * 密码错误次数
     * @param userId
     */
    void updatePwdTimes(@Param("userId") String userId);

    /**
     * 重置密码次数
     * @param userId
     */
    void resetPwdTimes(@Param("userId") String userId);
}