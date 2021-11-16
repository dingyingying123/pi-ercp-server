package cn.com.personnel.ercp.ca.mydbpersistence.mapper;

import cn.com.personnel.ercp.ca.mydbpersistence.entity.PeopleJson;
import cn.com.personnel.ercp.ca.mydbpersistence.entity.VHrEmployee;
import cn.com.personnel.ercp.ca.mydbpersistence.entity.ZVHrEmployee;
import cn.com.personnel.ercp.pi.persistence.entity.reportwork.FssReportWorkCompany;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface VHrEmployeeMapper extends BaseMapper<VHrEmployee> {
    /**
     * 获取员工信息
     * 
     * @param type
     * @return
     */
    public VHrEmployee findByPernr(@Param("pernr") String pernr);

    /**
     * 通过ID或姓名获取员工信息
     * 
     * @param type
     * @return
     */
    public List<VHrEmployee> findStaff(@Param("keyword") String keyword);

    /**
     * 根据选择参数筛选过滤员工信息
     * 
     * @param deptId
     * @param keyword
     * @return
     */
    public List<PeopleJson> findPeopleList(@Param("deptId") String deptId, @Param("keyword") String keyword);
    /**
     * 根据选择参数筛选过滤员工信息（移動端）
     *
     * @param type
     * @return
     */
    public List<PeopleJson> findAllPeopleList(@Param("keyword") String keyword);
    /**
     *根据工号查看人员详情
     * @param pernr
     * @return
     */
    PeopleJson peopleDetail(@Param("pernr") String pernr);

    /**
     * 根据员工编号查询所在单位
     * @param userId
     * @return
     */
    VHrEmployee findPeopleUnit(String pernr);

    /**
     * 根据部门id查询部门所有人员
     * @param unitId
     * @return
     */
    List<PeopleJson> findAllPeople(String unitId);
    
    /**
     * 查询所有
     * @return
     */
    public List<ZVHrEmployee> VHrEmployeeAll();
    /**
     * 通过key去查
     */
    public List<ZVHrEmployee> VHrEmployeeKey(@Param("createTime") Date createTime);

    /**
     * 获取人数
     * @param textNoList
     * @return
     */
    Integer getTotalNumberByDepartmentId(@Param("textNoList") List<String> textNoList);


    /**
     * 查询视图所有人员
     * @return
     */
    public List<ZVHrEmployee> VHrEmployeeAllList();

    /**
     * 获取可用公司主体以外的公司
     * @param availableCompanyCodes
     */
    List<FssReportWorkCompany> selectWerks(@Param("werksList") List<String> availableCompanyCodes);
}