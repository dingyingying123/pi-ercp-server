package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerCaseClosedInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerEvaluateInfoVO;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

public interface ICaseCloseService {
    ReturnEntity queryCaseClosedList(ServerCaseClosedInfoVO serverCaseClosedInfoVO, PagenationQueryParameter buildPagenation);

    ReturnEntity queryCaseClosedInfo(ServerCaseClosedInfoVO serverCaseClosedInfoVO);

    ReturnEntity querySubmitEvaluateList(ServerEvaluateInfoVO serverEvaluateInfoVO, PagenationQueryParameter buildPagenation);

    ReturnEntity saveCaseClosedInfo(ServerCaseClosedInfoVO serverCaseClosedInfoVO, SecUser secUser);

    ReturnEntity submitCaseClosedInfo(ServerCaseClosedInfoVO serverCaseClosedInfoVO, SecUser secUser);

    ReturnEntity deleteCaseClosedInfo(ServerCaseClosedInfoVO serverCaseClosedInfoVO);
}
