package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bond_issue_agency_fee_info")
public class FssBondIssueAgencyFeeInfo {
    /**
     * 主键
     */
    @Id
    @Column(name = "fbiafi_id")
    @GeneratedValue(generator = "JDBC")
    private String fbiafiId;

    /**
     * 中介名称
     */
    @Column(name = "agent_name")
    private String agentName;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 备注
     */
    @Column(name = "agency_fee_remark")
    private String agencyFeeRemark;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "upate_time")
    private Date upateTime;

    private String fbiaId;

    /**
     * 获取主键
     *
     * @return fbiafi_id - 主键
     */
    public String getFbiafiId() {
        return fbiafiId;
    }

    /**
     * 设置主键
     *
     * @param fbiafiId 主键
     */
    public void setFbiafiId(String fbiafiId) {
        this.fbiafiId = fbiafiId;
    }

    /**
     * 获取中介名称
     *
     * @return agent_name - 中介名称
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * 设置中介名称
     *
     * @param agentName 中介名称
     */
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取备注
     *
     * @return agency_fee_remark - 备注
     */
    public String getAgencyFeeRemark() {
        return agencyFeeRemark;
    }

    /**
     * 设置备注
     *
     * @param agencyFeeRemark 备注
     */
    public void setAgencyFeeRemark(String agencyFeeRemark) {
        this.agencyFeeRemark = agencyFeeRemark;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return updator
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * @return upate_time
     */
    public Date getUpateTime() {
        return upateTime;
    }

    /**
     * @param upateTime
     */
    public void setUpateTime(Date upateTime) {
        this.upateTime = upateTime;
    }

    public String getFbiaId() {
        return fbiaId;
    }

    public void setFbiaId(String fbiaId) {
        this.fbiaId = fbiaId;
    }
}