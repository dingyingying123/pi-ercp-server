/**
 * Copyright 2018 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.task.service;

import cn.com.personnel.ercp.task.module.QuartzEntity;
import cn.com.personnel.ercp.task.persistence.entiy.QrtzExecuteLog;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

import java.util.List;

/**
 * @author 33925
 *
 */

public interface IJobDetailService {


	List<QuartzEntity> listQuartzEntity(String name, PagenationQueryParameter pageParam) throws Exception;

	QuartzEntity getJobTaskByCondition(QuartzEntity entity, PagenationQueryParameter pageParam) throws Exception;
	
	void saveQrtzLog(QrtzExecuteLog log);
	
	List<QrtzExecuteLog> getQrtzLog(QrtzExecuteLog logParam, PagenationQueryParameter pageParam);

}
