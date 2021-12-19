package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.module.LoginInfoBean;
import cn.com.personnel.ercp.auth.persistence.entity.PortalLoginInfo;
import cn.com.personnel.ercp.auth.service.IPortalLoginInfoService;
import cn.com.personnel.ercp.common.persistence.mapper.PortalLoginInfoMapper;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class PortalLoginInfoService extends BaseService implements IPortalLoginInfoService {

    @Autowired
    private PortalLoginInfoMapper portalLoginInfoMapper;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public XSSFWorkbook exportLoginInfoByExcel(String startDate, String endDate) {
        List<LoginInfoBean> countLoginInfoList = null;
        try {
            Date startTime = null;
            if (StringUtils.isNotBlank(startDate)) {
                startTime = simpleDateFormat.parse(startDate);
            }
            Date endTime = null;
            if (StringUtils.isNotBlank(endDate)) {
                endTime = simpleDateFormat.parse(endDate);
            }
            countLoginInfoList = portalLoginInfoMapper.getLoginInfo(startTime, endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 创建一个HSSFWorkbook
        XSSFWorkbook wb = new XSSFWorkbook();
        // 添加sheet
        XSSFSheet sheet = wb.createSheet("统计登录信息");
        // 创建第一行表头
        XSSFRow row = sheet.createRow(0);
        // 格式
        XSSFCellStyle headerStyle = wb.createCellStyle();
        headerStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        headerStyle.setBorderTop(CellStyle.BORDER_THIN);
        headerStyle.setBorderBottom(CellStyle.BORDER_THIN);
        headerStyle.setBorderLeft(CellStyle.BORDER_THIN);
        headerStyle.setBorderRight(CellStyle.BORDER_THIN);
        headerStyle.setFillForegroundColor(IndexedColors.TURQUOISE.getIndex());
        headerStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);

        String[] cellHeaderNames = {"用户OA号", "用户姓名", "登录时间", "来源系统"};
        for (int i = 0; i < cellHeaderNames.length; i++) {
            XSSFCell cell = row.createCell(i);
            cell.setCellValue(cellHeaderNames[i]);
            cell.setCellStyle(headerStyle);
        }

        XSSFCellStyle dataStyle = wb.createCellStyle();
        dataStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        dataStyle.setBorderTop(CellStyle.BORDER_THIN);
        dataStyle.setBorderBottom(CellStyle.BORDER_THIN);
        dataStyle.setBorderLeft(CellStyle.BORDER_THIN);
        dataStyle.setBorderRight(CellStyle.BORDER_THIN);
        if (countLoginInfoList != null) {
            for (int i = 0, listSize = countLoginInfoList.size(); i < listSize; i++) {
                LoginInfoBean loginInfoBean = countLoginInfoList.get(i);
                row = sheet.createRow(i + 1);
                XSSFCell cell0 = row.createCell(0);
                cell0.setCellValue(loginInfoBean.getUserId());
                cell0.setCellStyle(dataStyle);
                XSSFCell cell1 = row.createCell(1);
                cell1.setCellValue(loginInfoBean.getUserName());
                cell1.setCellStyle(dataStyle);
                XSSFCell cell2 = row.createCell(2);
                String loginDateStr = format.format(loginInfoBean.getLoginDate());
                cell2.setCellValue(loginDateStr);
                cell2.setCellStyle(dataStyle);
                XSSFCell cell3 = row.createCell(3);
                cell3.setCellValue(loginInfoBean.getLoginType());
                cell3.setCellStyle(dataStyle);
            }
        }
        return wb;
    }

    @Override
    public boolean saveLoginInfo(String userId,String username,String source,String userIp) {
        PortalLoginInfo portalLoginInfo = new PortalLoginInfo();
        portalLoginInfo.setId(UUIDKit.getUUID());
        portalLoginInfo.setLoginDate(new Date());
        if("web".equals(source)){
            portalLoginInfo.setLoginType("EIS-WEB");
        }else if("mobile".equals(source)){
            portalLoginInfo.setLoginType("EIS-MOBILE");
        }else{
            portalLoginInfo.setLoginType(source);
        }
        portalLoginInfo.setUserId(userId);
        portalLoginInfo.setUsername(username);
        portalLoginInfo.setUserIp(userIp);
        int flag = portalLoginInfoMapper.insert(portalLoginInfo);
        return flag > 0;
    }
}

