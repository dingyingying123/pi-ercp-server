package cn.com.personnel.ercp;

import cn.com.personnel.ercp.common.util.DateUtils;
import org.springframework.util.DigestUtils;

public class TestMain {
    public static void main(String[] args){
        String userId="52972";
        String md5 =  DigestUtils.md5DigestAsHex((userId + "@"+ "sfs#goldwind123").getBytes());
        String url = "http://sfs.goldwind.com.cn/xd/sfs_xd/autoLogin/autoLogin?userId="+userId+"&sign="+md5;
        System.out.println(url);
//        for(int i = 0; i < 197; i++){
//            System.out.println(UUIDKit.getUUID());
//        String o = " 65050220150000075";
//        System.out.println(o.trim());
//        o = o.replace((char) 12288, ' ');
//        System.out.println(o.trim());
//        o = o.replaceAll("\\u00A0","");
//        System.out.println(o.trim());
//        }
//        String ss = "2021-05-10 13:31:00";
//        System.out.println(DateUtils.isDate(ss));
    }
}

