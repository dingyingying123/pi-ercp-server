package cn.com.personnel.ercp.auth.controller;

import cn.com.personnel.ercp.auth.persistence.entity.SecRouter;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.ISecRouterService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/auth/router")
@Api("路由管理接口")
public class SecRouterController extends PageController {

    @Autowired
    ISecRouterService secRouterService;

    @ApiOperation(value = "获取路由列表",notes = "获取路由列表")
    @RequestMapping(value = "selectRouter",method = RequestMethod.POST)
    public ReturnEntity selectRouter(@RequestBody SecRouter secRouter){
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE,CommonConstants.SUCCESS_MESSAGE,null);
        List list = secRouterService.getRouter(ApplicationConfig.APP_CODE,secRouter.getValid(),buildPagenation());
        if(list==null){
            returnEntity.setStatus(CommonConstants.ERROR_CODE);
            returnEntity.setMessage(CommonConstants.ERROR_MESSAGE);
            return returnEntity;
        }
        returnEntity.setData(new PageInfo<>(list));
        return returnEntity;
    }

    @ApiOperation(value = "删除一条路由",notes = "删除一条路由")
    @RequestMapping(value = "deleteRouter", method = RequestMethod.POST)
    public ReturnEntity deleteRouter(@RequestBody String [] ids){
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE,CommonConstants.SUCCESS_MESSAGE,null);
        int i = secRouterService.deleteRouter(ids);
        if(i<=0){
            returnEntity.setStatus(CommonConstants.ERROR_CODE);
            returnEntity.setMessage(CommonConstants.ERROR_MESSAGE);
            return returnEntity;
        }
        return  returnEntity;
    }

    @ApiOperation(value = "编辑路由信息",notes = "编辑路由信息")
    @RequestMapping(value = "updateRouter", method = RequestMethod.POST)
    public ReturnEntity updateRouter(@RequestBody SecRouter secRouter){
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE,CommonConstants.SUCCESS_MESSAGE,null);
        SecUser user = (SecUser) getLoginUser();
        secRouter.setUpdator(user.getUserName());
        secRouter.setUpdateTime(new Date());
        int i =  secRouterService.updateRouter(secRouter);
        if(i<=0){
            returnEntity.setStatus(CommonConstants.ERROR_CODE);
            returnEntity.setMessage(CommonConstants.ERROR_MESSAGE);
            return returnEntity;
        }
        return  returnEntity;
    }

    @ApiOperation(value = "添加路由",notes = "添加路由")
    @RequestMapping(value = "insertRouter", method = RequestMethod.POST)
    public ReturnEntity insertRouter(@RequestBody SecRouter secRouter){
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE,CommonConstants.SUCCESS_MESSAGE,null);
        SecUser user = (SecUser) getLoginUser();
        int i = 0;
        if(null==secRouter.getId()||"".equals(secRouter.getId())) {
            secRouter.setCreator(user.getUserName());
            secRouter.setCreateTime(new Date());
            secRouter.setAppcod(ApplicationConfig.APP_CODE);
            secRouter.setId(UUID.randomUUID().toString().replaceAll("-",""));
            i = secRouterService.insertRouter(secRouter);
        }else {
            secRouter.setUpdator(user.getUserName());
            secRouter.setUpdateTime(new Date());
            i = secRouterService.updateRouter(secRouter);
        }
        if(i<=0){
            returnEntity.setStatus(CommonConstants.ERROR_CODE);
            returnEntity.setMessage(CommonConstants.ERROR_MESSAGE);
            return returnEntity;
        }
        return  returnEntity;
    }

    @ApiOperation(value = "条件查询",notes = "条件查询")
    @RequestMapping(value = "selectCondition",method = RequestMethod.POST)
    public ReturnEntity selectCondition(@RequestBody SecRouter secRouter){
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE,CommonConstants.SUCCESS_MESSAGE,null);
        List list = secRouterService.selectCondition(secRouter,buildDataTablePagenation());
        if(list==null&&list.size()>0){
            returnEntity.setStatus(CommonConstants.ERROR_CODE);
            returnEntity.setMessage(CommonConstants.ERROR_MESSAGE);
            return returnEntity;
        }
        returnEntity.setData(new PageInfo<>(list));
        return returnEntity;
    }

    @ApiOperation(value = "单条查询",notes = "单条查询")
    @RequestMapping(value = "selectOne",method = RequestMethod.POST)
    public SecRouter selectOne(String id){
        return secRouterService.getOne(id);
    }

}
