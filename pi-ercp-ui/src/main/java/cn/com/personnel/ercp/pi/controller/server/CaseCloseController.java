package cn.com.personnel.ercp.pi.controller.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerCaseClosedInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerEvaluateInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerInterviewInterventionVO;
import cn.com.personnel.ercp.pi.service.server.ICaseCloseService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pi/caseClose")
public class CaseCloseController extends PageController {

    @Autowired
    ICaseCloseService caseCloseService;

    /**
     * 获取结案列表
     * @param serverCaseClosedInfoVO
     * @return
     */
    @RequestMapping("/queryCaseClosedList")
    @ResponseBody
    public ReturnEntity queryCaseClosedList(@RequestBody ServerCaseClosedInfoVO serverCaseClosedInfoVO){
        SecUser secUser = getTokenLoginUser();
        if(StringUtils.isNotEmpty(secUser.getArea())){
            serverCaseClosedInfoVO.setArea(secUser.getArea());
        }
        return caseCloseService.queryCaseClosedList(serverCaseClosedInfoVO, buildPagenation());
    }

    /**
     * 获取结案信息
     * @param serverCaseClosedInfoVO
     * @return
     */
    @RequestMapping("/queryCaseClosedInfo")
    @ResponseBody
    public ReturnEntity queryCaseClosedInfo(@RequestBody ServerCaseClosedInfoVO serverCaseClosedInfoVO){
        return caseCloseService.queryCaseClosedInfo(serverCaseClosedInfoVO);
    }

    /**
     * 获取评估已提交的儿童列表
     * @param serverEvaluateInfoVO
     * @return
     */
    @RequestMapping("/querySubmitEvaluateList")
    @ResponseBody
    public ReturnEntity querySubmitEvaluateList(@RequestBody ServerEvaluateInfoVO serverEvaluateInfoVO){
        SecUser secUser = getTokenLoginUser();
        if(StringUtils.isNotEmpty(secUser.getArea())){
            serverEvaluateInfoVO.setArea(secUser.getArea());
        }
        return caseCloseService.querySubmitEvaluateList(serverEvaluateInfoVO, buildPagenation());
    }

    /**
     * 保存结案信息
     * @param serverCaseClosedInfoVO
     * @return
     */
    @RequestMapping("/saveCaseClosedInfo")
    @ResponseBody
    public ReturnEntity saveCaseClosedInfo(@RequestBody ServerCaseClosedInfoVO serverCaseClosedInfoVO){
        SecUser secUser = getTokenLoginUser();
        return caseCloseService.saveCaseClosedInfo(serverCaseClosedInfoVO, secUser);
    }

    /**
     * 提交结案信息
     * @param serverCaseClosedInfoVO
     * @return
     */
    @RequestMapping("/submitCaseClosedInfo")
    @ResponseBody
    public ReturnEntity submitCaseClosedInfo(@RequestBody ServerCaseClosedInfoVO serverCaseClosedInfoVO){
        SecUser secUser = getTokenLoginUser();
        return caseCloseService.submitCaseClosedInfo(serverCaseClosedInfoVO, secUser);
    }

    /**
     * 删除结案信息
     * @param serverCaseClosedInfoVO
     * @return
     */
    @RequestMapping("/deleteCaseClosedInfo")
    @ResponseBody
    public ReturnEntity deleteCaseClosedInfo(@RequestBody ServerCaseClosedInfoVO serverCaseClosedInfoVO){
        return caseCloseService.deleteCaseClosedInfo(serverCaseClosedInfoVO);
    }

}
