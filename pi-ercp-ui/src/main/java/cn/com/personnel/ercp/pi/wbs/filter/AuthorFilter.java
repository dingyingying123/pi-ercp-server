package cn.com.personnel.ercp.pi.wbs.filter;

import cn.com.personnel.ercp.common.kit.CommonConfig;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "/wbs/*", filterName = "authorFilter")
public class AuthorFilter implements Filter{
    
    @Autowired
    private CommonConfig commonConfig;
    
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
                                                         ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
         String sessionAuth = (String) request.getSession().getAttribute("auth");
        
        if (sessionAuth != null) {  
            System.out.println("this is next step");
            chain.doFilter(request, response); 
  
        } else {  
  
            if(!checkHeaderAuth(request, response)){  
                response.setStatus(401);  
                response.setHeader("Cache-Control", "no-store");  
                response.setDateHeader("Expires", 0);  
                response.setHeader("WWW-authenticate", "Basic Realm=\"SCC\"");  
            } else {
                chain.doFilter(request, response);
            }            
               
        }  
        
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
        
    } 
   private boolean checkHeaderAuth(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        String auth = request.getHeader("Authorization");
        System.out.println("auth encoded in base64 is " + getFromBASE64(auth));
          
        if ((auth != null) && (auth.length() > 6)) {  
            auth = auth.substring(6, auth.length());
            String decodedAuth = getFromBASE64(auth);
            System.out.println("auth decoded from base64 is " + decodedAuth);
            String[] split = decodedAuth.split(":");
            if(split!=null&&split.length>0) {
                if(split[0].equals(commonConfig.getUserName())&&split[1].equals(commonConfig.getPassword())) {
                    request.getSession().setAttribute("auth", decodedAuth);  
                    return true;  
                }
            }
           return false;
        }else{  
            return false;  
        }  
  
    }  
  
    private String getFromBASE64(String s) {
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
  
    public void nextStep(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<html> next step, authentication is : " + request.getSession().getAttribute("auth") + "<br>");  
        pw.println("<br></html>");  
    }
}
