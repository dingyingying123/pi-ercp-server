package cn.com.personnel.ercp.pi.persistence.entity.innerLoan;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_inner_loan_manager_change_record")
public class FssInnerLoanManagerChangeRecord {
    /**
     * 变更ID
     */
    @Id
    @Column(name = "change_id")
    @GeneratedValue(generator = "JDBC")
    private String changeId;

    /**
     * 合同变更版本号
     */
    private String version;

    /**
     * 合同管理ID
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 合同名称
     */
    private String contractname;

    /**
     * 变更内容名称
     */
    @Column(name = "column_name")
    private String columnName;

    /**
     * 变更前内容
     */
    @Column(name = "old_value")
    private String oldValue;

    /**
     * 变更后内容
     */
    @Column(name = "new_value")
    private String newValue;

    /**
     * 预留
     */
    private String reserve;

    /**
     * 变更时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 变更人
     */
    private String creator;

    /**
     * 变更人姓名
     */
    @Column(name = "creator_name")
    private String creatorName;

    /**
     * 获取变更ID
     *
     * @return change_id - 变更ID
     */
    public String getChangeId() {
        return changeId;
    }

    /**
     * 设置变更ID
     *
     * @param changeId 变更ID
     */
    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    /**
     * 获取合同变更版本号
     *
     * @return version - 合同变更版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置合同变更版本号
     *
     * @param version 合同变更版本号
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取合同管理ID
     *
     * @return manage_id - 合同管理ID
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置合同管理ID
     *
     * @param manageId 合同管理ID
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    /**
     * 获取合同名称
     *
     * @return contractname - 合同名称
     */
    public String getContractname() {
        return contractname;
    }

    /**
     * 设置合同名称
     *
     * @param contractname 合同名称
     */
    public void setContractname(String contractname) {
        this.contractname = contractname;
    }

    /**
     * 获取变更内容名称
     *
     * @return column_name - 变更内容名称
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 设置变更内容名称
     *
     * @param columnName 变更内容名称
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * 获取变更前内容
     *
     * @return old_value - 变更前内容
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * 设置变更前内容
     *
     * @param oldValue 变更前内容
     */
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    /**
     * 获取变更后内容
     *
     * @return new_value - 变更后内容
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * 设置变更后内容
     *
     * @param newValue 变更后内容
     */
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    /**
     * 获取预留
     *
     * @return reserve - 预留
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * 设置预留
     *
     * @param reserve 预留
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    /**
     * 获取变更时间
     *
     * @return create_time - 变更时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置变更时间
     *
     * @param createTime 变更时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取变更人
     *
     * @return creator - 变更人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置变更人
     *
     * @param creator 变更人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取变更人姓名
     *
     * @return creator_name - 变更人姓名
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * 设置变更人姓名
     *
     * @param creatorName 变更人姓名
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
}