package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseBankBranch;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;

public class FssBaseBankBranchVO extends FssBaseBankBranch {
    private List<String> ids;

    /**
        * 银行总行编码，贷款机构编码
     */
    @Excel(name = "总行编码")
    private String headCode;

    /**
     * 银行总行名称，贷款机构名称（总行）
     */
    @Excel(name = "总行名称")
    private String headName;

    /**
     * 银行分行编码
     */
    @Excel(name = "分行编码")
    private String branchCode;

    /**
     * 银行分行名称
     */
    @Excel(name = "分行名称")
    private String branchName;

    /**
     * 说明
     */
    @Excel(name = "说明")
    private String description;

    /**
     * 启动状态，0启用，1禁用
     */
    @Excel(name = "启用状态")
    private String status;

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
    public String getBranchCode() {
        return branchCode;
    }

    @Override
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    @Override
    public String getBranchName() {
        return branchName;
    }

    @Override
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
