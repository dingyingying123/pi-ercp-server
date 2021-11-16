package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseCollateralDetail;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;

public class FssBaseCollateralDetailVO extends FssBaseCollateralDetail {
    private String loanContractNoName;
    private List<String> ids;

    /**
     * 抵押物编号
     */
    @Excel(name = "抵押物编号")
    private String collateralId;

    /**
     * 抵押物名称
     */
    @Excel(name = "抵押物名称")
    private String collateralName;

    /**
     * 抵押物类别
     */
    @Excel(name = "抵押物类别")
    private String collateralCategoryName;

    /**
     * 抵押物状态
     */
    @Excel(name = "抵押物状态")
    private String collateralStatusName;

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
     * 抵押合同号
     */
    @Excel(name = "抵押合同号")
    private String collateralContractNo;

    /**
     * 抵押权人
     */
    @Excel(name = "抵押权人")
    private String branchName;

    public String getCollateralCategoryName() {
        return collateralCategoryName;
    }

    public void setCollateralCategoryName(String collateralCategoryName) {
        this.collateralCategoryName = collateralCategoryName;
    }

    public String getCollateralStatusName() {
        return collateralStatusName;
    }

    public void setCollateralStatusName(String collateralStatusName) {
        this.collateralStatusName = collateralStatusName;
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
    public String getCollateralId() {
        return collateralId;
    }

    @Override
    public void setCollateralId(String collateralId) {
        this.collateralId = collateralId;
    }

    @Override
    public String getCollateralName() {
        return collateralName;
    }

    @Override
    public void setCollateralName(String collateralName) {
        this.collateralName = collateralName;
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
    public String getCollateralContractNo() {
        return collateralContractNo;
    }

    @Override
    public void setCollateralContractNo(String collateralContractNo) {
        this.collateralContractNo = collateralContractNo;
    }

}
