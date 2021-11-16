package cn.com.personnel.ercp.framework.exception;

public class MsgException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String code = null;

    public String getCode() {
        return code;
    }

    public MsgException(String message) {
        super(message);
    }

    public MsgException(String code, String message) {
        super(message);
    }
}
