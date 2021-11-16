package cn.com.personnel.ercp.pi.persistence.mapper.base;

import cn.com.personnel.ercp.pi.module.base.FssBaseRoleOrganVO;
import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseRoleOrgan;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FssBaseRoleOrganMapper extends BaseMapper<FssBaseRoleOrgan> {
    List<FssBaseRoleOrganVO> queryRoleOrganList(FssBaseRoleOrganVO fssBaseRoleOrgan);

    List<String> queryOrganByRole(@Param("roleId") String roleId);

    FssBaseRoleOrgan selectOrganByRoleIdByBukrs(FssBaseRoleOrgan fssBaseRoleOrgan);
}