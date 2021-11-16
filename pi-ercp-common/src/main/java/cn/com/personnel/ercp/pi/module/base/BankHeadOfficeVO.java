package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseBankHeadOffice;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;

public class BankHeadOfficeVO extends FssBaseBankHeadOffice {
    private List<String> ids;
    /**
     * 银行总行编码，贷款机构编码
     */
    @Excel(name = "贷款机构编码")
    private String headCode;

    /**
     * 银行总行名称，贷款机构名称（总行）
     */
    @Excel(name = "贷款机构名称")
    private String headName;

    /**
     * 机构属性
     */
    @Excel(name = "机构属性")
    private String institutionalAttributes;

    /**
     * 说明
     */
    @Excel(name = "说明")
    private String description;

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String getHeadCode() {
        return headCode;
    }

    @Override
    public void setHeadCode(String headCode) {
        this.headCode = headCode;
    }

    @Override
    public String getHeadName() {
        return headName;
    }

    @Override
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    @Override
    public String getInstitutionalAttributes() {
        return institutionalAttributes;
    }

    @Override
    public void setInstitutionalAttributes(String institutionalAttributes) {
        this.institutionalAttributes = institutionalAttributes;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
