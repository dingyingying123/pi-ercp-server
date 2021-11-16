package cn.com.personnel.ercp.pi.persistence.mapper.base;

import cn.com.personnel.ercp.pi.module.base.BankVO;
import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseBankAuthorization;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FssBaseBankAuthorizationMapper extends BaseMapper<FssBaseBankAuthorization> {
    List<FssBaseBankAuthorization> queryBankAuthorization(BankVO fssBaseBankAuthorization);

    void deleteByIds(@Param("ids") List<String> ids);

    void updateAuthorizationStatus(@Param("bankVO") BankVO bankVO, @Param("userId") String userId);
}