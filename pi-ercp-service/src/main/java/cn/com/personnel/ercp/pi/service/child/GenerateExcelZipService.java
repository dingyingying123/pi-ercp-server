package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.common.autoconfig.ExcelUtils;
import cn.com.personnel.ercp.common.kit.FileKitConfig;
import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.common.persistence.mapper.FileInfoMapper;
import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenGuardianInfo;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Service
public class GenerateExcelZipService extends BaseService implements IGenerateExcelZipService {
//    @Autowired
//    private Executor executor;
    @Autowired
    FileInfoMapper fileInfoMapper;
    @Autowired
    FileKitConfig fileKitConfig;
    @Autowired
    SecUserMapper secUserMapper;

    @Async
    @Override
    public void generateExcelZip(String fileName, String pathname, List<PiChildrenBaseInfoVO> childrenExcelVOList) {
                List<SecUser> secUserList = secUserMapper.selectAll();
        Map<String, String> userMap = new HashMap<>();
        if(secUserList.size() > 0){
            for(SecUser user : secUserList){
                if(!userMap.containsKey(user.getUserId())){
                    userMap.put(user.getUserId(), user.getUserName());
                }
            }
        }
        try{
            byte[] buf = new byte[1024];
            FileOutputStream fos = null;
            File zipFile = new File(fileKitConfig.getFilePath() +pathname);
            //执行创建
            zipFile.createNewFile();
            fos = new FileOutputStream(zipFile);
            //设置前台下载压缩包名
            ZipOutputStream zipout = new ZipOutputStream(fos);
            List<Map<String, Object>> zipEntryList = new ArrayList<>();
            int i = 1;
            for(PiChildrenBaseInfoVO childrenExcelVO : childrenExcelVOList) {
                logger.info("===========导出第：" + i++ + "条");
    //                SecUser secUser = secUserMapper.selectByPrimaryKey(childrenExcelVO.getCreator());
                PiChildrenGuardianInfo fatherGuardian = null;
                PiChildrenGuardianInfo matherGuardian = null;
                PiChildrenGuardianInfo otherGuardian = null;
                if(childrenExcelVO.getPiChildrenGuardianInfoList() != null && childrenExcelVO.getPiChildrenGuardianInfoList().size() > 0){
                    List<PiChildrenGuardianInfo> piChildrenGuardianInfoList = childrenExcelVO.getPiChildrenGuardianInfoList();
                    for(PiChildrenGuardianInfo guardianInfo : piChildrenGuardianInfoList){
                        if("0".equals(guardianInfo.getRelationship())){
                            fatherGuardian = guardianInfo;
                        }else if("1".equals(guardianInfo.getRelationship())){
                            matherGuardian = guardianInfo;
                        }else {
                            otherGuardian = guardianInfo;
                        }
                    }
                }
                Map<String, Object> map = generateExcel(fileName, childrenExcelVO, userMap.get(childrenExcelVO.getCreator()), fatherGuardian, matherGuardian, otherGuardian);
                zipEntryList.add(map);
                ZipEntry zipEntryDetail = (ZipEntry) map.get("zip");
                InputStream in = (InputStream) map.get("stream");
                // Add ZIP entry to output stream.
                zipout.putNextEntry(zipEntryDetail);
                // Transfer bytes from the file to the ZIP file
                int len;
                while ((len = in.read(buf)) > 0) {
                    zipout.write(buf, 0, len);
                }
                // Complete the entry
                zipout.closeEntry();
                in.close();
            }
            zipout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Map<String, Object> generateExcel(String fileName, PiChildrenBaseInfoVO childrenExcelVO, String userName, PiChildrenGuardianInfo fatherGuardian, PiChildrenGuardianInfo matherGuardian, PiChildrenGuardianInfo otherGuardian) {
        ByteArrayOutputStream bos = null;
        BufferedImage bufferImg = null;
        try {
            ExcelUtils excelUtils = new ExcelUtils();

            InputStream is = null;
            XSSFWorkbook workbook = null;
            XSSFSheet sheet = null;
            try {
                is = excelUtils.getTempleteStream("/children.xlsx");// 将excel文件转为输入流
                workbook = new XSSFWorkbook(is);// 创建个workbook，
                // 获取第一个sheet
                sheet = workbook.getSheetAt(0);
            } catch (Exception e1) {
                e1.printStackTrace();
            }

            if (sheet != null) {
                Iterator<Row> rows = sheet.rowIterator();
                Row row = rows.next();
                //跳过表头
                row = rows.next();
                row = rows.next();
                row = rows.next();
                row = rows.next();
                /**
                 * 儿童基本信息
                 */
                //姓名
                row.getCell(2).setCellValue(childrenExcelVO.getChildName());
                //身份证号
                row.getCell(4).setCellValue(childrenExcelVO.getChildIdNo());
                //联系电话
                row.getCell(6).setCellValue(childrenExcelVO.getChildTelNo());
                row = rows.next();
                //民 族
                row.getCell(2).setCellValue(childrenExcelVO.getChildNationality());
                //性别
                row.getCell(4).setCellValue(childrenExcelVO.getChildMale());
                //入户情况
                row.getCell(6).setCellValue(childrenExcelVO.getHomeSituation());
                row = rows.next();
                //户口地址
                row.getCell(2).setCellValue((childrenExcelVO.getChildAccountProvince() == null ? "" : childrenExcelVO.getChildAccountProvince()) +
                        (childrenExcelVO.getChildAccountCity() == null ? "" : childrenExcelVO.getChildAccountCity()) +
                        (childrenExcelVO.getChildAccountCounty() == null ? "" : childrenExcelVO.getChildAccountCounty()) +
                        (childrenExcelVO.getChildAccountTown() == null ? "" : childrenExcelVO.getChildAccountTown()) +
                        (childrenExcelVO.getChildAccountAddress() == null ? "" : childrenExcelVO.getChildAccountAddress()));
                row = rows.next();
                //现住址
                row.getCell(2).setCellValue((childrenExcelVO.getChildCurrentProvince() == null ? "" : childrenExcelVO.getChildCurrentProvince()) +
                        (childrenExcelVO.getChildCurrentCity() == null ? "" : childrenExcelVO.getChildCurrentCity()) +
                        (childrenExcelVO.getChildCurrentCounty() == null ? "" : childrenExcelVO.getChildCurrentCounty()) +
                        (childrenExcelVO.getChildCurrentTown() == null ? "" : childrenExcelVO.getChildCurrentTown()) +
                        (childrenExcelVO.getChildCurrentAddress() == null ? "" : childrenExcelVO.getChildCurrentAddress()));
                row = rows.next();
                //健康状况
                row.getCell(2).setCellValue(childrenExcelVO.getChildHealthStatus());
                //上报类型
                row.getCell(4).setCellValue(childrenExcelVO.getChildEscalationType());
                //残疾类型
                row.getCell(6).setCellValue(childrenExcelVO.getChildDisabilityType());
                row = rows.next();
                //残疾等级
                row.getCell(2).setCellValue(childrenExcelVO.getChildDisabilityLevel());
                //患病病种
                row.getCell(4).setCellValue(childrenExcelVO.getChildDiseaseType());
                //就学情况
                row.getCell(6).setCellValue(childrenExcelVO.getChildSchoolAttendance());
                row = rows.next();
                //其他情况
                row.getCell(1).setCellValue(childrenExcelVO.getChildOtherCases());
                //社会福利救助扶贫落实情况
                row.getCell(3).setCellValue(childrenExcelVO.getChildPovertyAlleviationImplementation());
                //遭受监护人侵害的情形
                row.getCell(5).setCellValue(childrenExcelVO.getChildViolationGuardian());
                //父亲基本情况
                row = rows.next();
                //姓名
                row.getCell(2).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getName());
                //身份证号
                row.getCell(4).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getIdNo());
                //联系电话
                row.getCell(6).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getTelNo());
                row = rows.next();
                //户口地址
                row.getCell(2).setCellValue(fatherGuardian == null ? "" : (fatherGuardian.getAccountProvince() == null ? "" : fatherGuardian.getAccountProvince()) +
                        (fatherGuardian.getAccountCity() == null ? "" : fatherGuardian.getAccountCity()) +
                        (fatherGuardian.getAccountCounty() == null ? "" : fatherGuardian.getAccountCounty()) +
                        (fatherGuardian.getAccountTown() == null ? "" : fatherGuardian.getAccountTown()) +
                        (fatherGuardian.getAccountAddress() == null ? "" : fatherGuardian.getAccountAddress()));
                row = rows.next();
                //现住址
                row.getCell(2).setCellValue(fatherGuardian == null ? "" : (fatherGuardian.getCurrentProvince() == null ? "" : fatherGuardian.getCurrentProvince()) +
                        (fatherGuardian.getCurrentCity() == null ? "" : fatherGuardian.getCurrentCity()) +
                        (fatherGuardian.getCurrentCounty() == null ? "" : fatherGuardian.getCurrentCounty()) +
                        (fatherGuardian.getCurrentTown() == null ? "" : fatherGuardian.getCurrentTown()) +
                        (fatherGuardian.getCurrentAddress() == null ? "" : fatherGuardian.getCurrentAddress()));
                row = rows.next();
                //健康状况
                row.getCell(2).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getHealthStatus());
                //残疾类型
                row.getCell(4).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getDisabilityType());
                //残疾等级
                row.getCell(6).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getDisabilityLevel());
                row = rows.next();
                //患病病种
                row.getCell(2).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getDiseaseType());
                //家庭经济来源
                row.getCell(4).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getFamilyIncome());
                //其他情况
                row.getCell(6).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getOtherCases());
                //母亲基本情况
                row = rows.next();
                //姓名
                row.getCell(2).setCellValue(matherGuardian == null ? "" : matherGuardian.getName());
                //身份证号
                row.getCell(4).setCellValue(matherGuardian == null ? "" : matherGuardian.getIdNo());
                //联系电话
                row.getCell(6).setCellValue(matherGuardian == null ? "" : matherGuardian.getTelNo());
                row = rows.next();
                //户口地址
                row.getCell(2).setCellValue(matherGuardian == null ? "" : (matherGuardian.getAccountProvince() == null ? "" : matherGuardian.getAccountProvince()) +
                        (matherGuardian.getAccountCity() == null ? "" : matherGuardian.getAccountCity()) +
                        (matherGuardian.getAccountCounty() == null ? "" : matherGuardian.getAccountCounty()) +
                        (matherGuardian.getAccountTown() == null ? "" : matherGuardian.getAccountTown()) +
                        (matherGuardian.getAccountAddress() == null ? "" : matherGuardian.getAccountAddress()));
                row = rows.next();
                //现住址
                row.getCell(2).setCellValue(matherGuardian == null ? "" : (matherGuardian.getCurrentProvince() == null ? "" : matherGuardian.getCurrentProvince()) +
                        (matherGuardian.getCurrentCity() == null ? "" : matherGuardian.getCurrentCity()) +
                        (matherGuardian.getCurrentCounty() == null ? "" : matherGuardian.getCurrentCounty()) +
                        (matherGuardian.getCurrentTown() == null ? "" : matherGuardian.getCurrentTown()) +
                        (matherGuardian.getCurrentAddress() == null ? "" : matherGuardian.getCurrentAddress()));
                row = rows.next();
                //健康状况
                row.getCell(2).setCellValue(matherGuardian == null ? "" : matherGuardian.getHealthStatus());
                //残疾类型
                row.getCell(4).setCellValue(matherGuardian == null ? "" : matherGuardian.getDisabilityType());
                //残疾等级
                row.getCell(6).setCellValue(matherGuardian == null ? "" : matherGuardian.getDisabilityLevel());
                row = rows.next();
                //患病病种
                row.getCell(2).setCellValue(matherGuardian == null ? "" : matherGuardian.getDiseaseType());
                //家庭经济来源
                row.getCell(4).setCellValue(matherGuardian == null ? "" : matherGuardian.getFamilyIncome());
                //其他情况
                row.getCell(6).setCellValue(matherGuardian == null ? "" : matherGuardian.getOtherCases());
                //其他监护人情况
                row = rows.next();
                //监护人姓名
                row.getCell(2).setCellValue(otherGuardian == null ? "" : otherGuardian.getName());
                //身份证号
                row.getCell(4).setCellValue(otherGuardian == null ? "" : otherGuardian.getIdNo());
                //联系电话
                row.getCell(6).setCellValue(otherGuardian == null ? "" : otherGuardian.getTelNo());
                row = rows.next();
                //与儿童关系
                row.getCell(2).setCellValue(otherGuardian == null ? "" : otherGuardian.getName());
                //健康状况
                row.getCell(4).setCellValue(otherGuardian == null ? "" : otherGuardian.getHealthStatus());
                //残疾类型
                row.getCell(6).setCellValue(otherGuardian == null ? "" : otherGuardian.getDisabilityType());
                row = rows.next();
                //残疾等级
                row.getCell(2).setCellValue(otherGuardian == null ? "" : otherGuardian.getDisabilityLevel());
                //患病病种
                row.getCell(4).setCellValue(otherGuardian == null ? "" : otherGuardian.getDiseaseType());
                //其他监护人原由
                row.getCell(6).setCellValue(otherGuardian == null ? "" : otherGuardian.getReasons());
                /**
                 * 机构
                 * */
                row = rows.next();
                //机构名称
                row.getCell(2).setCellValue(childrenExcelVO.getOrganizationName());
                //负责人
                row.getCell(4).setCellValue(childrenExcelVO.getOrganizationPrincipal());
                //联系电话
                row.getCell(6).setCellValue(childrenExcelVO.getOrganizationTelNo());
                row = rows.next();
                //单位性质
                row.getCell(2).setCellValue(childrenExcelVO.getOrganizationNature());
                //居住地址
                row.getCell(4).setCellValue((childrenExcelVO.getOrganizationResidentialProvince() == null ? "" : childrenExcelVO.getOrganizationResidentialProvince()) +
                        (childrenExcelVO.getOrganizationResidentialCity() == null ? "" : childrenExcelVO.getOrganizationResidentialCity()) +
                        (childrenExcelVO.getOrganizationResidentialCounty() == null ? "" : childrenExcelVO.getOrganizationResidentialCounty()) +
                        (childrenExcelVO.getOrganizationResidentialTown() == null ? "" : childrenExcelVO.getOrganizationResidentialTown()) +
                        (childrenExcelVO.getOrganizationResidentialAddress() == null ? "" : childrenExcelVO.getOrganizationResidentialAddress()));
                /**
                 * 帮扶计划
                 * */
                row = rows.next();
                //帮扶计划
                row.getCell(2).setCellValue(childrenExcelVO.getHelpSuggestions());

                /**
                 * 保障费发放情况
                 * */
                row = rows.next();
                //领取方式
                row.getCell(2).setCellValue(childrenExcelVO.getSecurityFeeCollectionMethod());
                //领取人（开户人）
                row.getCell(4).setCellValue(childrenExcelVO.getSecurityFeeCollector());
                //领取人与儿童关系
                row.getCell(6).setCellValue(childrenExcelVO.getSecurityFeeRecipientRelationship());
                row = rows.next();
                //保障标准
                row.getCell(2).setCellValue(childrenExcelVO.getSecurityFeeGuaranteeStandard() + "                元（每人每月发放多少补助资金）");

                /**
                 * 申请人签字
                 * */
                row = rows.next();

                /**
                 * 核查人签字
                 * */
                row = rows.next();
                row.getCell(1).setCellValue(userName);

                try {
                    // 写数据
                    bos = new ByteArrayOutputStream();

                    // 先把读进来的图片放到一个ByteArrayOutputStream中，以便产生ByteArray
                    FileInfo fileInfo = fileInfoMapper.queryOneFilesByCatByFlag(childrenExcelVO.getChildId(), "申请人签字");
                    if (fileInfo != null) {
                        ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
                        String realPath = fileKitConfig.getFilePath() + fileInfo.getFilePath();

                        File file = new File(realPath);
                        if (file.exists()) {
                            bufferImg = ImageIO.read(file);
                            if (bufferImg != null) {
                                ImageIO.write(bufferImg, "jpg", byteArrayOut);
                                //画图的顶级管理器，一个sheet只能获取一个（一定要注意这点）
                                XSSFDrawing patriarch = sheet.createDrawingPatriarch();
                                XSSFClientAnchor anchor = new XSSFClientAnchor(10240000, 102400, 10240000, 1024000, (short) 2, 29, (short) 4, 29);
                                anchor.setAnchorType(1);
                                //插入图片
                                patriarch.createPicture(anchor, workbook.addPicture(byteArrayOut.toByteArray(), XSSFWorkbook.PICTURE_TYPE_JPEG));
                                bufferImg = null;
                            }
                        }
                    }
                    workbook.write(bos);
                    bos.flush();
                    bos.close();
                    byte[] barray = bos.toByteArray();
                    InputStream ais = new ByteArrayInputStream(barray);
                    ais.close();
                    ZipEntry zipEntry = new ZipEntry(childrenExcelVO.getChildName() + fileName + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".xlsx");
                    Map<String, Object> map = new HashMap();
                    map.put("stream", ais);
                    map.put("zip", zipEntry);
                    return map;
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (null != is) {
                            is.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            //获取response
//            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//            HttpServletResponse response = servletRequestAttributes.getResponse();
//            BaseRenderExcel.renderExcel(response, bos.toByteArray(), fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}