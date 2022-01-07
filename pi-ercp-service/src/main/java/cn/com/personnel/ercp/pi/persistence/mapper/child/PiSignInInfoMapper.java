package cn.com.personnel.ercp.pi.persistence.mapper.child;

import cn.com.personnel.ercp.pi.persistence.entity.child.PiSignInInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface PiSignInInfoMapper extends BaseMapper<PiSignInInfo> {
    PiSignInInfo queryLastSignIn(@Param("userId") String userId, @Param("signDate") String signDate);
}