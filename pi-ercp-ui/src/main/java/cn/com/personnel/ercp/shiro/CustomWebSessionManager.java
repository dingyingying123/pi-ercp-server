package cn.com.personnel.ercp.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.SessionContext;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Value;

public class CustomWebSessionManager extends DefaultWebSessionManager {


    @Value("${app.app_cookie_name}")
    private String cookieName;

    @Override
    protected void onStart(Session session, SessionContext context){
        super.getSessionIdCookie().setName(cookieName);
        super.onStart(session, context);
    }
}
