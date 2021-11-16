/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.module;

import java.util.List;
import java.util.Map;

/**
 * VUE 子节点所需字段
 *
 * @author liujf
 */
public class MenuTreeChildrenVue {
    private String menuId;
    private String path;
    private String component;
    private String name;
    private boolean hidden;
    private Map<String, Object> meta;
    private List<MenuTreeChildrenVue> children;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getMeta() {
        return meta;
    }

    public void setMeta(Map<String, Object> meta) {
        this.meta = meta;
    }

    public List<MenuTreeChildrenVue> getChildren() {
        return children;
    }

    public void setChildren(List<MenuTreeChildrenVue> children) {
        this.children = children;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }


    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
