package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerEstimateInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerPlanInfoVO;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

public interface IPlanService {
    ReturnEntity queryPlanList(ServerPlanInfoVO serverPlanInfoVO, PagenationQueryParameter buildPagenation);

    ReturnEntity queryPlanInfo(ServerPlanInfoVO serverPlanInfoVO);

    ReturnEntity querySubmitEstimateList(ServerEstimateInfoVO serverEstimateInfoVO, PagenationQueryParameter buildPagenation);

    ReturnEntity savePlanInfo(ServerPlanInfoVO serverPlanInfoVO, SecUser secUser);

    ReturnEntity deletePlanInfo(ServerPlanInfoVO serverPlanInfoVO);

    ReturnEntity submitPlanInfo(ServerPlanInfoVO serverPlanInfoVO, SecUser secUser);

    ReturnEntity getLetterNumber();
}
