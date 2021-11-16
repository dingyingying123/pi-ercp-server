package cn.com.personnel.ercp.common.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sec_interface_return_msg")
public class InterfaceReturnMsg {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * GUID
     */
    @Column(name = "i_guid")
    private String iGuid;

    /**
     * 消息类型
     */
    @Column(name = "msg_type")
    private String msgType;

    /**
     * 预留字段1
     */
    @Column(name = "reserve_f1")
    private String reserveF1;

    /**
     * 预留字段2
     */
    @Column(name = "reserve_f2")
    private String reserveF2;

    /**
     * 预留字段3
     */
    @Column(name = "reserve_f3")
    private String reserveF3;

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    @Override
    public String toString() {
        return "InterfaceReturnMsg{" +
                "id='" + id + '\'' +
                ", iGuid='" + iGuid + '\'' +
                ", msgType='" + msgType + '\'' +
                ", reserveF1='" + reserveF1 + '\'' +
                ", reserveF2='" + reserveF2 + '\'' +
                ", reserveF3='" + reserveF3 + '\'' +
                ", msg='" + msg + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取GUID
     *
     * @return i_guid - GUID
     */
    public String getiGuid() {
        return iGuid;
    }

    /**
     * 设置GUID
     *
     * @param iGuid GUID
     */
    public void setiGuid(String iGuid) {
        this.iGuid = iGuid;
    }

    /**
     * 获取消息类型
     *
     * @return msg_type - 消息类型
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * 设置消息类型
     *
     * @param msgType 消息类型
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * 获取消息内容
     *
     * @return msg - 消息内容
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置消息内容
     *
     * @param msg 消息内容
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getReserveF1() {
        return reserveF1;
    }

    public void setReserveF1(String reserveF1) {
        this.reserveF1 = reserveF1;
    }

    public String getReserveF2() {
        return reserveF2;
    }

    public void setReserveF2(String reserveF2) {
        this.reserveF2 = reserveF2;
    }

    public String getReserveF3() {
        return reserveF3;
    }

    public void setReserveF3(String reserveF3) {
        this.reserveF3 = reserveF3;
    }
}