package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import javax.persistence.*;
import java.util.Objects;

/**
 * TODO
 * 收款表
 * @author DongAiHua
 * @Date 2020/7/22 8:59
 */
@Entity
@Table(name = "fss_bill_receivable_payee")
public class FssBillReceivablePayeeEntity {

    @Column(name = "rece_id")
    private String receId;/*票据信息表主建*/
    @Column(name = "payee_id")
    private String payeeId;/*收款人id*/
    @Column(name = "payee_name")
    private String payeeName;/*收款人姓名*/
    @Column(name = "payee_number")
    private String payeeNumber;/*收款人账号*/
    @Column(name = "payee_bank")
    private String payeeBank;/*收款人银行*/
    @Column(name = "payee_bank_id")
    private String payeeBankId;/*银行id*/



    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }



    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }



    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }



    public String getPayeeNumber() {
        return payeeNumber;
    }

    public void setPayeeNumber(String payeeNumber) {
        this.payeeNumber = payeeNumber;
    }



    public String getPayeeBank() {
        return payeeBank;
    }

    public void setPayeeBank(String payeeBank) {
        this.payeeBank = payeeBank;
    }


    public String getPayeeBankId() {
        return payeeBankId;
    }

    public void setPayeeBankId(String payeeBankId) {
        this.payeeBankId = payeeBankId;
    }

}
