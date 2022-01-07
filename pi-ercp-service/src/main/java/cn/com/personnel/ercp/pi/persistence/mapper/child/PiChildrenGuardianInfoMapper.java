package cn.com.personnel.ercp.pi.persistence.mapper.child;

import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenGuardianInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;

public interface PiChildrenGuardianInfoMapper extends BaseMapper<PiChildrenGuardianInfo> {
    List<FileInfo> queryGuardianFileList(PiChildrenBaseInfo piChildrenBaseInfo);
}