package cn.com.personnel.ercp.common.constants;

/**
 * 接口返回状态静态常量
 */
public class CommonConstants {

    public static final String SUCCESS_CODE = "2000";
    public static final String SUCCESS_MESSAGE = "成功";
    public static final String ERROR_CODE = "4000";
    public static final String ERROR_MESSAGE = "失败";
    public static final int ERROR_SERVERCODE = 9001;
    public static final String ERROR_SERVERMESSAGE = "服务内部错误";
    public static final String SFS = "sfs_xd";
    public static final String CNY = "CNY";
    public static final String EXPIRE_REMAINDER = "sfs_xd.credit_pay_expire_reminder,sfs_xd.bond_expire_reminder,sfs_xd.bill_expire_reminder," +
            "sfs_xd.loan_pay_interest_reminder,sfs_xd.loan_repayment_reminder,sfs_xd.inner_loan_pay_interest_reminder," +
            "sfs_xd.inner_loan_repayment_reminder,sfs_xd.guarantee_expire_reminder,sfs_xd.bill_receivable_expire_reminder";

    //分录凭证类型 业务模块属于保理，内部借款，外部借款，债券计提都取YX凭证类型；应付票据模块业务类型为票据开承时，取凭证类型ZP；应付票据模块其余类型和应收票据模块使用YP类型
    public static final String YX = "YX";
    public static final String ZP = "ZP";
    public static final String YP = "YP";

    //会计分录 入账状态
    public static final String NotEntry = "未入账";
    public static final String Entrying = "入账中";
    public static final String PartEntry = "部分入账";
    public static final String Entryed = "已入账";

    //会计分录 冲销状态
    public static final String NotReversal = "未冲销";
    public static final String Reversaling = "冲销中";
    public static final String PartReversal = "部分冲销";
    public static final String Reversaled = "已冲销";

    //查看权限
    public static final String CK = "CK";

    /**
     * 流程审批状态
     */
    public static class ApprovalStatus {
        public static final String DRAFT = "进行中";
        public static final String COMPLETED = "已完成";
        public static final String APPROVING = "已发送审批";
        public static final String APPROVED = "审批通过";
        public static final String NOTPASS = "审批不通过";
    }

    /**
     * 流程审批状态
     */
    public static class ServerApprovalStatus {
        public static final String CASE_SAVE = "接案保存";
        public static final String CASE_SUBMITED = "接案已提交";
        public static final String ESTIMATE_SAVE = "预估保存";
        public static final String ESTIMATE_SUBMITED = "预估已提交";
        public static final String PLAN_SAVE = "计划保存";
        public static final String PLANING = "计划中";
        public static final String PLANPARTSUBMIT = "计划部分提交";
        public static final String PLANSUBMITED = "计划已提交";
        public static final String INTERVENTIONING = "介入中";
        public static final String INTERVENTIONING_SAVE = "介入保存";
        public static final String INTERVENTIONPARTSUBMIT = "介入部分提交";
        public static final String INTERVENTIONSUBMITED = "介入已提交";
        public static final String EVALUATE_SAVE = "评价保存";
        public static final String EVALUATE_SUBMIT = "评价已提交";
        public static final String CLOSE_CASE_SAVE = "结案保存";
        public static final String CLOSE_CASE_SUBMIT = "结案已提交";
    }

    // 通过delete字段进行控制 1:显示 0:不显示 2：变更中
    public static final String DELETED="0";
    public static final String UN_DELETED="1";
    public static final String CHANGING="2";

    //初始版本号
    public static final Integer INITIAL_VERSION = 1;

    //业务单元
    public static final String UNIT_1000 = "1000";
    public static final String UNIT_2000 = "2000";
    public static final String UNIT_5000 = "5000";
    public static final String UNIT_6000 = "6000";
    public static final String UNIT_8000 = "8000";

    //成功标识
    public static final String S = "S";
    //执行中标识
    public static final String P = "P";
    //失败标识
    public static final String E = "E";
}
