package cn.com.personnel.ercp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class TestMain {
    public static void main(String[] args) {
        try {
//            JSONObject object=new JSONObject();
//            object.put("userName", "rest");
//            object.put("password", "123456");

            HttpClient client = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet("http://10.12.7.14:80/seeyon/rest/find/qcFormResource?date=2017-04-20&token=39817774-70f0-4c01-844f-8088956d394b");
//			HttpPost httppost = new HttpPost("http://toa.goldwind.org/seeyon/rest/token");
//			HttpPost httppost = new HttpPost("http://toa.goldwind.org/seeyon/rest/token?loginName=36515");
//			HttpPost httppost = new HttpPost("http://10.12.7.25:80/seeyon/rest/token");
            //HttpPost httppost = new HttpPost("http://10.12.7.23/seeyon/rest/token");
//            httpGet.setHeader("Accept", "application/json");
//            httpGet.setHeader("Content-Type", "application/json");
//            StringEntity entity = new StringEntity(object.toString(), "utf-8");
//            entity.setContentEncoding("UTF-8");
//            entity.setContentType("application/json");
//            httppost.setEntity(entity);
            HttpResponse result = client.execute(httpGet);
            String resData = EntityUtils.toString(result.getEntity(),"utf-8");
            System.out.println(resData.toString());
            JSONArray array = JSONArray.parseArray(resData.toString());
            System.out.println(array);
//            JSONObject json = JSONObject.parseObject(resData.toString());
//            System.out.println(json.get("id"));
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
