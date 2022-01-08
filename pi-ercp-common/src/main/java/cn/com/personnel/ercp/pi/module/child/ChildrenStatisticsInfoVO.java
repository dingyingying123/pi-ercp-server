package cn.com.personnel.ercp.pi.module.child;

import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenGuardianInfo;

import java.util.List;

public class ChildrenStatisticsInfoVO extends PiChildrenBaseInfo {
    private String childAccountProvince;
    private String childAccountTown;
    private String childAccountCity;
    private String childAccountCounty;
    private String childAccountAddress;
    private String caseCount;
    private String stayCount;
    private String dilemmaCount;
    private String dibaoCount;
    private String disableCount;
    private String unsupportedCount;
    private String orphanCount;

    @Override
    public String getChildAccountProvince() {
        return childAccountProvince;
    }

    @Override
    public void setChildAccountProvince(String childAccountProvince) {
        this.childAccountProvince = childAccountProvince;
    }

    @Override
    public String getChildAccountTown() {
        return childAccountTown;
    }

    @Override
    public void setChildAccountTown(String childAccountTown) {
        this.childAccountTown = childAccountTown;
    }

    @Override
    public String getChildAccountCity() {
        return childAccountCity;
    }

    @Override
    public void setChildAccountCity(String childAccountCity) {
        this.childAccountCity = childAccountCity;
    }

    @Override
    public String getChildAccountCounty() {
        return childAccountCounty;
    }

    @Override
    public void setChildAccountCounty(String childAccountCounty) {
        this.childAccountCounty = childAccountCounty;
    }

    @Override
    public String getChildAccountAddress() {
        return childAccountAddress;
    }

    @Override
    public void setChildAccountAddress(String childAccountAddress) {
        this.childAccountAddress = childAccountAddress;
    }

    public String getCaseCount() {
        return caseCount;
    }

    public void setCaseCount(String caseCount) {
        this.caseCount = caseCount;
    }

    public String getStayCount() {
        return stayCount;
    }

    public void setStayCount(String stayCount) {
        this.stayCount = stayCount;
    }

    public String getDilemmaCount() {
        return dilemmaCount;
    }

    public void setDilemmaCount(String dilemmaCount) {
        this.dilemmaCount = dilemmaCount;
    }

    public String getDibaoCount() {
        return dibaoCount;
    }

    public void setDibaoCount(String dibaoCount) {
        this.dibaoCount = dibaoCount;
    }

    public String getDisableCount() {
        return disableCount;
    }

    public void setDisableCount(String disableCount) {
        this.disableCount = disableCount;
    }

    public String getUnsupportedCount() {
        return unsupportedCount;
    }

    public void setUnsupportedCount(String unsupportedCount) {
        this.unsupportedCount = unsupportedCount;
    }

    public String getOrphanCount() {
        return orphanCount;
    }

    public void setOrphanCount(String orphanCount) {
        this.orphanCount = orphanCount;
    }
}
