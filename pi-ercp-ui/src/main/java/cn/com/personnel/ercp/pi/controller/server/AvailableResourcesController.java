package cn.com.personnel.ercp.pi.controller.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerAvailableResourcesInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerPlanInfoVO;
import cn.com.personnel.ercp.pi.service.server.IAvailableResourcesService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pi/availableResources")
public class AvailableResourcesController extends PageController {
    @Autowired
    IAvailableResourcesService availableResourcesService;

    /**
     * 获取可利用的资源介入列表
     * @param serverAvailableResourcesInfoVO
     * @return
     */
    @RequestMapping("/queryAvailableResourcesList")
    @ResponseBody
    public ReturnEntity queryAvailableResourcesList(@RequestBody ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO){
        return availableResourcesService.queryAvailableResourcesList(serverAvailableResourcesInfoVO, buildPagenation());
    }

    /**
     * 获取可利用的资源介入信息
     * @param serverAvailableResourcesInfoVO
     * @return
     */
    @RequestMapping("/queryAvailableResourcesInfo")
    @ResponseBody
    public ReturnEntity queryAvailableResourcesInfo(@RequestBody ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO){
        return availableResourcesService.queryAvailableResourcesInfo(serverAvailableResourcesInfoVO);
    }

    /**
     * 保存可利用的资源介入信息
     * @param serverAvailableResourcesInfoVO
     * @return
     */
    @RequestMapping("/saveAvailableResourcesInfo")
    @ResponseBody
    public ReturnEntity saveAvailableResourcesInfo(@RequestBody ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO){
        SecUser secUser = (SecUser) getLoginUser();
        return availableResourcesService.saveAvailableResourcesInfo(serverAvailableResourcesInfoVO, secUser);
    }

    /**
     * 提交可利用的资源介入信息
     * @param serverAvailableResourcesInfoVO
     * @return
     */
    @RequestMapping("/submitAvailableResourcesInfo")
    @ResponseBody
    public ReturnEntity submitAvailableResourcesInfo(@RequestBody ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO){
        SecUser secUser = (SecUser) getLoginUser();
        return availableResourcesService.submitAvailableResourcesInfo(serverAvailableResourcesInfoVO, secUser);
    }

    /**
     * 删除可利用的资源介入信息
     * @param serverAvailableResourcesInfoVO
     * @return
     */
    @RequestMapping("/deleteAvailableResourcesInfo")
    @ResponseBody
    public ReturnEntity deleteAvailableResourcesInfo(@RequestBody ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO){
        return availableResourcesService.deleteAvailableResourcesInfo(serverAvailableResourcesInfoVO);
    }
}
