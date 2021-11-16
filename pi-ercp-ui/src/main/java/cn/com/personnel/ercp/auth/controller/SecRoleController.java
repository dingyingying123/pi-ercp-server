package cn.com.personnel.ercp.auth.controller;

import cn.com.personnel.ercp.auth.persistence.entity.SecRole;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.ISecRoleService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/auth/role")
public class SecRoleController extends PageController{

	@RequestMapping()
	public String index(){
		return "auth/role";
	}

	@Autowired
	private ISecRoleService secRoleService;

	/**
	 * 按条件查找角色
	 * @param condition
	 * @return
	 */
	@RequestMapping("query")
	@ResponseBody
	public PageInfo<SecRole> queryData(@RequestBody SecRole condition){
		condition.setAppcod(ApplicationConfig.APP_CODE);
		PageInfo<SecRole> pageInfo = new PageInfo<SecRole>(secRoleService.queryRole(condition,buildPagenation()));
		return pageInfo;
	}


	/**
	 * 按条件查找角色
	 * @param condition
	 * @return
	 */
	@RequestMapping("query_web")
	@ResponseBody
	public ReturnEntity query_web(@RequestBody SecRole condition){

		condition.setAppcod(ApplicationConfig.APP_CODE);
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,new PageInfo<SecRole>(secRoleService.queryRole(condition,buildPagenation())));
		return returnEntity;
	}

	/**
	 * 报价管理角色查询
	 * @param condition
	 * @return
	 */
	@RequestMapping("queryBjRole")
	@ResponseBody
	public PageInfo<SecRole> queryBjRole(@RequestBody SecRole condition){
		condition.setAppcod("ces_hn");
		PageInfo<SecRole> pageInfo = new PageInfo<SecRole>(secRoleService.queryRole(condition,buildPagenation()));
		return pageInfo;
	}

	/**
	 * 新增角色
	 * @param secRole
	 * @return
	 */
	@RequestMapping("add")
	@ResponseBody
	public SecRole insertRole(@RequestBody SecRole secRole ){
		SecUser user = (SecUser) getLoginUser();
		secRole.setCreator(user.getUserId());
		secRole.setAppcod(ApplicationConfig.APP_CODE);
		SecRole addRole = secRoleService.addRole(secRole);
		return addRole;

	}

	/**
	 * 更新角色信息
	 * @param secRole
	 * @return
	 */
	@RequestMapping("update")
	@ResponseBody
	public SecRole updateRole(@RequestBody SecRole secRole ){
		SecUser user = (SecUser) getLoginUser();
		secRole.setUpdator(user.getUserId());
		secRole.setAppcod(ApplicationConfig.APP_CODE);
		secRole.setUpdateTime(new Date());
		SecRole updateRole = secRoleService.updateRole(secRole);
		return updateRole;
	}

	/**
	 * 删除角色信息
	 * @param secRole
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public  int deleteRole( @RequestBody SecRole secRole ){
		int deleteRole = secRoleService.deleteRole(secRole);
		return deleteRole;
	}

	@ApiOperation(value = "查询系统所有角色", notes = "查询系统所有角色")
	@RequestMapping(value = "/getAllUserRole",method = RequestMethod.GET)
	@ResponseBody
	public ReturnEntity getAllUserRole() {
		List<Map> secRoleList = secRoleService.findAllRoles(ApplicationConfig.APP_CODE);
		if (secRoleList.size() > 0) {
			JSONArray jsonarr = JSONArray.parseArray(JSON.toJSONString(secRoleList));
			return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, jsonarr);
		}
		JSONArray jsonarr = JSONArray.parseArray(JSON.toJSONString(secRoleList));
		return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, "");
	}

	/**
	 * 查找角色
	 * @param condition
	 * @return
	 */
	@RequestMapping("queryRole")
	@ResponseBody
	public ReturnEntity queryRole(@RequestBody SecRole condition){
		String appStr= Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
		condition.setAppcod(appStr);
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,(secRoleService.queryRole(condition,null)));
		return returnEntity;
	}


}
