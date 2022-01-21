package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.server.ServerEstimateInfoVO;
import cn.com.personnel.ercp.pi.module.server.ServerPlanInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerChildStatusInfo;
import cn.com.personnel.ercp.pi.persistence.entity.server.ServerPlanInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerChildStatusInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerEstimateInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerPlanInfoMapper;
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
public class PlanService extends BaseService implements IPlanService {
    @Autowired
    ServerEstimateInfoMapper serverEstimateInfoMapper;
    @Autowired
    ServerChildStatusInfoMapper serverChildStatusInfoMapper;
    @Autowired
    ServerPlanInfoMapper serverPlanInfoMapper;

    @Override
    public ReturnEntity queryPlanList(ServerPlanInfoVO serverPlanInfoVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        List<ServerPlanInfoVO> queryPlanList = serverPlanInfoMapper.queryPlanList(serverPlanInfoVO);
        return ReturnEntity.ok(new PageInfo<>(queryPlanList));
    }

    @Override
    public ReturnEntity queryPlanInfo(ServerPlanInfoVO serverPlanInfoVO) {
        if(serverPlanInfoVO == null || StringUtils.isEmpty(serverPlanInfoVO.getPlanId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerPlanInfoVO planInfoVO = serverPlanInfoMapper.queryPlanInfo(serverPlanInfoVO);

        ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(planInfoVO.getStaId());
        planInfoVO.setCaseStatus(serverChildStatusInfo.getCaseStatus());
        planInfoVO.setEstimateStatus(serverChildStatusInfo.getEstimateStatus());
        planInfoVO.setPlanStatus(serverChildStatusInfo.getPlanStatus());
        planInfoVO.setInterventionStatus(serverChildStatusInfo.getInterventionStatus());
        planInfoVO.setEvaluateStatus(serverChildStatusInfo.getEvaluateStatus());
        planInfoVO.setCaseClosedStatus(serverChildStatusInfo.getCaseClosedStatus());
        return ReturnEntity.ok(planInfoVO);
    }

    @Override
    public ReturnEntity querySubmitEstimateList(ServerEstimateInfoVO serverEstimateInfoVO, PagenationQueryParameter buildPagenation) {
        setPageHelper(buildPagenation);
        serverEstimateInfoVO.setEstimateStatus(CommonConstants.ServerApprovalStatus.ESTIMATE_SUBMITED);
        List<ServerEstimateInfoVO> serverEstimateInfoVOList = serverEstimateInfoMapper.queryEstimateList(serverEstimateInfoVO);
        return ReturnEntity.ok(new PageInfo<>(serverEstimateInfoVOList));
    }

    @Override
    public ReturnEntity savePlanInfo(ServerPlanInfoVO serverPlanInfoVO, SecUser secUser) {
        logger.info("=============保存计划参数：" + serverPlanInfoVO);
        if(StringUtils.isEmpty(serverPlanInfoVO.getPlanId())){
            if(StringUtils.isEmpty(serverPlanInfoVO.getChildId())){
                return ReturnEntity.errorMsg("参数错误！");
            }
            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.queryOneStatusByChildId(serverPlanInfoVO.getChildId());
            if(serverChildStatusInfo == null){
                return ReturnEntity.errorMsg("儿童信息不存在！");
            }
            serverPlanInfoVO.setStaId(serverChildStatusInfo.getStaId());
            String planId = UUIDKit.getUUID();
            serverPlanInfoVO.setPlanId(planId);
            serverPlanInfoVO.setReceiver(secUser.getUserName());
            serverPlanInfoVO.setStatus(CommonConstants.ServerApprovalStatus.PLAN_SAVE);
            serverPlanInfoVO.setCreator(secUser.getUserId());
            serverPlanInfoVO.setCreateTime(new Date());
            serverPlanInfoVO.setArea(secUser.getArea());
            serverPlanInfoMapper.insert(serverPlanInfoVO);

//            ServerChildStatusInfo serverChildStatusInfo = serverChildStatusInfoMapper.selectByPrimaryKey(serverPlanInfoVO.getStaId());
            serverChildStatusInfo.setPlanStatus(CommonConstants.ServerApprovalStatus.PLANING);
            serverChildStatusInfo.setUpdator(secUser.getUserId());
            serverChildStatusInfo.setUpdateTime(new Date());
            serverChildStatusInfo.setArea(secUser.getArea());
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }else{
            serverPlanInfoVO.setUpdator(secUser.getUserId());
            serverPlanInfoVO.setUpdateTime(new Date());
            serverPlanInfoVO.setArea(secUser.getArea());
            serverPlanInfoMapper.updateByPrimaryKeySelective(serverPlanInfoVO);
        }
        return ReturnEntity.ok(serverPlanInfoVO);
    }

    @Override
    public ReturnEntity deletePlanInfo(ServerPlanInfoVO serverPlanInfoVO) {
        if(StringUtils.isEmpty(serverPlanInfoVO.getPlanId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        ServerPlanInfo serverPlanInfo = serverPlanInfoMapper.selectByPrimaryKey(serverPlanInfoVO.getPlanId());
        if(CommonConstants.ServerApprovalStatus.PLANSUBMITED.equals(serverPlanInfo.getStatus())){
            return ReturnEntity.errorMsg("计划已提交，不能删除！");
        }

        serverPlanInfoMapper.deleteByPrimaryKey(serverPlanInfoVO.getPlanId());
        Example example = new Example(ServerPlanInfo.class);
        example.createCriteria().andEqualTo("staId", serverPlanInfo.getStaId());
        List<ServerPlanInfo> serverPlanInfoList = serverPlanInfoMapper.selectByExample(example);
        if(serverPlanInfoList.size() == 0) {
            ServerChildStatusInfo serverChildStatusInfo = new ServerChildStatusInfo();
            serverChildStatusInfo.setStaId(serverPlanInfo.getStaId());
            serverChildStatusInfo.setPlanStatus("");
            serverChildStatusInfoMapper.updateByPrimaryKeySelective(serverChildStatusInfo);
        }
        return ReturnEntity.ok(serverPlanInfoVO);
    }

    @Override
    public ReturnEntity submitPlanInfo(ServerPlanInfoVO serverPlanInfoVO, SecUser secUser) {
        if(StringUtils.isEmpty(serverPlanInfoVO.getPlanId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        serverPlanInfoVO.setStatus(CommonConstants.ServerApprovalStatus.PLANPARTSUBMIT);
        serverPlanInfoVO.setUpdateTime(new Date());
        serverPlanInfoVO.setUpdator(secUser.getUserId());
        serverPlanInfoVO.setArea(secUser.getArea());
        serverPlanInfoMapper.updateByPrimaryKeySelective(serverPlanInfoVO);

        ServerChildStatusInfo statusInfo = new ServerChildStatusInfo();
        statusInfo.setStaId(serverPlanInfoVO.getStaId());
        if("是".equals(serverPlanInfoVO.getAllSubmit())){
            statusInfo.setPlanStatus(CommonConstants.ServerApprovalStatus.PLANSUBMITED);
        }else {
            statusInfo.setPlanStatus(CommonConstants.ServerApprovalStatus.PLANPARTSUBMIT);
        }
        statusInfo.setUpdator(secUser.getUserId());
        statusInfo.setUpdateTime(new Date());
        statusInfo.setArea(secUser.getArea());
        serverChildStatusInfoMapper.updateByPrimaryKeySelective(statusInfo);

        return ReturnEntity.ok(serverPlanInfoVO);
    }
}
