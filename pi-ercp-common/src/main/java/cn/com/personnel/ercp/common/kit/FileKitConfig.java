package cn.com.personnel.ercp.common.kit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.servlet.MultipartConfigElement;

/**
 * 文件上传相关配置
 * @author 36837
 *
 */
@Configuration
@Component
public class FileKitConfig {
	 @Autowired
	 private Environment env;
	 
	 public String getFilePath() {
		 return env.getProperty("file.upload");
	 }
	 public String getFileTemp() {
		 return env.getProperty("file.temp");
	 }
	 public String getFileBasePath() {
		 return env.getProperty("file.basePath");
	 }
	 public String getFileMail() {
		 return env.getProperty("file.mail");
	 }
	 public String getFilePassw() {
		 return env.getProperty("file.passw");
	 }

	/**
	 * 文件上传配置
	 * @return
	 */
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		//单个文件最大
		factory.setMaxFileSize("2048000KB"); //KB,MB
		/// 设置总上传数据总大小
		factory.setMaxRequestSize("2048000KB");
		return factory.createMultipartConfig();
	}
}
