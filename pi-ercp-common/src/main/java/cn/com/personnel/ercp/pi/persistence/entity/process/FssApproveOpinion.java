package cn.com.personnel.ercp.pi.persistence.entity.process;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_approve_opinion")
public class FssApproveOpinion {
    /**
     * 主键id
     */
    @Id
    @Column(name = "opinion_id")
    @GeneratedValue(generator = "JDBC")
    private String opinionId;

    /**
     * 流程主键
     */
    @Column(name = "frev_id")
    private String frevId;

    /**
     * 审批数据主键
     */
    @Column(name = "primary_key_id")
    private String primaryKeyId;

    /**
     * 审批人ID
     */
    @Column(name = "approve_id")
    private String approveId;

    /**
     * 审批人名称
     */
    @Column(name = "approve_name")
    private String approveName;

    /**
     * 审批结果
     */
    @Column(name = "approve_result")
    private String approveResult;

    /**
     * 审批意见
     */
    private String option;

    /**
     * 预留字段
     */
    private String reserved;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 类型
     */
    private String type;

    /**
     * 获取主键id
     *
     * @return opinion_id - 主键id
     */
    public String getOpinionId() {
        return opinionId;
    }

    /**
     * 设置主键id
     *
     * @param opinionId 主键id
     */
    public void setOpinionId(String opinionId) {
        this.opinionId = opinionId;
    }

    /**
     * 获取流程主键
     *
     * @return frev_id - 流程主键
     */
    public String getFrevId() {
        return frevId;
    }

    /**
     * 设置流程主键
     *
     * @param frevId 流程主键
     */
    public void setFrevId(String frevId) {
        this.frevId = frevId;
    }

    /**
     * 获取审批数据主键
     *
     * @return primary_key_id - 审批数据主键
     */
    public String getPrimaryKeyId() {
        return primaryKeyId;
    }

    /**
     * 设置审批数据主键
     *
     * @param primaryKeyId 审批数据主键
     */
    public void setPrimaryKeyId(String primaryKeyId) {
        this.primaryKeyId = primaryKeyId;
    }

    /**
     * 获取审批人ID
     *
     * @return approve_id - 审批人ID
     */
    public String getApproveId() {
        return approveId;
    }

    /**
     * 设置审批人ID
     *
     * @param approveId 审批人ID
     */
    public void setApproveId(String approveId) {
        this.approveId = approveId;
    }

    /**
     * 获取审批人名称
     *
     * @return approve_name - 审批人名称
     */
    public String getApproveName() {
        return approveName;
    }

    /**
     * 设置审批人名称
     *
     * @param approveName 审批人名称
     */
    public void setApproveName(String approveName) {
        this.approveName = approveName;
    }

    /**
     * 获取审批结果
     *
     * @return approve_result - 审批结果
     */
    public String getApproveResult() {
        return approveResult;
    }

    /**
     * 设置审批结果
     *
     * @param approveResult 审批结果
     */
    public void setApproveResult(String approveResult) {
        this.approveResult = approveResult;
    }

    /**
     * 获取审批意见
     *
     * @return option - 审批意见
     */
    public String getOption() {
        return option;
    }

    /**
     * 设置审批意见
     *
     * @param option 审批意见
     */
    public void setOption(String option) {
        this.option = option;
    }

    /**
     * 获取预留字段
     *
     * @return reserved - 预留字段
     */
    public String getReserved() {
        return reserved;
    }

    /**
     * 设置预留字段
     *
     * @param reserved 预留字段
     */
    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    /**
     * 获取创建者
     *
     * @return creator - 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator 创建者
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
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }
}