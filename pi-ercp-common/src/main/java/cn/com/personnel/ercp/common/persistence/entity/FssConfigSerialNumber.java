package cn.com.personnel.ercp.common.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * TODO
 *
 * @author DongAiHua
 * @Date 2020/10/21 19:50
 */
public class FssConfigSerialNumber {
    @Id
    private String id;
    @Column(name = "head_no")
    private String headNo;
    @Column(name = "serial_no")
    private String serialNo;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeadNo() {
        return headNo;
    }

    public void setHeadNo(String headNo) {
        this.headNo = headNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
