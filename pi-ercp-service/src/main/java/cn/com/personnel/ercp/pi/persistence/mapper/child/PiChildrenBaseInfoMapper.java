package cn.com.personnel.ercp.pi.persistence.mapper.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.pi.module.child.ChildrenExcelVO;
import cn.com.personnel.ercp.pi.module.child.ChildrenFileInfoVO;
import cn.com.personnel.ercp.pi.module.child.ChildrenStatisticsInfoVO;
import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PiChildrenBaseInfoMapper extends BaseMapper<PiChildrenBaseInfo> {
    List<PiChildrenBaseInfoVO> queryPiChildrenBaseInfoList(@Param("info") PiChildrenBaseInfo piChildrenBaseInfo);

    void submitPiChildrenBaseInfoList(SecUser secUser);

    PiChildrenBaseInfoVO queryPiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo);

    List<ChildrenStatisticsInfoVO> queryChildrenStatisticsList(PiChildrenBaseInfo piChildrenBaseInfo);

    List<PiChildrenBaseInfoVO> queryTakeCaseList(PiChildrenBaseInfoVO piChildrenBaseInfo);

    List<PiChildrenBaseInfoVO> queryEstimateList(PiChildrenBaseInfoVO piChildrenBaseInfo);

    List<PiChildrenBaseInfoVO> queryPlanList(PiChildrenBaseInfoVO piChildrenBaseInfo);

    List<PiChildrenBaseInfoVO> queryInterventionList(PiChildrenBaseInfoVO piChildrenBaseInfo);

    List<PiChildrenBaseInfoVO> queryEvaluateList(PiChildrenBaseInfoVO piChildrenBaseInfo);

    List<PiChildrenBaseInfoVO> selectExcelByIds(@Param("info") PiChildrenBaseInfoVO piChildrenBaseInfo, @Param("ids") List<String> ids);

    List<ChildrenFileInfoVO> queryFilesByFlags(@Param("ids") List<String> ids);
}