package cn.com.personnel.ercp.task.persistence.entiy;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "qrtz_sync_log")
public class QrtzSyncLog {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 同步平台
     */
    private String dest;

    /**
     * 工号
     */
    private String eid;

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 执行结果，success fail
     */
    @Column(name = "exec_result")
    private String execResult;

    /**
     * 操作，create、modify、disable
     */
    private String operation;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取同步平台
     *
     * @return dest - 同步平台
     */
    public String getDest() {
        return dest;
    }

    /**
     * 设置同步平台
     *
     * @param dest 同步平台
     */
    public void setDest(String dest) {
        this.dest = dest;
    }

    /**
     * 获取工号
     *
     * @return eid - 工号
     */
    public String getEid() {
        return eid;
    }

    /**
     * 设置工号
     *
     * @param eid 工号
     */
    public void setEid(String eid) {
        this.eid = eid;
    }

    /**
     * 获取返回消息
     *
     * @return msg - 返回消息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置返回消息
     *
     * @param msg 返回消息
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

    /**
     * 获取执行结果，success fail
     *
     * @return exec_result - 执行结果，success fail
     */
    public String getExecResult() {
        return execResult;
    }

    /**
     * 设置执行结果，success fail
     *
     * @param execResult 执行结果，success fail
     */
    public void setExecResult(String execResult) {
        this.execResult = execResult;
    }

    /**
     * 获取操作，create、modify、disable
     *
     * @return operation - 操作，create、modify、disable
     */
    public String getOperation() {
        return operation;
    }

    /**
     * 设置操作，create、modify、disable
     *
     * @param operation 操作，create、modify、disable
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }
}