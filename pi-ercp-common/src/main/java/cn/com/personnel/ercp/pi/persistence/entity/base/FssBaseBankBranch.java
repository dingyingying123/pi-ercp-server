package cn.com.personnel.ercp.pi.persistence.entity.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_base_bank_branch")
public class FssBaseBankBranch {
    /**
     * 银行分行主键ID
     */
    @Id
    @Column(name = "branch_id")
    @GeneratedValue(generator = "JDBC")
    private String branchId;

    /**
     * 总行ID
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
     * 银行分行编码
     */
    @Column(name = "branch_code")
    private String branchCode;

    /**
     * 银行分行名称
     */
    @Column(name = "branch_name")
    private String branchName;

    /**
     * 说明
     */
    private String description;

    /**
     * 启动状态，0启用，1禁用
     */
    private String status;

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
     * 供应商名称
     */
    @Column(name = "lifnr_text")
    private String lifnrText;

    /**
     * 供应商编码
     */
    private String lifnr;

    /**
     * 支行名称
     */
    private String subbranch;

    /**
     * 支行编码
     */
    @Column(name = "subbranch_code")
    private String subbranchCode;

    /**
     * 支行编码
     */
    @Column(name = "whole_name")
    private String wholeName;

    /**
     * 获取银行总行ID
     *
     * @return branch_id - 银行总行ID
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * 设置银行总行ID
     *
     * @param branchId 银行总行ID
     */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    /**
     * 获取总行ID
     *
     * @return head_id - 总行ID
     */
    public String getHeadId() {
        return headId;
    }

    /**
     * 设置总行ID
     *
     * @param headId 总行ID
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

    /**
     * 获取银行分行编码
     *
     * @return branch_code - 银行分行编码
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * 设置银行分行编码
     *
     * @param branchCode 银行分行编码
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    /**
     * 获取银行分行名称
     *
     * @return branch_name - 银行分行名称
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * 设置银行分行名称
     *
     * @param branchName 银行分行名称
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * 获取说明
     *
     * @return description - 说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置说明
     *
     * @param description 说明
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取启动状态，0启用，1禁用
     *
     * @return status - 启动状态，0启用，1禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置启动状态，0启用，1禁用
     *
     * @param status 启动状态，0启用，1禁用
     */
    public void setStatus(String status) {
        this.status = status;
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

    public String getLifnrText() {
        return lifnrText;
    }

    public void setLifnrText(String lifnrText) {
        this.lifnrText = lifnrText;
    }

    public String getLifnr() {
        return lifnr;
    }

    public void setLifnr(String lifnr) {
        this.lifnr = lifnr;
    }

    public String getSubbranch() {
        return subbranch;
    }

    public void setSubbranch(String subbranch) {
        this.subbranch = subbranch;
    }

    public String getSubbranchCode() {
        return subbranchCode;
    }

    public void setSubbranchCode(String subbranchCode) {
        this.subbranchCode = subbranchCode;
    }

    public String getWholeName() {
        return wholeName;
    }

    public void setWholeName(String wholeName) {
        this.wholeName = wholeName;
    }
}