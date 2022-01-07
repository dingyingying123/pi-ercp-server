package cn.com.personnel.ercp.pi.persistence.entity.child;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pi_sign_in_info")
public class PiSignInInfo {
    @Id
    @Column(name = "sign_id")
    @GeneratedValue(generator = "JDBC")
    private String signId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "sign_date")
    private String signDate;

    private String longitude;

    private String latitude;

    @Column(name = "location_information")
    private String locationInformation;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return sign_id
     */
    public String getSignId() {
        return signId;
    }

    /**
     * @param signId
     */
    public void setSignId(String signId) {
        this.signId = signId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    /**
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return location_information
     */
    public String getLocationInformation() {
        return locationInformation;
    }

    /**
     * @param locationInformation
     */
    public void setLocationInformation(String locationInformation) {
        this.locationInformation = locationInformation;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}