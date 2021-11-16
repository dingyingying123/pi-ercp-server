package cn.com.personnel.ercp.pi.persistence.entity.credit.guarantee;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_guarantee_service_charge")
public class FssGuaranteeServiceCharge {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private String sId;

    /**
     * 保函编号
     */
    @Column(name = "guarantee_num")
    private String guaranteeNum;

    /**
     * 保函性质
     */
    @Column(name = "guarantee_nature")
    private String guaranteeNature;

    /**
     * 手续费日期
     */
    @JSONField(format = "yyyy-MM-dd")
    @Column(name = "charge_date")
    private Date chargeDate;

    /**
     * 手续费
     */
    @Column(name = "service_charge")
    private BigDecimal serviceCharge;

    /**
     * 备注
     */
    private String remark;

    /**
     * 乐观锁
     */
    private Integer revision;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新人
     */
    @Column(name = "updated_by")
    private String updatedBy;

    /**
     * 更新人
     */
    @Column(name = "year_interest")
    private String yearInterest;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    /**

     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;



    /**
     * 获取保函编号
     *
     * @return guarantee_num - 保函编号
     */
    public String getGuaranteeNum() {
        return guaranteeNum;
    }

    /**
     * 设置保函编号
     *
     * @param guaranteeNum 保函编号
     */
    public void setGuaranteeNum(String guaranteeNum) {
        this.guaranteeNum = guaranteeNum;
    }

    /**
     * 获取保函性质
     *
     * @return guarantee_nature - 保函性质
     */
    public String getGuaranteeNature() {
        return guaranteeNature;
    }

    /**
     * 设置保函性质
     *
     * @param guaranteeNature 保函性质
     */
    public void setGuaranteeNature(String guaranteeNature) {
        this.guaranteeNature = guaranteeNature;
    }

    /**
     * 获取手续费日期
     *
     * @return chage_date - 手续费日期
     */
    public Date getChargeDate() {
        return chargeDate;
    }

    /**
     * 设置手续费日期
     *
     * @param chageDate 手续费日期
     */
    public void setChargeDate(Date chageDate) {
        this.chargeDate = chageDate;
    }

    /**
     * 获取手续费
     *
     * @return service_charge - 手续费
     */
    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    /**
     * 设置手续费
     *
     * @param serviceCharge 手续费
     */
    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取乐观锁
     *
     * @return revision - 乐观锁
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * 设置乐观锁
     *
     * @param revision 乐观锁
     */
    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    /**
     * 获取创建人
     *
     * @return created_by - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新人
     *
     * @return updated_by - 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人
     *
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getYearInterest() {
        return yearInterest;
    }

    public void setYearInterest(String yearInterest) {
        this.yearInterest = yearInterest;
    }
}