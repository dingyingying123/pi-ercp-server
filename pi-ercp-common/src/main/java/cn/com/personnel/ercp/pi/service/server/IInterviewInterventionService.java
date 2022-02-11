package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerInterviewInterventionVO;
import cn.com.personnel.ercp.pi.module.server.ServerPlanInfoVO;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

public interface IInterviewInterventionService {
    ReturnEntity queryInterviewInterventionList(ServerInterviewInterventionVO serverInterviewInterventionVO, PagenationQueryParameter buildPagenation);

    ReturnEntity queryInterviewInterventionInfo(ServerInterviewInterventionVO serverInterviewInterventionVO);

    ReturnEntity querySubmitPlanList(ServerPlanInfoVO serverPlanInfoVO, PagenationQueryParameter buildPagenation);

    ReturnEntity saveInterviewInterventionInfo(ServerInterviewInterventionVO serverInterviewInterventionVO, SecUser secUser);

    ReturnEntity submitInterviewInterventionInfo(ServerInterviewInterventionVO serverInterviewInterventionVO, SecUser secUser);

    ReturnEntity deleteInterviewInterventionInfo(ServerInterviewInterventionVO serverInterviewInterventionVO);

    ReturnEntity getLetterNumber();
}
