package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.server.ServerTakeCaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerChildStatusInfo;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerTakeCaseFamilyMember;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerTakeCaseInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiChildrenBaseInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerChildStatusInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerTakeCaseFamilyMemberMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerTakeCaseInfoMapper;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
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
        if(serverTakeCaseInfoVO == null || StringUtils.isNotEmpty(serverTakeCaseInfoVO.getCaseId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerTakeCaseInfoVO takeCaseInfoVO = (ServerTakeCaseInfoVO) serverTakeCaseInfoMapper.selectByPrimaryKey(serverTakeCaseInfoVO.getCaseId());
        Example example = new Example(ServerTakeCaseFamilyMember.class);
        example.createCriteria().andEqualTo("caseId", serverTakeCaseInfoVO.getCaseId());
        List<ServerTakeCaseFamilyMember> familyMemberList = serverTakeCaseFamilyMemberMapper.selectByExample(example);
        takeCaseInfoVO.setServerTakeCaseFamilyMemberList(familyMemberList);
        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(serverTakeCaseInfoVO.getStaId());
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
        if(serverTakeCaseInfoVO == null || StringUtils.isEmpty(serverTakeCaseInfoVO.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        if(StringUtils.isNotEmpty(serverTakeCaseInfoVO.getCaseId()) && StringUtils.isNotEmpty(serverTakeCaseInfoVO.getStaId())){
            serverTakeCaseInfoVO.setUpdateTime(new Date());
            serverTakeCaseInfoVO.setUpdator(secUser.getUserId());
            serverTakeCaseInfoMapper.updateByPrimaryKeySelective(serverTakeCaseInfoVO);
            Example example = new Example(ServerTakeCaseFamilyMember.class);
            example.createCriteria().andEqualTo("caseId", serverTakeCaseInfoVO.getCaseId());
            serverTakeCaseFamilyMemberMapper.deleteByExample(example);
            if(serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList() != null && serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList().size() > 0){
                for(ServerTakeCaseFamilyMember serverTakeCaseFamilyMember : serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList()){
                    serverTakeCaseFamilyMember.setCreator(secUser.getUserId());
                    serverTakeCaseFamilyMember.setCreateTime(new Date());
                    serverTakeCaseFamilyMember.setMemId(UUIDKit.getUUID());
                    serverTakeCaseFamilyMemberMapper.insert(serverTakeCaseFamilyMember);
                }
            }
        }else {
            //添加儿童服务状态表
            ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
            statusInfo.setStaId(UUIDKit.getUUID());
            statusInfo.setChildId(serverTakeCaseInfoVO.getChildId());
            statusInfo.setChildName(serverTakeCaseInfoVO.getChildName());
            statusInfo.setCaseStatus(CommonConstants.ServerApprovalStatus.CASE_SAVE);
            statusInfo.setCreator(secUser.getUserId());
            statusInfo.setCreateTime(new Date());
            serverChildStatusInfoMapper.insert(statusInfo);
            //添加接案信息
            serverTakeCaseInfoVO.setStatus(CommonConstants.ServerApprovalStatus.CASE_SAVE);
            serverTakeCaseInfoVO.setCaseId(UUIDKit.getUUID());
            serverTakeCaseInfoVO.setCreator(secUser.getUserId());
            serverTakeCaseInfoVO.setCreateTime(new Date());
            serverTakeCaseInfoMapper.insert(serverTakeCaseInfoVO);
            //添加家庭成员
            if(serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList() != null && serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList().size() > 0){
                for(ServerTakeCaseFamilyMember serverTakeCaseFamilyMember : serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList()){
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
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerTakeCaseInfo serverTakeCaseInfo = serverTakeCaseInfoMapper.selectByPrimaryKey(serverTakeCaseInfoVO.getCaseId());
        if(CommonConstants.ServerApprovalStatus.CASE_SUBMITED.equals(serverTakeCaseInfo.getStatus())){
            return ReturnEntity.errorMsg("接案已提交，不能删除！");
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
            return ReturnEntity.errorMsg("参数错误！");
        }
        serverTakeCaseInfoVO.setStatus(CommonConstants.ServerApprovalStatus.CASE_SUBMITED);
        serverTakeCaseInfoVO.setUpdateTime(new Date());
        serverTakeCaseInfoVO.setUpdator(secUser.getUserId());
        serverTakeCaseInfoMapper.updateByPrimaryKeySelective(serverTakeCaseInfoVO);

        Example example = new Example(ServerTakeCaseFamilyMember.class);
        example.createCriteria().andEqualTo("caseId", serverTakeCaseInfoVO.getCaseId());
        serverTakeCaseFamilyMemberMapper.deleteByExample(example);
        if(serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList() != null && serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList().size() > 0){
            for(ServerTakeCaseFamilyMember serverTakeCaseFamilyMember : serverTakeCaseInfoVO.getServerTakeCaseFamilyMemberList()){
                serverTakeCaseFamilyMember.setCreator(secUser.getUserId());
                serverTakeCaseFamilyMember.setCreateTime(new Date());
                serverTakeCaseFamilyMember.setMemId(UUIDKit.getUUID());
                serverTakeCaseFamilyMemberMapper.insert(serverTakeCaseFamilyMember);
            }
        }

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverTakeCaseInfoVO.getStaId());
        statusInfo.setCaseStatus(CommonConstants.ServerApprovalStatus.CASE_SUBMITED);
        statusInfo.setUpdator(secUser.getUserId());
        statusInfo.setCreateTime(new Date());
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(statusInfo);

        return ReturnEntity.ok(serverTakeCaseInfoVO);
    }

    @Override
    public ReturnEntity queryChildApprovedList(PiChildrenBaseInfo piChildrenBaseInfo, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        //根据条件查询
        piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.APPROVED);
        List<PiChildrenBaseInfo> childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
        //返回数据
        return ReturnEntity.ok(new PageInfo<PiChildrenBaseInfo>(childrenBaseInfoList));
    }
}
