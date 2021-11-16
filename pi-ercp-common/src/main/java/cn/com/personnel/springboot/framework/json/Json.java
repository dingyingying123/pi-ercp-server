package cn.com.personnel.springboot.framework.json;


import cn.com.personnel.springboot.framework.kit.StrKit;

/**
 * json string 与 object 互转抽象
 */
public abstract class Json {

    private static IJsonFactory defaultJsonFactory = new JacksonFactory();

    /**
     * 当对象级的 datePattern 为 null 时使用 defaultDatePattern jfinal 2.1 版本暂定
     * defaultDatePattern 值为 null，即 jackson、fastjson 默认使用自己的 date 转换策略
     */
    private static String       defaultDatePattern = null;

    public static Json getJson() {
        return defaultJsonFactory.getJson();
    }

    static void setDefaultDatePattern(String defaultDatePattern) {
        if (StrKit.isBlank(defaultDatePattern)) {
            throw new IllegalArgumentException("defaultDatePattern can not be blank.");
        }
        Json.defaultDatePattern = defaultDatePattern;
    }

    static void setDefaultJsonFactory(IJsonFactory defaultJsonFactory) {
        if (defaultJsonFactory == null) {
            throw new IllegalArgumentException("defaultJsonFactory can not be null.");
        }
        Json.defaultJsonFactory = defaultJsonFactory;
    }

    /**
     * Json 继承类优先使用对象级的属性 datePattern, 然后才是全局性的 defaultDatePattern
     */
    protected String datePattern = null;

    public String getDatePattern() {
        return datePattern;
    }

    public String getDefaultDatePattern() {
        return defaultDatePattern;
    }

    public abstract <T> T parse(String jsonString, Class<T> type);

    public Json setDatePattern(String datePattern) {
        if (StrKit.isBlank(datePattern)) {
            throw new IllegalArgumentException("datePattern can not be blank.");
        }
        this.datePattern = datePattern;
        return this;
    }

    public abstract String toJson(Object object);
}

