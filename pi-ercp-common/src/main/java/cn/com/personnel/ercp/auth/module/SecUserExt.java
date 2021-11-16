/**
 * 
 */
package cn.com.personnel.ercp.auth.module;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;

/**
 * @author 37036
 * 用户扩展类
 * 
 */
public class SecUserExt extends SecUser{
    
    /**
     * 周报是否填报
     * 0：未填报
     * 1：已填报
     */
    private String isReport;// 是否填报

    public String getIsReport() {
        return isReport;
    }

    public void setIsReport(String isReport) {
        this.isReport = isReport;
    }

}
