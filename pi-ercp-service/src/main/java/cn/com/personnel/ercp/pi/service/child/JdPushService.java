package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.common.kit.CommonConfig;
import cn.com.personnel.ercp.common.kit.JdPushVo;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.device.TagAliasResult;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class JdPushService implements IJdPushService {
    @Autowired
    CommonConfig commonConfig;

    private String appKey = commonConfig.getAppKey();
    private String masterSecret = commonConfig.getMasterSecret();
    private JPushClient jpushClient = new JPushClient(masterSecret, appKey);
    // 极光推送>>Android
    @Override
    public void jpushAndroid(JdPushVo jdPushVo) {
        try {
            TagAliasResult deviceTagAlias = jpushClient.getDeviceTagAlias(jdPushVo.getDeviceTagAlias());
            jdPushVo.setAlias(deviceTagAlias.alias);
            System.out.println(jdPushVo.toString());
        } catch (APIConnectionException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (APIRequestException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        // 推送的关键,构造一个payload
        Map<String, String> m = new HashMap<String, String>();
        m.put("title", jdPushVo.getTitle());
        m.put("alert", jdPushVo.getAlert());
        PushPayload payload = PushPayload.newBuilder().setPlatform(Platform.android())// 指定android平台的用户

//	            .setAudience(Audience.all())//你项目中的所有用户
                .setAudience(Audience.alias(jdPushVo.getAlias()))// 根据别名推送
                .setNotification(Notification.android(m.get("alert"), m.get("title"), m))
                // 发送内容,这里不要盲目复制粘贴,这里是我从controller层中拿过来的参数)
                .setOptions(Options.newBuilder().setApnsProduction(false).build())
                // 这里是指定开发环境,不用设置也没关系
                // .setMessage(Message.content(parm.get("msg")))//自定义信息
                .build();
        try {
            PushResult pu = jpushClient.sendPush(payload);
            System.out.println(pu.toString());
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }

    // 极光推送>>ios
    @Override
    public void jpushIOS(Map<String, String> parm) {
        PushPayload payload = PushPayload.newBuilder().setPlatform(Platform.ios())// ios平台的用户
                .setAudience(Audience.all())// 所有用户
                .setNotification(
                        Notification.newBuilder()
                                .addPlatformNotification(IosNotification.newBuilder().setAlert(parm.get("msg"))
                                        .setBadge(+1).setSound("happy")// 这里是设置提示音(更多可以去官网看看)
                                        .addExtras(parm).build())
                                .build())
                .setOptions(Options.newBuilder().setApnsProduction(false).build())
                .setMessage(Message.newBuilder().setMsgContent(parm.get("msg")).addExtras(parm).build())// 自定义信息
                .build();

        try {
            PushResult pu = jpushClient.sendPush(payload);
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }

    //设置别名
    @Override
    public void setAlias(String deviceTagAlias, String alias) {
        HashSet<String> tagsToAdd = new HashSet<>();
        HashSet<String> tagsToRemove = new HashSet<>();
        try {
            jpushClient.updateDeviceTagAlias(deviceTagAlias, alias, tagsToAdd, tagsToRemove);
        } catch (APIConnectionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (APIRequestException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //删除别名
    @Override
    public void delAlias(String username) {
        try {
            jpushClient.deleteAlias(username,null);
        } catch (APIConnectionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (APIRequestException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
