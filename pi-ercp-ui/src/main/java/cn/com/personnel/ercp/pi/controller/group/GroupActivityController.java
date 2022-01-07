package cn.com.personnel.ercp.pi.controller.group;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.group.ServerGroupActivityInfo;
import cn.com.personnel.ercp.pi.service.group.IGroupActivityService;
import cn.com.personnel.ercp.pi.service.server.ITakeCaseService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pi/groupActivity")
public class GroupActivityController extends PageController {
    @Autowired
    IGroupActivityService groupActivityService;
    @Autowired
    ITakeCaseService takeCaseService;

    /**
     * 获取小组活动列表
     * @param serverGroupActivityInfo
     * @return
     */
    @RequestMapping("/queryGroupActivityList")
    @ResponseBody
    public ReturnEntity queryGroupActivityList(@RequestBody ServerGroupActivityInfo serverGroupActivityInfo){
        return groupActivityService.queryGroupActivityList(serverGroupActivityInfo, buildPagenation());
    }

    /**
     * 获取小组活动信息
     * @param serverGroupActivityInfo
     * @return
     */
    @RequestMapping("/queryGroupActivityInfo")
    @ResponseBody
    public ReturnEntity queryGroupActivityInfo(@RequestBody ServerGroupActivityInfo serverGroupActivityInfo){
        return groupActivityService.queryGroupActivityInfo(serverGroupActivityInfo);
    }

    /**
     * 保存小组活动信息
     * @param serverGroupActivityInfo
     * @return
     */
    @RequestMapping("/saveGroupActivityInfo")
    @ResponseBody
    public ReturnEntity saveGroupActivityInfo(@RequestBody ServerGroupActivityInfo serverGroupActivityInfo){
        SecUser secUser = (SecUser) getLoginUser();
        return groupActivityService.saveGroupActivityInfo(serverGroupActivityInfo, secUser);
    }

    /**
     * 删除小组活动信息
     * @param serverGroupActivityInfo
     * @return
     */
    @RequestMapping("/deleteGroupActivityInfo")
    @ResponseBody
    public ReturnEntity deleteGroupActivityInfo(@RequestBody ServerGroupActivityInfo serverGroupActivityInfo){
        return groupActivityService.deleteGroupActivityInfo(serverGroupActivityInfo);
    }

    /**
     * 提交小组活动信息
     * @param serverGroupActivityInfo
     * @return
     */
    @RequestMapping("/submitGroupActivityInfo")
    @ResponseBody
    public ReturnEntity submitGroupActivityInfo(@RequestBody ServerGroupActivityInfo serverGroupActivityInfo){
        SecUser secUser = (SecUser) getLoginUser();
        return groupActivityService.submitGroupActivityInfo(serverGroupActivityInfo, secUser);
    }
}
