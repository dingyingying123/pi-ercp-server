package cn.com.personnel.ercp.common.bps;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.common.service.IBpmService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bps/api")
public class FSSBPSApiController extends PageController {

    @Autowired
    IBpmService bpmService;

    /**
     * 根据primaryKey查看审批 返回url 地址
     * @return
     */
    @RequestMapping("/queryApprovalById/{id}")
    @ResponseBody
    public ReturnEntity queryApprovalById(@PathVariable String id){
        return bpmService.queryApproval(id);
    }

    /**
     * 根据流程实例ID查看审批 返回url 地址
     * @return
     */
    @RequestMapping("/queryApprovalByInstId/{instId}")
    @ResponseBody
    public ReturnEntity queryApprovalByInstId(@PathVariable String instId){
        return bpmService.queryApprovalByInstId(instId);
    }

    /**
     * 添加用户
     * @param secUser
     * @return
     */
    @RequestMapping("/addUser")
    @ResponseBody
    public ReturnEntity addUser(@RequestBody SecUser secUser){
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        bpmService.addUser(secUser);
        return returnEntity;
    }

    /**
     * 获取到期提醒事项
     * @return
     */
    @PostMapping("/queryExpiredUndoTask")
    @ResponseBody
    public ReturnEntity queryExpiredUndoTask(){
        SecUser secUser = (SecUser) getLoginUser();
        return bpmService.queryExpiredUndoTask(secUser, buildPagenation());
    }

    public static void main(String []args){
        JSONObject content = new JSONObject();
        JSONObject relateData1 = new JSONObject();
        relateData1.put("test1","123");
        content.put("processDefID","test");
        content.put("processInstName","test");
//        content.put("flag","1");
       // content.put("relateData",relateData1);
        String processDefID = content.getString("processDefID");
        String processInstName = content.getString("processInstName");
        String flag = content.getString("flag");
        JSONObject relateData = content.getJSONObject("relateData");
        System.out.println(processDefID);
        System.out.println(processInstName);
        System.out.println(flag);
        System.out.println(relateData);
    }

}
