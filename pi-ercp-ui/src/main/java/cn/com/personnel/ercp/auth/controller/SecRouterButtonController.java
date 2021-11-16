package cn.com.personnel.ercp.auth.controller;

import cn.com.personnel.ercp.auth.persistence.entity.SecRouterButton;
import cn.com.personnel.ercp.auth.service.ISecRouterButtonService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auth/routerButton")
@Api("路由按钮接口")
public class SecRouterButtonController extends PageController {
    @Autowired
    ISecRouterButtonService secRouterButtonService;


    @ApiOperation(value = "获取路由按钮列表",notes = "获取路由按钮列表")
    @RequestMapping(value = "/getRouterButtonList",method = RequestMethod.POST)
    public ReturnEntity getRouterButtonList(@RequestBody SecRouterButton secRouterButton){
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
        String appStr= Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
        List<SecRouterButton> routerButtonList = secRouterButtonService.getRouterButtonList(secRouterButton,appStr);
        returnEntity.setData(new PageInfo<>(routerButtonList));
        return returnEntity;
    }

    @ApiOperation(value = "删除路由按钮",notes = "删除路由按钮")
    @RequestMapping(value = "/deleteRouterButton", method = RequestMethod.POST)
    public ReturnEntity deleteRouterButton(@RequestBody SecRouterButton secRouterButton){
          secRouterButtonService.deleteRouterButton(secRouterButton);
          return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
    }

    @ApiOperation(value = "修改路由按钮",notes = "修改路由按钮")
    @RequestMapping(value = "/updateRouterButton", method = RequestMethod.POST)
    public ReturnEntity updateRouterButton(@RequestBody SecRouterButton secRouterButton){
        secRouterButtonService.updateRouterButton(secRouterButton);
        return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);

    }

    @ApiOperation(value = "添加路由按钮",notes = "添加路由按钮")
    @RequestMapping(value = "/insertRouterButton", method = RequestMethod.POST)
    public ReturnEntity insertRouterButton(@RequestBody SecRouterButton secRouterButton){
        String appStr= Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
        secRouterButtonService.insertRouterButton(secRouterButton,appStr);
        return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);

    }

    @ApiOperation(value = "保存",notes = "保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ReturnEntity save(@RequestBody SecRouterButton secRouterButton){
        if(StringUtils.isBlank(secRouterButton.getId())) {
            String appStr=Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
            SecRouterButton one = secRouterButtonService.selectOne(secRouterButton,appStr);
            if(one!=null){
                return new ReturnEntity(CommonConstants.ERROR_CODE,"按钮名称已存在",null);
            }
            String id = secRouterButtonService.insertRouterButton(secRouterButton,appStr);
            return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,id);
        }else {
            secRouterButtonService.updateRouterButton(secRouterButton);
            return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
        }

    }
}
