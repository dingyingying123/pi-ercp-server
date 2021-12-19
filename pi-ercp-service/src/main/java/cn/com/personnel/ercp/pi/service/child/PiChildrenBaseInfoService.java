package cn.com.personnel.ercp.pi.service.child;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
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
            piChildrenBaseInfo.setStatus("进行中");
            piChildrenBaseInfoMapper.insert(piChildrenBaseInfo);
        }
        return ReturnEntity.ok(piChildrenBaseInfo);
    }

    @Override
    public ReturnEntity deletePiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser) {

        return null;
    }

    @Override
    public ReturnEntity submitPiChildrenBaseInfo(PiChildrenBaseInfo piChildrenBaseInfo, SecUser secUser) {
        if(piChildrenBaseInfo != null && StringUtils.isNotEmpty(piChildrenBaseInfo.getChildId())){
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
        return null;
    }
}
