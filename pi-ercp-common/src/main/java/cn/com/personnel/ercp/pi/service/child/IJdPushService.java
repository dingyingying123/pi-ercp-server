package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.common.kit.JdPushVo;

import java.util.Map;

public interface IJdPushService {
    // 极光推送>>Android
    void jpushAndroid(JdPushVo jdPushVo);

    // 极光推送>>ios
    void jpushIOS(Map<String, String> parm);

    //设置别名
    void setAlias(String deviceTagAlias, String alias);

    //删除别名
    void delAlias(String username);
}
