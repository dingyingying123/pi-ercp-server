package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * TODO
 * 保管部门
 * @author DongAiHua
 * @Date 2020/7/22 8:59
 */
@Entity
@Table(name = "fss_bill_receivable_depart")
public class FssBillReceivableDepartEntity {
    @Id
    @Column(name = "rd_id")
    private String rdId;/*主建*/
    @Column(name = "rece_id")
    private String receId;/*票据信息表主建*/
    @Column(name = "admin_depart")
    private String adminDepart;/*管理部门*/
    @Column(name = "safekeep_depart")
    private String safekeepDepart;/*保管部门*/
    @Column(name = "custodian")
    private String custodian;/*保管人姓名*/
    @Column(name = "phone")
    private String phone;/*联系方式（手机号）*/
    private String adminDepartId; //管理部门id
    private String safekeepDepartId; //保管部门id
    private String custodianId; //保管人id
    private Date effectiveDate; //生效日期
    private Date failDate; //失效日期

    public String getAdminDepartId() {
        return adminDepartId;
    }

    public void setAdminDepartId(String adminDepartId) {
        this.adminDepartId = adminDepartId;
    }

    public String getSafekeepDepartId() {
        return safekeepDepartId;
    }

    public void setSafekeepDepartId(String safekeepDepartId) {
        this.safekeepDepartId = safekeepDepartId;
    }

    public String getCustodianId() {
        return custodianId;
    }

    public void setCustodianId(String custodianId) {
        this.custodianId = custodianId;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getFailDate() {
        return failDate;
    }

    public void setFailDate(Date failDate) {
        this.failDate = failDate;
    }

    public String getRdId() {
        return rdId;
    }

    public void setRdId(String rdId) {
        this.rdId = rdId;
    }


    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }

    

    public String getAdminDepart() {
        return adminDepart;
    }

    public void setAdminDepart(String adminDepart) {
        this.adminDepart = adminDepart;
    }



    public String getSafekeepDepart() {
        return safekeepDepart;
    }

    public void setSafekeepDepart(String safekeepDepart) {
        this.safekeepDepart = safekeepDepart;
    }



    public String getCustodian() {
        return custodian;
    }

    public void setCustodian(String custodian) {
        this.custodian = custodian;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FssBillReceivableDepartEntity that = (FssBillReceivableDepartEntity) o;
        return Objects.equals(rdId, that.rdId) &&
                Objects.equals(receId, that.receId) &&
                Objects.equals(adminDepart, that.adminDepart) &&
                Objects.equals(safekeepDepart, that.safekeepDepart) &&
                Objects.equals(custodian, that.custodian) &&
                Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rdId, receId, adminDepart, safekeepDepart, custodian, phone);
    }

    @Override
    public String toString() {
        return "FssBillReceivableDepartEntity{" +
                "rdId='" + rdId + '\'' +
                ", receId='" + receId + '\'' +
                ", adminDepart='" + adminDepart + '\'' +
                ", safekeepDepart='" + safekeepDepart + '\'' +
                ", custodian='" + custodian + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
