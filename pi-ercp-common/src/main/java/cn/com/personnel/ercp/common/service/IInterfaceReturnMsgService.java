/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.common.persistence.entity.InterfaceReturnMsg;
import cn.com.personnel.springboot.framework.core.service.IService;

/**
 * @author 33925
 *
 */
public interface IInterfaceReturnMsgService extends IService {
    
    /**
     * 根据guid号,获取访问值
     * @param guid
     * @param returnMsg
     */
    public InterfaceReturnMsg getInterfaceReturnMsgByGUID(String guid);
}
