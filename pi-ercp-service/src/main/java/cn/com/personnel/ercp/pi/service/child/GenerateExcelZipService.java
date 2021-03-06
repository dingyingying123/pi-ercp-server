package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.common.autoconfig.ExcelUtils;
import cn.com.personnel.ercp.common.kit.FileKitConfig;
import cn.com.personnel.ercp.common.kit.JdPushVo;
import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.common.persistence.mapper.FileInfoMapper;
import cn.com.personnel.ercp.common.util.StringCtrlUtils;
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

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.imageio.ImageIO;
import javax.mail.*;
import javax.mail.internet.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.*;
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
//    @Autowired
//    IJdPushService jdPushService;

    @Async
    @Override
    public void generateExcelZip(String fileName, String pathname, List<PiChildrenBaseInfoVO> childrenExcelVOList, String toMail, SecUser secUser) {
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
            String zipname= "Children_Info_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())  + ".zip";
            pathname = fileKitConfig.getFileTemp() + new String(zipname.getBytes(), StandardCharsets.UTF_8);
            byte[] buf = new byte[1024];
            FileOutputStream fos = null;
            File zipFile = new File(fileKitConfig.getFilePath() +pathname);
            //????????????
            zipFile.createNewFile();
            fos = new FileOutputStream(zipFile);
            //??????????????????????????????
            ZipOutputStream zipout = new ZipOutputStream(fos);
            List<Map<String, Object>> zipEntryList = new ArrayList<>();
            int i = 1;
            for(PiChildrenBaseInfoVO childrenExcelVO : childrenExcelVOList) {
                logger.info("===========????????????" + i++ + "???");
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
                if(i % 500 == 0){
                    zipout.close();
                    sendEmail(fileKitConfig.getFilePath() + pathname, "????????????????????????" + zipname, toMail);
                    zipEntryList.clear();
                    zipname= "Children_Info_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".zip";
                    pathname = fileKitConfig.getFileTemp() + new String(zipname.getBytes(), StandardCharsets.UTF_8);
                    zipFile = new File(fileKitConfig.getFilePath() +pathname);
                    //????????????
                    zipFile.createNewFile();
                    fos = new FileOutputStream(zipFile);
                    //??????????????????????????????
                    zipout = new ZipOutputStream(fos);
                }
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
//            JdPushVo jdPushVo = new JdPushVo();
//            jdPushVo.setAlias(secUser.getUserId());
//            jdPushVo.setDeviceTagAlias(secUser.getUserId());
//            jdPushVo.setAlert("????????????????????????????????????????????????????????????????????????");
//            jdPushVo.setTitle("????????????????????????");
//            jdPushService.jpushAndroid(jdPushVo);
            if(i % 500 != 0) {
                sendEmail(fileKitConfig.getFilePath() + pathname, "????????????????????????" + zipname, toMail);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Async
    @Override
    public void sendEmail(String path, String subject, String toMail) throws Exception {
        logger.info("============??????????????????:" + path + "???????????????" + toMail);
        /*
         * 1. ??????session
         */
//        Properties props = new Properties();
//        props.setProperty("mail.smtp.host", "smtp.163.com");
//        props.setProperty("mail.smtp.auth", "true");

        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        //????????????????????????
        Properties props = new Properties();
        //??????????????????????????????
        props.setProperty("mail.smtp.host", "smtp.163.com");
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        //???????????????????????????,???????????????465??????
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.auth", "true");

        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {//IMAP/SMTP  UJMAMHEROJENFFWV
                return new PasswordAuthentication(fileKitConfig.getFileMail(), fileKitConfig.getFilePassw());
            }
        };
        Session session = Session.getInstance(props, auth);
        //??????????????????????????????????????????
//        session.setDebug(true);
        // ??????????????????
        MimeMessage msg = new MimeMessage(session);
        // ???????????????
        msg.setFrom(new InternetAddress(fileKitConfig.getFileMail()));
        // ???????????????
        msg.setRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress(toMail)});
        // ??????????????????
        msg.setSubject(subject);

        //????????????????????????
        MimeMultipart list = new MimeMultipart();//??????????????????

//        MimeBodyPart part1 = new MimeBodyPart();//??????????????????
//        part1.setContent("????????????", "text/html;charset=utf-8");//??????????????????
//        list.addBodyPart(part1);//????????????????????????????????????????????????

        File file = new File(path);
        MimeBodyPart part2 = new MimeBodyPart();//??????????????????2
//        part2.attachFile(file);//??????????????????????????????
        FileDataSource fileDataSource = new FileDataSource(path);
        part2.setDataHandler(new DataHandler(fileDataSource));
        part2.setFileName(MimeUtility.encodeText(fileDataSource.getName()));
        list.addBodyPart(part2);//?????????????????????????????????
        // ????????????????????????
        msg.setContent(list, "text/html;charset=utf-8");//??????????????????????????????????????????????????????
        // ????????????
        Transport.send(msg);
        file.delete();
        logger.info("============??????????????????:" + path + "???????????????" + toMail);
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
                is = excelUtils.getTempleteStream("/children.xlsx");// ???excel?????????????????????
                workbook = new XSSFWorkbook(is);// ?????????workbook???
                // ???????????????sheet
                sheet = workbook.getSheetAt(0);
            } catch (Exception e1) {
                e1.printStackTrace();
            }

            if (sheet != null) {
                Iterator<Row> rows = sheet.rowIterator();
                Row row = rows.next();
                //????????????
                row = rows.next();
                row = rows.next();
                row = rows.next();
                row = rows.next();
                /**
                 * ??????????????????
                 */
                //??????
                row.getCell(2).setCellValue(childrenExcelVO.getChildName());
                //????????????
                row.getCell(4).setCellValue(childrenExcelVO.getChildIdNo());
                //????????????
                row.getCell(6).setCellValue(childrenExcelVO.getChildTelNo());
                row = rows.next();
                //??? ???
                row.getCell(2).setCellValue(childrenExcelVO.getChildNationality());
                //??????
                row.getCell(4).setCellValue(childrenExcelVO.getChildMale());
                //????????????
                row.getCell(6).setCellValue(childrenExcelVO.getHomeSituation());
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue((childrenExcelVO.getChildAccountProvince() == null ? "" : childrenExcelVO.getChildAccountProvince()) +
                        (childrenExcelVO.getChildAccountCity() == null ? "" : childrenExcelVO.getChildAccountCity()) +
                        (childrenExcelVO.getChildAccountCounty() == null ? "" : childrenExcelVO.getChildAccountCounty()) +
                        (childrenExcelVO.getChildAccountTown() == null ? "" : childrenExcelVO.getChildAccountTown()) +
                        (childrenExcelVO.getChildAccountAddress() == null ? "" : childrenExcelVO.getChildAccountAddress()));
                row = rows.next();
                //?????????
                row.getCell(2).setCellValue((childrenExcelVO.getChildCurrentProvince() == null ? "" : childrenExcelVO.getChildCurrentProvince()) +
                        (childrenExcelVO.getChildCurrentCity() == null ? "" : childrenExcelVO.getChildCurrentCity()) +
                        (childrenExcelVO.getChildCurrentCounty() == null ? "" : childrenExcelVO.getChildCurrentCounty()) +
                        (childrenExcelVO.getChildCurrentTown() == null ? "" : childrenExcelVO.getChildCurrentTown()) +
                        (childrenExcelVO.getChildCurrentAddress() == null ? "" : childrenExcelVO.getChildCurrentAddress()));
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(childrenExcelVO.getChildHealthStatus());
                //????????????
                row.getCell(4).setCellValue(childrenExcelVO.getChildEscalationType());
                //????????????
                row.getCell(6).setCellValue(childrenExcelVO.getChildDisabilityType());
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(childrenExcelVO.getChildDisabilityLevel());
                //????????????
                row.getCell(4).setCellValue(childrenExcelVO.getChildDiseaseType());
                //????????????
                row.getCell(6).setCellValue(childrenExcelVO.getChildSchoolAttendance());
                row = rows.next();
                //????????????
                row.getCell(1).setCellValue(childrenExcelVO.getChildOtherCases());
                //????????????????????????????????????
                row.getCell(3).setCellValue(childrenExcelVO.getChildPovertyAlleviationImplementation());
                //??????????????????????????????
                row.getCell(5).setCellValue(childrenExcelVO.getChildViolationGuardian());
                //??????????????????
                row = rows.next();
                //??????
                row.getCell(2).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getName());
                //????????????
                row.getCell(4).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getIdNo());
                //????????????
                row.getCell(6).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getTelNo());
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(fatherGuardian == null ? "" : (fatherGuardian.getAccountProvince() == null ? "" : fatherGuardian.getAccountProvince()) +
                        (fatherGuardian.getAccountCity() == null ? "" : fatherGuardian.getAccountCity()) +
                        (fatherGuardian.getAccountCounty() == null ? "" : fatherGuardian.getAccountCounty()) +
                        (fatherGuardian.getAccountTown() == null ? "" : fatherGuardian.getAccountTown()) +
                        (fatherGuardian.getAccountAddress() == null ? "" : fatherGuardian.getAccountAddress()));
                row = rows.next();
                //?????????
                row.getCell(2).setCellValue(fatherGuardian == null ? "" : (fatherGuardian.getCurrentProvince() == null ? "" : fatherGuardian.getCurrentProvince()) +
                        (fatherGuardian.getCurrentCity() == null ? "" : fatherGuardian.getCurrentCity()) +
                        (fatherGuardian.getCurrentCounty() == null ? "" : fatherGuardian.getCurrentCounty()) +
                        (fatherGuardian.getCurrentTown() == null ? "" : fatherGuardian.getCurrentTown()) +
                        (fatherGuardian.getCurrentAddress() == null ? "" : fatherGuardian.getCurrentAddress()));
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getHealthStatus());
                //????????????
                row.getCell(4).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getDisabilityType());
                //????????????
                row.getCell(6).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getDisabilityLevel());
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getDiseaseType());
                //??????????????????
                row.getCell(4).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getFamilyIncome());
                //????????????
                row.getCell(6).setCellValue(fatherGuardian == null ? "" : fatherGuardian.getOtherCases());
                //??????????????????
                row = rows.next();
                //??????
                row.getCell(2).setCellValue(matherGuardian == null ? "" : matherGuardian.getName());
                //????????????
                row.getCell(4).setCellValue(matherGuardian == null ? "" : matherGuardian.getIdNo());
                //????????????
                row.getCell(6).setCellValue(matherGuardian == null ? "" : matherGuardian.getTelNo());
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(matherGuardian == null ? "" : (matherGuardian.getAccountProvince() == null ? "" : matherGuardian.getAccountProvince()) +
                        (matherGuardian.getAccountCity() == null ? "" : matherGuardian.getAccountCity()) +
                        (matherGuardian.getAccountCounty() == null ? "" : matherGuardian.getAccountCounty()) +
                        (matherGuardian.getAccountTown() == null ? "" : matherGuardian.getAccountTown()) +
                        (matherGuardian.getAccountAddress() == null ? "" : matherGuardian.getAccountAddress()));
                row = rows.next();
                //?????????
                row.getCell(2).setCellValue(matherGuardian == null ? "" : (matherGuardian.getCurrentProvince() == null ? "" : matherGuardian.getCurrentProvince()) +
                        (matherGuardian.getCurrentCity() == null ? "" : matherGuardian.getCurrentCity()) +
                        (matherGuardian.getCurrentCounty() == null ? "" : matherGuardian.getCurrentCounty()) +
                        (matherGuardian.getCurrentTown() == null ? "" : matherGuardian.getCurrentTown()) +
                        (matherGuardian.getCurrentAddress() == null ? "" : matherGuardian.getCurrentAddress()));
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(matherGuardian == null ? "" : matherGuardian.getHealthStatus());
                //????????????
                row.getCell(4).setCellValue(matherGuardian == null ? "" : matherGuardian.getDisabilityType());
                //????????????
                row.getCell(6).setCellValue(matherGuardian == null ? "" : matherGuardian.getDisabilityLevel());
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(matherGuardian == null ? "" : matherGuardian.getDiseaseType());
                //??????????????????
                row.getCell(4).setCellValue(matherGuardian == null ? "" : matherGuardian.getFamilyIncome());
                //????????????
                row.getCell(6).setCellValue(matherGuardian == null ? "" : matherGuardian.getOtherCases());
                //?????????????????????
                row = rows.next();
                //???????????????
                row.getCell(2).setCellValue(otherGuardian == null ? "" : otherGuardian.getName());
                //????????????
                row.getCell(4).setCellValue(otherGuardian == null ? "" : otherGuardian.getIdNo());
                //????????????
                row.getCell(6).setCellValue(otherGuardian == null ? "" : otherGuardian.getTelNo());
                row = rows.next();
                //???????????????
                row.getCell(2).setCellValue(otherGuardian == null ? "" : otherGuardian.getName());
                //????????????
                row.getCell(4).setCellValue(otherGuardian == null ? "" : otherGuardian.getHealthStatus());
                //????????????
                row.getCell(6).setCellValue(otherGuardian == null ? "" : otherGuardian.getDisabilityType());
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(otherGuardian == null ? "" : otherGuardian.getDisabilityLevel());
                //????????????
                row.getCell(4).setCellValue(otherGuardian == null ? "" : otherGuardian.getDiseaseType());
                //?????????????????????
                row.getCell(6).setCellValue(otherGuardian == null ? "" : otherGuardian.getReasons());
                /**
                 * ??????
                 * */
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(childrenExcelVO.getOrganizationName());
                //?????????
                row.getCell(4).setCellValue(childrenExcelVO.getOrganizationPrincipal());
                //????????????
                row.getCell(6).setCellValue(childrenExcelVO.getOrganizationTelNo());
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(childrenExcelVO.getOrganizationNature());
                //????????????
                row.getCell(4).setCellValue((childrenExcelVO.getOrganizationResidentialProvince() == null ? "" : childrenExcelVO.getOrganizationResidentialProvince()) +
                        (childrenExcelVO.getOrganizationResidentialCity() == null ? "" : childrenExcelVO.getOrganizationResidentialCity()) +
                        (childrenExcelVO.getOrganizationResidentialCounty() == null ? "" : childrenExcelVO.getOrganizationResidentialCounty()) +
                        (childrenExcelVO.getOrganizationResidentialTown() == null ? "" : childrenExcelVO.getOrganizationResidentialTown()) +
                        (childrenExcelVO.getOrganizationResidentialAddress() == null ? "" : childrenExcelVO.getOrganizationResidentialAddress()));
                /**
                 * ????????????
                 * */
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(childrenExcelVO.getHelpSuggestions());

                /**
                 * ?????????????????????
                 * */
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(childrenExcelVO.getSecurityFeeCollectionMethod());
                //????????????????????????
                row.getCell(4).setCellValue(childrenExcelVO.getSecurityFeeCollector());
                //????????????????????????
                row.getCell(6).setCellValue(childrenExcelVO.getSecurityFeeRecipientRelationship());
                row = rows.next();
                //????????????
                row.getCell(2).setCellValue(childrenExcelVO.getSecurityFeeGuaranteeStandard() + "                ?????????????????????????????????????????????");

                /**
                 * ???????????????
                 * */
                row = rows.next();

                /**
                 * ???????????????
                 * */
                row = rows.next();
                row.getCell(1).setCellValue(userName);

                try {
                    // ?????????
                    bos = new ByteArrayOutputStream();

                    // ????????????????????????????????????ByteArrayOutputStream??????????????????ByteArray
                    FileInfo fileInfo = fileInfoMapper.queryOneFilesByCatByFlag(childrenExcelVO.getChildId(), "???????????????");
                    if (fileInfo != null) {
                        ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
                        String realPath = fileKitConfig.getFilePath() + fileInfo.getFilePath();

                        File file = new File(StringCtrlUtils.changeString(realPath));
                        if (file.exists()) {
                            bufferImg = ImageIO.read(file);
                            if (bufferImg != null) {
                                ImageIO.write(bufferImg, "jpg", byteArrayOut);
                                //?????????????????????????????????sheet?????????????????????????????????????????????
                                XSSFDrawing patriarch = sheet.createDrawingPatriarch();
                                XSSFClientAnchor anchor = new XSSFClientAnchor(10240000, 102400, 10240000, 1024000, (short) 2, 29, (short) 4, 29);
                                anchor.setAnchorType(1);
                                //????????????
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

            //??????response
//            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//            HttpServletResponse response = servletRequestAttributes.getResponse();
//            BaseRenderExcel.renderExcel(response, bos.toByteArray(), fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}