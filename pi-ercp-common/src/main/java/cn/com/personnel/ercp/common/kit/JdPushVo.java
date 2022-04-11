package cn.com.personnel.ercp.common.kit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class JdPushVo implements Serializable {
    private static final long serialVersionUID = 5765482497625927662L;
    @ApiModelProperty(name = "alias", value = "别名", dataType = "String")
    private String alias;
    @ApiModelProperty(name = "title", value = "标题", dataType = "String")
    private String title;
    @ApiModelProperty(name = "alert", value = "通知内容", dataType = "String")
    private String alert;
    @ApiModelProperty(name = "timeToLive", value = "离线消息保留时长(秒)默认 86400 （1 天）", dataType = "Integer")
    private Integer timeToLive = 86400;
    @ApiModelProperty(name = "deviceTagAlias", value = "设备号", dataType = "String")
    private String deviceTagAlias;

    @Override
    public String toString() {
        return "JdPushVo{" +
                "alias='" + alias + '\'' +
                ", title='" + title + '\'' +
                ", alert='" + alert + '\'' +
                ", timeToLive=" + timeToLive +
                ", deviceTagAlias='" + deviceTagAlias + '\'' +
                '}';
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public Integer getTimeToLive() {
        return timeToLive;
    }

    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    public String getDeviceTagAlias() {
        return deviceTagAlias;
    }

    public void setDeviceTagAlias(String deviceTagAlias) {
        this.deviceTagAlias = deviceTagAlias;
    }
}
