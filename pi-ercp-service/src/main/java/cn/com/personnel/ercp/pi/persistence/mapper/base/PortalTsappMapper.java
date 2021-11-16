package cn.com.personnel.ercp.pi.persistence.mapper.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.PortalTsapp;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PortalTsappMapper extends BaseMapper<PortalTsapp> {
    List<Map> getServiceInfo(@Param("appCod") String appCod);
}