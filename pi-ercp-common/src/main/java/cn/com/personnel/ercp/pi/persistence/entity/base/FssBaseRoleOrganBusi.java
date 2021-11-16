package cn.com.personnel.ercp.pi.persistence.entity.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_base_role_organ_busi")
public class FssBaseRoleOrganBusi {
    /**
     * 组织业务单元授权ID
     */
    @Id
    @Column(name = "rob_id")
    @GeneratedValue(generator = "JDBC")
    private String robId;

    private String mandt;

    /**
     * 组织授权ID
     */
    @Column(name = "ro_id")
    private String roId;

    /**
     * 业务单元编码
     */
    private String busi;

    /**
     * 业务单元编码
     */
    @Column(name = "busi_text")
    private String busiText;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 组织编码，公司编码
     */
    private String bukrs;

    /**
     * 组织名称，公司名称
     */
    private String butxt;

    /**
     * 组织全称，公司全称
     */
    @Column(name = "full_name")
    private String fullName;

    /**
     * 区域编码
     */
    @Column(name = "com_domain_tr")
    private String comDomainTr;

    /**
     * 区域名称
     */
    @Column(name = "domain_text")
    private String domainText;

    /**
     * 是否注销
     */
    @Column(name = "zz_invalid")
    private String zzInvalid;

    /**
     * 是否纳入合并
     */
    @Column(name = "zz_inclusion")
    private String zzInclusion;

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
     * 修改人
     */
    private String updator;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除，0未删除，1已删除
     */
    private String deleted;

    /**
     * 获取组织业务单元授权ID
     *
     * @return rob_id - 组织业务单元授权ID
     */
    public String getRobId() {
        return robId;
    }

    /**
     * 设置组织业务单元授权ID
     *
     * @param robId 组织业务单元授权ID
     */
    public void setRobId(String robId) {
        this.robId = robId;
    }

    /**
     * @return mandt
     */
    public String getMandt() {
        return mandt;
    }

    /**
     * @param mandt
     */
    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    /**
     * 获取组织授权ID
     *
     * @return ro_id - 组织授权ID
     */
    public String getRoId() {
        return roId;
    }

    /**
     * 设置组织授权ID
     *
     * @param roId 组织授权ID
     */
    public void setRoId(String roId) {
        this.roId = roId;
    }

    /**
     * 获取业务单元编码
     *
     * @return busi - 业务单元编码
     */
    public String getBusi() {
        return busi;
    }

    /**
     * 设置业务单元编码
     *
     * @param busi 业务单元编码
     */
    public void setBusi(String busi) {
        this.busi = busi;
    }

    /**
     * 获取业务单元编码
     *
     * @return busi_text - 业务单元编码
     */
    public String getBusiText() {
        return busiText;
    }

    /**
     * 设置业务单元编码
     *
     * @param busiText 业务单元编码
     */
    public void setBusiText(String busiText) {
        this.busiText = busiText;
    }

    /**
     * 获取角色ID
     *
     * @return role_id - 角色ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取组织编码，公司编码
     *
     * @return bukrs - 组织编码，公司编码
     */
    public String getBukrs() {
        return bukrs;
    }

    /**
     * 设置组织编码，公司编码
     *
     * @param bukrs 组织编码，公司编码
     */
    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    /**
     * 获取组织名称，公司名称
     *
     * @return butxt - 组织名称，公司名称
     */
    public String getButxt() {
        return butxt;
    }

    /**
     * 设置组织名称，公司名称
     *
     * @param butxt 组织名称，公司名称
     */
    public void setButxt(String butxt) {
        this.butxt = butxt;
    }

    /**
     * 获取组织全称，公司全称
     *
     * @return full_name - 组织全称，公司全称
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置组织全称，公司全称
     *
     * @param fullName 组织全称，公司全称
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 获取区域编码
     *
     * @return com_domain_tr - 区域编码
     */
    public String getComDomainTr() {
        return comDomainTr;
    }

    /**
     * 设置区域编码
     *
     * @param comDomainTr 区域编码
     */
    public void setComDomainTr(String comDomainTr) {
        this.comDomainTr = comDomainTr;
    }

    /**
     * 获取区域名称
     *
     * @return domain_text - 区域名称
     */
    public String getDomainText() {
        return domainText;
    }

    /**
     * 设置区域名称
     *
     * @param domainText 区域名称
     */
    public void setDomainText(String domainText) {
        this.domainText = domainText;
    }

    /**
     * 获取是否注销
     *
     * @return zz_invalid - 是否注销
     */
    public String getZzInvalid() {
        return zzInvalid;
    }

    /**
     * 设置是否注销
     *
     * @param zzInvalid 是否注销
     */
    public void setZzInvalid(String zzInvalid) {
        this.zzInvalid = zzInvalid;
    }

    /**
     * 获取是否纳入合并
     *
     * @return zz_inclusion - 是否纳入合并
     */
    public String getZzInclusion() {
        return zzInclusion;
    }

    /**
     * 设置是否纳入合并
     *
     * @param zzInclusion 是否纳入合并
     */
    public void setZzInclusion(String zzInclusion) {
        this.zzInclusion = zzInclusion;
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
     * 获取修改人
     *
     * @return updator - 修改人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置修改人
     *
     * @param updator 修改人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除，0未删除，1已删除
     *
     * @return deleted - 是否删除，0未删除，1已删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除，0未删除，1已删除
     *
     * @param deleted 是否删除，0未删除，1已删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}