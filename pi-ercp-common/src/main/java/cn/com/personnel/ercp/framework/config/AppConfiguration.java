package cn.com.personnel.ercp.framework.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author 33925
 *
 */
@Configuration
public class AppConfiguration {

    @Autowired
    private Environment env;

    @Bean(name = "applicationConfig")
    public ApplicationConfig setConfig() {
        ApplicationConfig appConfig = new ApplicationConfig();
        ApplicationConfig.APP_CODE = env.getProperty("app.app_code");
        ApplicationConfig.APP_NAME = env.getProperty("app.app_name");
        ApplicationConfig.APP_MODULE = env.getProperty("app.app_module");

        ApplicationConfig.BASE_TEMPLATE_PATH = env.getProperty("app.base_template_path");
        if( ApplicationConfig.BASE_TEMPLATE_PATH == null ||  ApplicationConfig.BASE_TEMPLATE_PATH.trim().equals("")) {
            ApplicationConfig.BASE_TEMPLATE_PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        }
        return appConfig;
    }
}
