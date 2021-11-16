package cn.com.personnel.springboot.framework.service;

import cn.com.personnel.springboot.framework.core.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.pagehelper.PageHelper;

import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

/**
 * @author lfjin
 *
 */
public abstract class BaseService implements IService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected void setPageHelper(PagenationQueryParameter pageParam) {
        if(pageParam!=null) {
            PageHelper.startPage(pageParam.getOffset(), pageParam.getLimit());
        }
    }
}
