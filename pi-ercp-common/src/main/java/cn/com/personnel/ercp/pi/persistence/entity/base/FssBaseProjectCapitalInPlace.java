package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_project_capital_in_place")
public class FssBaseProjectCapitalInPlace {
    /**
     * 项目变更ID
     */
    @Id
    @Column(name = "place_id")
    @GeneratedValue(generator = "JDBC")
    private String placeId;

    /**
     * 项目ID
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 项目简称
     */
    @Column(name = "project_abbreviation")
    private String projectAbbreviation;

    /**
     * 已到位资本金金额
     */
    private BigDecimal capital;

    /**
     * 到位时间
     */
    @Column(name = "in_place_date")
    private String inPlaceDate;

    /**
     * 描述
     */
    private String description;

    /**
     * 已删除 0：未删除，1：已删除
     */
    private String deleted;

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
     * 获取项目变更ID
     *
     * @return place_id - 项目变更ID
     */
    public String getPlaceId() {
        return placeId;
    }

    /**
     * 设置项目变更ID
     *
     * @param placeId 项目变更ID
     */
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    /**
     * 获取项目ID
     *
     * @return project_id - 项目ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目ID
     *
     * @param projectId 项目ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取项目简称
     *
     * @return project_abbreviation - 项目简称
     */
    public String getProjectAbbreviation() {
        return projectAbbreviation;
    }

    /**
     * 设置项目简称
     *
     * @param projectAbbreviation 项目简称
     */
    public void setProjectAbbreviation(String projectAbbreviation) {
        this.projectAbbreviation = projectAbbreviation;
    }

    /**
     * 获取已到位资本金金额
     *
     * @return capital - 已到位资本金金额
     */
    public BigDecimal getCapital() {
        return capital;
    }

    /**
     * 设置已到位资本金金额
     *
     * @param capital 已到位资本金金额
     */
    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    /**
     * 获取到位时间
     *
     * @return in_place_date - 到位时间
     */
    public String getInPlaceDate() {
        return inPlaceDate;
    }

    /**
     * 设置到位时间
     *
     * @param inPlaceDate 到位时间
     */
    public void setInPlaceDate(String inPlaceDate) {
        this.inPlaceDate = inPlaceDate;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
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