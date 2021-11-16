package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * TODO
 *
 * @author DongAiHua
 * @Date 2020/7/22 10:20
 */
@Entity
@Table(name = "fss_bill_receivable_upd_user")
public class FssBillReceivableUpdUserEntity {
    private String ruuId;/*主建*/
    private String receId;/*票据信息表主建*/
    private String updaterId;/*修改人id*/
    private String updaterName;/*修改人姓名*/
    private Timestamp updateTime;/*修改时间*/
    private String type; /*操作类型*/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Id
    @Column(name = "ruu_id")
    public String getRuuId() {
        return ruuId;
    }

    public void setRuuId(String ruuId) {
        this.ruuId = ruuId;
    }

    @Basic
    @Column(name = "rece_id")
    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }

    @Basic
    @Column(name = "updater_id")
    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    @Basic
    @Column(name = "updater_name")
    public String getUpdaterName() {
        return updaterName;
    }

    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FssBillReceivableUpdUserEntity that = (FssBillReceivableUpdUserEntity) o;
        return Objects.equals(ruuId, that.ruuId) &&
                Objects.equals(receId, that.receId) &&
                Objects.equals(updaterId, that.updaterId) &&
                Objects.equals(updaterName, that.updaterName) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ruuId, receId, updaterId, updaterName, updateTime);
    }
}
