/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.persistence.entity.SecRoleButton;
import cn.com.personnel.ercp.auth.persistence.entity.SecRoleModule;
import cn.com.personnel.ercp.auth.persistence.entity.SecRouterButton;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRoleButtonMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRoleModuleMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRouterButtonMapper;
import cn.com.personnel.ercp.auth.service.ISecRoleModuleService;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 33925
 *
 */
@Component
public class SecRoleModuleService extends BaseService implements ISecRoleModuleService {
    @Autowired
    private SecRoleModuleMapper secRoleModuleMapper;
    @Autowired
    SecRouterButtonMapper secRouterButtonMapper;
    @Autowired
    SecRoleButtonMapper secRoleButtonMapper;
    
    @Transactional(rollbackForClassName = "Exception")
    public void saveRoleModuleRecords(String appCode, List<SecRoleModule> records, String roleId, SecUser user) {
        //批量删除
        int res  = secRoleModuleMapper.deleteByRoleId(roleId);
        //批量插入
        if(records!=null&&records.size()>0) {
            
            for(SecRoleModule secRoleModule: records) {
               
                secRoleModule.setId( UUID.randomUUID().toString().replaceAll("-", ""));
                secRoleModule.setCreateTime(new Date());
                secRoleModule.setCreator(user.getUserName());
                secRoleModule.setUpdateTime(new Date());
                secRoleModule.setUpdator(user.getUserName());
                secRoleModuleMapper.insert(secRoleModule);
                
            }
        }
    }

    @Transactional(rollbackForClassName = "Exception")
    public void roleSave(String appCode, List<String> moduleIds, String roleId, SecUser user) {
        //获取新添加的菜单
        List<String> usedModuleIds = secRoleModuleMapper.getNewModuleIdList(roleId, moduleIds);
        //批量删除
        int res  = secRoleModuleMapper.deleteByRoleId(roleId);
        //批量插入
        if(moduleIds!=null&&moduleIds.size()>0) {
            for(String  moduleId: moduleIds) {
                SecRoleModule secRoleModule = new SecRoleModule();
                secRoleModule.setId( UUID.randomUUID().toString().replaceAll("-", ""));
                secRoleModule.setCreateTime(new Date());
                secRoleModule.setCreator(user.getUserName());
                secRoleModule.setUpdateTime(new Date());
                secRoleModule.setUpdator(user.getUserName());
                secRoleModule.setModuleId(moduleId);
                secRoleModule.setRoleId(roleId);
                secRoleModuleMapper.insert(secRoleModule);

            }
        }
        List<String> newModuleIds = new ArrayList<>();
        for(String id : moduleIds){
            if(!usedModuleIds.contains(id)){
                newModuleIds.add(id);
            }
        }
        //默认都是给全部按钮权限
        if(newModuleIds.size() > 0){
            List<SecRouterButton> buttonList = secRouterButtonMapper.getButtonsByModuleIds(ApplicationConfig.APP_CODE, roleId, newModuleIds);
            if(buttonList.size() > 0){
                for(SecRouterButton button : buttonList){
                    SecRoleButton secRoleButton = new SecRoleButton();
                    secRoleButton.setId(UUIDKit.getUUID());
                    secRoleButton.setIsdelete(0);
                    secRoleButton.setAppcod(ApplicationConfig.APP_CODE);
                    secRoleButton.setRoleId(roleId);
                    secRoleButton.setRouterId(button.getRouterId());
                    secRoleButton.setButtonId(button.getId());
                    secRoleButtonMapper.insert(secRoleButton);
                }
            }
        }
    }
}
