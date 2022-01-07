package cn.com.personnel.ercp.pi.controller.children;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenGuardianInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenLocationInfo;
import cn.com.personnel.ercp.pi.service.child.IPiChildrenBaseInfoService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/pi/piChildrenBaseInfo")
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
     * 查询儿童基本信息信息
     * @param piChildrenBaseInfo
     * @return
     */
    @RequestMapping("/queryPiChildrenBaseInfo")
    @ResponseBody
    public ReturnEntity queryPiChildrenBaseInfo(@RequestBody PiChildrenBaseInfo piChildrenBaseInfo){
        return piChildrenBaseInfoService.queryPiChildrenBaseInfo(piChildrenBaseInfo);
    }

    /**
     * 保存儿童基本信息
     * @param piChildrenBaseInfo
     * @return
     */
    @RequestMapping("/savePiChildrenBaseInfo")
    @ResponseBody
    public ReturnEntity savePiChildrenBaseInfo(@RequestBody PiChildrenBaseInfoVO piChildrenBaseInfo){
        SecUser secUser = (SecUser) getLoginUser();
        return piChildrenBaseInfoService.savePiChildrenBaseInfo(piChildrenBaseInfo, secUser);
    }

    /**
     * 提交儿童基本信息
     * @param piChildrenBaseInfo
     * @return
     */
    @RequestMapping("/submitPiChildrenBaseInfo")
    @ResponseBody
    public ReturnEntity submitPiChildrenBaseInfo(@RequestBody PiChildrenBaseInfo piChildrenBaseInfo){
        SecUser secUser = (SecUser) getLoginUser();
        return piChildrenBaseInfoService.submitPiChildrenBaseInfo(piChildrenBaseInfo, secUser);
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

    /**
     * 数据上传儿童基本信息
     * @param piChildrenBaseInfoList
     * @return
     */
    @RequestMapping("/submitPiChildrenBaseInfoList")
    @ResponseBody
    public ReturnEntity submitPiChildrenBaseInfoList(@RequestBody List<PiChildrenBaseInfo> piChildrenBaseInfoList){
        SecUser secUser = (SecUser) getLoginUser();
        return piChildrenBaseInfoService.submitPiChildrenBaseInfoList(piChildrenBaseInfoList, secUser);
    }

    /**
     * 审批儿童基本信息
     * @return
     */
    @RequestMapping("/approvePiChildrenBaseInfo")
    @ResponseBody
    public ReturnEntity approvePiChildrenBaseInfo(){
        SecUser secUser = (SecUser) getLoginUser();
        return piChildrenBaseInfoService.approvePiChildrenBaseInfo(secUser);
    }

    /**
     * 查询成员列表
     * @return
     */
    @RequestMapping("/queryPiChildrenGuardianInfoList")
    @ResponseBody
    public ReturnEntity queryPiChildrenGuardianInfoList(@RequestBody PiChildrenGuardianInfo piChildrenGuardianInfo){
        SecUser secUser = (SecUser) getLoginUser();
        return piChildrenBaseInfoService.queryPiChildrenGuardianInfoList(piChildrenGuardianInfo);
    }

    /**
     * 保存儿童地址信息
     * @param piChildrenLocationInfo
     * @return
     */
    @RequestMapping("/savePiChildrenLocationInfo")
    @ResponseBody
    public ReturnEntity savePiChildrenLocationInfo(@RequestBody PiChildrenLocationInfo piChildrenLocationInfo){
        SecUser secUser = (SecUser) getLoginUser();
        return piChildrenBaseInfoService.savePiChildrenLocationInfo(piChildrenLocationInfo, secUser);
    }

    /**
     * 查询儿童地址信息
     * @param piChildrenLocationInfo
     * @return
     */
    @RequestMapping("/queryPiChildrenLocationInfo")
    @ResponseBody
    public ReturnEntity queryPiChildrenLocationInfo(@RequestBody PiChildrenLocationInfo piChildrenLocationInfo){
        return piChildrenBaseInfoService.queryPiChildrenLocationInfo(piChildrenLocationInfo);
    }

    /**
     * 查询儿童附件信息
     * @param piChildrenBaseInfo
     * @return
     */
    @RequestMapping("/queryChildrenFileList")
    @ResponseBody
    public ReturnEntity queryChildrenFileList(@RequestBody PiChildrenBaseInfo piChildrenBaseInfo){
        return piChildrenBaseInfoService.queryChildrenFileList(piChildrenBaseInfo);
    }

    /**
     * 查询儿童信息统计表
     * @param piChildrenBaseInfo
     * @return
     */
    @RequestMapping("/queryChildrenStatisticsList")
    @ResponseBody
    public ReturnEntity queryChildrenStatisticsList(@RequestBody PiChildrenBaseInfo piChildrenBaseInfo){
        return piChildrenBaseInfoService.queryChildrenStatisticsList(piChildrenBaseInfo);
    }
}
