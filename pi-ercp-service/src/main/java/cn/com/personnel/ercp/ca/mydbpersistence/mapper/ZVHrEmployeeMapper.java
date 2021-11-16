package cn.com.personnel.ercp.ca.mydbpersistence.mapper;

import cn.com.personnel.ercp.ca.mydbpersistence.entity.ZVHrEmployee;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ZVHrEmployeeMapper extends BaseMapper<ZVHrEmployee> {

    
    /**
     * 查询所有
     * @return
     */
    public List<ZVHrEmployee> VHrEmployeeAll();
    /**
     * 通过key去查
     */
    public List<ZVHrEmployee> VHrEmployeeKey(@Param("createTime") Date createTime);
    
}