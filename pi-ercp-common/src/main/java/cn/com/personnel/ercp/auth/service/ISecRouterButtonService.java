package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecRouterButton;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;

public interface ISecRouterButtonService extends IService {
    String insertRouterButton(SecRouterButton secRouterButton, String appCode);
    void deleteRouterButton(SecRouterButton secRouterButton);
    void updateRouterButton(SecRouterButton secRouterButton);
    List<SecRouterButton> getRouterButtonList(SecRouterButton secRouterButton, String appCode);
    SecRouterButton selectOne(SecRouterButton secRouterButton, String appCode);
}
