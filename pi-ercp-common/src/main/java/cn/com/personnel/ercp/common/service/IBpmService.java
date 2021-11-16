/**
 * Copyright 2019 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.autoconfig.ProcessOption;
import cn.com.personnel.ercp.common.autoconfig.ToDoVo;
import cn.com.personnel.ercp.common.module.WorkFlow;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;

/**
 * @author 33925
 *
 */
public interface IBpmService extends IService {

    ReturnEntity queryWorkItemTask(SecUser secUser, WorkFlow workFlow);

    ToDoVo queryWorkItem(SecUser secUser, WorkFlow workFlow);

    String getTaskRoute(ReturnEntity returnEntity, ToDoVo toDoVo, String type);

    ReturnEntity queryTaskUrl(String processInstID);

    ReturnEntity queryProcessesTask(WorkFlow workFlow);

    ToDoVo queryProcesses(String processInstID);

    List<ProcessOption> queryApprovalAndWorkItemName(String processInstID);

    void addUser(SecUser secUser);
    ReturnEntity queryExpiredUndoTask(SecUser secUser, PagenationQueryParameter buildPagenation);

    ReturnEntity queryApproval(String id);

    ReturnEntity queryApprovalByInstId(String instId);
}
