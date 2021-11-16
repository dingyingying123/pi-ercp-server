package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.auth.persistence.entity.SecEnumType;

public class SecEnumTypeVO extends SecEnumType {
    /**
     * 枚举类型编码
     */
    private String code;

    /**
     * 枚举编码
     */
    private String id;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
