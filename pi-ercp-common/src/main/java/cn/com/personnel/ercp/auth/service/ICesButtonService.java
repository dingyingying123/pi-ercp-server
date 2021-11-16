/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.ercp.auth.persistence.entity.CesButton;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.List;

/**
 * @author liujf
 *
 */
public interface ICesButtonService extends IService {

    CesButton add(CesButton cesButton);

    List<CesButton> getAllButton(String systemCode);

    int delete(String id);

    CesButton modify(CesButton cesButton);

    List<CesButton> query(CesButton cesButton, PagenationQueryParameter pageParam);

    List<CesButton> selectAll(PagenationQueryParameter pageParam, String systemCode);

}
