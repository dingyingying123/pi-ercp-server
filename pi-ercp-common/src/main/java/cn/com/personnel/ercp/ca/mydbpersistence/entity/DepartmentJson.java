/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.ca.mydbpersistence.entity;

/**
 * 绩效责任主体显示层
 * 
 * @author 36467
 *
 */
public class DepartmentJson {
    /**
     * 表单编号
     */
    public String id;
    /**
     * 表单名称
     */
    public String name;
    /**
     * 上级ID
     */
    public String parent;
    /**
     * 状态
     */
    public String state;
    /**
     * 部门名称
     */
    public String text;
    /**
     * 部门编号
     */
    public String textNo;
    /**
     * 英文名称
     */
    public String englishText;

    /**
     * 上上级组织ID
     */
    public String parentOrgName;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextNo() {
        return textNo;
    }

    public void setTextNo(String textNo) {
        this.textNo = textNo;
    }

    public String getEnglishText() {
        return englishText;
    }

    public void setEnglishText(String englishText) {
        this.englishText = englishText;
    }

    public String getParentOrgName() {
        return parentOrgName;
    }

    public void setParentOrgName(String parentOrgName) {
        this.parentOrgName = parentOrgName;
    }

}
