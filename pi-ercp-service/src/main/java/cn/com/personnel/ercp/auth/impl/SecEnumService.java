/**
 * Copyright 2019 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.module.JSSelectNode;
import cn.com.personnel.ercp.auth.persistence.entity.SecEnum;
import cn.com.personnel.ercp.auth.persistence.entity.SecEnumType;
import cn.com.personnel.ercp.auth.persistence.mapper.SecEnumMapper;
import cn.com.personnel.ercp.auth.service.ISecEnumService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.exception.BusinessException;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 34351
 *
 */
@Component
public class SecEnumService extends BaseService implements ISecEnumService {
     @Autowired
    private  SecEnumMapper  secEnumMapper ;

     
	@Override
	public List<SecEnum> getAllModuleList() {
		return secEnumMapper.selectAll();
	}

	@Override
	public List<SecEnum> getEnumListByParentId(SecEnum secEnum, PagenationQueryParameter pageParam) {
		// TODO Auto-generated method stub
		return null;
	}
    /*
	@Override
	public int addEnum(SecEnum secEnum) {
		
		return secEnumMapper.insert(secEnum);
	}
	*/
	@Override
	public ReturnEntity addEnum(SecEnum secEnum) {
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
		 secEnumMapper.insert(secEnum);
		 return returnEntity;
	}
	/**
	 * 修改删除标记
	 */
	/*
	@Override
	public int deleteEnum(String ids) {
		
		return secEnumMapper.deleteEnum(ids);
	}
	*/
	@Override
	public ReturnEntity deleteEnum(List<String> ids) {
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
		 secEnumMapper.deleteEnum(ids);
		 return returnEntity;
	}
	@Override
	public int deleteRole(SecEnum secEnum) {
		// TODO Auto-generated method stub
		return 0;
	}
    
	

    /*
	@Override
	public List<SecEnum> queryUserRole(SecEnum secEnum, PagenationQueryParameter pageParam) {
		setPageHelper(pageParam);
		return secEnumMapper.queryRoleUser(secEnum);
	}
	*/
	@Override
	public ReturnEntity queryUserRole(SecEnum secEnum, PagenationQueryParameter pageParam) {
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
		setPageHelper(pageParam);
		List<SecEnum> list=secEnumMapper.queryRoleUser(secEnum);
		returnEntity.setData(new PageInfo<SecEnum>(list));
		return returnEntity;
	}
	/**
	 * name搜索
	 */
	/*
	@Override
	public List<SecEnum> selectName(SecEnum secEnum,PagenationQueryParameter pageParam) {
		// TODO Auto-generated method stub
		setPageHelper(pageParam);
		List<SecEnum> result  = secEnumMapper.selectName(secEnum);
		return result;
		
	}
	*/
	@Override
	public ReturnEntity selectName(SecEnum secEnum,PagenationQueryParameter pageParam) {
		// TODO Auto-generated method stub
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
		setPageHelper(pageParam);
		List<SecEnum> result  = secEnumMapper.selectName(secEnum);
		returnEntity.setData(new PageInfo<SecEnum>(result));
		return returnEntity;

	}
	@Override
	public SecEnum updateRole(SecEnum secEnum) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
     * 编辑枚举列
     */
	/*
    @Override
    public SecEnum updateEnum(SecEnum secEnum) {
    	
    	 try {
             int row = secEnumMapper.updateByPrimaryKeySelective(secEnum);
             if (row > 0)
                 return secEnumMapper.selectByPrimaryKey(secEnum.getId());
         } catch (Exception e) {
             logger.error("secEnum = " + secEnum, e);
         }
         return null;
     
    }
    */
	@Override
	public ReturnEntity updateEnum(SecEnum secEnum) {
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
		try {
			int row = secEnumMapper.updateByPrimaryKeySelective(secEnum);
			if (row > 0)
				return returnEntity;
		} catch (Exception e) {
			logger.error("secEnum = " + secEnum, e);
		}
		return null;

	}
	@Override
	public List<SecEnum> selectEnumByKey(String key, String system) {
		return secEnumMapper.selectEnumByKey(key, system);
	}

	@Override
	public List<JSSelectNode> selectJSSelectNode(String key, String system) {
		//增加国际化判断
		List<SecEnum> list = secEnumMapper.selectEnumByKey(key, system);
		List<JSSelectNode> nodelist= new ArrayList<JSSelectNode>();
		for(SecEnum secEnum:list){
			JSSelectNode node = new JSSelectNode();
			node.setValue(secEnum.getId());
			node.setLabel(secEnum.getName());
			nodelist.add(node);
		}
		return nodelist;
	}

	@Override
	public List<SecEnum> selectEnumByKeyAll(String key, String system) {
		return secEnumMapper.selectEnumByKeyAll(key, system);
	}


	@Override
	public ReturnEntity selectEnumByKey(String key) {
		try {
			//key为逗号隔开的字符串
			String[] keys = key.split(",");
			Map<String,List<SecEnum>> eunmMap=new HashMap<>();
			for (String eunmKey :keys){
				eunmMap.put(eunmKey,selectEnumByKey(eunmKey, CommonConstants.SFS));
			}
			//数据格式化
			return new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, eunmMap);
		} catch (Exception e) {
			throw new BusinessException("查询字段项失败");
		}
	}

	@Override
	public ReturnEntity selectNameByKeyByEnlName(SecEnumType enumType) {
		List<String> enumNameList = secEnumMapper.selectNameByKeyByEnlName(enumType);
		return ReturnEntity.ok(enumNameList);
	}


}
