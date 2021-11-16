package cn.com.personnel.ercp.common.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sec_serial_number_date")
public class SerialNumberDate {
    /**
     * 序号
     */
    @Id
    private String id;

    /**
     * appcode
     */
    private String appcode;

    /**
     * 类别
     */
    private String serialtype;

    /**
     * 主序号
     */
    @Column(name = "main_no")
    private String mainNo;

    /**
     * 年
     */
    @Column(name = "the_year")
    private Integer theYear;

    /**
     * 月
     */
    @Column(name = "the_month")
    private Short theMonth;

    /**
     * 日
     */
    @Column(name = "the_day")
    private Short theDay;

    /**
     * 值
     */
    @Column(name = "serial_num")
    private Integer serialNum;

    /**
     * 获取序号
     *
     * @return id - 序号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取appcode
     *
     * @return appcode - appcode
     */
    public String getAppcode() {
        return appcode;
    }

    /**
     * 设置appcode
     *
     * @param appcode appcode
     */
    public void setAppcode(String appcode) {
        this.appcode = appcode;
    }

    /**
     * 获取类别
     *
     * @return serialtype - 类别
     */
    public String getSerialtype() {
        return serialtype;
    }

    /**
     * 设置类别
     *
     * @param serialtype 类别
     */
    public void setSerialtype(String serialtype) {
        this.serialtype = serialtype;
    }

    /**
     * 获取主序号
     *
     * @return main_no - 主序号
     */
    public String getMainNo() {
        return mainNo;
    }

    /**
     * 设置主序号
     *
     * @param mainNo 主序号
     */
    public void setMainNo(String mainNo) {
        this.mainNo = mainNo;
    }

    /**
     * 获取年
     *
     * @return the_year - 年
     */
    public Integer getTheYear() {
        return theYear;
    }

    /**
     * 设置年
     *
     * @param theYear 年
     */
    public void setTheYear(Integer theYear) {
        this.theYear = theYear;
    }

    /**
     * 获取月
     *
     * @return the_month - 月
     */
    public Short getTheMonth() {
        return theMonth;
    }

    /**
     * 设置月
     *
     * @param theMonth 月
     */
    public void setTheMonth(Short theMonth) {
        this.theMonth = theMonth;
    }

    /**
     * 获取日
     *
     * @return the_day - 日
     */
    public Short getTheDay() {
        return theDay;
    }

    /**
     * 设置日
     *
     * @param theDay 日
     */
    public void setTheDay(Short theDay) {
        this.theDay = theDay;
    }

    /**
     * 获取值
     *
     * @return serial_num - 值
     */
    public Integer getSerialNum() {
        return serialNum;
    }

    /**
     * 设置值
     *
     * @param serialNum 值
     */
    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }
}