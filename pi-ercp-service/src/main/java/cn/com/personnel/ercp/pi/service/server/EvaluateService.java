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

import java.text.SimpleDateFormat;
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
        if(serverEvaluateInfoVO == null || StringUtils.isEmpty(serverEvaluateInfoVO.getEvaluateId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerEvaluateInfoVO evaluateInfoVO = serverEvaluateInfoMapper.queryEvaluateInfo(serverEvaluateInfoVO);

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
        logger.info("=============保存评价参数：" + serverEvaluateInfoVO);
        if(StringUtils.isEmpty(serverEvaluateInfoVO.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.queryOneStatusByChildId(serverEvaluateInfoVO.getChildId());
        if(serverChildStatusInfo == null){
            return ReturnEntity.errorMsg("儿童信息不存在！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfoVO.getEvaluateId())){
            serverEvaluateInfoVO.setStaId(serverChildStatusInfo.getStaId());
            String planId = UUIDKit.getUUID();
            serverEvaluateInfoVO.setEvaluateId(planId);
            serverEvaluateInfoVO.setEvaluateNo(getNumber());
            serverEvaluateInfoVO.setReceiver(secUser.getUserName());
            serverEvaluateInfoVO.setStatus(CommonConstants.ServerApprovalStatus.EVALUATE_SAVE);
            serverEvaluateInfoVO.setCreator(secUser.getUserId());
            serverEvaluateInfoVO.setCreateTime(new Date());
            serverEvaluateInfoVO.setArea(secUser.getArea());
            serverEvaluateInfoMapper.insert(serverEvaluateInfoVO);

//            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(serverEvaluateInfoVO.getStaId());
            serverChildStatusInfo.setEstimateStatus(CommonConstants.ServerApprovalStatus.EVALUATE_SAVE);
            serverChildStatusInfo.setUpdator(secUser.getUserId());
            serverChildStatusInfo.setUpdateTime(new Date());
            serverChildStatusInfo.setArea(secUser.getArea());
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }else{
            serverEvaluateInfoVO.setStaId(serverChildStatusInfo.getStaId());
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
        ServerEvaluateInfo serverEvaluateInfo = serverEvaluateInfoMapper.selectByPrimaryKey(serverEvaluateInfoVO.getEvaluateId());
        if(serverEvaluateInfo == null){
            return ReturnEntity.errorMsg("数据不存在！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getChildName())){
            return ReturnEntity.errorMsg("儿童姓名为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getChildMale())){
            return ReturnEntity.errorMsg("儿童性别为必填项！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getChildAge())){
            return ReturnEntity.errorMsg("儿童年龄为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getCaseDescription())){
            return ReturnEntity.errorMsg("个案描述为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getServiceGoal())){
            return ReturnEntity.errorMsg("服务目标为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getServiceStartDate())){
            return ReturnEntity.errorMsg("服务起止日期为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getServicesProvidedAndProgress())){
            return ReturnEntity.errorMsg("提供的服务及进展情况为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getCurrentStatusChildren())){
            return ReturnEntity.errorMsg("儿童现状为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getCaseClosedSituation())){
            return ReturnEntity.errorMsg("结案情况为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getInterventionWorkReflection())){
            return ReturnEntity.errorMsg("介入工作反思为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getHelpReceived())){
            return ReturnEntity.errorMsg("获得的帮助为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverEvaluateInfo.getIsMeetsExpectations())){
            return ReturnEntity.errorMsg("是否达到预期为必填项，不能为空！");
        }
        serverEvaluateInfo.setStatus(CommonConstants.ServerApprovalStatus.EVALUATE_SUBMIT);
        serverEvaluateInfo.setUpdateTime(new Date());
        serverEvaluateInfo.setUpdator(secUser.getUserId());
//        serverEvaluateInfo.setArea(secUser.getArea());
        serverEvaluateInfoMapper.updateByPrimaryKeySelective(serverEvaluateInfo);

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverEvaluateInfo.getStaId());
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
        ServerChildStatusInfo serverChildStatusInfo = new ServerChildStatusInfo();
        serverChildStatusInfo.setStaId(serverEvaluateInfo.getStaId());
        serverChildStatusInfo.setEvaluateStatus("");
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        return ReturnEntity.ok(serverEvaluateInfoVO);
    }

    public String getNumber() {
        Date date = new Date();
        String prefix = new SimpleDateFormat("yyyy").format(date) + new SimpleDateFormat("MM").format(date);
        logger.info("=========前缀：" + prefix);
        return prefix + serverEvaluateInfoMapper.getLetterNumber(prefix);
    }

    @Override
    public ReturnEntity getLetterNumber() {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        returnEntity.setData(getNumber());
        return returnEntity;
    }
}
