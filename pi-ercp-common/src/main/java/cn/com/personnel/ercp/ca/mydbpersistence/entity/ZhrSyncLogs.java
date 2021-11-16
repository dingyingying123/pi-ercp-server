package cn.com.personnel.ercp.ca.mydbpersistence.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "zhr_sync_logs")
public class ZhrSyncLogs {
    /**
     * 序列号
     */
    @Id
    private Integer id;

    private String source;

    @GeneratedValue(generator = "JDBC")
    private String key;

    /**
     * 更新标志
     */
    private String flag;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取序列号
     *
     * @return id - 序列号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置序列号
     *
     * @param id 序列号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取更新标志
     *
     * @return flag - 更新标志
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 设置更新标志
     *
     * @param flag 更新标志
     */
    public void setFlag(String flag) {
        this.flag = flag;
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
}