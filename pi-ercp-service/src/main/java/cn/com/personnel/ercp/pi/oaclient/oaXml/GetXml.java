/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.oaclient.oaXml;

import cn.com.personnel.ercp.pi.oaclient.oaXmlEnum.OaConfig;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author qinerhu
 *
 */
public class GetXml {

    public static String xmlString(Object obj1, List<?> obj2s) {
        StringBuffer buffer = new StringBuffer();
        System.out.println("开始拼接xml---------------------------------------------");
        buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
        buffer.append("<formExport version=\"2.0\">\r\n");
        buffer.append("<summary id=\"\" name=\"\"/>\r\n");
        buffer.append("<values>\r\n");
        String[] fieldNames = getFiledName(obj1);
        for (int i = 0; i < fieldNames.length; i++) {
            buffer.append("<column name=\"" + OaConfig.index2Name(fieldNames[i]) + "\">\r\n");
            buffer.append("<value>");
            buffer.append(getFieldValueByName(fieldNames[i], obj1));
            buffer.append("</value>\r\n");
            buffer.append("</column>\r\n");
        }

        buffer.append("</values>\r\n");
        buffer.append("<subForms>\r\n");
        buffer.append("<subForm>\r\n<values>\r\n");
        for (Object obj2 : obj2s) {
            buffer.append("<row>\r\n");
            String[] fieldNames2 = getFiledName(obj2);
            for (int i = 0; i < fieldNames2.length; i++) {
                buffer.append("<column name=\"" + OaConfig.index2Name(fieldNames2[i]) + "\">\r\n");
                buffer.append("<value>");
                buffer.append(getFieldValueByName(fieldNames2[i], obj2) != null
                        ? getFieldValueByName(fieldNames2[i], obj2)
                        : "");
                buffer.append("</value>\r\n");
                buffer.append("</column>\r\n");
            }
            buffer.append("</row>\r\n");
        }

        buffer.append("</values>\r\n</subForm>\r\n");
        buffer.append("</subForms>\r\n");
        buffer.append("</formExport>\r\n");
        System.out.println("结束拼接xml---------------------------------------------");
        return buffer.toString();
    }

    /**
     * 拼接的消息循环体有两种循环体内容
     * 
     * @param obj1
     * @param obj2s
     * @param obj3s
     * @return
     */
    public static String xmlString(Object obj1, List<?> obj2s, List<?> obj3s, List<?> obj4s, List<?> obj5s) {
        StringBuffer buffer = new StringBuffer();
        System.out.println("开始拼接xml---------------------------------------------");
        buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
        buffer.append("<formExport version=\"2.0\">\r\n");
        buffer.append("<summary id=\"\" name=\"\"/>\r\n");
        buffer.append("<values>\r\n");
        String[] fieldNames = getFiledName(obj1);
        for (int i = 0; i < fieldNames.length; i++) {
            buffer.append("<column name=\"" + OaConfig.index2Name(fieldNames[i]) + "\">\r\n");
            buffer.append("<value>");
            buffer.append(getFieldValueByName(fieldNames[i], obj1) != null ? getFieldValueByName(fieldNames[i], obj1)
                    : "");
            buffer.append("</value>\r\n");
            buffer.append("</column>\r\n");
        }

        buffer.append("</values>\r\n");
        buffer.append("<subForms>\r\n");
        buffer.append("<subForm>\r\n<values>\r\n");
        for (Object obj2 : obj2s) {
            buffer.append("<row>\r\n");
            String[] fieldNames2 = getFiledName(obj2);
            for (int i = 0; i < fieldNames2.length; i++) {
                buffer.append("<column name=\"" + OaConfig.index2Name(fieldNames2[i]) + "\">\r\n");
                buffer.append("<value>");
                buffer.append(getFieldValueByName(fieldNames2[i], obj2) != null
                        ? getFieldValueByName(fieldNames2[i], obj2)
                        : "");
                buffer.append("</value>\r\n");
                buffer.append("</column>\r\n");
            }
            buffer.append("</row>\r\n");
        }
        buffer.append("</values>\r\n</subForm>\r\n");
        buffer.append("<subForm>\r\n<values>\r\n");

        for (Object obj4 : obj4s) {
            buffer.append("<row>\r\n");
            String[] fieldNames2 = getFiledName(obj4);
            for (int i = 0; i < fieldNames2.length; i++) {
                buffer.append("<column name=\"" + OaConfig.index2Name(fieldNames2[i]) + "\">\r\n");
                buffer.append("<value>");
                buffer.append(getFieldValueByName(fieldNames2[i], obj4) != null
                        ? getFieldValueByName(fieldNames2[i], obj4)
                        : "");
                buffer.append("</value>\r\n");
                buffer.append("</column>\r\n");
            }
            buffer.append("</row>\r\n");
        }
        buffer.append("</values>\r\n</subForm>\r\n");

        buffer.append("<subForm>\r\n<values>\r\n");
        for (Object obj3 : obj3s) {
            buffer.append("<row>\r\n");
            String[] fieldNames2 = getFiledName(obj3);
            for (int i = 0; i < fieldNames2.length; i++) {
                buffer.append("<column name=\"" + OaConfig.index2Name(fieldNames2[i]) + "\">\r\n");
                buffer.append("<value>");
                buffer.append(getFieldValueByName(fieldNames2[i], obj3) != null
                        ? getFieldValueByName(fieldNames2[i], obj3)
                        : "");
                buffer.append("</value>\r\n");
                buffer.append("</column>\r\n");
            }
            buffer.append("</row>\r\n");
        }

        buffer.append("</values>\r\n</subForm>\r\n");
        buffer.append("<subForm>\r\n<values>\r\n");

        for (Object obj5 : obj5s) {
            buffer.append("<row>\r\n");
            String[] fieldNames2 = getFiledName(obj5);
            for (int i = 0; i < fieldNames2.length; i++) {
                buffer.append("<column name=\"" + OaConfig.index2Name(fieldNames2[i]) + "\">\r\n");
                buffer.append("<value>");
                buffer.append(getFieldValueByName(fieldNames2[i], obj5) != null
                        ? getFieldValueByName(fieldNames2[i], obj5)
                        : "");
                buffer.append("</value>\r\n");
                buffer.append("</column>\r\n");
            }
            buffer.append("</row>\r\n");
        }

        buffer.append("</values>\r\n</subForm>\r\n");

        buffer.append("</subForms>\r\n");
        buffer.append("</formExport>\r\n");
        System.out.println("结束拼接xml---------------------------------------------");
        return buffer.toString();
    }

    /**
     * 获取属性名数组
     */
    public static String[] getFiledName(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            // System.out.println(fields[i].getType());
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    /**
     * 根据属性名获取属性值
     */
    public static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[] {});
            Object value = method.invoke(o, new Object[] {});
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String xmlString(Object obj) {
        StringBuffer buffer = new StringBuffer();
        System.out.println("开始拼接xml---------------------------------------------");
        buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
        buffer.append("<formExport version=\"2.0\">\r\n");
        buffer.append("<summary id=\"\" name=\"\"/>\r\n");
        buffer.append("<values>\r\n");
        String[] fieldNames = getFiledName(obj);
        for (int i = 0; i < fieldNames.length; i++) {
            buffer.append("<column name=\"" + OaConfig.index2Name(fieldNames[i]) + "\">\r\n");
            buffer.append("<value>");
            buffer.append(getFieldValueByName(fieldNames[i], obj));
            buffer.append("</value>\r\n");
            buffer.append("</column>\r\n");
        }

        buffer.append("</values>\r\n");
        buffer.append("</formExport>\r\n");
        System.out.println("结束拼接xml---------------------------------------------");
        return buffer.toString();
    }


    public static String xmlString(Object obj1, List<?> obj2s, List<?> obj3s) {
        StringBuffer buffer = new StringBuffer();
        System.out.println("开始拼接xml---------------------------------------------");
        buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
        buffer.append("<formExport version=\"2.0\">\r\n");
        buffer.append("<summary id=\"\" name=\"\"/>\r\n");
        buffer.append("<values>\r\n");
        String[] fieldNames = getFiledName(obj1);
        for (int i = 0; i < fieldNames.length; i++) {
            buffer.append("<column name=\"" + OaConfig.index2Name(fieldNames[i]) + "\">\r\n");
            buffer.append("<value>");
            buffer.append(getFieldValueByName(fieldNames[i], obj1));
            buffer.append("</value>\r\n");
            buffer.append("</column>\r\n");
        }

        buffer.append("</values>\r\n");
        buffer.append("<subForms>\r\n");
        buffer.append("<subForm>\r\n<values>\r\n");
        for (Object obj2 : obj2s) {
            buffer.append("<row>\r\n");
            String[] fieldNames2 = getFiledName(obj2);
            for (int i = 0; i < fieldNames2.length; i++) {
                buffer.append("<column name=\"" + OaConfig.index2Name(fieldNames2[i]) + "\">\r\n");
                buffer.append("<value>");
                buffer.append(getFieldValueByName(fieldNames2[i], obj2) != null
                        ? getFieldValueByName(fieldNames2[i], obj2)
                        : "");
                buffer.append("</value>\r\n");
                buffer.append("</column>\r\n");
            }
            buffer.append("</row>\r\n");
        }

        buffer.append("</values>\r\n</subForm>\r\n");

        buffer.append("<subForm>\r\n<values>\r\n");
        for (Object obj3 : obj3s) {
            buffer.append("<row>\r\n");
            String[] fieldNames2 = getFiledName(obj3);
            for (int i = 0; i < fieldNames2.length; i++) {
                buffer.append("<column name=\"" + OaConfig.index2Name(fieldNames2[i]) + "\">\r\n");
                buffer.append("<value>");
                buffer.append(getFieldValueByName(fieldNames2[i], obj3) != null
                        ? getFieldValueByName(fieldNames2[i], obj3)
                        : "");
                buffer.append("</value>\r\n");
                buffer.append("</column>\r\n");
            }
            buffer.append("</row>\r\n");
        }

        buffer.append("</values>\r\n</subForm>\r\n");
        buffer.append("</subForms>\r\n");
        buffer.append("</formExport>\r\n");
        System.out.println("结束拼接xml---------------------------------------------");
        return buffer.toString();
    }

}
