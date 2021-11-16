package cn.com.personnel.ercp.task.persistence.mapper;


import cn.com.personnel.ercp.task.module.QuartzEntity;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;


public interface JobDetailMapper extends BaseMapper<QuartzEntity>{

    public List<QuartzEntity> listQuartzEntity(String name) throws Exception;

    public QuartzEntity getJobTaskByCondition(QuartzEntity entity) throws Exception;

}
