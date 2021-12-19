package cn.com.personnel.ercp.common.persistence.mapper;

import cn.com.personnel.ercp.auth.module.LoginInfoBean;
import cn.com.personnel.ercp.auth.persistence.entity.PortalLoginInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface PortalLoginInfoMapper extends BaseMapper<PortalLoginInfo> {

    /**
     * 统计登录信息
     * @param startDate
     * @param endDate
     * @return
     */
    public List<LoginInfoBean> countLoginInfo(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    /**
     * 登录信息
     * @param startDate
     * @param endDate
     * @return
     */
    public List<LoginInfoBean> getLoginInfo(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
