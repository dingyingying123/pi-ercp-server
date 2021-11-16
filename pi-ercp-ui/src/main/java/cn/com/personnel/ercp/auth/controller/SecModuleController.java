package cn.com.personnel.ercp.auth.controller;

import cn.com.personnel.ercp.auth.module.JSTreeNode;
import cn.com.personnel.ercp.auth.persistence.entity.SecModule;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.ISecModuleService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Api(description = "菜单维护接口")
@Controller
@RequestMapping("/auth/module")
public class SecModuleController extends PageController{

	@Autowired
	private ISecModuleService secModuleService;


	@RequestMapping()
	public String index(){
		return "auth/module";
	}
	/**
	 * 获取模块树，用于模块维护
	 * @return
	 */
	@RequestMapping("tree")
	@ResponseBody
	public List<JSTreeNode> getModuleTree(){
		List<SecModule> modules = secModuleService.getAllModules(ApplicationConfig.APP_CODE);
		List<JSTreeNode> nodes = new ArrayList<JSTreeNode>();
		Map<String,Boolean> state = new HashMap<String,Boolean>();
		state.put("opened", true);
		for(SecModule module: modules){
			JSTreeNode node = new JSTreeNode();
			node.setData(module);
			node.setId("n_"+module.getModuleId());
			if(module.getParentId().equals("0")){
				node.setParent("#");
			}else{
				node.setParent("n_"+module.getParentId());
			}
			//设置图标
			if("是".equals(module.getIsLeaf())){
				node.setIcon("glyphicon glyphicon-file text-warning");
			}else{
				node.setIcon("");
			}
			node.setText(module.getModuleName());
			node.setState(state);
			node.setUrl(module.getModuleUrl());
			node.setVueComponent(module.getVueComponent());
			node.setVueNocache(module.getVueNocach());
			node.setVueIcon(module.getVueIcon());
			node.setVuePath(module.getVuePath());
			node.setVueTitle(module.getVueTitle());
			nodes.add(node);
		}
		return nodes;
	}

	/**
	 * 保存模块
	 * @param secModule
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public int saveModuleInfo(@RequestBody SecModule secModule){
		secModule.setAppcod(ApplicationConfig.APP_CODE);
		SecUser user = (SecUser) getLoginUser();
		if(StringUtils.isEmpty(secModule.getModuleId())) {
			secModule.setCreator(user.getUserId());
			return secModuleService.addModule(secModule);
		}else {
			secModule.setUpdator(user.getUserId());
			return secModuleService.updateModule(secModule);
		}
	}


	/**
	 * 保存模块
	 * @param secModule
	 * @return
	 */
	@ApiOperation(value = "根据菜单id获取菜单信息", notes = "根据菜单id获取菜单信息")
	@RequestMapping("getMenuById")
	@ResponseBody
	public ReturnEntity getMenuById(@RequestBody SecModule secModule){
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
		Map<String,Object> map = new HashMap<>();
		SecModule module = new SecModule();
		module = secModuleService.getMenuById(secModule.getModuleId());
		map.put("id",module.getModuleId());
		map.put("zhName",module.getModuleName());
		map.put("enName",module.getEnName());
		map.put("title",module.getVueTitle());
		map.put("path",module.getVuePath());
		map.put("redirect",module.getRedirect());
		map.put("icon",module.getVueIcon());
		map.put("component",module.getVueComponent());
		map.put("noCache",module.getVueNocach());
		map.put("name",module.getName());
		map.put("isLeaf",module.getIsLeaf());
		map.put("valid",module.getValid());
		map.put("parentId",module.getParentId());
		map.put("order",module.getOrderid());
		map.put("creator",module.getCreator());
		map.put("createTime",module.getCreateTime());
		map.put("updator",module.getUpdator());
		map.put("updateTime",module.getUpdateTime());
//		map.put("componentPath",module.getComponentPath());
		returnEntity.setData(map);
		return returnEntity;
	}


	/**
	 * 保存模块
	 * @param map
	 * @return
	 */
	@ApiOperation(value = "保存菜单接口", notes = "保存菜单接口")
	@RequestMapping("saveMenuInfo")
	@ResponseBody
	public ReturnEntity saveMenuInfo(@RequestBody Map<String,Object> map){
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
		String id = ObjectUtils.toString(map.get("id"));
		SecUser user = (SecUser) getLoginUser();
		String uuid = UUIDKit.getUUID();
		SecModule secModule = secModuleService.getMenuById(ObjectUtils.toString(map.get("id")));
		if(null == secModule){
			secModule = new SecModule();
		}
		String appCode = ApplicationConfig.APP_CODE;
		secModule.setAppcod(appCode);
		secModule.setModuleName(ObjectUtils.toString(map.get("zhName")));
		secModule.setEnName(ObjectUtils.toString(map.get("enName")));
		secModule.setVueTitle(ObjectUtils.toString(map.get("title")));
		secModule.setVuePath(ObjectUtils.toString(map.get("path")));
		secModule.setRedirect(ObjectUtils.toString(map.get("redirect")));
		secModule.setVueIcon(ObjectUtils.toString(map.get("icon")));
		secModule.setVueComponent(ObjectUtils.toString(map.get("component")));
		secModule.setVueNocach(ObjectUtils.toString(map.get("noCache")));
		secModule.setName(ObjectUtils.toString(map.get("name")));
		secModule.setIsLeaf(ObjectUtils.toString(map.get("isLeaf")));
		secModule.setValid(ObjectUtils.toString(map.get("valid")));
		secModule.setParentId(ObjectUtils.toString(map.get("parentId")));
		if(null != map.get("order") && "" != map.get("order")){
			secModule.setOrderid(Integer.valueOf(ObjectUtils.toString(map.get("order"))));
		}
		int result = 0;
		if(StringUtils.isEmpty(secModule.getModuleId())) {
			secModule.setCreator(user.getUserId());
			result = secModuleService.addModule(secModule);
			id = uuid;
		}else {
			secModule.setUpdator(user.getUserId());
			secModule.setUpdateTime(new Date());
			result =  secModuleService.updateModule(secModule);
		}

		if(result <= 0 ){
			returnEntity.setMessage(CommonConstants.ERROR_MESSAGE);
			returnEntity.setCode(CommonConstants.ERROR_CODE);
		}

		Map<String,Object> data =  new HashMap<>();
		data.put("id",id);
		data.put("label",secModule.getModuleName());
		returnEntity.setData(data);
		return returnEntity;
	}



//	/**
//	 * 保存模块
//	 * @param map
//	 * @return
//	 */
//	@ApiOperation(value = "保存菜单信息", notes = "保存菜单信息")
//	@RequestMapping(value = "saveModule" ,method = RequestMethod.POST)
//	@ResponseBody
//	public ReturnEntity saveModule(@RequestBody Map<String,Object> map){
//		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE,CommonConstants.SUCCESS_MESSAGE,null);
//		String appCode = ApplicationConfig.APP_CODE;
//		SecModule secModule = new SecModule();
//		secModule.setAppcod(appCode);
//		SecUser user = (SecUser) getLoginUser();
//		//TODO  根据参数保存数据
//
//		int res = 0;
//		if(StringUtils.isEmpty(secModule.getModuleId())) {
//			secModule.setCreateTime(new Date());
//			secModule.setCreator(user.getUserId());
//			res = secModuleService.addModule(secModule);
//		}else {
//			secModule.setUpdator(user.getUserId());
//			secModule.setUpdateTime(new Date());
//			res = secModuleService.updateModule(secModule);
//		}
//		if(res<=0){
//			returnEntity.setMessage(CommonConstants.ERROR_MESSAGE);
//			returnEntity.setCode(CommonConstants.ERROR_CODE);
//		}
//		return returnEntity;
//
//	}

	/**
	 * 删除模块
	 * @param module
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public int deleteModule(@RequestBody SecModule module){
		return secModuleService.deleteModule(module);
	}


	/**
	 * 删除模块
	 * @param module
	 * @return
	 */
	@ApiOperation(value = "删除菜单接口", notes = "删除菜单接口")
	@RequestMapping("deleteMenu")
	@ResponseBody
	public ReturnEntity deleteMenu(@RequestBody SecModule module){
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
		int result = secModuleService.deleteModule(module);
		if(result<=0){
			returnEntity.setMessage(CommonConstants.ERROR_MESSAGE);
			returnEntity.setCode(CommonConstants.ERROR_CODE);
		}
		return returnEntity;
	}
}


