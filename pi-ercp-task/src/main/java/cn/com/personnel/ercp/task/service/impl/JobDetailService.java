package cn.com.personnel.ercp.task.service.impl;

import cn.com.personnel.ercp.task.module.QuartzEntity;
import cn.com.personnel.ercp.task.persistence.entiy.QrtzExecuteLog;
import cn.com.personnel.ercp.task.persistence.mapper.JobDetailMapper;
import cn.com.personnel.ercp.task.persistence.mapper.QrtzExecuteLogMapper;
import cn.com.personnel.ercp.task.service.IJobDetailService;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class JobDetailService extends BaseService implements IJobDetailService {

	@Autowired
	private JobDetailMapper jobDetailMapper;
	
	@Autowired
	private QrtzExecuteLogMapper qrtzLogMapper;
	
	@Override
	public List<QuartzEntity> listQuartzEntity(String name, PagenationQueryParameter pageParam)throws Exception{
		 setPageHelper(pageParam);
	    return jobDetailMapper.listQuartzEntity(name);
	}
	
	
	@Override    
	public QuartzEntity getJobTaskByCondition(QuartzEntity entity, PagenationQueryParameter pageParam) throws Exception {
	    return jobDetailMapper.getJobTaskByCondition(entity);
	}


	@Override
	public void saveQrtzLog(QrtzExecuteLog log) {
		qrtzLogMapper.insert(log);	
	}


	@Override
	public List<QrtzExecuteLog> getQrtzLog(QrtzExecuteLog logParam, PagenationQueryParameter pageParam) {
		 setPageHelper(pageParam);
		 if(logParam.getCreateTime() != null){
		     logParam.setStartTime(logParam.getCreateTime());
		     Calendar calendar = Calendar.getInstance();
		     calendar.setTime(logParam.getCreateTime());
		     calendar.add(Calendar.DATE, 1);
		     logParam.setEndTime(calendar.getTime()); 
		 }
		return qrtzLogMapper.queryQrtzLog(logParam);
	}

}
