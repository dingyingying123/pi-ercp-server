package cn.com.personnel.ercp.pi.controller.children;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.ISecUserService;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiAddress;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenGuardianInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenLocationInfo;
import cn.com.personnel.ercp.pi.service.child.IPiChildrenBaseInfoService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.apache.commons.lang3.StringUtils;
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
    @Autowired
    ISecUserService secUserService;

    /**
     * 查询儿童基本信息列表
     * @param piChildrenBaseInfo
     * @return
     */
    @RequestMapping("/queryPiChildrenBaseInfoList")
    @ResponseBody
    public ReturnEntity queryPiChildrenBaseInfoList(@RequestBody PiChildrenBaseInfoVO piChildrenBaseInfo){
        SecUser secUser = getTokenLoginUser();
        SecUser user = secUserService.selectByUserId(secUser.getUserId());
        if(StringUtils.isNotEmpty(user.getAuthority()) && "录入员".equals(user.getAuthority())){
//            piChildrenBaseInfo.setArea(secUser.getArea());
            piChildrenBaseInfo.setCreator(secUser.getUserId());
        }
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
        SecUser secUser = getTokenLoginUser();
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
        SecUser secUser = getTokenLoginUser();
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
        SecUser secUser = getTokenLoginUser();
        return piChildrenBaseInfoService.deletePiChildrenBaseInfo(piChildrenBaseInfo, secUser);
    }

    /**
     * 数据上传儿童基本信息
     * @return
     */
    @RequestMapping("/submitPiChildrenBaseInfoList")
    @ResponseBody
    public ReturnEntity submitPiChildrenBaseInfoList(){
        SecUser secUser = getTokenLoginUser();
        return piChildrenBaseInfoService.submitPiChildrenBaseInfoList(secUser);
    }

    /**
     * 审批儿童基本信息
     * @return
     */
    @RequestMapping("/approvePiChildrenBaseInfo")
    @ResponseBody
    public ReturnEntity approvePiChildrenBaseInfo(@RequestBody PiChildrenBaseInfo piChildrenBaseInfo){
        SecUser secUser = getTokenLoginUser();
        return piChildrenBaseInfoService.approvePiChildrenBaseInfo(piChildrenBaseInfo, secUser);
    }

    /**
     * 查询成员列表
     * @return
     */
    @RequestMapping("/queryPiChildrenGuardianInfoList")
    @ResponseBody
    public ReturnEntity queryPiChildrenGuardianInfoList(@RequestBody PiChildrenGuardianInfo piChildrenGuardianInfo){
        SecUser secUser = getTokenLoginUser();
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
        SecUser secUser = getTokenLoginUser();
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

    /**
     * 根据省市县镇查询村列表
     * @param piAddress
     * @return
     */
    @RequestMapping("/queryAddressList")
    @ResponseBody
    public ReturnEntity queryAddressList(@RequestBody PiAddress piAddress){
        return piChildrenBaseInfoService.queryAddressList(piAddress);
    }
}
