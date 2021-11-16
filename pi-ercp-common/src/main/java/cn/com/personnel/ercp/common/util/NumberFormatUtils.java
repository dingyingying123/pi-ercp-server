package cn.com.personnel.ercp.common.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NumberFormatUtils {

    /**
     * 格式化数字
     * @param number
     * @return
     */
    public static String format(Object number){
        DecimalFormat instance = (DecimalFormat) DecimalFormat.getInstance();
        instance.applyPattern("#,####.00");
        String format = instance.format(number);
        return format;
    }
}
