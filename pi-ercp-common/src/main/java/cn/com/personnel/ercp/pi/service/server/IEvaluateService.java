package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerEvaluateInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerInterviewInterventionVO;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

public interface IEvaluateService {
    ReturnEntity queryEvaluateList(ServerEvaluateInfoVO serverEvaluateInfoVO, PagenationQueryParameter buildPagenation);

    ReturnEntity queryEvaluateInfo(ServerEvaluateInfoVO serverEvaluateInfoVO);

    ReturnEntity querySubmitInterviewInterventionList(ServerInterviewInterventionVO serverInterviewInterventionVO, PagenationQueryParameter buildPagenation);

    ReturnEntity saveEvaluateInfo(ServerEvaluateInfoVO serverEvaluateInfoVO, SecUser secUser);

    ReturnEntity submitEvaluateInfo(ServerEvaluateInfoVO serverEvaluateInfoVO, SecUser secUser);

    ReturnEntity deleteEvaluateInfo(ServerEvaluateInfoVO serverEvaluateInfoVO);

    ReturnEntity getLetterNumber();
}
