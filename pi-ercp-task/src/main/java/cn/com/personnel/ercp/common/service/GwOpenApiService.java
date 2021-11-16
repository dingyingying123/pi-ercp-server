package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.common.kit.CommonConfig;
import cn.com.personnel.ercp.framework.exception.BusinessException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class GwOpenApiService {

	@Autowired
	private CommonConfig commonConfig;

	private void setAuthorization(HttpHeaders requestHeaders) throws UnsupportedEncodingException {
		// basic认证，加请求头
		String auth = commonConfig.getUserName() + ":" + commonConfig.getPassword();
		String encoding = DatatypeConverter.printBase64Binary(auth.getBytes("UTF-8"));
		requestHeaders.add("Authorization", "Basic " + encoding);
		requestHeaders.setContentType(MediaType.APPLICATION_JSON);
	}


	/**
	 * 
	 * 通过用户中心进行验证
	 * @throws Exception
	 */
	public Map<String, Object> authenticate(String userID, String pwd, String cip) throws Exception {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("userName", userID);
		jsonObj.put("password", pwd);
		jsonObj.put("cip", cip);
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders requestHeaders = new HttpHeaders();
		setAuthorization(requestHeaders);
		
		HttpEntity<String> requestEntity = new HttpEntity<String>(jsonObj.toString(), requestHeaders);
		try {
			ResponseEntity<HashMap> reponseResult = restTemplate.postForEntity(
					commonConfig.getAddress() + "/rest/authentication/authenticate", requestEntity, HashMap.class);
			return reponseResult.getBody();
		} catch (HttpStatusCodeException e) {
			throw new BusinessException("认证失败");
		}
	}

	/**
	 *
	 * 邮箱发送功能
	 * @throws Exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Map<String, Object> sendEmail(List<String> sendTo, List<String> sendCC, String subject, String bodyText){
		try {
			com.alibaba.fastjson.JSONObject input = new com.alibaba.fastjson.JSONObject();
			input.put("sendTo",sendTo);
			input.put("sendCC", sendCC);
			input.put("subject", subject);
			input.put("bodyText", bodyText);
			RestTemplate restTemplate = new RestTemplate();
			reInitMessageConverter(restTemplate);
			HttpHeaders requestHeaders = new HttpHeaders();
			setAuthorization(requestHeaders);
			HttpEntity<String> requestEntity = new HttpEntity<>(input.toString(), requestHeaders);

			ResponseEntity<HashMap> reponseResult = restTemplate.postForEntity(
					commonConfig.getAddress() + "/rest/email/send", requestEntity, HashMap.class);
			return reponseResult.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException("发送邮件失败",e);
		}
	}

	private void reInitMessageConverter(RestTemplate restTemplate){
		List<HttpMessageConverter<?>> converterList=restTemplate.getMessageConverters();
		for (HttpMessageConverter<?> item : converterList) {
			if (item.getClass() == StringHttpMessageConverter.class) {
				((StringHttpMessageConverter)item).setDefaultCharset(StandardCharsets.UTF_8);
				break;
			}
		}
	}
}
