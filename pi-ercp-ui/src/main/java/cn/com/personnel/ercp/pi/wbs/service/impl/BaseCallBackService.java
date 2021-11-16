/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.wbs.service.impl;

import cn.com.personnel.ercp.common.persistence.entity.InterfaceReturnMsg;
import cn.com.personnel.ercp.common.service.IInterfaceStatusService;
import cn.com.personnel.ercp.pi.wbs.module.CallBackMsg;
import cn.com.personnel.ercp.pi.wbs.module.IvMsgHeader;
import cn.com.personnel.springboot.framework.kit.JsonKit;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;


/**
 * @author 33925
 *
 */
public abstract class BaseCallBackService extends BaseService {

    @Autowired
    private IInterfaceStatusService interfaceStatusService;

    public void updateInterfaceReturnMsg(IvMsgHeader ivMsgHeader, String flag, List<CallBackMsg> callBackMsgs) {
        logger.error("ivMsgHeader=" + JsonKit.toJson(ivMsgHeader) + "===================flag=" + flag
                + "==================callBackMsgs=" + JsonKit.toJson(callBackMsgs));

        InterfaceReturnMsg returnMsg = new InterfaceReturnMsg();
        if (callBackMsgs != null) {

            StringBuffer stringBuffer = new StringBuffer();
            String msgType = "S";
            for (CallBackMsg callback : callBackMsgs) {
                if (callback.getType().equals("E")||callback.getType().equals("A")) {
                    stringBuffer.append(callback.getMessage());
                    msgType = "E";
                } else if (callback.getType().equals("S")) {
                    stringBuffer.append(callback.getMessage());
                }
            }
            if (StringUtils.isEmpty(flag)) {
                flag = msgType;
            }

            returnMsg.setiGuid(callBackMsgs.get(0).getGuid() == null ? ivMsgHeader.getGuid()
                    : callBackMsgs.get(0).getGuid());
            returnMsg.setMsgType(msgType);
            returnMsg.setCreateTime(new Date());
            returnMsg.setMsg(stringBuffer.toString());

        }

        interfaceStatusService.updateInterfaceStatus(ivMsgHeader.getGuid(), flag, returnMsg);
    }
}
