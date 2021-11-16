package cn.com.personnel.ercp.common.persistence.entity;

import java.io.Serializable;

public class ReturnEntity implements Serializable {
    private int code;
    private String message;
    private Object data;

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ReturnEntity(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String toString() {
        return "ReturnEntity{code=" + this.code + ", message='" + this.message + '\'' + ", data=" + this.data + '}';
    }

    public static ReturnEntity error(int code, String message, Object data) {
        return new ReturnEntity(code, message, data);
    }

    public static ReturnEntity error() {
        return errorMsg("操作失败");
    }

    public static ReturnEntity errorMsg(String message) {
        return new ReturnEntity(0, message, (Object)null);
    }

    public static ReturnEntity ok(Object data) {
        return new ReturnEntity(data);
    }

    public static ReturnEntity ok() {
        return new ReturnEntity((Object)null);
    }

    public ReturnEntity(Object data) {
        this.code = 1;
        this.message = "成功";
        this.data = data;
    }
}

