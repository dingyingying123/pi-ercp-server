package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_bond_credit_occupation")
public class FssBondCreditOccupation {
    /**
     * 债券授信占用ID
     */
    @Id
    @Column(name = "credit_id")
    @GeneratedValue(generator = "JDBC")
    private String creditId;

    /**
     * 债券发行ID
     */
    @Column(name = "dw_id")
    private String dwId;

    /**
     * 债券申请ID
     */
    @Column(name = "bond_id")
    private String bondId;

    /**
     * 债券发行申请ID
     */
    @Column(name = "fbia_id")
    private String fbiaId;

    /**
     * 银行总行ID，主承销商ID
     */
    @Column(name = "head_id")
    private String headId;

    /**
     * 银行总行编码，主承销商编码
     */
    @Column(name = "head_code")
    private String headCode;

    /**
     * 银行总行，主承销商
     */
    @Column(name = "head_name")
    private String headName;

    /**
     * 授信金额
     */
    @Column(name = "credit_amount")
    private BigDecimal creditAmount;

    /**
     * 备注
     */
    private String description;

    /**
     * 预留
     */
    private String reserve;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 已删除 0：未删除，1：已删除
     */
    private String deleted;

    /**
     * 获取债券授信占用ID
     *
     * @return credit_id - 债券授信占用ID
     */
    public String getCreditId() {
        return creditId;
    }

    /**
     * 设置债券授信占用ID
     *
     * @param creditId 债券授信占用ID
     */
    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    /**
     * 获取债券发行ID
     *
     * @return dw_id - 债券发行ID
     */
    public String getDwId() {
        return dwId;
    }

    /**
     * 设置债券发行ID
     *
     * @param dwId 债券发行ID
     */
    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    /**
     * 获取债券申请ID
     *
     * @return bond_id - 债券申请ID
     */
    public String getBondId() {
        return bondId;
    }

    /**
     * 设置债券申请ID
     *
     * @param bondId 债券申请ID
     */
    public void setBondId(String bondId) {
        this.bondId = bondId;
    }

    /**
     * 获取债券发行申请ID
     *
     * @return fbia_id - 债券发行申请ID
     */
    public String getFbiaId() {
        return fbiaId;
    }

    /**
     * 设置债券发行申请ID
     *
     * @param fbiaId 债券发行申请ID
     */
    public void setFbiaId(String fbiaId) {
        this.fbiaId = fbiaId;
    }

    /**
     * 获取银行总行ID，主承销商ID
     *
     * @return head_id - 银行总行ID，主承销商ID
     */
    public String getHeadId() {
        return headId;
    }

    /**
     * 设置银行总行ID，主承销商ID
     *
     * @param headId 银行总行ID，主承销商ID
     */
    public void setHeadId(String headId) {
        this.headId = headId;
    }

    /**
     * 获取银行总行编码，主承销商编码
     *
     * @return head_code - 银行总行编码，主承销商编码
     */
    public String getHeadCode() {
        return headCode;
    }

    /**
     * 设置银行总行编码，主承销商编码
     *
     * @param headCode 银行总行编码，主承销商编码
     */
    public void setHeadCode(String headCode) {
        this.headCode = headCode;
    }

    /**
     * 获取银行总行，主承销商
     *
     * @return head_name - 银行总行，主承销商
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * 设置银行总行，主承销商
     *
     * @param headName 银行总行，主承销商
     */
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    /**
     * 获取授信金额
     *
     * @return credit_amount - 授信金额
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * 设置授信金额
     *
     * @param creditAmount 授信金额
     */
    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * 获取备注
     *
     * @return description - 备注
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置备注
     *
     * @param description 备注
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取预留
     *
     * @return reserve - 预留
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * 设置预留
     *
     * @param reserve 预留
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
     * 获取已删除 0：未删除，1：已删除
     *
     * @return deleted - 已删除 0：未删除，1：已删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置已删除 0：未删除，1：已删除
     *
     * @param deleted 已删除 0：未删除，1：已删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}