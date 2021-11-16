package cn.com.personnel.ercp.common.util;

import java.util.Base64;

public class Base64Utils {

    /**
     * 将字符串加密
     * @param param
     * @return
     */
    public static String getEncodeBase64(String param){
        if(param == null) return null;
        return Base64.getEncoder().encodeToString(param.trim().getBytes());
    }

    /**
     * 将字符串解密
     * @param param
     * @return
     */
    public String getDecodeBase64(String param){
        if(param == null) return null;
        return new String(Base64.getDecoder().decode(param.trim().getBytes()));
    }

}
