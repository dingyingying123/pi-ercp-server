package cn.com.personnel.ercp.shiro;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.SessionListener;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisManager;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import redis.clients.jedis.JedisPoolConfig;

import javax.servlet.Filter;
import java.util.*;

@Configuration
public class ShiroConfiguration {

    @Autowired
    private Environment env;


    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();

        shiroFilterFactoryBean.setLoginUrl("/showLogin"); // 登录页面
        shiroFilterFactoryBean.setSuccessUrl("/");
        shiroFilterFactoryBean.setUnauthorizedUrl("/error/403");

//        测试接口允许匿名访问
      /*  filterChainDefinitionMap.put("/bill/**", "anon"); // 表示可以匿名访问票据接口
        filterChainDefinitionMap.put("/transfer/**", "anon"); // 表示可以匿名访问内部调拨单接口
        filterChainDefinitionMap.put("/expense/**", "anon"); // 表示可以匿名访问接口
        filterChainDefinitionMap.put("/receivable/**", "anon"); // 表示可以匿名访问接口*/

        // ================ 通用 ==============================//
        filterChainDefinitionMap.put("/logout", "logout"); // 退出接口
        filterChainDefinitionMap.put("/login", "anon"); // 登录接口
        filterChainDefinitionMap.put("/mobileLogin", "anon"); // 登录接口
        filterChainDefinitionMap.put("/login_web", "anon"); // 登录接口
        filterChainDefinitionMap.put("/autoLogin_web", "anon"); // 登录接口
        filterChainDefinitionMap.put("/showLogin", "anon"); // 弹出登录框
        filterChainDefinitionMap.put("/showPopLogin", "anon"); // 弹出登录框
        filterChainDefinitionMap.put("/get_user", "anon"); // 判断用户是否已经登录
        filterChainDefinitionMap.put("/get_user_web", "anon"); // 判断用户是否已经登录
        filterChainDefinitionMap.put("/error/500", "anon"); // 500错误页面
        filterChainDefinitionMap.put("/error/404", "anon"); // 404错误页面
        filterChainDefinitionMap.put("/getVerify", "anon"); // 验证码
        filterChainDefinitionMap.put("/getName", "anon"); // 服务器存取登录cookie
        filterChainDefinitionMap.put("/showVerify", "anon"); // 展示验证码
        filterChainDefinitionMap.put("/mobile/**", "anon"); // 表示可以匿名访问移动端接口
        filterChainDefinitionMap.put("/autoLogin/**", "anon"); // 表示可以匿名访问移动端接口
        filterChainDefinitionMap.put("/v2/**", "anon"); // swagger接口
        filterChainDefinitionMap.put("/swagger-ui.html", "anon");
        filterChainDefinitionMap.put("/webjars/**", "anon");
        filterChainDefinitionMap.put("/swagger-resources/**", "anon");
        filterChainDefinitionMap.put("/file/**", "anon");

        // ================= 以下是静态资源 =================== //
        filterChainDefinitionMap.put("/css/**", "anon");
        filterChainDefinitionMap.put("/app/www/**", "anon");
        filterChainDefinitionMap.put("/fonts/**", "anon");
        filterChainDefinitionMap.put("/images/**", "anon");
        filterChainDefinitionMap.put("/js/**", "anon");
        filterChainDefinitionMap.put("/plugins/**", "anon");
        // ================= 静态资源结束 =================== //

        // ================= 暴露的接口，接口认证通过相应拦截器实现 ====================//
        filterChainDefinitionMap.put("/wbs/**", "anon"); //
        filterChainDefinitionMap.put("/ca/api/**", "anon"); //
        filterChainDefinitionMap.put("/fss/bps/**", "anon"); //
        filterChainDefinitionMap.put("/bps/api/**", "anon"); //
        filterChainDefinitionMap.put("/checkCtrl/**", "anon"); //
        filterChainDefinitionMap.put("/baseCommon/**", "anon"); //
//        filterChainDefinitionMap.put("/h5ChildrenBaseInfo/toH5ChildrenModel", "anon"); //
        filterChainDefinitionMap.put("/headServer/**", "anon"); //
//        filterChainDefinitionMap.put("/base/**", "anon"); //
        // ================= 暴露的接口 结束 ====================//

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

        securityManager.setCacheManager(cacheManager());
        securityManager.setSessionManager(sessionManager());
        return securityManager;
    }

    @Bean
    public DefaultWebSessionManager sessionManager(){
        CustomShiroSessionListener customShiroSessionListener = new CustomShiroSessionListener();
        DefaultWebSessionManager sessionManager=new DefaultWebSessionManager();

        SimpleCookie cookie=new SimpleCookie(env.getProperty("app.app_cookie_name"));
        sessionManager.setSessionIdCookie(cookie);
        Collection<SessionListener> listeners = new ArrayList<SessionListener>();
        listeners.add(customShiroSessionListener);
        sessionManager.setSessionListeners(listeners);
//        sessionManager.setSessionDAO(redisSessionDAO());
        return sessionManager;
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


    /**
     * cacheManager 缓存 redis实现
     *
     * @return
     */
    public RedisCacheManager cacheManager() {
        RedisCacheManager redisCacheManager = new RedisCacheManager();
        redisCacheManager.setRedisManager(redisManager());
        return redisCacheManager;
    }

    /**
     * 配置shiro redisManager
     *
     * @return
     */
    public RedisManager redisManager() {
        RedisManager redisManager = new RedisManager();
        redisManager.setHost(env.getProperty("spring.redis.host")+":"+env.getProperty("spring.redis.port"));
        redisManager.setTimeout(Integer.valueOf(env.getProperty("spring.redis.timeout")));
        //if(env.getProperty("app.app_module").equals(ApplicationConfig.FACTORY_MODULE)){
            redisManager.setPassword(env.getProperty("spring.redis.password"));
        //}

        JedisPoolConfig jedisPoolConfig=new JedisPoolConfig();
        jedisPoolConfig.setTestOnBorrow(true);
        jedisPoolConfig.setTestOnReturn(true);
        jedisPoolConfig.setTestWhileIdle(true);
        jedisPoolConfig.setTestOnCreate(true);
        redisManager.setJedisPoolConfig(jedisPoolConfig);

        return redisManager;
    }


    /**
     * RedisSessionDAO shiro sessionDao层的实现 通过redis
     */
    @Bean
    public RedisSessionDAO redisSessionDAO() {
        RedisSessionDAO redisSessionDAO = new RedisSessionDAO();
        redisSessionDAO.setRedisManager(redisManager());
        redisSessionDAO.setKeyPrefix(env.getProperty("app.app_cookie_name"));
        return redisSessionDAO;
    }
}
