package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.SecEnum;
import cn.com.personnel.ercp.auth.persistence.entity.SecEnumType;
import cn.com.personnel.ercp.pi.module.base.SecEnumTypeVO;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecEnumMapper extends BaseMapper<SecEnum> {
    /**
     * 根据父id查询
     * @param secEnum
     * @return
     */
    public List<SecEnum> queryRoleUser(SecEnum secEnum);

    /**
     * 模糊查询
     * @param secEnum
     * @return
     */
    public List<SecEnum> selectName(SecEnum secEnum);

    /**
     * 修改删除标记
     */
    public  int deleteEnum(@Param("ids")List<String> ids);


    List<SecEnum> selectEnumByKey(@Param("key") String key, @Param("system") String system);
    /**
     * @Description: 包括删除的数据
     * @Param:
     * @return:
     * @Author: tuojiajia
     * @Date: 2019/10/31
     */
    List<SecEnum> selectEnumByKeyAll(@Param("key") String key, @Param("system") String system);
    /**
     * 根据系统、类型的key，字表中的名字查查字典数据
     * @param secEnumType
     * @return
     */
    SecEnum selectEnumByKeyByEnlName(@Param("secEnumType") SecEnumType secEnumType);

    /**
     * 根据系统、类型的key，字表中的名字查查字典数据
     * @param secEnumType
     * @return
     */
    SecEnum selectEnumByKeyByEnglistName(@Param("secEnumType") SecEnumTypeVO secEnumType);


    List<String> selectNameByKeyByEnlName(@Param("secEnumType") SecEnumType enumType);
}