package cn.com.personnel.ercp.common.controller;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.module.WorkFlow;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/checkCtrl")
public class CheckController {
//    @Autowired
//    IBaseCommonService baseCommonService;

    @RequestMapping("/check")
    @ResponseBody
    public ReturnEntity check(){
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        returnEntity.setData("成功了");
        return returnEntity;
    }

//    /**
//     * 修改流程名
//     * @param map
//     * @return
//     */
//    @RequestMapping("/renameProcessName")
//    @ResponseBody
//    public ReturnEntity renameProcessName(@RequestBody Map<String, String> map){
//        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
//        SecUser secUser = new SecUser("50577");
//        secUser.setUserName("丁莹莹");
//        WorkFlow workFlow = new WorkFlow();
//        workFlow.setProcessInstName(map.get("processInstName"));
//        workFlow.setProcessInstID(map.get("processInstID"));
//        baseCommonService.renameProcess(secUser, workFlow);
//        returnEntity.setData("成功了");
//        return returnEntity;
//    }

}
