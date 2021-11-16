package cn.com.personnel.ercp.ca.module;

import cn.com.personnel.ercp.ca.mydbpersistence.entity.CaApiConfig;

public class CaApiConfigVo extends CaApiConfig {
	private Long callNum;
	private Long totalNum;
	private String mainid;
	
	

	public Long getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public String getMainid() {
		return mainid;
	}

	public void setMainid(String mainid) {
		this.mainid = mainid;
	}

	public Long getCallNum() {
		return callNum;
	}

	public void setCallNum(Long callNum) {
		this.callNum = callNum;
	}

	
	
	
}
