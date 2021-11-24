package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiChildrenBaseInfoMapper;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PiChildrenBaseInfoService extends BaseService implements IPiChildrenBaseInfoService {
    @Autowired
    PiChildrenBaseInfoMapper piChildrenBaseInfoMapper;

    @Override
    public ReturnEntity queryPiChildrenBaseInfoList(PiChildrenBaseInfo piChildrenBaseInfo, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        List<PiChildrenBaseInfo> childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
        return ReturnEntity.ok(new PageInfo<PiChildrenBaseInfo>(childrenBaseInfoList));
    }

    @Override
    public ReturnEntity savePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser) {
        if(piChildrenBaseInfo != null && StringUtils.isNotEmpty(piChildrenBaseInfo.getChildId())){
            piChildrenBaseInfo.setUpdateTime(new Date());
            piChildrenBaseInfo.setUpdator(secUser.getUserId());
            piChildrenBaseInfoMapper.updateByPrimaryKeySelective(piChildrenBaseInfo);
        }else{
            piChildrenBaseInfo.setChildId(UUIDKit.getUUID());
            piChildrenBaseInfo.setCreateTime(new Date());
            piChildrenBaseInfo.setCreator(secUser.getUserId());
            piChildrenBaseInfo.setStatus("起草");
            piChildrenBaseInfoMapper.insert(piChildrenBaseInfo);
        }
        return ReturnEntity.ok(piChildrenBaseInfo);
    }
}
