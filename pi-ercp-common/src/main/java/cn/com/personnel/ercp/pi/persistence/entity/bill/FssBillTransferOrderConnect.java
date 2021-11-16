package cn.com.personnel.ercp.pi.persistence.entity.bill;

import javax.persistence.*;

@Table(name = "fss_bill_transfer_order_connect")
public class FssBillTransferOrderConnect {
    /**
     * 主键
     */
    @Id
    @Column(name = "connect_id")
    private String connectId;

    /**
     * 这个是内部调拨单的主键
     */
    @Column(name = "transfer_id")
    private String transferId;

    /**
     * 这个是应付票据的id
     */
    @Column(name = "bill_id")
    @GeneratedValue(generator = "JDBC")
    private String billId;

    /**
     * 获取主键
     *
     * @return connect_id - 主键
     */
    public String getConnectId() {
        return connectId;
    }

    /**
     * 设置主键
     *
     * @param connectId 主键
     */
    public void setConnectId(String connectId) {
        this.connectId = connectId;
    }

    /**
     * 获取这个是内部调拨单的主键
     *
     * @return transfer_id - 这个是内部调拨单的主键
     */
    public String getTransferId() {
        return transferId;
    }

    /**
     * 设置这个是内部调拨单的主键
     *
     * @param transferId 这个是内部调拨单的主键
     */
    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    /**
     * 获取这个是应付票据的id
     *
     * @return bill_id - 这个是应付票据的id
     */
    public String getBillId() {
        return billId;
    }

    /**
     * 设置这个是应付票据的id
     *
     * @param billId 这个是应付票据的id
     */
    public void setBillId(String billId) {
        this.billId = billId;
    }
}