package cn.com.personnel.ercp.pi.persistence.entity.loan;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fss_loan_contract_change_record")
public class FssLoanContractChangeRecord {
    /**
     * 项目变更ID
     */
    @Id
    @Column(name = "change_id")
    @GeneratedValue(generator = "JDBC")
    private String changeId;

    /**
     * 借款合同id
     */
    @Column(name = "manage_id")
    private String manageId;

    /**
     * 借款合同编号
     */
    @Column(name = "apply_no")
    private String applyNo;

    /**
     * 合同简称
     */
    @Column(name = "contract_abbreviation")
    private String contractAbbreviation;

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
     * 版本
     */
    private Integer version;

    /**
     * 获取项目变更ID
     *
     * @return change_id - 项目变更ID
     */
    public String getChangeId() {
        return changeId;
    }

    /**
     * 设置项目变更ID
     *
     * @param changeId 项目变更ID
     */
    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    /**
     * 获取借款合同id
     *
     * @return manage_id - 借款合同id
     */
    public String getManageId() {
        return manageId;
    }

    /**
     * 设置借款合同id
     *
     * @param manageId 借款合同id
     */
    public void setManageId(String manageId) {
        this.manageId = manageId;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    /**
     * 获取合同简称
     *
     * @return contract_abbreviation - 合同简称
     */
    public String getContractAbbreviation() {
        return contractAbbreviation;
    }

    /**
     * 设置合同简称
     *
     * @param contractAbbreviation 合同简称
     */
    public void setContractAbbreviation(String contractAbbreviation) {
        this.contractAbbreviation = contractAbbreviation;
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
     * 获取版本
     *
     * @return version - 版本
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}