package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_bank_authorization")
public class FssBaseBankAuthorization {
    /**
     * 银行授权ID
     */
    @Id
    @Column(name = "auth_id")
    @GeneratedValue(generator = "JDBC")
    private String authId;

    /**
     * 总行ID
     */
    @Column(name = "head_id")
    private String headId;

    /**
     * 分行ID
     */
    @Column(name = "branch_id")
    private String branchId;

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
     * 所属组织id
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 所属组织名称
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 贷款机构全称
     */
    @Column(name = "auth_name")
    private String authName;

    /**
     * 说明
     */
    private String description;

    /**
     * 启动状态
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
     * 获取银行授权ID
     *
     * @return auth_id - 银行授权ID
     */
    public String getAuthId() {
        return authId;
    }

    /**
     * 设置银行授权ID
     *
     * @param authId 银行授权ID
     */
    public void setAuthId(String authId) {
        this.authId = authId;
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
     * 获取分行ID
     *
     * @return branch_id - 分行ID
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * 设置分行ID
     *
     * @param branchId 分行ID
     */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
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
     * 获取所属组织id
     *
     * @return organ_id - 所属组织id
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置所属组织id
     *
     * @param organId 所属组织id
     */
    public void setOrganId(String organId) {
        this.organId = organId;
    }

    /**
     * 获取所属组织名称
     *
     * @return organ_name - 所属组织名称
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * 设置所属组织名称
     *
     * @param organName 所属组织名称
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * 获取贷款机构全称
     *
     * @return auth_name - 贷款机构全称
     */
    public String getAuthName() {
        return authName;
    }

    /**
     * 设置贷款机构全称
     *
     * @param authName 贷款机构全称
     */
    public void setAuthName(String authName) {
        this.authName = authName;
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
     * 获取启动状态
     *
     * @return status - 启动状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置启动状态
     *
     * @param status 启动状态
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
}