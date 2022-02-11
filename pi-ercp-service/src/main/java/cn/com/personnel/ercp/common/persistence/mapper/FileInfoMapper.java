package cn.com.personnel.ercp.common.persistence.mapper;

import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FileInfoMapper extends BaseMapper<FileInfo> {
    
    public List<FileInfo> selectFileInFoListByNoticeId(String noticeId);

    List<FileInfo> getFileInFoByIds(List<String> keys);

    List<FileInfo> queryFilesByCatByFlag(FileInfo fileInfo);

    void insertBatch(List<FileInfo> fileInfoList);

    FileInfo queryOneFilesByCatByFlag(@Param("fileFlag") String fileFlag, @Param("fileCat") String fileCat);
}