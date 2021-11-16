package cn.com.personnel.ercp.pi.controller.system;

import cn.com.personnel.ercp.auth.persistence.entity.SecEnumType;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.ISecEnumTypeService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Controller
@RequestMapping("/admin/auth/sec_enum_type")
public class AdminSecEnumTypeController extends PageController{

    @RequestMapping
    public String index(){
        return "admin/auth/sec_enum_type";
    }
    
	@Autowired
	private ISecEnumTypeService secEnumTypeService;

	/**
	 * 查询所有枚举
	 * @return
	 */
	@RequestMapping("find")
	@ResponseBody
	public ReturnEntity findEnum(@RequestBody SecEnumType secEnumType){
		secEnumType.setAppcod(CommonConstants.SFS);
		return secEnumTypeService.getAllModuleList(secEnumType, buildPagenation());
	}
	/**
	 * 搜索查询
	 */
	@RequestMapping("query")
	@ResponseBody
	public  ReturnEntity queryData(@RequestBody SecEnumType secEnumType){
		secEnumType.setAppcod(CommonConstants.SFS);
		return secEnumTypeService.selectByCondition(secEnumType, buildPagenation());
	}
	/**
	 * add添加
	 */
	
	@RequestMapping("add")
	@ResponseBody
	public ReturnEntity insertEnumType(@RequestBody SecEnumType secEnumType){
		SecUser secUser = (SecUser) getLoginUser();
		long uuid = UUID.randomUUID().getMostSignificantBits();
		String str=String.valueOf(uuid);
		secEnumType.setTypeId(str);
		secEnumType.setDeleted("0");
		secEnumType.setAppcod(CommonConstants.SFS);
		secEnumType.setCreator(secUser.getUserId());
		secEnumType.setCreateTime(new Date());
        return secEnumTypeService.addEnumType(secEnumType);
	}
	/**
	 * delete删除
	 */
	/*
	@RequestMapping("delete")
	@ResponseBody
	public int deleteEnumType(@RequestBody String typeIds) {
		//写自己的逻辑
		return secEnumTypeService.deleteEnumType(typeIds);
		//return secEnumTypeService.deleteEnumType(secEnumType);
	}
	*/
	@RequestMapping("delete")
	@ResponseBody
	public ReturnEntity deleteEnumType(@RequestBody List<String> typeIds) {
		//写自己的逻辑
		return secEnumTypeService.deleteEnumType(typeIds);
		//return secEnumTypeService.deleteEnumType(secEnumType);
	}
	/**
	 * 编辑枚举列类
	 * 
	 */
	/*
	@RequestMapping("update")
	@ResponseBody
	public SecEnumType updateEnumType(@RequestBody SecEnumType secEnumType ){
		SecUser secUser = (SecUser) getLoginUser();
		secEnumType.setCreater(secUser.getUserId());
		secEnumType.setUpdateTime(new Date());
        return secEnumTypeService.updateEnumType(secEnumType);
	}
	*/
	@RequestMapping("update")
	@ResponseBody
	public ReturnEntity updateEnumType(@RequestBody SecEnumType secEnumType ){
		SecUser secUser = (SecUser) getLoginUser();
		secEnumType.setUpdator(secUser.getUserId());
		secEnumType.setUpdateTime(new Date());
		return secEnumTypeService.updateEnumType(secEnumType);
	}
}
