package cn.com.personnel.ercp.common.filter;


import cn.com.personnel.ercp.auth.service.ISecUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;


@WebFilter(urlPatterns = "/rest/*", filterName = "apiRestAuthorFilter")
public class RestApiAuthorFilter extends BaseFilter implements Filter{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ISecUserService secUserService;

    
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
                                                         ServletException {
    	
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        
        if(!checkHeaderAuth(request, response)){  
            response.setStatus(401);  
            response.setHeader("Cache-Control", "no-store");  
            response.setDateHeader("Expires", 0);  
            response.setHeader("WWW-authenticate", "Basic Realm=\"auth\"");  
        } else {
            chain.doFilter(request, response);
        }            
 
        
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
        
    } 
   private boolean checkHeaderAuth(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.info("========进行验证开始=============");
	   String api = request.getRequestURI();
       String ip = getIPAddress(request);
       Map<String,String> userPwd= getBaseAuthUserPwd(request);
       if(userPwd == null){
    	   return false;
       }
       logger.info("=========api:" + api);
       logger.info("=========ip:" + ip);
       logger.info("=========userPwd:" + userPwd);
       String userName= userPwd.get("userName");
       String password= userPwd.get("password");
	   return secUserService.checkAuth(api, ip, userName, password);
   }  
    
    public void nextStep(HttpServletRequest request, HttpServletResponse response) throws IOException {  
        PrintWriter pw = response.getWriter();  
        pw.println("<html> next step, authentication is : " + request.getSession().getAttribute("auth") + "<br>");  
        pw.println("<br></html>");  
    }
    

}
