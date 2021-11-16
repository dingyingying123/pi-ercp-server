package cn.com.personnel.ercp.common.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sec_interface_status")
public class InterfaceStatus {
    /**
     * guid
     */
    @Id
    @Column(name = "i_guid")
    private String iGuid;

    /**
     * 回调bean
     */
    @Column(name = "back_bean")
    private String backBean;

    /**
     * 回调 函数
     */
    @Column(name = "back_method")
    private String backMethod;

    /**
     * 接口标识
     */
    @Column(name = "i_flag")
    private String iFlag;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取guid
     *
     * @return i_guid - guid
     */
    public String getiGuid() {
        return iGuid;
    }

    /**
     * 设置guid
     *
     * @param iGuid guid
     */
    public void setiGuid(String iGuid) {
        this.iGuid = iGuid;
    }

    /**
     * 获取回调bean
     *
     * @return back_bean - 回调bean
     */
    public String getBackBean() {
        return backBean;
    }

    /**
     * 设置回调bean
     *
     * @param backBean 回调bean
     */
    public void setBackBean(String backBean) {
        this.backBean = backBean;
    }

    /**
     * 获取回调 函数
     *
     * @return back_method - 回调 函数
     */
    public String getBackMethod() {
        return backMethod;
    }

    /**
     * 设置回调 函数
     *
     * @param backMethod 回调 函数
     */
    public void setBackMethod(String backMethod) {
        this.backMethod = backMethod;
    }

    /**
     * 获取接口标识
     *
     * @return i_flag - 接口标识
     */
    public String getiFlag() {
        return iFlag;
    }

    /**
     * 设置接口标识
     *
     * @param iFlag 接口标识
     */
    public void setiFlag(String iFlag) {
        this.iFlag = iFlag;
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

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}