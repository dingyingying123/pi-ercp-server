package cn.com.personnel.ercp.common.controller;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.common.service.IHeadServerService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/headServer")
public class HeadServiceController extends PageController {

    @Autowired
    IHeadServerService headServerService;

    /**
     * 获取除本系统外的其它系统名称
     * @return
     */
    @RequestMapping("/getServiceInfo")
    @ResponseBody
    public ReturnEntity getServiceInfo(){
        return headServerService.getServiceInfo();
    }

    /**
     * 获取除本系统外的其它系统名称
     * @return
     */
    @RequestMapping("/openService/{key}")
    public String openService(@PathVariable("key") String key, HttpServletRequest request){
        SecUser secUser = (SecUser) getLoginUser();
        return headServerService.openService(key,request,secUser);
    }
}
