package cn.com.personnel.ercp.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.Collection;

/**
 * 身份校验核心类
 * 
 * @author Administrator
 *
 */

public class MyShiroRealm extends AuthorizingRealm {

    /**
     * 认证信息(身份验证) Authentication 是用来验证用户身份
     * 
     * 输入 认证信息
     * 
     * 返回
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 获取用户的输入帐号
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(token.getPrincipal(), // 用户名
                                                                                   token.getCredentials(), // 密码
                                                                                   getName());
        return authenticationInfo;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // TODO Auto-generated method stub
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");

        // 获取当前用户
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        User userInfo = (User) principals.getPrimaryPrincipal();
        /*
         * List<Role> roleList = roleMapper.selectRoleListByUser(userInfo); for
         * (Role role : roleList) {
         * authorizationInfo.addRole(role.getRole_id()); }
         */

        return authorizationInfo;
    }

    @Override
    public boolean hasAllRoles(PrincipalCollection principal, Collection<String> roleIdentifiers) {
        AuthorizationInfo info = getAuthorizationInfo(principal);
        return info != null && hasAnyRoles(roleIdentifiers, info);
    }

    private boolean hasAnyRoles(Collection<String> roleIdentifiers, AuthorizationInfo info) {
        if (roleIdentifiers != null && !roleIdentifiers.isEmpty()) {
            for (String roleName : roleIdentifiers) {
                if (hasRole(roleName, info)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

}
