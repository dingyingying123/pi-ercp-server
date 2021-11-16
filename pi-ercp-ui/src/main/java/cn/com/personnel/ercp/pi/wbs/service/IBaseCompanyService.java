/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.wbs.service;

import cn.com.personnel.ercp.pi.wbs.module.IvMsgHeader;
import cn.com.personnel.ercp.pi.wbs.module.ResponseMsgHeader;
import cn.com.personnel.ercp.pi.wbs.module.baseData.BaseCompany;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * @author 33925
 *
 */
@WebService
public interface IBaseCompanyService {

    @WebMethod
    public ResponseMsgHeader companyCallBack(@WebParam(name = "IvMsgHeader") IvMsgHeader ivMsgHeader,
                                             @WebParam(name = "flag") String flag, @WebParam(name = "baseCompany") List<BaseCompany> baseCompany);
}
