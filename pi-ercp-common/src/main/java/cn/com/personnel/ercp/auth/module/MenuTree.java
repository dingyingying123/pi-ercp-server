/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.module;

import java.util.List;

/**
 * @author 34351
 *
 */
public class MenuTree {
    private String         menuId;
    private String         menuName;
    private String         menuIcon;
    private boolean        hasSubMenu;
    private String         url;
    
    private List<MenuTree> subMenu;
    public String getMenuName() {
        return menuName;
    }
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public String getMenuIcon() {
        return menuIcon;
    }
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }
    public boolean isHasSubMenu() {
        return hasSubMenu;
    }
    public void setHasSubMenu(boolean hasSubMenu) {
        this.hasSubMenu = hasSubMenu;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public List<MenuTree> getSubMenu() {
        return subMenu;
    }
    public void setSubMenu(List<MenuTree> subMenu) {
        this.subMenu = subMenu;
    }
    public String getMenuId() {
        return menuId;
    }
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
    
    
}
