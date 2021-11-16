package cn.com.personnel.ercp.common;

import cn.com.personnel.ercp.framework.auth.SecurityContext;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;

@Component
public  class UserInfo {
    public static Object getLoginUser() {
        Subject subject = SecurityUtils.getSubject();
        return subject.getSession().getAttribute(SecurityContext.Authentication);
    }
}
