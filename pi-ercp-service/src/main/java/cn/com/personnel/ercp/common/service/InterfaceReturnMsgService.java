/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.common.persistence.entity.InterfaceReturnMsg;
import cn.com.personnel.ercp.common.persistence.mapper.InterfaceReturnMsgMapper;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 33925
 *
 */
@Component
public class InterfaceReturnMsgService  extends BaseService implements IInterfaceReturnMsgService {
    @Autowired
    private InterfaceReturnMsgMapper interfaceReturnMsgMapper;

    @Override
    public InterfaceReturnMsg getInterfaceReturnMsgByGUID(String guid) {
        InterfaceReturnMsg record = new InterfaceReturnMsg();
        record.setiGuid(guid);
        return interfaceReturnMsgMapper.selectOne(record);
    }

    
}
