package cn.com.personnel.springboot.framework.kit;

import java.util.Collection;

/**
 * StrKit.
 */
public class StrKit {
    public static final String EMPTY = "";

    /**
     * 首字母变小写
     */
    public static String firstCharToLowerCase(String str) {
        char firstChar = str.charAt(0);
        if (firstChar >= 'A' && firstChar <= 'Z') {
            char[] arr = str.toCharArray();
            arr[0] += 'a' - 'A';
            return new String(arr);
        }
        return str;
    }

    /**
     * 首字母变大写
     */
    public static String firstCharToUpperCase(String str) {
        char firstChar = str.charAt(0);
        if (firstChar >= 'a' && firstChar <= 'z') {
            char[] arr = str.toCharArray();
            arr[0] -= 'a' - 'A';
            return new String(arr);
        }
        return str;
    }

    /**
     * 字符串为 null 或者为 "" 时返回 true
     */
    public static boolean isBlank(String str) {
        return str == null || "".equals(str.trim());
    }

    public static String join(Collection stringArray) {
        StringBuilder sb = new StringBuilder();
        for (Object o : stringArray) {
            if (o != null) {
                sb.append(o);
            }
        }
        return sb.toString();
    }

    public static String join(Collection stringArray, String separator) {
        StringBuilder sb = new StringBuilder();
        for (Object o : stringArray) {
            sb.append(o);
            sb.append(separator);
        }
        int len = sb.length();
        if (len > 0) {
            return sb.substring(0, len - separator.length());
        }
        return sb.toString();
    }

    public static String join(String[] stringArray) {
        StringBuilder sb = new StringBuilder();
        for (String s : stringArray) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String join(String[] stringArray, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            if (i > 0) {
                sb.append(separator);
            }
            sb.append(stringArray[i]);
        }
        return sb.toString();
    }

    /**
     * 字符串不为 null 而且不为 "" 时返回 true
     */
    public static boolean notBlank(String str) {
        return str != null && !"".equals(str.trim());
    }

    public static boolean notBlank(String... strings) {
        if (strings == null) {
            return false;
        }
        for (String str : strings) {
            if (str == null || "".equals(str.trim())) {
                return false;
            }
        }
        return true;
    }

    public static boolean notNull(Object... paras) {
        if (paras == null) {
            return false;
        }
        for (Object obj : paras) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public static String toCamelCase(String stringWithUnderline) {
        if (stringWithUnderline.indexOf('_') == -1) {
            return stringWithUnderline;
        }

        stringWithUnderline = stringWithUnderline.toLowerCase();
        char[] fromArray = stringWithUnderline.toCharArray();
        char[] toArray = new char[fromArray.length];
        int j = 0;
        for (int i = 0; i < fromArray.length; i++) {
            if (fromArray[i] == '_') {
                // 当前字符为下划线时，将指针后移一位，将紧随下划线后面一个字符转成大写并存放
                i++;
                if (i < fromArray.length) {
                    toArray[j++] = Character.toUpperCase(fromArray[i]);
                }
            } else {
                toArray[j++] = fromArray[i];
            }
        }
        return new String(toArray, 0, j);
    }

}
