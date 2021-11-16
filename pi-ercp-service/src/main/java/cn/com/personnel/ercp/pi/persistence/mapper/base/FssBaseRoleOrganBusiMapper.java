package cn.com.personnel.ercp.pi.persistence.mapper.base;

import cn.com.personnel.ercp.pi.module.base.FssBaseRoleOrganVO;
import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseRoleOrganBusi;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FssBaseRoleOrganBusiMapper extends BaseMapper<FssBaseRoleOrganBusi> {
    List<String> queryOrganByRole(@Param("roleId") String roleId);

    List<FssBaseRoleOrganVO> queryRoleOrganList(FssBaseRoleOrganVO fssBaseRoleOrgan);

    void deleteOrganList(@Param("fssBaseRoleOrganNusiList") List<FssBaseRoleOrganBusi> fssBaseRoleOrganNusiList);
}