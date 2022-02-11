package cn.com.personnel.ercp.pi.controller.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerEvaluateInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerInterviewInterventionVO;
import cn.com.personnel.ercp.pi.module.server.ServerPlanInfoVO;
import cn.com.personnel.ercp.pi.service.server.IEvaluateService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.apache.commons.lang3.StringUtils;
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
     * 获取评估列表
     * @param serverEvaluateInfoVO
     * @return
     */
    @RequestMapping("/queryEvaluateList")
    @ResponseBody
    public ReturnEntity queryEvaluateList(@RequestBody ServerEvaluateInfoVO serverEvaluateInfoVO){
        SecUser secUser = getTokenLoginUser();
        if(StringUtils.isNotEmpty(secUser.getArea())){
            serverEvaluateInfoVO.setArea(secUser.getArea());
        }
        return evaluateService.queryEvaluateList(serverEvaluateInfoVO, buildPagenation());
    }

    /**
     * 获取评估信息
     * @param serverEvaluateInfoVO
     * @return
     */
    @RequestMapping("/queryEvaluateInfo")
    @ResponseBody
    public ReturnEntity queryEvaluateInfo(@RequestBody ServerEvaluateInfoVO serverEvaluateInfoVO){
        return evaluateService.queryEvaluateInfo(serverEvaluateInfoVO);
    }

    /**
     * 获取介入已提交的儿童列表
     * @param serverInterviewInterventionVO
     * @return
     */
    @RequestMapping("/querySubmitInterviewInterventionList")
    @ResponseBody
    public ReturnEntity querySubmitInterviewInterventionList(@RequestBody ServerInterviewInterventionVO serverInterviewInterventionVO){
        SecUser secUser = getTokenLoginUser();
        if(StringUtils.isNotEmpty(secUser.getArea())){
            serverInterviewInterventionVO.setArea(secUser.getArea());
        }
        return evaluateService.querySubmitInterviewInterventionList(serverInterviewInterventionVO, buildPagenation());
    }

    /**
     * 保存评估信息
     * @param serverEvaluateInfoVO
     * @return
     */
    @RequestMapping("/saveEvaluateInfo")
    @ResponseBody
    public ReturnEntity saveEvaluateInfo(@RequestBody ServerEvaluateInfoVO serverEvaluateInfoVO){
        SecUser secUser = getTokenLoginUser();
        return evaluateService.saveEvaluateInfo(serverEvaluateInfoVO, secUser);
    }

    /**
     * 提交评估信息
     * @param serverEvaluateInfoVO
     * @return
     */
    @RequestMapping("/submitEvaluateInfo")
    @ResponseBody
    public ReturnEntity submitEvaluateInfo(@RequestBody ServerEvaluateInfoVO serverEvaluateInfoVO){
        SecUser secUser = getTokenLoginUser();
        return evaluateService.submitEvaluateInfo(serverEvaluateInfoVO, secUser);
    }

    /**
     * 删除评估信息
     * @param serverEvaluateInfoVO
     * @return
     */
    @RequestMapping("/deleteEvaluateInfo")
    @ResponseBody
    public ReturnEntity deleteEvaluateInfo(@RequestBody ServerEvaluateInfoVO serverEvaluateInfoVO){
        return evaluateService.deleteEvaluateInfo(serverEvaluateInfoVO);
    }

    /**
     * 获取编号
     * @return
     */
    @RequestMapping("/getLetterNumber")
    @ResponseBody
    public ReturnEntity getLetterNumber(){
        return evaluateService.getLetterNumber();
    }
}
