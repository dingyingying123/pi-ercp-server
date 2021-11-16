/**
 * Copyright 2018 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.kit;

import cn.com.personnel.ercp.common.persistence.entity.InterfaceStatus;

/**
 * @author 33925
 *
 */
public interface  PoBapiCallBack {

    public InterfaceStatus getInterfaceStatus();
    /**
     * 调用bapi的函数
     */
    public Object callBapi();
    
    /**
     * 获取返回值的方法
     * @return
     */
    public Object getCallBack(String guid, Object bapiReturn);

    /**
     * 获取失败时返回值的方法
     * @return
     */
    public Object errorCallBack(String guid, Object bapiReturn);
    
}
