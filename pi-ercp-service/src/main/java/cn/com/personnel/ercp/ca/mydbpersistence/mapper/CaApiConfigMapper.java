package cn.com.personnel.ercp.ca.mydbpersistence.mapper;

import cn.com.personnel.ercp.ca.module.CaApiConfigVo;
import cn.com.personnel.ercp.ca.mydbpersistence.entity.CaApiConfig;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaApiConfigMapper extends BaseMapper<CaApiConfig> {
    List<CaApiConfigVo> queryCallNum(@Param("userid")String userid, @Param("api")String api);
}