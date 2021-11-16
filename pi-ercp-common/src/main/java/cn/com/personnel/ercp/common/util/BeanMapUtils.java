package cn.com.personnel.ercp.common.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.cglib.beans.BeanMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BeanMapUtils {
    /**
     * 将对象装换为map
     *
     * @param bean
     * @return
     */
    public static <T> Map<String, Object> beanToMap(T bean) {
        Map<String, Object> map = new HashMap<>();
        if (bean != null) {
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()) {
                map.put(key + "", beanMap.get(key));
            }
        }
        return map;
    }

    /**
     * 将对象装换为map
     *
     * @param bean
     * @return
     */
    public static Map<String, String> beanToMapString(Object bean) {
        Map<String, String> map = new HashMap<>();
        if (bean != null) {
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()) {
                map.put(key + "", beanMap.get(key) == null ? "" : beanMap.get(key).toString());
            }
        }
        return map;
    }

    /**
     * 将map装换为javabean对象
     *
     * @param map
     * @param bean
     * @return
     */
    public static <T> T mapToBean(Map<String, Object> map, T bean) {
        BeanMap beanMap = BeanMap.create(bean);
        beanMap.putAll(map);
        return bean;
    }

    public static <T1, T2> T2 AutoMap(T1 orign, T2 target, Class<T2> t2Class) {
        try {
            if (target == null) {
                target = t2Class.newInstance();
            }
            Map<String, Object> map = new HashMap<>();
            BeanMap beanMap = BeanMap.create(orign);
            for (Object key : beanMap.keySet()) {
                Object value = beanMap.get(key);
                if (value == null) continue;
                if (value instanceof String) {
                    String stringValue = (String) value;
                    if (stringValue.endsWith(".0")) {
                        stringValue = stringValue.substring(0, stringValue.length() - 2);
                    }
                    if (StringUtils.isBlank(stringValue)) {
                        map.put(key + "", null);
                    } else {
                        map.put(key + "", stringValue);
                    }
                } else
                    map.put(key + "", beanMap.get(key));
            }
            beanMap = BeanMap.create(target);
            beanMap.putAll(map);
            return target;
        } catch (Exception e) {
            return null;
        }

    }

    public static Map<String, String> getParamMap(JSONObject jsonObject) {
        Set<String> strings = jsonObject.keySet();
        Map<String, String> result = new HashMap<>();
        //返回json获取value值，重新拼格式
        for (Object key : strings) {
            Object value = jsonObject.get(key);
            if (value == null || StringUtils.isBlank(value.toString())) {
                continue;
            }
            result.put(key + "", ((String) value).trim());
        }
        return result;
    }

    public static boolean tryParseInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean tryParseDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
