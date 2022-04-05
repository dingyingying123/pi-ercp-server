package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiAddress;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenGuardianInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenLocationInfo;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

import java.util.List;

public interface IPiChildrenBaseInfoService {
    ReturnEntity queryPiChildrenBaseInfoList(PiChildrenBaseInfoVO piChildrenBaseInfo, PagenationQueryParameter buildPagenation);

    ReturnEntity savePiChildrenBaseInfo(PiChildrenBaseInfoVO piChildrenBaseInfo, SecUser secUser);

    ReturnEntity deletePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser);

    ReturnEntity submitPiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser);

    ReturnEntity submitPiChildrenBaseInfoList(SecUser secUser);

    ReturnEntity approvePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser);

    ReturnEntity queryPiChildrenGuardianInfoList(PiChildrenGuardianInfo piChildrenGuardianInfo);

    ReturnEntity queryPiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo);

    ReturnEntity savePiChildrenLocationInfo(PiChildrenLocationInfo piChildrenLocationInfo, SecUser secUser);

    ReturnEntity queryPiChildrenLocationInfo(PiChildrenLocationInfo piChildrenLocationInfo);

    ReturnEntity queryChildrenFileList(PiChildrenBaseInfo piChildrenBaseInfo);

    ReturnEntity queryChildrenStatisticsList(PiChildrenBaseInfo piChildrenBaseInfo);

    PiChildrenBaseInfoVO queryH5PiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo);

    ReturnEntity queryAddressList(PiAddress piAddress);

    void exportExcelByTemplete(String fileName, PiChildrenBaseInfoVO piChildrenBaseInfo);

    void exportImage(FileInfo fileInfo);
}
