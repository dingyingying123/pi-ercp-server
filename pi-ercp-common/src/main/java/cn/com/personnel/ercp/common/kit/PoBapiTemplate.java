/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.kit;

import cn.com.personnel.ercp.common.persistence.entity.InterfaceReturnMsg;
import cn.com.personnel.ercp.common.persistence.entity.InterfaceStatus;
import cn.com.personnel.ercp.common.service.IInterfaceReturnMsgService;
import cn.com.personnel.ercp.common.service.IInterfaceStatusService;
import cn.com.personnel.ercp.framework.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 33925
 *
 */
@Component
public class PoBapiTemplate {
    @Autowired
    private IInterfaceStatusService interfaceStatusService;
    @Autowired
    private IInterfaceReturnMsgService interfaceReturnMsgService;

    protected void recodInterface(InterfaceStatus status) {
        // 新增接口调用状态数据
        status.setCreateTime(new Date());
        status.setiFlag("P");
        interfaceStatusService.addInterfaceStatus(status);
    }

    // 定时轮询，判定是否有返回值
    public Object innerGetCallBack(PoBapiCallBack callback, Object bapiReturn) {
        InterfaceStatus status = callback.getInterfaceStatus();
        // 设置超时时间 500秒
        int timeOut = 500;
        int t = 0;
        while (true) {
            // 等待2秒钟查询结果
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            if (t > timeOut) {
                break;
            }
            // 根据uuid获取返回值
            InterfaceReturnMsg returnMsg = interfaceReturnMsgService.getInterfaceReturnMsgByGUID(status.getiGuid());

            if (returnMsg != null) {
//                if(status.getBakcBean().equals(OfferService.class.getName())){
//                    return callback.getCallBack(returnMsg.getiGuid(),bapiReturn);
//                }
//                if(status.getBakcBean().equals(InvoiceHeadService.class.getName())){
//                    return callback.getCallBack(returnMsg.getiGuid(),bapiReturn);
//                }
                // 如果调用异常，抛出错误
                if ("E".equals(returnMsg.getMsgType())) {
                    String msg = returnMsg.getMsg();
                    if (msg != null && msg.length() > 0) {
                        if (msg.indexOf("已经处理采购订单") > 0) {
                            msg = "当前订单正在被维护，请稍后重新提交";
                        } else if (msg.indexOf("确认控制的项目") > 0) {
                            msg = "您好，您正在确认的采购订单由于采购员没有添加确认设置，请联系采购员修改订单！";
                        } else if (msg.indexOf("取消数量与派车数量之和超出申请数量") > 0) {
                            msg = "请联系金风采购工程师取消相应派车单数量！";
                        }
                    }
                    // 调用具体的回调
                    return callback.errorCallBack(returnMsg.getiGuid(), bapiReturn);
//                    throw new BusinessException(msg);
                    // throw new BusinessException("系统错误，请联系系统管理员!");
                } else {
                    // 调用具体的回调
                    return callback.getCallBack(returnMsg.getiGuid(), bapiReturn);
                }
            }

        }
        throw new BusinessException("调用SAP超时，请联系管理员处理！");
    }

    public Object execute(PoBapiCallBack callback) {
        // 保存接口日志
        recodInterface(callback.getInterfaceStatus());

        // 调用保存函数
        Object bapiReturn = callback.callBapi();

        // 取返回值
        return innerGetCallBack(callback, bapiReturn);
    }

}


