package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.common.autoconfig.DataUtils;
import cn.com.personnel.ercp.common.autoconfig.ExcelUtils;
import cn.com.personnel.ercp.common.autoconfig.MultiTitle;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.kit.FileKitConfig;
import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.common.persistence.mapper.FileInfoMapper;
import cn.com.personnel.ercp.common.service.BaseRenderExcel;
import cn.com.personnel.ercp.common.util.DateUtils;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.framework.kit.excel.ColHeadView;
import cn.com.personnel.ercp.pi.module.ImportParamsVO;
import cn.com.personnel.ercp.pi.module.base.FileInfoVO;
import cn.com.personnel.ercp.pi.module.child.ChildrenBaseInfoExcelVO;
import cn.com.personnel.ercp.pi.module.child.ChildrenExcelVO;
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
import netscape.javascript.JSObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import tk.mybatis.mapper.entity.Example;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Service
public class PiChildrenBaseInfoService extends BaseService implements IPiChildrenBaseInfoService {
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

    @Override
    public ReturnEntity queryPiChildrenBaseInfoList(PiChildrenBaseInfoVO piChildrenBaseInfo, PagenationQueryParameter buildPagenation) {
        logger.info("===========type:" + piChildrenBaseInfo.getType() + ",status:" + piChildrenBaseInfo.getStatus());
        logger.info("===========入参:" + JSONObject.toJSONString(piChildrenBaseInfo));
        List<PiChildrenBaseInfoVO> childrenBaseInfoList = null;
        //分页
        setPageHelper(buildPagenation);
        if(StringUtils.isNotEmpty(piChildrenBaseInfo.getType())){
            if("0".equals(piChildrenBaseInfo.getType())){//0进行中和1已完成
                piChildrenBaseInfo.setStatus(piChildrenBaseInfo.getType());
                //根据条件查询
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
            }else if("1".equals(piChildrenBaseInfo.getType())){//1已完成
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.NOTDRAFT);
                //根据条件查询
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
            }else if("2".equals(piChildrenBaseInfo.getType())){//已发送审批
                piChildrenBaseInfo.setCreator(null);
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.APPROVING);
                //根据条件查询
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
            }else if("8".equals(piChildrenBaseInfo.getType())){//接案新增，审批通过数据
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.APPROVED);
                //根据条件查询
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
            }else if("3".equals(piChildrenBaseInfo.getType())){//预估新增，接案已提交数据
                piChildrenBaseInfo.setCaseStatus(CommonConstants.ServerApprovalStatus.CASE_SUBMITED);
                //根据条件查询
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryTakeCaseList(piChildrenBaseInfo);
            }else if("4".equals(piChildrenBaseInfo.getType())){//计划新增，预估已提交数据
                piChildrenBaseInfo.setEstimateStatus(CommonConstants.ServerApprovalStatus.ESTIMATE_SUBMITED);
                //根据条件查询
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryEstimateList(piChildrenBaseInfo);
            }else if("5".equals(piChildrenBaseInfo.getType())){//介入新增，计划已提交数据
                piChildrenBaseInfo.setPlanStatus(CommonConstants.ServerApprovalStatus.PLANSUBMITED);
                //根据条件查询
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryPlanList(piChildrenBaseInfo);
            }else if("6".equals(piChildrenBaseInfo.getType())){//评价新增，介入已提交数据
                piChildrenBaseInfo.setInterventionStatus(CommonConstants.ServerApprovalStatus.INTERVENTIONSUBMITED);
                //根据条件查询
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryInterventionList(piChildrenBaseInfo);
            }else if("7".equals(piChildrenBaseInfo.getType())){//结案新增，评价已提交数据
                piChildrenBaseInfo.setEvaluateStatus(CommonConstants.ServerApprovalStatus.EVALUATE_SUBMIT);
                //根据条件查询
                childrenBaseInfoList = piChildrenBaseInfoMapper.queryEvaluateList(piChildrenBaseInfo);
            }
        }else{
            //根据条件查询
            childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
        }
        //返回数据
        return ReturnEntity.ok(new PageInfo<>(childrenBaseInfoList));
    }

    @Override
    public ReturnEntity savePiChildrenBaseInfo(PiChildrenBaseInfoVO piChildrenBaseInfo, SecUser secUser) {
        logger.info("===========ChildId:" + piChildrenBaseInfo.getChildId() + ",身份证号:" + piChildrenBaseInfo.getChildIdNo());
        logger.info("===========保存入参:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo != null && StringUtils.isNotEmpty(piChildrenBaseInfo.getChildId())){
            try {
                String age = DateUtils.getAge(piChildrenBaseInfo.getChildIdNo());
                if(StringUtils.isNotEmpty(age) && !"false".equals(age)){
                    piChildrenBaseInfo.setChildAge(age);
                }
                piChildrenBaseInfo.setUpdateTime(new Date());
                piChildrenBaseInfo.setUpdator(secUser.getUserId());
                piChildrenBaseInfo.setArea(secUser.getArea());
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.DRAFT);//进行中
                piChildrenBaseInfoMapper.updateByPrimaryKeySelective(piChildrenBaseInfo);
            }catch (Exception e){
                return  ReturnEntity.errorMsg("儿童的身份证号重复！");
            }
            List<PiChildrenGuardianInfo> piChildrenGuardianInfoList = piChildrenBaseInfo.getPiChildrenGuardianInfoList();

            if(piChildrenGuardianInfoList != null && piChildrenGuardianInfoList.size() > 0){
                Example example = new Example(PiChildrenGuardianInfo.class);
                example.createCriteria().andEqualTo("childId", piChildrenBaseInfo.getChildId());
                List<PiChildrenGuardianInfo> piChildrenGuardianInfos = piChildrenGuardianInfoMapper.selectByExample(example);
                if(piChildrenGuardianInfos.size() > 0){
                    Boolean flag = true;
                    for (int i = 0; i < piChildrenGuardianInfos.size(); i++){
                        PiChildrenGuardianInfo piChildrenGuardianInfo = piChildrenGuardianInfos.get(i);
                        for(PiChildrenGuardianInfo childrenGuardianInfo : piChildrenGuardianInfoList){
                            if(!checkGuardian(childrenGuardianInfo))continue;
                            if(piChildrenGuardianInfo.getRelationship() != null && piChildrenGuardianInfo.getRelationship().equals(childrenGuardianInfo.getRelationship())){
                                flag = false;
                            }
                        }
                        if(flag){
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
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.DRAFT);//进行中
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
                return  ReturnEntity.errorMsg("儿童的身份证号重复！");
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
        logger.info("===========入参:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo != null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("数据不存在！");
        }
        PiChildrenBaseInfo info = piChildrenBaseInfoMapper.selectByPrimaryKey(piChildrenBaseInfo.getChildId());
        if(CommonConstants.ApprovalStatus.DRAFT.equals(info.getStatus()) || CommonConstants.ApprovalStatus.NOTPASS.equals(info.getStatus()) || CommonConstants.ApprovalStatus.COMPLETED.equals(info.getStatus())) {
            Example example = new Example(PiChildrenGuardianInfo.class);
            example.createCriteria().andEqualTo("childId", piChildrenBaseInfo.getChildId());
            piChildrenGuardianInfoMapper.deleteByExample(example);
            piChildrenBaseInfoMapper.deleteByPrimaryKey(piChildrenBaseInfo.getChildId());
        }else{
            return ReturnEntity.errorMsg("数据已完成，不能删除！");
        }
        return ReturnEntity.ok();
    }

    /**
     * childEscalationType	儿童上报类型
     * childDisabilityType	儿童残疾类型
     * childDisabilityLevel	儿童残疾等级
     * childDiseaseType	儿童患病病种
     * childSchoolAttendance	儿童就学情况
     * childOtherCases	儿童其他情况
     * childPovertyAlleviationImplementation	儿童社会福利救助扶贫落实情况
     * childViolationGuardian	儿童遭受监护人侵害的情形
     * guardian	监护人
     * fatherName	父亲姓名
     * fatherIdNo	父亲身份证号
     * fatherTelNo	父亲联系电话
     * fatherAccountAddress	父亲户口地址
     * fatherCurrentAddress	父亲现/务工住址
     * fatherHealthStatus	父亲健康状况
     * fatherDisabilityType	父亲残疾类型
     * fatherDisabilityLevel	父亲残疾级别
     * fatherDiseaseType	父亲患病类型
     * fatherFamilyIncome	父亲家庭经济来源
     * fatherOtherCases	父亲其他情况
     * motherName	母亲姓名
     * motherIdNo	母亲身份证号
     * motherTelNo	母亲联系电话
     * motherAccountAddress	母亲户口地址
     * motherCurrentAddress	母亲现/务工住址
     * motherHealthStatus	母亲健康状况
     * motherDisabilityType	母亲残疾类型
     * motherDisabilityLevel	母亲残疾级别
     * motherDiseaseType	母亲患病类型
     * motherFamilyIncome	母亲家庭经济来源
     * motherOtherCases	母亲其他情况
     * otherGuardianName	其他监护人姓名
     * otherGuardianIdNo	其他监护人身份证号
     * otherGuardianTelNo	其他监护人联系电话
     * otherGuardianRelationshipWithChildren	其他监护人与儿童关系
     * otherGuardianHealthStatus	其他监护人健康状况
     * otherGuardianDisabilityType	其他监护人残疾类型
     * otherGuardianDisabilityLevel	其他监护人残疾级别
     * otherGuardianDiseaseType	其他监护人患病类型
     * otherGuardianReasons	其他监护人原由
     * organizationName	机构名称
     * organizationPrincipal	机构负责人
     * organizationTelNo	机构联系电话
     * organizationNature	机构单位性质
     * organizationResidentialAddress	机构居住地址
     * helpSuggestions	帮扶建议
     * securityFeeCollectionMethod	保障费发放情况领取方式
     * securityFeeCollector	保障费发放情况领取人（开户人）
     * securityFeeRecipientRelationship	保障费发放情况领取人与儿童关系
     * securityFeeGuaranteeStandard	保障费发放情况保障标准
     * @param piChildrenBaseInfo
     * @param secUser
     * @return
     */
    @Override
    public ReturnEntity submitPiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser) {
        logger.info("===========入参:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo != null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("数据不存在！");
        }
        PiChildrenBaseInfo info = piChildrenBaseInfoMapper.selectByPrimaryKey(piChildrenBaseInfo.getChildId());
        if(info == null){
            return ReturnEntity.errorMsg("数据不存在！");
        }

//        if(StringUtils.isEmpty(info.getArea())){
//            return ReturnEntity.errorMsg("区域为必填项！");
//        }
        if(StringUtils.isEmpty(info.getChildName())){
            return ReturnEntity.errorMsg("儿童姓名为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(info.getChildIdNo())){
            return ReturnEntity.errorMsg("儿童身份证号为必填项，不能为空！");
        }
//        if(StringUtils.isEmpty(info.getChildTelNo())){
//            return ReturnEntity.errorMsg("儿童联系电话为必填项，不能为空！");
//        }
        if(StringUtils.isEmpty(info.getChildNationality())){
            return ReturnEntity.errorMsg("儿童民族为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(info.getChildMale())){
            return ReturnEntity.errorMsg("儿童性别为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(info.getChildAccountAddress())){
            return ReturnEntity.errorMsg("儿童户口地址为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(info.getChildCurrentAddress())){
            return ReturnEntity.errorMsg("儿童现住址为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(info.getChildHealthStatus())){
            return ReturnEntity.errorMsg("儿童健康状况为必填项，不能为空！");
        }

        if(StringUtils.isEmpty(info.getChildEscalationType())){
            return ReturnEntity.errorMsg("儿童上报类型为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(info.getChildSchoolAttendance())){
            return ReturnEntity.errorMsg("儿童就学情况为必填项，不能为空！");
        }

        List<PiChildrenGuardianInfo> guardianInfoList = piChildrenGuardianInfoMapper.queryGuardianList(piChildrenBaseInfo);
        if(guardianInfoList.size() == 0){
            return ReturnEntity.errorMsg("请填写监护人信息！！");
        }
//        for(PiChildrenGuardianInfo piChildrenGuardianInfo : guardianInfoList){
//            if("0".equals(piChildrenGuardianInfo.getRelationship())){
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getName())){
//                    return ReturnEntity.errorMsg("父亲姓名为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getIdNo())){
//                    return ReturnEntity.errorMsg("父亲身份证号为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getTelNo())){
//                    return ReturnEntity.errorMsg("父亲联系电话为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getAccountAddress())){
//                    return ReturnEntity.errorMsg("父亲户口地址为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getCurrentAddress())){
//                    return ReturnEntity.errorMsg("父亲现住址为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getHealthStatus())){
//                    return ReturnEntity.errorMsg("父亲健康状况为必填项，不能为空！");
//                }
//
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getFamilyIncome())){
//                    return ReturnEntity.errorMsg("父亲家庭收入为必填项，不能为空！");
//                }
//            }else if("1".equals(piChildrenGuardianInfo.getRelationship())){
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getName())){
//                    return ReturnEntity.errorMsg("母亲姓名为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getIdNo())){
//                    return ReturnEntity.errorMsg("母亲身份证号为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getTelNo())){
//                    return ReturnEntity.errorMsg("母亲联系电话为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getAccountAddress())){
//                    return ReturnEntity.errorMsg("母亲户口地址为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getCurrentAddress())){
//                    return ReturnEntity.errorMsg("母亲现住址为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getHealthStatus())){
//                    return ReturnEntity.errorMsg("母亲健康状况为必填项，不能为空！");
//                }
//
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getFamilyIncome())){
//                    return ReturnEntity.errorMsg("母亲家庭收入为必填项，不能为空！");
//                }
//            }else {
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getName())){
//                    return ReturnEntity.errorMsg("监护人姓名为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getIdNo())){
//                    return ReturnEntity.errorMsg("监护人身份证号为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getTelNo())){
//                    return ReturnEntity.errorMsg("监护人联系电话为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getRelationship())){
//                    return ReturnEntity.errorMsg("监护人与儿童关系为必填项，不能为空！");
//                }
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getHealthStatus())){
//                    return ReturnEntity.errorMsg("监护人健康状况为必填项，不能为空！");
//                }
//
//                if(StringUtils.isEmpty(piChildrenGuardianInfo.getReasons())){
//                    return ReturnEntity.errorMsg("监护人其他原由为必填项，不能为空！");
//                }
//            }
//        }

        info.setStatus(CommonConstants.ApprovalStatus.COMPLETED);//已完成
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
        logger.info("===========审核入参:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo == null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
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
        logger.info("===========入参:" + JSONObject.toJSONString(piChildrenGuardianInfo));
        if(piChildrenGuardianInfo != null && StringUtils.isEmpty(piChildrenGuardianInfo.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        Example example = new Example(PiChildrenGuardianInfo.class);
        example.createCriteria().andEqualTo("childId", piChildrenGuardianInfo.getChildId());
        example.orderBy("relationship");
        List<PiChildrenGuardianInfo> piChildrenGuardianInfos = piChildrenGuardianInfoMapper.selectByExample(example);
        return ReturnEntity.ok(piChildrenGuardianInfos);
    }

    @Override
    public ReturnEntity queryPiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo) {
        logger.info("===========入参:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo != null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
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
        logger.info("===========入参:" + JSONObject.toJSONString(piChildrenLocationInfo));
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
        logger.info("===========入参:" + JSONObject.toJSONString(piChildrenLocationInfo));
        if(piChildrenLocationInfo != null && StringUtils.isEmpty(piChildrenLocationInfo.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
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
        logger.info("===========入参:" + JSONObject.toJSONString(piChildrenBaseInfo));
        if(piChildrenBaseInfo != null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
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
        logger.info("===========统计入参:" + JSONObject.toJSONString(piChildrenBaseInfo));
        List<ChildrenStatisticsInfoVO> childrenStatisticsInfoVOList = piChildrenBaseInfoMapper.queryChildrenStatisticsList(piChildrenBaseInfo);
        return ReturnEntity.ok(childrenStatisticsInfoVOList);
    }

    @Override
    public PiChildrenBaseInfoVO queryH5PiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo) {
        logger.info("===========入参:" + JSONObject.toJSONString(piChildrenBaseInfo));
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
        logger.info("===========入参:" + JSONObject.toJSONString(piAddress));
        return ReturnEntity.ok(piAddressMapper.queryAddressList(piAddress));
    }

    @Override
    public void exportExcelByTemplete(String fileName, PiChildrenBaseInfoVO piChildrenBaseInfo){
        List datas = null;
        List<PiChildrenBaseInfoVO> childrenExcelVOList = piChildrenBaseInfoMapper.selectExcelByIds(piChildrenBaseInfo, piChildrenBaseInfo.getIds());

        if (childrenExcelVOList.size() > 0) {
            List<Map<String, Object>> zipEntryList = new ArrayList<>();
            for(PiChildrenBaseInfoVO childrenExcelVO : childrenExcelVOList) {
                SecUser secUser = secUserMapper.selectByPrimaryKey(childrenExcelVO.getCreator());
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
                Map<String, Object> map = generateExcel(fileName, childrenExcelVO, secUser, fatherGuardian, matherGuardian, otherGuardian);
                zipEntryList.add(map);
            }
            OutputStream out = null;
            //获取response
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletResponse response = servletRequestAttributes.getResponse();
            // 设置导出excel文件
            try {
//                out = response.getOutputStream();
//                ZipOutputStream zipOutputStream = new ZipOutputStream(out);
//                String fileName1 = "批量儿童信息文件" + ".zip";
//                response.setContentType("application/octet-stream ");
//                response.setHeader("Connection", "close"); // 表示不能用浏览器直接打开
//                response.setHeader("Accept-Ranges", "bytes");// 告诉客户端允许断点续传多线程连接下载
//                response.setHeader("Content-Disposition",
//                        "attachment;filename=" + new String(fileName.getBytes("GB2312"), "UTF8"));
//                response.setCharacterEncoding("UTF-8");

            String pathname=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            response.setCharacterEncoding("UTF-8"); // 重点突出
            response.setContentType("application/zip");
            // 对文件名进行编码处理中文问题
            pathname = new String(pathname.getBytes(), StandardCharsets.UTF_8) + ".zip";
            //设置前台下载压缩包名
            response.setHeader("Content-Disposition", "attachment;filename=" + pathname);
            response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
            byte[] buf = new byte[1024];
                ZipOutputStream zipout = new ZipOutputStream(response.getOutputStream());
                for (int i = 0; i < zipEntryList.size(); i++) {
                    ZipEntry zipEntryDetail = (ZipEntry) zipEntryList.get(i).get("zip");
                    InputStream in = (InputStream) zipEntryList.get(i).get("stream");
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
            } catch (IOException e) {
                e.printStackTrace();
            }



        }
    }

    private Map<String, Object> generateExcel(String fileName, PiChildrenBaseInfoVO childrenExcelVO, SecUser secUser, PiChildrenGuardianInfo fatherGuardian, PiChildrenGuardianInfo matherGuardian, PiChildrenGuardianInfo otherGuardian) {
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
                row.getCell(1).setCellValue(secUser.getUserName());

                try{
                    // 写数据
                    bos = new ByteArrayOutputStream();

                    // 先把读进来的图片放到一个ByteArrayOutputStream中，以便产生ByteArray
                    FileInfo fileInfo = fileInfoMapper.queryOneFilesByCatByFlag(childrenExcelVO.getChildId(), "申请人签字");
                    if(fileInfo != null) {
                        ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
                        String realPath = fileKitConfig.getFilePath() + fileInfo.getFilePath();

                        File file = new File(realPath);
                        if(file.exists()){
                            bufferImg = ImageIO.read(file);
                            ImageIO.write(bufferImg, "jpg", byteArrayOut);
                            //画图的顶级管理器，一个sheet只能获取一个（一定要注意这点）
                            XSSFDrawing patriarch = sheet.createDrawingPatriarch();
                            XSSFClientAnchor anchor = new XSSFClientAnchor(10240000, 102400, 10240000, 1024000,(short) 2, 29, (short) 4, 29);
                            anchor.setAnchorType(1);
                            //插入图片
                            patriarch.createPicture(anchor,workbook.addPicture(byteArrayOut.toByteArray(), XSSFWorkbook.PICTURE_TYPE_JPEG));
                            bufferImg = null;
                        }
                    }
                    workbook.write(bos);
                    bos.flush();
                    bos.close();
                    byte[] barray = bos.toByteArray();
                    InputStream ais = new ByteArrayInputStream(barray);
                    is.close();
                    ZipEntry zipEntry = new ZipEntry(childrenExcelVO.getChildName() + fileName + ".xlsx");
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

            //获取response
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
        titles.add(new MultiTitle("姓 名", a));
        titles.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildName(), a));
        titles.add(new MultiTitle("身份证号", a));
        titles.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildIdNo(), a));
        titles.add(new MultiTitle("联系电话", a));
        titles.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildTelNo(), a));
        titleList.add(titles);
        List<MultiTitle> titles2 = new ArrayList<>();
        titles2.add(new MultiTitle("", a));
        titles2.add(new MultiTitle("民 族", a));
        titles2.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildNationality(), a));
        titles2.add(new MultiTitle("性 别", a));
        titles2.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildMale(), b));
        titleList.add(titles2);
        List<MultiTitle> titles3 = new ArrayList<>();
        titles3.add(new MultiTitle("", a));
        titles3.add(new MultiTitle("户口地址", a));
        titles3.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildAccountAddress(), c));
        titleList.add(titles3);
        List<MultiTitle> titles4 = new ArrayList<>();
        titles4.add(new MultiTitle("", a));
        titles4.add(new MultiTitle("现住址", a));
        titles4.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildAccountAddress(), c));
        titleList.add(titles4);
        List<MultiTitle> titles5 = new ArrayList<>();
        titles5.add(new MultiTitle("", a));
        titles5.add(new MultiTitle("健康状况", a));
        titles5.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildHealthStatus(), a));
        titles5.add(new MultiTitle("上报类型", a));
        titles5.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildEscalationType(), a));
        titles5.add(new MultiTitle("残疾类型", a));
        titles5.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildDiseaseType(), a));
        titleList.add(titles5);
        List<MultiTitle> titles6 = new ArrayList<>();
        titles6.add(new MultiTitle("", a));
        titles6.add(new MultiTitle("残疾等级", a));
        titles6.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildDisabilityLevel(), a));
        titles6.add(new MultiTitle("患病病种", a));
        titles6.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildDisabilityType(), a));
        titles6.add(new MultiTitle("就学情况", a));
        titles6.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildSchoolAttendance(), a));
        titleList.add(titles6);
        List<MultiTitle> titles7 = new ArrayList<>();
        titles7.add(new MultiTitle("其他情况", a));
        titles7.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildDisabilityLevel(), a));
        titles7.add(new MultiTitle("社会福利救助扶贫落实情况", a));
        titles7.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildPovertyAlleviationImplementation(), a));
        titles7.add(new MultiTitle("遭受监护人侵害的情形", a));
        titles7.add(new MultiTitle(childrenExcelVO == null ? "" : childrenExcelVO.getChildViolationGuardian(), d));
        titleList.add(titles7);
    }
}
