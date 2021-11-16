package cn.com.personnel.ercp.pi.persistence.entity.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_base_bank_head_office")
public class FssBaseBankHeadOffice {
    /**
     * 银行总行ID
     */
    @Id
    @Column(name = "head_id")
    @GeneratedValue(generator = "JDBC")
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
     * 机构属性
     */
    @Column(name = "institutional_attributes")
    private String institutionalAttributes;

    /**
     * 说明
     */
    private String description;

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
     * 类别
     */
    private String category;

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

    /**
     * 获取机构属性
     *
     * @return institutional_attributes - 机构属性
     */
    public String getInstitutionalAttributes() {
        return institutionalAttributes;
    }

    /**
     * 设置机构属性
     *
     * @param institutionalAttributes 机构属性
     */
    public void setInstitutionalAttributes(String institutionalAttributes) {
        this.institutionalAttributes = institutionalAttributes;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}