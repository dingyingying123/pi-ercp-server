package cn.com.personnel.ercp.pi.controller.system;

import cn.com.personnel.ercp.auth.persistence.entity.SecEnum;
import cn.com.personnel.ercp.auth.persistence.entity.SecEnumType;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.ISecEnumService;
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
@RequestMapping("/admin/auth/sec_enum")
public class AdminSecEnumController extends PageController{
    @RequestMapping
    public String index(){
        return "admin/auth/sec_enum";
    }
    
	@Autowired
	private ISecEnumService secEnumService;
	
	
	/**
	 * 查询所有枚举
	 * @return
	 */
	@RequestMapping("find")
	@ResponseBody
	public List<SecEnum> findEnum(){
		List<SecEnum> list=secEnumService.getAllModuleList();
		return list;
		
	}
	
	/**
	 * 根据父id查询讯息	
	 */
	/*
    @RequestMapping("findId")
	@ResponseBody
	 public  PageInfo<SecEnum> queryEnum(@RequestBody SecEnum secEnum){
		//secEnum.setTypeId(ApplicationConfig.APP_CODE);
       return new PageInfo<SecEnum>(secEnumService.queryUserRole(secEnum, buildPagenation()));
       
    }
    */
	@RequestMapping("findId")
	@ResponseBody
	public ReturnEntity queryEnum(@RequestBody SecEnum secEnum){
		//secEnum.setTypeId(ApplicationConfig.APP_CODE);
		return secEnumService.queryUserRole(secEnum, buildPagenation());

	}
    /**
	 * 搜索查询
	 */
    /*
	@RequestMapping("query")
	@ResponseBody
	public  PageInfo<SecEnum> queryDataEnum(@RequestBody SecEnum secEnum){
	    PageInfo<SecEnum> pageInfo = new PageInfo<SecEnum>(secEnumService.selectName(secEnum, buildPagenation()));
        return pageInfo;
	}
	*/
	@RequestMapping("query")
	@ResponseBody
	public  ReturnEntity queryDataEnum(@RequestBody SecEnum secEnum){
		return secEnumService.selectName(secEnum, buildPagenation());
	}
	/**
	 * 搜索查询
	 */
	@RequestMapping("selectEnumByKey")
	@ResponseBody
	public  List<SecEnum> selectEnumByKey(@RequestBody SecEnumType enumType){
		enumType.setAppcod(CommonConstants.SFS);
		List<SecEnum> secEnumList =secEnumService.selectEnumByKey(enumType.getKey(),enumType.getAppcod());
		return secEnumList;
	}

	/**
	 * 搜索查询
	 */
	@RequestMapping("selectEnumByKeyQms")
	@ResponseBody
	public ReturnEntity selectEnumByKeyQms(@RequestBody SecEnumType enumType){
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
		enumType.setAppcod(CommonConstants.SFS);
		List<SecEnum> secEnumList =secEnumService.selectEnumByKey(enumType.getKey(),enumType.getAppcod());
		returnEntity.setData(secEnumList);
		return returnEntity;
	}
	/**
	 * 
	 * add添加
	 * @param secEnum
	 * @return
	 */
	/*
	@RequestMapping("add")
	@ResponseBody
	public int insertEnum(@RequestBody SecEnum secEnum ){
		SecUser secUser = (SecUser) getLoginUser();
		long uuid = UUID.randomUUID().getMostSignificantBits();
		String str=String.valueOf(uuid);
		secEnum.setId(str);
		secEnum.setDeleted("0");
		secEnum.setCreater(secUser.getUserId());
		secEnum.setCreateTime(new Date());
		return secEnumService.addEnum(secEnum);
	}
	*/
	@RequestMapping("add")
	@ResponseBody
	public ReturnEntity insertEnum(@RequestBody SecEnum secEnum ){
		SecUser secUser = (SecUser) getLoginUser();
		long uuid = UUID.randomUUID().getMostSignificantBits();
		String str=String.valueOf(uuid);
		secEnum.setId(str);
		secEnum.setDeleted("0");
		secEnum.setCreator(secUser.getUserId());
		secEnum.setCreateTime(new Date());
        return secEnumService.addEnum(secEnum);
	}
	/**
	 * 删除
	 */
	/*
	@RequestMapping("delete")
	@ResponseBody
	public int deleteEnumType(@RequestBody String ids) {
		return secEnumService.deleteEnum(ids);
	}
	*/
	@RequestMapping("delete")
	@ResponseBody
	public ReturnEntity deleteEnumType(@RequestBody List<String> ids) {
		return secEnumService.deleteEnum(ids);
	}
	/**
	 * 编辑枚举列
	 * @param secEnum
	 * @return
	 */
	/*
	@RequestMapping("update")
	@ResponseBody
	public SecEnum updateEnum(@RequestBody SecEnum secEnum ){
		SecUser secUser = (SecUser) getLoginUser();
		secEnum.setCreater(secUser.getUserId());
		secEnum.setUpdateTime(new Date());
        return secEnumService.updateEnum(secEnum);
	}
	*/
	@RequestMapping("update")
	@ResponseBody
	public ReturnEntity updateEnum(@RequestBody SecEnum secEnum ){
		SecUser secUser = (SecUser) getLoginUser();
		secEnum.setCreator(secUser.getUserId());
		secEnum.setUpdateTime(new Date());
		return secEnumService.updateEnum(secEnum);
	}

	@RequestMapping("selectNameByKeyByEnlName")
	@ResponseBody
	public ReturnEntity selectNameByKeyByEnlName(@RequestBody SecEnumType enumType ){
		return secEnumService.selectNameByKeyByEnlName(enumType);
	}
}
