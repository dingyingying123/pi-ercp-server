package cn.com.personnel.ercp.pi.controller.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.server.ServerEstimateInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerTakeCaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerEstimateInfo;
import cn.com.personnel.ercp.pi.service.server.IEstimateService;
import cn.com.personnel.ercp.pi.service.server.ITakeCaseService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 预估
 */
@Controller
@RequestMapping("/pi/estimate")
public class EstimateController extends PageController {
    @Autowired
    IEstimateService estimateService;

    /**
     * 获取预估列表
     * @param serverEstimateInfoVO
     * @return
     */
    @RequestMapping("/queryEstimateList")
    @ResponseBody
    public ReturnEntity queryEstimateList(@RequestBody ServerEstimateInfoVO serverEstimateInfoVO){
        SecUser secUser = getTokenLoginUser();
        if(StringUtils.isNotEmpty(secUser.getArea())){
            serverEstimateInfoVO.setArea(secUser.getArea());
        }
        return estimateService.queryEstimateList(serverEstimateInfoVO, buildPagenation());
    }

    /**
     * 获取预估信息
     * @param serverEstimateInfoVO
     * @return
     */
    @RequestMapping("/queryEstimateInfo")
    @ResponseBody
    public ReturnEntity queryEstimateInfo(@RequestBody ServerEstimateInfoVO serverEstimateInfoVO){
        return estimateService.queryEstimateInfo(serverEstimateInfoVO);
    }

    /**
     * 获取接案已提交的儿童列表
     * @param serverTakeCaseInfoVO
     * @return
     */
    @RequestMapping("/querySubmitTaskCaseList")
    @ResponseBody
    public ReturnEntity querySubmitTaskCaseList(@RequestBody ServerTakeCaseInfoVO serverTakeCaseInfoVO){
        SecUser secUser = getTokenLoginUser();
        if(StringUtils.isNotEmpty(secUser.getArea())){
            serverTakeCaseInfoVO.setArea(secUser.getArea());
        }
        return estimateService.querySubmitTaskCaseList(serverTakeCaseInfoVO, buildPagenation());
    }

    /**
     * 保存预估信息
     * @param serverEstimateInfoVO
     * @return
     */
    @RequestMapping("/saveEstimateInfo")
    @ResponseBody
    public ReturnEntity saveEstimateInfo(@RequestBody ServerEstimateInfoVO serverEstimateInfoVO){
        SecUser secUser = getTokenLoginUser();
        return estimateService.saveEstimateInfo(serverEstimateInfoVO, secUser);
    }

    /**
     * 删除预估信息
     * @param serverEstimateInfoVO
     * @return
     */
    @RequestMapping("/deleteEstimateInfo")
    @ResponseBody
    public ReturnEntity deleteEstimateInfo(@RequestBody ServerEstimateInfoVO serverEstimateInfoVO){
        return estimateService.deleteEstimateInfo(serverEstimateInfoVO);
    }

    /**
     * 提交预估信息
     * @param serverEstimateInfoVO
     * @return
     */
    @RequestMapping("/submitEstimateInfo")
    @ResponseBody
    public ReturnEntity submitEstimateInfo(@RequestBody ServerEstimateInfoVO serverEstimateInfoVO){
        SecUser secUser = getTokenLoginUser();
        return estimateService.submitEstimateInfo(serverEstimateInfoVO, secUser);
    }

    /**
     * 获取编号
     * @return
     */
    @RequestMapping("/getLetterNumber")
    @ResponseBody
    public ReturnEntity getLetterNumber(){
        return estimateService.getLetterNumber();
    }
}
