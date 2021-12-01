package cn.com.personnel.ercp.auth.controller;

import cn.com.personnel.ercp.auth.module.SecRoleButtonVO;
import cn.com.personnel.ercp.auth.persistence.entity.SecRoleButton;
import cn.com.personnel.ercp.auth.service.ISecRoleButtonService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/auth/roleButton")
@Api("角色按钮接口")
public class SecRoleButtonController extends PageController {
    @Autowired
    ISecRoleButtonService secRoleButtonService;


    @ApiOperation(value = "获取角色按钮列表",notes = "获取角色按钮列表")
    @RequestMapping(value = "/getRoleButtonList")
    public ReturnEntity getRoleButtonList(@RequestBody SecRoleButton secRoleButton){
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
        String appStr=Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
        Map<String, Object> roleButton = secRoleButtonService.getRoleButtonList(secRoleButton,appStr);
        returnEntity.setData(roleButton);
        return returnEntity;
    }

    @ApiOperation(value = "删除角色按钮",notes = "删除角色按钮")
    @RequestMapping(value = "/deleteRoleButton", method = RequestMethod.POST)
    public ReturnEntity deleteRoleButton(@RequestBody SecRoleButton secRoleButton){
        secRoleButtonService.deleteRoleButton(secRoleButton);
        return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
    }

    @ApiOperation(value = "修改角色按钮",notes = "修改角色按钮")
    @RequestMapping(value = "/updateRoleButton", method = RequestMethod.POST)
    public ReturnEntity updateRoleButton(@RequestBody SecRoleButton secRoleButton){
        secRoleButtonService.updateRoleButton(secRoleButton);
        return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);

    }

    @ApiOperation(value = "添加角色按钮",notes = "添加角色按钮")
    @RequestMapping(value = "/insertRoleButton", method = RequestMethod.POST)
    public ReturnEntity insertRoleButton(@RequestBody SecRoleButton secRoleButton){
        String appStr= Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
        secRoleButtonService.insertRoleButton(secRoleButton,appStr);
        return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);

    }

    @ApiOperation(value = "保存角色按钮",notes = "保存角色按钮")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ReturnEntity save(@RequestBody SecRoleButtonVO secRoleButtonVO){
        String appStr=Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
        List<SecRoleButton> save = secRoleButtonService.save(secRoleButtonVO.getList(),appStr);
        return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,save);

    }
}
