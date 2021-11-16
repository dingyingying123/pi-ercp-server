package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bond_rating")
public class FssBondRating {
    /**
     * 评级信息ID
     */
    @Id
    @Column(name = "rating_id")
    @GeneratedValue(generator = "JDBC")
    private String ratingId;

    /**
     * 债券ID
     */
    @Column(name = "bond_id")
    private String bondId;

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
     * 评级机构
     */
    @Column(name = "rating_agencies")
    private String ratingAgencies;

    /**
     * 评级等级
     */
    @Column(name = "rating_level")
    private String ratingLevel;

    /**
     * 备注
     */
    private String description;

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
     * 获取评级信息ID
     *
     * @return rating_id - 评级信息ID
     */
    public String getRatingId() {
        return ratingId;
    }

    /**
     * 设置评级信息ID
     *
     * @param ratingId 评级信息ID
     */
    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
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
     * 获取评级机构
     *
     * @return rating_agencies - 评级机构
     */
    public String getRatingAgencies() {
        return ratingAgencies;
    }

    /**
     * 设置评级机构
     *
     * @param ratingAgencies 评级机构
     */
    public void setRatingAgencies(String ratingAgencies) {
        this.ratingAgencies = ratingAgencies;
    }

    /**
     * 获取评级等级
     *
     * @return rating_level - 评级等级
     */
    public String getRatingLevel() {
        return ratingLevel;
    }

    /**
     * 设置评级等级
     *
     * @param ratingLevel 评级等级
     */
    public void setRatingLevel(String ratingLevel) {
        this.ratingLevel = ratingLevel;
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