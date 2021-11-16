package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.persistence.entity.CesButton;
import cn.com.personnel.ercp.auth.persistence.mapper.CesButtonMapper;
import cn.com.personnel.ercp.auth.service.ICesButtonService;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component
public class CesButtonService extends BaseService implements ICesButtonService {

    @Autowired
	private CesButtonMapper cesButtonMapper;


    @Override
    public CesButton add(CesButton cesButton) {
        cesButton.setId(UUID.randomUUID().toString().replaceAll("-",""));
        cesButton.setIsdelete((short)1);
        cesButton.setCreateTime(new Date());
        int i = cesButtonMapper.insert(cesButton);
        if(i==1){
            return cesButton;
        }
        return null;
    }

    @Override
    public int delete(String id) {
        return cesButtonMapper.remove(id);
    }

    @Override
    public CesButton modify(CesButton cesButton) {
        cesButton.setUpdateTime(new Date());
        int i = cesButtonMapper.modify(cesButton);
        if(i==1){
            return cesButton;
        }
        return null;
    }

    @Override
    public List<CesButton> query(CesButton cesButton, PagenationQueryParameter pageParam) {
        pageParam.setLimit(10);
        setPageHelper(pageParam);
        return cesButtonMapper.query(cesButton.getIsdelete(), cesButton.getButtonType(),cesButton.getButtonName());
    }

    @Override
    public List<CesButton> selectAll(PagenationQueryParameter pageParam, String systemCode) {
        pageParam.setLimit(10);
        setPageHelper(pageParam);
        return cesButtonMapper.selectByCondition(systemCode);
    }

    @Override
    public List<CesButton> getAllButton(String systemCode) {
        return cesButtonMapper.selectByCondition(systemCode);
    }
}
