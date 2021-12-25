package cn.com.personnel.ercp.pi.controller.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerEstimateInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerPlanInfoVO;
import cn.com.personnel.ercp.pi.service.server.IPlanService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 预估
 */
@Controller
@RequestMapping("/pi/plan")
public class PlanController extends PageController {
    @Autowired
    IPlanService planService;

    /**
     * 获取计划列表
     * @param serverPlanInfoVO
     * @return
     */
    @RequestMapping("/queryPlanList")
    @ResponseBody
    public ReturnEntity queryPlanList(@RequestBody ServerPlanInfoVO serverPlanInfoVO){
        return planService.queryPlanList(serverPlanInfoVO, buildPagenation());
    }

    /**
     * 获取计划信息
     * @param serverPlanInfoVO
     * @return
     */
    @RequestMapping("/queryPlanInfo")
    @ResponseBody
    public ReturnEntity queryPlanInfo(@RequestBody ServerPlanInfoVO serverPlanInfoVO){
        return planService.queryPlanInfo(serverPlanInfoVO);
    }

    /**
     * 获取预估已提交的儿童列表
     * @param serverEstimateInfoVO
     * @return
     */
    @RequestMapping("/querySubmitEstimateList")
    @ResponseBody
    public ReturnEntity querySubmitEstimateList(@RequestBody ServerEstimateInfoVO serverEstimateInfoVO){
        return planService.querySubmitEstimateList(serverEstimateInfoVO, buildPagenation());
    }

    /**
     * 保存计划信息
     * @param serverPlanInfoVO
     * @return
     */
    @RequestMapping("/savePlanInfo")
    @ResponseBody
    public ReturnEntity savePlanInfo(@RequestBody ServerPlanInfoVO serverPlanInfoVO){
        SecUser secUser = (SecUser) getLoginUser();
        return planService.savePlanInfo(serverPlanInfoVO, secUser);
    }

    /**
     * 删除计划信息
     * @param serverPlanInfoVO
     * @return
     */
    @RequestMapping("/deletePlanInfo")
    @ResponseBody
    public ReturnEntity deletePlanInfo(@RequestBody ServerPlanInfoVO serverPlanInfoVO){
        return planService.deletePlanInfo(serverPlanInfoVO);
    }

    /**
     * 提交单个计划信息
     * @param serverPlanInfoVO
     * @return
     */
    @RequestMapping("/submitPlanInfo")
    @ResponseBody
    public ReturnEntity submitPlanInfo(@RequestBody ServerPlanInfoVO serverPlanInfoVO){
        SecUser secUser = (SecUser) getLoginUser();
        return planService.submitPlanInfo(serverPlanInfoVO, secUser);
    }
}
