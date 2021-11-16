package cn.com.personnel.ercp.pi.persistence.entity.loan;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_loan_contract_commitment_fee")
public class FssLoanContractCommitmentFee {
    /**
     * 承诺费id
     */
    @Id
    @Column(name = "fee_id")
    @GeneratedValue(generator = "JDBC")
    private String feeId;

    /**
     * 缴纳时间
     */
    @Column(name = "payment_time")
    private Date paymentTime;

    /**
     * 承诺金额
     */
    @Column(name = "commitment_amount")
    private BigDecimal commitmentAmount;

    /**
     * 备注
     */
    private String remarks;



    /**
     * 合同id
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 获取承诺费id
     *
     * @return fee_id - 承诺费id
     */
    public String getFeeId() {
        return feeId;
    }

    /**
     * 设置承诺费id
     *
     * @param feeId 承诺费id
     */
    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    /**
     * 获取缴纳时间
     *
     * @return payment_time - 缴纳时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置缴纳时间
     *
     * @param paymentTime 缴纳时间
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 获取承诺金额
     *
     * @return commitment_amount - 承诺金额
     */
    public BigDecimal getCommitmentAmount() {
        return commitmentAmount;
    }

    /**
     * 设置承诺金额
     *
     * @param commitmentAmount 承诺金额
     */
    public void setCommitmentAmount(BigDecimal commitmentAmount) {
        this.commitmentAmount = commitmentAmount;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    /**
     * 获取合同id
     *
     * @return manage_id - 合同id
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置合同id
     *
     * @param manageId 合同id
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新人
     *
     * @return updater - 更新人
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设置更新人
     *
     * @param updater 更新人
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}