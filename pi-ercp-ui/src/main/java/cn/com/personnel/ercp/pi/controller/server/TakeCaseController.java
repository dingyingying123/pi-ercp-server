package cn.com.personnel.ercp.pi.controller.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerTakeCaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.service.server.ITakeCaseService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 接案
 */
@Controller
@RequestMapping("/pi/takeCase")
public class TakeCaseController extends PageController {
    @Autowired
    ITakeCaseService takeCaseService;

    /**
     * 获取接案列表
     * @param serverTakeCaseInfoVO
     * @return
     */
    @RequestMapping("/queryTakeCaseList")
    @ResponseBody
    public ReturnEntity queryTakeCaseList(@RequestBody ServerTakeCaseInfoVO serverTakeCaseInfoVO){
        SecUser secUser = getTokenLoginUser();
        if(StringUtils.isNotEmpty(secUser.getArea())){
            serverTakeCaseInfoVO.setArea(secUser.getArea());
        }
        return takeCaseService.queryTakeCaseList(serverTakeCaseInfoVO, buildPagenation());
    }

    /**
     * 获取接案信息
     * @param serverTakeCaseInfoVO
     * @return
     */
    @RequestMapping("/queryTakeCaseInfo")
    @ResponseBody
    public ReturnEntity queryTakeCaseInfo(@RequestBody ServerTakeCaseInfoVO serverTakeCaseInfoVO){
        return takeCaseService.queryTakeCaseInfo(serverTakeCaseInfoVO);
    }

    /**
     * 获取审批通过的儿童列表
     * @param piChildrenBaseInfo
     * @return
     */
    @RequestMapping("/queryChildApprovedList")
    @ResponseBody
    public ReturnEntity queryChildApprovedList(@RequestBody PiChildrenBaseInfo piChildrenBaseInfo){
        SecUser secUser = getTokenLoginUser();
        if(StringUtils.isNotEmpty(secUser.getArea())){
            piChildrenBaseInfo.setArea(secUser.getArea());
        }
        return takeCaseService.queryChildApprovedList(piChildrenBaseInfo, buildPagenation());
    }

    /**
     * 保存接案信息
     * @param serverTakeCaseInfoVO
     * @return
     */
    @RequestMapping("/saveTakeCaseInfo")
    @ResponseBody
    public ReturnEntity saveTakeCaseInfo(@RequestBody ServerTakeCaseInfoVO serverTakeCaseInfoVO){
        SecUser secUser = getTokenLoginUser();
        return takeCaseService.saveTakeCaseInfo(serverTakeCaseInfoVO, secUser);
    }

    /**
     * 删除接案信息
     * @param serverTakeCaseInfoVO
     * @return
     */
    @RequestMapping("/deleteTakeCaseInfo")
    @ResponseBody
    public ReturnEntity deleteTakeCaseInfo(@RequestBody ServerTakeCaseInfoVO serverTakeCaseInfoVO){
        return takeCaseService.deleteTakeCaseInfo(serverTakeCaseInfoVO);
    }

    /**
     * 提交接案信息
     * @param serverTakeCaseInfoVO
     * @return
     */
    @RequestMapping("/submitTakeCaseInfo")
    @ResponseBody
    public ReturnEntity submitTakeCaseInfo(@RequestBody ServerTakeCaseInfoVO serverTakeCaseInfoVO){
        SecUser secUser = getTokenLoginUser();
        return takeCaseService.submitTakeCaseInfo(serverTakeCaseInfoVO, secUser);
    }
}
