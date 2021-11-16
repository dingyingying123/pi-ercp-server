package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseContractSubject;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;

public class FssBaseContractSubjectVO extends FssBaseContractSubject {
    private List<String> ids;
    /**
     * 合同类型编码
     */
    @Excel(name = "合同类型编码")
    private String contracttypeCode;

    /**
     * 合同类型名称
     */
    @Excel(name = "合同类型名称")
    private String contracttypeName;

    /**
     * 业务类型名称
     */
    @Excel(name = "业务类型")
    private String businessTypeName;

    /**
     * 借/贷
     */
    @Excel(name = "借/贷")
    private String loan;

    /**
     * 金额类型名称
     */
    @Excel(name = "金额类型")
    private String amountTypeName;

    /**
     * 科目说明
     */
    @Excel(name = "科目说明")
    private String subjectDes;

    /**
     * 现金预算使用科目
     */
    @Excel(name = "现金预算使用科目")
    private String budgetSubject;

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String getContracttypeCode() {
        return contracttypeCode;
    }

    @Override
    public void setContracttypeCode(String contracttypeCode) {
        this.contracttypeCode = contracttypeCode;
    }

    @Override
    public String getContracttypeName() {
        return contracttypeName;
    }

    @Override
    public void setContracttypeName(String contracttypeName) {
        this.contracttypeName = contracttypeName;
    }

    @Override
    public String getBusinessTypeName() {
        return businessTypeName;
    }

    @Override
    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
    }

    @Override
    public String getLoan() {
        return loan;
    }

    @Override
    public void setLoan(String loan) {
        this.loan = loan;
    }

    @Override
    public String getAmountTypeName() {
        return amountTypeName;
    }

    @Override
    public void setAmountTypeName(String amountTypeName) {
        this.amountTypeName = amountTypeName;
    }

    @Override
    public String getSubjectDes() {
        return subjectDes;
    }

    @Override
    public void setSubjectDes(String subjectDes) {
        this.subjectDes = subjectDes;
    }

    @Override
    public String getBudgetSubject() {
        return budgetSubject;
    }

    @Override
    public void setBudgetSubject(String budgetSubject) {
        this.budgetSubject = budgetSubject;
    }
}
