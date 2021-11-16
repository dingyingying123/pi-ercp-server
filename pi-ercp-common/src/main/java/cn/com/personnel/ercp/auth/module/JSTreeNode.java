package cn.com.personnel.ercp.auth.module;

import cn.com.personnel.ercp.auth.persistence.entity.SecModule;

import java.util.Map;

public class JSTreeNode{
	private String id;// required
	private	String parent;// required
	private String text; // node text
	private String icon;// string for custom
	private String url;

	private String vuePath;
	private String vueTitle;
	private String vueIcon;
	private String vueComponent;
	private String vueNocache;
//	 state       : {
//	    opened    : boolean  // is the node open
//	    disabled  : boolean  // is the node disabled
//	    selected  : boolean  // is the node selected
//	  },
	private Map<String, Boolean> state;
	private SecModule data;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Map<String, Boolean> getState() {
		return state;
	}
	public void setState(Map<String, Boolean> state) {
		this.state = state;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public SecModule getData() {
		return data;
	}
	public void setData(SecModule data) {
		this.data = data;
	}

	public String getVuePath() {
		return vuePath;
	}

	public void setVuePath(String vuePath) {
		this.vuePath = vuePath;
	}

	public String getVueTitle() {
		return vueTitle;
	}

	public void setVueTitle(String vueTitle) {
		this.vueTitle = vueTitle;
	}

	public String getVueIcon() {
		return vueIcon;
	}

	public void setVueIcon(String vueIcon) {
		this.vueIcon = vueIcon;
	}

	public String getVueComponent() {
		return vueComponent;
	}

	public void setVueComponent(String vueComponent) {
		this.vueComponent = vueComponent;
	}

	public String getVueNocache() {
		return vueNocache;
	}

	public void setVueNocache(String vueNocache) {
		this.vueNocache = vueNocache;
	}
}
