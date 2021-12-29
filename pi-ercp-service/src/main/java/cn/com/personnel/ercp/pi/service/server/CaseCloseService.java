package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.server.ServerCaseClosedInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerEvaluateInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerCaseClosedInfo;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerChildStatusInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerCaseClosedInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerChildStatusInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerEvaluateInfoMapper;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CaseCloseService extends BaseService implements ICaseCloseService {
    @Autowired
    ServerEvaluateInfoMapper serverEvaluateInfoMapper;
    @Autowired
    ServerCaseClosedInfoMapper serverCaseClosedInfoMapper;
    @Autowired
    ServerChildStatusInfoMapper serverChildStatusInfoMapper;

    @Override
    public ReturnEntity queryCaseClosedList(ServerCaseClosedInfoVO serverCaseClosedInfoVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        List<ServerCaseClosedInfoVO> caseClosedList = serverCaseClosedInfoMapper.queryCaseClosedList(serverCaseClosedInfoVO);
        return ReturnEntity.ok(new PageInfo<>(caseClosedList));
    }

    @Override
    public ReturnEntity queryCaseClosedInfo(ServerCaseClosedInfoVO serverCaseClosedInfoVO) {
        if(serverCaseClosedInfoVO == null || StringUtils.isNotEmpty(serverCaseClosedInfoVO.getCloseId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerEvaluateInfoVO evaluateInfoVO = (ServerEvaluateInfoVO) serverEvaluateInfoMapper.selectByPrimaryKey(serverCaseClosedInfoVO.getCloseId());

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
    public ReturnEntity querySubmitEvaluateList(ServerEvaluateInfoVO serverEvaluateInfoVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        serverEvaluateInfoVO.setEvaluateStatus(CommonConstants.ServerApprovalStatus.EVALUATE_SUBMIT);
        List<ServerEvaluateInfoVO> serverEvaluateInfoVOList = serverEvaluateInfoMapper.queryEvaluateList(serverEvaluateInfoVO);
        return ReturnEntity.ok(new PageInfo<>(serverEvaluateInfoVOList));
    }

    @Override
    public ReturnEntity saveCaseClosedInfo(ServerCaseClosedInfoVO serverCaseClosedInfoVO, SecUser secUser) {
        if(StringUtils.isNotEmpty(serverCaseClosedInfoVO.getCloseId())){
            String planId = UUIDKit.getUUID();
            serverCaseClosedInfoVO.setCloseId(planId);
            serverCaseClosedInfoVO.setStatus(CommonConstants.ServerApprovalStatus.CLOSE_CASE_SAVE);
            serverCaseClosedInfoVO.setCreator(secUser.getUserId());
            serverCaseClosedInfoVO.setCreateTime(new Date());
            serverCaseClosedInfoVO.setArea(secUser.getArea());
            serverCaseClosedInfoMapper.insert(serverCaseClosedInfoVO);

            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(serverCaseClosedInfoVO.getStaId());
            serverChildStatusInfo.setEstimateStatus(CommonConstants.ServerApprovalStatus.CLOSE_CASE_SAVE);
            serverChildStatusInfo.setUpdator(secUser.getUserId());
            serverChildStatusInfo.setUpdateTime(new Date());
            serverChildStatusInfo.setArea(secUser.getArea());
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }else{
            serverCaseClosedInfoVO.setUpdator(secUser.getUserId());
            serverCaseClosedInfoVO.setUpdateTime(new Date());
            serverCaseClosedInfoVO.setArea(secUser.getArea());
            serverCaseClosedInfoMapper.updateByPrimaryKeySelective(serverCaseClosedInfoVO);
        }
        return ReturnEntity.ok(serverCaseClosedInfoVO);
    }

    @Override
    public ReturnEntity submitCaseClosedInfo(ServerCaseClosedInfoVO serverCaseClosedInfoVO, SecUser secUser) {
        if(StringUtils.isEmpty(serverCaseClosedInfoVO.getCloseId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        serverCaseClosedInfoVO.setStatus(CommonConstants.ServerApprovalStatus.CLOSE_CASE_SUBMIT);
        serverCaseClosedInfoVO.setUpdateTime(new Date());
        serverCaseClosedInfoVO.setUpdator(secUser.getUserId());
        serverCaseClosedInfoVO.setArea(secUser.getArea());
        serverCaseClosedInfoMapper.updateByPrimaryKeySelective(serverCaseClosedInfoVO);

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverCaseClosedInfoVO.getStaId());
        statusInfo.setEvaluateStatus(CommonConstants.ServerApprovalStatus.CLOSE_CASE_SUBMIT);
        statusInfo.setUpdator(secUser.getUserId());
        statusInfo.setUpdateTime(new Date());
        statusInfo.setArea(secUser.getArea());
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(statusInfo);

        return ReturnEntity.ok(serverCaseClosedInfoVO);
    }

    @Override
    public ReturnEntity deleteCaseClosedInfo(ServerCaseClosedInfoVO serverCaseClosedInfoVO) {
        if(StringUtils.isEmpty(serverCaseClosedInfoVO.getCloseId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerCaseClosedInfo serverCaseClosedInfo = serverCaseClosedInfoMapper.selectByPrimaryKey(serverCaseClosedInfoVO.getCloseId());
        if(CommonConstants.ServerApprovalStatus.CLOSE_CASE_SUBMIT.equals(serverCaseClosedInfo.getStatus())){
            return ReturnEntity.errorMsg("结案已提交，不能删除！");
        }

        serverEvaluateInfoMapper.deleteByPrimaryKey(serverCaseClosedInfoVO.getCloseId());
        serverChildStatusInfoMapper.deleteByPrimaryKey(serverCaseClosedInfo.getStaId());
        return ReturnEntity.ok(serverCaseClosedInfoVO);
    }
}
