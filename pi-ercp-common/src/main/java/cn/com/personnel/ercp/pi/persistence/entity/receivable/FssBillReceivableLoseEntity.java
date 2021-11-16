package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import java.util.Date;

/**
 * TODO
 * 挂失表
 * @author DongAiHua
 * @Date 2020/8/4 9:08
 */
public class FssBillReceivableLoseEntity {
    private String losId;
    private String receId;
    private Date losDate; //挂失日期
    private String losUserId; //挂失申请人id
    private String losUserName; //挂失申请人名称
    private Date lookDate; //解挂日期
    private String losRemark; //挂失说明

    public String getLosId() {
        return losId;
    }

    public void setLosId(String losId) {
        this.losId = losId;
    }

    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }

    public Date getLosDate() {
        return losDate;
    }

    public void setLosDate(Date losDate) {
        this.losDate = losDate;
    }

    public String getLosUserId() {
        return losUserId;
    }

    public void setLosUserId(String losUserId) {
        this.losUserId = losUserId;
    }

    public String getLosUserName() {
        return losUserName;
    }

    public void setLosUserName(String losUserName) {
        this.losUserName = losUserName;
    }

    public Date getLookDate() {
        return lookDate;
    }

    public void setLookDate(Date lookDate) {
        this.lookDate = lookDate;
    }

    public String getLosRemark() {
        return losRemark;
    }

    public void setLosRemark(String losRemark) {
        this.losRemark = losRemark;
    }
}
