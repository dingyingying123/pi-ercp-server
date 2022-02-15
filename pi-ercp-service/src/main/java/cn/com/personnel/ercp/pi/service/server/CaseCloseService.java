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

import java.text.SimpleDateFormat;
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
        if(serverCaseClosedInfoVO == null || StringUtils.isEmpty(serverCaseClosedInfoVO.getCloseId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerCaseClosedInfoVO caseClosedInfoVO = serverCaseClosedInfoMapper.queryCaseClosedInfo(serverCaseClosedInfoVO);

        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(caseClosedInfoVO.getStaId());
        caseClosedInfoVO.setCaseStatus(serverChildStatusInfo.getCaseStatus());
        caseClosedInfoVO.setEstimateStatus(serverChildStatusInfo.getEstimateStatus());
        caseClosedInfoVO.setPlanStatus(serverChildStatusInfo.getPlanStatus());
        caseClosedInfoVO.setInterventionStatus(serverChildStatusInfo.getInterventionStatus());
        caseClosedInfoVO.setEvaluateStatus(serverChildStatusInfo.getEvaluateStatus());
        caseClosedInfoVO.setCaseClosedStatus(serverChildStatusInfo.getCaseClosedStatus());
        return ReturnEntity.ok(caseClosedInfoVO);
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
        if(StringUtils.isEmpty(serverCaseClosedInfoVO.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.queryOneStatusByChildId(serverCaseClosedInfoVO.getChildId());
        if(serverChildStatusInfo == null){
            return ReturnEntity.errorMsg("儿童信息不存在！");
        }
        if(StringUtils.isEmpty(serverCaseClosedInfoVO.getCloseId())){
            serverCaseClosedInfoVO.setStaId(serverChildStatusInfo.getStaId());
            String planId = UUIDKit.getUUID();
            serverCaseClosedInfoVO.setCloseId(planId);
            serverCaseClosedInfoVO.setCloseNo(getNumber());
            serverCaseClosedInfoVO.setReceiver(secUser.getUserName());
            serverCaseClosedInfoVO.setStatus(CommonConstants.ServerApprovalStatus.CLOSE_CASE_SAVE);
            serverCaseClosedInfoVO.setCreator(secUser.getUserId());
            serverCaseClosedInfoVO.setCreateTime(new Date());
            serverCaseClosedInfoVO.setArea(secUser.getArea());
            serverCaseClosedInfoMapper.insert(serverCaseClosedInfoVO);

//            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(serverCaseClosedInfoVO.getStaId());
            serverChildStatusInfo.setEstimateStatus(CommonConstants.ServerApprovalStatus.CLOSE_CASE_SAVE);
            serverChildStatusInfo.setUpdator(secUser.getUserId());
            serverChildStatusInfo.setUpdateTime(new Date());
            serverChildStatusInfo.setArea(secUser.getArea());
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }else{
            serverCaseClosedInfoVO.setStaId(serverChildStatusInfo.getStaId());
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
        ServerCaseClosedInfo serverCaseClosedInfo = serverCaseClosedInfoMapper.selectByPrimaryKey(serverCaseClosedInfoVO.getCloseId());
        if(serverCaseClosedInfo == null){
            return ReturnEntity.errorMsg("数据不存在！");
        }
        if(StringUtils.isEmpty(serverCaseClosedInfo.getChildName())){
            return ReturnEntity.errorMsg("儿童姓名为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverCaseClosedInfo.getChildMale())){
            return ReturnEntity.errorMsg("儿童性别为必填项！");
        }
        if(StringUtils.isEmpty(serverCaseClosedInfo.getChildAge())){
            return ReturnEntity.errorMsg("儿童年龄为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverCaseClosedInfo.getCaseClosedDate())){
            return ReturnEntity.errorMsg("结案个案日期为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverCaseClosedInfo.getCurrentStatusServiceObjects())){
            return ReturnEntity.errorMsg("服务对象现状为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverCaseClosedInfo.getReasonForClosing())){
            return ReturnEntity.errorMsg("结案原因为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(serverCaseClosedInfo.getDoYouKnowEnd())){
            return ReturnEntity.errorMsg("服务对象知道个案已结束并知道在有需要时如何得到服务为必填项，不能为空！");
        }
        serverCaseClosedInfo.setStatus(CommonConstants.ServerApprovalStatus.CLOSE_CASE_SUBMIT);
        serverCaseClosedInfo.setUpdateTime(new Date());
        serverCaseClosedInfo.setUpdator(secUser.getUserId());
//        serverCaseClosedInfo.setArea(secUser.getArea());
        serverCaseClosedInfoMapper.updateByPrimaryKeySelective(serverCaseClosedInfo);

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverCaseClosedInfo.getStaId());
        statusInfo.setEvaluateStatus(CommonConstants.ServerApprovalStatus.CLOSE_CASE_SUBMIT);
        statusInfo.setUpdator(secUser.getUserId());
        statusInfo.setUpdateTime(new Date());
        statusInfo.setArea(secUser.getArea());
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(statusInfo);

        return ReturnEntity.ok(serverCaseClosedInfoVO);
    }

    @Override
    public ReturnEntity deleteCaseClosedInfo(ServerCaseClosedInfoVO serverCaseClosedInfoVO) {
        logger.info("=============保存结案参数：" + serverCaseClosedInfoVO);
        if(StringUtils.isEmpty(serverCaseClosedInfoVO.getCloseId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerCaseClosedInfo serverCaseClosedInfo = serverCaseClosedInfoMapper.selectByPrimaryKey(serverCaseClosedInfoVO.getCloseId());
        if(CommonConstants.ServerApprovalStatus.CLOSE_CASE_SUBMIT.equals(serverCaseClosedInfo.getStatus())){
            return ReturnEntity.errorMsg("结案已提交，不能删除！");
        }

        serverEvaluateInfoMapper.deleteByPrimaryKey(serverCaseClosedInfoVO.getCloseId());
        ServerChildStatusInfo serverChildStatusInfo = new ServerChildStatusInfo();
        serverChildStatusInfo.setStaId(serverCaseClosedInfo.getStaId());
        serverChildStatusInfo.setCaseClosedStatus("");
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        return ReturnEntity.ok(serverCaseClosedInfoVO);
    }

    public String getNumber() {
        Date date = new Date();
        String prefix = new SimpleDateFormat("yyyy").format(date) + new SimpleDateFormat("MM").format(date);
        logger.info("=========前缀：" + prefix);
        return prefix + serverCaseClosedInfoMapper.getLetterNumber(prefix);
    }

    @Override
    public ReturnEntity getLetterNumber() {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        returnEntity.setData(getNumber());
        return returnEntity;
    }
}
