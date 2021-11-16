package cn.com.personnel.ercp.pi.persistence.mapper.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseApprover;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;

public interface FssBaseApproverMapper extends BaseMapper<FssBaseApprover> {
    List<FssBaseApprover> getApprover(FssBaseApprover fssBaseApprover);
}