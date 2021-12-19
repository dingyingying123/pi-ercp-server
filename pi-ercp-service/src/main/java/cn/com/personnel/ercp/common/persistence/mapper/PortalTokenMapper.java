package cn.com.personnel.ercp.common.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.PortalToken;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface PortalTokenMapper extends BaseMapper<PortalToken> {
    public PortalToken getTokenByUserIDAndType(@Param("userId") String userId, @Param("tokenType") String tokenType);
}