package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface IGenerateExcelZipService {
    @Async
    void generateExcelZip(String fileName, String pathname, List<PiChildrenBaseInfoVO> childrenExcelVOList);
}
