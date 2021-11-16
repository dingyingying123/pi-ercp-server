package cn.com.personnel.ercp.common.filter;

import org.apache.commons.codec.binary.Base64;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseFilter {
	
	protected String getIPAddress(HttpServletRequest request) {
        String ip = null;

        //X-Forwarded-For：Squid 服务代理
        String ipAddresses = request.getHeader("X-Forwarded-For");

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //Proxy-Client-IP：apache 服务代理
            ipAddresses = request.getHeader("Proxy-Client-IP");
        }

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //WL-Proxy-Client-IP：weblogic 服务代理
            ipAddresses = request.getHeader("WL-Proxy-Client-IP");
        }

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //HTTP_CLIENT_IP：有些代理服务器
            ipAddresses = request.getHeader("HTTP_CLIENT_IP");
        }

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //X-Real-IP：nginx服务代理
            ipAddresses = request.getHeader("X-Real-IP");
        }

        //有些网络通过多层代理，那么获取到的ip就会有多个，一般都是通过逗号（,）分割开来，并且第一个ip为客户端的真实IP
        if (ipAddresses != null && ipAddresses.length() != 0) {
            ip = ipAddresses.split(",")[0];
        }

        //还是不能获取到，最后再通过request.getRemoteAddr();获取
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
	
	protected String getFromBASE64(String s) {  
        if (s == null) {  
            return null;
        }
       Base64 decoder = new Base64();  
        try {  
            byte[] bs = Base64.decodeBase64(s); 
            return new String(bs); 
        } catch (Exception e) {  
            return null;  
        } finally {
        } 
    }  

	
	protected Map<String, String>  getBaseAuthUserPwd(HttpServletRequest request){
		String auth = request.getHeader("Authorization");  
		if ((auth != null) && (auth.length() > 6)) { 
			auth = auth.substring(6, auth.length());
			String decodedAuth = getFromBASE64(auth);  
	        String[] up = decodedAuth.split(":");
	        if(up!=null && up.length>0) {
		        Map<String, String>  result = new HashMap<String, String>();
		        
		        String userName = up[0];
		    	String password = up[1];
		        result.put("userName", userName);
		        result.put("password", password);
		        
		        return result;
	        }else{
	        	return null;
	        }

		}else{
			return null;
		}        
	}
}
