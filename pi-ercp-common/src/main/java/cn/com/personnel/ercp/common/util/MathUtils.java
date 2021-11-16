package cn.com.personnel.ercp.common.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathUtils {
    public static double irr(double[] income) {
        return irr(income, 0.1D);
    }

    public static double irr(double[] values, double guess) {
        int maxIterationCount = 20;
        double absoluteAccuracy = 1.0E-007D;

        double x0 = guess;

        int i = 0;
        while (i < maxIterationCount) {
            double fValue = 0.0D;
            double fDerivative = 0.0D;
            for (int k = 0; k < values.length; k++) {
                fValue += values[k] / Math.pow(1.0D + x0, k);
                fDerivative += -k * values[k] / Math.pow(1.0D + x0, k + 1);
            }
            double x1 = x0 - fValue / fDerivative;
            if (Math.abs(x1 - x0) <= absoluteAccuracy) {
                return x1;
            }
            x0 = x1;
            i++;
        }
        return (0.0D / 0.0D);
    }

    /**
     * 计算两个日期之间的天数
     * @param one
     * @param two
     * @return
     */
    public static Integer daysBetween(Date one, Date two) {
        long difference = (one.getTime() - two.getTime()) / (24 * 60 * 60 * 1000);
        return new Integer((int) Math.abs(difference));
    }

    /**
     * 获取两个日期相差的月数
     */
    public static int getMonthDiff(Date d1, Date d2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
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
     * 计算两个日期之间相差多少个月零几天
     * @param d1
     * @param d2
     * @return
     */
    public static Map<String, Integer> getMonthsDaysBetween(Date d1, Date d2){
        Map<String, Integer> map = new HashMap<>();
        Integer months = getMonthDiff(d1, d2);
        Calendar from = Calendar.getInstance();
        Calendar to = Calendar.getInstance();
        from.setTime(d1);
        to.setTime(d2);
        if(d1.getTime() > d2.getTime()){
            to.add(Calendar.MONTH, months);
        }else{
            from.add(Calendar.MONTH, months);
        }
        Integer days = daysBetween(from.getTime(), to.getTime());
        map.put("months", months);
        map.put("days", days);
        return map;
    }

    /**迭代次数*/
//    public static int LOOPNUM=1000;
    /**最小差异*/
    public static final double MINDIF=0.00000001;


    /**
     * @desc 使用方法参考main方法
     * @param cashFlow  资金流
     * @return 收益率
     */
    public static double getIrr(List<Double> cashFlow){
        int LOOPNUM=200;
        double flowOut=cashFlow.get(0);
        double minValue=0d;
        double maxValue=1d;
        double testValue=0d;
        while(LOOPNUM>0){
            testValue=(minValue+maxValue)/2;
            double npv=NPV(cashFlow,testValue);
            if(Math.abs(flowOut+npv)<MINDIF){
                break;
            }else if(Math.abs(flowOut)>npv){
                maxValue=testValue;
            }else{
                minValue=testValue;
            }
            LOOPNUM--;
        }
        return testValue;
    }

    public static double NPV(List<Double> flowInArr,double rate){
        double npv=0;
        for(int i=1;i<flowInArr.size();i++){
            npv+=flowInArr.get(i)/Math.pow(1+rate, i);
        }
        return npv;
    }

    /**
     * 去除字符串前边的0
     * @param str
     * @return
     */
    public static String removeZero(String str){
        if(str == null)return null;
        return str.replaceAll("^(0+)", "");
    }

    /**
     * 补0
     * @param str
     * @return
     */
    public static String addZero(String str, int size) {
        return StringUtils.leftPad(str, size, "0");
    }

    /**
     * 根据日期获取格式yyyyMM字符串
     * @param date
     * @return
     */
    public static String getSelectMonth(Date date) {
        String selectMonth;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String month = calendar.get(Calendar.MONTH) + "";
        if(month.length() == 1) {
            if("0".equals(month)){
                selectMonth = calendar.get(Calendar.YEAR) - 1 + "12";
            }else{
                selectMonth = calendar.get(Calendar.YEAR) + "0" + month;
            }
        }else{
            selectMonth = "" + calendar.get(Calendar.YEAR) + Calendar.MONTH;
        }
        return selectMonth;
    }

    /**
     * 根据日期获取月份MM字符串
     * @param date
     * @return
     */
    public static String getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String month = calendar.get(Calendar.MONTH) + "";
        if(month.length() == 1) {
            return "0" + month;
        }
        return month;
    }

    /**
     * 判断字符串是否为数字
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*\\.?[0-9]+");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    /**
     * 去掉字符串空格
     * @param str
     * @return
     */
    public static String trimStr(String str) {
        if(str == null) return null;
        return str.trim();
    }

    /**
     * 调整负数中负号位置
     * @param str
     * @return
     */
    public static String signStr(String str) {
        if(str == null) return null;
        str = trimStr(str);
        if(str.contains("-")){
            if(str.indexOf("-") == str.length()-1){
                return Math.abs(Double.parseDouble(str.substring(0, str.length() - 1))) + "";
            }else{
                return null;
            }
        }
        return str;
    }

    public static void main(String[] args) {
//        double[] income = {-9272.49,0,0,0,0,0,0,0,0,0,888.49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,888.49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,888.49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,888.49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,888.49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,888.49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,888.49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,888.49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,888.49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,888.49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,888.49,};
//        double ret = irr(income,0.00001d) ;
//        System.out.println(new BigDecimal(ret));
//        double flowOut=-237000d;
//        List<Double> flowInArr=new ArrayList<Double>();
//        flowInArr.add(flowOut);
//        flowInArr.add(22643.999991d);
//        flowInArr.add(22643.999991d);
//        flowInArr.add(22643.999991d);
//        flowInArr.add(22643.999991d);
//        flowInArr.add(22643.999991d);
//        flowInArr.add(22643.999991d);
//        flowInArr.add(22643.999991d);
//        flowInArr.add(22643.999991d);
//        flowInArr.add(22643.999991d);
//        flowInArr.add(22643.999991d);
//        flowInArr.add(22643.999991d);
//        flowInArr.add(22643.999991d);


        System.out.println(signStr("5323.92-"));
    }
}
