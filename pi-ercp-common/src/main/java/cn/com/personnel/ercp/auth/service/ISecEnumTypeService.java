/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecEnumType;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;

/**
 * @author 34351
 *
 */
public interface ISecEnumTypeService extends IService {

	/**
     * @return
     */
    //List<SecEnumType> getAllModuleList(SecEnumType secEnumType,PagenationQueryParameter pageParam);
    ReturnEntity getAllModuleList(SecEnumType secEnumType, PagenationQueryParameter pagenationQueryParameter);
    
    /**
     * @param secEnumType
     * @return
     */
    ReturnEntity addEnumType(SecEnumType secEnumType);

    /**
     * @param secEnumType
     * @return
     */
    SecEnumType updateRole(SecEnumType secEnumType);

    /**
     * @param typeIds
     * @return
     */
    //int deleteEnumType(String typeIds);
    ReturnEntity deleteEnumType(List<String> typeIds);
    /**
     * 
     * @param secEnumType
     * @return
     */
    //public List<SecEnumType> selectByCondition(SecEnumType secEnumType,PagenationQueryParameter pageParam);
    public ReturnEntity selectByCondition(SecEnumType secEnumType, PagenationQueryParameter pageParam);

    //SecEnumType updateEnumType(SecEnumType secEnumType);
    ReturnEntity updateEnumType(SecEnumType secEnumType);

   
}
