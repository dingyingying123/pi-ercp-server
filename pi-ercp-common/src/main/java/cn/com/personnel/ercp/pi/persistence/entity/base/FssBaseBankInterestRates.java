package cn.com.personnel.ercp.pi.persistence.entity.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_base_bank_interest_rates")
public class FssBaseBankInterestRates {

    @Id
    @Column(name = "sid")
    @GeneratedValue(generator = "JDBC")
    private String sid;

    /**
     * 利率类型代码
     */
    @Column(name = "interest_type_code")
    private String interestTypeCode;

    /**
     * 利率类型名称
     */
    @Column(name = "interest_type_name")
    private String interestTypeName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "creator")
    private String creator;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 修改人
     */
    @Column(name = "updater")
    private String updater;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getInterestTypeCode() {
        return interestTypeCode;
    }

    public void setInterestTypeCode(String interestTypeCode) {
        this.interestTypeCode = interestTypeCode;
    }

    public String getInterestTypeName() {
        return interestTypeName;
    }

    public void setInterestTypeName(String interestTypeName) {
        this.interestTypeName = interestTypeName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

}
