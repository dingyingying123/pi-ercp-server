package cn.com.personnel.ercp.common.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sec_file_info")
public class FileInfo {
    /**
     * 文件key
     */
    @Id
    @Column(name = "file_key")
    private String fileKey;

    /**
     * appcode
     */
    private String appcode;

    /**
     * 文件分类
     */
    @Column(name = "file_cat")
    private String fileCat;

    /**
     * 文件名称
     */
    @Column(name = "file_name")
    private String fileName;

    /**
     * 文件类型
     */
    @Column(name = "file_type")
    private String fileType;

    /**
     * 文件大小
     */
    @Column(name = "file_size")
    private Long fileSize;

    /**
     * 文件位置
     */
    @Column(name = "file_loc")
    private String fileLoc;

    /**
     * 文件目录
     */
    @Column(name = "file_path")
    private String filePath;

    /**
     * 文件标识
     */
    @Column(name = "file_flag")
    private String fileFlag;

    /**
     * 上传人
     */
    private String uploader;

    /**
     * 上传时间
     */
    @Column(name = "upload_time")
    private Date uploadTime;

    /**
     * 状态
     */
    private String status;

    /**
     * 获取文件key
     *
     * @return file_key - 文件key
     */
    public String getFileKey() {
        return fileKey;
    }

    /**
     * 设置文件key
     *
     * @param fileKey 文件key
     */
    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    /**
     * 获取appcode
     *
     * @return appcode - appcode
     */
    public String getAppcode() {
        return appcode;
    }

    /**
     * 设置appcode
     *
     * @param appcode appcode
     */
    public void setAppcode(String appcode) {
        this.appcode = appcode;
    }

    /**
     * 获取文件分类
     *
     * @return file_cat - 文件分类
     */
    public String getFileCat() {
        return fileCat;
    }

    /**
     * 设置文件分类
     *
     * @param fileCat 文件分类
     */
    public void setFileCat(String fileCat) {
        this.fileCat = fileCat;
    }

    /**
     * 获取文件名称
     *
     * @return file_name - 文件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置文件名称
     *
     * @param fileName 文件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获取文件类型
     *
     * @return file_type - 文件类型
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * 设置文件类型
     *
     * @param fileType 文件类型
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * 获取文件大小
     *
     * @return file_size - 文件大小
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * 设置文件大小
     *
     * @param fileSize 文件大小
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * 获取文件位置
     *
     * @return file_loc - 文件位置
     */
    public String getFileLoc() {
        return fileLoc;
    }

    /**
     * 设置文件位置
     *
     * @param fileLoc 文件位置
     */
    public void setFileLoc(String fileLoc) {
        this.fileLoc = fileLoc;
    }

    /**
     * 获取文件目录
     *
     * @return file_path - 文件目录
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置文件目录
     *
     * @param filePath 文件目录
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 获取上传人
     *
     * @return uploader - 上传人
     */
    public String getUploader() {
        return uploader;
    }

    /**
     * 设置上传人
     *
     * @param uploader 上传人
     */
    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    /**
     * 获取上传时间
     *
     * @return upload_time - 上传时间
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * 设置上传时间
     *
     * @param uploadTime 上传时间
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public String getFileFlag() {
        return fileFlag;
    }

    public void setFileFlag(String fileFlag) {
        this.fileFlag = fileFlag;
    }
}