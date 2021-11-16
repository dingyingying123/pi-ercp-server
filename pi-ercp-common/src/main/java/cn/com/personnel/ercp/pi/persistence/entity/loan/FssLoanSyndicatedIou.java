package cn.com.personnel.ercp.pi.persistence.entity.loan;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "fss_loan_syndicated_iou")
public class FssLoanSyndicatedIou {
    /**
     * 银团借据主键id
     */
    @Id
    @Column(name = "syndicated_iou_id")
    @GeneratedValue(generator = "JDBC")
    private String syndicatedIouId;

    /**
     * 提款金额
     */
    @Column(name = "withdraw_amount")
    private BigDecimal withdrawAmount;

    /**
     * 合同主键id
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 借据id
     */
    @Column(name = "iou_id")
    private String iouId;

    /**
     * 借款银行
     */
    @Column(name = "loan_bank")
    private String loanBank;

    /**
     * 获取银团借据主键id
     *
     * @return syndicated_iou_id - 银团借据主键id
     */
    public String getSyndicatedIouId() {
        return syndicatedIouId;
    }

    /**
     * 设置银团借据主键id
     *
     * @param syndicatedIouId 银团借据主键id
     */
    public void setSyndicatedIouId(String syndicatedIouId) {
        this.syndicatedIouId = syndicatedIouId;
    }

    /**
     * 获取提款金额
     *
     * @return withdraw_amount - 提款金额
     */
    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    /**
     * 设置提款金额
     *
     * @param withdrawAmount 提款金额
     */
    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    /**
     * 获取合同主键id
     *
     * @return manage_id - 合同主键id
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置合同主键id
     *
     * @param manageId 合同主键id
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    /**
     * 获取借据id
     *
     * @return iou_id - 借据id
     */
    public String getIouId() {
        return iouId;
    }

    /**
     * 设置借据id
     *
     * @param iouId 借据id
     */
    public void setIouId(String iouId) {
        this.iouId = iouId;
    }

    /**
     * 获取借款银行
     *
     * @return loan_bank - 借款银行
     */
    public String getLoanBank() {
        return loanBank;
    }

    /**
     * 设置借款银行
     *
     * @param loanBank 借款银行
     */
    public void setLoanBank(String loanBank) {
        this.loanBank = loanBank;
    }
}