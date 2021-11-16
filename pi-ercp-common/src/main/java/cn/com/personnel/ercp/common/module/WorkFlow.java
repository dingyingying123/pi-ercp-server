package cn.com.personnel.ercp.common.module;


import java.util.Map;

public class WorkFlow {
    private String processDefID;
    private String processDefName;
    private String processInstName;
    private String processInstID;
    private String activityInstID;
    private String workItemID;
    private String flag;
    private Integer autoFlag;
    private String approvalMsg;
    private String destActDefID;
    private String activityDefID;
    private String allBackFlag;
    private String opinion;
    private String fileids;
    private String filenames;
    private String resubmitToMe;
    private String assigns;
    private String returnToMe;
    private String code;
    private String name;
    private Map<String, Object> relateData;

    public WorkFlow() {
    }

    public String toString() {
        return "WorkFlow{processDefID='" + this.processDefID + '\'' + ", processDefName='" + this.processDefName + '\'' + ", processInstName='" + this.processInstName + '\'' + ", processInstID='" + this.processInstID + '\'' + ", activityInstID='" + this.activityInstID + '\'' + ", workItemID='" + this.workItemID + '\'' + ", flag='" + this.flag + '\'' + ", autoFlag=" + this.autoFlag + ", approvalMsg='" + this.approvalMsg + '\'' + ", destActDefID='" + this.destActDefID + '\'' + ", activityDefID='" + this.activityDefID + '\'' + ", allBackFlag='" + this.allBackFlag + '\'' + ", opinion='" + this.opinion + '\'' + ", fileids='" + this.fileids + '\'' + ", filenames='" + this.filenames + '\'' + ", resubmitToMe='" + this.resubmitToMe + '\'' + ", assigns='" + this.assigns + '\'' + ", returnToMe='" + this.returnToMe + '\'' + ", relateData=" + this.relateData + '}';
    }

    public String getProcessDefName() {
        return this.processDefName;
    }

    public void setProcessDefName(String processDefName) {
        this.processDefName = processDefName;
    }

    public String getProcessDefID() {
        return this.processDefID;
    }

    public void setProcessDefID(String processDefID) {
        this.processDefID = processDefID;
    }

    public String getProcessInstName() {
        return this.processInstName;
    }

    public void setProcessInstName(String processInstName) {
        this.processInstName = processInstName;
    }

    public String getProcessInstID() {
        return this.processInstID;
    }

    public void setProcessInstID(String processInstID) {
        this.processInstID = processInstID;
    }

    public String getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(String workItemID) {
        this.workItemID = workItemID;
    }

    public Map<String, Object> getRelateData() {
        return this.relateData;
    }

    public void setRelateData(Map<String, Object> relateData) {
        this.relateData = relateData;
    }

    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getAutoFlag() {
        return this.autoFlag;
    }

    public void setAutoFlag(Integer autoFlag) {
        this.autoFlag = autoFlag;
    }

    public String getApprovalMsg() {
        return this.approvalMsg;
    }

    public void setApprovalMsg(String approvalMsg) {
        this.approvalMsg = approvalMsg;
    }

    public String getActivityInstID() {
        return this.activityInstID;
    }

    public void setActivityInstID(String activityInstID) {
        this.activityInstID = activityInstID;
    }

    public String getDestActDefID() {
        return this.destActDefID;
    }

    public void setDestActDefID(String destActDefID) {
        this.destActDefID = destActDefID;
    }

    public String getAllBackFlag() {
        return this.allBackFlag;
    }

    public void setAllBackFlag(String allBackFlag) {
        this.allBackFlag = allBackFlag;
    }

    public String getOpinion() {
        return this.opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getFileids() {
        return this.fileids;
    }

    public void setFileids(String fileids) {
        this.fileids = fileids;
    }

    public String getFilenames() {
        return this.filenames;
    }

    public void setFilenames(String filenames) {
        this.filenames = filenames;
    }

    public String getActivityDefID() {
        return this.activityDefID;
    }

    public void setActivityDefID(String activityDefID) {
        this.activityDefID = activityDefID;
    }

    public String getResubmitToMe() {
        return this.resubmitToMe;
    }

    public void setResubmitToMe(String resubmitToMe) {
        this.resubmitToMe = resubmitToMe;
    }

    public String getAssigns() {
        return this.assigns;
    }

    public void setAssigns(String assigns) {
        this.assigns = assigns;
    }

    public String getReturnToMe() {
        return this.returnToMe;
    }

    public void setReturnToMe(String returnToMe) {
        this.returnToMe = returnToMe;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
