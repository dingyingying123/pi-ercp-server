package cn.com.personnel.ercp.task.persistence.mapper;

import cn.com.personnel.ercp.task.persistence.entiy.QrtzExecuteLog;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QrtzExecuteLogMapper extends BaseMapper<QrtzExecuteLog> {
	public List<QrtzExecuteLog> queryQrtzLog(@Param("logParam") QrtzExecuteLog logParam);
}