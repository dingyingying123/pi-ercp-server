package cn.com.personnel.ercp.pi.service.group;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.persistence.entity.group.ServerGroupActivityInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.group.ServerGroupActivityInfoMapper;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GroupActivityService extends BaseService implements IGroupActivityService {
    @Autowired
    ServerGroupActivityInfoMapper serverGroupActivityInfoMapper;

    @Override
    public ReturnEntity queryGroupActivityList(ServerGroupActivityInfo serverGroupActivityInfo, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        List<ServerGroupActivityInfo> serverGroupActivityInfoList = serverGroupActivityInfoMapper.queryGroupActivityList(serverGroupActivityInfo);
        return ReturnEntity.ok(new PageInfo<>(serverGroupActivityInfoList));
    }

    @Override
    public ReturnEntity queryGroupActivityInfo(ServerGroupActivityInfo serverGroupActivityInfo) {
        if(serverGroupActivityInfo == null || StringUtils.isEmpty(serverGroupActivityInfo.getGroupId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerGroupActivityInfo groupActivityInfo = serverGroupActivityInfoMapper.selectByPrimaryKey(serverGroupActivityInfo.getGroupId());
        return ReturnEntity.ok(groupActivityInfo);
    }

    @Override
    public ReturnEntity saveGroupActivityInfo(ServerGroupActivityInfo serverGroupActivityInfo, SecUser secUser) {
        if(serverGroupActivityInfo == null || StringUtils.isEmpty(serverGroupActivityInfo.getGroupId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        if(StringUtils.isNotEmpty(serverGroupActivityInfo.getGroupId())){
            serverGroupActivityInfo.setUpdateTime(new Date());
            serverGroupActivityInfo.setUpdator(secUser.getUserId());
            serverGroupActivityInfo.setArea(secUser.getArea());
            serverGroupActivityInfoMapper.updateByPrimaryKeySelective(serverGroupActivityInfo);
        }else {
            //添加接案信息
            serverGroupActivityInfo.setStatus(CommonConstants.ServerApprovalStatus.GROUP_SAVE);
            serverGroupActivityInfo.setGroupId(UUIDKit.getUUID());
            serverGroupActivityInfo.setCreator(secUser.getUserId());
            serverGroupActivityInfo.setCreateTime(new Date());
            serverGroupActivityInfo.setArea(secUser.getArea());
            serverGroupActivityInfoMapper.insert(serverGroupActivityInfo);
        }
        return ReturnEntity.ok(serverGroupActivityInfo);
    }

    @Override
    public ReturnEntity deleteGroupActivityInfo(ServerGroupActivityInfo serverGroupActivityInfo) {
        if(StringUtils.isEmpty(serverGroupActivityInfo.getGroupId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerGroupActivityInfo groupActivityInfo = serverGroupActivityInfoMapper.selectByPrimaryKey(serverGroupActivityInfo.getGroupId());
        if(CommonConstants.ServerApprovalStatus.CASE_SUBMITED.equals(groupActivityInfo.getStatus())){
            return ReturnEntity.errorMsg("小组活动已提交，不能删除！");
        }
        return ReturnEntity.ok(groupActivityInfo);
    }

    @Override
    public ReturnEntity submitGroupActivityInfo(ServerGroupActivityInfo serverGroupActivityInfo, SecUser secUser) {
        if(StringUtils.isEmpty(serverGroupActivityInfo.getGroupId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        serverGroupActivityInfo.setStatus(CommonConstants.ServerApprovalStatus.GROUP_SUBMIT);
        serverGroupActivityInfo.setUpdateTime(new Date());
        serverGroupActivityInfo.setUpdator(secUser.getUserId());
        serverGroupActivityInfo.setArea(secUser.getArea());
        serverGroupActivityInfoMapper.updateByPrimaryKeySelective(serverGroupActivityInfo);
        return ReturnEntity.ok(serverGroupActivityInfo);
    }
}
