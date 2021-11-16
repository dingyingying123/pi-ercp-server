package cn.com.personnel.springboot.framework.kit;


import cn.com.personnel.springboot.framework.json.Json;

/**
 * JsonKit.
 */
public class JsonKit {

    public static <T> T parse(String jsonString, Class<T> type) {
        return Json.getJson().parse(jsonString, type);
    }

    public static String toJson(Object object,String datePattern) {
        Json json = Json.getJson();
        json.setDatePattern(datePattern) ;
        return json.toJson(object);
    }


    public static String toJson(Object object) {
        return toJson(object,"yyyy-MM-dd");
    }

}
