/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.module.JSSelectNode;
import cn.com.personnel.ercp.auth.persistence.entity.SecEnum;
import cn.com.personnel.ercp.auth.persistence.entity.SecEnumType;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;

/**
 * @author 34351
 *
 */
public interface ISecEnumService extends IService {
	//public int deleteEnum(String ids);
    public ReturnEntity deleteEnum(List<String> ids);
	/**
     * @return
     */
    List<SecEnum> getAllModuleList();

    /**
     * @param secEnum 
     * 
     */
    List<SecEnum> getEnumListByParentId(SecEnum secEnum, PagenationQueryParameter pageParam);

    /**
     * @param secEnum
     * @return
     */
    //int addEnum(SecEnum secEnum);
    ReturnEntity addEnum(SecEnum secEnum);
    /**
     * @param secEnum
     * @return
     */
    SecEnum updateRole(SecEnum secEnum);

    /**
     * @param secEnum
     * @return
     */
    int deleteRole(SecEnum secEnum);
    //ReturnEntity deleteRole(SecEnum secEnum);
    
    /**
     * 
     * @param type_id
     * @return
     */

	//List<SecEnum> queryUserRole(SecEnum secEnum, PagenationQueryParameter buildPagenation);
    ReturnEntity queryUserRole(SecEnum secEnum, PagenationQueryParameter buildPagenation);

	//List<SecEnum> selectName(SecEnum secEnum, PagenationQueryParameter pageParam);
    ReturnEntity selectName(SecEnum secEnum, PagenationQueryParameter pageParam);
	//SecEnum updateEnum(SecEnum secEnum);
    ReturnEntity updateEnum(SecEnum secEnum);

    List<SecEnum> selectEnumByKey(String key, String system);

    List<JSSelectNode> selectJSSelectNode(String key, String system);

    List<SecEnum> selectEnumByKeyAll(String key, String system);

    ReturnEntity selectEnumByKey(String key);

    ReturnEntity selectNameByKeyByEnlName(SecEnumType enumType);
}
