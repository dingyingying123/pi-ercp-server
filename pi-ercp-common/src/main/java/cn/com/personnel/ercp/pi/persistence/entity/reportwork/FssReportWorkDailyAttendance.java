package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_report_work_daily_attendance")
public class FssReportWorkDailyAttendance {
    /**
     * 天考勤表主键
     */
    @Id
    @Column(name = "daily_id")
    @GeneratedValue(generator = "JDBC")
    private String dailyId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 年
     */
    private String year;

    /**
     * 月
     */
    private String month;

    /**
     * 日期
     */
    private String date;

    /**
     * 出勤天数
     */
    private String date10;

    /**
     * 平日加班时数
     */
    private String date11;

    /**
     * 休息日加班时数
     */
    private String date12;

    /**
     * 法定假日加班时数
     */
    private String date13;

    /**
     * 加班时数 合计
     */
    private String date14;

    /**
     * 事假天数
     */
    private String date15;

    /**
     * 非带薪病假天数
     */
    private String date16;

    /**
     * 带薪病假天数
     */
    private String date17;

    /**
     * 产假天数
     */
    private String date18;

    /**
     * 流产假天数 
     */
    private String date19;

    /**
     * 护理假天数  
     */
    private String date20;

    /**
     * 产检假天数 
     */
    private String date21;

    /**
     * 哺乳假小时数
     */
    private String date22;

    /**
     * 婚假天数
     */
    private String date23;

    /**
     * 年休假天数 
     */
    private String date24;

    /**
     * 加班调休假天数 
     */
    private String date25;

    /**
     * 出差调休假天数 
     */
    private String date26;

    /**
     * 特殊假期天数
     */
    private String date27;

    /**
     * 旷工天数
     */
    private String date28;

    /**
     * 迟到/早退次数
     */
    private String date29;

    /**
     * 非项目现场出差天数
     */
    private String date30;

    /**
     * 项目现场出差天数
     */
    private String date31;

    /**
     * 外出天数
     */
    private String date32;

    /**
     * 丧假天数
     */
    private String date33;

    /**
     * 工伤假天数 
     */
    private String date34;

    /**
     * 公司奖励假天数 
     */
    private String date35;

    /**
     * 宗教假天数
     */
    private String date36;

    /**
     * 医疗期病假天数
     */
    private String date37;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新人
     */
    private String updator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取天考勤表主键
     *
     * @return daily_id - 天考勤表主键
     */
    public String getDailyId() {
        return dailyId;
    }

    /**
     * 设置天考勤表主键
     *
     * @param dailyId 天考勤表主键
     */
    public void setDailyId(String dailyId) {
        this.dailyId = dailyId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取年
     *
     * @return year - 年
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年
     *
     * @param year 年
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 获取月
     *
     * @return month - 月
     */
    public String getMonth() {
        return month;
    }

    /**
     * 设置月
     *
     * @param month 月
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * 获取日期
     *
     * @return date - 日期
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置日期
     *
     * @param date 日期
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 获取出勤天数
     *
     * @return date10 - 出勤天数
     */
    public String getDate10() {
        return date10;
    }

    /**
     * 设置出勤天数
     *
     * @param date10 出勤天数
     */
    public void setDate10(String date10) {
        this.date10 = date10;
    }

    /**
     * 获取平日加班时数
     *
     * @return date11 - 平日加班时数
     */
    public String getDate11() {
        return date11;
    }

    /**
     * 设置平日加班时数
     *
     * @param date11 平日加班时数
     */
    public void setDate11(String date11) {
        this.date11 = date11;
    }

    /**
     * 获取休息日加班时数
     *
     * @return date12 - 休息日加班时数
     */
    public String getDate12() {
        return date12;
    }

    /**
     * 设置休息日加班时数
     *
     * @param date12 休息日加班时数
     */
    public void setDate12(String date12) {
        this.date12 = date12;
    }

    /**
     * 获取法定假日加班时数
     *
     * @return date13 - 法定假日加班时数
     */
    public String getDate13() {
        return date13;
    }

    /**
     * 设置法定假日加班时数
     *
     * @param date13 法定假日加班时数
     */
    public void setDate13(String date13) {
        this.date13 = date13;
    }

    /**
     * 获取加班时数 合计
     *
     * @return date14 - 加班时数 合计
     */
    public String getDate14() {
        return date14;
    }

    /**
     * 设置加班时数 合计
     *
     * @param date14 加班时数 合计
     */
    public void setDate14(String date14) {
        this.date14 = date14;
    }

    /**
     * 获取事假天数
     *
     * @return date15 - 事假天数
     */
    public String getDate15() {
        return date15;
    }

    /**
     * 设置事假天数
     *
     * @param date15 事假天数
     */
    public void setDate15(String date15) {
        this.date15 = date15;
    }

    /**
     * 获取非带薪病假天数
     *
     * @return date16 - 非带薪病假天数
     */
    public String getDate16() {
        return date16;
    }

    /**
     * 设置非带薪病假天数
     *
     * @param date16 非带薪病假天数
     */
    public void setDate16(String date16) {
        this.date16 = date16;
    }

    /**
     * 获取带薪病假天数
     *
     * @return date17 - 带薪病假天数
     */
    public String getDate17() {
        return date17;
    }

    /**
     * 设置带薪病假天数
     *
     * @param date17 带薪病假天数
     */
    public void setDate17(String date17) {
        this.date17 = date17;
    }

    /**
     * 获取产假天数
     *
     * @return date18 - 产假天数
     */
    public String getDate18() {
        return date18;
    }

    /**
     * 设置产假天数
     *
     * @param date18 产假天数
     */
    public void setDate18(String date18) {
        this.date18 = date18;
    }

    /**
     * 获取流产假天数 
     *
     * @return date19 - 流产假天数 
     */
    public String getDate19() {
        return date19;
    }

    /**
     * 设置流产假天数 
     *
     * @param date19 流产假天数 
     */
    public void setDate19(String date19) {
        this.date19 = date19;
    }

    /**
     * 获取护理假天数  
     *
     * @return date20 - 护理假天数  
     */
    public String getDate20() {
        return date20;
    }

    /**
     * 设置护理假天数  
     *
     * @param date20 护理假天数  
     */
    public void setDate20(String date20) {
        this.date20 = date20;
    }

    /**
     * 获取产检假天数 
     *
     * @return date21 - 产检假天数 
     */
    public String getDate21() {
        return date21;
    }

    /**
     * 设置产检假天数 
     *
     * @param date21 产检假天数 
     */
    public void setDate21(String date21) {
        this.date21 = date21;
    }

    /**
     * 获取哺乳假小时数
     *
     * @return date22 - 哺乳假小时数
     */
    public String getDate22() {
        return date22;
    }

    /**
     * 设置哺乳假小时数
     *
     * @param date22 哺乳假小时数
     */
    public void setDate22(String date22) {
        this.date22 = date22;
    }

    /**
     * 获取婚假天数
     *
     * @return date23 - 婚假天数
     */
    public String getDate23() {
        return date23;
    }

    /**
     * 设置婚假天数
     *
     * @param date23 婚假天数
     */
    public void setDate23(String date23) {
        this.date23 = date23;
    }

    /**
     * 获取年休假天数 
     *
     * @return date24 - 年休假天数 
     */
    public String getDate24() {
        return date24;
    }

    /**
     * 设置年休假天数 
     *
     * @param date24 年休假天数 
     */
    public void setDate24(String date24) {
        this.date24 = date24;
    }

    /**
     * 获取加班调休假天数 
     *
     * @return date25 - 加班调休假天数 
     */
    public String getDate25() {
        return date25;
    }

    /**
     * 设置加班调休假天数 
     *
     * @param date25 加班调休假天数 
     */
    public void setDate25(String date25) {
        this.date25 = date25;
    }

    /**
     * 获取出差调休假天数 
     *
     * @return date26 - 出差调休假天数 
     */
    public String getDate26() {
        return date26;
    }

    /**
     * 设置出差调休假天数 
     *
     * @param date26 出差调休假天数 
     */
    public void setDate26(String date26) {
        this.date26 = date26;
    }

    /**
     * 获取特殊假期天数
     *
     * @return date27 - 特殊假期天数
     */
    public String getDate27() {
        return date27;
    }

    /**
     * 设置特殊假期天数
     *
     * @param date27 特殊假期天数
     */
    public void setDate27(String date27) {
        this.date27 = date27;
    }

    /**
     * 获取旷工天数
     *
     * @return date28 - 旷工天数
     */
    public String getDate28() {
        return date28;
    }

    /**
     * 设置旷工天数
     *
     * @param date28 旷工天数
     */
    public void setDate28(String date28) {
        this.date28 = date28;
    }

    /**
     * 获取迟到/早退次数
     *
     * @return date29 - 迟到/早退次数
     */
    public String getDate29() {
        return date29;
    }

    /**
     * 设置迟到/早退次数
     *
     * @param date29 迟到/早退次数
     */
    public void setDate29(String date29) {
        this.date29 = date29;
    }

    /**
     * 获取非项目现场出差天数
     *
     * @return date30 - 非项目现场出差天数
     */
    public String getDate30() {
        return date30;
    }

    /**
     * 设置非项目现场出差天数
     *
     * @param date30 非项目现场出差天数
     */
    public void setDate30(String date30) {
        this.date30 = date30;
    }

    /**
     * 获取项目现场出差天数
     *
     * @return date31 - 项目现场出差天数
     */
    public String getDate31() {
        return date31;
    }

    /**
     * 设置项目现场出差天数
     *
     * @param date31 项目现场出差天数
     */
    public void setDate31(String date31) {
        this.date31 = date31;
    }

    /**
     * 获取外出天数
     *
     * @return date32 - 外出天数
     */
    public String getDate32() {
        return date32;
    }

    /**
     * 设置外出天数
     *
     * @param date32 外出天数
     */
    public void setDate32(String date32) {
        this.date32 = date32;
    }

    /**
     * 获取丧假天数
     *
     * @return date33 - 丧假天数
     */
    public String getDate33() {
        return date33;
    }

    /**
     * 设置丧假天数
     *
     * @param date33 丧假天数
     */
    public void setDate33(String date33) {
        this.date33 = date33;
    }

    /**
     * 获取工伤假天数 
     *
     * @return date34 - 工伤假天数 
     */
    public String getDate34() {
        return date34;
    }

    /**
     * 设置工伤假天数 
     *
     * @param date34 工伤假天数 
     */
    public void setDate34(String date34) {
        this.date34 = date34;
    }

    /**
     * 获取公司奖励假天数 
     *
     * @return date35 - 公司奖励假天数 
     */
    public String getDate35() {
        return date35;
    }

    /**
     * 设置公司奖励假天数 
     *
     * @param date35 公司奖励假天数 
     */
    public void setDate35(String date35) {
        this.date35 = date35;
    }

    /**
     * 获取宗教假天数
     *
     * @return date36 - 宗教假天数
     */
    public String getDate36() {
        return date36;
    }

    /**
     * 设置宗教假天数
     *
     * @param date36 宗教假天数
     */
    public void setDate36(String date36) {
        this.date36 = date36;
    }

    /**
     * 获取医疗期病假天数
     *
     * @return date37 - 医疗期病假天数
     */
    public String getDate37() {
        return date37;
    }

    /**
     * 设置医疗期病假天数
     *
     * @param date37 医疗期病假天数
     */
    public void setDate37(String date37) {
        this.date37 = date37;
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
     * 获取更新人
     *
     * @return updator - 更新人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置更新人
     *
     * @param updator 更新人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
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
}