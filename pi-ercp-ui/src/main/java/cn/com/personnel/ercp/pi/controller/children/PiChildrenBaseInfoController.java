package cn.com.personnel.ercp.pi.controller.children;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.service.child.IPiChildrenBaseInfoService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/piChildrenBaseInfo")
public class PiChildrenBaseInfoController extends PageController {

    @Autowired
    IPiChildrenBaseInfoService piChildrenBaseInfoService;

    /**
     * 查询儿童基本信息列表
     * @param piChildrenBaseInfo
     * @return
     */
    @RequestMapping("/queryPiChildrenBaseInfoList")
    @ResponseBody
    public ReturnEntity queryPiChildrenBaseInfoList(@RequestBody PiChildrenBaseInfo piChildrenBaseInfo){
        return piChildrenBaseInfoService.queryPiChildrenBaseInfoList(piChildrenBaseInfo, buildPagenation());
    }

    /**
     * 保存儿童基本信息
     * @param piChildrenBaseInfo
     * @return
     */
    @RequestMapping("/savePiChildrenBaseInfo")
    @ResponseBody
    public ReturnEntity savePiChildrenBaseInfo(@RequestBody PiChildrenBaseInfo piChildrenBaseInfo){
        SecUser secUser = (SecUser) getLoginUser();
        return piChildrenBaseInfoService.savePiChildrenBaseInfo(piChildrenBaseInfo, secUser);
    }

    /**
     * 删除儿童基本信息
     * @param piChildrenBaseInfo
     * @return
     */
    @RequestMapping("/deletePiChildrenBaseInfo")
    @ResponseBody
    public ReturnEntity deletePiChildrenBaseInfo(@RequestBody PiChildrenBaseInfo piChildrenBaseInfo){
        SecUser secUser = (SecUser) getLoginUser();
        return piChildrenBaseInfoService.deletePiChildrenBaseInfo(piChildrenBaseInfo, secUser);
    }
}
