package cn.com.personnel.ercp.ca.mydbpersistence.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ca_api_main")
public class CaApiMain {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String uuid;

    private String api;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "call_num")
    private Long callNum;

    @Column(name = "last_time")
    private Date lastTime;

    @Column(name = "total_num")
    private Long totalNum;

    /**
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return api
     */
    public String getApi() {
        return api;
    }

    /**
     * @param api
     */
    public void setApi(String api) {
        this.api = api;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return call_num
     */
    public Long getCallNum() {
        return callNum;
    }

    /**
     * @param callNum
     */
    public void setCallNum(Long callNum) {
        this.callNum = callNum;
    }

    /**
     * @return last_time
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * @param lastTime
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * @return total_num
     */
    public Long getTotalNum() {
        return totalNum;
    }

    /**
     * @param totalNum
     */
    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }
}