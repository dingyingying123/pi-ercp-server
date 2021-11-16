/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.oaclient;

import cn.com.personnel.ercp.common.kit.CommonConfig;
import cn.com.personnel.ercp.common.kit.FileKitConfig;
import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.common.service.FileService;
import cn.com.personnel.ercp.framework.exception.BusinessException;
import cn.com.personnel.ercp.pi.oaclient.oaWbs.BPMServiceStub;
import cn.com.personnel.ercp.pi.oaclient.oaWbs.DocumentException;
import cn.com.personnel.ercp.pi.oaclient.oaWbs.ServiceException;
import cn.com.personnel.ercp.pi.oaclient.oaXml.GetXml;
import cn.com.personnel.ercp.pi.oaclient.oaXmlObject.Formmain_Contract_Template;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qinerhu
 */
@Component
public class OaService {

    @Autowired
    private CommonConfig commonConfig;

    @Autowired
    private FileService fileService;

    @Autowired
    private FileKitConfig fileKitConfig;

    public void toOa(Object formmain, List<?> formsonList, String userId) {
        String token = getToken();
        System.out.println("===========================");
        System.out.println("=========token:" + token);
        System.out.println("===========================");
        try {
            BPMServiceStub bpmstub = new BPMServiceStub(commonConfig.getEndPointAddress());

            BPMServiceStub.LaunchFormCollaboration abc = new BPMServiceStub.LaunchFormCollaboration();

            abc.setSubject("");
            abc.setTemplateCode("SCCDJSPTEMPELATE");
            abc.setToken(token);

            abc.setSenderLoginName(userId);
            // 临时oa号
//            abc.setSenderLoginName("29998");
            String requestXml = GetXml.xmlString(formmain, formsonList);
            System.out.println("传入的xml = " + requestXml);

            abc.setData(requestXml);
            abc.setRelateDoc("");
            BPMServiceStub.LaunchFormCollaborationResponse a = bpmstub.launchFormCollaboration(abc);
            String summaryId = String.valueOf(a.get_return().getResult());
            System.out.println("+++++++++++++++++++++getErrorMessage+++++++++++++" + a.get_return().getErrorMessage());
            System.out.println("+++++++++++++++++getErrorNumber+++++++++++++" + a.get_return().getErrorNumber());
            System.out.println("+++++++++++++++++++getResult+++++++++++++" + summaryId);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ServiceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void toOa(Object formmain, List<?> formsonList1, List<?> formsonList2, List<?> formsonList3,
                     List<?> formsonList4, String templateCode, String userId)
            throws RemoteException, DocumentException, ServiceException {
        String token = getToken();
        System.out.println("===========================");
        System.out.println("=========token:" + token);
        System.out.println("===========================");

        BPMServiceStub bpmstub = new BPMServiceStub(commonConfig.getEndPointAddress());
        BPMServiceStub.LaunchFormCollaboration abc = new BPMServiceStub.LaunchFormCollaboration();

        abc.setSubject("");
        abc.setTemplateCode(templateCode);
        abc.setToken(token);

        // 临时oa号
//            abc.setSenderLoginName("24660");
        abc.setSenderLoginName(userId);
        String requestXml = GetXml.xmlString(formmain, formsonList1, formsonList2, formsonList3, formsonList4);
        System.out.println("传入的xml = " + requestXml);

        abc.setData(requestXml);
        abc.setRelateDoc("");
        BPMServiceStub.LaunchFormCollaborationResponse a = bpmstub.launchFormCollaboration(abc);
        String summaryId = String.valueOf(a.get_return().getResult());
        System.out.println("+++++++++++++++++++++getErrorMessage+++++++++++++" + a.get_return().getErrorMessage());
        System.out.println("+++++++++++++++++getErrorNumber+++++++++++++" + a.get_return().getErrorNumber());
        System.out.println("+++++++++++++++++++getResult+++++++++++++" + summaryId);
        if (a.get_return().getErrorNumber() != 0) {
            throw new BusinessException("提交OA审核失败：" + a.get_return().getErrorMessage());
        }

    }

    private String getToken() {
        String path = commonConfig.getAuthUrl();
        URL url1;
        HttpURLConnection conn = null;
        OutputStream outputstream = null;


        String content = "{\"userName\":\"" + commonConfig.getOaUserName() + "\",\"password\":\"" + commonConfig.getOaPassword() + "\"}";
        BufferedReader br = null;
        try {
            url1 = new URL(path);
            conn = (HttpURLConnection) url1.openConnection();
            conn.setRequestProperty("HOST", commonConfig.getRequestHostProperty());
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Request-method", "post");//
            conn.setRequestProperty("Content-length", Integer.toString(content.length()));
            conn.setDoInput(true);
            conn.setDoOutput(true);
            outputstream = conn.getOutputStream();
            outputstream.write(content.getBytes());
            outputstream.flush();
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder output = new StringBuilder();
        String s = "";
        try {
            while ((s = br.readLine()) != null) {
                output.append(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String token = output.toString();
        JSONObject json = new JSONObject();
        json = JSONObject.parseObject(token);
        String id = (String) json.get("id");
        return id;
    }

    /**
     * 查询付款实例号相关信息
     *
     * @param *请求数据
     * @param *请求方式
     * @Param *请求地址
     */
    public JSONObject toOaDoPOSTHttp(String dataStr ,String url) {
        String token = getToken();
        String path = url + "?token=" + token;
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        PrintWriter writer = null;
        String content = null;
        StringBuffer sbf = new StringBuffer();
        try{
            URL u = new URL(path);
            conn = (HttpURLConnection)u.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setReadTimeout(50000);
            conn.setConnectTimeout(60000);
            conn.setRequestProperty("accept","*/*");
            conn.setRequestProperty("connection","Keep-Alive");
            conn.setRequestProperty("content-Type","application/json");

            writer = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(),"UTF-8"));
            writer.print(dataStr);
            writer.flush();

            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while((content = reader.readLine())!=null){
                sbf.append(content);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(writer!=null){
                writer.close();
            }
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            conn.disconnect();
        }
        JSONObject jsonStr = JSONObject.parseObject(sbf.toString());
        return jsonStr;
    }

    public void toOa(Object object, String userId) {
        String token = getToken();
        System.out.println("===========================");
        System.out.println("=========token:" + token);
        System.out.println("===========================");
        try {
            BPMServiceStub bpmstub = new BPMServiceStub(commonConfig.getEndPointAddress());
            BPMServiceStub.LaunchFormCollaboration abc = new BPMServiceStub.LaunchFormCollaboration();

            // 临时oa号
            abc.setSubject("更新框架协议");
            abc.setTemplateCode("SCC_CGHTPS");
            abc.setToken(token);

            // 临时oa号
//            abc.setSenderLoginName("34521");
            abc.setSenderLoginName(userId);

            String requestXml = GetXml.xmlString(object);
            System.out.println("传入的xml = " + requestXml);

            abc.setData(requestXml);
            abc.setRelateDoc("");
            BPMServiceStub.LaunchFormCollaborationResponse a = bpmstub.launchFormCollaboration(abc);
            String summaryId = String.valueOf(a.get_return().getResult());
            System.out.println("+++++++++++++++++++++getErrorMessage+++++++++++++" + a.get_return().getErrorMessage());
            System.out.println("+++++++++++++++++getErrorNumber+++++++++++++" + a.get_return().getErrorNumber());
            System.out.println("+++++++++++++++++++getResult+++++++++++++" + summaryId);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ServiceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String toOa(Formmain_Contract_Template formmain, List<?> formsonList, String templateCode, String userId, String fileId) {
        String token = getToken();
        System.out.println("===========================");
        System.out.println("=========token:" + token);
        System.out.println("===========================");

        try {
            BPMServiceStub bpmstub = new BPMServiceStub(commonConfig.getEndPointAddress());
            BPMServiceStub.LaunchFormCollaboration abc = new BPMServiceStub.LaunchFormCollaboration();

            abc.setSubject("");
            abc.setTemplateCode(templateCode);
            abc.setToken(token);

            //附件
            long[] attachments = new long[1];
            String ids = singleFileUpload(token, userId, fileId);
            System.out.println("+++++++++++++++++++++合同附件ids+++++++++++++" + ids);
            attachments[0] = Long.parseLong(ids);
            abc.setAttachments(attachments);

            abc.setSenderLoginName(userId);
            String requestXml = GetXml.xmlString(formmain, formsonList);
            System.out.println("传入的xml = " + requestXml);

            abc.setData(requestXml);
            abc.setRelateDoc("");
            BPMServiceStub.LaunchFormCollaborationResponse a = bpmstub.launchFormCollaboration(abc);
            String summaryId = String.valueOf(a.get_return().getResult());
            System.out.println("+++++++++++++++++++++getErrorMessage+++++++++++++" + a.get_return().getErrorMessage());
            System.out.println("+++++++++++++++++getErrorNumber+++++++++++++" + a.get_return().getErrorNumber());
            System.out.println("+++++++++++++++++++getResult+++++++++++++" + summaryId);
            if (a.get_return().getErrorNumber() != 0) {
                throw new BusinessException("合同模板提交OA审核失败：" + a.get_return().getErrorMessage());
            }
            return summaryId;
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String singleFileUpload(String token, String userId, String fileId) {
        String end = "\r\n";
        String twoHyphens = "--";
        String boundary = "---------------------------7e0dd540448";
        String response = "";
        String path = commonConfig.getUploadServiceUrl() + "&senderLoginName=" + userId + "&token=" + token;
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Connection", "Keep-Alive");
            connection.setRequestProperty("Charset", "UTF-8");
            connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
            DataOutputStream ds = new DataOutputStream(connection.getOutputStream());
            FileInfo fileInfo = fileService.getFileInFoById(fileId);
            //写文件
            ds.writeBytes(twoHyphens + boundary + end);
            ds.writeBytes("Content-Dfssosition: form-data; " + "name=\"file\"; " + "filename=\"");
            //防止中文乱码
            ds.write(fileInfo.getFileName().getBytes());
            ds.writeBytes("\"" + end);
            ds.writeBytes("Content-Type: " + "docx" + end);
            ds.writeBytes(end);
            //根据路径读取文件
            String uploadFile = fileKitConfig.getFilePath() + fileInfo.getFilePath();
            FileInputStream fis = new FileInputStream(uploadFile);
            byte[] buffer = new byte[1024];
            int length = -1;
            while ((length = fis.read(buffer)) != -1) {
                ds.write(buffer, 0, length);
            }
            ds.writeBytes(end);
            fis.close();
            ds.writeBytes(twoHyphens + boundary + twoHyphens + end);
            ds.writeBytes(end);
            ds.flush();
            try {
                //获取URL的响应
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
                String s = "";
                String temp = "";
                while ((temp = reader.readLine()) != null) {
                    s += temp;
                }
                response = s;
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("No response get!!!");
            }
            ds.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Request failed!");
        }
        return response;
    }


    public Map<String, String> contractInfoToOa(Object formmain, List<?> formsonList, List<?> formsonList2, String code, String userId, String pdfFileId, String type) {
        String token = getToken();
        System.out.println("===========================");
        System.out.println("=========token:" + token);
        System.out.println("===========================");
        Map<String, String> map = new HashMap<>();
        try {
            BPMServiceStub bpmstub = new BPMServiceStub(commonConfig.getEndPointAddress());
            BPMServiceStub.LaunchFormCollaboration abc = new BPMServiceStub.LaunchFormCollaboration();

            abc.setSubject("");
            abc.setTemplateCode(code);
            abc.setToken(token);

            //附件
            long[] attachments = new long[1];
            String ids = singleFileUpload(token, userId, pdfFileId);
            System.out.println("+++++++++++++++++++++合同pdf文件+++++++++++++" + ids);
            attachments[0] = Long.parseLong(ids);
            abc.setAttachments(attachments);

            abc.setSenderLoginName(userId);
            String requestXml = "";
            if (formsonList2 != null) {
                requestXml = GetXml.xmlString(formmain, formsonList, formsonList2);
            } else {
                requestXml = GetXml.xmlString(formmain, formsonList);
            }
            System.out.println("传入的xml = " + requestXml);
            abc.setData(requestXml);
            abc.setRelateDoc("");
            BPMServiceStub.LaunchFormCollaborationResponse a = bpmstub.launchFormCollaboration(abc);
            String summaryId = String.valueOf(a.get_return().getResult());
            System.out.println("+++++++++++++++++++++getErrorMessage+++++++++++++" + a.get_return().getErrorMessage());
            System.out.println("+++++++++++++++++getErrorNumber+++++++++++++" + a.get_return().getErrorNumber());
            System.out.println("+++++++++++++++++++getResult+++++++++++++" + summaryId);
            if (a.get_return().getErrorNumber() != 0) {
                if ("contract".equals(type)) {
                    throw new BusinessException("合同信息提交OA审核失败：" + a.get_return().getErrorMessage());
                } else if ("seal".equals(type)) {
                    throw new BusinessException("合同用印信息提交OA审核失败：" + a.get_return().getErrorMessage());
                }
            }

            //获取到票据id
            String affairId = getAffairId(userId, token, summaryId);

            //取30次
            for (int i = 0; i < 30; i++) {
                if (StringUtils.isBlank(affairId)) {
                    affairId = getAffairId(userId, token, summaryId);
                } else {
                    break;
                }
            }

            String url = commonConfig.getReturnUrl() + "?language=zh&ticket=" + userId + "_" + DigestUtils.md5DigestAsHex((userId + "@GoldWind-portal-2018").getBytes()) +
                    "&&from=portal_sso&tourl=" + URLEncoder.encode("collaboration/collaboration.do?method=summary&openFrom=listPending&affairId=" + affairId);

            System.out.println("==========" + url);
            map.put("url", url);
            map.put("summaryId", summaryId);
            return map;
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    //获取票据id
    public String getAffairId(String userId, String token, String summaryId) {
        String res = "";
        try {
            String path = commonConfig.getAffairIdUrl() + "/" + summaryId + "?ticket=" + userId + "&token=" + token;
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = br.readLine()) != null) {
                res += line;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("==========affairId:" + res);
        return res;
    }

    public void uploadElectronicSignatureFile(String userId, String summayrId, String fileName, String signedPdfFileId) {
        String token = getToken();
        System.out.println("===========================");
        System.out.println("=========token:" + token);
        System.out.println("===========================");

        String path = commonConfig.getUploadSignedUrl() + "?summayrId=" + summayrId + "&token=" + token + "&senderLoginName=" + userId + "&fileName=" + fileName;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String responseEntityStr = "";
        try {
            HttpPost httppost = new HttpPost(path);
            FileInfo fileInfo = fileService.getFileInFoById(signedPdfFileId);
            //根据路径读取文件
            String uploadFile = fileKitConfig.getFilePath() + fileInfo.getFilePath();
            FileBody bin = new FileBody(new File(uploadFile));
            StringBody comment = new StringBody("This is comment", ContentType.TEXT_PLAIN);
            HttpEntity reqEntity = MultipartEntityBuilder.create().addPart("file", bin).addPart("comment", comment).build();
            httppost.setEntity(reqEntity);
            System.out.println("executing request " + httppost.getRequestLine());
            CloseableHttpResponse response = httpclient.execute(httppost);
            try {
                System.out.println(response.getStatusLine());
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    responseEntityStr = EntityUtils.toString(response.getEntity());
                    System.out.println(responseEntityStr);
                    System.out.println("Response content length: " + resEntity.getContentLength());
                }
                EntityUtils.consume(resEntity);
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用印流程" + summayrId + "回传电子签文件" + fileName + "================" + responseEntityStr);
    }
}
