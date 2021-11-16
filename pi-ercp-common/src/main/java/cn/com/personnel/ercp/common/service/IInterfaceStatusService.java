/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.common.persistence.entity.InterfaceReturnMsg;
import cn.com.personnel.ercp.common.persistence.entity.InterfaceStatus;
import cn.com.personnel.springboot.framework.core.service.IService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 33925
 *
 */
public interface IInterfaceStatusService  extends IService {
    
    /**
     * 添加调用接口记录
     * @param interfaceStatus
     */
    public void addInterfaceStatus(InterfaceStatus interfaceStatus);
    
    /**
     * 更新调用结构
     * @param guid
     * @param returnMsg
     */
    @Transactional(rollbackForClassName = "Exception")
    public InterfaceStatus updateInterfaceStatus(String guid, String flag, List<InterfaceReturnMsg> returnMsg);

    /*
     * (non-Javadoc)
     *
     * @see cn.com.personnel.ercp.common.service.IInterfaceStatusService#
     * updateInterfaceStatus(java.lang.String, java.lang.String, java.util.List)
     */
    @Transactional(rollbackForClassName = "Exception")
    InterfaceStatus updateInterfaceStatus(String guid, String flag, InterfaceReturnMsg returnMsg);

    /**
     * @param guid
     * @param returnMsg
     */
    public void updateInterfaceStatusByKey(InterfaceStatus interfaceStatus);
}
