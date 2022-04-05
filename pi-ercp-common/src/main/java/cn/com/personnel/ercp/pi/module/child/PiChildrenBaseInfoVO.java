package cn.com.personnel.ercp.pi.module.child;

import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenGuardianInfo;

import java.util.List;

public class PiChildrenBaseInfoVO extends PiChildrenBaseInfo {
    private List<PiChildrenGuardianInfo> piChildrenGuardianInfoList;
    private String type;
    private String caseStatus;
    private String estimateStatus;
    private String planStatus;
    private String interventionStatus;
    private String evaluateStatus;
    private String caseClosedStatus;

    private PiChildrenGuardianInfo fatherGuardian;
    private PiChildrenGuardianInfo matherGuardian;
    private PiChildrenGuardianInfo otherGuardian;

    private String problemsAndNeedsFaced;
    private String caseDate;
    private String expectedGoal;
    private String expectedExecution;
    private String implementationStatus;

    List<String> ids;

    public List<PiChildrenGuardianInfo> getPiChildrenGuardianInfoList() {
        return piChildrenGuardianInfoList;
    }

    public void setPiChildrenGuardianInfoList(List<PiChildrenGuardianInfo> piChildrenGuardianInfoList) {
        this.piChildrenGuardianInfoList = piChildrenGuardianInfoList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getEstimateStatus() {
        return estimateStatus;
    }

    public void setEstimateStatus(String estimateStatus) {
        this.estimateStatus = estimateStatus;
    }

    public String getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
    }

    public String getInterventionStatus() {
        return interventionStatus;
    }

    public void setInterventionStatus(String interventionStatus) {
        this.interventionStatus = interventionStatus;
    }

    public String getEvaluateStatus() {
        return evaluateStatus;
    }

    public void setEvaluateStatus(String evaluateStatus) {
        this.evaluateStatus = evaluateStatus;
    }

    public String getCaseClosedStatus() {
        return caseClosedStatus;
    }

    public void setCaseClosedStatus(String caseClosedStatus) {
        this.caseClosedStatus = caseClosedStatus;
    }

    public PiChildrenGuardianInfo getFatherGuardian() {
        return fatherGuardian;
    }

    public void setFatherGuardian(PiChildrenGuardianInfo fatherGuardian) {
        this.fatherGuardian = fatherGuardian;
    }

    public PiChildrenGuardianInfo getMatherGuardian() {
        return matherGuardian;
    }

    public void setMatherGuardian(PiChildrenGuardianInfo matherGuardian) {
        this.matherGuardian = matherGuardian;
    }

    public PiChildrenGuardianInfo getOtherGuardian() {
        return otherGuardian;
    }

    public void setOtherGuardian(PiChildrenGuardianInfo otherGuardian) {
        this.otherGuardian = otherGuardian;
    }

    public String getProblemsAndNeedsFaced() {
        return problemsAndNeedsFaced;
    }

    public void setProblemsAndNeedsFaced(String problemsAndNeedsFaced) {
        this.problemsAndNeedsFaced = problemsAndNeedsFaced;
    }

    public String getCaseDate() {
        return caseDate;
    }

    public void setCaseDate(String caseDate) {
        this.caseDate = caseDate;
    }

    public String getExpectedGoal() {
        return expectedGoal;
    }

    public void setExpectedGoal(String expectedGoal) {
        this.expectedGoal = expectedGoal;
    }

    public String getExpectedExecution() {
        return expectedExecution;
    }

    public void setExpectedExecution(String expectedExecution) {
        this.expectedExecution = expectedExecution;
    }

    public String getImplementationStatus() {
        return implementationStatus;
    }

    public void setImplementationStatus(String implementationStatus) {
        this.implementationStatus = implementationStatus;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
