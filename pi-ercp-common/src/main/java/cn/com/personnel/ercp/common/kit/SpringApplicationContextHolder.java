package cn.com.personnel.ercp.common.kit;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * <p>Description: 获取bean对象</p>
 * @author  tuojiajia
 */
@Component
public class SpringApplicationContextHolder implements ApplicationContextAware{
    private static ApplicationContext applicationContext;



    public static ApplicationContext getApplicationContext() {

        return applicationContext;
    }
    /**
     * <p>Description: 根据beanId获取bean对象</p>
     * @author  tuojiajia
     */
    @SuppressWarnings("unchecked")
    public  static <T> T getBean(String beanId){
        return (T) applicationContext.getBean(beanId);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringApplicationContextHolder.applicationContext = applicationContext;
    }
}
