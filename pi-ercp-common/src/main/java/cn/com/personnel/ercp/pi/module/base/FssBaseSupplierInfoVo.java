package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseSupplierInfo;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;

public class FssBaseSupplierInfoVo extends FssBaseSupplierInfo {
    private List<String> ids;
    /**
     * 供应商名称
     */
    @Excel(name = "供应商名称")
    private String supplierName;

    /**
     * 银行名称
     */
    @Excel(name = "银行名称")
    private String bankName;

    /**
     * 银行账号
     */
    @Excel(name = "银行账号")
    private String bankAccount;
    /**
     * 备注
     */
    @Excel(name = "备注")
    private String remark;

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String getSupplierName() {
        return supplierName;
    }

    @Override
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
