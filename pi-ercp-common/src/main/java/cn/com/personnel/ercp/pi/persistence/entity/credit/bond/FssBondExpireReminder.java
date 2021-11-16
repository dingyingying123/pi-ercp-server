package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import java.math.BigDecimal;
import java.util.Date;

public class FssBondExpireReminder {
    private String commercianUnit;//业务单元
    private String headName;//主承销商
    private String organName;//公司名称
    private String bondName;//债券名称
    private Date planDate;//计划还款日期
    private int days;//到期天数
    private BigDecimal planRepaymentAmount;//计划还本金额
    private BigDecimal planInterestPayAmount;//计划付息金额

    public String getCommercianUnit() {
        return commercianUnit;
    }

    public void setCommercianUnit(String commercianUnit) {
        this.commercianUnit = commercianUnit;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getBondName() {
        return bondName;
    }

    public void setBondName(String bondName) {
        this.bondName = bondName;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public BigDecimal getPlanRepaymentAmount() {
        return planRepaymentAmount;
    }

    public void setPlanRepaymentAmount(BigDecimal planRepaymentAmount) {
        this.planRepaymentAmount = planRepaymentAmount;
    }

    public BigDecimal getPlanInterestPayAmount() {
        return planInterestPayAmount;
    }

    public void setPlanInterestPayAmount(BigDecimal planInterestPayAmount) {
        this.planInterestPayAmount = planInterestPayAmount;
    }
}
