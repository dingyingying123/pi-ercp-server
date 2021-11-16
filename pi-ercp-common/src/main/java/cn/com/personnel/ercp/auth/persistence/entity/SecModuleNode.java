package cn.com.personnel.ercp.auth.persistence.entity;

import java.util.List;

public class SecModuleNode {

	private SecModule secModule;
	private List<SecModuleNode> children;
	public SecModule getSecModule() {
		return secModule;
	}
	public void setSecModule(SecModule secModule) {
		this.secModule = secModule;
	}
	public List<SecModuleNode> getChildren() {
		return children;
	}
	public void setChildren(List<SecModuleNode> children) {
		this.children = children;
	}
}
