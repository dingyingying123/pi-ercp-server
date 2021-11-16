package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_contract_subject")
public class FssBaseContractSubject {
    @GeneratedValue(generator = "JDBC")
    @Id
    private String subjectId;

    /**
     * 合同类型编码
     */
    @Column(name = "contracttype_code")
    private String contracttypeCode;

    /**
     * 合同类型名称
     */
    @Transient
    private String contracttypeName;

    /**
     * 业务类型编码
     */
    @Column(name = "business_type")
    private String businessType;

    /**
     * 业务类型名称
     */
    @Transient
    private String businessTypeName;

    /**
     * 借/贷
     */
    private String loan;

    /**
     * 金额类型编码
     */
    @Column(name = "amount_type")
    private String amountType;

    /**
     * 金额类型名称
     */
    @Transient
    private String amountTypeName;

    /**
     * 科目说明
     */
    @Column(name = "subject_des")
    private String subjectDes;

    /**
     * 现金预算使用科目
     */
    @Column(name = "budget_subject")
    private String budgetSubject;

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
     * @return id
     */
    public String getSubjectId() {
        return subjectId;
    }

    /**
     * @param subjectId
     */
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * 获取合同类型编码
     *
     * @return contracttype_code - 合同类型编码
     */
    public String getContracttypeCode() {
        return contracttypeCode;
    }

    /**
     * 设置合同类型编码
     *
     * @param contracttypeCode 合同类型编码
     */
    public void setContracttypeCode(String contracttypeCode) {
        this.contracttypeCode = contracttypeCode;
    }

    /**
     * 获取业务类型编码
     *
     * @return business_type - 业务类型编码
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 设置业务类型编码
     *
     * @param businessType 业务类型编码
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    /**
     * 获取借/贷
     *
     * @return loan - 借/贷
     */
    public String getLoan() {
        return loan;
    }

    /**
     * 设置借/贷
     *
     * @param loan 借/贷
     */
    public void setLoan(String loan) {
        this.loan = loan;
    }

    /**
     * 获取金额类型编码
     *
     * @return amount_type - 金额类型编码
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * 设置金额类型编码
     *
     * @param amountType 金额类型编码
     */
    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    /**
     * 获取科目说明
     *
     * @return subject_des - 科目说明
     */
    public String getSubjectDes() {
        return subjectDes;
    }

    /**
     * 设置科目说明
     *
     * @param subjectDes 科目说明
     */
    public void setSubjectDes(String subjectDes) {
        this.subjectDes = subjectDes;
    }

    /**
     * 获取现金预算使用科目
     *
     * @return budget_subject - 现金预算使用科目
     */
    public String getBudgetSubject() {
        return budgetSubject;
    }

    /**
     * 设置现金预算使用科目
     *
     * @param budgetSubject 现金预算使用科目
     */
    public void setBudgetSubject(String budgetSubject) {
        this.budgetSubject = budgetSubject;
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

    public String getContracttypeName() {
        return contracttypeName;
    }

    public void setContracttypeName(String contracttypeName) {
        this.contracttypeName = contracttypeName;
    }

    public String getBusinessTypeName() {
        return businessTypeName;
    }

    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
    }

    public String getAmountTypeName() {
        return amountTypeName;
    }

    public void setAmountTypeName(String amountTypeName) {
        this.amountTypeName = amountTypeName;
    }
}