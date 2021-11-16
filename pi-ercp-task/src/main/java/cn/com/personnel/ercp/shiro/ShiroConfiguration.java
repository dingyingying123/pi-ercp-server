package cn.com.personnel.ercp.shiro;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.SessionListener;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.*;

@Configuration
public class ShiroConfiguration {

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();

        shiroFilterFactoryBean.setLoginUrl("/showLogin");
        shiroFilterFactoryBean.setSuccessUrl("/");
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");
        filterChainDefinitionMap.put("/login", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/noticeType", "anon"); // 表示可以匿名访问

        filterChainDefinitionMap.put("/logout", "logout");
        filterChainDefinitionMap.put("/showLogin", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/showPopLogin", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/activate/**", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/showPopLogin", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/declaration", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/get_user", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/suggest/add", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/file/upload", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/error/500", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/error/404", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/suggest", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/showForgetPwd/**", "anon"); // 表示可以匿名访问

        filterChainDefinitionMap.put("/supplierRegistration", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/supplierRegistration/add", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/supplierRegistration/miss", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/supplierRegistration/resetPwd", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/supplierRegistration/reset", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/baseData/findCountryAndCap", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/baseData/products", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/offer/**", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/offer/**/**", "anon"); // 表示可以匿名访问

        filterChainDefinitionMap.put("/css/**", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/fonts/**", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/images/**", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/js/**", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/plugins/**", "anon"); // 表示可以匿名访问
        filterChainDefinitionMap.put("/wbs/**", "anon"); // 表示可以匿名访问

        filterChainDefinitionMap.put("/base/**", "anon"); // 表示可以匿名访问

        filterChainDefinitionMap.put("/un/password/**", "anon"); // 表示可以匿名访问
        //TODO
        filterChainDefinitionMap.put("/rest/**", "anon"); // 暂时表示可以匿名访问
        
        
        filterChainDefinitionMap.put("/*", "authc");// 表示需要认证才可以访问
        filterChainDefinitionMap.put("/**", "authc");// 表示需要认证才可以访问
        filterChainDefinitionMap.put("/*.*", "authc");
        Map<String, Filter> filters = new HashMap<String, Filter>();
        filters.put("authc", new MyFormAuthenticationFilter());
        shiroFilterFactoryBean.setFilters(filters);
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;

    }

    @Bean
    public SecurityManager securityManager(MyShiroRealm myShiroRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm);
        securityManager.setAuthorizer(myShiroRealm);
        CustomShiroSessionListener customShiroSessionListener = new CustomShiroSessionListener();
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        Collection<SessionListener> listeners = new ArrayList<SessionListener>();
        listeners.add(customShiroSessionListener);
        sessionManager.setSessionListeners(listeners);
        securityManager.setSessionManager(sessionManager);
        return securityManager;
    }

    @Bean
    public MyShiroRealm myShiroRealm() {
        MyShiroRealm myShiroRealm = new MyShiroRealm();
        return myShiroRealm;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

}
