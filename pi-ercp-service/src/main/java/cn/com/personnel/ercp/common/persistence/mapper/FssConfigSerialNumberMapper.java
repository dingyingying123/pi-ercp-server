package cn.com.personnel.ercp.common.persistence.mapper;


import cn.com.personnel.ercp.common.persistence.entity.FssConfigSerialNumber;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * TODO
 *
 * @author DongAiHua
 * @Date 2020/10/21 19:54
 */
public interface FssConfigSerialNumberMapper extends BaseMapper<FssConfigSerialNumber> {

    FssConfigSerialNumber selMaxSerialNoInfo(@Param("headNo") String headNo);

    //int  addFssConfigSerialNumbers(FssConfigSerialNumber fssConfigSerialNumber);


}
