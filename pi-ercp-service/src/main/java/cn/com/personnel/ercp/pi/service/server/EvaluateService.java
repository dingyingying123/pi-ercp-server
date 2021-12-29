package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.server.ServerEvaluateInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerInterviewInterventionVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerChildStatusInfo;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerEvaluateInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerChildStatusInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerEvaluateInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerInterviewInterventionInfoMapper;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EvaluateService extends BaseService implements IEvaluateService {
    @Autowired
    ServerEvaluateInfoMapper serverEvaluateInfoMapper;
    @Autowired
    ServerInterviewInterventionInfoMapper serverInterviewInterventionInfoMapper;
    @Autowired
    ServerChildStatusInfoMapper serverChildStatusInfoMapper;

    @Override
    public ReturnEntity queryEvaluateList(ServerEvaluateInfoVO serverEvaluateInfoVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        List<ServerEvaluateInfoVO> serverEvaluateInfoVOList = serverEvaluateInfoMapper.queryEvaluateList(serverEvaluateInfoVO);
        return ReturnEntity.ok(new PageInfo<>(serverEvaluateInfoVOList));
    }

    @Override
    public ReturnEntity queryEvaluateInfo(ServerEvaluateInfoVO serverEvaluateInfoVO) {
        if(serverEvaluateInfoVO == null || StringUtils.isNotEmpty(serverEvaluateInfoVO.getEvaluateId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerEvaluateInfoVO evaluateInfoVO = (ServerEvaluateInfoVO) serverEvaluateInfoMapper.selectByPrimaryKey(serverEvaluateInfoVO.getEvaluateId());

        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(evaluateInfoVO.getStaId());
        evaluateInfoVO.setCaseStatus(serverChildStatusInfo.getCaseStatus());
        evaluateInfoVO.setEstimateStatus(serverChildStatusInfo.getEstimateStatus());
        evaluateInfoVO.setPlanStatus(serverChildStatusInfo.getPlanStatus());
        evaluateInfoVO.setInterventionStatus(serverChildStatusInfo.getInterventionStatus());
        evaluateInfoVO.setEvaluateStatus(serverChildStatusInfo.getEvaluateStatus());
        evaluateInfoVO.setCaseClosedStatus(serverChildStatusInfo.getCaseClosedStatus());
        return ReturnEntity.ok(evaluateInfoVO);
    }

    @Override
    public ReturnEntity querySubmitInterviewInterventionList(ServerInterviewInterventionVO serverInterviewInterventionVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        serverInterviewInterventionVO.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED);
        List<ServerInterviewInterventionVO> serverInterviewInterventionVOList = serverInterviewInterventionInfoMapper.queryInterviewInterventionList(serverInterviewInterventionVO);
        return ReturnEntity.ok(new PageInfo<>(serverInterviewInterventionVOList));
    }

    @Override
    public ReturnEntity saveEvaluateInfo(ServerEvaluateInfoVO serverEvaluateInfoVO, SecUser secUser) {
        if(StringUtils.isNotEmpty(serverEvaluateInfoVO.getEvaluateId())){
            String planId = UUIDKit.getUUID();
            serverEvaluateInfoVO.setEvaluateId(planId);
            serverEvaluateInfoVO.setStatus(CommonConstants.ServerApprovalStatus.EVALUATE_SAVE);
            serverEvaluateInfoVO.setCreator(secUser.getUserId());
            serverEvaluateInfoVO.setCreateTime(new Date());
            serverEvaluateInfoVO.setArea(secUser.getArea());
            serverEvaluateInfoMapper.insert(serverEvaluateInfoVO);

            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(serverEvaluateInfoVO.getStaId());
            serverChildStatusInfo.setEstimateStatus(CommonConstants.ServerApprovalStatus.EVALUATE_SAVE);
            serverChildStatusInfo.setUpdator(secUser.getUserId());
            serverChildStatusInfo.setUpdateTime(new Date());
            serverChildStatusInfo.setArea(secUser.getArea());
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }else{
            serverEvaluateInfoVO.setUpdator(secUser.getUserId());
            serverEvaluateInfoVO.setUpdateTime(new Date());
            serverEvaluateInfoVO.setArea(secUser.getArea());
            serverEvaluateInfoMapper.updateByPrimaryKeySelective(serverEvaluateInfoVO);
        }
        return ReturnEntity.ok(serverEvaluateInfoVO);
    }

    @Override
    public ReturnEntity submitEvaluateInfo(ServerEvaluateInfoVO serverEvaluateInfoVO, SecUser secUser) {
        if(StringUtils.isEmpty(serverEvaluateInfoVO.getEvaluateId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        serverEvaluateInfoVO.setStatus(CommonConstants.ServerApprovalStatus.EVALUATE_SUBMIT);
        serverEvaluateInfoVO.setUpdateTime(new Date());
        serverEvaluateInfoVO.setUpdator(secUser.getUserId());
        serverEvaluateInfoVO.setArea(secUser.getArea());
        serverEvaluateInfoMapper.updateByPrimaryKeySelective(serverEvaluateInfoVO);

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverEvaluateInfoVO.getStaId());
        statusInfo.setEvaluateStatus(CommonConstants.ServerApprovalStatus.EVALUATE_SUBMIT);
        statusInfo.setUpdator(secUser.getUserId());
        statusInfo.setUpdateTime(new Date());
        statusInfo.setArea(secUser.getArea());
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(statusInfo);

        return ReturnEntity.ok(serverEvaluateInfoVO);
    }

    @Override
    public ReturnEntity deleteEvaluateInfo(ServerEvaluateInfoVO serverEvaluateInfoVO) {
        if(StringUtils.isEmpty(serverEvaluateInfoVO.getEvaluateId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerEvaluateInfo serverEvaluateInfo = serverEvaluateInfoMapper.selectByPrimaryKey(serverEvaluateInfoVO.getEvaluateId());
        if(CommonConstants.ServerApprovalStatus.EVALUATE_SUBMIT.equals(serverEvaluateInfo.getStatus())){
            return ReturnEntity.errorMsg("评估已提交，不能删除！");
        }

        serverEvaluateInfoMapper.deleteByPrimaryKey(serverEvaluateInfoVO.getEvaluateId());
        serverChildStatusInfoMapper.deleteByPrimaryKey(serverEvaluateInfo.getStaId());
        return ReturnEntity.ok(serverEvaluateInfoVO);
    }
}
