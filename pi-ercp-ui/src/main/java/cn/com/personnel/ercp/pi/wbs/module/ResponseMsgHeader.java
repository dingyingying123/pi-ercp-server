/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.wbs.module;

import java.io.Serializable;

/**
 * @author 33925
 *
 */
public class ResponseMsgHeader  implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5695532782670828888L;
    

    private String code;  //E 为错误
    
    private String msg;

    /**
     * 执行结果代码
     * @return
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 执行结果消息
     * @return
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
}
