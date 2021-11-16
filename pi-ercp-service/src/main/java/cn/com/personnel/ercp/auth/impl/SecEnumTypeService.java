/**
 * Copyright 2019 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.persistence.entity.SecEnumType;
import cn.com.personnel.ercp.auth.persistence.mapper.SecEnumTypeMapper;
import cn.com.personnel.ercp.auth.service.ISecEnumTypeService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 34351
 *
 */
@Component
public class SecEnumTypeService extends BaseService implements ISecEnumTypeService {
     @Autowired
    private  SecEnumTypeMapper  secEnumTypeMapper ;
     /**
      * 查询所有的枚举
      */
    /*
	@Override
	public List<SecEnumType> getAllModuleList(SecEnumType secEnumType, PagenationQueryParameter pageParam) {
		setPageHelper(pageParam);
		 List<SecEnumType> list=secEnumTypeMapper.selectId(secEnumType);
		return list;
	}
    */
	@Override
	public ReturnEntity getAllModuleList(SecEnumType secEnumType, PagenationQueryParameter pagenationQueryParameter) {
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
		setPageHelper(pagenationQueryParameter);
		//List<SecEnumType> list=secEnumTypeMapper.selectId(secEnumType);
		List<SecEnumType> list  = secEnumTypeMapper.selectByCondition(secEnumType);
		returnEntity.setData(new PageInfo<SecEnumType>(list));
		return returnEntity;
	}
	/**
     * 新增枚举
     */
	@Override
	public ReturnEntity addEnumType(SecEnumType secEnumType) {
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
		 secEnumTypeMapper.insert(secEnumType);
		return returnEntity;
	}
	/**
     * 更新枚举
     */
	@Override
	public SecEnumType updateRole(SecEnumType secEnumType) {
		// TODO Auto-generated method stub
		return null;
	}
	  /**
     * 删除枚举
     */
	  /*
	@Override
	public int deleteEnumType(String typeIds) {
		// TODO Auto-generated method stub
		
		return secEnumTypeMapper.deletedEnumType(typeIds);
	}
	*/
	@Override
	public ReturnEntity deleteEnumType(List<String> typeIds) {
		// TODO Auto-generated method stub
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
		 secEnumTypeMapper.deletedEnumType(typeIds);
		return returnEntity;
	}
	/**
	 * name搜索
	 */
	/*
	@Override
	public List<SecEnumType> selectByCondition(SecEnumType secEnumType,PagenationQueryParameter pageParam) {
		// TODO Auto-generated method stub
		setPageHelper(pageParam);
		List<SecEnumType> result  = secEnumTypeMapper.selectByCondition(secEnumType);
		return result;
		
	}
	*/
	@Override
	public ReturnEntity selectByCondition(SecEnumType secEnumType,PagenationQueryParameter pageParam) {
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
		setPageHelper(pageParam);
		List<SecEnumType> result  = secEnumTypeMapper.selectByCondition(secEnumType);
		returnEntity.setData(new PageInfo<SecEnumType>(result));
		return returnEntity;

	}
    /*
	@Override
	public SecEnumType updateEnumType(SecEnumType secEnumType) {
		 try {
             int row = secEnumTypeMapper.updateByPrimaryKeySelective(secEnumType);
             if (row > 0)
                 return secEnumTypeMapper.selectByPrimaryKey(secEnumType.getTypeId());
         } catch (Exception e) {
             logger.error("secEnumType = " + secEnumTypeMapper, e);
         }
		return null;
	}
    */
	@Override
	public ReturnEntity updateEnumType(SecEnumType secEnumType) {
		ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
		try {
			int row = secEnumTypeMapper.updateByPrimaryKeySelective(secEnumType);
			if (row > 0)
				//return secEnumTypeMapper.selectByPrimaryKey(secEnumType.getTypeId());
				return returnEntity;
		} catch (Exception e) {
			logger.error("secEnumType = " + secEnumTypeMapper, e);
		}
		return null;
	}
	
	
    

}
