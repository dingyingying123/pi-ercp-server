package cn.com.personnel.ercp.auth.service;

import cn.com.personnel.springboot.framework.core.service.IService;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public interface IPortalLoginInfoService extends IService {

    /**
     * 导入登录信息
     * @param startDate yyyyMMdd
     * @param endDate yyyyMMdd
     * @return
     */
    public XSSFWorkbook exportLoginInfoByExcel(String startDate, String endDate);

    /**
     * 保存登录信息
     * @param userId
     * @param username
     * @param  source
     * @return
     */
    public boolean saveLoginInfo(String userId,String username,String source,String userIp);
}
