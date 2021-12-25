package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.auth.service.ISecUserService;
import cn.com.personnel.ercp.common.kit.CommonConfig;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.ercp.framework.exception.AuthenticationException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

@Component
public class LoginService extends BaseLoginService implements ILoginService {
    private Logger logger = LoggerFactory.getLogger(LoginService.class);
    @Autowired
    private SecUserMapper secUserMapper;
    @Autowired
    private ISecUserService secUserService;
//    @Autowired
//    private ICAService icaApiService;
//    @Autowired
//    private SecUserCAMapper secUserCAMapper;
    @Override
    /**
     * 自动登录
     */
    public SecUser autoLogin(SecUser secUser) throws AuthenticationException {
        SecUser result = innerLogin(secUser, false);
        return afterLogin(result);
    }

    /**
     *
     * @param secUser
     * @return
     * @throws AuthenticationException
     */
    public SecUser innerLogin(SecUser secUser,boolean needCheck) throws AuthenticationException {
        Locale locale = LocaleContextHolder.getLocale();
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.toString());
        if(StringUtils.isEmpty(secUser.getUserId())){
            if (locale.toString().equals("en_US")){
                throw new AuthenticationException("1001","Username or password incorrect");
            }else {
                throw new AuthenticationException("1001", "用户名或密码不正确");
            }
        }
        String pwd = secUser.getPwd();
//        VHrEmployee vHrEmployee = vHrEmployeeMapper.findByPernr(secUser.getUserId());
        SecUser user = secUserMapper.selectByPrimaryKey(secUser.getUserId());
        if(needCheck) {
//            if(ApplicationConfig.APP_MODULE.equals(ApplicationConfig.DEV_MODULE) || "外部".equals(result.getUserType())) {
            if(ApplicationConfig.APP_MODULE.equals(ApplicationConfig.DEV_MODULE)) {
//                if(result == null){
//                    throw new AuthenticationException("1001","用户名或密码不正确");
//                }
//
//                if(!"有效".equals(result.getStatus())){
//                    throw new AuthenticationException("1001","该用户已经被禁用！");
//                }
//
//                if("是".equals(result.getLockFlag())){
//                    throw new AuthenticationException("1001","该用户已经锁定！");
//                }
//                if( !DigestUtils.md5DigestAsHex(pwd.getBytes()).equals(result.getPwd())){
//                    throw new AuthenticationException("1002","用户名或密码不正确");
//                }
            }else {
                try{
//                    oimCheckLogin(secUser.getUserId(), pwd);
//                     新的认证
                    boolean authByRest = authenticate(user, pwd);
                    if (!authByRest) {
                        if (locale.toString().equals("en_US")){
                            throw new AuthenticationException("1002","Username or password incorrect");
                        }else {
                            throw new AuthenticationException("1002", "用户名或密码不正确");
                        }
                    }
                }catch (Exception e) {
                    logger.error("idm 认证错误 " + e.getMessage());
                    if (locale.toString().equals("en_US")){
                        throw new AuthenticationException("1002","Username or password incorrect");
                    }else {
                        throw new AuthenticationException("1002", "用户名或密码不正确");
                    }
                }
            }

        }

        //更新登录信息
        SecUser updataLoginInfo  = new SecUser();
        updataLoginInfo.setUserId(secUser.getUserId());
        updataLoginInfo.setLoginIp(secUser.getLoginIp());
        updataLoginInfo.setLoginTime(new Date());
        secUserMapper.updateByPrimaryKeySelective(updataLoginInfo);
        updataLoginInfo.setPwd(secUser.getPwd());
        if(user!=null&&user.getMale()!=null&&user.getMale().equals("男"))
            updataLoginInfo.setMale("男");
        else updataLoginInfo.setMale("女");
        if(user!=null) {
            updataLoginInfo.setUserName(user.getUserName());
        }
        return updataLoginInfo;
    }

    protected SecUser afterLogin(SecUser result ) {
        return result;
    }

    public boolean authenticate(SecUser secUser, String password) {
        boolean flag = true;
        if (secUser != null) {
            if (secUser.getStatus() != null && secUser.getStatus().equals("作废")) {
                logger.info(secUser.getUserId() + "已离职，认证失败");
                return false;
            }
            if (!secUserService.checkPassword(password, secUser.getPwd())) {
                logger.info(secUser.getUserId() + "密码错误，认证失败");
                secUserMapper.updatePwdTimes(secUser.getUserId());
                //return false;
                flag = false;
            } else {
                secUserMapper.resetPwdTimes(secUser.getUserId());
                //return true;
                flag = true;
            }
        } else {
            logger.info("不存在，认证失败");
            flag = false;
            //return false;
        }
        return flag;
    }


}
