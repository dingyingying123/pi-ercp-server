/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.wbs.service;

import cn.com.personnel.ercp.pi.wbs.module.CallBackMsg;
import cn.com.personnel.ercp.pi.wbs.module.IvMsgHeader;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * @author 33925
 *
 */
@WebService
public interface ICommonCallBackService {

    public void callBack(@WebParam(name = "IvMsgHeader") IvMsgHeader ivMsgHeader,
                         @WebParam(name = "flag") String flag, @WebParam(name = "callBackMsgs") List<CallBackMsg> callBackMsgs);
}
