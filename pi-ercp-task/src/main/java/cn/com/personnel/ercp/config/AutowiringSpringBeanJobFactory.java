package cn.com.personnel.ercp.config;
import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

@Component
public  class AutowiringSpringBeanJobFactory extends AdaptableJobFactory {
	@Autowired
	private transient AutowireCapableBeanFactory capableBeanFactory;

 
	  @Override
	  protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
	    Object jobInstance = super.createJobInstance(bundle);
	    capableBeanFactory.autowireBean(jobInstance); //这一步解决不能spring注入bean的问题
	    return jobInstance;
	  }
}