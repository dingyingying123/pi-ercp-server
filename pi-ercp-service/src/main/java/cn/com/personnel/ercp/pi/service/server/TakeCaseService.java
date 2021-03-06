package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerTakeCaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerChildStatusInfo;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerTakeCaseFamilyMember;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerTakeCaseInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiChildrenBaseInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.*;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class TakeCaseService extends BaseService implements ITakeCaseService {
    @Autowired
    ServerTakeCaseInfoMapper serverTakeCaseInfoMapper;
    @Autowired
    ServerTakeCaseFamilyMemberMapper serverTakeCaseFamilyMemberMapper;
    @Autowired
    ServerChildStatusInfoMapper serverChildStatusInfoMapper;
    @Autowired
    PiChildrenBaseInfoMapper piChildrenBaseInfoMapper;

    @Override
    public ReturnEntity queryTakeCaseList(ServerTakeCaseInfoVO serverTakeCaseInfoVO, PagenationQueryParameter pagenationQueryParameter) {
        setPageHelper(pagenationQueryParameter);
        List<ServerTakeCaseInfoVO> serverTakeCaseInfoList = serverTakeCaseInfoMapper.queryTakeCaseList(serverTakeCaseInfoVO);
        return ReturnEntity.ok(new PageInfo<ServerTakeCaseInfoVO>(serverTakeCaseInfoList));
    }

    @Override
    public ReturnEntity queryTakeCaseInfo(ServerTakeCaseInfoVO serverTakeCaseInfoVO) {
        if(serverTakeCaseInfoVO == null || StringUtils.isEmpty(serverTakeCaseInfoVO.getCaseId())){
            return ReturnEntity.errorMsg("???????????????");
        }
        ServerTakeCaseInfoVO takeCaseInfoVO = serverTakeCaseInfoMapper.queryTakeCaseInfo(serverTakeCaseInfoVO);
        Example example = new Example(ServerTakeCaseFamilyMember.class);
        example.createCriteria().andEqualTo("caseId", serverTakeCaseInfoVO.getCaseId());
        List<ServerTakeCaseFamilyMember> familyMemberList = serverTakeCaseFamilyMemberMapper.selectByExample(example);
        takeCaseInfoVO.setServerTakeCaseFamilyMemberList(familyMemberList);
        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(takeCaseInfoVO.getStaId());
        takeCaseInfoVO.setCaseStatus(serverChildStatusInfo.getCaseStatus());
        takeCaseInfoVO.setEstimateStatus(serverChildStatusInfo.getEstimateStatus());
        takeCaseInfoVO.setPlanStatus(serverChildStatusInfo.getPlanStatus());
        takeCaseInfoVO.setInterventionStatus(serverChildStatusInfo.getInterventionStatus());
        takeCaseInfoVO.setEvaluateStatus(serverChildStatusInfo.getEvaluateStatus());
        takeCaseInfoVO.setCaseClosedStatus(serverChildStatusInfo.getCaseClosedStatus());
        return ReturnEntity.ok(takeCaseInfoVO);
    }

    @Override
    public ReturnEntity saveTakeCaseInfo(ServerTakeCaseInfoVO serverTakeCaseInfoVO, SecUser secUser) {
        logger.info("============???????????????????????????" + serverTakeCaseInfoVO);
        if(StringUtils.isNotEmpty(serverTakeCaseInfoVO.getCaseId())){
            if(StringUtils.isEmpty(serverTakeCaseInfoVO.getChildId())){
                return ReturnEntity.errorMsg("???????????????");
            }
            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.queryOneStatusByChildId(serverTakeCaseInfoVO.getChildId());
            if(serverChildStatusInfo == null){
                return ReturnEntity.errorMsg("????????????????????????");
            }
            serverTakeCaseInfoVO.setStaId(serverChildStatusInfo.getStaId());
            serverTakeCaseInfoVO.setUpdateTime(new Date());
            serverTakeCaseInfoVO.setUpdator(secUser.getUserId());
            serverTakeCaseInfoVO.setArea(secUser.getArea());
            serverTakeCaseInfoMapper.updateByPrimaryKeySelective(serverTakeCaseInfoVO);
            Example example = new Example(ServerTakeCaseFamilyMember.class);
            example.createCriteria().andEqualTo("caseId", serverTakeCaseInfoVO.getCaseId());
            serverTakeCaseFamilyMemberMapper.deleteByExample(example);
            if(serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList() != null && serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList().size() > 0){
                for(ServerTakeCaseFamilyMember serverTakeCaseFamilyMember : serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList()){
                    serverTakeCaseFamilyMember.setChildId(serverTakeCaseInfoVO.getChildId());
                    serverTakeCaseFamilyMember.setCaseId(serverTakeCaseInfoVO.getCaseId());
                    serverTakeCaseFamilyMember.setCreator(secUser.getUserId());
                    serverTakeCaseFamilyMember.setCreateTime(new Date());
                    serverTakeCaseFamilyMember.setMemId(UUIDKit.getUUID());
                    serverTakeCaseFamilyMemberMapper.insert(serverTakeCaseFamilyMember);
                }
            }
        }else {
            //???????????????????????????
            String staId = UUIDKit.getUUID();
            ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
            statusInfo.setStaId(staId);
            statusInfo.setChildId(serverTakeCaseInfoVO.getChildId());
            statusInfo.setChildName(serverTakeCaseInfoVO.getChildName());
            statusInfo.setCaseStatus(CommonConstants.ServerApprovalStatus.CASE_SAVE);
            statusInfo.setCreator(secUser.getUserId());
            statusInfo.setCreateTime(new Date());
            statusInfo.setArea(secUser.getArea());
            serverChildStatusInfoMapper.insert(statusInfo);
            //??????????????????
            serverTakeCaseInfoVO.setStatus(CommonConstants.ServerApprovalStatus.CASE_SAVE);
            serverTakeCaseInfoVO.setReceiver(secUser.getUserName());
            serverTakeCaseInfoVO.setCaseId(UUIDKit.getUUID());
            serverTakeCaseInfoVO.setCreator(secUser.getUserId());
            serverTakeCaseInfoVO.setCreateTime(new Date());
            serverTakeCaseInfoVO.setStaId(staId);
            serverTakeCaseInfoVO.setCaseNo(getNumber());
            serverTakeCaseInfoVO.setArea(secUser.getArea());
            serverTakeCaseInfoMapper.insert(serverTakeCaseInfoVO);
            //??????????????????
            if(serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList() != null && serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList().size() > 0){
                for(ServerTakeCaseFamilyMember serverTakeCaseFamilyMember : serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList()){
                    serverTakeCaseFamilyMember.setChildId(serverTakeCaseInfoVO.getChildId());
                    serverTakeCaseFamilyMember.setCaseId(serverTakeCaseInfoVO.getCaseId());
                    serverTakeCaseFamilyMember.setCreator(secUser.getUserId());
                    serverTakeCaseFamilyMember.setCreateTime(new Date());
                    serverTakeCaseFamilyMember.setMemId(UUIDKit.getUUID());
                    serverTakeCaseFamilyMemberMapper.insert(serverTakeCaseFamilyMember);
                }
            }
        }
        return ReturnEntity.ok(serverTakeCaseInfoVO);
    }

    @Override
    public ReturnEntity deleteTakeCaseInfo(ServerTakeCaseInfoVO serverTakeCaseInfoVO) {
        if(StringUtils.isEmpty(serverTakeCaseInfoVO.getCaseId())){
            return ReturnEntity.errorMsg("???????????????");
        }
        ServerTakeCaseInfo serverTakeCaseInfo = serverTakeCaseInfoMapper.selectByPrimaryKey(serverTakeCaseInfoVO.getCaseId());
        if(CommonConstants.ServerApprovalStatus.CASE_SUBMITED.equals(serverTakeCaseInfo.getStatus())){
            return ReturnEntity.errorMsg("?????????????????????????????????");
        }
        Example example = new Example(ServerTakeCaseFamilyMember.class);
        example.createCriteria().andEqualTo("caseId", serverTakeCaseInfoVO.getCaseId());
        serverTakeCaseFamilyMemberMapper.deleteByExample(example);
        serverTakeCaseInfoMapper.deleteByPrimaryKey(serverTakeCaseInfoVO.getCaseId());
        serverChildStatusInfoMapper.deleteByPrimaryKey(serverTakeCaseInfo.getStaId());
        return ReturnEntity.ok(serverTakeCaseInfoVO);
    }

    @Override
    public ReturnEntity submitTakeCaseInfo(ServerTakeCaseInfoVO serverTakeCaseInfoVO, SecUser secUser) {
        if(StringUtils.isEmpty(serverTakeCaseInfoVO.getCaseId())){
            return ReturnEntity.errorMsg("???????????????");
        }
        ServerTakeCaseInfo serverTakeCaseInfo = serverTakeCaseInfoMapper.selectByPrimaryKey(serverTakeCaseInfoVO.getCaseId());
        if(serverTakeCaseInfo == null){
            return ReturnEntity.errorMsg("??????????????????");
        }
        if(StringUtils.isEmpty(serverTakeCaseInfo.getChildName())){
            return ReturnEntity.errorMsg("??????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(serverTakeCaseInfo.getChildMale())){
            return ReturnEntity.errorMsg("???????????????????????????");
        }
        if(StringUtils.isEmpty(serverTakeCaseInfo.getChildAge())){
            return ReturnEntity.errorMsg("??????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(serverTakeCaseInfo.getCaseSource())){
            return ReturnEntity.errorMsg("??????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(serverTakeCaseInfo.getProblemsAndNeedsFaced())){
            return ReturnEntity.errorMsg("????????????????????????????????????????????????????????????");
        }

        serverTakeCaseInfoVO.setStatus(CommonConstants.ServerApprovalStatus.CASE_SUBMITED);
        serverTakeCaseInfoVO.setUpdateTime(new Date());
        serverTakeCaseInfoVO.setUpdator(secUser.getUserId());
        serverTakeCaseInfoVO.setArea(secUser.getArea());
        serverTakeCaseInfoMapper.updateByPrimaryKeySelective(serverTakeCaseInfoVO);

//        Example example = new Example(ServerTakeCaseFamilyMember.class);
//        example.createCriteria().andEqualTo("caseId", serverTakeCaseInfoVO.getCaseId());
//        serverTakeCaseFamilyMemberMapper.deleteByExample(example);
//        if(serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList() != null && serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList().size() > 0){
//            for(ServerTakeCaseFamilyMember serverTakeCaseFamilyMember : serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList()){
//                serverTakeCaseFamilyMember.setCreator(secUser.getUserId());
//                serverTakeCaseFamilyMember.setCreateTime(new Date());
//                serverTakeCaseFamilyMember.setMemId(UUIDKit.getUUID());
//                serverTakeCaseFamilyMemberMapper.insert(serverTakeCaseFamilyMember);
//            }
//        }

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverTakeCaseInfo.getStaId());
        statusInfo.setCaseStatus(CommonConstants.ServerApprovalStatus.CASE_SUBMITED);
        statusInfo.setUpdator(secUser.getUserId());
        statusInfo.setCreateTime(new Date());
        statusInfo.setArea(secUser.getArea());
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(statusInfo);

        return ReturnEntity.ok(serverTakeCaseInfoVO);
    }

    @Override
    public ReturnEntity queryChildApprovedList(PiChildrenBaseInfo piChildrenBaseInfo, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        //??????????????????
        piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.APPROVED);
        List<PiChildrenBaseInfoVO> childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
        //????????????
        return ReturnEntity.ok(new PageInfo<PiChildrenBaseInfoVO>(childrenBaseInfoList));
    }

    public String getNumber() {
        Date date = new Date();
        String prefix = new SimpleDateFormat("yyyy").format(date) + new SimpleDateFormat("MM").format(date);
        logger.info("=========?????????" + prefix);
        return prefix + serverTakeCaseInfoMapper.getLetterNumber(prefix);
    }

    @Override
    public ReturnEntity getLetterNumber() {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        returnEntity.setData(getNumber());
        return returnEntity;
    }

    @Autowired
    ServerEvaluateInfoMapper serverEvaluateInfoMapper;
    @Autowired
    ServerPlanInfoMapper serverPlanInfoMapper;
    @Autowired
    ServerEstimateInfoMapper serverEstimateInfoMapper;
    @Autowired
    ServerInterviewInterventionInfoMapper serverInterviewInterventionInfoMapper;
    @Autowired
    ServerAvailableResourcesInfoMapper serverAvailableResourcesInfoMapper;
    @Autowired
    ServerCaseClosedInfoMapper serverCaseClosedInfoMapper;

    @Override
    public ReturnEntity getLetterNumber(String type) {
        if(StringUtils.isEmpty(type)){
            return ReturnEntity.errorMsg("???????????????");
        }
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        Date date = new Date();
        String prefix = new SimpleDateFormat("yyyy").format(date) + new SimpleDateFormat("MM").format(date);
        logger.info("=========?????????" + prefix);
        if("0".equals(type)){
            returnEntity.setData(prefix + serverTakeCaseInfoMapper.getLetterNumber(prefix));
        }else if("1".equals(type)){
            returnEntity.setData(prefix + serverEstimateInfoMapper.getLetterNumber(prefix));
        }else if("2".equals(type)){
            returnEntity.setData(prefix + serverPlanInfoMapper.getLetterNumber(prefix));
        }else if("3".equals(type)){
            returnEntity.setData(prefix + serverInterviewInterventionInfoMapper.getLetterNumber(prefix));
        }else if("4".equals(type)){
            returnEntity.setData(prefix + serverAvailableResourcesInfoMapper.getLetterNumber(prefix));
        }else if("5".equals(type)){
            returnEntity.setData(prefix + serverEvaluateInfoMapper.getLetterNumber(prefix));
        }else if("6".equals(type)){
            returnEntity.setData(prefix + serverCaseClosedInfoMapper.getLetterNumber(prefix));
        }
        return returnEntity;
    }
}
