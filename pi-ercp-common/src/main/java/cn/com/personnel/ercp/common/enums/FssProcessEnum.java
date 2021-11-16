package cn.com.personnel.ercp.common.enums;

public enum FssProcessEnum {

    Sfs_Letter_Of_Credit_Apply(1,"sfs_xd.letter_of_credit_apply","信用证申请","/creditDispose"),
    Sfs_Letter_Of_Credit_Notice(2,"sfs_xd.letter_of_credit_manage_notice","信用证申请","/checkInform"),
    Bond_Issue_Apply(4,"sfs_xd.bond_issue_apply","债券发行申请","/applicationBondIssueAdd"),
    Department_Personnel_Hours(4,"sfs_xd.department_personnel_hours","部门人员工时","/staffTimeCheck"),
    Sfs_Guarantee_Notice(4,"sfs_xd.guarantee_notice","通知保函提醒人","/staffTimeCheck"),
    Sfs_Xd_Guarantee_Manage_Notice(4,"sfs_xd.guarantee_manage_notice","保函管理通知","/checkNotification"),
    Maintenance_Not_Revoked_Reason(6,"sfs_xd.not_revoking_reason","未撤销原因","/approvalReasonsMaintenanceNotCancelled"),
    Sfs_Xd_Factoring_Apply(6,"sfs_xd.factoring_apply","保理申请","/approvalFactoring"),
    Sfs_Xd_Factoring_Withdraw_Apply (6,"sfs_xd.factoring_withdraw_apply","保理提款申请","/approvalWithdrawApply"),
    Sfs_Xd_Bank_Credit_Apply (6,"sfs_xd.bank_credit_apply","银行授信申请","/approvalBankCreditApply"),
    Sfs_Xd_Bank_Credit_Change (6,"sfs_xd.bank_credit_change","银行授信变更","/approvalCreditChange"),
    Change_Responsible_Notice(6,"sfs_xd.change_responsible_notice","变更负责人通知","/responsibleChange"),
    Sfs_Guarantee_Info(4,"sfs_xd.guarantee_apply","保函申请","/checkBackApplyFlow"),
    Sfs_Guarantee_Info_change(4,"sfs_xd.guarantee_new_change","新增变更申请","/checkBackApplyFlow"),
    Sfs_Sign_Loan_Contract(11,"sfs_xd.sign_loan_apply","借款签约申请","/approvalLoanContract"),
    Sfs_Sign_Loan_Change_Apply(12,"sfs_xd.sign_loan_change_apply","借款合同变更申请","/checkChangeApprove"),
    Sfs_Loan_Withdraw_Apply(13,"sfs_xd.loan_withdraw_apply","借款提款申请","/checkDrawApprove"),
    Sfs_Loan_Prepayment_Apply(14,"sfs_xd.loan_prepayment","外部借款提前还款","/checkPrepaymentApprove"),
    Sfs_Xd_Internal_Transfer_Order(14,"sfs_xd.internal_transfer_order","内部调拨单","/checkInnerTransfer"),
    Sfs_Xd_Discount_Receivable(15,"sfs_xd.discount_receivable","应收票据贴现","/discountWaitingHandler"),
    Sfs_Xd_Pay_Internal_Transfer_Order(17,"sfs_xd.pay_internal_transfer_order","应收票据内部调拨单","/waitingHandler"),
    Sfs_Inner_Loan_Contract(5,"sfs_xd.inner_loan_apply","内部借款签约申请","/checkApplyLoan"),
    Sfs_inner_Loan_Prepayment(16,"sfs_xd.inner_loan_prepayment","内部借款提前还款","/checkInnerPrepaymentApprove"),
    Sfs_Xd_Bill_Cancel_Internal_Order(19,"sfs_xd.bill_cancel_internal_order","取消应付票据的内部调拨单","/checkCancelInnerTransfer"),
    Credit_Pay_Expire_Reminder(3,"sfs_xd.credit_pay_expire_reminder","信用证付款到期提醒","/approvalCreditPayExpireReminder"),
    Bond_Expire_Reminder(3,"sfs_xd.bond_expire_reminder","债券到期提醒","/approvalBondPeriodReminder"),
    Guarantee_Expire_Reminder(3,"sfs_xd.guarantee_expire_reminder","保函到期提醒","/approvalGuaranteePeriodReminder"),
    Inner_Loan_Pay_Interest_Reminder(3,"sfs_xd.inner_loan_pay_interest_reminder","内部借款付息提醒","/approvalInternalBorrowingInterestPayment"),
    Inner_Loan_Repayment_Reminder(3,"sfs_xd.inner_loan_repayment_reminder","内部借款还款提醒","/approvalInternalLoanRepayment"),
    Loan_Pay_Interest_Reminder(3,"sfs_xd.loan_pay_interest_reminder","外部借款付息提醒","/approvalExternalBorrowingInterestPayment"),
    Loan_Repayment_Reminder(3,"sfs_xd.loan_repayment_reminder","外部借款还款提醒","/approvalExternalLoanRepayment"),
    Bill_Expire_Reminder(3,"sfs_xd.bill_expire_reminder","应付票据到期提醒","/approvalReminderDueLoan"),
    Sfs_Bill_Receivable_Expire_Reminder(18,"sfs_xd.bill_receivable_expire_reminder","应收票据到期提醒","/dueReminder"),
    Sfs_Accounting_notice(20,"sfs_xd.accounting_notice","分录知会","/accountingRegulationInform"),
    Sfs_bill_yincheng(21,"sfs_xd.bill_yincheng","应付银承","/checkBankAcceptanceDraft"),
    Sfs_Inner_Prepayment_Apply(22,"sfs_xd.inner_prepayment_apply","内部借款还款申请","/checkInnerEarlyRepaymentApply"),
    Sfs_Financial_Bill_Apply(23,"sfs_xd.financial_bill_apply","财司票据申请","/checkApproveFinancial");
    /**
     * 编号
     */
    private Integer code;
    /**
     * 流程定义ID
     */
    private String processDefID;
    /**
     * 流程名称
     */
    private String processInstName;

    /**
     * 流程地址
     */
    private String url;

    FssProcessEnum(Integer code,String processDefID,String processInstName,String url){
        this.code=code;
        this.processDefID=processDefID;
        this.processInstName=processInstName;
        this.url = url;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getProcessDefID() {
        return processDefID;
    }

    public void setProcessDefID(String processDefID) {
        this.processDefID = processDefID;
    }

    public String getProcessInstName() {
        return processInstName;
    }

    public void setProcessInstName(String processInstName) {
        this.processInstName = processInstName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
