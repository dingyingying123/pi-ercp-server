package cn.com.personnel.ercp.pi.persistence.mapper.process;

import cn.com.personnel.ercp.common.autoconfig.ToDoVo;
import cn.com.personnel.ercp.pi.persistence.entity.process.FssProcessReturnValue;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface FssProcessReturnValueMapper extends BaseMapper<FssProcessReturnValue> {
    FssProcessReturnValue selectProcessByPrimaryKey(@Param("key") String key);

    FssProcessReturnValue selectByInstID(@Param("processInstID") String processInstID);

    FssProcessReturnValue selectTodoProcess(@Param("toDoDetial") ToDoVo.ToDoDetial doDetial);


}