/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.module;

import java.util.List;

/**
 * VUE 所需字段
 *
 * @author liujf
 */
public class MenuList {
    private String id;
    private String label;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<MenuList> getChildren() {
        return children;
    }

    public void setChildren(List<MenuList> children) {
        this.children = children;
    }

    private List<MenuList> children;


}
