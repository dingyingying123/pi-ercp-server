/**
 * Copyright 2019 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.exception.BusinessException;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.core.service.IService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * @author 33925
 *
 */
public interface IFileService extends IService {
    @Transactional
    List<FileInfo> uploadFiles(String userId, String userName, MultipartFile[] file,
                               FileInfo info) throws Exception;

    public FileInfo uploadFile(String uid, String fileName, Long fileSize, byte[] content);

    public byte[] getFileContent(String filePath);

    public boolean deleteFile(String fileId);

	public String saveFileToContentNotChangePath(String fileName, byte[] fileContent) throws BusinessException;

    public List<FileInfo> uploadFiles(String userId, MultipartFile[] file);
    
    public  FileInfo getFileInFoById(String fileKey);

    public  List<Map<String,FileInfo>> getFileInFoByIds(String fileKeys);

    ReturnEntity queryFilesByCatByFlag(FileInfo fileInfo, PagenationQueryParameter buildPagenation);

    ReturnEntity deleteFileByKey(String fileKey) throws BusinessException;

    ReturnEntity saveFile(List<FileInfo> fileInfo, SecUser secUser);
}
