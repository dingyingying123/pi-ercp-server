package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import javax.persistence.*;
import java.util.Objects;

/**
 * TODO
 * 出票人
 * @author DongAiHua
 * @Date 2020/7/22 8:59
 */
@Entity
@Table(name = "fss_bill_receivable_drawer")
public class FssBillReceivableDrawerEntity {
    @Column(name = "rece_id")
    private String receId;/*票据信息表主建*/
    @Column(name = "drawer_id")
    private String drawerId;/*出票id*/
    @Column(name = "drawer_name")
    private String drawerName;/*出票人姓名*/
    @Column(name = "drawer_number")
    private String drawerNumber;/*出票人账号*/
    @Column(name = "drawer_bank")
    private String drawerBank;/*出票人银行*/
    @Column(name = "drawer_bank_id")
    private String drawerBankId;/*银行id*/
    private String drawerHeadBank; /*银行总行名称*/
    private String drawerHeadBankId;/*银行总行id*/

    public String getDrawerHeadBank() {
        return drawerHeadBank;
    }

    public void setDrawerHeadBank(String drawerHeadBank) {
        this.drawerHeadBank = drawerHeadBank;
    }

    public String getDrawerHeadBankId() {
        return drawerHeadBankId;
    }

    public void setDrawerHeadBankId(String drawerHeadBankId) {
        this.drawerHeadBankId = drawerHeadBankId;
    }

    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }



    public String getDrawerId() {
        return drawerId;
    }

    public void setDrawerId(String drawerId) {
        this.drawerId = drawerId;
    }



    public String getDrawerName() {
        return drawerName;
    }

    public void setDrawerName(String drawerName) {
        this.drawerName = drawerName;
    }



    public String getDrawerNumber() {
        return drawerNumber;
    }

    public void setDrawerNumber(String drawerNumber) {
        this.drawerNumber = drawerNumber;
    }



    public String getDrawerBank() {
        return drawerBank;
    }

    public void setDrawerBank(String drawerBank) {
        this.drawerBank = drawerBank;
    }

    public String getDrawerBankId() {
        return drawerBankId;
    }

    public void setDrawerBankId(String drawerBankId) {
        this.drawerBankId = drawerBankId;
    }

}
