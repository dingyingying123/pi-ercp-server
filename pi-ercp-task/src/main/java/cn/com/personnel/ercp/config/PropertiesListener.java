package cn.com.personnel.ercp.config;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;


public class PropertiesListener implements ApplicationListener<ApplicationStartedEvent> {

    private String propertyFileName;

    public PropertiesListener(String propertyFileName) {
        this.propertyFileName = propertyFileName;
    }

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
//        BpmPropertiesConfig.loadAllProperties(propertyFileName);
    }
}