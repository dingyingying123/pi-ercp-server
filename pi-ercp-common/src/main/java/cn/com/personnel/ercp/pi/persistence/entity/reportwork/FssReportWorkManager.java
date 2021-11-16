package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_report_work_manager")
public class FssReportWorkManager {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 高管姓名
     */
    private String manager;

    /**
     * 高管OA号
     */
    @Column(name = "manager_code")
    private String managerCode;

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
     * 更新人
     */
    private String updator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取高管姓名
     *
     * @return manager - 高管姓名
     */
    public String getManager() {
        return manager;
    }

    /**
     * 设置高管姓名
     *
     * @param manager 高管姓名
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * 获取高管OA号
     *
     * @return manager_code - 高管OA号
     */
    public String getManagerCode() {
        return managerCode;
    }

    /**
     * 设置高管OA号
     *
     * @param managerCode 高管OA号
     */
    public void setManagerCode(String managerCode) {
        this.managerCode = managerCode;
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
     * 获取更新人
     *
     * @return updator - 更新人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置更新人
     *
     * @param updator 更新人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
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


}