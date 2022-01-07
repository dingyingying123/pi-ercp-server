package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.common.persistence.entity.FileInfo;

import java.util.List;

public class FileInfoVO {
    private String fileCat;
    private String fileFlag;
    private List<FileInfo> fileInfoList;

    public String getFileCat() {
        return fileCat;
    }

    public void setFileCat(String fileCat) {
        this.fileCat = fileCat;
    }

    public String getFileFlag() {
        return fileFlag;
    }

    public void setFileFlag(String fileFlag) {
        this.fileFlag = fileFlag;
    }

    public List<FileInfo> getFileInfoList() {
        return fileInfoList;
    }

    public void setFileInfoList(List<FileInfo> fileInfoList) {
        this.fileInfoList = fileInfoList;
    }
}
