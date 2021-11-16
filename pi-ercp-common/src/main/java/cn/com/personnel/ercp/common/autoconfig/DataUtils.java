package cn.com.personnel.ercp.common.autoconfig;

import cn.com.personnel.ercp.framework.exception.BusinessException;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class DataUtils {

    public static Map<String, Object> objectToMap(Object obj) throws Exception {
        if(obj == null)
            return null;

        Map<String, Object> map = new HashMap<String, Object>();

        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor property : propertyDescriptors) {
            String key = property.getName();
            if (key.compareToIgnoreCase("class") == 0) {
                continue;
            }
            Method getter = property.getReadMethod();
            Object value = getter!=null ? getter.invoke(obj) : null;
            map.put(key, value);
        }
        return map;
    }

    public static List<Map<String, Object>> objectListToMapList(List<Object> objs) throws Exception {
        if(objs == null)
            return null;
        List<Map<String, Object>> mapList = new ArrayList<>();
        if(objs.size() > 0){
            for(Object obj : objs){
                Map<String, Object> map = new HashMap<String, Object>();

                BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
                PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
                for (PropertyDescriptor property : propertyDescriptors) {
                    String key = property.getName();
                    if (key.compareToIgnoreCase("class") == 0) {
                        continue;
                    }
                    Method getter = property.getReadMethod();
                    Object value = getter!=null ? getter.invoke(obj) : null;
                    map.put(key, value);
                }
                mapList.add(map);
            }
        }
        return mapList;
    }

    public static List<Map<String, String>> objectListToStringMapList(List<Object> objs) throws Exception {
        if(objs == null)
            return null;
        List<Map<String, String>> mapList = new ArrayList<>();
        if(objs.size() > 0){
            for(Object obj : objs){
                Map<String, String> map = new HashMap<>();

                BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
                PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
                for (PropertyDescriptor property : propertyDescriptors) {
                    String key = property.getName();
                    System.out.println("key:" + key);
                    if (key.compareToIgnoreCase("class") == 0) {
                        continue;
                    }
                    Method getter = property.getReadMethod();
                    String value = getter!=null ? getter.invoke(obj).toString() : null;
                    map.put(key, value);
                }
                mapList.add(map);
            }
        }
        return mapList;
    }


    public static long getDistanceDays(String date) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        long days = 0;
        try {
            Date time = df.parse(date);//String转Date
            Date now = new Date();//获取当前时间
            long time1 = time.getTime();
            long time2 = now.getTime();
            long diff = time1 - time2;
            days = diff / (1000 * 60 * 60 * 24);
        } catch (Exception e) {
            throw new BusinessException("时间对比失败");
        }
        return days;//正数表示在当前时间之后，负数表示在当前时间之前
    }


}

