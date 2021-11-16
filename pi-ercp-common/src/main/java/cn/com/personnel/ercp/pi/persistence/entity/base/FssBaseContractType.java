package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_contract_type")
public class FssBaseContractType {
    /**
     * 合同类型编码
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private String code;

    /**
     * 合同类型名称
     */
    private String name;

    /**
     * 所属分类
     */
    private String beyond;

    /**
     * 状态
     */
    private String state;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 获取合同类型编码
     *
     * @return code - 合同类型编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置合同类型编码
     *
     * @param code 合同类型编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取合同类型名称
     *
     * @return name - 合同类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置合同类型名称
     *
     * @param name 合同类型名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取所属分类
     *
     * @return beyond - 所属分类
     */
    public String getBeyond() {
        return beyond;
    }

    /**
     * 设置所属分类
     *
     * @param beyond 所属分类
     */
    public void setBeyond(String beyond) {
        this.beyond = beyond;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state;
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
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新人
     *
     * @return updater - 更新人
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设置更新人
     *
     * @param updater 更新人
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }
}