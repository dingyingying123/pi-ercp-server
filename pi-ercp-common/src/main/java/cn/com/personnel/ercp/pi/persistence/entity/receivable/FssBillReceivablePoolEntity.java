package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import java.util.Date;

/**
 * TODO
 * 入出票据信息实体
 * @author DongAiHua
 * @Date 2020/8/3 14:58
 */
public class FssBillReceivablePoolEntity {

    private String receId; //票据信息表主键
    private Date polDate; //入出日期
    private String polBankId; //票据池id
    private String polBankName; //票据池name
    private String polRemark; //入票据池说明
    private int polState; //票据池状态


    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }

    public Date getPolDate() {
        return polDate;
    }

    public void setPolDate(Date polDate) {
        this.polDate = polDate;
    }

    public String getPolBankId() {
        return polBankId;
    }

    public void setPolBankId(String polBankId) {
        this.polBankId = polBankId;
    }

    public String getPolBankName() {
        return polBankName;
    }

    public void setPolBankName(String polBankName) {
        this.polBankName = polBankName;
    }

    public String getPolRemark() {
        return polRemark;
    }

    public void setPolRemark(String polRemark) {
        this.polRemark = polRemark;
    }

    public int getPolState() {
        return polState;
    }

    public void setPolState(int polState) {
        this.polState = polState;
    }
}
