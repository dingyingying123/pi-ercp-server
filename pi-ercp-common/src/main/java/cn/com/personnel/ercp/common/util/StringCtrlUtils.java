package cn.com.personnel.ercp.common.util;

import org.apache.commons.lang3.StringUtils;

public class StringCtrlUtils {

    public static String changeString(String fex){
        if(StringUtils.isNotEmpty(fex))
            return fex.replaceAll("\\\\", "/");
        return fex;
    }
}
