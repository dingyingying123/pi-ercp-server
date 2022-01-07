package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiSignInInfo;

public interface ISignInService {
    ReturnEntity queryLastSignIn(SecUser secUser);

    ReturnEntity saveLastSignIn(PiSignInInfo piSignInInfo, SecUser secUser);

    ReturnEntity queryTodaySignIn(SecUser secUser);
}
