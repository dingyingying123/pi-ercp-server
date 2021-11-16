package cn.com.personnel.ercp.pi.module.base;

import java.util.List;

public class OrganizationBusiVO {
    private String busi;
    private String busiText;
    private List<OrganizationVO> children;

    public String getBusi() {
        return busi;
    }

    public void setBusi(String busi) {
        this.busi = busi;
    }

    public String getBusiText() {
        return busiText;
    }

    public void setBusiText(String busiText) {
        this.busiText = busiText;
    }

    public List<OrganizationVO> getChildren() {
        return children;
    }

    public void setChildren(List<OrganizationVO> children) {
        this.children = children;
    }
}
