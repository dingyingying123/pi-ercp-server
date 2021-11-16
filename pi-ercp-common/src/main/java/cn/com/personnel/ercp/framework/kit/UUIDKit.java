package cn.com.personnel.ercp.framework.kit;

import java.util.UUID;

/**
 * @author 33925
 *
 */
public class UUIDKit {

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
