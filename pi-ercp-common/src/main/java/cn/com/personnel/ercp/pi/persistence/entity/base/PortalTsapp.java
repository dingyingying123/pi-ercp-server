package cn.com.personnel.ercp.pi.persistence.entity.base;

import javax.persistence.*;

@Table(name = "portal_tsapp")
public class PortalTsapp {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String key;

    private String url;

    private String secret;

    @Column(name = "open_secret")
    private String openSecret;

    @Column(name = "mobile_url")
    private String mobileUrl;

    @Column(name = "bps_flag")
    private String bpsFlag;

    @Column(name = "app_url")
    private String appUrl;

    @Column(name = "mobile_app_url")
    private String mobileAppUrl;

    @Column(name = "done_url")
    private String doneUrl;

    @Column(name = "show_header")
    private String showHeader;

    @Column(name = "done_mobile_url")
    private String doneMobileUrl;

    /**
     * 服务显示名称
     */
    @Column(name = "show_name")
    private String showName;

    /**
     * 图片路径
     */
    private String icon;

    /**
     * 是否有效，1有效，0无效
     */
    private String status;

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
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    /**
     * @param secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * @return open_secret
     */
    public String getOpenSecret() {
        return openSecret;
    }

    /**
     * @param openSecret
     */
    public void setOpenSecret(String openSecret) {
        this.openSecret = openSecret;
    }

    /**
     * @return mobile_url
     */
    public String getMobileUrl() {
        return mobileUrl;
    }

    /**
     * @param mobileUrl
     */
    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    /**
     * @return bps_flag
     */
    public String getBpsFlag() {
        return bpsFlag;
    }

    /**
     * @param bpsFlag
     */
    public void setBpsFlag(String bpsFlag) {
        this.bpsFlag = bpsFlag;
    }

    /**
     * @return app_url
     */
    public String getAppUrl() {
        return appUrl;
    }

    /**
     * @param appUrl
     */
    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    /**
     * @return mobile_app_url
     */
    public String getMobileAppUrl() {
        return mobileAppUrl;
    }

    /**
     * @param mobileAppUrl
     */
    public void setMobileAppUrl(String mobileAppUrl) {
        this.mobileAppUrl = mobileAppUrl;
    }

    /**
     * @return done_url
     */
    public String getDoneUrl() {
        return doneUrl;
    }

    /**
     * @param doneUrl
     */
    public void setDoneUrl(String doneUrl) {
        this.doneUrl = doneUrl;
    }

    /**
     * @return show_header
     */
    public String getShowHeader() {
        return showHeader;
    }

    /**
     * @param showHeader
     */
    public void setShowHeader(String showHeader) {
        this.showHeader = showHeader;
    }

    /**
     * @return done_mobile_url
     */
    public String getDoneMobileUrl() {
        return doneMobileUrl;
    }

    /**
     * @param doneMobileUrl
     */
    public void setDoneMobileUrl(String doneMobileUrl) {
        this.doneMobileUrl = doneMobileUrl;
    }

    /**
     * 获取服务显示名称
     *
     * @return show_name - 服务显示名称
     */
    public String getShowName() {
        return showName;
    }

    /**
     * 设置服务显示名称
     *
     * @param showName 服务显示名称
     */
    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}