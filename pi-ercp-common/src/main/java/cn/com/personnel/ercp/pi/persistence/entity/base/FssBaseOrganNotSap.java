package cn.com.personnel.ercp.pi.persistence.entity.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_base_organ_not_sap")
public class FssBaseOrganNotSap {
    /**
     * 非SAP公司ID
     */
    @Id
    @Column(name = "organ_id")
    @GeneratedValue(generator = "JDBC")
    private String organId;

    /**
     * 公司编码
     */
    private String bukrs;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 公司全称
     */
    @Column(name = "full_name")
    private String fullName;

    /**
     * 币种
     */
    private String waers;

    /**
     * 业务单元
     */
    private String busi;

    /**
     * 业务单元名称
     */
    private String busitext;

    /**
     * 区域编码
     */
    @Column(name = "com_domain_tr")
    private String comDomainTr;

    /**
     * 区域名称
     */
    private String domaintext;

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
     * 预留
     */
    private String reserve;

    /**
     * 状态
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
     * 获取非SAP公司ID
     *
     * @return organ_id - 非SAP公司ID
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置非SAP公司ID
     *
     * @param organId 非SAP公司ID
     */
    public void setOrganId(String organId) {
        this.organId = organId;
    }

    /**
     * 获取公司编码
     *
     * @return bukrs - 公司编码
     */
    public String getBukrs() {
        return bukrs;
    }

    /**
     * 设置公司编码
     *
     * @param bukrs 公司编码
     */
    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    /**
     * 获取公司名称
     *
     * @return name - 公司名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置公司名称
     *
     * @param name 公司名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取公司全称
     *
     * @return full_name - 公司全称
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置公司全称
     *
     * @param fullName 公司全称
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 获取币种
     *
     * @return waers - 币种
     */
    public String getWaers() {
        return waers;
    }

    /**
     * 设置币种
     *
     * @param waers 币种
     */
    public void setWaers(String waers) {
        this.waers = waers;
    }

    /**
     * 获取业务单元
     *
     * @return busi - 业务单元
     */
    public String getBusi() {
        return busi;
    }

    /**
     * 设置业务单元
     *
     * @param busi 业务单元
     */
    public void setBusi(String busi) {
        this.busi = busi;
    }

    /**
     * 获取业务单元名称
     *
     * @return busitext - 业务单元名称
     */
    public String getBusitext() {
        return busitext;
    }

    /**
     * 设置业务单元名称
     *
     * @param busitext 业务单元名称
     */
    public void setBusitext(String busitext) {
        this.busitext = busitext;
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
     * @return domaintext - 区域名称
     */
    public String getDomaintext() {
        return domaintext;
    }

    /**
     * 设置区域名称
     *
     * @param domaintext 区域名称
     */
    public void setDomaintext(String domaintext) {
        this.domaintext = domaintext;
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
     * 获取预留
     *
     * @return reserve - 预留
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * 设置预留
     *
     * @param reserve 预留
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
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