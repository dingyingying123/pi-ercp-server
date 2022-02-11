package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerEstimateInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerTakeCaseInfoVO;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

public interface IEstimateService {
    ReturnEntity queryEstimateList(ServerEstimateInfoVO serverEstimateInfoVO, PagenationQueryParameter buildPagenation);

    ReturnEntity queryEstimateInfo(ServerEstimateInfoVO serverEstimateInfoVO);

    ReturnEntity querySubmitTaskCaseList(ServerTakeCaseInfoVO serverTakeCaseInfoVO, PagenationQueryParameter buildPagenation);

    ReturnEntity saveEstimateInfo(ServerEstimateInfoVO serverEstimateInfoVO, SecUser secUser);

    ReturnEntity deleteEstimateInfo(ServerEstimateInfoVO serverEstimateInfoVO);

    ReturnEntity submitEstimateInfo(ServerEstimateInfoVO serverEstimateInfoVO, SecUser secUser);

    ReturnEntity getLetterNumber();
}
