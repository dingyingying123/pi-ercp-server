package cn.com.personnel.springboot.framework.core.controller;

import cn.com.personnel.springboot.framework.core.exception.ActionException;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeUtility;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author lfjin
 */
public class WebController extends BusinessController {

    /*
     * (non-Javadoc)
     *
     * @see cn.ac.sec.springboot.framework.core.controller.BusinessController#
     * onException(java.lang.Exception)
     */
    @Override
    public Object onException(Exception e) {
        logger.error(e.getMessage(), e);

        if (e instanceof ActionException) {
            throw (ActionException) e;
        } else {
            throw new ActionException(e);
        }
    }


    /**
     * 客户端下载pdf
     *
     * @param response
     * @param bytes
     * @param filename
     */
    public void renderPdf(HttpServletResponse response, final byte[] bytes, final String filename) {
        setFileDownloadHeader(response, filename, ".pdf");
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
    public void renderExcel(HttpServletResponse response, final byte[] bytes, final String filename) {
        renderExcel(response, bytes, filename, ".xlsx");
    }


    /**
     * 客户端下载Excel
     *
     * @param response
     * @param bytes
     * @param filename
     */
    public void renderExcel(HttpServletResponse response, final byte[] bytes, final String filename, String fileType) {
        setFileDownloadHeader(response, filename, fileType);
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
    public void setFileDownloadHeader(HttpServletResponse response, String fileName, String fileType) {
        String userAgent = null;
        try {
            // 中文文件名支持
            response.setContentType("application/x-download");

            String new_filename = new String(fileName.getBytes("GBK"), "ISO8859-1");   //URLEncoder.encode(fileName, "UTF8");
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
                    new_filename = MimeUtility.encodeText(fileName, "UTF8", "B");
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
