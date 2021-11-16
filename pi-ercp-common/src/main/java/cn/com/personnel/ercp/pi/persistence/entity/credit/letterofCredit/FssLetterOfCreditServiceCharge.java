package cn.com.personnel.ercp.pi.persistence.entity.credit.letterofCredit;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_letter_of_credit_service_charge")
public class FssLetterOfCreditServiceCharge {
    /**
     * 主键
     */
    @Id
    @Column(name = "flocsc_id")
    @GeneratedValue(generator = "JDBC")
    private String flocscId;

    /**
     * 收费日期
     */
    @Column(name = "charge_date")
    private Date chargeDate;

    /**
     * 手续费
     */
    @Column(name = "service_charge")
    private BigDecimal serviceCharge;


    /**
     * 手续费备注
     */
    @Column(name = "service_charge_remarks")
    private String serviceChargeRemarks;

    private Date updateTime;
    private Date createTime;
    private String updator;
    private String creator;

    private String flocmId;

    /**
     * 获取主键
     *
     * @return flocsc_id - 主键
     */
    public String getFlocscId() {
        return flocscId;
    }

    /**
     * 设置主键
     *
     * @param flocscId 主键
     */
    public void setFlocscId(String flocscId) {
        this.flocscId = flocscId;
    }

    /**
     * 获取收费日期
     *
     * @return charge_date - 收费日期
     */
    public Date getChargeDate() {
        return chargeDate;
    }

    /**
     * 设置收费日期
     *
     * @param chargeDate 收费日期
     */
    public void setChargeDate(Date chargeDate) {
        this.chargeDate = chargeDate;
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
     * 获取手续费备注
     *
     * @return service_charge_remarks - 手续费备注
     */
    public String getServiceChargeRemarks() {
        return serviceChargeRemarks;
    }

    /**
     * 设置手续费备注
     *
     * @param serviceChargeRemarks 手续费备注
     */
    public void setServiceChargeRemarks(String serviceChargeRemarks) {
        this.serviceChargeRemarks = serviceChargeRemarks;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getFlocmId() {
        return flocmId;
    }

    public void setFlocmId(String flocmId) {
        this.flocmId = flocmId;
    }
}