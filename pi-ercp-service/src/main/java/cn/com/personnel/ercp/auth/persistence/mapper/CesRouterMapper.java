package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.CesRouter;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CesRouterMapper extends BaseMapper<CesRouter> {

    List <CesRouter> selectRouting(@Param("appcod") String appcod, @Param("valid") String valid);

    int updateRouting(@Param("cesRouter") CesRouter cesRouter);

    int deleteRouting(@Param("id") String id);

    List<CesRouter> selectCondition(@Param("cesRouter") CesRouter cesRouter);

    CesRouter getOne(@Param("id") String id);

}