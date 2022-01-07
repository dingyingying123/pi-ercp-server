package cn.com.personnel.ercp.pi.service.group;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.persistence.entity.group.ServerGroupActivityInfo;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

public interface IGroupActivityService {

    ReturnEntity queryGroupActivityList(ServerGroupActivityInfo serverGroupActivityInfo, PagenationQueryParameter buildPagenation);

    ReturnEntity queryGroupActivityInfo(ServerGroupActivityInfo serverGroupActivityInfo);

    ReturnEntity saveGroupActivityInfo(ServerGroupActivityInfo serverGroupActivityInfo, SecUser secUser);

    ReturnEntity deleteGroupActivityInfo(ServerGroupActivityInfo serverGroupActivityInfo);

    ReturnEntity submitGroupActivityInfo(ServerGroupActivityInfo serverGroupActivityInfo, SecUser secUser);
}
