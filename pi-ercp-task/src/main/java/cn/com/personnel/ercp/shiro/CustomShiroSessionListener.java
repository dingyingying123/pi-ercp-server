/**
 * 
 */
package cn.com.personnel.ercp.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

/**
 * @author Administrator
 *
 */
public class CustomShiroSessionListener implements SessionListener {

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.apache.shiro.session.SessionListener#onStart(org.apache.shiro.session
     * .Session)
     */
    @Override
    public void onStart(Session session) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.apache.shiro.session.SessionListener#onStop(org.apache.shiro.session.
     * Session)
     */
    @Override
    public void onStop(Session session) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.apache.shiro.session.SessionListener#onExpiration(org.apache.shiro.
     * session.Session)
     */
    @Override
    public void onExpiration(Session session) {
        // TODO Auto-generated method stub
        System.out.println("shiro session 过期了");
        // System.out.println(session.hashCode());
        session.setAttribute("msgTimeOut", "长时间未操作，请重新登录！");
    }

}
