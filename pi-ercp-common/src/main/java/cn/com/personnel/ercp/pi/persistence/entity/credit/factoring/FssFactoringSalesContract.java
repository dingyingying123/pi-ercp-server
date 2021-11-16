package cn.com.personnel.ercp.pi.persistence.entity.credit.factoring;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_factoring_sales_contract")
public class FssFactoringSalesContract {
    /**
     * 主键
     */
    @Id
    @Column(name = "ffsc_id")
    @GeneratedValue(generator = "JDBC")
    private String ffscId;

    /**
     * 业务日期
     */
    @Column(name = "business_date")
    private Date businessDate;

    /**
     * 销售合同
     */
    @Column(name = "sales_contract")
    private String salesContract;

    /**
     * 客户公司名称
     */
    @Column(name = "customer_company_name")
    private String customerCompanyName;

    /**
     * 客户公司编号
     */
    @Column(name = "customer_company_id")
    private String customerCompanyId;

    /**
     * 合同签订方
     */
    @Column(name = "contract_signer")
    private String contractSigner;

    /**
     * 合同签订方编号
     */
    @Column(name = "contract_signer_id")
    private String contractSignerId;

    /**
     * 合同签订日期
     */
    @Column(name = "contract_signing_date")
    private Date contractSigningDate;

    /**
     * 合同总价
     */
    @Column(name = "total_contract_price")
    private BigDecimal totalContractPrice;

    /**
     * 已回款金额
     */
    @Column(name = "refunded_amount")
    private BigDecimal refundedAmount;

    /**
     * 开出发票情况
     */
    @Column(name = "invoicing_situation")
    private String invoicingSituation;

    /**
     * 货物交付清单
     */
    @Column(name = "cargo_delivery_list")
    private String cargoDeliveryList;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 数据关联编号
     */
    @Column(name = "related_id")
    private String relatedId;

    /**
     * 关联模块(1、保理申请，2、保理合同)
     */
    @Column(name = "related_type")
    private String relatedType;

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
     * @return ffsc_id - 主键
     */
    public String getFfscId() {
        return ffscId;
    }

    /**
     * 设置主键
     *
     * @param ffscId 主键
     */
    public void setFfscId(String ffscId) {
        this.ffscId = ffscId;
    }

    /**
     * 获取业务日期
     *
     * @return business_date - 业务日期
     */
    public Date getBusinessDate() {
        return businessDate;
    }

    /**
     * 设置业务日期
     *
     * @param businessDate 业务日期
     */
    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    /**
     * 获取销售合同
     *
     * @return sales_contract - 销售合同
     */
    public String getSalesContract() {
        return salesContract;
    }

    /**
     * 设置销售合同
     *
     * @param salesContract 销售合同
     */
    public void setSalesContract(String salesContract) {
        this.salesContract = salesContract;
    }

    /**
     * 获取客户公司名称
     *
     * @return customer_company_name - 客户公司名称
     */
    public String getCustomerCompanyName() {
        return customerCompanyName;
    }

    /**
     * 设置客户公司名称
     *
     * @param customerCompanyName 客户公司名称
     */
    public void setCustomerCompanyName(String customerCompanyName) {
        this.customerCompanyName = customerCompanyName;
    }

    /**
     * 获取客户公司编号
     *
     * @return customer_company_id - 客户公司编号
     */
    public String getCustomerCompanyId() {
        return customerCompanyId;
    }

    /**
     * 设置客户公司编号
     *
     * @param customerCompanyId 客户公司编号
     */
    public void setCustomerCompanyId(String customerCompanyId) {
        this.customerCompanyId = customerCompanyId;
    }

    /**
     * 获取合同签订方
     *
     * @return contract_signer - 合同签订方
     */
    public String getContractSigner() {
        return contractSigner;
    }

    /**
     * 设置合同签订方
     *
     * @param contractSigner 合同签订方
     */
    public void setContractSigner(String contractSigner) {
        this.contractSigner = contractSigner;
    }

    /**
     * 获取合同签订方编号
     *
     * @return contract_signer_id - 合同签订方编号
     */
    public String getContractSignerId() {
        return contractSignerId;
    }

    /**
     * 设置合同签订方编号
     *
     * @param contractSignerId 合同签订方编号
     */
    public void setContractSignerId(String contractSignerId) {
        this.contractSignerId = contractSignerId;
    }

    /**
     * 获取合同签订日期
     *
     * @return contract_signing_date - 合同签订日期
     */
    public Date getContractSigningDate() {
        return contractSigningDate;
    }

    /**
     * 设置合同签订日期
     *
     * @param contractSigningDate 合同签订日期
     */
    public void setContractSigningDate(Date contractSigningDate) {
        this.contractSigningDate = contractSigningDate;
    }

    /**
     * 获取合同总价
     *
     * @return total_contract_price - 合同总价
     */
    public BigDecimal getTotalContractPrice() {
        return totalContractPrice;
    }

    /**
     * 设置合同总价
     *
     * @param totalContractPrice 合同总价
     */
    public void setTotalContractPrice(BigDecimal totalContractPrice) {
        this.totalContractPrice = totalContractPrice;
    }

    /**
     * 获取已回款金额
     *
     * @return refunded_amount - 已回款金额
     */
    public BigDecimal getRefundedAmount() {
        return refundedAmount;
    }

    /**
     * 设置已回款金额
     *
     * @param refundedAmount 已回款金额
     */
    public void setRefundedAmount(BigDecimal refundedAmount) {
        this.refundedAmount = refundedAmount;
    }

    /**
     * 获取开出发票情况
     *
     * @return invoicing_situation - 开出发票情况
     */
    public String getInvoicingSituation() {
        return invoicingSituation;
    }

    /**
     * 设置开出发票情况
     *
     * @param invoicingSituation 开出发票情况
     */
    public void setInvoicingSituation(String invoicingSituation) {
        this.invoicingSituation = invoicingSituation;
    }

    /**
     * 获取货物交付清单
     *
     * @return cargo_delivery_list - 货物交付清单
     */
    public String getCargoDeliveryList() {
        return cargoDeliveryList;
    }

    /**
     * 设置货物交付清单
     *
     * @param cargoDeliveryList 货物交付清单
     */
    public void setCargoDeliveryList(String cargoDeliveryList) {
        this.cargoDeliveryList = cargoDeliveryList;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取数据关联编号
     *
     * @return related_id - 数据关联编号
     */
    public String getRelatedId() {
        return relatedId;
    }

    /**
     * 设置数据关联编号
     *
     * @param relatedId 数据关联编号
     */
    public void setRelatedId(String relatedId) {
        this.relatedId = relatedId;
    }

    /**
     * 获取关联模块(1、保理申请，2、保理合同)
     *
     * @return related_type - 关联模块(1、保理申请，2、保理合同)
     */
    public String getRelatedType() {
        return relatedType;
    }

    /**
     * 设置关联模块(1、保理申请，2、保理合同)
     *
     * @param relatedType 关联模块(1、保理申请，2、保理合同)
     */
    public void setRelatedType(String relatedType) {
        this.relatedType = relatedType;
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