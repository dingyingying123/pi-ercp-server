package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

public interface IPiChildrenBaseInfoService {
    ReturnEntity queryPiChildrenBaseInfoList(PiChildrenBaseInfo piChildrenBaseInfo, PagenationQueryParameter buildPagenation);

    ReturnEntity savePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser);
}
