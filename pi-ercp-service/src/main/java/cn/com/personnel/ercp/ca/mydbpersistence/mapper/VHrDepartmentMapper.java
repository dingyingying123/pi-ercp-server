package cn.com.personnel.ercp.ca.mydbpersistence.mapper;

import cn.com.personnel.ercp.ca.mydbpersistence.entity.DepartmentJson;
import cn.com.personnel.ercp.ca.mydbpersistence.entity.VHrDepartment;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface VHrDepartmentMapper extends BaseMapper<VHrDepartment> {

    /**
     * 获取部门信息
     * 
     * @param orgeh
     * @return
     */
    VHrDepartment findByOrgeh(@Param("orgeh") String orgeh);

    /**
     * 获取下级组织信息
     * 
     * @param deptId
     *            本级组织ID
     * @param parentId
     *            列表中的上级组织ID
     * @return
     */
    List<DepartmentJson> findChildDepartment(@Param("deptId") String deptId, @Param("parentId") String parentId);

    /**
     * 是否有下级组织
     * 
     * @param deptId
     *            本级组织ID
     * @return
     */
    int hasChildDepartment(@Param("deptId") String deptId);
    
    /**
     * 查询本级组织
     * 
     * @param deptId
     *            本级组织ID
     * @return
     */
    DepartmentJson findDepartment(@Param("deptId") String deptId);

    public List<Map<String,String>> queryDutySubject(@Param("orgCode") String orgCode, @Param("orgName") String orgName);

}