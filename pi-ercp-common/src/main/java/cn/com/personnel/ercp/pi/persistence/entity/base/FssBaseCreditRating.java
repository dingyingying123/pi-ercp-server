package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_credit_rating")
public class FssBaseCreditRating {
    /**
     * 信用评级ID
     */
    @Id
    @Column(name = "credit_id")
    @GeneratedValue(generator = "JDBC")
    private String creditId;

    /**
     * 公司ID
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 公司名称
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 评级类型
     */
    @Column(name = "rating_type")
    private String ratingType;

    /**
     * 总行ID
     */
    @Column(name = "head_id")
    private String headId;

    /**
     * 总行名称
     */
    @Column(name = "head_name")
    private String headName;

    /**
     * 其他项目情况说明
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
     * 获取公司ID
     *
     * @return organ_id - 公司ID
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置公司ID
     *
     * @param organId 公司ID
     */
    public void setOrganId(String organId) {
        this.organId = organId;
    }

    /**
     * 获取公司名称
     *
     * @return organ_name - 公司名称
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * 设置公司名称
     *
     * @param organName 公司名称
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * 获取评级类型
     *
     * @return rating_type - 评级类型
     */
    public String getRatingType() {
        return ratingType;
    }

    /**
     * 设置评级类型
     *
     * @param ratingType 评级类型
     */
    public void setRatingType(String ratingType) {
        this.ratingType = ratingType;
    }

    /**
     * 获取总行ID
     *
     * @return head_id - 总行ID
     */
    public String getHeadId() {
        return headId;
    }

    /**
     * 设置总行ID
     *
     * @param headId 总行ID
     */
    public void setHeadId(String headId) {
        this.headId = headId;
    }

    /**
     * 获取总行名称
     *
     * @return head_name - 总行名称
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * 设置总行名称
     *
     * @param headName 总行名称
     */
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    /**
     * 获取其他项目情况说明
     *
     * @return description - 其他项目情况说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置其他项目情况说明
     *
     * @param description 其他项目情况说明
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