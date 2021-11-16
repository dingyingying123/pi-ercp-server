package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_credit_rating_maintain")
public class FssBaseCreditRatingMaintain {
    /**
     * 信用评级维护ID
     */
    @Id
    @Column(name = "maintain_id")
    @GeneratedValue(generator = "JDBC")
    private String maintainId;

    /**
     * 信用评级ID
     */
    @Column(name = "credit_id")
    private String creditId;

    /**
     * 信用级别
     */
    @Column(name = "credit_grade")
    private String creditGrade;

    /**
     * 生效日期
     */
    @Column(name = "effective_date")
    private String effectiveDate;

    /**
     * 失效日期
     */
    @Column(name = "expiration_date")
    private String expirationDate;

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
     * 获取信用评级维护ID
     *
     * @return maintain_id - 信用评级维护ID
     */
    public String getMaintainId() {
        return maintainId;
    }

    /**
     * 设置信用评级维护ID
     *
     * @param maintainId 信用评级维护ID
     */
    public void setMaintainId(String maintainId) {
        this.maintainId = maintainId;
    }

    /**
     * 获取信用评级ID
     *
     * @return credit_id - 信用评级ID
     */
    public String getCreditId() {
        return creditId;
    }

    /**
     * 设置信用评级ID
     *
     * @param creditId 信用评级ID
     */
    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    /**
     * 获取信用级别
     *
     * @return credit_grade - 信用级别
     */
    public String getCreditGrade() {
        return creditGrade;
    }

    /**
     * 设置信用级别
     *
     * @param creditGrade 信用级别
     */
    public void setCreditGrade(String creditGrade) {
        this.creditGrade = creditGrade;
    }

    /**
     * 获取生效日期
     *
     * @return effective_date - 生效日期
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置生效日期
     *
     * @param effectiveDate 生效日期
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * 获取失效日期
     *
     * @return expiration_date - 失效日期
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * 设置失效日期
     *
     * @param expirationDate 失效日期
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
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
}