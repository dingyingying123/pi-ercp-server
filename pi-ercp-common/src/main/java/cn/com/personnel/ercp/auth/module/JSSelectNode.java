package cn.com.personnel.ercp.auth.module;

import cn.com.personnel.ercp.auth.persistence.entity.SecModule;

import java.util.Map;

public class JSSelectNode {
	private String value;// required
	private	String label;// required

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
