package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_report_work_tax_company_proportion")
public class FssReportWorkTaxCompanyProportion {
    /**
     * 报税公司比例ID
     */
    @Id
    @Column(name = "cp_id")
    @GeneratedValue(generator = "JDBC")
    private String cpId;

    /**
     * 报税月份ID
     */
    @Column(name = "month_id")
    private String monthId;

    /**
     * 可用公司ID
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 可用公司编码
     */
    @Column(name = "company_code")
    private String companyCode;

    /**
     * 可用公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 可用公司报税比例
     */
    private BigDecimal proportion;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新人
     */
    private String updator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取报税公司比例ID
     *
     * @return cp_id - 报税公司比例ID
     */
    public String getCpId() {
        return cpId;
    }

    /**
     * 设置报税公司比例ID
     *
     * @param cpId 报税公司比例ID
     */
    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    /**
     * 获取报税月份ID
     *
     * @return month_id - 报税月份ID
     */
    public String getMonthId() {
        return monthId;
    }

    /**
     * 设置报税月份ID
     *
     * @param monthId 报税月份ID
     */
    public void setMonthId(String monthId) {
        this.monthId = monthId;
    }

    /**
     * 获取可用公司ID
     *
     * @return company_id - 可用公司ID
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置可用公司ID
     *
     * @param companyId 可用公司ID
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取可用公司编码
     *
     * @return company_code - 可用公司编码
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 设置可用公司编码
     *
     * @param companyCode 可用公司编码
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 获取可用公司名称
     *
     * @return company_name - 可用公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置可用公司名称
     *
     * @param companyName 可用公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取可用公司报税比例
     *
     * @return proportion - 可用公司报税比例
     */
    public BigDecimal getProportion() {
        return proportion;
    }

    /**
     * 设置可用公司报税比例
     *
     * @param proportion 可用公司报税比例
     */
    public void setProportion(BigDecimal proportion) {
        this.proportion = proportion;
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
     * 获取更新人
     *
     * @return updator - 更新人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置更新人
     *
     * @param updator 更新人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
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
}