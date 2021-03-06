/**
 * Copyright 2019 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.kit.CommonConfig;
import cn.com.personnel.ercp.common.kit.FileKitConfig;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.common.persistence.mapper.FileInfoMapper;
import cn.com.personnel.ercp.common.util.StringCtrlUtils;
import cn.com.personnel.ercp.framework.exception.BusinessException;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.TransactionalException;
import java.io.*;
import java.util.*;

/**
 * @author 33925
 *
 */
@Component
public class FileService extends BaseService implements IFileService {

    @Autowired
    private FileInfoMapper fileInfoMapper;

    @Autowired
    private FileKitConfig fileKitConfig;

    @Autowired
    private CommonConfig commonConfig;

    private Log                    log            = LogFactory.getLog(FileService.class);

    private String                 LOCAL_FILE_DIR = "";



    @Override
    @Transactional
    public List<FileInfo> uploadFiles(String userId, MultipartFile[] file) {
        List<FileInfo> infos = new ArrayList<FileInfo>();
        for (MultipartFile multipartFile : file) {
            FileInfo fileInfo = new FileInfo();
            try {
                String fileName =multipartFile.getOriginalFilename();
                if(fileName.endsWith(".album")){
                    fileName = fileName.substring(0, fileName.length() - 5) + "jpg";
                }
                String filePath = saveFileToLocal(fileName, multipartFile.getBytes());
                String fileKey = UUIDKit.getUUID();
                fileInfo.setFileKey(fileKey);
                fileInfo.setFileName(multipartFile.getOriginalFilename());
                String fileType = fileName.substring(fileName.lastIndexOf("."));
                fileInfo.setFileType(fileType);
                fileInfo.setFileSize(multipartFile.getSize());
                fileInfo.setFilePath(filePath);
                fileInfo.setUploader(userId);
                fileInfo.setUploadTime(new Date());
                fileInfo.setStatus("??????");
                int rows = fileInfoMapper.insert(fileInfo);
                if (rows > 0) {
                    infos.add(fileInfo);
                }
            } catch(Exception e) {
                logger.error("FileService insert error", e);
                throw new TransactionalException("FileService uploadFiles method error", e);
            }
        }
        return infos;
    }

    @Override
    @Transactional
    public List<FileInfo> uploadFiles(String userId, String userName, MultipartFile[] file,
                                      FileInfo info) throws Exception {
        List<FileInfo> infos = new ArrayList<FileInfo>();
        for (MultipartFile multipartFile : file) {
            FileInfo fileInfo = new FileInfo();
            /* try { */
            String fileName = multipartFile.getOriginalFilename();
            String[] strings = fileName.split("\\\\");
            if(strings.length > 0){
                fileName = strings[strings.length-1];
            }
            String filePath = saveFileToLocal(fileName, multipartFile.getBytes());
            String fileKey = UUIDKit.getUUID();
            fileInfo.setFileKey(fileKey);
            fileInfo.setAppcode(commonConfig.getAppCode());
            fileInfo.setFileCat(info.getFileCat());
            fileInfo.setFileName(fileName);
            String fileType = fileName.substring(fileName.lastIndexOf("."));
            fileInfo.setFileType(fileType);
            fileInfo.setFileSize(multipartFile.getSize());
            fileInfo.setFilePath(filePath);
            fileInfo.setUploader(userId);
            fileInfo.setUploadTime(new Date());
            fileInfo.setStatus("??????");
            fileInfo.setFileFlag(info.getFileFlag());
            int rows = fileInfoMapper.insert(fileInfo);
            if (rows > 0) {
                infos.add(fileInfo);
            }
            /*
             * } catch(Exception e) { logger.error("FileService insert error", e); throw new
             * TransactionalException("FileService uploadFiles method error", e); }
             */
        }
        return infos;
    }

    @Override
    public FileInfo uploadFile(String uid, String fileName, Long fileSize, byte[] content) throws BusinessException {
        FileInfo fileInfo = new FileInfo();
        try {
            String filePath = saveFileToLocal(fileName, content);
            String fileKey = UUIDKit.getUUID();
            fileInfo.setFileKey(fileKey);
            fileInfo.setFileName(fileName);
            String fileType = fileName.substring(fileName.lastIndexOf("."));
            fileInfo.setFileType(fileType);
            fileInfo.setFileSize(fileSize);
            fileInfo.setFilePath(filePath);
            fileInfo.setUploader(uid);
            fileInfo.setUploadTime(new Date());
            fileInfo.setStatus("??????");
            int rows = fileInfoMapper.insert(fileInfo);
            if (rows > 0) {
                return fileInfo;
            }
        } catch (Exception e) {
            logger.error("FileService insert error", e);
        }
        return null;
    }


    @Override
    public byte[] getFileContent(String filePath) {
        return getLocalFileContent(StringCtrlUtils.changeString(filePath));
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * cn.com.personnel.ercp.auth.service.IFileInfoService#deleteFile(java.lang.
     * String)
     */
    @Override
    public boolean deleteFile(String fileID) {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFileKey(fileID);
        fileInfo.setUploadTime(new Date());
        fileInfo.setStatus("??????");
        fileInfoMapper.updateByPrimaryKey(fileInfo);
        return true;
    }



    /*
     * (non-Javadoc)
     *
     * @see cn.com.personnel.ercp.auth.service.IFileService#
     * saveFileToContentNotChangePath(java.lang.String, byte[])
     */
    @Override
    public String saveFileToContentNotChangePath(String fileName, byte[] fileContent) throws BusinessException {
        String savePath = fileKitConfig.getFilePath();
        File dir = new File(savePath);
        dir.deleteOnExit();
        dir.mkdirs();
        String target = savePath + File.separator + fileName;
        try {
            FileOutputStream out = new FileOutputStream(target);
            out.write(fileContent);
            out.close();
            log.info(fileName + "???????????????" + savePath + "?????????");
            return File.separator + fileName;
        } catch (IOException ex) {
            throw new BusinessException(ex);
        }
    }

    /**
     * ??????????????????????????????
     *
     * @param fileName
     *            ????????????
     * @param fileContent
     *            ????????????
     * @return
     * @throws BusinessException
     */
    private String saveFileToLocal(String fileName, byte[] fileContent) throws BusinessException {
        // ???????????????????????????
        String dbPath = "";

        // ????????????
        Calendar cl = Calendar.getInstance();
        String last = File.separator + cl.get(Calendar.YEAR) + File.separator + (cl.get(Calendar.MONTH) + 1)
                + File.separator + cl.get(Calendar.DAY_OF_MONTH) + File.separator + (new Date()).getTime();
        dbPath += last;

        File filepath = new File(fileKitConfig.getFilePath());
        if  (!filepath .exists()  && !filepath .isDirectory())
        {
            //???????????????
            filepath .mkdir();
        }

        String savePath = fileKitConfig.getFilePath() + dbPath;
        // ???????????????
        File dir = new File(savePath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String target = savePath + File.separator + fileName;

        try {
            FileOutputStream out = new FileOutputStream(target);
            out.write(fileContent);
            out.close();
            log.info(fileName + "???????????????" + savePath + "?????????");
            return dbPath + File.separator + fileName;
        } catch (IOException ex) {
            throw new BusinessException(ex);
        }
    }

    private byte[] fileToByte(File file) {
        byte[] content = null;
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
            ByteArrayOutputStream out = new ByteArrayOutputStream(1024);

            byte[] temp = new byte[1024];
            int size = 0;
            while ((size = in.read(temp)) != -1) {
                out.write(temp, 0, size);
            }
            in.close();
            content = out.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }

    /**
     * ??????????????????
     *
     * @param path
     * @return
     * @throws BusinessException
     */
    private byte[] getLocalFileContent(String path) throws BusinessException {
        byte[] content = null;
        String realPath = fileKitConfig.getFilePath() + path;
        File file = new File(realPath);
        content = fileToByte(file);
        /*
         * if(content == null){ throw new
         * BusinessException("???"+fileKitConfig.getFilePath() + "??????"+path +
         * "??????????????????"); }
         */
        return content;
    }

    public FileInfo getFileInFoById(String fileKey){
        return fileInfoMapper.selectByPrimaryKey(fileKey);
    }

    @Override
    public List<Map<String, FileInfo>> getFileInFoByIds(String fileKeys) {
        List<String> keys = new ArrayList<>();
        keys = Arrays.asList(fileKeys.split(","));
        List<Map<String, FileInfo>> result = new ArrayList<>();
        List<FileInfo> list = new ArrayList<>();
        list = fileInfoMapper.getFileInFoByIds(keys);
        for (FileInfo file : list){
            Map<String, FileInfo> map = new HashMap<>();
            map.put(file.getFileKey(),file);
            result.add(map);
        }
        return result;
    }

    @Override
    public ReturnEntity queryFilesByCatByFlag(FileInfo fileInfo, PagenationQueryParameter buildPagenation) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        setPageHelper(buildPagenation);
        List<FileInfo> fileInfoList = fileInfoMapper.queryFilesByCatByFlag(fileInfo);
        returnEntity.setData(new PageInfo<>(fileInfoList));
        return returnEntity;
    }

    @Override
    public ReturnEntity deleteFileByKey(String fileKey) throws BusinessException {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        FileInfo fileInfo = fileInfoMapper.selectByPrimaryKey(fileKey);
        if(fileInfo == null){
            returnEntity.setStatus(CommonConstants.ERROR_CODE);
            returnEntity.setMessage("??????????????????");
        }
        String savePath = fileKitConfig.getFilePath();
        String fileName = fileInfo.getFilePath();
        File dir = new File(savePath);
        dir.deleteOnExit();
        String target = savePath + fileName;
        File oldfile=new File(target);
        fileInfoMapper.deleteByPrimaryKey(fileKey);
        if(oldfile.exists())oldfile.delete();
        String lastDir = "";
        if(fileName.lastIndexOf("\\") == -1){
            lastDir = fileName.substring(0, fileName.lastIndexOf("/"));
        }else{
            lastDir = fileName.substring(0, fileName.lastIndexOf("\\"));
        }
        File fileDir = new File(savePath + lastDir);
        if(fileDir.isDirectory()){
            fileDir.delete();
        }
        log.info(fileName + "?????????");
        return returnEntity;
    }

    @Override
    public ReturnEntity saveFile(List<FileInfo> fileInfo, SecUser secUser) {
        fileInfo.forEach(fi->{
            if (!StringUtils.isEmpty(fi.getFileKey())){
                fi.setUploader(secUser.getUserId());
                fi.setUploadTime(new Date());
                fileInfoMapper.updateByPrimaryKey(fi);
            }
        });
            return  new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
    }

}
