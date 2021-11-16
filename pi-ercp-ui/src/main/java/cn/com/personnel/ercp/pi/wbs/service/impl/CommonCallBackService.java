/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.wbs.service.impl;

import cn.com.personnel.ercp.common.persistence.entity.InterfaceReturnMsg;
import cn.com.personnel.ercp.common.service.IInterfaceStatusService;
import cn.com.personnel.ercp.pi.wbs.module.CallBackMsg;
import cn.com.personnel.ercp.pi.wbs.module.IvMsgHeader;
import cn.com.personnel.ercp.pi.wbs.service.ICommonCallBackService;
import cn.com.personnel.springboot.framework.kit.JsonKit;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;

/**
 * @author 33925
 *
 */
@Component
@WebService(targetNamespace = "http://service.ercp.goldwind.com.cn/",
            endpointInterface = "cn.com.personnel.ercp.pi.wbs.service.ICommonCallBackService")
public class CommonCallBackService extends BaseService implements ICommonCallBackService {
    @Autowired
    private IInterfaceStatusService interfaceStatusService;

    @Override
    @Transactional(rollbackForClassName = "Exception")
    public void callBack(IvMsgHeader ivMsgHeader, String flag, List<CallBackMsg> callBackMsgs) {
        logger.error("ivMsgHeader=" + JsonKit.toJson(ivMsgHeader) + "===================flag=" + flag
                + "==================callBackMsgs=" + JsonKit.toJson(callBackMsgs));
        InterfaceReturnMsg returnMsg = new InterfaceReturnMsg();

        if (callBackMsgs != null) {

            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer1 = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            StringBuffer stringBuffer3 = new StringBuffer();
            String msgType = "S";
            for (CallBackMsg callback : callBackMsgs) {
                if (callback.getType().equals("E")) {
                    stringBuffer.append(callback.getMessage() + "@ ");
                    msgType = "E";
                } else if (callback.getType().equals("S")) {
                    stringBuffer.append(callback.getMessage() + "@");
                    if(StringUtils.isNotEmpty(callback.getReserve_f1()))
                        stringBuffer1.append(callback.getReserve_f1() + "@");
                    if(StringUtils.isNotEmpty(callback.getReserve_f2()))
                        stringBuffer2.append(callback.getReserve_f2() + "@");
                    if(StringUtils.isNotEmpty(callback.getReserve_f3()))
                        stringBuffer3.append(callback.getReserve_f3() + "@");
                }
            }
            if (StringUtils.isEmpty(flag)) {
                flag = msgType;
            }
            logger.info("=======ReserveF1:" + stringBuffer1);
            logger.info("=======ReserveF2:" + stringBuffer2);
            logger.info("=======ReserveF3:" + stringBuffer3);
            returnMsg.setiGuid(callBackMsgs.get(0).getGuid());
//            returnMsg.setReserveF1(callBackMsgs.get(0).getReserve_f1());
//            returnMsg.setReserveF2(callBackMsgs.get(0).getReserve_f2());
//            returnMsg.setReserveF3(callBackMsgs.get(0).getReserve_f3());
            returnMsg.setMsgType(msgType);
            returnMsg.setCreateTime(new Date());
            returnMsg.setMsg(stringBuffer.toString().length() > 0 ? stringBuffer.toString().substring(0, stringBuffer.toString().length() - 1) : null);
            returnMsg.setReserveF1(stringBuffer1.toString().length() > 0 ? stringBuffer1.toString().substring(0, stringBuffer1.toString().length() - 1) : null);
            returnMsg.setReserveF2(stringBuffer2.toString().length() > 0 ? stringBuffer2.toString().substring(0, stringBuffer2.toString().length() - 1) : null);
            returnMsg.setReserveF3(stringBuffer3.toString().length() > 0 ? stringBuffer3.toString().substring(0, stringBuffer3.toString().length() - 1) : null);
            logger.info("===========returnMsg:" + returnMsg);
        }
        interfaceStatusService.updateInterfaceStatus(callBackMsgs.get(0).getGuid(), flag, returnMsg);
    }

}
