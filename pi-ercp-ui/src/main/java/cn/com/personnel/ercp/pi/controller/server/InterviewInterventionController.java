package cn.com.personnel.ercp.pi.controller.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerInterviewInterventionVO;
import cn.com.personnel.ercp.pi.module.server.ServerPlanInfoVO;
import cn.com.personnel.ercp.pi.service.server.IInterviewInterventionService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pi/interviewIntervention")
public class InterviewInterventionController extends PageController {

    @Autowired
    IInterviewInterventionService interviewInterventionService;

    /**
     * 获取面谈介入列表
     * @param serverInterviewInterventionVO
     * @return
     */
    @RequestMapping("/queryInterviewInterventionList")
    @ResponseBody
    public ReturnEntity queryInterviewInterventionList(@RequestBody ServerInterviewInterventionVO serverInterviewInterventionVO){
        SecUser secUser = getTokenLoginUser();
        if(StringUtils.isNotEmpty(secUser.getArea())){
            serverInterviewInterventionVO.setArea(secUser.getArea());
        }
        return interviewInterventionService.queryInterviewInterventionList(serverInterviewInterventionVO, buildPagenation());
    }

    /**
     * 获取面谈介入信息
     * @param serverInterviewInterventionVO
     * @return
     */
    @RequestMapping("/queryInterviewInterventionInfo")
    @ResponseBody
    public ReturnEntity queryInterviewInterventionInfo(@RequestBody ServerInterviewInterventionVO serverInterviewInterventionVO){
        return interviewInterventionService.queryInterviewInterventionInfo(serverInterviewInterventionVO);
    }

    /**
     * 获取计划已提交的儿童列表
     * @param serverPlanInfoVO
     * @return
     */
    @RequestMapping("/querySubmitPlanList")
    @ResponseBody
    public ReturnEntity querySubmitPlanList(@RequestBody ServerPlanInfoVO serverPlanInfoVO){
        SecUser secUser = getTokenLoginUser();
        if(StringUtils.isNotEmpty(secUser.getArea())){
            serverPlanInfoVO.setArea(secUser.getArea());
        }
        return interviewInterventionService.querySubmitPlanList(serverPlanInfoVO, buildPagenation());
    }

    /**
     * 保存面谈介入信息
     * @param serverInterviewInterventionVO
     * @return
     */
    @RequestMapping("/saveInterviewInterventionInfo")
    @ResponseBody
    public ReturnEntity saveInterviewInterventionInfo(@RequestBody ServerInterviewInterventionVO serverInterviewInterventionVO){
        SecUser secUser = getTokenLoginUser();
        return interviewInterventionService.saveInterviewInterventionInfo(serverInterviewInterventionVO, secUser);
    }

    /**
     * 提交面谈介入信息
     * @param serverInterviewInterventionVO
     * @return
     */
    @RequestMapping("/submitInterviewInterventionInfo")
    @ResponseBody
    public ReturnEntity submitInterviewInterventionInfo(@RequestBody ServerInterviewInterventionVO serverInterviewInterventionVO){
        SecUser secUser = getTokenLoginUser();
        return interviewInterventionService.submitInterviewInterventionInfo(serverInterviewInterventionVO, secUser);
    }

    /**
     * 删除面谈介入信息
     * @param serverInterviewInterventionVO
     * @return
     */
    @RequestMapping("/deleteInterviewInterventionInfo")
    @ResponseBody
    public ReturnEntity deleteInterviewInterventionInfo(@RequestBody ServerInterviewInterventionVO serverInterviewInterventionVO){
        return interviewInterventionService.deleteInterviewInterventionInfo(serverInterviewInterventionVO);
    }

    /**
     * 获取编号
     * @return
     */
    @RequestMapping("/getLetterNumber")
    @ResponseBody
    public ReturnEntity getLetterNumber(){
        return interviewInterventionService.getLetterNumber();
    }
}
