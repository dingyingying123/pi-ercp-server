package cn.com.personnel.ercp.auth.persistence.mapper;

import cn.com.personnel.ercp.auth.persistence.entity.CesButton;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CesButtonMapper extends BaseMapper<CesButton> {

    int add(@Param("cesButton") CesButton cesButton);

    int remove(@Param("id") String id);

    int modify(@Param("cesButton") CesButton cesButton);

    List<CesButton> query(@Param("isdelete") short isdelete, @Param("buttonType") String buttonType, @Param("buttonName") String buttonName);

    List<CesButton> selectByCondition(@Param("systemCode") String systemCode);

    List<CesButton> selectAllButton();
}