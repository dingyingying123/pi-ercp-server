package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseProjectCapitalInPlace;
import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseProjectChangeRecord;
import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseProjectInfo;
import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseProjectTrack;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.math.BigDecimal;
import java.util.List;

public class ProjectVo extends FssBaseProjectInfo {
    private FssBaseProjectInfo fssBaseProjectInfo;
    private List<FssBaseProjectTrack> projectTrackList;
    private List<FssBaseProjectChangeRecord> changeRecordList;
    private FssBaseProjectCapitalInPlace place;
    private List<String> ids;

    /**
     * 项目简称
     */
    @Excel(name = "项目简称")
    private String projectAbbreviation;

    /**
     * 项目名称
     */
    @Excel(name = "项目名称")
    private String projectName;

    /**
     * 业务单元
     */
    @Excel(name = "业务单元")
    private String commercianUnit;

    /**
     * 项目类别
     */
    @Excel(name = "项目类别")
    private String projectCategory;

    /**
     * 项目阶段
     */
    @Excel(name = "项目阶段")
    private String projectStage;

    /**
     * 省
     */
    @Excel(name = "所在省份")
    private String province;

    /**
     * 公司名称
     */
    @Excel(name = "公司名称")
    private String organName;

    /**
     * 股权比例
     */
    @Excel(name = "股权比例（%）")
    private BigDecimal equityRatio;

    /**
     * 项目总概算
     */
    @Excel(name = "项目总概算")
    private BigDecimal totalProjectBudget;

    /**
     * 实际总投资
     */
    @Excel(name = "实际总投资")
    private BigDecimal actualTotalInvestment;

    /**
     * 已到位资本金
     */
    @Excel(name = "已到位本金")
    private BigDecimal capitalInPlace;

    public FssBaseProjectInfo getFssBaseProjectInfo() {
        return fssBaseProjectInfo;
    }

    public void setFssBaseProjectInfo(FssBaseProjectInfo fssBaseProjectInfo) {
        this.fssBaseProjectInfo = fssBaseProjectInfo;
    }

    public List<FssBaseProjectTrack> getProjectTrackList() {
        return projectTrackList;
    }

    public void setProjectTrackList(List<FssBaseProjectTrack> projectTrackList) {
        this.projectTrackList = projectTrackList;
    }

    public List<FssBaseProjectChangeRecord> getChangeRecordList() {
        return changeRecordList;
    }

    public void setChangeRecordList(List<FssBaseProjectChangeRecord> changeRecordList) {
        this.changeRecordList = changeRecordList;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public FssBaseProjectCapitalInPlace getPlace() {
        return place;
    }

    public void setPlace(FssBaseProjectCapitalInPlace place) {
        this.place = place;
    }

    @Override
    public String getProjectAbbreviation() {
        return projectAbbreviation;
    }

    @Override
    public void setProjectAbbreviation(String projectAbbreviation) {
        this.projectAbbreviation = projectAbbreviation;
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
    public String getCommercianUnit() {
        return commercianUnit;
    }

    @Override
    public void setCommercianUnit(String commercianUnit) {
        this.commercianUnit = commercianUnit;
    }

    @Override
    public String getProjectCategory() {
        return projectCategory;
    }

    @Override
    public void setProjectCategory(String projectCategory) {
        this.projectCategory = projectCategory;
    }

    @Override
    public String getProjectStage() {
        return projectStage;
    }

    @Override
    public void setProjectStage(String projectStage) {
        this.projectStage = projectStage;
    }

    @Override
    public String getProvince() {
        return province;
    }

    @Override
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String getOrganName() {
        return organName;
    }

    @Override
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    @Override
    public BigDecimal getEquityRatio() {
        return equityRatio;
    }

    @Override
    public void setEquityRatio(BigDecimal equityRatio) {
        this.equityRatio = equityRatio;
    }

    @Override
    public BigDecimal getTotalProjectBudget() {
        return totalProjectBudget;
    }

    @Override
    public void setTotalProjectBudget(BigDecimal totalProjectBudget) {
        this.totalProjectBudget = totalProjectBudget;
    }

    @Override
    public BigDecimal getActualTotalInvestment() {
        return actualTotalInvestment;
    }

    @Override
    public void setActualTotalInvestment(BigDecimal actualTotalInvestment) {
        this.actualTotalInvestment = actualTotalInvestment;
    }

    @Override
    public BigDecimal getCapitalInPlace() {
        return capitalInPlace;
    }

    @Override
    public void setCapitalInPlace(BigDecimal capitalInPlace) {
        this.capitalInPlace = capitalInPlace;
    }
}
