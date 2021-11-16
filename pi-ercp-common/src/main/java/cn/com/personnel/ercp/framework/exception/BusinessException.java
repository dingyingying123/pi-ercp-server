package cn.com.personnel.ercp.framework.exception;


/**
 * @author 33925
 *
 */
public class BusinessException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * @param message
     * @param cause
     */
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public BusinessException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public BusinessException(Throwable cause) {
        super(cause);
    }




}

