/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.common.persistence.entity.InterfaceReturnMsg;
import cn.com.personnel.ercp.common.persistence.entity.InterfaceStatus;
import cn.com.personnel.ercp.common.persistence.mapper.InterfaceReturnMsgMapper;
import cn.com.personnel.ercp.common.persistence.mapper.InterfaceStatusMapper;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.core.service.IService;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

/**
 * @author 33925
 *
 */
@Component
public class InterfaceStatusService extends BaseService implements IInterfaceStatusService {

    @Autowired
    private InterfaceReturnMsgMapper interfaceReturnMsgMapper;

    @Autowired
    private InterfaceStatusMapper interfaceStatusMapper;

    @Autowired
    private ApplicationContext       context;

    /*
     * (non-Javadoc)
     * 
     * @see cn.com.personnel.ercp.common.service.IInterfaceStatusService#
     * addInterfaceStatus(cn.com.personnel.ercp.common.persistence.entity.
     * InterfaceStatus)
     */
    @Override
    @Transactional(rollbackForClassName = "Exception")
    public void addInterfaceStatus(InterfaceStatus interfaceStatus) {
        interfaceStatusMapper.insert(interfaceStatus);

    }

    @Override
    public InterfaceStatus updateInterfaceStatus(String guid, String flag, List<InterfaceReturnMsg> returnMsg) {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see cn.com.personnel.ercp.common.service.IInterfaceStatusService#
     * updateInterfaceStatus(java.lang.String, java.lang.String, java.util.List)
     */
    @Override
    @Transactional(rollbackForClassName = "Exception")
    public InterfaceStatus updateInterfaceStatus(String guid, String flag, InterfaceReturnMsg returnMsg) {
        // 更新执行状态
        InterfaceStatus upara = new InterfaceStatus();
        upara.setiGuid(guid);
        upara.setiFlag(flag);
        upara.setUpdateTime(new Date());
        interfaceStatusMapper.updateByPrimaryKeySelective(upara);

        // 记录返回信息
        if (returnMsg != null) {
            returnMsg.setId(UUIDKit.getUUID());
            returnMsg.setCreateTime(new Date());
            interfaceReturnMsgMapper.insert(returnMsg);
        }
        InterfaceStatus interfaceStatus = interfaceStatusMapper.selectByPrimaryKey(guid);
        // 调用回调
        if (interfaceStatus != null && interfaceStatus.getBackBean() != null
                && interfaceStatus.getBackMethod() != null) {
            logger.info("interfaceStatus is not null!");

            try {
                IService backService = (IService) context.getBean(Class.forName(interfaceStatus.getBackBean()));
                if (backService != null) {
                    Method method = null;
                    method = backService.getClass().getMethod(interfaceStatus.getBackMethod(), String.class,
                                                              String.class);
                    method.invoke(backService, guid, flag);
                    logger.info("backService invoke!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return interfaceStatus;
    }

    @Override
    public void updateInterfaceStatusByKey(InterfaceStatus interfaceStatus) {
        interfaceStatusMapper.updateByPrimaryKeySelective(interfaceStatus);
    }
}
