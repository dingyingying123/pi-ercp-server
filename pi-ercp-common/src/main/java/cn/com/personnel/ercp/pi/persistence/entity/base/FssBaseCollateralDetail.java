package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_collateral_detail")
public class FssBaseCollateralDetail {
    /**
     * 主键id
     */
    @Id
    private String id;
    /**
     * 抵押物编号
     */
    @Column(name = "collateral_id")
    private String collateralId;

    /**
     * 抵押物名称
     */
    @Column(name = "collateral_name")
    private String collateralName;

    /**
     * 抵押物类别
     */
    @Column(name = "collateral_category")
    private String collateralCategory;

    /**
     * 抵押物状态
     */
    @Column(name = "collateral_status")
    private String collateralStatus;

    /**
     * 所有权人
     */
    @Column(name = "ownership_people")
    private String ownershipPeople;

    /**
     * 区域
     */
    private String region;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 评估价值(元)
     */
    private String valuation;

    /**
     * 抵押合同号
     */
    @Column(name = "collateral_contract_no")
    private String collateralContractNo;

    /**
     * 抵押权人
     */
    @Column(name = "collateral_people")
    private String collateralPeople;

    /**
     * 对应借款合同
     */
    @Column(name = "loan_contract_no")
    private String loanContractNo;

    /**
     * 抵押物描述
     */
    @Column(name = "collateral_describe")
    private String collateralDescribe;

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
     * 所有权人公司编码
     */
    @Column(name="collateral_category_id")
    private String collateralCategoryId;
    /**
     * 项目id
     */
    @Column(name = "project_id")
    private String projectId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取抵押物编号
     *
     * @return collateral_id - 抵押物编号
     */
    public String getCollateralId() {
        return collateralId;
    }

    /**
     * 设置抵押物编号
     *
     * @param collateralId 抵押物编号
     */
    public void setCollateralId(String collateralId) {
        this.collateralId = collateralId;
    }

    /**
     * 获取抵押物名称
     *
     * @return collateral_name - 抵押物名称
     */
    public String getCollateralName() {
        return collateralName;
    }

    /**
     * 设置抵押物名称
     *
     * @param collateralName 抵押物名称
     */
    public void setCollateralName(String collateralName) {
        this.collateralName = collateralName;
    }

    /**
     * 获取抵押物类别
     *
     * @return collateral_category - 抵押物类别
     */
    public String getCollateralCategory() {
        return collateralCategory;
    }

    /**
     * 设置抵押物类别
     *
     * @param collateralCategory 抵押物类别
     */
    public void setCollateralCategory(String collateralCategory) {
        this.collateralCategory = collateralCategory;
    }

    /**
     * 获取抵押物状态
     *
     * @return collateral_status - 抵押物状态
     */
    public String getCollateralStatus() {
        return collateralStatus;
    }

    /**
     * 设置抵押物状态
     *
     * @param collateralStatus 抵押物状态
     */
    public void setCollateralStatus(String collateralStatus) {
        this.collateralStatus = collateralStatus;
    }

    /**
     * 获取所有权人
     *
     * @return ownership_people - 所有权人
     */
    public String getOwnershipPeople() {
        return ownershipPeople;
    }

    /**
     * 设置所有权人
     *
     * @param ownershipPeople 所有权人
     */
    public void setOwnershipPeople(String ownershipPeople) {
        this.ownershipPeople = ownershipPeople;
    }

    /**
     * 获取区域
     *
     * @return region - 区域
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置区域
     *
     * @param region 区域
     */
    public void setRegion(String region) {
        this.region = region;
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
     * 获取评估价值(元)
     *
     * @return valuation - 评估价值(元)
     */
    public String getValuation() {
        return valuation;
    }

    /**
     * 设置评估价值(元)
     *
     * @param valuation 评估价值(元)
     */
    public void setValuation(String valuation) {
        this.valuation = valuation;
    }

    /**
     * 获取抵押合同号
     *
     * @return collateral_contract_no - 抵押合同号
     */
    public String getCollateralContractNo() {
        return collateralContractNo;
    }

    /**
     * 设置抵押合同号
     *
     * @param collateralContractNo 抵押合同号
     */
    public void setCollateralContractNo(String collateralContractNo) {
        this.collateralContractNo = collateralContractNo;
    }

    /**
     * 获取抵押权人
     *
     * @return collateral_people - 抵押权人
     */
    public String getCollateralPeople() {
        return collateralPeople;
    }

    /**
     * 设置抵押权人
     *
     * @param collateralPeople 抵押权人
     */
    public void setCollateralPeople(String collateralPeople) {
        this.collateralPeople = collateralPeople;
    }

    /**
     * 获取对应借款合同
     *
     * @return loan_contract_no - 对应借款合同
     */
    public String getLoanContractNo() {
        return loanContractNo;
    }

    /**
     * 设置对应借款合同
     *
     * @param loanContractNo 对应借款合同
     */
    public void setLoanContractNo(String loanContractNo) {
        this.loanContractNo = loanContractNo;
    }

    /**
     * 获取抵押物描述
     *
     * @return collateral_describe - 抵押物描述
     */
    public String getCollateralDescribe() {
        return collateralDescribe;
    }

    /**
     * 设置抵押物描述
     *
     * @param collateralDescribe 抵押物描述
     */
    public void setCollateralDescribe(String collateralDescribe) {
        this.collateralDescribe = collateralDescribe;
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

    public String getCollateralCategoryId() {
        return collateralCategoryId;
    }

    public void setCollateralCategoryId(String collateralCategoryId) {
        this.collateralCategoryId = collateralCategoryId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}