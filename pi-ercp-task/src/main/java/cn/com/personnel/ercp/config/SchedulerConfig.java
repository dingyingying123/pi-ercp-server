package cn.com.personnel.ercp.config;

import org.quartz.Scheduler;
import org.quartz.ee.servlet.QuartzInitializerListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.io.IOException;
import java.util.Properties;

@Configuration
public class SchedulerConfig {

/*    @Bean
    public JobFactory jobFactory(ApplicationContext applicationContext) {
        AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
        jobFactory.setApplicationContext(applicationContext);
        return jobFactory;
    }

    @Bean
    public Properties quartzProperties() throws IOException {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
        propertiesFactoryBean.afterPropertiesSet();
        return propertiesFactoryBean.getObject();
    }*/

	 @Autowired
	 private AutowiringSpringBeanJobFactory autowireCapableBeanFactory;  //自定义的factory
	 

	 

//获取工厂bean 
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {
      SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
      try {
		schedulerFactoryBean.setQuartzProperties(quartzProperties());
		schedulerFactoryBean.setJobFactory(autowireCapableBeanFactory);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      return schedulerFactoryBean;
    }

//指定quartz.properties
    @Bean
    public Properties quartzProperties() throws IOException {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
        propertiesFactoryBean.afterPropertiesSet();
        return propertiesFactoryBean.getObject();
    }
 
//创建schedule  
    @Bean(name = "scheduler")
    public Scheduler scheduler() {
      return schedulerFactoryBean().getScheduler();
    }
    @Bean
    public QuartzInitializerListener executorListener() {
       return new QuartzInitializerListener();
    }

}


