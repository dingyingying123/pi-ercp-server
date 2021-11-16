package cn.com.personnel.ercp.common.enums;

public enum ProcessStatusEnum {
    
    unstart(1,"未启动","起草"),
    runtime(2,"运行","审批中"),
    hang_up(3,"挂起","挂起"),
    done(7,"完成","审批通过"),
    termination(8,"终止","撤回"),
        ;

    /**
     * 编号
     */
    private Integer code;
    /**
     * 流程状态
     */
    private String status;

    /**
    *  项目状态
    */
    private  String pStatus;

    ProcessStatusEnum(Integer code, String status,String pStatus){
        this.code=code;
        this.status=status;
        this.pStatus=pStatus;
    }

    public static String getValue(Integer value) {
        ProcessStatusEnum[] processStatusEnums = values();
        for (ProcessStatusEnum processStatusEnum : processStatusEnums) {
            if (processStatusEnum.getCode().equals(value)) {
                return processStatusEnum.getStatus();
            }
        }
        return null;
    }
    public static String getPstatus(Integer value) {
        ProcessStatusEnum[] processStatusEnums = values();
        for (ProcessStatusEnum processStatusEnum : processStatusEnums) {
            if (processStatusEnum.getCode().equals(value)) {
                return processStatusEnum.getpStatus();
            }
        }
        return null;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getpStatus() {
        return pStatus;
    }

    public void setpStatus(String pStatus) {
        this.pStatus = pStatus;
    }
}
