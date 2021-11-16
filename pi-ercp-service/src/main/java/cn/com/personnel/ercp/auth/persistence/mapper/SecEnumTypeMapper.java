package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.SecEnumType;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecEnumTypeMapper extends BaseMapper<SecEnumType> {
    /**
     * 模糊查询
     * @param secEnumType
     * @return
     */
    public List<SecEnumType> selectByCondition(SecEnumType secEnumType);
    /**
     *
     * 查询所有没删除的
     * @param secEnumType
     * @return
     */
    public List<SecEnumType> selectId(@Param("secEnumType") SecEnumType secEnumType);


    public int deletedEnumType(@Param("typeIds")List<String> typeIds);
}