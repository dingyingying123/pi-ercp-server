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
public class IsMsgHeader  implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7138405968004891752L;

    private String mandt ;         // STRING
    private String guid ;          // STRING  第三方发出消息为必输，外围系统生成GUID，关联反馈消息
    private String proxy_id;       // STRING  ERP发出消息为必输，ERP系统生成GUID，用于ERP关联消息和监控平台使用
    private String system_id;      // STRING  调用服务的外围系统号，关联反馈消息
    private String operator;       // STRING  外部系统调用人
    private String spras    ;      // STRING  语言编码
    private String interface_id  ; // STRING  接口名称，可选，PI系统提供
    private String sender   ;      // STRING  发送方，可选，PI系统提供
    private String reciver ;       // STRING  接收方，可选，PI系统提供
    private String sendtime;       // STRING  发送时间，可选，14位，格式：YYYYMMDDHHMMSS
    public String getMandt() {
        return mandt;
    }
    public void setMandt(String mandt) {
        this.mandt = mandt;
    }
    public String getGuid() {
        return guid;
    }
    public void setGuid(String guid) {
        this.guid = guid;
    }
    public String getProxy_id() {
        return proxy_id;
    }
    public void setProxy_id(String proxy_id) {
        this.proxy_id = proxy_id;
    }
    public String getSystem_id() {
        return system_id;
    }
    public void setSystem_id(String system_id) {
        this.system_id = system_id;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public String getSpras() {
        return spras;
    }
    public void setSpras(String spras) {
        this.spras = spras;
    }
    public String getInterface_id() {
        return interface_id;
    }
    public void setInterface_id(String interface_id) {
        this.interface_id = interface_id;
    }
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getReciver() {
        return reciver;
    }
    public void setReciver(String reciver) {
        this.reciver = reciver;
    }
    public String getSendtime() {
        return sendtime;
    }
    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }
    
    
    
}
