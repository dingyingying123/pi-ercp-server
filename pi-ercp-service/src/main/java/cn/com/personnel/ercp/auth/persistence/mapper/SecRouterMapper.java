package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.SecRouter;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecRouterMapper extends BaseMapper<SecRouter> {

    List <SecRouter> selectRouting(@Param("appcod") String appcod, @Param("valid") String valid);

    int updateRouting(@Param("secRouter") SecRouter secRouter);

    int deleteRouting(@Param("id") String id);

    List<SecRouter> selectCondition(@Param("secRouter") SecRouter secRouter);

    SecRouter getOne(@Param("id") String id);

}