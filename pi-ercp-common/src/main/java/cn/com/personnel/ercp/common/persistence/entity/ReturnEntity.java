package cn.com.personnel.ercp.common.persistence.entity;

import java.io.Serializable;

public class ReturnEntity implements Serializable {
    private String status;
    private String message;
    private Object data;

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public ReturnEntity(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public String toString() {
        return "ReturnEntity{status=" + this.status + ", message='" + this.message + '\'' + ", data=" + this.data + '}';
    }

    public static ReturnEntity error(String status, String message, Object data) {
        return new ReturnEntity(status, message, data);
    }

    public static ReturnEntity error() {
        return errorMsg("操作失败");
    }

    public static ReturnEntity errorMsg(String message) {
        return new ReturnEntity("4000", message, (Object)null);
    }

    public static ReturnEntity ok(Object data) {
        return new ReturnEntity(data);
    }

    public static ReturnEntity ok() {
        return new ReturnEntity((Object)null);
    }

    public ReturnEntity(Object data) {
        this.status = "2000";
        this.message = "成功";
        this.data = data;
    }
}

