package cn.com.personnel.ercp;

/**
 * Copyright 2019 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import cn.com.personnel.ercp.config.PropertiesListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author lfjin
 *
 */
@Configuration
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
@EnableAspectJAutoProxy(exposeProxy = true)
@ImportResource(locations = "classpath*:/applicationContext*.xml")
@ServletComponentScan
@EnableScheduling
public class AppTaskLuncher {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AppTaskLuncher.class);
        application.addListeners(new PropertiesListener("pbm-config.properties"));
        application.run(args);
    }
}
