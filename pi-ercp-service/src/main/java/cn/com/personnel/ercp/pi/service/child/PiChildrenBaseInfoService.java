package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.persistence.mapper.child.PiChildrenBaseInfoMapper;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PiChildrenBaseInfoService extends BaseService implements IPiChildrenBaseInfoService {
    @Autowired
    PiChildrenBaseInfoMapper piChildrenBaseInfoMapper;

    @Override
    public ReturnEntity queryPiChildrenBaseInfoList(PiChildrenBaseInfo piChildrenBaseInfo, PagenationQueryParameter buildPagenation) {
        //分页
        setPageHelper(buildPagenation);
        //根据条件查询
        List<PiChildrenBaseInfo> childrenBaseInfoList = piChildrenBaseInfoMapper.queryPiChildrenBaseInfoList(piChildrenBaseInfo);
        //返回数据
        return ReturnEntity.ok(new PageInfo<PiChildrenBaseInfo>(childrenBaseInfoList));
    }

    @Override
    public ReturnEntity savePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser) {
        if(piChildrenBaseInfo != null && StringUtils.isNotEmpty(piChildrenBaseInfo.getChildId())){
            piChildrenBaseInfo.setUpdateTime(new Date());
            piChildrenBaseInfo.setUpdator(secUser.getUserId());
            piChildrenBaseInfoMapper.updateByPrimaryKeySelective(piChildrenBaseInfo);
        }else{
            piChildrenBaseInfo.setChildId(UUIDKit.getUUID());
            piChildrenBaseInfo.setCreateTime(new Date());
            piChildrenBaseInfo.setCreator(secUser.getUserId());
            piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.DRAFT);//进行中
            piChildrenBaseInfoMapper.insert(piChildrenBaseInfo);
        }
        return ReturnEntity.ok(piChildrenBaseInfo);
    }

    @Override
    public ReturnEntity deletePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser) {
        if(piChildrenBaseInfo != null && StringUtils.isNotEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("数据不存在！");
        }
        piChildrenBaseInfoMapper.deleteByPrimaryKey(piChildrenBaseInfo.getChildId());
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
        if(piChildrenBaseInfo != null && StringUtils.isNotEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("数据不存在！");
        }
        PiChildrenBaseInfo info = piChildrenBaseInfoMapper.selectByPrimaryKey(piChildrenBaseInfo.getChildId());
        if(info == null){
            return ReturnEntity.errorMsg("数据不存在！");
        }

        if(StringUtils.isEmpty(piChildrenBaseInfo.getArea())){
            return ReturnEntity.errorMsg("区域为必填项！");
        }
        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildName())){
            return ReturnEntity.errorMsg("儿童姓名为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildIdNo())){
            return ReturnEntity.errorMsg("儿童身份证号为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildTelNo())){
            return ReturnEntity.errorMsg("儿童联系电话为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildNationality())){
            return ReturnEntity.errorMsg("儿童民族为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildMale())){
            return ReturnEntity.errorMsg("儿童性别为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildAccountAddress())){
            return ReturnEntity.errorMsg("儿童户口地址为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildCurrentAddress())){
            return ReturnEntity.errorMsg("儿童现住址为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildHealthStatus())){
            return ReturnEntity.errorMsg("儿童健康状况为必填项，不能为空！");
        }

        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildEscalationType())){
            return ReturnEntity.errorMsg("儿童上报类型为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildDisabilityLevel())){
            return ReturnEntity.errorMsg("儿童户口地址为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildDiseaseType())){
            return ReturnEntity.errorMsg("儿童患病病种为必填项，不能为空！");
        }
        if(StringUtils.isEmpty(piChildrenBaseInfo.getChildSchoolAttendance())){
            return ReturnEntity.errorMsg("儿童就学情况为必填项，不能为空！");
        }

        piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.COMPLETED);//已完成
        piChildrenBaseInfo.setUpdateTime(new Date());
        piChildrenBaseInfo.setUpdator(secUser.getUserId());
        piChildrenBaseInfoMapper.updateByPrimaryKeySelective(piChildrenBaseInfo);
        return ReturnEntity.ok(piChildrenBaseInfo);
    }

    @Override
    public ReturnEntity submitPiChildrenBaseInfoList(List<PiChildrenBaseInfo> piChildrenBaseInfoList, SecUser secUser) {
        if(piChildrenBaseInfoList != null && piChildrenBaseInfoList.size() > 0){
            for(PiChildrenBaseInfo piChildrenBaseInfo : piChildrenBaseInfoList){
                piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.APPROVING);
                piChildrenBaseInfo.setUpdateTime(new Date());
                piChildrenBaseInfo.setUpdator(secUser.getUserId());
                piChildrenBaseInfoMapper.updateByPrimaryKeySelective(piChildrenBaseInfo);
            }
        }
        return ReturnEntity.ok(piChildrenBaseInfoList);
    }

    @Override
    public ReturnEntity approvePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser) {
        if(piChildrenBaseInfo == null && StringUtils.isEmpty(piChildrenBaseInfo.getChildId())){
            return ReturnEntity.errorMsg("参数错误！");
        }
//        piChildrenBaseInfo.setStatus(CommonConstants.ApprovalStatus.APPROVING);
        piChildrenBaseInfo.setUpdateTime(new Date());
        piChildrenBaseInfo.setUpdator(secUser.getUserId());
        piChildrenBaseInfoMapper.updateByPrimaryKeySelective(piChildrenBaseInfo);
        return ReturnEntity.ok(piChildrenBaseInfo);
    }
}
