package cn.com.personnel.springboot.framework.core.exception;

/**
 * @author lfjin
 *
 */
public class BaseException extends Exception {

    private static final long serialVersionUID = 2569766066412722074L;

    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

}
