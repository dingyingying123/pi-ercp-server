package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.common.autoconfig.ExcelUtils;
import cn.com.personnel.ercp.common.autoconfig.MultiTitle;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.kit.FileKitConfig;
import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.common.persistence.mapper.FileInfoMapper;
import cn.com.personnel.ercp.common.service.IFileService;
import cn.com.personnel.ercp.common.util.DateUtils;
import cn.com.personnel.ercp.common.util.StringCtrlUtils;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.base.FileInfoVO;
import cn.com.personnel.ercp.pi.module.child.ChildrenFileInfoVO;
import cn.com.personnel.ercp.pi.module.child.ChildrenStatisticsInfoVO;
import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiAddress;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenGuardianInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenLocationInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiAddressMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiChildrenBaseInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiChildrenGuardianInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiChildrenLocationInfoMapper;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Service
public class PiChildrenBaseInfoService extends BaseService implements IPiChildrenBaseInfoService {
    private static final int BUFFER_SIZE = 1024;
    @Autowired
    PiChildrenBaseInfoMapper piChildrenBaseInfoMapper;
    @Autowired
    PiChildrenGuardianInfoMapper piChildrenGuardianInfoMapper;
    @Autowired
    PiChildrenLocationInfoMapper piChildrenLocationInfoMapper;
    @Autowired
    FileInfoMapper fileInfoMapper;
    @Autowired
    PiAddressMapper piAddressMapper;
    @Autowired
    SecUserMapper secUserMapper;
    @Autowired
    private FileKitConfig fileKitConfig;
    @Autowired
    IFileService fileService;
    @Autowired
    IGenerateExcelZipService generateExcelZipService;

    public static final Integer MAIL_SIZE = 31457280;

    @Override
    public ReturnEntity queryPiChildrenBaseInfoList(PiChildrenBaseInfoVO piChildrenBaseInfo, PagenationQueryParameter buildPagenation) {
        logger.info("===========type:" + piChildrenBaseInfo.getType() + ",status:" + piChildrenBaseInfo.getStatus());
        logger.info("===========??????:" + JSONObject.toJSONString(piChildrenBaseInfo));
        List<PiChildrenBaseInfoVO> childrenBaseInfoList = null;
        //??????
        setPageHelper(buildPagenation);
        if(StringUtils.isNotEmpty(piChildrenBaseInfo.getType())){
            if("0".equals(piChildrenBaseInfo.getType())){//0????????????1?????????
                piChildrenBaseInfo.setStatus(piChildrenBaseInfo.getType());
                //??????????????????
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
            }else if("1".equals(piChildrenBaseInfo.getType())){//1?????????
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.NOTDRAFT);
                //??????????????????
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
            }else if("2".equals(piChildrenBaseInfo.getType())){//???????????????
                piChildrenBaseInfo.setCreator(null);
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.APPROVING);
                //??????????????????
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
            }else if("8".equals(piChildrenBaseInfo.getType())){//?????????????????????????????????
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.APPROVED);
                //??????????????????
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
            }else if("3".equals(piChildrenBaseInfo.getType())){//????????????????????????????????????
                piChildrenBaseInfo.setCaseStatus(CommonConstants.ServerApprovalStatus.CASE_SUBMITED);
                //??????????????????
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryTakeCaseList(piChildrenBaseInfo);
            }else if("4".equals(piChildrenBaseInfo.getType())){//????????????????????????????????????
                piChildrenBaseInfo.setEstimateStatus(CommonConstants.ServerApprovalStatus.ESTIMATE_SUBMITED);
                //??????????????????
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryEstimateList(piChildrenBaseInfo);
            }else if("5".equals(piChildrenBaseInfo.getType())){//????????????????????????????????????
                piChildrenBaseInfo.setPlanStatus(CommonConstants.ServerApprovalStatus.PLANSUBMITED);
                //??????????????????
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryPlanList(piChildrenBaseInfo);
            }else if("6".equals(piChildrenBaseInfo.getType())){//????????????????????????????????????
                piChildrenBaseInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED);
                //??????????????????
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryInterventionList(piChildrenBaseInfo);
            }else if("7".equals(piChildrenBaseInfo.getType())){//????????????????????????????????????
                piChildrenBaseInfo.setEvaluateStatus(CommonConstants.ServerApprovalStatus.EVALUATE_SUBMIT);
                //??????????????????
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryEvaluateList(piChildrenBaseInfo);
            }
        }else{
            //??????????????????
            childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
        }
        //????????????
        return ReturnEntity.ok(new PageInfo<>(childrenBaseInfoList));
    }

    @Override
    public ReturnEntity savePiChildrenBaseInfo(PiChildrenBaseInfoVO piChildrenBaseInfo, SecUser secUser) {
        logger.info("===========ChildId:" + piChildrenBaseInfo.getChildId() + ",????????????:" + piChildrenBaseInfo.getChildIdNo());
        logger.info("===========????????????:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo != null && StringUtils.isNotEmpty(piChildrenBaseInfo.getChildId())){
            try {
                String age = DateUtils.getAge(piChildrenBaseInfo.getChildIdNo());
                if(StringUtils.isNotEmpty(age) && !"false".equals(age)){
                    piChildrenBaseInfo.setChildAge(age);
                }
                piChildrenBaseInfo.setUpdateTime(new Date());
                piChildrenBaseInfo.setUpdator(secUser.getUserId());
                piChildrenBaseInfo.setArea(secUser.getArea());
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.DRAFT);//?????????
                piChildrenBaseInfoMapper.updateByPrimaryKeySelective(piChildrenBaseInfo);
            }catch (Exception e){
                return  ReturnEntity.errorMsg("??????????????????????????????");
            }
            List<PiChildrenGuardianInfo> piChildrenGuardianInfoList = piChildrenBaseInfo.getPiChildrenGuardianInfoList();

            if(piChildrenGuardianInfoList != null && piChildrenGuardianInfoList.size() > 0){
                Example example = new Example(PiChildrenGuardianInfo.class);
                example.createCriteria().andEqualTo("childId", piChildrenBaseInfo.getChildId());
                List<PiChildrenGuardianInfo> piChildrenGuardianInfos = piChildrenGuardianInfoMapper.selectByExample(example);
                if(piChildrenGuardianInfos.size() > 0){
                    Boolean flag = true;
                    for (int i = 0; i < piChildrenGuardianInfos.size(); i++){
                        flag = true;
                        PiChildrenGuardianInfo piChildrenGuardianInfo = piChildrenGuardianInfos.get(i);
                        logger.info("=======?????????1=====getRelationship:" + piChildrenGuardianInfo.getRelationship());
                        for(PiChildrenGuardianInfo childrenGuardianInfo : piChildrenGuardianInfoList){

                            logger.info("=======?????????2=====getRelationship:" + childrenGuardianInfo.getRelationship());
                            if(!checkGuardian(childrenGuardianInfo))continue;
                            if(piChildrenGuardianInfo.getRelationship() != null && piChildrenGuardianInfo.getRelationship().equals(childrenGuardianInfo.getRelationship())){
                                logger.info("=======????????????=====getRelationship:" + childrenGuardianInfo.getRelationship());
                                flag = false;
                            }
                        }
                        logger.info("=======???????????????=====flag:" + flag);
                        if(flag){
                            logger.info("=======???????????????=====");
                            piChildrenGuardianInfoMapper.deleteByPrimaryKey(piChildrenGuardianInfo.getGuardianId());
                            piChildrenGuardianInfos.remove(piChildrenGuardianInfo);
                            i--;
                        }
                    }
                }
                if(piChildrenGuardianInfoList != null && piChildrenGuardianInfoList.size() > 0) {
                    for (PiChildrenGuardianInfo childrenGuardianInfo : piChildrenGuardianInfoList) {
                        if(checkGuardian(childrenGuardianInfo)) {
                            if (StringUtils.isEmpty(childrenGuardianInfo.getGuardianId())) {
                                childrenGuardianInfo.setGuardianId(UUIDKit.getUUID());
                                childrenGuardianInfo.setChildId(piChildrenBaseInfo.getChildId());
                                String age1 = DateUtils.getAge(childrenGuardianInfo.getIdNo());
                                if (StringUtils.isNotEmpty(age1) && !"false".equals(age1)) {
                                    childrenGuardianInfo.setAge(age1);
                                }
                                childrenGuardianInfo.setCreator(secUser.getUserId());
                                childrenGuardianInfo.setCreateTime(new Date());
                                piChildrenGuardianInfoMapper.insert(childrenGuardianInfo);
                            } else {
                                String age1 = DateUtils.getAge(childrenGuardianInfo.getIdNo());
                                if (StringUtils.isNotEmpty(age1) && !"false".equals(age1)) {
                                    childrenGuardianInfo.setAge(age1);
                                }
                                childrenGuardianInfo.setUpdator(secUser.getUserId());
                                childrenGuardianInfo.setUpdateTime(new Date());
                                piChildrenGuardianInfoMapper.updateByPrimaryKeySelective(childrenGuardianInfo);
                            }
                        }
                    }
                }
            }else {
                Example example = new Example(PiChildrenGuardianInfo.class);
                example.createCriteria().andEqualTo("childId", piChildrenBaseInfo.getChildId());
                piChildrenGuardianInfoMapper.deleteByExample(example);
            }
        }else{
            try {
                String childId = UUIDKit.getUUID();
                piChildrenBaseInfo.setChildId(childId);
                String age = DateUtils.getAge(piChildrenBaseInfo.getChildIdNo());
                if(StringUtils.isNotEmpty(age) && !"false".equals(age)){
                    piChildrenBaseInfo.setChildAge(age);
                }
                piChildrenBaseInfo.setCreateTime(new Date());
                piChildrenBaseInfo.setCreator(secUser.getUserId());
                piChildrenBaseInfo.setArea(secUser.getArea());
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.DRAFT);//?????????
                piChildrenBaseInfoMapper.insert(piChildrenBaseInfo);
                List<PiChildrenGuardianInfo> piChildrenGuardianInfoList = piChildrenBaseInfo.getPiChildrenGuardianInfoList();
                if(piChildrenGuardianInfoList != null && piChildrenGuardianInfoList.size() > 0) {
                    for (PiChildrenGuardianInfo childrenGuardianInfo : piChildrenGuardianInfoList) {
                        childrenGuardianInfo.setGuardianId(UUIDKit.getUUID());
                        childrenGuardianInfo.setChildId(childId);
                        String age1 = DateUtils.getAge(childrenGuardianInfo.getIdNo());
                        if(StringUtils.isNotEmpty(age1) && !"false".equals(age1)){
                            childrenGuardianInfo.setAge(age1);
                        }
                        childrenGuardianInfo.setCreator(secUser.getUserId());
                        childrenGuardianInfo.setCreateTime(new Date());
                        piChildrenGuardianInfoMapper.insert(childrenGuardianInfo);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
                return  ReturnEntity.errorMsg("??????????????????????????????");
            }
        }
        return ReturnEntity.ok(piChildrenBaseInfo);

    }

    private Boolean checkGuardian(PiChildrenGuardianInfo childrenGuardianInfo){
        Boolean check = false;
        if(childrenGuardianInfo == null){
            check = false;
        }else{
            if(StringUtils.isNotEmpty(childrenGuardianInfo.getIdNo())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getTelNo())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getAccountProvince())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getAccountCity())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getAccountCounty())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getAccountTown())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getAccountAddress())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getCurrentProvince())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getCurrentCity())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getCurrentCounty())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getCurrentTown())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getCurrentAddress())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getHealthStatus())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getDisabilityType())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getFamilyIncome())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getOtherCases())){
                check = true;
//            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getRelationship())){
//                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getReasons())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getMemberProfession())){
                check = true;
            }else if(StringUtils.isNotEmpty(childrenGuardianInfo.getIsLiveTogether())){
                check = true;
            }
        }
        return check;
    }

    @Override
    public ReturnEntity deletePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser) {
        logger.info("===========??????:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo != null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("??????????????????");
        }
        PiChildrenBaseInfo info = piChildrenBaseInfoMapper.selectByPrimaryKey(piChildrenBaseInfo.getChildId());
        if(CommonConstants.ApprovalStatus.DRAFT.equals(info.getStatus()) || CommonConstants.ApprovalStatus.NOTPASS.equals(info.getStatus()) || CommonConstants.ApprovalStatus.COMPLETED.equals(info.getStatus())) {
            Example example = new Example(PiChildrenGuardianInfo.class);
            example.createCriteria().andEqualTo("childId", piChildrenBaseInfo.getChildId());
            piChildrenGuardianInfoMapper.deleteByExample(example);
            piChildrenBaseInfoMapper.deleteByPrimaryKey(piChildrenBaseInfo.getChildId());
        }else{
            return ReturnEntity.errorMsg("?????????????????????????????????");
        }
        return ReturnEntity.ok();
    }

    /**
     * childEscalationType	??????????????????
     * childDisabilityType	??????????????????
     * childDisabilityLevel	??????????????????
     * childDiseaseType	??????????????????
     * childSchoolAttendance	??????????????????
     * childOtherCases	??????????????????
     * childPovertyAlleviationImplementation	??????????????????????????????????????????
     * childViolationGuardian	????????????????????????????????????
     * guardian	?????????
     * fatherName	????????????
     * fatherIdNo	??????????????????
     * fatherTelNo	??????????????????
     * fatherAccountAddress	??????????????????
     * fatherCurrentAddress	?????????/????????????
     * fatherHealthStatus	??????????????????
     * fatherDisabilityType	??????????????????
     * fatherDisabilityLevel	??????????????????
     * fatherDiseaseType	??????????????????
     * fatherFamilyIncome	????????????????????????
     * fatherOtherCases	??????????????????
     * motherName	????????????
     * motherIdNo	??????????????????
     * motherTelNo	??????????????????
     * motherAccountAddress	??????????????????
     * motherCurrentAddress	?????????/????????????
     * motherHealthStatus	??????????????????
     * motherDisabilityType	??????????????????
     * motherDisabilityLevel	??????????????????
     * motherDiseaseType	??????????????????
     * motherFamilyIncome	????????????????????????
     * motherOtherCases	??????????????????
     * otherGuardianName	?????????????????????
     * otherGuardianIdNo	???????????????????????????
     * otherGuardianTelNo	???????????????????????????
     * otherGuardianRelationshipWithChildren	??????????????????????????????
     * otherGuardianHealthStatus	???????????????????????????
     * otherGuardianDisabilityType	???????????????????????????
     * otherGuardianDisabilityLevel	???????????????????????????
     * otherGuardianDiseaseType	???????????????????????????
     * otherGuardianReasons	?????????????????????
     * organizationName	????????????
     * organizationPrincipal	???????????????
     * organizationTelNo	??????????????????
     * organizationNature	??????????????????
     * organizationResidentialAddress	??????????????????
     * helpSuggestions	????????????
     * securityFeeCollectionMethod	?????????????????????????????????
     * securityFeeCollector	?????????????????????????????????????????????
     * securityFeeRecipientRelationship	?????????????????????????????????????????????
     * securityFeeGuaranteeStandard	?????????????????????????????????
     * @param piChildrenBaseInfo
     * @param secUser
     * @return
     */
    @Override
    public ReturnEntity submitPiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser) {
        logger.info("===========??????:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo != null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("??????????????????");
        }
        PiChildrenBaseInfo info = piChildrenBaseInfoMapper.selectByPrimaryKey(piChildrenBaseInfo.getChildId());
        if(info == null){
            return ReturnEntity.errorMsg("??????????????????");
        }

//        if(StringUtils.isEmpty(info.getArea())){
//            return ReturnEntity.errorMsg("?????????????????????");
//        }
        if(StringUtils.isEmpty(info.getChildName())){
            return ReturnEntity.errorMsg("??????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(info.getChildIdNo())){
            return ReturnEntity.errorMsg("????????????????????????????????????????????????");
        }
//        if(StringUtils.isEmpty(info.getChildTelNo())){
//            return ReturnEntity.errorMsg("????????????????????????????????????????????????");
//        }
        if(StringUtils.isEmpty(info.getChildNationality())){
            return ReturnEntity.errorMsg("??????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(info.getChildMale())){
            return ReturnEntity.errorMsg("??????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(info.getChildAccountAddress())){
            return ReturnEntity.errorMsg("????????????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(info.getChildCurrentAddress())){
            return ReturnEntity.errorMsg("?????????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(info.getChildHealthStatus())){
            return ReturnEntity.errorMsg("????????????????????????????????????????????????");
        }

        if(StringUtils.isEmpty(info.getChildEscalationType())){
            return ReturnEntity.errorMsg("????????????????????????????????????????????????");
        }
        if(StringUtils.isEmpty(info.getChildSchoolAttendance())){
            return ReturnEntity.errorMsg("????????????????????????????????????????????????");
        }

        List<PiChildrenGuardianInfo> guardianInfoList = piChildrenGuardianInfoMapper.queryGuardianList(piChildrenBaseInfo);
        if(guardianInfoList.size() == 0){
            return ReturnEntity.errorMsg("??????????????????????????????");
        }
//        for(PiChildrenGuardianInfo piChildrenGuardianInfo : guardianInfoList){
//            if("0".equals(piChildrenGuardianInfo.getRelationship())){
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getName())){
//                    return ReturnEntity.errorMsg("??????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getIdNo())){
//                    return ReturnEntity.errorMsg("????????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getTelNo())){
//                    return ReturnEntity.errorMsg("????????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getAccountAddress())){
//                    return ReturnEntity.errorMsg("????????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getCurrentAddress())){
//                    return ReturnEntity.errorMsg("?????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getHealthStatus())){
//                    return ReturnEntity.errorMsg("????????????????????????????????????????????????");
//                }
//
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getFamilyIncome())){
//                    return ReturnEntity.errorMsg("????????????????????????????????????????????????");
//                }
//            }else if("1".equals(piChildrenGuardianInfo.getRelationship())){
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getName())){
//                    return ReturnEntity.errorMsg("??????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getIdNo())){
//                    return ReturnEntity.errorMsg("????????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getTelNo())){
//                    return ReturnEntity.errorMsg("????????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getAccountAddress())){
//                    return ReturnEntity.errorMsg("????????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getCurrentAddress())){
//                    return ReturnEntity.errorMsg("?????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getHealthStatus())){
//                    return ReturnEntity.errorMsg("????????????????????????????????????????????????");
//                }
//
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getFamilyIncome())){
//                    return ReturnEntity.errorMsg("????????????????????????????????????????????????");
//                }
//            }else {
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getName())){
//                    return ReturnEntity.errorMsg("?????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getIdNo())){
//                    return ReturnEntity.errorMsg("???????????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getTelNo())){
//                    return ReturnEntity.errorMsg("???????????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getRelationship())){
//                    return ReturnEntity.errorMsg("??????????????????????????????????????????????????????");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getHealthStatus())){
//                    return ReturnEntity.errorMsg("???????????????????????????????????????????????????");
//                }
//
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getReasons())){
//                    return ReturnEntity.errorMsg("???????????????????????????????????????????????????");
//                }
//            }
//        }

        info.setStatus(CommonConstants.ApprovalStatus.COMPLETED);//?????????
        info.setUpdateTime(new Date());
        info.setUpdator(secUser.getUserId());
        info.setArea(secUser.getArea());
        piChildrenBaseInfoMapper.updateByPrimaryKeySelective(info);
        return ReturnEntity.ok(piChildrenBaseInfo);
    }

    @Override
    public ReturnEntity submitPiChildrenBaseInfoList(SecUser secUser) {
        piChildrenBaseInfoMapper.submitPiChildrenBaseInfoList(secUser);
        return ReturnEntity.ok();
    }

    @Override
    public ReturnEntity approvePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser) {
        logger.info("===========????????????:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo == null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("???????????????");
        }
//        piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.APPROVING);
        piChildrenBaseInfo.setUpdateTime(new Date());
        piChildrenBaseInfo.setUpdator(secUser.getUserId());
        piChildrenBaseInfo.setArea(secUser.getArea());
        piChildrenBaseInfoMapper.updateByPrimaryKeySelective(piChildrenBaseInfo);
        return ReturnEntity.ok(piChildrenBaseInfo);
    }

    @Override
    public ReturnEntity queryPiChildrenGuardianInfoList(PiChildrenGuardianInfo piChildrenGuardianInfo) {
        logger.info("===========??????:" + JSONObject.toJSONString(piChildrenGuardianInfo));
        if(piChildrenGuardianInfo != null && StringUtils.isEmpty(piChildrenGuardianInfo.getChildId())){
            return ReturnEntity.errorMsg("???????????????");
        }
        Example example = new Example(PiChildrenGuardianInfo.class);
        example.createCriteria().andEqualTo("childId", piChildrenGuardianInfo.getChildId());
        example.orderBy("relationship");
        List<PiChildrenGuardianInfo> piChildrenGuardianInfos = piChildrenGuardianInfoMapper.selectByExample(example);
        return ReturnEntity.ok(piChildrenGuardianInfos);
    }

    @Override
    public ReturnEntity queryPiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo) {
        logger.info("===========??????:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo != null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("???????????????");
        }
        PiChildrenBaseInfoVO piChildrenBaseInfoVO = piChildrenBaseInfoMapper.queryPiChildrenBaseInfo(piChildrenBaseInfo);
        Example example = new Example(PiChildrenGuardianInfo.class);
        example.createCriteria().andEqualTo("childId", piChildrenBaseInfo.getChildId());
        example.orderBy("relationship");
        List<PiChildrenGuardianInfo> piChildrenGuardianInfos = piChildrenGuardianInfoMapper.selectByExample(example);
        piChildrenBaseInfoVO.setPiChildrenGuardianInfoList(piChildrenGuardianInfos);
        piChildrenBaseInfoVO.setGuardian("" + piChildrenGuardianInfos.size());
        return ReturnEntity.ok(piChildrenBaseInfoVO);
    }

    @Override
    public ReturnEntity savePiChildrenLocationInfo(PiChildrenLocationInfo piChildrenLocationInfo, SecUser secUser) {
        logger.info("===========??????:" + JSONObject.toJSONString(piChildrenLocationInfo));
        if(piChildrenLocationInfo != null && StringUtils.isNotEmpty(piChildrenLocationInfo.getLocationId())){
            piChildrenLocationInfo.setUpdateTime(new Date());
            piChildrenLocationInfo.setUpdator(secUser.getUserId());
            piChildrenLocationInfoMapper.updateByPrimaryKeySelective(piChildrenLocationInfo);
        }else{
            piChildrenLocationInfo.setLocationId(UUIDKit.getUUID());
            piChildrenLocationInfo.setCreateTime(new Date());
            piChildrenLocationInfo.setCreator(secUser.getUserId());
            piChildrenLocationInfoMapper.insert(piChildrenLocationInfo);
        }
        return ReturnEntity.ok(piChildrenLocationInfo);
    }

    @Override
    public ReturnEntity queryPiChildrenLocationInfo(PiChildrenLocationInfo piChildrenLocationInfo) {
        logger.info("===========??????:" + JSONObject.toJSONString(piChildrenLocationInfo));
        if(piChildrenLocationInfo != null && StringUtils.isEmpty(piChildrenLocationInfo.getChildId())){
            return ReturnEntity.errorMsg("???????????????");
        }
        Example example = new Example(PiChildrenLocationInfo.class);
        example.createCriteria().andEqualTo("childId", piChildrenLocationInfo.getChildId());
        example.orderBy("createTime").desc();
        List<PiChildrenLocationInfo> piChildrenLocationInfoList = piChildrenLocationInfoMapper.selectByExample(example);
        if(piChildrenLocationInfoList.size() > 0){
            return ReturnEntity.ok(piChildrenLocationInfoList.get(0));
        }
        return ReturnEntity.ok(new PiChildrenLocationInfo());
    }

    @Override
    public ReturnEntity queryChildrenFileList(PiChildrenBaseInfo piChildrenBaseInfo) {
        logger.info("===========??????:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo != null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("???????????????");
        }
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFileFlag(piChildrenBaseInfo.getChildId());
        List<FileInfo> fileInfoList = fileInfoMapper.queryFilesByCatByFlag(fileInfo);
        List<FileInfoVO> fileInfoVOList = new ArrayList<>();
        if(fileInfoList.size() > 0){
            String str = "";
            FileInfoVO fileInfoVO = null;
            for(FileInfo fileInfo1 : fileInfoList){
                if(str.equals(fileInfo1.getFileCat())){
                    fileInfoVO.getFileInfoList().add(fileInfo1);
                }else{
                    str = fileInfo1.getFileCat();
                    fileInfoVO = new FileInfoVO();
                    List<FileInfo> fileList = new ArrayList<>();
                    fileList.add(fileInfo1);
                    fileInfoVO.setFileInfoList(fileList);
                    fileInfoVOList.add(fileInfoVO);
                }
            }
        }
        List<FileInfo> guardianList = piChildrenGuardianInfoMapper.queryGuardianFileList(piChildrenBaseInfo);
        if(guardianList.size() > 0){
            String str = "";
            FileInfoVO fileInfoVO = null;
            for(FileInfo fileInfo1 : guardianList){
                if(str.equals(fileInfo1.getFileCat())){
                    fileInfoVO.getFileInfoList().add(fileInfo1);
                }else{
                    str = fileInfo1.getFileCat();
                    fileInfoVO = new FileInfoVO();
                    List<FileInfo> fileList = new ArrayList<>();
                    fileList.add(fileInfo1);
                    fileInfoVO.setFileInfoList(fileList);
//                    fileInfoVO.getFileInfoList().add(fileInfo1);
                    fileInfoVOList.add(fileInfoVO);
                }
            }
        }
        return ReturnEntity.ok(fileInfoVOList);
    }

    @Override
    public ReturnEntity queryChildrenStatisticsList(PiChildrenBaseInfo piChildrenBaseInfo) {
        logger.info("===========????????????:" + JSONObject.toJSONString(piChildrenBaseInfo));
        List<ChildrenStatisticsInfoVO> childrenStatisticsInfoVOList = piChildrenBaseInfoMapper.queryChildrenStatisticsList(piChildrenBaseInfo);
        return ReturnEntity.ok(childrenStatisticsInfoVOList);
    }

    @Override
    public PiChildrenBaseInfoVO queryH5PiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo) {
        logger.info("===========??????:" + JSONObject.toJSONString(piChildrenBaseInfo));
        PiChildrenBaseInfoVO piChildrenBaseInfoVO = piChildrenBaseInfoMapper.queryPiChildrenBaseInfo(piChildrenBaseInfo);
        Example example = new Example(PiChildrenGuardianInfo.class);
        example.createCriteria().andEqualTo("childId", piChildrenBaseInfo.getChildId());
        example.orderBy("relationship");
        List<PiChildrenGuardianInfo> piChildrenGuardianInfos = piChildrenGuardianInfoMapper.selectByExample(example);
        if(piChildrenGuardianInfos.size() > 0){
            for (PiChildrenGuardianInfo guardianInfo : piChildrenGuardianInfos) {
                if("0".equals(guardianInfo.getRelationship())){
                    piChildrenBaseInfoVO.setFatherGuardian(guardianInfo);
                }else if("1".equals(guardianInfo.getRelationship())){
                    piChildrenBaseInfoVO.setMatherGuardian(guardianInfo);
                }else{
                    piChildrenBaseInfoVO.setOtherGuardian(guardianInfo);
                }
            }
        }
        piChildrenBaseInfoVO.setPiChildrenGuardianInfoList(piChildrenGuardianInfos);
        piChildrenBaseInfoVO.setGuardian("" + piChildrenGuardianInfos.size());
        return piChildrenBaseInfoVO;
    }

    @Override
    public ReturnEntity queryAddressList(PiAddress piAddress) {
        logger.info("===========??????:" + JSONObject.toJSONString(piAddress));
        return ReturnEntity.ok(piAddressMapper.queryAddressList(piAddress));
    }

    @Override
    public ReturnEntity exportExcelByTemplete(String fileName, PiChildrenBaseInfoVO piChildrenBaseInfo, SecUser secUser){
        logger.info("=============???????????????" + piChildrenBaseInfo.getChildName() + ",  " + piChildrenBaseInfo.getChildAccountAddress());
        long l1 = System.currentTimeMillis();
        List<PiChildrenBaseInfoVO> childrenExcelVOList = piChildrenBaseInfoMapper.selectExcelByIds(piChildrenBaseInfo, piChildrenBaseInfo.getIds());
        String pathname = "";
        String msg = "??????????????????????????????";
        if (childrenExcelVOList.size() > 0) {
            logger.info("===========???????????????" + childrenExcelVOList.size());
            msg = "?????????" + childrenExcelVOList.size() + "??????????????????????????????????????????????????????????????????";

//            OutputStream out = null;
            //??????response
//            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//            HttpServletResponse response = servletRequestAttributes.getResponse();
            // ????????????excel??????
//            try {
                pathname= "Children_Info_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
//                response.setCharacterEncoding("UTF-8"); // ????????????
//                response.setContentType("application/zip");
                // ??????????????????????????????????????????
                pathname = fileKitConfig.getFileTemp() + new String(pathname.getBytes(), StandardCharsets.UTF_8) + ".zip";
                //??????????????????????????????
//                response.setHeader("Content-Disposition", "attachment;filename=" + pathname);
//                response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");

//                ZipOutputStream zipout = new ZipOutputStream(response.getOutputStream());
//                pathname = fileKitConfig.getFileTemp() + new String(pathname.getBytes("UTF-8"), StandardCharsets.UTF_8) + ".zip";

                generateExcelZipService.generateExcelZip(fileName, pathname, childrenExcelVOList, piChildrenBaseInfo.getToMail(), secUser);
        }
        long l2 = System.currentTimeMillis();
        logger.info("=============???????????????????????????" + (l2 - l1));
        return new ReturnEntity(CommonConstants.SUCCESS_CODE, msg, fileKitConfig.getFileBasePath() + "/file/download?path=" + URLEncoder.encode(pathname));
    }



    @Override
    public ReturnEntity exportImage(PiChildrenBaseInfoVO piChildrenBaseInfoVO) {
        String pathname = "";
        String msg = "??????????????????????????????";
//        if(piChildrenBaseInfoVO.getIds() != null && piChildrenBaseInfoVO.getIds().size() > 0) {
            List<ChildrenFileInfoVO> fileInfoList = piChildrenBaseInfoMapper.queryFilesByFlags(piChildrenBaseInfoVO, piChildrenBaseInfoVO.getIds());
            msg = "?????????" + fileInfoList.size() + "??????????????????????????????????????????????????????????????????";
            String path = System.getProperty("user.dir");
            logger.info("================?????????????????????" + path);
        if (fileInfoList.size() > 0) {
                try {
                    // ??????????????????
                    String zipname = "Image_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
                    // ??????????????????????????????????????????
                    pathname = fileKitConfig.getFileTemp() + new String(zipname.getBytes("UTF-8"), StandardCharsets.UTF_8) + ".zip";
                    FileOutputStream fos = null;
                    ZipOutputStream zipout = null;
                    byte[] buf = new byte[1024];
                    Map<String, List<ChildrenFileInfoVO>> listMap = new HashMap<>();
                    for(ChildrenFileInfoVO childrenFileInfoVO : fileInfoList){
                        if(listMap.containsKey(childrenFileInfoVO.getChildName() + childrenFileInfoVO.getChildIdNo())){
                            listMap.get(childrenFileInfoVO.getChildName() + childrenFileInfoVO.getChildIdNo()).add(childrenFileInfoVO);
                        }else{
                            List<ChildrenFileInfoVO> fileInfoVOList = new ArrayList<>();
                            fileInfoVOList.add(childrenFileInfoVO);
                            listMap.put(childrenFileInfoVO.getChildName() + childrenFileInfoVO.getChildIdNo(), fileInfoVOList);
                        }
                    }
                    List<Map<String, Object>> zipEntryList = new ArrayList<>();

                    //???????????????????????????
                    int sumSize = 0;
                    int size = 0;
                    String unitName = "";
                    String fileName= "";
//                    pathname = fileKitConfig.getFileTemp() + new String(zipname.getBytes(), StandardCharsets.UTF_8);
                    for(String key : listMap.keySet()){
                        List<ChildrenFileInfoVO> fileInfoChildList = listMap.get(key);
                        for (ChildrenFileInfoVO fileInfo1 : fileInfoChildList) {
                            size += fileInfo1.getFileSize();
                        }
                        //???????????????????????????????????????????????????
                        if(sumSize + size > MAIL_SIZE){

                            // ??????????????????????????????????????????
                            pathname = fileKitConfig.getFileTemp() + new String(zipname.getBytes("UTF-8"), StandardCharsets.UTF_8) + ".zip";
                            File zipFile = new File(StringCtrlUtils.changeString(fileKitConfig.getFilePath() +pathname));
                            logger.info("==============???????????????" + zipFile.getAbsolutePath());
                            logger.info("==============???????????????" + zipFile.getCanonicalPath());
                            //????????????
                            zipFile.createNewFile();
                            fos = new FileOutputStream(zipFile);
                            zipout = new ZipOutputStream(fos);
                            List<File> sourceFileList = new ArrayList<>();
                            sourceFileList.add(new File(StringCtrlUtils.changeString(fileName)));
                            compress(sourceFileList, zipout, true);
                            generateExcelZipService.sendEmail(fileKitConfig.getFilePath() + pathname, "??????????????????" + zipname, piChildrenBaseInfoVO.getToMail());
                            //????????????????????????
                            zipEntryList.clear();
                            sumSize = size;
                            //??????????????????
                            zipname = "Image_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
                            zipFile.delete();
                        }else{
                            sumSize += size;
                        }

                        unitName = fileInfoChildList.get(0).getChildName() + fileInfoChildList.get(0).getChildIdNo();
                        fileName = fileKitConfig.getFilePath() + fileKitConfig.getFileTemp() + zipname + "/" + new String(unitName.getBytes(), StandardCharsets.UTF_8) + "/";
                        File unitFile = new File(StringCtrlUtils.changeString(fileName));
                        unitFile.mkdirs();
                        FileOutputStream fosf = null;
                        for (ChildrenFileInfoVO fileInfo1 : fileInfoChildList) {
                            unitFile = new File(StringCtrlUtils.changeString(fileName + fileInfo1.getFileName()));
                            unitFile.createNewFile();
                            fosf = new FileOutputStream(unitFile);
                            // ????????????
                            byte[] temp = fileService.getFileContent(StringCtrlUtils.changeString(fileInfo1.getFilePath()));
                            InputStream ais = new FileInputStream(unitFile);
                            fosf.write(temp);

                            ZipEntry zipEntry = new ZipEntry(fileInfo1.getFileName());
                            Map<String, Object> map = new HashMap();
                            map.put("stream", ais);
                            map.put("zip", zipEntry);
                            zipEntryList.add(map);
                            fosf.close();
//                                ais.close();
                        }
                    }

                    if(zipEntryList.size() > 0){
                        // ??????????????????????????????????????????
                        pathname = fileKitConfig.getFileTemp() + new String(zipname.getBytes("UTF-8"), StandardCharsets.UTF_8) + ".zip";
                        File zipFile = new File(StringCtrlUtils.changeString(fileKitConfig.getFilePath() +pathname));
                        //????????????
                        zipFile.createNewFile();
                        fos = new FileOutputStream(zipFile);
                        zipout = new ZipOutputStream(fos);
                        List<File> sourceFileList = new ArrayList<>();
                        sourceFileList.add(new File(StringCtrlUtils.changeString(fileName)));
                        compress(sourceFileList, zipout, true);
                        //????????????????????????
                        zipEntryList.clear();
                        generateExcelZipService.sendEmail(fileKitConfig.getFilePath() + pathname, "??????????????????" + zipname, piChildrenBaseInfoVO.getToMail());
                        zipFile.delete();
                    }

                    zipout.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
//        }
        return new ReturnEntity(CommonConstants.SUCCESS_CODE, msg, fileKitConfig.getFileBasePath() + "/file/download?path=" + URLEncoder.encode(pathname));
    }

    /**
     * ??????????????????
     * @param sourceFile ?????????
     * @param zos zip?????????
     * @param name ??????????????????
     * @param KeepDirStructure ?????????????????????????????????,
     * 			true:??????????????????;
     *			false:???????????????????????????????????????(?????????????????????????????????????????????????????????,???????????????)
     * @throws Exception
     */
    private static void compress(File sourceFile, ZipOutputStream zos,
                                 String name, boolean KeepDirStructure) throws Exception {
        byte[] buf = new byte[BUFFER_SIZE];
        if (sourceFile.isFile()) {
            zos.putNextEntry(new ZipEntry(name));
            int len;
            FileInputStream in = new FileInputStream(sourceFile);
            while ((len = in.read(buf)) != -1) {
                zos.write(buf, 0, len);
            }
            // Complete the entry
            zos.closeEntry();
            in.close();
        } else {
            File[] listFiles = sourceFile.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                if (KeepDirStructure) {
                    zos.putNextEntry(new ZipEntry(name + "/"));
                    zos.closeEntry();
                }

            } else {
                for (File file : listFiles) {
                    if (KeepDirStructure) {
                        compress(file, zos, name + "/" + file.getName(),
                                KeepDirStructure);
                    } else {
                        compress(file, zos, file.getName(), KeepDirStructure);
                    }

                }
            }
        }
    }

    private static void compress(List<File> sourceFileList,
                                 ZipOutputStream zos, boolean KeepDirStructure) throws Exception {
        byte[] buf = new byte[BUFFER_SIZE];
        for (File sourceFile : sourceFileList) {
            String name = sourceFile.getName();
            if (sourceFile.isFile()) {
                zos.putNextEntry(new ZipEntry(name));
                int len;
                FileInputStream in = new FileInputStream(sourceFile);
                while ((len = in.read(buf)) != -1) {
                    zos.write(buf, 0, len);
                }
                zos.closeEntry();
                in.close();
            } else {
                File[] listFiles = sourceFile.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    if (KeepDirStructure) {
                        zos.putNextEntry(new ZipEntry(name + "/"));
                        zos.closeEntry();
                    }

                } else {
                    for (File file : listFiles) {
                        if (KeepDirStructure) {
                            compress(file, zos, name + "/" + file.getName(),
                                    KeepDirStructure);
                        } else {
                            compress(file, zos, file.getName(),
                                    KeepDirStructure);
                        }

                    }
                }
            }
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

                try{
                    // ?????????
                    bos = new ByteArrayOutputStream();

                    // ????????????????????????????????????ByteArrayOutputStream??????????????????ByteArray
                    FileInfo fileInfo = fileInfoMapper.queryOneFilesByCatByFlag(childrenExcelVO.getChildId(), "???????????????");
                    if(fileInfo != null) {
                        ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
                        String realPath = fileKitConfig.getFilePath() + fileInfo.getFilePath();

                        File file = new File(realPath);
                        if(file.exists()){
                            bufferImg = ImageIO.read(file);
                            if (bufferImg != null) {
                                ImageIO.write(bufferImg, "jpg", byteArrayOut);
                                //?????????????????????????????????sheet?????????????????????????????????????????????
                                XSSFDrawing patriarch = sheet.createDrawingPatriarch();
                                XSSFClientAnchor anchor = new XSSFClientAnchor(10240000, 102400, 10240000, 1024000,(short) 2, 29, (short) 4, 29);
                                anchor.setAnchorType(1);
                                //????????????
                                patriarch.createPicture(anchor,workbook.addPicture(byteArrayOut.toByteArray(), XSSFWorkbook.PICTURE_TYPE_JPEG));
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
                    map.put("stream",ais);
                    map.put("zip",zipEntry);
                    return map;
                }catch (Exception e) {
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

    private void getMultiTitle(List<List<MultiTitle>> titleList, PiChildrenBaseInfoVO childrenExcelVO) {
        int a = 1, b = 3, c = 5, d = 2;
        List<MultiTitle> titles = new ArrayList<>();
        titles.add(new MultiTitle("", a));
        titles.add(new MultiTitle("??? ???", a));
        titles.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildName(), a));
        titles.add(new MultiTitle("????????????", a));
        titles.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildIdNo(), a));
        titles.add(new MultiTitle("????????????", a));
        titles.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildTelNo(), a));
        titleList.add(titles);
        List<MultiTitle> titles2 = new ArrayList<>();
        titles2.add(new MultiTitle("", a));
        titles2.add(new MultiTitle("??? ???", a));
        titles2.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildNationality(), a));
        titles2.add(new MultiTitle("??? ???", a));
        titles2.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildMale(), b));
        titleList.add(titles2);
        List<MultiTitle> titles3 = new ArrayList<>();
        titles3.add(new MultiTitle("", a));
        titles3.add(new MultiTitle("????????????", a));
        titles3.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildAccountAddress(), c));
        titleList.add(titles3);
        List<MultiTitle> titles4 = new ArrayList<>();
        titles4.add(new MultiTitle("", a));
        titles4.add(new MultiTitle("?????????", a));
        titles4.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildAccountAddress(), c));
        titleList.add(titles4);
        List<MultiTitle> titles5 = new ArrayList<>();
        titles5.add(new MultiTitle("", a));
        titles5.add(new MultiTitle("????????????", a));
        titles5.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildHealthStatus(), a));
        titles5.add(new MultiTitle("????????????", a));
        titles5.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildEscalationType(), a));
        titles5.add(new MultiTitle("????????????", a));
        titles5.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildDiseaseType(), a));
        titleList.add(titles5);
        List<MultiTitle> titles6 = new ArrayList<>();
        titles6.add(new MultiTitle("", a));
        titles6.add(new MultiTitle("????????????", a));
        titles6.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildDisabilityLevel(), a));
        titles6.add(new MultiTitle("????????????", a));
        titles6.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildDisabilityType(), a));
        titles6.add(new MultiTitle("????????????", a));
        titles6.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildSchoolAttendance(), a));
        titleList.add(titles6);
        List<MultiTitle> titles7 = new ArrayList<>();
        titles7.add(new MultiTitle("????????????", a));
        titles7.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildDisabilityLevel(), a));
        titles7.add(new MultiTitle("????????????????????????????????????", a));
        titles7.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildPovertyAlleviationImplementation(), a));
        titles7.add(new MultiTitle("??????????????????????????????", a));
        titles7.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildViolationGuardian(), d));
        titleList.add(titles7);
    }

    private void generateExcelZip(String fileName, String pathname, List<PiChildrenBaseInfoVO> childrenExcelVOList) throws IOException {
        List<SecUser> secUserList = secUserMapper.selectAll();
        Map<String, String> userMap = new HashMap<>();
        if(secUserList.size() > 0){
            for(SecUser user : secUserList){
                if(!userMap.containsKey(user.getUserId())){
                    userMap.put(user.getUserId(), user.getUserName());
                }
            }
        }
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
    }
}
