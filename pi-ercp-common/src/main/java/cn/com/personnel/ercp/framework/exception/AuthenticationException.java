package cn.com.personnel.ercp.framework.exception;

/**
 * 用户登录错误
 * @author hufy
 *
 */
public class AuthenticationException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String code = null;

    public String getCode() {
        return code;
    }
    public AuthenticationException(String code ,String message) {
        super(message);
        this.code = code;
    }

}
