package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.server.ServerEstimateInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerTakeCaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.*;
import cn.com.personnel.ercp.pi.persistence.mapper.server.*;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EstimateService extends BaseService implements IEstimateService {
    @Autowired
    ServerEstimateInfoMapper serverEstimateInfoMapper;
    @Autowired
    ServerHighRiskFamilyInfoMapper serverHighRiskFamilyInfoMapper;
    @Autowired
    ServerAssesseeChildMapper serverAssesseeChildMapper;
    @Autowired
    ServerChildStatusInfoMapper serverChildStatusInfoMapper;
    @Autowired
    ServerTakeCaseInfoMapper serverTakeCaseInfoMapper;

    @Override
    public ReturnEntity queryEstimateList(ServerEstimateInfoVO serverEstimateInfoVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        List<ServerEstimateInfoVO> serverEstimateInfoVOList = serverEstimateInfoMapper.queryEstimateList(serverEstimateInfoVO);
        return ReturnEntity.ok(new PageInfo<ServerEstimateInfoVO>(serverEstimateInfoVOList));
    }

    @Override
    public ReturnEntity queryEstimateInfo(ServerEstimateInfoVO serverEstimateInfoVO) {
        if(serverEstimateInfoVO == null || StringUtils.isEmpty(serverEstimateInfoVO.getEstId())){
            return ReturnEntity.errorMsg("???????????????");
        }
        ServerEstimateInfoVO estimateInfoVO = serverEstimateInfoMapper.queryEstimateInfo(serverEstimateInfoVO);
        Example example = new Example(ServerHighRiskFamilyInfo.class);
        example.createCriteria().andEqualTo("estId", serverEstimateInfoVO.getEstId());
        List<ServerHighRiskFamilyInfo> serverHighRiskFamilyInfoList = serverHighRiskFamilyInfoMapper.selectByExample(example);
        if(serverHighRiskFamilyInfoList.size() > 0){
            ServerHighRiskFamilyInfo serverHighRiskFamilyInfo = serverHighRiskFamilyInfoList.get(0);
            estimateInfoVO.setServerHighRiskFamilyInfo(serverHighRiskFamilyInfo);
            Example example1 = new Example(ServerAssesseeChild.class);
            example1.createCriteria().andEqualTo("riskId", serverHighRiskFamilyInfo.getRiskId());
            List<ServerAssesseeChild> serverAssesseeChildList = serverAssesseeChildMapper.selectByExample(example1);
            estimateInfoVO.setServerAssesseeChildList(serverAssesseeChildList);
        } else{
            estimateInfoVO.setServerHighRiskFamilyInfo(new ServerHighRiskFamilyInfo());
            estimateInfoVO.setServerAssesseeChildList(new ArrayList<>());
        }

        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(estimateInfoVO.getStaId());
        estimateInfoVO.setCaseStatus(serverChildStatusInfo.getCaseStatus());
        estimateInfoVO.setEstimateStatus(serverChildStatusInfo.getEstimateStatus());
        estimateInfoVO.setPlanStatus(serverChildStatusInfo.getPlanStatus());
        estimateInfoVO.setInterventionStatus(serverChildStatusInfo.getInterventionStatus());
        estimateInfoVO.setEvaluateStatus(serverChildStatusInfo.getEvaluateStatus());
        estimateInfoVO.setCaseClosedStatus(serverChildStatusInfo.getCaseClosedStatus());
        logger.info("=============???????????????????????????" + serverEstimateInfoVO);
        return ReturnEntity.ok(estimateInfoVO);
    }

    @Override
    public ReturnEntity querySubmitTaskCaseList(ServerTakeCaseInfoVO serverTakeCaseInfoVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        serverTakeCaseInfoVO.setCaseStatus(CommonConstants.ServerApprovalStatus.CASE_SUBMITED);
        List<ServerTakeCaseInfoVO> serverTakeCaseInfoList = serverTakeCaseInfoMapper.queryTakeCaseList(serverTakeCaseInfoVO);
        return ReturnEntity.ok(new PageInfo<ServerTakeCaseInfoVO>(serverTakeCaseInfoList));
    }

    @Override
    public ReturnEntity saveEstimateInfo(ServerEstimateInfoVO serverEstimateInfoVO, SecUser secUser) {
        logger.info("=============?????????????????????" + serverEstimateInfoVO);
        if(StringUtils.isEmpty(serverEstimateInfoVO.getChildId())){
            return ReturnEntity.errorMsg("???????????????");
        }
        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.queryOneStatusByChildId(serverEstimateInfoVO.getChildId());
        if(serverChildStatusInfo == null){
            return ReturnEntity.errorMsg("????????????????????????");
        }
        if(StringUtils.isEmpty(serverEstimateInfoVO.getEstId())){
            serverEstimateInfoVO.setStaId(serverChildStatusInfo.getStaId());
            String estId = UUIDKit.getUUID();
            serverEstimateInfoVO.setEstId(estId);
            serverEstimateInfoVO.setEstimateNo(getNumber());
            serverEstimateInfoVO.setReceiver(secUser.getUserName());
            serverEstimateInfoVO.setStatus(CommonConstants.ServerApprovalStatus.ESTIMATE_SAVE);
            serverEstimateInfoVO.setCreator(secUser.getUserId());
            serverEstimateInfoVO.setCreateTime(new Date());
            serverEstimateInfoVO.setArea(secUser.getArea());
            serverEstimateInfoMapper.insert(serverEstimateInfoVO);
            if(serverEstimateInfoVO.getServerHighRiskFamilyInfo() != null){
                ServerHighRiskFamilyInfo serverHighRiskFamilyInfo = serverEstimateInfoVO.getServerHighRiskFamilyInfo();
                String riskId = UUIDKit.getUUID();
                serverHighRiskFamilyInfo.setRiskId(riskId);
                serverHighRiskFamilyInfo.setEstId(estId);
                serverHighRiskFamilyInfo.setChildId(serverEstimateInfoVO.getChildId());
                serverHighRiskFamilyInfo.setStaId(serverChildStatusInfo.getStaId());
                serverHighRiskFamilyInfo.setReceiver(secUser.getUserName());
                serverHighRiskFamilyInfo.setCreator(secUser.getUserId());
                serverHighRiskFamilyInfo.setCreateTime(new Date());
                serverHighRiskFamilyInfoMapper.insert(serverHighRiskFamilyInfo);
                if(serverEstimateInfoVO.getServerAssesseeChildList() != null && serverEstimateInfoVO.getServerAssesseeChildList().size() > 0){
                    for(ServerAssesseeChild assesseeChild : serverEstimateInfoVO.getServerAssesseeChildList()){
                        assesseeChild.setAssesseeId(UUIDKit.getUUID());
                        assesseeChild.setRiskId(riskId);
                        assesseeChild.setEstId(estId);
                        assesseeChild.setCreator(secUser.getUserId());
                        assesseeChild.setCreateTime(new Date());
                        serverAssesseeChildMapper.insert(assesseeChild);
                    }
                }
            }


//            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(serverEstimateInfoVO.getStaId());
            serverChildStatusInfo.setEstimateStatus(CommonConstants.ServerApprovalStatus.ESTIMATE_SAVE);
            serverChildStatusInfo.setUpdator(secUser.getUserId());
            serverChildStatusInfo.setUpdateTime(new Date());
            serverChildStatusInfo.setArea(secUser.getArea());
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }else{
            serverEstimateInfoVO.setStaId(serverChildStatusInfo.getStaId());
            serverEstimateInfoVO.setUpdator(secUser.getUserId());
            serverEstimateInfoVO.setUpdateTime(new Date());
            serverEstimateInfoVO.setArea(secUser.getArea());
            serverEstimateInfoMapper.updateByPrimaryKeySelective(serverEstimateInfoVO);
            if(serverEstimateInfoVO.getServerHighRiskFamilyInfo() != null){
                ServerHighRiskFamilyInfo serverHighRiskFamilyInfo = serverEstimateInfoVO.getServerHighRiskFamilyInfo();
                String riskId = serverHighRiskFamilyInfo.getRiskId();
                if(StringUtils.isEmpty(riskId)){
                    riskId = UUIDKit.getUUID();
                    serverHighRiskFamilyInfo.setRiskId(riskId);
                    serverHighRiskFamilyInfo.setEstId(serverEstimateInfoVO.getEstId());
                    serverHighRiskFamilyInfo.setCreator(secUser.getUserId());
                    serverHighRiskFamilyInfo.setCreateTime(new Date());
                    serverHighRiskFamilyInfoMapper.insert(serverHighRiskFamilyInfo);
                }else{
                    serverHighRiskFamilyInfo.setEstId(serverEstimateInfoVO.getEstId());
                    serverHighRiskFamilyInfo.setUpdator(secUser.getUserId());
                    serverHighRiskFamilyInfo.setUpdateTime(new Date());
                    serverHighRiskFamilyInfoMapper.updateByPrimaryKeySelective(serverHighRiskFamilyInfo);
                }
                Example example = new Example(ServerAssesseeChild.class);
                example.createCriteria().andEqualTo("riskId", riskId);
                serverAssesseeChildMapper.deleteByExample(example);
                if(serverEstimateInfoVO.getServerAssesseeChildList() != null && serverEstimateInfoVO.getServerAssesseeChildList().size() > 0){
                    for(ServerAssesseeChild assesseeChild : serverEstimateInfoVO.getServerAssesseeChildList()){
                        assesseeChild.setAssesseeId(UUIDKit.getUUID());
                        assesseeChild.setRiskId(riskId);
                        assesseeChild.setEstId(serverEstimateInfoVO.getEstId());
                        assesseeChild.setCreator(secUser.getUserId());
                        assesseeChild.setCreateTime(new Date());
                        serverAssesseeChildMapper.insert(assesseeChild);
                    }
                }
            }
        }
        if(serverEstimateInfoVO.getServerHighRiskFamilyInfo() == null){
            serverEstimateInfoVO.setServerHighRiskFamilyInfo(new ServerHighRiskFamilyInfo());
        }
        if(serverEstimateInfoVO.getServerAssesseeChildList() == null || serverEstimateInfoVO.getServerAssesseeChildList().size() == 0){
            serverEstimateInfoVO.setServerAssesseeChildList(new ArrayList<>());
        }
        return ReturnEntity.ok(serverEstimateInfoVO);
    }

    @Override
    public ReturnEntity deleteEstimateInfo(ServerEstimateInfoVO serverEstimateInfoVO) {
        if(StringUtils.isEmpty(serverEstimateInfoVO.getEstId())){
            return ReturnEntity.errorMsg("???????????????");
        }
        ServerEstimateInfo serverEstimateInfo = serverEstimateInfoMapper.selectByPrimaryKey(serverEstimateInfoVO.getEstId());
        if(CommonConstants.ServerApprovalStatus.ESTIMATE_SUBMITED.equals(serverEstimateInfo.getStatus())){
            return ReturnEntity.errorMsg("?????????????????????????????????");
        }
        Example example = new Example(ServerHighRiskFamilyInfo.class);
        example.createCriteria().andEqualTo("estId", serverEstimateInfoVO.getEstId());
        serverHighRiskFamilyInfoMapper.deleteByExample(example);
        Example example1 = new Example(ServerAssesseeChild.class);
        example1.createCriteria().andEqualTo("estId", serverEstimateInfoVO.getEstId());
        serverAssesseeChildMapper.deleteByExample(example1);
        serverEstimateInfoMapper.deleteByPrimaryKey(serverEstimateInfoVO.getEstId());
        ServerChildStatusInfo serverChildStatusInfo = new ServerChildStatusInfo();
        serverChildStatusInfo.setStaId(serverEstimateInfo.getStaId());
        serverChildStatusInfo.setEstimateStatus("");
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        return ReturnEntity.ok(serverEstimateInfoVO);
    }

    @Override
    public ReturnEntity submitEstimateInfo(ServerEstimateInfoVO serverEstimateInfoVO, SecUser secUser) {
        if(StringUtils.isEmpty(serverEstimateInfoVO.getEstId())){
            return ReturnEntity.errorMsg("???????????????");
        }
        ServerEstimateInfo serverEstimateInfo = serverEstimateInfoMapper.selectByPrimaryKey(serverEstimateInfoVO.getEstId());
        if(serverEstimateInfo == null){
            return ReturnEntity.errorMsg("??????????????????");
        }

        if(StringUtils.isEmpty(serverEstimateInfo.getChildName())){
            return ReturnEntity.errorMsg("??????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(serverEstimateInfo.getChildMale())){
            return ReturnEntity.errorMsg("???????????????????????????");
        }
        if(StringUtils.isEmpty(serverEstimateInfo.getChildAge())){
            return ReturnEntity.errorMsg("??????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(serverEstimateInfo.getAcceptanceReason())){
            return ReturnEntity.errorMsg("??????????????????????????????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(serverEstimateInfo.getFamilyBackground())){
            return ReturnEntity.errorMsg("??????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(serverEstimateInfo.getImportantGrowthExperience())){
            return ReturnEntity.errorMsg("????????????????????????????????????????????????");
        }

        serverEstimateInfo.setStatus(CommonConstants.ServerApprovalStatus.ESTIMATE_SUBMITED);
        serverEstimateInfo.setUpdateTime(new Date());
        serverEstimateInfo.setUpdator(secUser.getUserId());
//        serverEstimateInfo.setArea(secUser.getArea());
        serverEstimateInfoMapper.updateByPrimaryKeySelective(serverEstimateInfo);

        if(serverEstimateInfoVO.getServerHighRiskFamilyInfo() != null){
            ServerHighRiskFamilyInfo serverHighRiskFamilyInfo = serverEstimateInfoVO.getServerHighRiskFamilyInfo();
            String riskId = serverHighRiskFamilyInfo.getRiskId();
            if(StringUtils.isEmpty(riskId)){
                riskId = UUIDKit.getUUID();
                serverHighRiskFamilyInfo.setRiskId(riskId);
                serverHighRiskFamilyInfo.setEstId(serverEstimateInfoVO.getEstId());
                serverHighRiskFamilyInfo.setCreator(secUser.getUserId());
                serverHighRiskFamilyInfo.setCreateTime(new Date());
                serverHighRiskFamilyInfoMapper.insert(serverHighRiskFamilyInfo);
            }else{
                serverHighRiskFamilyInfo.setEstId(serverEstimateInfoVO.getEstId());
                serverHighRiskFamilyInfo.setUpdator(secUser.getUserId());
                serverHighRiskFamilyInfo.setUpdateTime(new Date());
                serverHighRiskFamilyInfoMapper.updateByPrimaryKeySelective(serverHighRiskFamilyInfo);
            }
            Example example = new Example(ServerAssesseeChild.class);
            example.createCriteria().andEqualTo("riskId", riskId);
            serverAssesseeChildMapper.deleteByExample(example);
            if(serverEstimateInfoVO.getServerAssesseeChildList() != null && serverEstimateInfoVO.getServerAssesseeChildList().size() > 0){
                for(ServerAssesseeChild assesseeChild : serverEstimateInfoVO.getServerAssesseeChildList()){
                    assesseeChild.setAssesseeId(UUIDKit.getUUID());
                    assesseeChild.setRiskId(riskId);
                    assesseeChild.setEstId(serverEstimateInfoVO.getEstId());
                    assesseeChild.setCreator(secUser.getUserId());
                    assesseeChild.setCreateTime(new Date());
                    serverAssesseeChildMapper.insert(assesseeChild);
                }
            }
        }

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverEstimateInfo.getStaId());
        statusInfo.setEstimateStatus(CommonConstants.ServerApprovalStatus.ESTIMATE_SUBMITED);
        statusInfo.setUpdator(secUser.getUserId());
        statusInfo.setUpdateTime(new Date());
        statusInfo.setArea(secUser.getArea());
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(statusInfo);

        return ReturnEntity.ok(serverEstimateInfoVO);
    }

    public String getNumber() {
        Date date = new Date();
        String prefix = new SimpleDateFormat("yyyy").format(date) + new SimpleDateFormat("MM").format(date);
        logger.info("=========?????????" + prefix);
        return prefix + serverEstimateInfoMapper.getLetterNumber(prefix);
    }

    @Override
    public ReturnEntity getLetterNumber() {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        returnEntity.setData(getNumber());
        return returnEntity;
    }
}
