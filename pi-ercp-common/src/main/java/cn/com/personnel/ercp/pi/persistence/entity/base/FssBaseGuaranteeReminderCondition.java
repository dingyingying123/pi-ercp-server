package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_guarantee_reminder_condition")
public class FssBaseGuaranteeReminderCondition {
    /**
     * 条件ID
     */
    @Id
    @Column(name = "condition_id")
    @GeneratedValue(generator = "JDBC")
    private String conditionId;

    /**
     * 提醒人ID
     */
    @Column(name = "reminder_id")
    private String reminderId;

    /**
     * 左表达式ID
     */
    @Column(name = "left_expression_id")
    private String leftExpressionId;

    /**
     * 左表达式
     */
    @Column(name = "left_expression")
    private String leftExpression;

    /**
     * 右表达式ID
     */
    @Column(name = "right_expression_id")
    private String rightExpressionId;

    /**
     * 右表达式
     */
    @Column(name = "right_expression")
    private String rightExpression;

    /**
     * 运算符
     */
    private String operator;

    /**
     * 联接符
     */
    private String connector;

    /**
     * 左括号
     */
    @Column(name = "left_parenthesis")
    private String leftParenthesis;

    /**
     * 右括号
     */
    @Column(name = "right_parenthesis")
    private String rightParenthesis;

    /**
     * 排序
     */
    private Short sort;

    /**
     * 启动状态，0启用，1禁用
     */
    private String status;

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
     * 获取条件ID
     *
     * @return condition_id - 条件ID
     */
    public String getConditionId() {
        return conditionId;
    }

    /**
     * 设置条件ID
     *
     * @param conditionId 条件ID
     */
    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    /**
     * 获取提醒人ID
     *
     * @return reminder_id - 提醒人ID
     */
    public String getReminderId() {
        return reminderId;
    }

    /**
     * 设置提醒人ID
     *
     * @param reminderId 提醒人ID
     */
    public void setReminderId(String reminderId) {
        this.reminderId = reminderId;
    }

    /**
     * 获取左表达式ID
     *
     * @return left_expression_id - 左表达式ID
     */
    public String getLeftExpressionId() {
        return leftExpressionId;
    }

    /**
     * 设置左表达式ID
     *
     * @param leftExpressionId 左表达式ID
     */
    public void setLeftExpressionId(String leftExpressionId) {
        this.leftExpressionId = leftExpressionId;
    }

    /**
     * 获取左表达式
     *
     * @return left_expression - 左表达式
     */
    public String getLeftExpression() {
        return leftExpression;
    }

    /**
     * 设置左表达式
     *
     * @param leftExpression 左表达式
     */
    public void setLeftExpression(String leftExpression) {
        this.leftExpression = leftExpression;
    }

    /**
     * 获取右表达式ID
     *
     * @return right_expression_id - 右表达式ID
     */
    public String getRightExpressionId() {
        return rightExpressionId;
    }

    /**
     * 设置右表达式ID
     *
     * @param rightExpressionId 右表达式ID
     */
    public void setRightExpressionId(String rightExpressionId) {
        this.rightExpressionId = rightExpressionId;
    }

    /**
     * 获取右表达式
     *
     * @return right_expression - 右表达式
     */
    public String getRightExpression() {
        return rightExpression;
    }

    /**
     * 设置右表达式
     *
     * @param rightExpression 右表达式
     */
    public void setRightExpression(String rightExpression) {
        this.rightExpression = rightExpression;
    }

    /**
     * 获取运算符
     *
     * @return operator - 运算符
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置运算符
     *
     * @param operator 运算符
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取联接符
     *
     * @return connector - 联接符
     */
    public String getConnector() {
        return connector;
    }

    /**
     * 设置联接符
     *
     * @param connector 联接符
     */
    public void setConnector(String connector) {
        this.connector = connector;
    }

    /**
     * 获取左括号
     *
     * @return left_parenthesis - 左括号
     */
    public String getLeftParenthesis() {
        return leftParenthesis;
    }

    /**
     * 设置左括号
     *
     * @param leftParenthesis 左括号
     */
    public void setLeftParenthesis(String leftParenthesis) {
        this.leftParenthesis = leftParenthesis;
    }

    /**
     * 获取右括号
     *
     * @return right_parenthesis - 右括号
     */
    public String getRightParenthesis() {
        return rightParenthesis;
    }

    /**
     * 设置右括号
     *
     * @param rightParenthesis 右括号
     */
    public void setRightParenthesis(String rightParenthesis) {
        this.rightParenthesis = rightParenthesis;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Short getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Short sort) {
        this.sort = sort;
    }

    /**
     * 获取启动状态，0启用，1禁用
     *
     * @return status - 启动状态，0启用，1禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置启动状态，0启用，1禁用
     *
     * @param status 启动状态，0启用，1禁用
     */
    public void setStatus(String status) {
        this.status = status;
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