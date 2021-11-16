package cn.com.personnel.ercp.common.util;

import org.joda.time.LocalDate;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConvert {

    /**
     * 获取字符串
     * @param strDate
     * @return
     */
    public static Date strToDate(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMM");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    public static String dateToStr(java.util.Date dateDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String dateString = formatter.format(dateDate);
        return dateString;
    }

    /**
     * 获取最后一天时间
     * @param month
     * @return
     */
    public static String lastDate(String month){
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
        Calendar ca=Calendar.getInstance();
        ca.setTime(strToDate(month));
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        return format.format(ca.getTime());
    }

    /**
     * 获取第一天
     * @param month
     * @return
     */
    public static String firstDate(String month){
        Date date = strToDate(month);
        return dateToStr(date);
    }

    public static Date stringToDate(String str){
        LocalDate date = LocalDate.parse(str);
        return date.toDate();
    }

    public static void main(String[] args) {
        System.out.println(lastDate("202005"));
        System.out.println(firstDate("202005"));
        System.out.println(stringToDate("2020-03-05"));
    }
}
