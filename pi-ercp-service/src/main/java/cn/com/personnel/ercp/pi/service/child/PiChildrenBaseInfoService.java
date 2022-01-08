package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.common.persistence.mapper.FileInfoMapper;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.base.FileInfoVO;
import cn.com.personnel.ercp.pi.module.child.ChildrenStatisticsInfoVO;
import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenGuardianInfo;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenLocationInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiChildrenBaseInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiChildrenGuardianInfoMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiChildrenLocationInfoMapper;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Override
    public ReturnEntity queryPiChildrenBaseInfoList(PiChildrenBaseInfo piChildrenBaseInfo, PagenationQueryParameter buildPagenation) {
        //分页
        setPageHelper(buildPagenation);
        //根据条件查询
        List<PiChildrenBaseInfo> childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
        //返回数据
        return ReturnEntity.ok(new PageInfo<>(childrenBaseInfoList));
    }

    @Override
    public ReturnEntity savePiChildrenBaseInfo(PiChildrenBaseInfoVO piChildrenBaseInfo, SecUser secUser) {
        if(piChildrenBaseInfo != null && StringUtils.isNotEmpty(piChildrenBaseInfo.getChildId())){
            try {
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
                            if(piChildrenGuardianInfo.getRelationship() != null && piChildrenGuardianInfo.getRelationship().equals(childrenGuardianInfo.getRelationship())){
                                flag = false;
                            }
                        }
                        if(flag){
                            piChildrenGuardianInfoMapper.deleteByPrimaryKey(piChildrenGuardianInfo.getGuardianId());
                            i--;
                        }
                    }
                }
                for(PiChildrenGuardianInfo childrenGuardianInfo : piChildrenGuardianInfoList){
                    if(StringUtils.isEmpty(childrenGuardianInfo.getGuardianId())){
                        childrenGuardianInfo.setGuardianId(UUIDKit.getUUID());
                        childrenGuardianInfo.setChildId(piChildrenBaseInfo.getChildId());
                        childrenGuardianInfo.setCreator(secUser.getUserId());
                        childrenGuardianInfo.setCreateTime(new Date());
                        piChildrenGuardianInfoMapper.insert(childrenGuardianInfo);
                    }else{
                        childrenGuardianInfo.setUpdator(secUser.getUserId());
                        childrenGuardianInfo.setUpdateTime(new Date());
                        piChildrenGuardianInfoMapper.updateByPrimaryKeySelective(childrenGuardianInfo);
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
                piChildrenBaseInfo.setCreateTime(new Date());
                piChildrenBaseInfo.setCreator(secUser.getUserId());
//                piChildrenBaseInfo.setArea(secUser.getArea());
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.DRAFT);//进行中
                piChildrenBaseInfoMapper.insert(piChildrenBaseInfo);
                List<PiChildrenGuardianInfo> piChildrenGuardianInfoList = piChildrenBaseInfo.getPiChildrenGuardianInfoList();
                for(PiChildrenGuardianInfo childrenGuardianInfo : piChildrenGuardianInfoList){
                    childrenGuardianInfo.setGuardianId(UUIDKit.getUUID());
                    childrenGuardianInfo.setChildId(childId);
                    childrenGuardianInfo.setCreator(secUser.getUserId());
                    childrenGuardianInfo.setCreateTime(new Date());
                    piChildrenGuardianInfoMapper.insert(childrenGuardianInfo);
                }
            }catch (Exception e){
                return  ReturnEntity.errorMsg("儿童的身份证号重复！");
            }
        }
        return ReturnEntity.ok(piChildrenBaseInfo);

    }

    @Override
    public ReturnEntity deletePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser) {
        if(piChildrenBaseInfo != null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("数据不存在！");
        }
        PiChildrenBaseInfo info = piChildrenBaseInfoMapper.selectByPrimaryKey(piChildrenBaseInfo.getChildId());
        if(CommonConstants.ApprovalStatus.DRAFT.equals(info.getStatus()) || CommonConstants.ApprovalStatus.NOTPASS.equals(info.getStatus())) {
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
        if(piChildrenBaseInfo != null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("数据不存在！");
        }
        PiChildrenBaseInfo info = piChildrenBaseInfoMapper.selectByPrimaryKey(piChildrenBaseInfo.getChildId());
        if(info == null){
            return ReturnEntity.errorMsg("数据不存在！");
        }

        if(StringUtils.isEmpty(info.getArea())){
            return ReturnEntity.errorMsg("区域为必填项！");
        }
        if(StringUtils.isEmpty(info.getChildName())){
            return ReturnEntity.errorMsg("儿童姓名为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(info.getChildIdNo())){
            return ReturnEntity.errorMsg("儿童身份证号为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(info.getChildTelNo())){
            return ReturnEntity.errorMsg("儿童联系电话为必填项，不能为空！");
        }
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
        if(StringUtils.isEmpty(info.getChildDisabilityLevel())){
            return ReturnEntity.errorMsg("儿童户口地址为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(info.getChildDiseaseType())){
            return ReturnEntity.errorMsg("儿童患病病种为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(info.getChildSchoolAttendance())){
            return ReturnEntity.errorMsg("儿童就学情况为必填项，不能为空！");
        }

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
        if(piChildrenBaseInfo != null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
        PiChildrenBaseInfoVO piChildrenBaseInfoVO = piChildrenBaseInfoMapper.queryPiChildrenBaseInfo(piChildrenBaseInfo);
        Example example = new Example(PiChildrenGuardianInfo.class);
        example.createCriteria().andEqualTo("childId", piChildrenBaseInfo.getChildId());
        example.orderBy("relationship");
        List<PiChildrenGuardianInfo> piChildrenGuardianInfos = piChildrenGuardianInfoMapper.selectByExample(example);
        piChildrenBaseInfoVO.setPiChildrenGuardianInfoList(piChildrenGuardianInfos);
        return ReturnEntity.ok(piChildrenBaseInfoVO);
    }

    @Override
    public ReturnEntity savePiChildrenLocationInfo(PiChildrenLocationInfo piChildrenLocationInfo, SecUser secUser) {
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
                    fileInfoVO.getFileInfoList().add(fileInfo1);
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
                    fileInfoVO.getFileInfoList().add(fileInfo1);
                    fileInfoVOList.add(fileInfoVO);
                }
            }
        }
        return ReturnEntity.ok(fileInfoVOList);
    }

    @Override
    public ReturnEntity queryChildrenStatisticsList(PiChildrenBaseInfo piChildrenBaseInfo) {
        List<ChildrenStatisticsInfoVO> childrenStatisticsInfoVOList = piChildrenBaseInfoMapper.queryChildrenStatisticsList(piChildrenBaseInfo);
        return ReturnEntity.ok(childrenStatisticsInfoVOList);
    }
}
