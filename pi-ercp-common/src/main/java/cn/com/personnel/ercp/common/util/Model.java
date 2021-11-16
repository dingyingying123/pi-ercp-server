package cn.com.personnel.ercp.common.util;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 预提付息相关的业务时间模型
 */
public class Model {
    /**
     * 业务日期
     */
    @JSONField(format = "yyy-MM-dd")
    private Date businessDate;
    /**
     * 入账日期
     */
    @JSONField(format = "yyy-MM-dd")
    private Date creditDate;
    /**
     * 开始日期
     */
    @JSONField(format = "yyy-MM-dd")
    private Date startDate;
    /**
     * 结束日期
     */
    @JSONField(format = "yyy-MM-dd")
    private Date endDate;
    /**
     * 是否是第一个预提期间
     */
    private Boolean isFirst;

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public Date getCreditDate() {
        return creditDate;
    }

    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getFirst() {
        return isFirst;
    }

    public void setFirst(Boolean first) {
        isFirst = first;
    }
}
