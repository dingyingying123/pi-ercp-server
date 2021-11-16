/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.wbs.service.impl;

import cn.com.personnel.ercp.pi.wbs.module.IvMsgHeader;
import cn.com.personnel.ercp.pi.wbs.module.ResponseMsgHeader;
import cn.com.personnel.ercp.pi.wbs.module.baseData.BaseCompany;
import cn.com.personnel.ercp.pi.wbs.service.IBaseCompanyService;
import cn.com.personnel.springboot.framework.kit.JsonKit;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

/**
 * @author 33925
 *
 */
@Component
@WebService(targetNamespace = "http://service.ercp.goldwind.com.cn/",
            endpointInterface = "cn.com.personnel.ercp.pi.wbs.service.IBaseCompanyService")
public class BaseCompanyService extends BaseService implements IBaseCompanyService {

    @Override
    public ResponseMsgHeader companyCallBack(IvMsgHeader ivMsgHeader, String flag, List<BaseCompany> baseCompany) {
        logger.info("===ivMsgHeader===" + JsonKit.toJson(ivMsgHeader) + "===flag===" + flag + "===baseCompany==="
                + baseCompany);
        ResponseMsgHeader rs = new ResponseMsgHeader();

        // 更新状态
        logger.info("======IBaseCompanyService deliverCreateBack method======");
        logger.info("IvMsgHeader = " + ivMsgHeader);
        logger.info("flag = " + flag);
        logger.info("baseCompany = " + baseCompany);
        logger.info("===================================================");
        // 更新asn抬头信息
        try {
//            if (baseCompany != null) {
//                logger.info("===================================================");
//                logger.info("baseCompany = " + baseCompany);
//                logger.info("===================================================");
//
//                List<IspBaseCompany> insIspCompanyMainDatalist = new ArrayList<IspBaseCompany>();
//                List<IspBaseCompany> updIspCompanyMainDatalist = new ArrayList<IspBaseCompany>();
//                // 是否存在区分处理
//                List<IspBaseCompany> ispBaseCompanyListTem = ispBaseCompanyMapper.selectAll();
//                for (BaseCompany baseCompanyTem : baseCompany) {
//                    int i = 0;
//                    IspBaseCompany ispBaseCompany = new IspBaseCompany();
//                    if (ispBaseCompanyListTem.size() > 0) {
//                        for (IspBaseCompany ispBaseCompanyTem : ispBaseCompanyListTem) {
//                            if (ispBaseCompanyTem.getBukrs().equals(baseCompanyTem.getBukrs())) {
//                                ispBaseCompany.setCompanyId(ispBaseCompanyTem.getCompanyId());
//                                i = 1;
//                                break;
//                            }
//                        }
//                    }
//
//                    ispBaseCompany.setSynctime(new Date());
//
//                    if (StringUtil.isNotEmpty(baseCompanyTem.getBukrs())) {
//                        ispBaseCompany.setBukrs(baseCompanyTem.getBukrs());
//                    }
//
//                    if (StringUtil.isNotEmpty(baseCompanyTem.getButxt())) {
//                        ispBaseCompany.setButxt(baseCompanyTem.getButxt());
//                    }
//
//                    if (StringUtil.isNotEmpty(baseCompanyTem.getBukrs_street())) {
//                        ispBaseCompany.setBukrsStreet(baseCompanyTem.getBukrs_street());
//                    }
//
//                    if (StringUtil.isNotEmpty(baseCompanyTem.getZreserve_i_f1())) {
//                        ispBaseCompany.setZreserveIF1(baseCompanyTem.getZreserve_i_f1());
//                    }
//
//                    if (StringUtil.isNotEmpty(baseCompanyTem.getZreserve_i_f2())) {
//                        ispBaseCompany.setZreserveIF2(baseCompanyTem.getZreserve_i_f2());
//                    }
//
//                    if (StringUtil.isNotEmpty(baseCompanyTem.getZreserve_i_f3())) {
//                        ispBaseCompany.setZreserveIF3(baseCompanyTem.getZreserve_i_f3());
//
//                    }
//                    if (StringUtil.isNotEmpty(baseCompanyTem.getStceg())) {
//                        ispBaseCompany.setStceg(baseCompanyTem.getStceg());
//                    }
//
//                    if (i == 0) {
//                        ispBaseCompany.setCompanyId(UUIDKit.getUUID());
//                        insIspCompanyMainDatalist.add(ispBaseCompany);
//                    } else {
//                        updIspCompanyMainDatalist.add(ispBaseCompany);
//                    }
//                }
//                if (insIspCompanyMainDatalist.size() > 0) {
//                    for (IspBaseCompany ispCompanyMainDatatem : insIspCompanyMainDatalist) {
//                        int row = ispBaseCompanyMapper.insert(ispCompanyMainDatatem);
//                        if (row > 0) {
//                            logger.info("insert ispCompanyMainDatatem success!ispCompanyMainDatatem = "
//                                    + ispCompanyMainDatatem);
//                        } else {
//                            logger.info("insert ispCompanyMainDatatem failed!ispCompanyMainDatatem = "
//                                    + ispCompanyMainDatatem);
//                        }
//                    }
//                }
//                if (updIspCompanyMainDatalist.size() > 0) {
//                    for (IspBaseCompany ispCompanyMainDatatem : updIspCompanyMainDatalist) {
//                        int row = ispBaseCompanyMapper.updateByPrimaryKey(ispCompanyMainDatatem);
//                        if (row > 0) {
//                            logger.info("update ispCompanyMainDatatem success!ispCompanyMainDatatem = "
//                                    + ispCompanyMainDatatem);
//                        } else {
//                            logger.info("update ispCompanyMainDatatem failed!ispCompanyMainDatatem = "
//                                    + ispCompanyMainDatatem);
//                        }
//                    }
//                }
//            }
            rs.setCode("S");
            rs.setMsg("同步成功");
            return rs;
        } catch (Exception e) {
            logger.error("===BaseCompanyService callBack===", e);
            rs.setCode("E");
            rs.setMsg("出现错误");
            return rs;
        }
    }
}
