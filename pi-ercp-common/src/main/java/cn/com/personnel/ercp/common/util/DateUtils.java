package cn.com.personnel.ercp.common.util;


import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateUtils {

    /**
     * 获取季度日期
     *
     * @param date       参与计算的时间
     * @param addQuarter 间隔几个季度
     * @return
     */
    public static Date getQuarterDate(Date date, int addQuarter) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int currentMonth = calendar.get(Calendar.MONTH) + addQuarter * 3;
        calendar.set(calendar.MONTH, currentMonth);
        Date dateDate = calendar.getTime();
        return dateDate;
    }

    /**
     * 获取指定几个月后的日期
     *
     * @param date
     * @param month
     * @return
     */
    public static Date getDate(Date date, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int currentMonth = calendar.get(Calendar.MONTH) + month;
        calendar.set(calendar.MONTH, currentMonth);
        Date dateDate = calendar.getTime();
        return dateDate;
    }

    /**
     * 计算下个月时间
     *
     * @param date
     * @return
     */
    public static Date nextMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        calendar.set(calendar.MONTH, currentMonth);
        Date dateDate = calendar.getTime();
        return dateDate;
    }

    /**
     * 获取前一天时间
     *
     * @param data
     * @return
     */
    public static Date getYesterdayDate(Date data) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DATE, -1);
        Date dateDate = calendar.getTime();
        return dateDate;
    }

    /**
     * 获取前一天时间
     *
     * @param data
     * @return
     */
    public static Date getTomorrow(Date data) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DATE, +1);
        Date dateDate = calendar.getTime();
        return dateDate;
    }

    /**
     * 获取月份第一天
     *
     * @param date
     * @return
     */
    public static Date getMonthFistDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }

    /**
     * 获取月份最后一天
     *
     * @param date
     * @return
     */
    public static Date getMonthLastDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }

    /**
     * 格式化时间
     *
     * @param date
     * @return
     */
    public static String dateFormat(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    /**
     * 字符串转日期
     *
     * @param dateStr
     * @return
     */
    public static Date StrToDate(String dateStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
        try {
            return simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 增加年
     *
     * @param dateStr
     * @return
     */
    public static Date getAddYearDate(String dateStr, Integer year) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(simpleDateFormat.parse(dateStr));
            calendar.add(Calendar.YEAR, year);
            return calendar.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 时间格式化到月份
     *
     * @param date
     * @return
     */
    public static String dateFormatToMonth(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        return format.format(date);
    }

    /**
     * 计算时间差
     *
     * @param firstDate
     * @param lastDate
     * @return
     */
    public static long calculateTimeDifference(Date firstDate, Date lastDate) {
        long start = firstDate.getTime();
        long end = lastDate.getTime();
        long l = end - start;
        long day = l / (24 * 60 * 60 * 1000) + 1;
        return day;
    }

    /**
     * 计算相差月份
     *
     * @param firstDate
     * @param lastDate
     * @return
     */
    public static long calculateMonthDifference(Date firstDate, Date lastDate) {
        //TODO 此方法有待验证
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(firstDate);
        c2.setTime(lastDate);
        int year1 = c1.get(Calendar.YEAR);
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);
        // 获取年的差值 
        int yearInterval = year1 - year2;
        // 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
        if (month1 < month2 || month1 == month2 && day1 < day2) {
            yearInterval--;
        }
        // 获取月数差值
        int monthInterval = (month1 + 12) - month2;
        if (day1 < day2) {
            monthInterval--;
        }
        monthInterval %= 12;
        int monthsDiff = Math.abs(yearInterval * 12 + monthInterval);
        return monthsDiff;
    }

    /**
     * 比较两个日期的大小
     *
     * @param early
     * @param late
     * @return
     */
    public static boolean compareDate(Date early, Date late) {
        long o = early.getTime();
        long t = late.getTime();
        return o < t ? true : false;
    }

    /**
     * 比较两个时间是否在同一个月份
     *
     * @param date1
     * @param date2
     * @return
     */
    public static boolean compareSameMonth(Date date1, Date date2) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMM");
        return fmt.format(date1).equals(fmt.format(date2));
    }

    public static Date returnDate(Date date, Integer year, Integer month, Integer day, Integer type) {
        Calendar cal = Calendar.getInstance();
        if (date != null)
            cal.setTime(date);
        int days = cal.get(Calendar.DATE);
        int months = cal.get(Calendar.MONTH);
        int years = cal.get(Calendar.YEAR);
        cal.set(Calendar.YEAR, years + year);
        cal.set(Calendar.MONTH, months + month);
        cal.set(Calendar.DATE, days + day);
        if (type == 1) {//取月的第一天
            cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        }
        if (type == 2) {//取月的最后一天
            cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        }
        return cal.getTime();
    }

    /**
     * 根据时间转换为指定格式的字符串
     * @param date      需转换格式的时间，默认为当前时间
     * @param format    需转换的格式，默认为 yyyy-MM-dd
     * @return
     *
     */
    public static String returnDateFormat(Date date,String format){
        if (date == null)
            date = new Date();
        if (StringUtils.isBlank(format))
            format = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String strDate = sdf.format(date);
        return strDate;
    }

    /**
     * 是否为该时间月份的最后一天
     * @param date
     * @return
     */
    public static boolean isLastMonthDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int getDay = calendar.get(Calendar.DAY_OF_MONTH);
        if(getDay == calendar.getActualMaximum(Calendar.DAY_OF_MONTH)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 功能：判断字符串是否为日期格式yyyy-MM-dd 或yyyy-MM-dd HH:mm:ss
     *
     * @param strDate
     * @return
     */
    public static boolean isDate(String strDate) {
        Pattern pattern = Pattern
                .compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
        Matcher m = pattern.matcher(strDate);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 根据身份证号计算年龄
     * @param sfzjh
     * @return
     */
    public static String getAge(String sfzjh){
        if(sfzjh == null || "".equals(sfzjh) ){
            return "身份证件号有误,无法计算年龄";
        }

        if (sfzjh.length() != 15 && sfzjh.length() != 18){
            return "身份证件号有误,无法计算年龄";
        }

        String age="";

        Calendar cal = Calendar.getInstance();
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH)+1;
        int dayNow = cal.get(Calendar.DATE);

        int year = Integer.valueOf(sfzjh.substring(6, 10));
        int month = Integer.valueOf(sfzjh.substring(10,12));
        int day = Integer.valueOf(sfzjh.substring(12,14));

        if ((month < monthNow) || (month == monthNow && day<= dayNow) ){
            age = String.valueOf(yearNow - year);
        }else {
            age = String.valueOf(yearNow - year-1);
        }

        return age;
    }
}



