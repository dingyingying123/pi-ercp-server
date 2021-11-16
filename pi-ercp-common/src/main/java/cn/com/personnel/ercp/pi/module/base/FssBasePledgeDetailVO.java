package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBasePledgeDetail;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;

public class FssBasePledgeDetailVO extends FssBasePledgeDetail {
    private String loanContractNoName;
    private List<String> ids;

    /**
     * 质押物id
     */
    @Excel(name = "质押物编号")
    private String pledgeId;

    /**
     * 质押物名称
     */
    @Excel(name = "质押物名称")
    private String pledgeName;

    /**
     * 质押物类别
     */
    @Excel(name = "质押物类别")
    private String pledgeCategoryName;

    /**
     * 质押物状态
     */
    @Excel(name = "质押物状态")
    private String pledgeStatusName;

    /**
     * 所有权人
     */
    @Excel(name = "所有权人")
    private String ownershipPeople;

    /**
     * 区域
     */
    @Excel(name = "区域")
    private String region;

    /**
     * 项目名称
     */
    @Excel(name = "项目名称")
    private String projectName;

    /**
     * 评估价值(元)
     */
    @Excel(name = "评价估值")
    private String valuation;

    /**
     * 质押合同号
     */
    @Excel(name = "质押合同号")
    private String pledgeContractNo;

    /**
     * 质押权人
     */
    @Excel(name = "质押权人")
    private String branchName;

    public String getPledgeCategoryName() {
        return pledgeCategoryName;
    }

    public void setPledgeCategoryName(String pledgeCategoryName) {
        this.pledgeCategoryName = pledgeCategoryName;
    }

    public String getPledgeStatusName() {
        return pledgeStatusName;
    }

    public void setPledgeStatusName(String pledgeStatusName) {
        this.pledgeStatusName = pledgeStatusName;
    }

    public String getLoanContractNoName() {
        return loanContractNoName;
    }

    public void setLoanContractNoName(String loanContractNoName) {
        this.loanContractNoName = loanContractNoName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String getPledgeId() {
        return pledgeId;
    }

    @Override
    public void setPledgeId(String pledgeId) {
        this.pledgeId = pledgeId;
    }

    @Override
    public String getPledgeName() {
        return pledgeName;
    }

    @Override
    public void setPledgeName(String pledgeName) {
        this.pledgeName = pledgeName;
    }

    @Override
    public String getOwnershipPeople() {
        return ownershipPeople;
    }

    @Override
    public void setOwnershipPeople(String ownershipPeople) {
        this.ownershipPeople = ownershipPeople;
    }

    @Override
    public String getRegion() {
        return region;
    }

    @Override
    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String getProjectName() {
        return projectName;
    }

    @Override
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String getValuation() {
        return valuation;
    }

    @Override
    public void setValuation(String valuation) {
        this.valuation = valuation;
    }

    @Override
    public String getPledgeContractNo() {
        return pledgeContractNo;
    }

    @Override
    public void setPledgeContractNo(String pledgeContractNo) {
        this.pledgeContractNo = pledgeContractNo;
    }

}
