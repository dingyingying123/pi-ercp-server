package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.server.ServerInterviewInterventionVO;
import cn.com.personnel.ercp.pi.module.server.ServerPlanInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerChildStatusInfo;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerInterviewInterventionInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerAvailableResourcesInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerChildStatusInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerInterviewInterventionInfoMapper;
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
public class InterviewInterventionService extends BaseService implements IInterviewInterventionService {
    @Autowired
    ServerInterviewInterventionInfoMapper serverInterviewInterventionInfoMapper;
    @Autowired
    ServerChildStatusInfoMapper serverChildStatusInfoMapper;
    @Autowired
    ServerPlanInfoMapper serverPlanInfoMapper;


    @Override
    public ReturnEntity queryInterviewInterventionList(ServerInterviewInterventionVO serverInterviewInterventionVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        List<ServerInterviewInterventionVO> serverInterviewInterventionVOList = serverInterviewInterventionInfoMapper.queryInterviewInterventionList(serverInterviewInterventionVO);
        return ReturnEntity.ok(new PageInfo<>(serverInterviewInterventionVOList));
    }

    @Override
    public ReturnEntity queryInterviewInterventionInfo(ServerInterviewInterventionVO serverInterviewInterventionVO) {
        if(serverInterviewInterventionVO == null || StringUtils.isNotEmpty(serverInterviewInterventionVO.getViewId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerInterviewInterventionVO interviewInterventionVO = (ServerInterviewInterventionVO) serverInterviewInterventionInfoMapper.selectByPrimaryKey(serverInterviewInterventionVO.getViewId());

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
    public ReturnEntity querySubmitPlanList(ServerPlanInfoVO serverPlanInfoVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        serverPlanInfoVO.setPlanStatus(CommonConstants.ServerApprovalStatus.PLANSUBMITED);
        List<ServerPlanInfoVO> queryPlanList = serverPlanInfoMapper.queryPlanList(serverPlanInfoVO);
        return ReturnEntity.ok(new PageInfo<>(queryPlanList));
    }

    @Override
    public ReturnEntity saveInterviewInterventionInfo(ServerInterviewInterventionVO serverInterviewInterventionVO, SecUser secUser) {
        if(StringUtils.isNotEmpty(serverInterviewInterventionVO.getViewId())){
            String planId = UUIDKit.getUUID();
            serverInterviewInterventionVO.setViewId(planId);
            serverInterviewInterventionVO.setStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONING_SAVE);
            serverInterviewInterventionVO.setCreator(secUser.getUserId());
            serverInterviewInterventionVO.setCreateTime(new Date());
            serverInterviewInterventionInfoMapper.insert(serverInterviewInterventionVO);

            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(serverInterviewInterventionVO.getStaId());
            serverChildStatusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONING);
            serverChildStatusInfo.setUpdator(secUser.getUserId());
            serverChildStatusInfo.setUpdateTime(new Date());
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }else{
            serverInterviewInterventionVO.setUpdator(secUser.getUserId());
            serverInterviewInterventionVO.setUpdateTime(new Date());
            serverInterviewInterventionInfoMapper.updateByPrimaryKeySelective(serverInterviewInterventionVO);
        }
        return ReturnEntity.ok(serverInterviewInterventionVO);
    }

    @Override
    public ReturnEntity submitInterviewInterventionInfo(ServerInterviewInterventionVO serverInterviewInterventionVO, SecUser secUser) {
        if(StringUtils.isEmpty(serverInterviewInterventionVO.getViewId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        serverInterviewInterventionVO.setStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED);
        serverInterviewInterventionVO.setUpdateTime(new Date());
        serverInterviewInterventionVO.setUpdator(secUser.getUserId());
        serverInterviewInterventionInfoMapper.updateByPrimaryKeySelective(serverInterviewInterventionVO);

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverInterviewInterventionVO.getStaId());
        if("是".equals(serverInterviewInterventionVO.getAllSubmit())){
            statusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED);
        }else {
            statusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONPARTSUBMIT);
        }
        statusInfo.setUpdator(secUser.getUserId());
        statusInfo.setUpdateTime(new Date());
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(statusInfo);

        return ReturnEntity.ok(serverInterviewInterventionVO);
    }

    @Override
    public ReturnEntity deleteInterviewInterventionInfo(ServerInterviewInterventionVO serverInterviewInterventionVO) {
        if(StringUtils.isEmpty(serverInterviewInterventionVO.getViewId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerInterviewInterventionInfo serverInterviewInterventionInfo = serverInterviewInterventionInfoMapper.selectByPrimaryKey(serverInterviewInterventionVO.getViewId());
        if(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED.equals(serverInterviewInterventionInfo.getStatus())){
            return ReturnEntity.errorMsg("介入已提交，不能删除！");
        }

        serverInterviewInterventionInfoMapper.deleteByPrimaryKey(serverInterviewInterventionVO.getViewId());
        serverChildStatusInfoMapper.deleteByPrimaryKey(serverInterviewInterventionInfo.getStaId());
        return ReturnEntity.ok(serverInterviewInterventionVO);
    }
}
