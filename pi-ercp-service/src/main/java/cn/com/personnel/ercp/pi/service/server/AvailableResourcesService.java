package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.server.ServerAvailableResourcesInfoVO;
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
public class AvailableResourcesService extends BaseService implements IAvailableResourcesService {
    @Autowired
    ServerAvailableResourcesInfoMapper serverAvailableResourcesInfoMapper;
    @Autowired
    ServerChildStatusInfoMapper serverChildStatusInfoMapper;
    @Autowired
    ServerPlanInfoMapper serverPlanInfoMapper;
    @Autowired
    ServerInterviewInterventionInfoMapper serverInterviewInterventionInfoMapper;

    @Override
    public ReturnEntity queryAvailableResourcesList(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        List<ServerAvailableResourcesInfoVO> serverInterviewInterventionVOList = serverAvailableResourcesInfoMapper.queryAvailableResourcesList(serverAvailableResourcesInfoVO);
        return ReturnEntity.ok(new PageInfo<>(serverInterviewInterventionVOList));
    }

    @Override
    public ReturnEntity queryAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO) {
        if(serverAvailableResourcesInfoVO == null || StringUtils.isEmpty(serverAvailableResourcesInfoVO.getAvaId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerAvailableResourcesInfoVO interviewInterventionVO = serverAvailableResourcesInfoMapper.queryAvailableResourcesInfo(serverAvailableResourcesInfoVO);

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
        logger.info("=========间接介入参数：" + serverAvailableResourcesInfoVO);
        if(StringUtils.isEmpty(serverAvailableResourcesInfoVO.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.queryOneStatusByChildId(serverAvailableResourcesInfoVO.getChildId());
        if(serverChildStatusInfo == null){
            return ReturnEntity.errorMsg("儿童信息不存在！");
        }
        if(StringUtils.isEmpty(serverAvailableResourcesInfoVO.getAvaId())){
            serverAvailableResourcesInfoVO.setStaId(serverChildStatusInfo.getStaId());
            String planId = UUIDKit.getUUID();
            serverAvailableResourcesInfoVO.setAvaId(planId);
            serverAvailableResourcesInfoVO.setAvailableNo(getNumber());

            serverAvailableResourcesInfoVO.setReceiver(secUser.getUserName());
            serverAvailableResourcesInfoVO.setStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONING_SAVE);
            serverAvailableResourcesInfoVO.setCreator(secUser.getUserId());
            serverAvailableResourcesInfoVO.setCreateTime(new Date());
            serverAvailableResourcesInfoVO.setArea(secUser.getArea());
            serverAvailableResourcesInfoMapper.insert(serverAvailableResourcesInfoVO);

//            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(serverAvailableResourcesInfoVO.getStaId());
            serverChildStatusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONING);
            serverChildStatusInfo.setUpdator(secUser.getUserId());
            serverChildStatusInfo.setUpdateTime(new Date());
            serverChildStatusInfo.setArea(secUser.getArea());
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }else{
            serverAvailableResourcesInfoVO.setStaId(serverChildStatusInfo.getStaId());
            serverAvailableResourcesInfoVO.setUpdator(secUser.getUserId());
            serverAvailableResourcesInfoVO.setUpdateTime(new Date());
            serverAvailableResourcesInfoVO.setArea(secUser.getArea());
            serverAvailableResourcesInfoMapper.updateByPrimaryKeySelective(serverAvailableResourcesInfoVO);
        }
        return ReturnEntity.ok(serverAvailableResourcesInfoVO);
    }

    @Override
    public ReturnEntity submitAvailableResourcesInfo(ServerAvailableResourcesInfoVO serverAvailableResourcesInfoVO, SecUser secUser) {
        if(StringUtils.isEmpty(serverAvailableResourcesInfoVO.getAvaId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerAvailableResourcesInfo serverAvailableResourcesInfo = serverAvailableResourcesInfoMapper.selectByPrimaryKey(serverAvailableResourcesInfoVO.getAvaId());
        if(serverAvailableResourcesInfo == null){
            return ReturnEntity.errorMsg("数据不存在！");
        }
        serverAvailableResourcesInfo.setStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED);
        serverAvailableResourcesInfo.setUpdateTime(new Date());
        serverAvailableResourcesInfo.setUpdator(secUser.getUserId());
//        serverAvailableResourcesInfo.setArea(secUser.getArea());
        serverAvailableResourcesInfoMapper.updateByPrimaryKeySelective(serverAvailableResourcesInfo);

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverAvailableResourcesInfo.getStaId());
        if("是".equals(serverAvailableResourcesInfoVO.getAllSubmit())){
            statusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED);
        }else {
            statusInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONPARTSUBMIT);
        }
        statusInfo.setUpdator(secUser.getUserId());
        statusInfo.setUpdateTime(new Date());
        statusInfo.setArea(secUser.getArea());
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
        Example example = new Example(ServerInterviewInterventionInfo.class);
        example.createCriteria().andEqualTo("staId", serverInterviewInterventionInfo.getStaId());
        List<ServerInterviewInterventionInfo> serverInterviewInterventionInfoList = serverInterviewInterventionInfoMapper.selectByExample(example);
        Example example1 = new Example(ServerAvailableResourcesInfo.class);
        example1.createCriteria().andEqualTo("staId", serverInterviewInterventionInfo.getStaId());
        List<ServerAvailableResourcesInfo> serverAvailableResourcesInfoList = serverAvailableResourcesInfoMapper.selectByExample(example1);
        if(serverInterviewInterventionInfoList.size() == 0 && serverAvailableResourcesInfoList.size() == 0) {
            ServerChildStatusInfo serverChildStatusInfo = new ServerChildStatusInfo();
            serverChildStatusInfo.setStaId(serverInterviewInterventionInfo.getStaId());
            serverChildStatusInfo.setInterventionStatus("");
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }
        return ReturnEntity.ok(serverAvailableResourcesInfoVO);
    }

    public String getNumber() {
        Date date = new Date();
        String prefix = new SimpleDateFormat("yyyy").format(date) + new SimpleDateFormat("MM").format(date);
        logger.info("=========前缀：" + prefix);
        return prefix + serverAvailableResourcesInfoMapper.getLetterNumber(prefix);
    }

    @Override
    public ReturnEntity getLetterNumber() {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        returnEntity.setData(getNumber());
        return returnEntity;
    }
}
