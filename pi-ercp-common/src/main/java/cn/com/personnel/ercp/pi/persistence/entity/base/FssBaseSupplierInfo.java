package cn.com.personnel.ercp.pi.persistence.entity.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_base_supplier_info")
public class FssBaseSupplierInfo {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 供应商名称
     */
    @Column(name = "supplier_name")
    private String supplierName;
    /**
     * 供应商的公司编码
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 银行名称
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 银行账号
     */
    @Column(name = "bank_account")
    private String bankAccount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新者
     */
    private String updater;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 银行总行ID
     */
    @Column(name = "head_id")
    private String headId;

    /**
     * 银行总行编码，贷款机构编码
     */
    @Column(name = "head_code")
    private String headCode;

    /**
     * 银行总行名称，贷款机构名称（总行）
     */
    @Column(name = "head_name")
    private String headName;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取供应商名称
     *
     * @return supplier_name - 供应商名称
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置供应商名称
     *
     * @param supplierName 供应商名称
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * 获取银行名称
     *
     * @return bank_name - 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名称
     *
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取银行账号
     *
     * @return bank_account - 银行账号
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 设置银行账号
     *
     * @param bankAccount 银行账号
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建者
     *
     * @return creator - 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator 创建者
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
     * 获取更新者
     *
     * @return updater - 更新者
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设置更新者
     *
     * @param updater 更新者
     */
    public void setUpdater(String updater) {
        this.updater = updater;
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
     * 获取银行总行ID
     *
     * @return head_id - 银行总行ID
     */
    public String getHeadId() {
        return headId;
    }

    /**
     * 设置银行总行ID
     *
     * @param headId 银行总行ID
     */
    public void setHeadId(String headId) {
        this.headId = headId;
    }

    /**
     * 获取银行总行编码，贷款机构编码
     *
     * @return head_code - 银行总行编码，贷款机构编码
     */
    public String getHeadCode() {
        return headCode;
    }

    /**
     * 设置银行总行编码，贷款机构编码
     *
     * @param headCode 银行总行编码，贷款机构编码
     */
    public void setHeadCode(String headCode) {
        this.headCode = headCode;
    }

    /**
     * 获取银行总行名称，贷款机构名称（总行）
     *
     * @return head_name - 银行总行名称，贷款机构名称（总行）
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * 设置银行总行名称，贷款机构名称（总行）
     *
     * @param headName 银行总行名称，贷款机构名称（总行）
     */
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
