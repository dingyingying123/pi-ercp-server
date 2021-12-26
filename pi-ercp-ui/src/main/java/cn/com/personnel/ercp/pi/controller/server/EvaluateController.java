package cn.com.personnel.ercp.pi.controller.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerEvaluateInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerInterviewInterventionVO;
import cn.com.personnel.ercp.pi.module.server.ServerPlanInfoVO;
import cn.com.personnel.ercp.pi.service.server.IEvaluateService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pi/evaluate")
public class EvaluateController extends PageController {

    @Autowired
    IEvaluateService evaluateService;

    /**
     * 获取面谈介入列表
     * @param serverEvaluateInfoVO
     * @return
     */
    @RequestMapping("/queryEvaluateList")
    @ResponseBody
    public ReturnEntity queryEvaluateList(@RequestBody ServerEvaluateInfoVO serverEvaluateInfoVO){
        return evaluateService.queryEvaluateList(serverEvaluateInfoVO, buildPagenation());
    }

    /**
     * 获取面谈介入信息
     * @param serverEvaluateInfoVO
     * @return
     */
    @RequestMapping("/queryEvaluateInfo")
    @ResponseBody
    public ReturnEntity queryEvaluateInfo(@RequestBody ServerEvaluateInfoVO serverEvaluateInfoVO){
        return evaluateService.queryEvaluateInfo(serverEvaluateInfoVO);
    }

    /**
     * 获取计划已提交的儿童列表
     * @param serverInterviewInterventionVO
     * @return
     */
    @RequestMapping("/querySubmitInterviewInterventionList")
    @ResponseBody
    public ReturnEntity querySubmitInterviewInterventionList(@RequestBody ServerInterviewInterventionVO serverInterviewInterventionVO){
        return evaluateService.querySubmitInterviewInterventionList(serverInterviewInterventionVO, buildPagenation());
    }

    /**
     * 保存面谈介入信息
     * @param serverEvaluateInfoVO
     * @return
     */
    @RequestMapping("/saveEvaluateInfo")
    @ResponseBody
    public ReturnEntity saveEvaluateInfo(@RequestBody ServerEvaluateInfoVO serverEvaluateInfoVO){
        SecUser secUser = (SecUser) getLoginUser();
        return evaluateService.saveEvaluateInfo(serverEvaluateInfoVO, secUser);
    }

    /**
     * 提交面谈介入信息
     * @param serverEvaluateInfoVO
     * @return
     */
    @RequestMapping("/submitEvaluateInfo")
    @ResponseBody
    public ReturnEntity submitEvaluateInfo(@RequestBody ServerEvaluateInfoVO serverEvaluateInfoVO){
        SecUser secUser = (SecUser) getLoginUser();
        return evaluateService.submitEvaluateInfo(serverEvaluateInfoVO, secUser);
    }

    /**
     * 删除面谈介入信息
     * @param serverEvaluateInfoVO
     * @return
     */
    @RequestMapping("/deleteEvaluateInfo")
    @ResponseBody
    public ReturnEntity deleteEvaluateInfo(@RequestBody ServerEvaluateInfoVO serverEvaluateInfoVO){
        return evaluateService.deleteEvaluateInfo(serverEvaluateInfoVO);
    }

}
