package cn.com.personnel.ercp.pi.module.child;

import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenGuardianInfo;

import java.util.List;

public class PiChildrenBaseInfoVO extends PiChildrenBaseInfo {
    private List<PiChildrenGuardianInfo> piChildrenGuardianInfoList;

    public List<PiChildrenGuardianInfo> getPiChildrenGuardianInfoList() {
        return piChildrenGuardianInfoList;
    }

    public void setPiChildrenGuardianInfoList(List<PiChildrenGuardianInfo> piChildrenGuardianInfoList) {
        this.piChildrenGuardianInfoList = piChildrenGuardianInfoList;
    }
}
