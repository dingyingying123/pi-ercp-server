package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_pledge_detail")
public class FssBasePledgeDetail {
    /**
     * 主键id
     */
    @Id
    private String id;

    /**
     * 质押物id
     */
    @Column(name = "pledge_id")
    private String pledgeId;

    /**
     * 质押物名称
     */
    @Column(name = "pledge_name")
    private String pledgeName;

    /**
     * 质押物类别
     */
    @Column(name = "pledge_category")
    private String pledgeCategory;

    /**
     * 质押物状态
     */
    @Column(name = "pledge_status")
    private String pledgeStatus;

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
     * 质押合同号
     */
    @Column(name = "pledge_contract_no")
    private String pledgeContractNo;

    /**
     * 质押权人
     */
    @Column(name = "pledge_people")
    private String pledgePeople;

    /**
     * 对应借款合同
     */
    @Column(name = "loan_contract_no")
    private String loanContractNo;

    /**
     * 质押物描述
     */
    @Column(name = "pledge_describe")
    private String pledgeDescribe;

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
    private String bukrs;
    /**
     * 项目id
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取质押物id
     *
     * @return pledge_id - 质押物id
     */
    public String getPledgeId() {
        return pledgeId;
    }

    /**
     * 设置质押物id
     *
     * @param pledgeId 质押物id
     */
    public void setPledgeId(String pledgeId) {
        this.pledgeId = pledgeId;
    }

    /**
     * 获取质押物名称
     *
     * @return pledge_name - 质押物名称
     */
    public String getPledgeName() {
        return pledgeName;
    }

    /**
     * 设置质押物名称
     *
     * @param pledgeName 质押物名称
     */
    public void setPledgeName(String pledgeName) {
        this.pledgeName = pledgeName;
    }

    /**
     * 获取质押物类别
     *
     * @return pledge_category - 质押物类别
     */
    public String getPledgeCategory() {
        return pledgeCategory;
    }

    /**
     * 设置质押物类别
     *
     * @param pledgeCategory 质押物类别
     */
    public void setPledgeCategory(String pledgeCategory) {
        this.pledgeCategory = pledgeCategory;
    }

    /**
     * 获取质押物状态
     *
     * @return pledge_status - 质押物状态
     */
    public String getPledgeStatus() {
        return pledgeStatus;
    }

    /**
     * 设置质押物状态
     *
     * @param pledgeStatus 质押物状态
     */
    public void setPledgeStatus(String pledgeStatus) {
        this.pledgeStatus = pledgeStatus;
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
     * 获取质押合同号
     *
     * @return pledge_contract_no - 质押合同号
     */
    public String getPledgeContractNo() {
        return pledgeContractNo;
    }

    /**
     * 设置质押合同号
     *
     * @param pledgeContractNo 质押合同号
     */
    public void setPledgeContractNo(String pledgeContractNo) {
        this.pledgeContractNo = pledgeContractNo;
    }

    /**
     * 获取质押权人
     *
     * @return pledge_people - 质押权人
     */
    public String getPledgePeople() {
        return pledgePeople;
    }

    /**
     * 设置质押权人
     *
     * @param pledgePeople 质押权人
     */
    public void setPledgePeople(String pledgePeople) {
        this.pledgePeople = pledgePeople;
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
     * 获取质押物描述
     *
     * @return pledge_describe - 质押物描述
     */
    public String getPledgeDescribe() {
        return pledgeDescribe;
    }

    /**
     * 设置质押物描述
     *
     * @param pledgeDescribe 质押物描述
     */
    public void setPledgeDescribe(String pledgeDescribe) {
        this.pledgeDescribe = pledgeDescribe;
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

    public String getBukrs() {
        return bukrs;
    }

    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}