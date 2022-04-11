package cn.com.personnel.ercp.pi.module.child;

import cn.com.personnel.ercp.common.persistence.entity.FileInfo;

public class ChildrenFileInfoVO extends FileInfo {
    private String childName;

    private String childIdNo;

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildIdNo() {
        return childIdNo;
    }

    public void setChildIdNo(String childIdNo) {
        this.childIdNo = childIdNo;
    }
}
