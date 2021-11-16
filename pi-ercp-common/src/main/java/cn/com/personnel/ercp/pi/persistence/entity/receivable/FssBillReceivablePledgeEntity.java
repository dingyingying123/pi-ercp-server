package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import java.util.Date;

/**
 * TODO
 * 质押实体
 * @author DongAiHua
 * @Date 2020/8/1 16:57
 */
public class FssBillReceivablePledgeEntity {
    private String receId;//应收票据表主建
    private Date pleDate;//质押日期
    private Date pleStopDate;//质押到期日
    private String pleOrgan;//质押机构
    private String plePurpose;//质押用途
    private Date decDate;//解压日期

    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }

    public Date getPleDate() {
        return pleDate;
    }

    public void setPleDate(Date pleDate) {
        this.pleDate = pleDate;
    }

    public Date getPleStopDate() {
        return pleStopDate;
    }

    public void setPleStopDate(Date pleStopDate) {
        this.pleStopDate = pleStopDate;
    }

    public String getPleOrgan() {
        return pleOrgan;
    }

    public void setPleOrgan(String pleOrgan) {
        this.pleOrgan = pleOrgan;
    }

    public String getPlePurpose() {
        return plePurpose;
    }

    public void setPlePurpose(String plePurpose) {
        this.plePurpose = plePurpose;
    }

    public Date getDecDate() {
        return decDate;
    }

    public void setDecDate(Date decDate) {
        this.decDate = decDate;
    }
}
