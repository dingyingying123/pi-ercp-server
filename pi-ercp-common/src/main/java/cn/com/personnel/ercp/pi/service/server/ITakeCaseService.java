package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerTakeCaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

public interface ITakeCaseService {
    ReturnEntity queryTakeCaseList(ServerTakeCaseInfoVO serverTakeCaseInfoVO, PagenationQueryParameter pagenationQueryParameter);

    ReturnEntity queryTakeCaseInfo(ServerTakeCaseInfoVO serverTakeCaseInfoVO);

    ReturnEntity saveTakeCaseInfo(ServerTakeCaseInfoVO serverTakeCaseInfoVO, SecUser secUser);

    ReturnEntity deleteTakeCaseInfo(ServerTakeCaseInfoVO serverTakeCaseInfoVO);

    ReturnEntity submitTakeCaseInfo(ServerTakeCaseInfoVO serverTakeCaseInfoVO, SecUser secUser);

    ReturnEntity queryChildApprovedList(PiChildrenBaseInfo piChildrenBaseInfo, PagenationQueryParameter buildPagenation);
}
