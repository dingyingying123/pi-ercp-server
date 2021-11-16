package cn.com.personnel.ercp.pi.persistence.entity.bankCredit;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bank_occupy_use_details")
public class FssBankOccupyUseDetails {
    /**
     * 主键
     */
    @Column(name = "fboud_id")
    @GeneratedValue(generator = "JDBC")
    private String fboudId;

    /**
     * 业务类型
     */
    @Column(name = "business_type")
    private String businessType;

    /**
     * 授信主体
     */
    @Column(name = "credit_ccupier")
    private String creditCcupier;

    /**
     * 业务单元
     */
    @Column(name = "business_name")
    private String businessName;

    /**
     * 业务单元编号
     */
    @Column(name = "business_code")
    private String businessCode;

    /**
     * 业务单元id
     */
    @Column(name = "business_id")
    private String businessId;

    /**
     * 公司名称
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 公司id
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 合同文本编号
     */
    @Column(name = "contract_code")
    private String contractCode;

    /**
     * 开立银行总行名称
     */
    @Column(name = "head_name")
    private String headName;

    /**
     * 开立银行总行编码
     */
    @Column(name = "head_code")
    private String headCode;

    /**
     * 开立银行总行ID
     */
    @Column(name = "head_id")
    private String headId;

    /**
     * 种类
     */
    private String type;

    /**
     * 授信品种
     */
    @Column(name = "credit_varieties")
    private String creditVarieties;

    /**
     * 授信品种字典项ID
     */
    @Column(name = "credit_varieties_id")
    private String creditVarietiesId;

    /**
     * 币种
     */
    @Column(name = "currency_name")
    private String currencyName;

    /**
     * 币种编码
     */
    @Column(name = "currency_code")
    private String currencyCode;

    /**
     * 币种id
     */
    @Column(name = "currency_id")
    private String currencyId;

    /**
     * 占用额度
     */
    @Column(name = "occupy_quota")
    private BigDecimal occupyQuota;

    /**
     * 折合人命币金额-占用额度
     */
    @Column(name = "convert_occupy_quota")
    private BigDecimal convertOccupyQuota;

    /**
     * 使用额度
     */
    @Column(name = "use_quota")
    private BigDecimal useQuota;

    /**
     * 折合人民币金额-使用额度
     */
    @Column(name = "convert_use_quota")
    private BigDecimal convertUseQuota;

    /**
     * 生效日期
     */
    @Column(name = "`effective date`")
    private Date effectiveDate;

    /**
     * 截止日期
     */
    @Column(name = "deadline_date")
    private Date deadlineDate;

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
     * 是否可用
     */
    private String active;

    /**
     * 获取主键
     *
     * @return fboud_id - 主键
     */
    public String getFboudId() {
        return fboudId;
    }

    /**
     * 设置主键
     *
     * @param fboudId 主键
     */
    public void setFboudId(String fboudId) {
        this.fboudId = fboudId;
    }

    /**
     * 获取业务类型
     *
     * @return business_type - 业务类型
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 设置业务类型
     *
     * @param businessType 业务类型
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    /**
     * 获取授信主体
     *
     * @return credit_ccupier - 授信主体
     */
    public String getCreditCcupier() {
        return creditCcupier;
    }

    /**
     * 设置授信主体
     *
     * @param creditCcupier 授信主体
     */
    public void setCreditCcupier(String creditCcupier) {
        this.creditCcupier = creditCcupier;
    }

    /**
     * 获取业务单元
     *
     * @return business_name - 业务单元
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * 设置业务单元
     *
     * @param businessName 业务单元
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * 获取业务单元编号
     *
     * @return business_code - 业务单元编号
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * 设置业务单元编号
     *
     * @param businessCode 业务单元编号
     */
    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    /**
     * 获取业务单元id
     *
     * @return business_id - 业务单元id
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * 设置业务单元id
     *
     * @param businessId 业务单元id
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    /**
     * 获取公司名称
     *
     * @return organ_name - 公司名称
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * 设置公司名称
     *
     * @param organName 公司名称
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * 获取公司id
     *
     * @return organ_id - 公司id
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置公司id
     *
     * @param organId 公司id
     */
    public void setOrganId(String organId) {
        this.organId = organId;
    }

    /**
     * 获取合同名称
     *
     * @return contract_name - 合同名称
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * 设置合同名称
     *
     * @param contractName 合同名称
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * 获取合同文本编号
     *
     * @return contract_code - 合同文本编号
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置合同文本编号
     *
     * @param contractCode 合同文本编号
     */
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    /**
     * 获取开立银行总行名称
     *
     * @return head_name - 开立银行总行名称
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * 设置开立银行总行名称
     *
     * @param headName 开立银行总行名称
     */
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    /**
     * 获取开立银行总行编码
     *
     * @return head_code - 开立银行总行编码
     */
    public String getHeadCode() {
        return headCode;
    }

    /**
     * 设置开立银行总行编码
     *
     * @param headCode 开立银行总行编码
     */
    public void setHeadCode(String headCode) {
        this.headCode = headCode;
    }

    /**
     * 获取开立银行总行ID
     *
     * @return head_id - 开立银行总行ID
     */
    public String getHeadId() {
        return headId;
    }

    /**
     * 设置开立银行总行ID
     *
     * @param headId 开立银行总行ID
     */
    public void setHeadId(String headId) {
        this.headId = headId;
    }

    /**
     * 获取种类
     *
     * @return type - 种类
     */
    public String getType() {
        return type;
    }

    /**
     * 设置种类
     *
     * @param type 种类
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取授信品种
     *
     * @return credit_varieties - 授信品种
     */
    public String getCreditVarieties() {
        return creditVarieties;
    }

    /**
     * 设置授信品种
     *
     * @param creditVarieties 授信品种
     */
    public void setCreditVarieties(String creditVarieties) {
        this.creditVarieties = creditVarieties;
    }

    /**
     * 获取授信品种字典项ID
     *
     * @return credit_varieties_id - 授信品种字典项ID
     */
    public String getCreditVarietiesId() {
        return creditVarietiesId;
    }

    /**
     * 设置授信品种字典项ID
     *
     * @param creditVarietiesId 授信品种字典项ID
     */
    public void setCreditVarietiesId(String creditVarietiesId) {
        this.creditVarietiesId = creditVarietiesId;
    }

    /**
     * 获取币种
     *
     * @return currency_name - 币种
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * 设置币种
     *
     * @param currencyName 币种
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /**
     * 获取币种编码
     *
     * @return currency_code - 币种编码
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置币种编码
     *
     * @param currencyCode 币种编码
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * 获取币种id
     *
     * @return currency_id - 币种id
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * 设置币种id
     *
     * @param currencyId 币种id
     */
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * 获取占用额度
     *
     * @return occupy_quota - 占用额度
     */
    public BigDecimal getOccupyQuota() {
        return occupyQuota;
    }

    /**
     * 设置占用额度
     *
     * @param occupyQuota 占用额度
     */
    public void setOccupyQuota(BigDecimal occupyQuota) {
        this.occupyQuota = occupyQuota;
    }

    /**
     * 获取折合人命币金额-占用额度
     *
     * @return convert_occupy_quota - 折合人命币金额-占用额度
     */
    public BigDecimal getConvertOccupyQuota() {
        return convertOccupyQuota;
    }

    /**
     * 设置折合人命币金额-占用额度
     *
     * @param convertOccupyQuota 折合人命币金额-占用额度
     */
    public void setConvertOccupyQuota(BigDecimal convertOccupyQuota) {
        this.convertOccupyQuota = convertOccupyQuota;
    }

    /**
     * 获取使用额度
     *
     * @return use_quota - 使用额度
     */
    public BigDecimal getUseQuota() {
        return useQuota;
    }

    /**
     * 设置使用额度
     *
     * @param useQuota 使用额度
     */
    public void setUseQuota(BigDecimal useQuota) {
        this.useQuota = useQuota;
    }

    /**
     * 获取折合人民币金额-使用额度
     *
     * @return convert_use_quota - 折合人民币金额-使用额度
     */
    public BigDecimal getConvertUseQuota() {
        return convertUseQuota;
    }

    /**
     * 设置折合人民币金额-使用额度
     *
     * @param convertUseQuota 折合人民币金额-使用额度
     */
    public void setConvertUseQuota(BigDecimal convertUseQuota) {
        this.convertUseQuota = convertUseQuota;
    }

    /**
     * 获取生效日期
     *
     * @return effective date - 生效日期
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置生效日期
     *
     * @param effectiveDate 生效日期
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * 获取截止日期
     *
     * @return deadline_date - 截止日期
     */
    public Date getDeadlineDate() {
        return deadlineDate;
    }

    /**
     * 设置截止日期
     *
     * @param deadlineDate 截止日期
     */
    public void setDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
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
     * 获取是否可用
     *
     * @return active - 是否可用
     */
    public String getActive() {
        return active;
    }

    /**
     * 设置是否可用
     *
     * @param active 是否可用
     */
    public void setActive(String active) {
        this.active = active;
    }
}