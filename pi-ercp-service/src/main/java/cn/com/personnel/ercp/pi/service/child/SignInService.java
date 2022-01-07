package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiSignInInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiSignInInfoMapper;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SignInService extends BaseService implements ISignInService {
    @Autowired
    PiSignInInfoMapper piSignInInfoMapper;

    @Override
    public ReturnEntity queryLastSignIn(SecUser secUser) {
        PiSignInInfo piSignInInfo = piSignInInfoMapper.queryLastSignIn(secUser.getUserId(), null);
        return ReturnEntity.ok(piSignInInfo);
    }

    @Override
    public ReturnEntity saveLastSignIn(PiSignInInfo piSignInInfo, SecUser secUser) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        piSignInInfo.setSignId(UUIDKit.getUUID());
        piSignInInfo.setUserId(secUser.getUserId());
        piSignInInfo.setSignDate(sdf.format(new Date()));
        piSignInInfo.setCreator(secUser.getUserId());
        piSignInInfo.setCreateTime(new Date());
        piSignInInfoMapper.insert(piSignInInfo);
        return ReturnEntity.ok(piSignInInfo);
    }

    /**
     * 当天是否签到  0否 1是
     * @param secUser
     * @return
     */
    @Override
    public ReturnEntity queryTodaySignIn(SecUser secUser) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        PiSignInInfo piSignInInfo = piSignInInfoMapper.queryLastSignIn(secUser.getUserId(), sdf.format(new Date()));
        if(piSignInInfo != null){
            return ReturnEntity.ok("1");
        }
        return ReturnEntity.ok("0");
    }

}
