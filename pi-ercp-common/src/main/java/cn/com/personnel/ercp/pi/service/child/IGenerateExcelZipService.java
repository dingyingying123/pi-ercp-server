package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface IGenerateExcelZipService {
    @Async
    void generateExcelZip(String fileName, String pathname, List<PiChildrenBaseInfoVO> childrenExcelVOList, String toMail, SecUser secUser);

    @Async
    void sendEmail(String path, String subject, String toMail) throws Exception;
}
