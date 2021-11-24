package cn.com.personnel.ercp.pi.persistence.mapper.child;

import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PiChildrenBaseInfoMapper extends BaseMapper<PiChildrenBaseInfo> {
    List<PiChildrenBaseInfo> queryPiChildrenBaseInfoList(@Param("info") PiChildrenBaseInfo piChildrenBaseInfo);
}