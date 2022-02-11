package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.server.ServerInterviewInterventionVO;
import cn.com.personnel.ercp.pi.module.server.ServerPlanInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerAvailableResourcesInfo;
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
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
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
    @Autowired
    ServerAvailableResourcesInfoMapper serverAvailableResourcesInfoMapper;

    @Override
    public ReturnEntity queryInterviewInterventionList(ServerInterviewInterventionVO serverInterviewInterventionVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        List<ServerInterviewInterventionVO> serverInterviewInterventionVOList = serverInterviewInterventionInfoMapper.queryInterventionList(serverInterviewInterventionVO);
        return ReturnEntity.ok(new PageInfo<>(serverInterviewInterventionVOList));
    }


    @Override
    public ReturnEntity queryInterviewInterventionInfo(ServerInterviewInterventionVO serverInterviewInterventionVO) {
        if(serverInterviewInterventionVO == null || StringUtils.isEmpty(serverInterviewInterventionVO.getViewId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerInterviewInterventionVO interviewInterventionVO = serverInterviewInterventionInfoMapper.queryInterviewInterventionInfo(serverInterviewInterventionVO);

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
        logger.info("=============保存直接介入参数：" + serverInterviewInterventionVO);
        if(StringUtils.isEmpty(serverInterviewInterventionVO.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.queryOneStatusByChildId(serverInterviewInterventionVO.getChildId());
        if(serverChildStatusInfo == null){
            return ReturnEntity.errorMsg("儿童信息不存在！");
        }
        if(StringUtils.isEmpty(serverInterviewInterventionVO.getViewId())){
            serverInterviewInterventionVO.setStaId(serverChildStatusInfo.getStaId());
            String planId = UUIDKit.getUUID();
            serverInterviewInterventionVO.setViewId(planId);
            serverInterviewInterventionVO.setViewNo(getNumber());
            serverInterviewInterventionVO.setReceiver(secUser.getUserName());
            serverInterviewInterventionVO.setStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONING_SAVE);
            serverInterviewInterventionVO.setCreator(secUser.getUserId());
            serverInterviewInterventionVO.setCreateTime(new Date());
            serverInterviewInterventionVO.setArea(secUser.getArea());
            serverInterviewInterventionInfoMapper.insert(serverInterviewInterventionVO);

//            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(serverInterviewInterventionVO.getStaId());
            serverChildStatusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONING);
            serverChildStatusInfo.setUpdator(secUser.getUserId());
            serverChildStatusInfo.setUpdateTime(new Date());
            serverChildStatusInfo.setArea(secUser.getArea());
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }else{
            serverInterviewInterventionVO.setStaId(serverChildStatusInfo.getStaId());
            serverInterviewInterventionVO.setUpdator(secUser.getUserId());
            serverInterviewInterventionVO.setUpdateTime(new Date());
            serverInterviewInterventionVO.setArea(secUser.getArea());
            serverInterviewInterventionInfoMapper.updateByPrimaryKeySelective(serverInterviewInterventionVO);
        }
        return ReturnEntity.ok(serverInterviewInterventionVO);
    }

    @Override
    public ReturnEntity submitInterviewInterventionInfo(ServerInterviewInterventionVO serverInterviewInterventionVO, SecUser secUser) {
        if(StringUtils.isEmpty(serverInterviewInterventionVO.getViewId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerInterviewInterventionInfo serverInterviewInterventionInfo = serverInterviewInterventionInfoMapper.selectByPrimaryKey(serverInterviewInterventionVO.getViewId());
        if(serverInterviewInterventionInfo == null){
            return ReturnEntity.errorMsg("数据不存在！");
        }
        serverInterviewInterventionInfo.setStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED);
        serverInterviewInterventionInfo.setUpdateTime(new Date());
        serverInterviewInterventionInfo.setUpdator(secUser.getUserId());
//        serverInterviewInterventionInfo.setArea(secUser.getArea());
        serverInterviewInterventionInfoMapper.updateByPrimaryKeySelective(serverInterviewInterventionInfo);

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverInterviewInterventionInfo.getStaId());
        if("是".equals(serverInterviewInterventionVO.getAllSubmit())){
            statusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED);
        }else {
            statusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONPARTSUBMIT);
        }
        statusInfo.setUpdator(secUser.getUserId());
        statusInfo.setUpdateTime(new Date());
        statusInfo.setArea(secUser.getArea());
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
        Example example = new Example(ServerAvailableResourcesInfo.class);
        example.createCriteria().andEqualTo("staId", serverInterviewInterventionInfo.getStaId());
        List<ServerAvailableResourcesInfo> serverAvailableResourcesInfoList = serverAvailableResourcesInfoMapper.selectByExample(example);
        Example example1 = new Example(ServerInterviewInterventionInfo.class);
        example1.createCriteria().andEqualTo("staId", serverInterviewInterventionInfo.getStaId());
        List<ServerInterviewInterventionInfo> serverInterviewInterventionInfoList = serverInterviewInterventionInfoMapper.selectByExample(example1);
        if(serverAvailableResourcesInfoList.size() == 0 && serverInterviewInterventionInfoList.size() == 0) {
            ServerChildStatusInfo serverChildStatusInfo = new ServerChildStatusInfo();
            serverChildStatusInfo.setStaId(serverInterviewInterventionInfo.getStaId());
            serverChildStatusInfo.setInterventionStatus("");
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }
        return ReturnEntity.ok(serverInterviewInterventionVO);
    }

    public String getNumber() {
        Date date = new Date();
        String prefix = new SimpleDateFormat("yyyy").format(date) + new SimpleDateFormat("MM").format(date);
        logger.info("=========前缀：" + prefix);
        return prefix + serverInterviewInterventionInfoMapper.getLetterNumber(prefix);
    }

    @Override
    public ReturnEntity getLetterNumber() {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        returnEntity.setData(getNumber());
        return returnEntity;
    }
}
