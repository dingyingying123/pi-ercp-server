package cn.com.personnel.springboot.framework.core.exception;

public class ActionException extends RuntimeException {

    private static final long serialVersionUID = 6824379684970962308L;

    public ActionException() {
        super();
    }

    public ActionException(String message) {
        super(message);
    }

    public ActionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ActionException(Throwable cause) {
        super(cause);
    }

}