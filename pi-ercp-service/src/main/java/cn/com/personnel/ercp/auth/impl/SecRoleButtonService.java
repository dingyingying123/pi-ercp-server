package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.persistence.entity.SecRoleButton;
import cn.com.personnel.ercp.auth.persistence.entity.SecRouterButton;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRoleButtonMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRouterButtonMapper;
import cn.com.personnel.ercp.auth.service.ISecRoleButtonService;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SecRoleButtonService extends BaseService implements ISecRoleButtonService {
    @Autowired
    private SecRoleButtonMapper secRoleButtonMapper;
    @Autowired
    private SecRouterButtonMapper secRouterButtonMapper;
    @Override
    public void insertRoleButton(SecRoleButton secRoleButton, String appCode) {
        secRoleButton.setAppcod(appCode);
        secRoleButton.setId(UUIDKit.getUUID());
        secRoleButton.setIsdelete(0);
        secRoleButtonMapper.insert(secRoleButton);
    }

    @Override
    public void deleteRoleButton(SecRoleButton secRoleButton) {
        secRoleButton.setIsdelete(1);
        secRoleButtonMapper.updateByPrimaryKeySelective(secRoleButton);
    }

    @Override
    public void updateRoleButton(SecRoleButton secRoleButton) {
        secRoleButtonMapper.updateByPrimaryKeySelective(secRoleButton);
    }

    @Override
    public Map<String,Object> getRoleButtonList(SecRoleButton secRoleButton, String appCode) {
        SecRouterButton secRouterButton = new SecRouterButton();
        secRouterButton.setAppcod(appCode);
        secRouterButton.setRouterId(secRoleButton.getRouterId());
        secRoleButton.setAppcod(appCode);
        List<SecRoleButton> roleButtonList = secRoleButtonMapper.getRoleButtonList(secRoleButton);
        List<String> roleButton = new ArrayList<>();
        for(SecRoleButton button:roleButtonList){
            String id = button.getButtonId();
            roleButton.add(id);
        }
        List<SecRouterButton> routerButtonList = secRouterButtonMapper.getRouterButtonList(secRouterButton);
        Map<String,Object> map = new HashMap<>();
        map.put("allButton",routerButtonList);
        map.put("roleButton",roleButton);
        return map;
    }

    @Override
    public List<SecRoleButton> save(List<SecRoleButton> list, String appCode) {
        String roleId = list.get(0).getRoleId();
        String routerId = list.get(0).getRouterId();
        secRoleButtonMapper.deleteByRoleIdAndRouterId(roleId,routerId);
        for(SecRoleButton secRoleButton:list){
            secRoleButton.setAppcod(appCode);
            secRoleButton.setId(UUIDKit.getUUID());
            secRoleButton.setIsdelete(0);
            secRoleButtonMapper.insert(secRoleButton);
        }
        SecRoleButton select = new SecRoleButton();
        select.setRoleId(roleId);
        select.setRouterId(routerId);
        select.setAppcod(appCode);
        return secRoleButtonMapper.getRoleButtonList(select);
    }
}
