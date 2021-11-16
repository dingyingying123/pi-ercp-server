package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.sap.T001;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;

/**
 * 利率库导出Excel
 */
public class BankRateExcel extends T001 {

    /**
     * 利率类型代码
     */
    @Excel(name = "利率代码类型")
    private String interestTypeCode;

    /**
     * 利率类型名称
     */
    @Excel(name = "利率类型名称")
    private String interestTypeName;

    /**
     * 生效日期
     */
    @Excel(name = "生效日期")
    private String effectDate;

    /**
     * 年利率
     */
    @Excel(name = "年利率(%)")
    private String annualInterestRate;

    /**
     * 导出选中数据
     */
    private List<String> ids;

    public String getInterestTypeCode() {
        return interestTypeCode;
    }

    public void setInterestTypeCode(String interestTypeCode) {
        this.interestTypeCode = interestTypeCode;
    }

    public String getInterestTypeName() {
        return interestTypeName;
    }

    public void setInterestTypeName(String interestTypeName) {
        this.interestTypeName = interestTypeName;
    }

    public String getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(String effectDate) {
        this.effectDate = effectDate;
    }

    public String getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(String annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
