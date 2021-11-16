package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_project_track")
public class FssBaseProjectTrack {
    /**
     * 项目跟踪ID
     */
    @Id
    @Column(name = "track_id")
    @GeneratedValue(generator = "JDBC")
    private String trackId;

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
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 年度
     */
    private String year;

    /**
     * 风电-上网电量
     */
    @Column(name = "wind_power_online")
    private String windPowerOnline;

    /**
     * 风电-发电利用小时数
     */
    @Column(name = "wind_power_generation_hours")
    private String windPowerGenerationHours;

    /**
     * 风电-弃风限电率
     */
    @Column(name = "wind_power_abandonment_rate")
    private String windPowerAbandonmentRate;

    /**
     * 风电-含税电价
     */
    @Column(name = "wind_power_price_including_tax")
    private String windPowerPriceIncludingTax;

    /**
     * 环保-出水量
     */
    @Column(name = "environmental_water_output")
    private String environmentalWaterOutput;

    /**
     * 环保-水价
     */
    @Column(name = "environmental_water_price")
    private String environmentalWaterPrice;

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
     * 获取项目跟踪ID
     *
     * @return track_id - 项目跟踪ID
     */
    public String getTrackId() {
        return trackId;
    }

    /**
     * 设置项目跟踪ID
     *
     * @param trackId 项目跟踪ID
     */
    public void setTrackId(String trackId) {
        this.trackId = trackId;
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
     * 获取项目名称
     *
     * @return project_name - 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目名称
     *
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取年度
     *
     * @return year - 年度
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年度
     *
     * @param year 年度
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 获取风电-上网电量
     *
     * @return wind_power_online - 风电-上网电量
     */
    public String getWindPowerOnline() {
        return windPowerOnline;
    }

    /**
     * 设置风电-上网电量
     *
     * @param windPowerOnline 风电-上网电量
     */
    public void setWindPowerOnline(String windPowerOnline) {
        this.windPowerOnline = windPowerOnline;
    }

    /**
     * 获取风电-发电利用小时数
     *
     * @return wind_power_generation_hours - 风电-发电利用小时数
     */
    public String getWindPowerGenerationHours() {
        return windPowerGenerationHours;
    }

    /**
     * 设置风电-发电利用小时数
     *
     * @param windPowerGenerationHours 风电-发电利用小时数
     */
    public void setWindPowerGenerationHours(String windPowerGenerationHours) {
        this.windPowerGenerationHours = windPowerGenerationHours;
    }

    /**
     * 获取风电-弃风限电率
     *
     * @return wind_power_abandonment_rate - 风电-弃风限电率
     */
    public String getWindPowerAbandonmentRate() {
        return windPowerAbandonmentRate;
    }

    /**
     * 设置风电-弃风限电率
     *
     * @param windPowerAbandonmentRate 风电-弃风限电率
     */
    public void setWindPowerAbandonmentRate(String windPowerAbandonmentRate) {
        this.windPowerAbandonmentRate = windPowerAbandonmentRate;
    }

    /**
     * 获取风电-含税电价
     *
     * @return wind_power_price_including_tax - 风电-含税电价
     */
    public String getWindPowerPriceIncludingTax() {
        return windPowerPriceIncludingTax;
    }

    /**
     * 设置风电-含税电价
     *
     * @param windPowerPriceIncludingTax 风电-含税电价
     */
    public void setWindPowerPriceIncludingTax(String windPowerPriceIncludingTax) {
        this.windPowerPriceIncludingTax = windPowerPriceIncludingTax;
    }

    /**
     * 获取环保-出水量
     *
     * @return environmental_water_output - 环保-出水量
     */
    public String getEnvironmentalWaterOutput() {
        return environmentalWaterOutput;
    }

    /**
     * 设置环保-出水量
     *
     * @param environmentalWaterOutput 环保-出水量
     */
    public void setEnvironmentalWaterOutput(String environmentalWaterOutput) {
        this.environmentalWaterOutput = environmentalWaterOutput;
    }

    /**
     * 获取环保-水价
     *
     * @return environmental_water_price - 环保-水价
     */
    public String getEnvironmentalWaterPrice() {
        return environmentalWaterPrice;
    }

    /**
     * 设置环保-水价
     *
     * @param environmentalWaterPrice 环保-水价
     */
    public void setEnvironmentalWaterPrice(String environmentalWaterPrice) {
        this.environmentalWaterPrice = environmentalWaterPrice;
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