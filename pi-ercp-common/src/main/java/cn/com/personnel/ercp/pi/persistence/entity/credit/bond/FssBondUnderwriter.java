package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bond_underwriter")
public class FssBondUnderwriter {
    /**
     * 承销人ID
     */
    @Id
    @Column(name = "underwriter_id")
    @GeneratedValue(generator = "JDBC")
    private String underwriterId;

    /**
     * 债券ID
     */
    @Column(name = "bond_id")
    private String bondId;

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
     * 承销人比例
     */
    @Column(name = "underwriters_ratio")
    private BigDecimal underwritersRatio;

    /**
     * 预留
     */
    private String reserve;

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
     * 获取承销人ID
     *
     * @return underwriter_id - 承销人ID
     */
    public String getUnderwriterId() {
        return underwriterId;
    }

    /**
     * 设置承销人ID
     *
     * @param underwriterId 承销人ID
     */
    public void setUnderwriterId(String underwriterId) {
        this.underwriterId = underwriterId;
    }

    /**
     * 获取债券ID
     *
     * @return bond_id - 债券ID
     */
    public String getBondId() {
        return bondId;
    }

    /**
     * 设置债券ID
     *
     * @param bondId 债券ID
     */
    public void setBondId(String bondId) {
        this.bondId = bondId;
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
     * 获取承销人比例
     *
     * @return underwriters_ratio - 承销人比例
     */
    public BigDecimal getUnderwritersRatio() {
        return underwritersRatio;
    }

    /**
     * 设置承销人比例
     *
     * @param underwritersRatio 承销人比例
     */
    public void setUnderwritersRatio(BigDecimal underwritersRatio) {
        this.underwritersRatio = underwritersRatio;
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
}