package cn.com.personnel.ercp.auth.impl;


import cn.com.personnel.ercp.auth.persistence.entity.SecRouterButton;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRoleButtonMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRouterButtonMapper;
import cn.com.personnel.ercp.auth.service.ISecRouterButtonService;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SecRouterButtonService extends BaseService implements ISecRouterButtonService {
    @Autowired
    private SecRouterButtonMapper secRouterButtonMapper;
    @Autowired
    private SecRoleButtonMapper secRoleButtonMapper;
    @Override
    public String insertRouterButton(SecRouterButton secRouterButton, String appCode) {
        secRouterButton.setAppcod(appCode);
        String uuid = UUIDKit.getUUID();
        secRouterButton.setId(uuid);
        secRouterButton.setIsdelete(0);
        secRouterButtonMapper.insert(secRouterButton);
        return uuid;
    }

    @Override
    public void deleteRouterButton(SecRouterButton secRouterButton) {
        secRouterButton.setIsdelete(1);
        secRouterButtonMapper.updateByPrimaryKeySelective(secRouterButton);
    }

    @Override
    public void updateRouterButton(SecRouterButton secRouterButton) {
        secRouterButtonMapper.updateByPrimaryKey(secRouterButton);
    }

    @Override
    public List<SecRouterButton> getRouterButtonList(SecRouterButton secRouterButton, String appCode) {
        secRouterButton.setAppcod(appCode);
        return secRouterButtonMapper.getRouterButtonList(secRouterButton);
    }

    @Override
    public SecRouterButton selectOne(SecRouterButton secRouterButton, String appCode) {
        SecRouterButton selectOne = new SecRouterButton();
        selectOne.setAppcod(appCode);
        selectOne.setRouterId(secRouterButton.getRouterId());
        selectOne.setButton(secRouterButton.getButton());
        return secRouterButtonMapper.selectOne(selectOne);
    }
}
