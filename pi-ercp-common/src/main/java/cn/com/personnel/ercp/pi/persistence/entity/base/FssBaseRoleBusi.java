package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_role_busi")
public class FssBaseRoleBusi {
    /**
     * 业务单元授权ID
     */
    @Id
    @Column(name = "busi_id")
    @GeneratedValue(generator = "JDBC")
    private String busiId;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     * 业务单元编码
     */
    private String busi;

    /**
     * 业务单元编码
     */
    @Column(name = "busi_text")
    private String busiText;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人
     */
    private String updator;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取业务单元授权ID
     *
     * @return busi_id - 业务单元授权ID
     */
    public String getBusiId() {
        return busiId;
    }

    /**
     * 设置业务单元授权ID
     *
     * @param busiId 业务单元授权ID
     */
    public void setBusiId(String busiId) {
        this.busiId = busiId;
    }

    /**
     * 获取角色ID
     *
     * @return role_id - 角色ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取业务单元编码
     *
     * @return busi - 业务单元编码
     */
    public String getBusi() {
        return busi;
    }

    /**
     * 设置业务单元编码
     *
     * @param busi 业务单元编码
     */
    public void setBusi(String busi) {
        this.busi = busi;
    }

    /**
     * 获取业务单元编码
     *
     * @return busi_text - 业务单元编码
     */
    public String getBusiText() {
        return busiText;
    }

    /**
     * 设置业务单元编码
     *
     * @param busiText 业务单元编码
     */
    public void setBusiText(String busiText) {
        this.busiText = busiText;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
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
     * 获取修改人
     *
     * @return updator - 修改人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置修改人
     *
     * @param updator 修改人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
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