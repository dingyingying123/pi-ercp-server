package cn.com.personnel.ercp.common.controller;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.common.service.BaseRenderExcel;
import cn.com.personnel.ercp.common.service.IFileService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author liujf
 *
 */
@Controller
@RequestMapping("/file")
public class FileController extends PageController {

    @Autowired
    private IFileService fileService;

    @RequestMapping("/download/{fileKey}")
    public void downloadFile(@PathVariable String fileKey) {
        try {
        	FileInfo fileInfo = fileService.getFileInFoById(fileKey);
            if (fileInfo != null) {
                response.setHeader("content-type", "application/octet-stream");
                // 设置文件类型
                response.setContentType("application/octet-stream");
                // 下载设置下载窗口标题
                response.setHeader("Content-Disposition", "attachment; filename="
                        + new String(fileInfo.getFileName().getBytes("UTF-8"), "ISO-8859-1"));
                OutputStream os = response.getOutputStream();
                BufferedOutputStream bos = new BufferedOutputStream(os);
                // 获得内容
                byte[] temp = fileService.getFileContent(fileInfo.getFilePath());
                bos.write(temp, 0, temp.length);
                bos.flush();
                bos.close();

            }
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    /**
     * 文件下载
     * @param fileKey
     */
    @RequestMapping("/downloadOrigin/{fileKey}")
    @ResponseBody
    public void downloadOrigin(@PathVariable String fileKey) {
        try {
            FileInfo fileInfo = fileService.getFileInFoById(fileKey);
            if (fileInfo != null) {
                byte[] temp = fileService.getFileContent(fileInfo.getFilePath());
                BaseRenderExcel.renderExcel(response, temp, fileInfo.getFileName(),"");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 多文件上传
     * 
     * @param file
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> fileUpload(@RequestParam(value = "file") MultipartFile[] file) {
        Map<String, Object> map = new HashMap<String, Object>();
        SecUser user = (SecUser) getLoginUser();
        try {
            List<FileInfo> fileInfos = fileService.uploadFiles((user == null ? "system" : user.getUserId()), file);
            if (fileInfos != null) {
                List<String> fileKeys = new ArrayList<String>();
                List<String> fileNames = new ArrayList<String>();
                for (FileInfo fileInfo : fileInfos) {
                    fileKeys.add(fileInfo.getFileKey());
                    fileNames.add(fileInfo.getFileName());
                }
                map.put("fileKeys", fileKeys);
                map.put("fileNames", fileNames);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 多文件上传
     *
     * @param file
     * @return
     */
    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    @ResponseBody
    public ReturnEntity fileUpload(@RequestParam(value = "file") MultipartFile[] file, FileInfo info) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        Map<String, Object> map = new HashMap<>();
        SecUser user = (SecUser) getLoginUser();
        try {
            List<FileInfo> fileInfos = fileService.uploadFiles((user == null ? "admin" : user.getUserId()),
                    user == null ? "admin" : user.getUserName(), file, info);
            if (fileInfos != null) {
                List<String> fileKeys = new ArrayList<String>();
                for (FileInfo fileInfo : fileInfos) {
                    fileKeys.add(fileInfo.getFileKey());
                }
                map.put("file", fileInfos);
            }
            returnEntity.setData(map);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            returnEntity.setStatus(CommonConstants.ERROR_CODE);
            returnEntity.setMessage(e.getMessage());
            e.printStackTrace();
        }
        return returnEntity;
    }

    /**
     * 获取文件列表
     * @param fileInfo
     * @return
     */
    @RequestMapping("/queryFilesByCatByFlag")
    @ResponseBody
    public ReturnEntity queryFilesByCatByFlag(@RequestBody FileInfo fileInfo){
        return fileService.queryFilesByCatByFlag(fileInfo, buildPagenation());
    }

    /**
     * 删除文件
     * @param fileKey
     * @return
     */
    @RequestMapping("/deleteFileByKey/{fileKey}")
    @ResponseBody
    public ReturnEntity deleteFileByKey(@PathVariable String fileKey){
        return fileService.deleteFileByKey(fileKey);
    }

    /**
     * 多文件上传
     *
     * @param fileInfo
     * @return
     */
    @RequestMapping(value = "/saveFile", method = RequestMethod.POST)
    @ResponseBody
    public ReturnEntity saveFile(@RequestBody List<FileInfo> fileInfo) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        SecUser secUser = (SecUser) getLoginUser();
        returnEntity = fileService.saveFile(fileInfo,secUser);
        return returnEntity;
    }
}
