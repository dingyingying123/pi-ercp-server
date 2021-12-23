package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

import java.util.List;

public interface IPiChildrenBaseInfoService {
    ReturnEntity queryPiChildrenBaseInfoList(PiChildrenBaseInfo piChildrenBaseInfo, PagenationQueryParameter buildPagenation);

    ReturnEntity savePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser);

    ReturnEntity deletePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser);

    ReturnEntity submitPiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser);

    ReturnEntity submitPiChildrenBaseInfoList(List<PiChildrenBaseInfo> piChildrenBaseInfoList, SecUser secUser);

    ReturnEntity approvePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser);
}
