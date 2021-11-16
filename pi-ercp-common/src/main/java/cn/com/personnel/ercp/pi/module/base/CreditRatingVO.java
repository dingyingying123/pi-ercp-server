package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseCreditRatingMaintain;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;

public class CreditRatingVO extends FssBaseCreditRatingMaintain {
    @Excel(name = "公司名称")
    private String organName;
    @Excel(name = "评级类型")
    private String ratingType;
    @Excel(name = "评级机构")
    private String headName;
    /**
     * 信用级别
     */
    @Excel(name = "信用级别")
    private String creditGrade;

    /**
     * 生效日期
     */
    @Excel(name = "生效日期")
    private String effectiveDate;

    /**
     * 失效日期
     */
    @Excel(name = "失效日期")
    private String expirationDate;

    /**
     * 备注
     */
    @Excel(name = "备注")
    private String description;
    private List<FssBaseCreditRatingMaintain> maintainList;
    private List<String> ids;

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getRatingType() {
        return ratingType;
    }

    public void setRatingType(String ratingType) {
        this.ratingType = ratingType;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public List<FssBaseCreditRatingMaintain> getMaintainList() {
        return maintainList;
    }

    public void setMaintainList(List<FssBaseCreditRatingMaintain> maintainList) {
        this.maintainList = maintainList;
    }

    @Override
    public String getCreditGrade() {
        return creditGrade;
    }

    @Override
    public void setCreditGrade(String creditGrade) {
        this.creditGrade = creditGrade;
    }

    @Override
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @Override
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Override
    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
