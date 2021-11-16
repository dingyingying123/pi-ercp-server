package cn.com.personnel.springboot.framework.json;


public class JacksonFactory implements IJsonFactory {

    private static final JacksonFactory me = new JacksonFactory();

    public static JacksonFactory me() {
        return me;
    }

    @Override
    public Json getJson() {
        return new Jackson();
    }
}

