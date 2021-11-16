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
public class CallBackMsg  implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -5252488609925681590L;
    
    private String guid;
    
    private String type;  //消息类型
    
    private String message;
    
    private String date;
    
    private String time;
    
    private String reserve_f1;
    
    private String reserve_f2;
    
    private String reserve_f3;

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getReserve_f1() {
		return reserve_f1;
	}

	public void setReserve_f1(String reserve_f1) {
		this.reserve_f1 = reserve_f1;
	}

	public String getReserve_f2() {
		return reserve_f2;
	}

	public void setReserve_f2(String reserve_f2) {
		this.reserve_f2 = reserve_f2;
	}

	public String getReserve_f3() {
		return reserve_f3;
	}

	public void setReserve_f3(String reserve_f3) {
		this.reserve_f3 = reserve_f3;
	}

	@Override
	public String toString() {
		return "CallBackMsg [guid=" + guid + ", type=" + type + ", message=" + message + ", date=" + date + ", time="
				+ time + ", reserve_f1=" + reserve_f1 + ", reserve_f2=" + reserve_f2 + ", reserve_f3=" + reserve_f3
				+ "]";
	}
    
    
    
}
