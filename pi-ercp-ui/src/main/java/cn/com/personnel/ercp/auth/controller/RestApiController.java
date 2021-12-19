package cn.com.personnel.ercp.auth.controller;

import cn.com.personnel.ercp.auth.module.RestUser;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.ISecUserService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 提供Rest方法
 */
@Controller
@RequestMapping("/restApi")
public class RestApiController extends PageController{

	@Autowired
	private ISecUserService secUserService;
	
	/**
	 * 新增用户
	 * @param restUser
	 * @return
	 */
	@RequestMapping("addUser")
	@ResponseBody
	public String insertUser(@RequestBody RestUser restUser){
		SecUser secUser=new SecUser();
		convertRestUser(restUser,secUser);
		secUser.setCreator("system");
		return secUserService.addRestUser(secUser);
	}
	

	/**
	 * 编辑用户
	 * @param restUser
	 * @return
	 */
	@RequestMapping("updateUser")
	@ResponseBody
	public String updateUser(@RequestBody RestUser restUser ){
		SecUser secUser=new SecUser();
		convertRestUser(restUser,secUser);
		secUser.setUpdator("system");
        return secUserService.updateRestUser(secUser);
	}
	
	/**
	 * 作废用户
	 * @return
	 */
	@RequestMapping("deleteUser")
	@ResponseBody
	public String deleteUser(String account,String type){
		return secUserService.deleteRestUser(account,type);
	}
	
	public void convertRestUser(RestUser restUser, SecUser secUser) {
		String pernr = restUser.getPernr().replaceAll("^(0+)", "");
		secUser.setUserId(pernr);
		secUser.setUserName(restUser.getEname());
		
		if(restUser.getGesc()!=null&&restUser.getGesc().equals("1")) {
			secUser.setMale("男");
		}else if(restUser.getGesc()!=null&&restUser.getGesc().equals("2")) {
			secUser.setMale("女");
		}
		secUser.setTelNo(restUser.getZhr_cell());
		secUser.setEmail(restUser.getZhr_email());
		
//		if(restUser.getZhr_status()!=null&&restUser.getZhr_status().equals("3")) {
//			secUser.setActiveType("已激活");
//		}else {
//			secUser.setActiveType("未激活");
//		}
//		secUser.setDepartmentId(restUser.getOrgeh());
	}

}
