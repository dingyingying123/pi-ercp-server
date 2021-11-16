package cn.com.personnel.ercp.ca.mydbpersistence.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ca_api_log")
public class CaApiLog {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String uuid;

    @Column(name = "user_id")
    private String userId;

    private String ip;

    @Column(name = "call_time")
    private Date callTime;

    private String api;

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
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return call_time
     */
    public Date getCallTime() {
        return callTime;
    }

    /**
     * @param callTime
     */
    public void setCallTime(Date callTime) {
        this.callTime = callTime;
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
}