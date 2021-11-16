package cn.com.personnel.ercp.common.service;

//import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeUtility;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class BaseRenderExcel {
    /**
     * 客户端下载Excel
     *
     * @param response
     * @param bytes
     * @param filename
     */
    public static void renderExcel(HttpServletResponse response, final byte[] bytes, final String filename) {
        renderExcel(response, bytes, filename, ".xlsx");
    }


    /**
     * 客户端下载Excel
     *
     * @param response
     * @param bytes
     * @param filename
     */
    public static void renderExcel(HttpServletResponse response, final byte[] bytes, final String filename, String fileType) {
        setFileDownloadHeader(response, filename, fileType,"application/x-download");
        if (null != bytes) {
            try {
                response.getOutputStream().write(bytes);
                response.getOutputStream().flush();
                response.getOutputStream().close();
            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    /**
     * 客户端下载Excel
     *
     * @param response
     * @param bytes
     * @param filename
     */
    public static void renderExcel1(HttpServletResponse response, final byte[] bytes, final String filename, String fileType,String contentType) {
        setFileDownloadHeader(response, filename, fileType,contentType);
        if (null != bytes) {
            try {
                response.getOutputStream().write(bytes);
                response.getOutputStream().flush();
                response.getOutputStream().close();
            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }


    /**
     * 设置让浏览器弹出下载对话框的Header
     *
     * @param response
     * @param fileName
     * @param fileType
     */
    public static void setFileDownloadHeader(HttpServletResponse response, String fileName, String fileType,String  contentType) {
        String userAgent = null;
        try {
            // 中文文件名支持
            response.setContentType(contentType);
            String new_filename = URLEncoder.encode(fileName, "UTF8");   //URLEncoder.encode(fileName, "UTF8");
            // 如果没有UA，则默认使用IE的方式进行编码，因为毕竟IE还是占多数的
            String rtn = "filename=\"" + new_filename + fileType + "\"";
            if (userAgent != null) {
                userAgent = userAgent.toLowerCase();
                // IE浏览器，只能采用URLEncoder编码
                if (userAgent.indexOf("msie") != -1) {
                    rtn = "filename=\"" + new_filename + "\"";
                }
                // Opera浏览器只能采用filename*
                else if (userAgent.indexOf("opera") != -1) {
                    rtn = "filename*=UTF-8''" + new_filename;
                }
                // Safari浏览器，只能采用ISO编码的中文输出
                else if (userAgent.indexOf("safari") != -1) {
                    rtn = "filename=\"" + new String(fileName.getBytes("UTF-8"), "ISO8859-1") + "\"";
                }
                // Chrome浏览器，只能采用MimeUtility编码或ISO编码的中文输出
                else if (userAgent.indexOf("applewebkit") != -1) {
//                    new_filename = MimeUtility.encodeText(fileName, "UTF8", "B");
                    rtn = "filename=\"" + new_filename + "\"";
                }
                // FireFox浏览器，可以使用MimeUtility或filename*或ISO编码的中文输出
                else if (userAgent.indexOf("mozilla") != -1) {
                    rtn = "filename*=UTF-8''" + new_filename;
                }
            }

            response.addHeader("Content-Disposition", "attachment;" + rtn);


        } catch (UnsupportedEncodingException e) {
        }
    }
}
