package cn.com.personnel.ercp.pi.persistence.mapper.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.pi.module.child.ChildrenStatisticsInfoVO;
import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PiChildrenBaseInfoMapper extends BaseMapper<PiChildrenBaseInfo> {
    List<PiChildrenBaseInfo> queryPiChildrenBaseInfoList(@Param("info") PiChildrenBaseInfo piChildrenBaseInfo);

    void submitPiChildrenBaseInfoList(SecUser secUser);

    PiChildrenBaseInfoVO queryPiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo);

    List<ChildrenStatisticsInfoVO> queryChildrenStatisticsList(PiChildrenBaseInfo piChildrenBaseInfo);

    List<PiChildrenBaseInfo> queryTakeCaseList(PiChildrenBaseInfoVO piChildrenBaseInfo);

    List<PiChildrenBaseInfo> queryEstimateList(PiChildrenBaseInfoVO piChildrenBaseInfo);

    List<PiChildrenBaseInfo> queryPlanList(PiChildrenBaseInfoVO piChildrenBaseInfo);

    List<PiChildrenBaseInfo> queryInterventionList(PiChildrenBaseInfoVO piChildrenBaseInfo);

    List<PiChildrenBaseInfo> queryEvaluateList(PiChildrenBaseInfoVO piChildrenBaseInfo);
}