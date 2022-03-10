package cn.com.personnel.springboot.framework.core.controller;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class CustomHttpServletRequestWrapper extends HttpServletRequestWrapper {
    private byte[] body;
    private Map<String, String[]> params = new HashMap<>();

    public CustomHttpServletRequestWrapper(HttpServletRequest request) throws IOException {
        super(request);
        this.params.putAll(request.getParameterMap());
        BufferedReader reader = request.getReader();
        try (StringWriter writer = new StringWriter()) {
            int read;
            char[] buf = new char[1024 * 8];
            while ((read = reader.read(buf)) != -1) {
                writer.write(buf, 0, read);
            }
            this.body = writer.getBuffer().toString().getBytes();
            if(body != null && body.length > 0) {
                Map<String, Object> paramter = new HashMap<String, Object>();
                JSONObject jsonObject = JSONObject.parseObject(getBody());
                String pageNumber = jsonObject.get("pageNumber").toString();
                String pageSize = jsonObject.get("pageSize").toString();
                if (!"".equals(pageNumber)) {
                    paramter.put("pageNumber", pageNumber);
                }
                if (!"".equals(pageSize)) {
                    paramter.put("pageSize", pageSize);
                }
                addAllParameters(paramter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getBody() {
        return new String(body, StandardCharsets.UTF_8);
    }



    @Override
    public ServletInputStream getInputStream()  {
        final ByteArrayInputStream bais = new ByteArrayInputStream(body);
        return new ServletInputStream() {

            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {

            }

            @Override
            public int read(){
                return bais.read();
            }
        };
    }

    @Override
    public BufferedReader getReader(){
        return new BufferedReader(new InputStreamReader(this.getInputStream()));
    }

    /**
     * 在获取所有的参数名,必须重写此方法，否则对象中参数值映射不上
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public Enumeration<String> getParameterNames() {
        return new Vector(params.keySet()).elements();
    }

    /**
     * 重写getParameter方法
     * @param name 参数名
     * @return 返回参数值
     */
    @Override
    public String getParameter(String name) {
        String[] values = params.get(name);
        if (values == null || values.length == 0) {
            return null;
        }
        return values[0];
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] values = params.get(name);
        if (values == null || values.length == 0) {
            return null;
        }
        return values;
    }

    /**
     * 增加多个参数
     * @param otherParams 增加的多个参数
     */
    public void addAllParameters(Map<String, Object> otherParams) {
        for (Map.Entry<String, Object> entry : otherParams.entrySet()) {
            addParameter(entry.getKey(), entry.getValue());
        }
    }

    /**
     * 增加参数
     * getParameterMap()中的类型是<String,String[]>类型的，所以这里要将其value转为String[]类型
     * @param name 参数名
     * @param value 参数值
     */
    public void addParameter(String name, Object value) {
        if (value != null) {
            if (value instanceof String[]) {
                params.put(name, (String[]) value);
            } else if (value instanceof String) {
                params.put(name, new String[]{(String) value});
            } else {
                params.put(name, new String[]{String.valueOf(value)});
            }
        }
    }
}