package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.server.ServerAvailableResourcesInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerAvailableResourcesInfo;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerChildStatusInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerAvailableResourcesInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerChildStatusInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerPlanInfoMapper;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AvailableResourcesService extends BaseService implements IAvailableResourcesService {
    @Autowired
    ServerAvailableResourcesInfoMapper serverAvailableResourcesInfoMapper;
    @Autowired
    ServerChildStatusInfoMapper serverChildStatusInfoMapper;
    @Autowired
    ServerPlanInfoMapper serverPlanInfoMapper;

    @Override
    public ReturnEntity queryAvailableResourcesList(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        List<ServerAvailableResourcesInfoVO> serverInterviewInterventionVOList = serverAvailableResourcesInfoMapper.queryAvailableResourcesList(serverAvailableResourcesInfoVO);
        return ReturnEntity.ok(new PageInfo<>(serverInterviewInterventionVOList));
    }

    @Override
    public ReturnEntity queryAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO) {
        if(serverAvailableResourcesInfoVO == null || StringUtils.isNotEmpty(serverAvailableResourcesInfoVO.getAvaId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerAvailableResourcesInfoVO interviewInterventionVO = (ServerAvailableResourcesInfoVO) serverAvailableResourcesInfoMapper.selectByPrimaryKey(serverAvailableResourcesInfoVO.getAvaId());

        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(interviewInterventionVO.getStaId());
        interviewInterventionVO.setCaseStatus(serverChildStatusInfo.getCaseStatus());
        interviewInterventionVO.setEstimateStatus(serverChildStatusInfo.getEstimateStatus());
        interviewInterventionVO.setPlanStatus(serverChildStatusInfo.getPlanStatus());
        interviewInterventionVO.setInterventionStatus(serverChildStatusInfo.getInterventionStatus());
        interviewInterventionVO.setEvaluateStatus(serverChildStatusInfo.getEvaluateStatus());
        interviewInterventionVO.setCaseClosedStatus(serverChildStatusInfo.getCaseClosedStatus());
        return ReturnEntity.ok(interviewInterventionVO);
    }

    @Override
    public ReturnEntity saveAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO, SecUser secUser) {
        if(StringUtils.isNotEmpty(serverAvailableResourcesInfoVO.getAvaId())){
            String planId = UUIDKit.getUUID();
            serverAvailableResourcesInfoVO.setAvaId(planId);
            serverAvailableResourcesInfoVO.setStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONING_SAVE);
            serverAvailableResourcesInfoVO.setCreator(secUser.getUserId());
            serverAvailableResourcesInfoVO.setCreateTime(new Date());
            serverAvailableResourcesInfoMapper.insert(serverAvailableResourcesInfoVO);

            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(serverAvailableResourcesInfoVO.getStaId());
            serverChildStatusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONING);
            serverChildStatusInfo.setUpdator(secUser.getUserId());
            serverChildStatusInfo.setUpdateTime(new Date());
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }else{
            serverAvailableResourcesInfoVO.setUpdator(secUser.getUserId());
            serverAvailableResourcesInfoVO.setUpdateTime(new Date());
            serverAvailableResourcesInfoMapper.updateByPrimaryKeySelective(serverAvailableResourcesInfoVO);
        }
        return ReturnEntity.ok(serverAvailableResourcesInfoVO);
    }

    @Override
    public ReturnEntity submitAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO, SecUser secUser) {
        if(StringUtils.isEmpty(serverAvailableResourcesInfoVO.getAvaId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        serverAvailableResourcesInfoVO.setStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED);
        serverAvailableResourcesInfoVO.setUpdateTime(new Date());
        serverAvailableResourcesInfoVO.setUpdator(secUser.getUserId());
        serverAvailableResourcesInfoMapper.updateByPrimaryKeySelective(serverAvailableResourcesInfoVO);

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverAvailableResourcesInfoVO.getStaId());
        if("是".equals(serverAvailableResourcesInfoVO.getAllSubmit())){
            statusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED);
        }else {
            statusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONPARTSUBMIT);
        }
        statusInfo.setUpdator(secUser.getUserId());
        statusInfo.setUpdateTime(new Date());
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(statusInfo);

        return ReturnEntity.ok(serverAvailableResourcesInfoVO);
    }

    @Override
    public ReturnEntity deleteAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO) {
        if(StringUtils.isEmpty(serverAvailableResourcesInfoVO.getAvaId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerAvailableResourcesInfo serverInterviewInterventionInfo = serverAvailableResourcesInfoMapper.selectByPrimaryKey(serverAvailableResourcesInfoVO.getAvaId());
        if(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED.equals(serverInterviewInterventionInfo.getStatus())){
            return ReturnEntity.errorMsg("介入已提交，不能删除！");
        }

        serverAvailableResourcesInfoMapper.deleteByPrimaryKey(serverAvailableResourcesInfoVO.getAvaId());
        serverChildStatusInfoMapper.deleteByPrimaryKey(serverInterviewInterventionInfo.getStaId());
        return ReturnEntity.ok(serverAvailableResourcesInfoVO);
    }
}
