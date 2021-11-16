package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_report_work_attendance")
public class FssReportWorkAttendance {
    /**
     * 考勤表主键
     */
    @Id
    @Column(name = "attendance_id")
    @GeneratedValue(generator = "JDBC")
    private String attendanceId;

    /**
     * 集团编码
     */
    @Column(name = "obj_id")
    private String objId;

    /**
     * 年
     */
    private String year;

    /**
     * 月
     */
    private String month;

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
     * 业务单元
     */
    private String busi;

    /**
     * 系统中心/事业部
     */
    private String center;

    /**
     * 业务系统/公司
     */
    private String bukrs;

    /**
     * 部门
     */
    private String department;

    /**
     * 科室
     */
    @Column(name = "department_office")
    private String departmentOffice;

    /**
     * 组
     */
    private String groups;

    /**
     * 岗位
     */
    private String post;

    /**
     * 员工组
     */
    @Column(name = "staff_group")
    private String staffGroup;

    /**
     * 公司
     */
    private String company;

    /**
     * 常驻地
     */
    private String btext;

    /**
     * 期间
     */
    private String period;

    /**
     * 当月出勤天数
     */
    @Column(name = "attendance_days")
    private String attendanceDays;

    /**
     * 平日加班时数
     */
    @Column(name = "overtime_hours_weekdays")
    private String overtimeHoursWeekdays;

    /**
     * 休息日加班时数
     */
    @Column(name = "weekend_overtime_hours")
    private String weekendOvertimeHours;

    /**
     * 法定假日加班时数
     */
    @Column(name = "overtime_hours_holidays")
    private String overtimeHoursHolidays;

    /**
     * 加班时数合计
     */
    @Column(name = "total_overtime_hours")
    private String totalOvertimeHours;

    /**
     * 事假天数
     */
    @Column(name = "leave_days")
    private String leaveDays;

    /**
     * 非带薪病假天数
     */
    @Column(name = "days_unpaid_sick_leave")
    private String daysUnpaidSickLeave;

    /**
     * 带薪病假天数
     */
    @Column(name = "paid_sick_days")
    private String paidSickDays;

    /**
     * 产假天数
     */
    @Column(name = "days_maternity_leave")
    private String daysMaternityLeave;

    /**
     * 流产假天数
     */
    @Column(name = "days_abortion_leave")
    private String daysAbortionLeave;

    /**
     * 护理假天数
     */
    @Column(name = "nursing_leave_days")
    private String nursingLeaveDays;

    /**
     * 产检假天数
     */
    @Column(name = "days_maternity_inspection_leave")
    private String daysMaternityInspectionLeave;

    /**
     * 哺乳假小时数
     */
    @Column(name = "breastfeeding_leave_hours")
    private String breastfeedingLeaveHours;

    /**
     * 婚假天数
     */
    @Column(name = "days_marriage_leave")
    private String daysMarriageLeave;

    /**
     * 年休假天数
     */
    @Column(name = "annual_leave_days")
    private String annualLeaveDays;

    /**
     * 加班调休假天数
     */
    @Column(name = "overtime_transfer_leave_days")
    private String overtimeTransferLeaveDays;

    /**
     * 出差调休假天数
     */
    @Column(name = "vacation_days")
    private String vacationDays;

    /**
     * 旷工天数
     */
    @Column(name = "absenteeism_days")
    private String absenteeismDays;

    /**
     * 迟到/早退次数
     */
    @Column(name = "late_early_leave")
    private String lateEarlyLeave;

    /**
     * 非项目现场出差天数
     */
    @Column(name = "days_non_project_trip")
    private String daysNonProjectTrip;

    /**
     * 项目现场出差天数
     */
    @Column(name = "days_project_trip")
    private String daysProjectTrip;

    /**
     * 外出天数
     */
    @Column(name = "days_out")
    private String daysOut;

    /**
     * 丧假天数
     */
    @Column(name = "days_funeral_leave")
    private String daysFuneralLeave;

    /**
     * 工伤假天数 
     */
    @Column(name = "days_work_injury_leave")
    private String daysWorkInjuryLeave;

    /**
     * 特殊假期天数
     */
    @Column(name = "number_special_holidays")
    private String numberSpecialHolidays;

    /**
     * 宗教假天数 
     */
    @Column(name = "religious_leave_days")
    private String religiousLeaveDays;

    /**
     * 医疗期病假天数
     */
    @Column(name = "sick_leave_days_medical_period")
    private String sickLeaveDaysMedicalPeriod;

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
     * 获取考勤表主键
     *
     * @return attendance_id - 考勤表主键
     */
    public String getAttendanceId() {
        return attendanceId;
    }

    /**
     * 设置考勤表主键
     *
     * @param attendanceId 考勤表主键
     */
    public void setAttendanceId(String attendanceId) {
        this.attendanceId = attendanceId;
    }

    /**
     * 获取集团编码
     *
     * @return obj_id - 集团编码
     */
    public String getObjId() {
        return objId;
    }

    /**
     * 设置集团编码
     *
     * @param objId 集团编码
     */
    public void setObjId(String objId) {
        this.objId = objId;
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
     * 获取业务单元
     *
     * @return busi - 业务单元
     */
    public String getBusi() {
        return busi;
    }

    /**
     * 设置业务单元
     *
     * @param busi 业务单元
     */
    public void setBusi(String busi) {
        this.busi = busi;
    }

    /**
     * 获取系统中心/事业部
     *
     * @return center - 系统中心/事业部
     */
    public String getCenter() {
        return center;
    }

    /**
     * 设置系统中心/事业部
     *
     * @param center 系统中心/事业部
     */
    public void setCenter(String center) {
        this.center = center;
    }

    /**
     * 获取业务系统/公司
     *
     * @return bukrs - 业务系统/公司
     */
    public String getBukrs() {
        return bukrs;
    }

    /**
     * 设置业务系统/公司
     *
     * @param bukrs 业务系统/公司
     */
    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    /**
     * 获取部门
     *
     * @return department - 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门
     *
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取科室
     *
     * @return department_office - 科室
     */
    public String getDepartmentOffice() {
        return departmentOffice;
    }

    /**
     * 设置科室
     *
     * @param departmentOffice 科室
     */
    public void setDepartmentOffice(String departmentOffice) {
        this.departmentOffice = departmentOffice;
    }

    /**
     * 获取组
     *
     * @return group - 组
     */
    public String getGroups() {
        return groups;
    }

    /**
     * 设置组
     *
     * @param groups 组
     */
    public void setGroups(String groups) {
        this.groups = groups;
    }

    /**
     * 获取岗位
     *
     * @return post - 岗位
     */
    public String getPost() {
        return post;
    }

    /**
     * 设置岗位
     *
     * @param post 岗位
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * 获取员工组
     *
     * @return staff_group - 员工组
     */
    public String getStaffGroup() {
        return staffGroup;
    }

    /**
     * 设置员工组
     *
     * @param staffGroup 员工组
     */
    public void setStaffGroup(String staffGroup) {
        this.staffGroup = staffGroup;
    }

    /**
     * 获取公司
     *
     * @return company - 公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司
     *
     * @param company 公司
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取常驻地
     *
     * @return btext - 常驻地
     */
    public String getBtext() {
        return btext;
    }

    /**
     * 设置常驻地
     *
     * @param btext 常驻地
     */
    public void setBtext(String btext) {
        this.btext = btext;
    }

    /**
     * 获取期间
     *
     * @return period - 期间
     */
    public String getPeriod() {
        return period;
    }

    /**
     * 设置期间
     *
     * @param period 期间
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * 获取当月出勤天数
     *
     * @return attendance_days - 当月出勤天数
     */
    public String getAttendanceDays() {
        return attendanceDays;
    }

    /**
     * 设置当月出勤天数
     *
     * @param attendanceDays 当月出勤天数
     */
    public void setAttendanceDays(String attendanceDays) {
        this.attendanceDays = attendanceDays;
    }

    /**
     * 获取平日加班时数
     *
     * @return overtime_hours_weekdays - 平日加班时数
     */
    public String getOvertimeHoursWeekdays() {
        return overtimeHoursWeekdays;
    }

    /**
     * 设置平日加班时数
     *
     * @param overtimeHoursWeekdays 平日加班时数
     */
    public void setOvertimeHoursWeekdays(String overtimeHoursWeekdays) {
        this.overtimeHoursWeekdays = overtimeHoursWeekdays;
    }

    /**
     * 获取休息日加班时数
     *
     * @return weekend_overtime_hours - 休息日加班时数
     */
    public String getWeekendOvertimeHours() {
        return weekendOvertimeHours;
    }

    /**
     * 设置休息日加班时数
     *
     * @param weekendOvertimeHours 休息日加班时数
     */
    public void setWeekendOvertimeHours(String weekendOvertimeHours) {
        this.weekendOvertimeHours = weekendOvertimeHours;
    }

    /**
     * 获取法定假日加班时数
     *
     * @return overtime_hours_holidays - 法定假日加班时数
     */
    public String getOvertimeHoursHolidays() {
        return overtimeHoursHolidays;
    }

    /**
     * 设置法定假日加班时数
     *
     * @param overtimeHoursHolidays 法定假日加班时数
     */
    public void setOvertimeHoursHolidays(String overtimeHoursHolidays) {
        this.overtimeHoursHolidays = overtimeHoursHolidays;
    }

    /**
     * 获取加班时数合计
     *
     * @return total_overtime_hours - 加班时数合计
     */
    public String getTotalOvertimeHours() {
        return totalOvertimeHours;
    }

    /**
     * 设置加班时数合计
     *
     * @param totalOvertimeHours 加班时数合计
     */
    public void setTotalOvertimeHours(String totalOvertimeHours) {
        this.totalOvertimeHours = totalOvertimeHours;
    }

    /**
     * 获取事假天数
     *
     * @return leave_days - 事假天数
     */
    public String getLeaveDays() {
        return leaveDays;
    }

    /**
     * 设置事假天数
     *
     * @param leaveDays 事假天数
     */
    public void setLeaveDays(String leaveDays) {
        this.leaveDays = leaveDays;
    }

    /**
     * 获取非带薪病假天数
     *
     * @return days_unpaid_sick_leave - 非带薪病假天数
     */
    public String getDaysUnpaidSickLeave() {
        return daysUnpaidSickLeave;
    }

    /**
     * 设置非带薪病假天数
     *
     * @param daysUnpaidSickLeave 非带薪病假天数
     */
    public void setDaysUnpaidSickLeave(String daysUnpaidSickLeave) {
        this.daysUnpaidSickLeave = daysUnpaidSickLeave;
    }

    /**
     * 获取带薪病假天数
     *
     * @return paid_sick_days - 带薪病假天数
     */
    public String getPaidSickDays() {
        return paidSickDays;
    }

    /**
     * 设置带薪病假天数
     *
     * @param paidSickDays 带薪病假天数
     */
    public void setPaidSickDays(String paidSickDays) {
        this.paidSickDays = paidSickDays;
    }

    /**
     * 获取产假天数
     *
     * @return days_maternity_leave - 产假天数
     */
    public String getDaysMaternityLeave() {
        return daysMaternityLeave;
    }

    /**
     * 设置产假天数
     *
     * @param daysMaternityLeave 产假天数
     */
    public void setDaysMaternityLeave(String daysMaternityLeave) {
        this.daysMaternityLeave = daysMaternityLeave;
    }

    /**
     * 获取流产假天数
     *
     * @return days_abortion_leave - 流产假天数
     */
    public String getDaysAbortionLeave() {
        return daysAbortionLeave;
    }

    /**
     * 设置流产假天数
     *
     * @param daysAbortionLeave 流产假天数
     */
    public void setDaysAbortionLeave(String daysAbortionLeave) {
        this.daysAbortionLeave = daysAbortionLeave;
    }

    /**
     * 获取护理假天数
     *
     * @return nursing_leave_days - 护理假天数
     */
    public String getNursingLeaveDays() {
        return nursingLeaveDays;
    }

    /**
     * 设置护理假天数
     *
     * @param nursingLeaveDays 护理假天数
     */
    public void setNursingLeaveDays(String nursingLeaveDays) {
        this.nursingLeaveDays = nursingLeaveDays;
    }

    /**
     * 获取产检假天数
     *
     * @return days_maternity_inspection_leave - 产检假天数
     */
    public String getDaysMaternityInspectionLeave() {
        return daysMaternityInspectionLeave;
    }

    /**
     * 设置产检假天数
     *
     * @param daysMaternityInspectionLeave 产检假天数
     */
    public void setDaysMaternityInspectionLeave(String daysMaternityInspectionLeave) {
        this.daysMaternityInspectionLeave = daysMaternityInspectionLeave;
    }

    /**
     * 获取哺乳假小时数
     *
     * @return breastfeeding_leave_hours - 哺乳假小时数
     */
    public String getBreastfeedingLeaveHours() {
        return breastfeedingLeaveHours;
    }

    /**
     * 设置哺乳假小时数
     *
     * @param breastfeedingLeaveHours 哺乳假小时数
     */
    public void setBreastfeedingLeaveHours(String breastfeedingLeaveHours) {
        this.breastfeedingLeaveHours = breastfeedingLeaveHours;
    }

    /**
     * 获取婚假天数
     *
     * @return days_marriage_leave - 婚假天数
     */
    public String getDaysMarriageLeave() {
        return daysMarriageLeave;
    }

    /**
     * 设置婚假天数
     *
     * @param daysMarriageLeave 婚假天数
     */
    public void setDaysMarriageLeave(String daysMarriageLeave) {
        this.daysMarriageLeave = daysMarriageLeave;
    }

    /**
     * 获取年休假天数
     *
     * @return annual_leave_days - 年休假天数
     */
    public String getAnnualLeaveDays() {
        return annualLeaveDays;
    }

    /**
     * 设置年休假天数
     *
     * @param annualLeaveDays 年休假天数
     */
    public void setAnnualLeaveDays(String annualLeaveDays) {
        this.annualLeaveDays = annualLeaveDays;
    }

    /**
     * 获取加班调休假天数
     *
     * @return overtime_transfer_leave_days - 加班调休假天数
     */
    public String getOvertimeTransferLeaveDays() {
        return overtimeTransferLeaveDays;
    }

    /**
     * 设置加班调休假天数
     *
     * @param overtimeTransferLeaveDays 加班调休假天数
     */
    public void setOvertimeTransferLeaveDays(String overtimeTransferLeaveDays) {
        this.overtimeTransferLeaveDays = overtimeTransferLeaveDays;
    }

    /**
     * 获取出差调休假天数
     *
     * @return vacation_days - 出差调休假天数
     */
    public String getVacationDays() {
        return vacationDays;
    }

    /**
     * 设置出差调休假天数
     *
     * @param vacationDays 出差调休假天数
     */
    public void setVacationDays(String vacationDays) {
        this.vacationDays = vacationDays;
    }

    /**
     * 获取旷工天数
     *
     * @return absenteeism_days - 旷工天数
     */
    public String getAbsenteeismDays() {
        return absenteeismDays;
    }

    /**
     * 设置旷工天数
     *
     * @param absenteeismDays 旷工天数
     */
    public void setAbsenteeismDays(String absenteeismDays) {
        this.absenteeismDays = absenteeismDays;
    }

    /**
     * 获取迟到/早退次数
     *
     * @return late_early_leave - 迟到/早退次数
     */
    public String getLateEarlyLeave() {
        return lateEarlyLeave;
    }

    /**
     * 设置迟到/早退次数
     *
     * @param lateEarlyLeave 迟到/早退次数
     */
    public void setLateEarlyLeave(String lateEarlyLeave) {
        this.lateEarlyLeave = lateEarlyLeave;
    }

    /**
     * 获取非项目现场出差天数
     *
     * @return days_non_project_trip - 非项目现场出差天数
     */
    public String getDaysNonProjectTrip() {
        return daysNonProjectTrip;
    }

    /**
     * 设置非项目现场出差天数
     *
     * @param daysNonProjectTrip 非项目现场出差天数
     */
    public void setDaysNonProjectTrip(String daysNonProjectTrip) {
        this.daysNonProjectTrip = daysNonProjectTrip;
    }

    /**
     * 获取项目现场出差天数
     *
     * @return days_project_trip - 项目现场出差天数
     */
    public String getDaysProjectTrip() {
        return daysProjectTrip;
    }

    /**
     * 设置项目现场出差天数
     *
     * @param daysProjectTrip 项目现场出差天数
     */
    public void setDaysProjectTrip(String daysProjectTrip) {
        this.daysProjectTrip = daysProjectTrip;
    }

    /**
     * 获取外出天数
     *
     * @return days_out - 外出天数
     */
    public String getDaysOut() {
        return daysOut;
    }

    /**
     * 设置外出天数
     *
     * @param daysOut 外出天数
     */
    public void setDaysOut(String daysOut) {
        this.daysOut = daysOut;
    }

    /**
     * 获取丧假天数
     *
     * @return days_funeral_leave - 丧假天数
     */
    public String getDaysFuneralLeave() {
        return daysFuneralLeave;
    }

    /**
     * 设置丧假天数
     *
     * @param daysFuneralLeave 丧假天数
     */
    public void setDaysFuneralLeave(String daysFuneralLeave) {
        this.daysFuneralLeave = daysFuneralLeave;
    }

    /**
     * 获取工伤假天数 
     *
     * @return days_work_injury_leave - 工伤假天数 
     */
    public String getDaysWorkInjuryLeave() {
        return daysWorkInjuryLeave;
    }

    /**
     * 设置工伤假天数 
     *
     * @param daysWorkInjuryLeave 工伤假天数 
     */
    public void setDaysWorkInjuryLeave(String daysWorkInjuryLeave) {
        this.daysWorkInjuryLeave = daysWorkInjuryLeave;
    }

    /**
     * 获取特殊假期天数
     *
     * @return number_special_holidays - 特殊假期天数
     */
    public String getNumberSpecialHolidays() {
        return numberSpecialHolidays;
    }

    /**
     * 设置特殊假期天数
     *
     * @param numberSpecialHolidays 特殊假期天数
     */
    public void setNumberSpecialHolidays(String numberSpecialHolidays) {
        this.numberSpecialHolidays = numberSpecialHolidays;
    }

    /**
     * 获取宗教假天数 
     *
     * @return religious_leave_days - 宗教假天数 
     */
    public String getReligiousLeaveDays() {
        return religiousLeaveDays;
    }

    /**
     * 设置宗教假天数 
     *
     * @param religiousLeaveDays 宗教假天数 
     */
    public void setReligiousLeaveDays(String religiousLeaveDays) {
        this.religiousLeaveDays = religiousLeaveDays;
    }

    /**
     * 获取医疗期病假天数
     *
     * @return sick_leave_days_medical_period - 医疗期病假天数
     */
    public String getSickLeaveDaysMedicalPeriod() {
        return sickLeaveDaysMedicalPeriod;
    }

    /**
     * 设置医疗期病假天数
     *
     * @param sickLeaveDaysMedicalPeriod 医疗期病假天数
     */
    public void setSickLeaveDaysMedicalPeriod(String sickLeaveDaysMedicalPeriod) {
        this.sickLeaveDaysMedicalPeriod = sickLeaveDaysMedicalPeriod;
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