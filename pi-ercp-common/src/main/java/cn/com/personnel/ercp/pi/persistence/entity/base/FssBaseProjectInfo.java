package cn.com.personnel.ercp.pi.persistence.entity.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fss_base_project_info")
public class FssBaseProjectInfo {
    /**
     * 项目ID
     */
    @Id
    @Column(name = "project_id")
    @GeneratedValue(generator = "JDBC")
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
     * 业务单元
     */
    @Column(name = "commercian_unit")
    private String commercianUnit;

    /**
     * 项目类别
     */
    @Column(name = "project_category")
    private String projectCategory;

    /**
     * 项目阶段
     */
    @Column(name = "project_stage")
    private String projectStage;

    /**
     * 省
     */
    private String province;

    /**
     * 公司ID，组织ID
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 公司名称
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 是否进入补贴
     */
    @Column(name = "is_subsidy")
    private String isSubsidy;

    /**
     * 股权比例
     */
    @Column(name = "equity_ratio")
    private BigDecimal equityRatio;

    /**
     * 是否并表
     */
    @Column(name = "is_consolidated")
    private String isConsolidated;

    /**
     * 项目性质
     */
    @Column(name = "project_nature")
    private String projectNature;

    /**
     * 币种编码
     */
    @Column(name = "waers_code")
    private String waersCode;

    /**
     * 币种
     */
    private String waers;

    /**
     * 应配比例资金
     */
    @Column(name = "proportionate_funds")
    private BigDecimal proportionateFunds;

    /**
     * 项目总概算
     */
    @Column(name = "total_project_budget")
    private BigDecimal totalProjectBudget;

    /**
     * 实际总投资
     */
    @Column(name = "actual_total_investment")
    private BigDecimal actualTotalInvestment;

    /**
     * 已到位资本金
     */
    @Column(name = "capital_in_place")
    private BigDecimal capitalInPlace;

    /**
     * 说明
     */
    private String description;

    /**
     * 区域编码
     */
    @Column(name = "area_code")
    private String areaCode;

    /**
     * 区域
     */
    private String area;

    /**
     * 批复核准时间
     */
    @Column(name = "approval_time")
    private String approvalTime;

    /**
     * 240完成时间
     */
    @Column(name = "complete_time_240")
    private String completeTime240;

    /**
     * 装机（MW）
     */
    private String installed;

    /**
     * 权益装机（MW）
     */
    @Column(name = "equity_installed")
    private String equityInstalled;

    /**
     * 电价（元/kwh）
     */
    @Column(name = "electricity_price")
    private String electricityPrice;

    /**
     * 是否进入补贴名录
     */
    @Column(name = "is_subsidy_directory")
    private String isSubsidyDirectory;

    /**
     * 所属国家
     */
    private String country;

    /**
     * 试运营时间
     */
    @Column(name = "trial_operation_time")
    private String trialOperationTime;

    /**
     * 签约主体
     */
    @Column(name = "contracting_body")
    private String contractingBody;

    /**
     * 特许经营年限
     */
    @Column(name = "franchise_years")
    private String franchiseYears;

    /**
     * 是否纳入财务计算
     */
    @Column(name = "is_include_financial_calculations")
    private String isIncludeFinancialCalculations;

    /**
     * 设计规模
     */
    @Column(name = "design_scale")
    private String designScale;

    /**
     * 保底水价
     */
    @Column(name = "guaranteed_water_price")
    private String guaranteedWaterPrice;

    /**
     * 保底水量
     */
    @Column(name = "bottom_water")
    private String bottomWater;

    /**
     * 水量计算公式
     */
    @Column(name = "water_calculation_formula")
    private String waterCalculationFormula;

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
     * SAP项目编号
     */
    private String pspid;

    /**
     * SAP项目名称
     */
    private String post1;

    /**
     * SAP利润中心编码
     */
    private String prctr;

    /**
     * SAP项目的对象号
     */
    private String objnr;

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
     * 获取业务单元
     *
     * @return commercian_unit - 业务单元
     */
    public String getCommercianUnit() {
        return commercianUnit;
    }

    /**
     * 设置业务单元
     *
     * @param commercianUnit 业务单元
     */
    public void setCommercianUnit(String commercianUnit) {
        this.commercianUnit = commercianUnit;
    }

    /**
     * 获取项目类别
     *
     * @return project_category - 项目类别
     */
    public String getProjectCategory() {
        return projectCategory;
    }

    /**
     * 设置项目类别
     *
     * @param projectCategory 项目类别
     */
    public void setProjectCategory(String projectCategory) {
        this.projectCategory = projectCategory;
    }

    /**
     * 获取项目阶段
     *
     * @return project_stage - 项目阶段
     */
    public String getProjectStage() {
        return projectStage;
    }

    /**
     * 设置项目阶段
     *
     * @param projectStage 项目阶段
     */
    public void setProjectStage(String projectStage) {
        this.projectStage = projectStage;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取公司ID，组织ID
     *
     * @return organ_id - 公司ID，组织ID
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置公司ID，组织ID
     *
     * @param organId 公司ID，组织ID
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
     * 获取是否进入补贴
     *
     * @return is_subsidy - 是否进入补贴
     */
    public String getIsSubsidy() {
        return isSubsidy;
    }

    /**
     * 设置是否进入补贴
     *
     * @param isSubsidy 是否进入补贴
     */
    public void setIsSubsidy(String isSubsidy) {
        this.isSubsidy = isSubsidy;
    }

    /**
     * 获取股权比例
     *
     * @return equity_ratio - 股权比例
     */
    public BigDecimal getEquityRatio() {
        return equityRatio;
    }

    /**
     * 设置股权比例
     *
     * @param equityRatio 股权比例
     */
    public void setEquityRatio(BigDecimal equityRatio) {
        this.equityRatio = equityRatio;
    }

    /**
     * 获取是否并表
     *
     * @return is_consolidated - 是否并表
     */
    public String getIsConsolidated() {
        return isConsolidated;
    }

    /**
     * 设置是否并表
     *
     * @param isConsolidated 是否并表
     */
    public void setIsConsolidated(String isConsolidated) {
        this.isConsolidated = isConsolidated;
    }

    /**
     * 获取项目性质
     *
     * @return project_nature - 项目性质
     */
    public String getProjectNature() {
        return projectNature;
    }

    /**
     * 设置项目性质
     *
     * @param projectNature 项目性质
     */
    public void setProjectNature(String projectNature) {
        this.projectNature = projectNature;
    }

    /**
     * 获取币种编码
     *
     * @return waers_code - 币种编码
     */
    public String getWaersCode() {
        return waersCode;
    }

    /**
     * 设置币种编码
     *
     * @param waersCode 币种编码
     */
    public void setWaersCode(String waersCode) {
        this.waersCode = waersCode;
    }

    /**
     * 获取币种
     *
     * @return waers - 币种
     */
    public String getWaers() {
        return waers;
    }

    /**
     * 设置币种
     *
     * @param waers 币种
     */
    public void setWaers(String waers) {
        this.waers = waers;
    }

    /**
     * 获取应配比例资金
     *
     * @return proportionate_funds - 应配比例资金
     */
    public BigDecimal getProportionateFunds() {
        return proportionateFunds;
    }

    /**
     * 设置应配比例资金
     *
     * @param proportionateFunds 应配比例资金
     */
    public void setProportionateFunds(BigDecimal proportionateFunds) {
        this.proportionateFunds = proportionateFunds;
    }

    /**
     * 获取项目总概算
     *
     * @return total_project_budget - 项目总概算
     */
    public BigDecimal getTotalProjectBudget() {
        return totalProjectBudget;
    }

    /**
     * 设置项目总概算
     *
     * @param totalProjectBudget 项目总概算
     */
    public void setTotalProjectBudget(BigDecimal totalProjectBudget) {
        this.totalProjectBudget = totalProjectBudget;
    }

    /**
     * 获取实际总投资
     *
     * @return actual_total_investment - 实际总投资
     */
    public BigDecimal getActualTotalInvestment() {
        return actualTotalInvestment;
    }

    /**
     * 设置实际总投资
     *
     * @param actualTotalInvestment 实际总投资
     */
    public void setActualTotalInvestment(BigDecimal actualTotalInvestment) {
        this.actualTotalInvestment = actualTotalInvestment;
    }

    /**
     * 获取已到位资本金
     *
     * @return capital_in_place - 已到位资本金
     */
    public BigDecimal getCapitalInPlace() {
        return capitalInPlace;
    }

    /**
     * 设置已到位资本金
     *
     * @param capitalInPlace 已到位资本金
     */
    public void setCapitalInPlace(BigDecimal capitalInPlace) {
        this.capitalInPlace = capitalInPlace;
    }

    /**
     * 获取说明
     *
     * @return description - 说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置说明
     *
     * @param description 说明
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取区域编码
     *
     * @return area_code - 区域编码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设置区域编码
     *
     * @param areaCode 区域编码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * 获取区域
     *
     * @return area - 区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区域
     *
     * @param area 区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取批复核准时间
     *
     * @return approval_time - 批复核准时间
     */
    public String getApprovalTime() {
        return approvalTime;
    }

    /**
     * 设置批复核准时间
     *
     * @param approvalTime 批复核准时间
     */
    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    /**
     * 获取240完成时间
     *
     * @return complete_time_240 - 240完成时间
     */
    public String getCompleteTime240() {
        return completeTime240;
    }

    /**
     * 设置240完成时间
     *
     * @param completeTime240 240完成时间
     */
    public void setCompleteTime240(String completeTime240) {
        this.completeTime240 = completeTime240;
    }

    /**
     * 获取装机（MW）
     *
     * @return installed - 装机（MW）
     */
    public String getInstalled() {
        return installed;
    }

    /**
     * 设置装机（MW）
     *
     * @param installed 装机（MW）
     */
    public void setInstalled(String installed) {
        this.installed = installed;
    }

    /**
     * 获取权益装机（MW）
     *
     * @return equity_installed - 权益装机（MW）
     */
    public String getEquityInstalled() {
        return equityInstalled;
    }

    /**
     * 设置权益装机（MW）
     *
     * @param equityInstalled 权益装机（MW）
     */
    public void setEquityInstalled(String equityInstalled) {
        this.equityInstalled = equityInstalled;
    }

    /**
     * 获取电价（元/kwh）
     *
     * @return electricity_price - 电价（元/kwh）
     */
    public String getElectricityPrice() {
        return electricityPrice;
    }

    /**
     * 设置电价（元/kwh）
     *
     * @param electricityPrice 电价（元/kwh）
     */
    public void setElectricityPrice(String electricityPrice) {
        this.electricityPrice = electricityPrice;
    }

    /**
     * 获取是否进入补贴名录
     *
     * @return is_subsidy_directory - 是否进入补贴名录
     */
    public String getIsSubsidyDirectory() {
        return isSubsidyDirectory;
    }

    /**
     * 设置是否进入补贴名录
     *
     * @param isSubsidyDirectory 是否进入补贴名录
     */
    public void setIsSubsidyDirectory(String isSubsidyDirectory) {
        this.isSubsidyDirectory = isSubsidyDirectory;
    }

    /**
     * 获取所属国家
     *
     * @return country - 所属国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置所属国家
     *
     * @param country 所属国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取试运营时间
     *
     * @return trial_operation_time - 试运营时间
     */
    public String getTrialOperationTime() {
        return trialOperationTime;
    }

    /**
     * 设置试运营时间
     *
     * @param trialOperationTime 试运营时间
     */
    public void setTrialOperationTime(String trialOperationTime) {
        this.trialOperationTime = trialOperationTime;
    }

    /**
     * 获取签约主体
     *
     * @return contracting_body - 签约主体
     */
    public String getContractingBody() {
        return contractingBody;
    }

    /**
     * 设置签约主体
     *
     * @param contractingBody 签约主体
     */
    public void setContractingBody(String contractingBody) {
        this.contractingBody = contractingBody;
    }

    /**
     * 获取特许经营年限
     *
     * @return franchise_years - 特许经营年限
     */
    public String getFranchiseYears() {
        return franchiseYears;
    }

    /**
     * 设置特许经营年限
     *
     * @param franchiseYears 特许经营年限
     */
    public void setFranchiseYears(String franchiseYears) {
        this.franchiseYears = franchiseYears;
    }

    /**
     * 获取是否纳入财务计算
     *
     * @return is_include_financial_calculations - 是否纳入财务计算
     */
    public String getIsIncludeFinancialCalculations() {
        return isIncludeFinancialCalculations;
    }

    /**
     * 设置是否纳入财务计算
     *
     * @param isIncludeFinancialCalculations 是否纳入财务计算
     */
    public void setIsIncludeFinancialCalculations(String isIncludeFinancialCalculations) {
        this.isIncludeFinancialCalculations = isIncludeFinancialCalculations;
    }

    /**
     * 获取设计规模
     *
     * @return design_scale - 设计规模
     */
    public String getDesignScale() {
        return designScale;
    }

    /**
     * 设置设计规模
     *
     * @param designScale 设计规模
     */
    public void setDesignScale(String designScale) {
        this.designScale = designScale;
    }

    /**
     * 获取保底水价
     *
     * @return guaranteed_water_price - 保底水价
     */
    public String getGuaranteedWaterPrice() {
        return guaranteedWaterPrice;
    }

    /**
     * 设置保底水价
     *
     * @param guaranteedWaterPrice 保底水价
     */
    public void setGuaranteedWaterPrice(String guaranteedWaterPrice) {
        this.guaranteedWaterPrice = guaranteedWaterPrice;
    }

    /**
     * 获取保底水量
     *
     * @return bottom_water - 保底水量
     */
    public String getBottomWater() {
        return bottomWater;
    }

    /**
     * 设置保底水量
     *
     * @param bottomWater 保底水量
     */
    public void setBottomWater(String bottomWater) {
        this.bottomWater = bottomWater;
    }

    /**
     * 获取水量计算公式
     *
     * @return water_calculation_formula - 水量计算公式
     */
    public String getWaterCalculationFormula() {
        return waterCalculationFormula;
    }

    /**
     * 设置水量计算公式
     *
     * @param waterCalculationFormula 水量计算公式
     */
    public void setWaterCalculationFormula(String waterCalculationFormula) {
        this.waterCalculationFormula = waterCalculationFormula;
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

    /**
     * 获取SAP项目编号
     *
     * @return pspid - SAP项目编号
     */
    public String getPspid() {
        return pspid;
    }

    /**
     * 设置SAP项目编号
     *
     * @param pspid SAP项目编号
     */
    public void setPspid(String pspid) {
        this.pspid = pspid;
    }

    /**
     * 获取SAP项目名称
     *
     * @return post1 - SAP项目名称
     */
    public String getPost1() {
        return post1;
    }

    /**
     * 设置SAP项目名称
     *
     * @param post1 SAP项目名称
     */
    public void setPost1(String post1) {
        this.post1 = post1;
    }

    /**
     * 获取SAP利润中心编码
     *
     * @return prctr - SAP利润中心编码
     */
    public String getPrctr() {
        return prctr;
    }

    /**
     * 设置SAP利润中心编码
     *
     * @param prctr SAP利润中心编码
     */
    public void setPrctr(String prctr) {
        this.prctr = prctr;
    }

    /**
     * 获取SAP项目的对象号
     *
     * @return objnr - SAP项目的对象号
     */
    public String getObjnr() {
        return objnr;
    }

    /**
     * 设置SAP项目的对象号
     *
     * @param objnr SAP项目的对象号
     */
    public void setObjnr(String objnr) {
        this.objnr = objnr;
    }
}