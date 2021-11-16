/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.common.kit.CommonConfig;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.ercp.framework.exception.AuthenticationException;
import cn.com.personnel.ercp.framework.exception.BusinessException;
import cn.com.personnel.springboot.framework.core.exception.BaseException;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;

import javax.xml.bind.DatatypeConverter;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 33925
 *
 */
@SuppressWarnings("deprecation")
public abstract class BaseLoginService extends BaseService implements ILoginService {

    private Logger                 logger         = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private SecUserMapper secUserMapper;

    @Autowired
    private CommonConfig commonConfig;
    @Autowired
    private static String   REGIX_PASSWORD = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";

    /**
     * 通过用户中心进行验证
     */
    protected void ucCheckLogin(String userID, String pwd, String cip) {

    }

    /**
     * 
     * @param secUser
     * @return
     * @throws AuthenticationException
     */
    protected SecUser innerLogin(SecUser secUser, boolean needCheck) throws AuthenticationException {
        if (StringUtils.isEmpty(secUser.getUserId())) {
            throw new AuthenticationException("1001", "用户名或密码不正确！");
        }
        String pwd = secUser.getPwd();
        SecUser result = secUserMapper.selectByPrimaryKey(secUser);
        if (result == null) {
            throw new AuthenticationException("1001", "用户名或密码不正确！");
        }

        if (!"有效".equals(result.getStatus())) {
            throw new AuthenticationException("1001", "该用户已经被禁用！");
        }

        if ("是".equals(result.getLockFlag())) {
            throw new AuthenticationException("1001", "用户名或密码不正确！");
        }

        if (needCheck) {
            if(ApplicationConfig.APP_MODULE.equals(ApplicationConfig.DEV_MODULE)) {
            }

            else if ("外部".equals(result.getUserType())) {
                if (!DigestUtils.md5DigestAsHex(pwd.getBytes()).equals(result.getPwd())) {
                    throw new AuthenticationException("1002", "用户名或密码不正确！");
                }
            } else if (ApplicationConfig.APP_MODULE.equals(ApplicationConfig.DEV_MODULE)) {
                if (!DigestUtils.md5DigestAsHex(pwd.getBytes()).equals(result.getPwd())) {
                    throw new AuthenticationException("1002", "用户名或密码不正确！");
                }
            } else {
                try {
                    // oimCheckLogin(secUser.getUserId(), pwd);
                    // 新的认证
                    Map<String, Object> authByRest = authByRest(secUser.getUserId(), pwd);
                    if (!"000".equals(authByRest.get("code"))) {
                        throw new AuthenticationException("1002", "用户名或密码不正确！");
                    }

                } catch (Exception e) {
                    logger.error("idm 认证错误 " + e.getMessage());
                    throw new AuthenticationException("1002", "用户名或密码不正确！");
                }
            }
        }

        // 更新登录信息
        SecUser updataLoginInfo = new SecUser();
        updataLoginInfo.setUserId(secUser.getUserId());
        updataLoginInfo.setLoginIp(secUser.getLoginIp());
        updataLoginInfo.setLoginTime(new Date());
        secUserMapper.updateByPrimaryKeySelective(updataLoginInfo);
        return result;
    }

    protected SecUser beforeLogin(SecUser result) {
        return result;
    }

    protected SecUser afterLogin(SecUser result) {
        return result;
    }

    /**
     * @param secUser
     * @return
     */
    @Override
    public SecUser login(SecUser secUser) throws AuthenticationException {
        beforeLogin(secUser);
        SecUser result = innerLogin(secUser, true);
        SecUser sfsUser = transferToSecUser(result);
        //处理用户角色相关数据
        return sfsUser;
    }



    /**
     * 验证原密码是否正确并修改密码
     * 
     * @param user
     * @param newpwd
     * @return
     */
    @Override
    public void changepwd(SecUser user, String oldpwd, String newpwd) throws Exception {
        if (!DigestUtils.md5DigestAsHex(oldpwd.getBytes()).equals(user.getPwd())) {
            throw new BaseException("原密码错误！");
        } else {
            String newp = DigestUtils.md5DigestAsHex(newpwd.getBytes());
            if (newp.equals(user.getPwd())) {
                throw new BaseException("新密码与原密码相同，请重新修改！");
            } else {
                user.setPwd(newp);
                int updateByPrimaryKeySelective = secUserMapper.updateByPrimaryKeySelective(user);
                if (updateByPrimaryKeySelective < 1) {
                    throw new BaseException("更新失败！请联系系统管理员！");
                }
            }
        }
    }

    /**
     * 新的认证，通过rest接口
     * 
     * @author 34351
     *
     * @param userId
     * @param pwd
     * @return
     * @throws Exception
     */
    private Map<String, Object> authByRest(String userId, String pwd) throws Exception {

        JSONObject jsonObj = new JSONObject();
        jsonObj.put("userName", userId);
        jsonObj.put("password", pwd);
        // Create the POST object and add the parameters
        HttpPost httpPost = new HttpPost(commonConfig.getAddress());
        StringEntity entity = new StringEntity(jsonObj.toString(), HTTP.UTF_8);
        entity.setContentType("application/json");
        // basic认证，加请求头
        String auth = commonConfig.getUserName() + ":" + commonConfig.getPassword();
        String encoding = DatatypeConverter.printBase64Binary(auth.getBytes("UTF-8"));
        httpPost.addHeader("Authorization", "Basic " + encoding);
        // 添加json数据
        httpPost.setEntity(entity);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(httpPost);
        // 获取响应对象中的响应码
        StatusLine statusLine = response.getStatusLine();// 获取请求对象中的响应行对象
        int responseCode = statusLine.getStatusCode();// 从状态行中获取状态码
        logger.info("认证请求状态码为responseCode=" + responseCode + "");
        if (responseCode == 200) {
            Map<String, Object> map = new HashMap<String, Object>();
            // 可以接收和发送消息
            HttpEntity entity1 = response.getEntity();
            // 从消息载体对象中获取操作的读取流对象
            InputStream input = entity1.getContent();
            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String str1 = br.readLine();
            String result = new String(str1.getBytes("gbk"), "utf-8");
            logger.info("服务器的响应是:" + result);
            JSONObject myJsonObject = JSON.parseObject(result);
            map.put("code", myJsonObject.get("code").toString());
            map.put("message", myJsonObject.get("message").toString());
            map.put("employee", myJsonObject.get("employee"));
            br.close();
            input.close();
            return map;
        } else {
            throw new BusinessException("认证失败");
        }
    }


    /**
     * 校验密码 密码规则 8位以上的数字字母组成
     * 
     * @param pwd
     * @return
     */
    @Override
    public void verifyPwd(String pwd) throws AuthenticationException {
        Pattern pattern = Pattern.compile(REGIX_PASSWORD);
        Matcher matcher = pattern.matcher(pwd);
        if (!matcher.matches()) {
            throw new AuthenticationException("1001", "密码为至少8位数字字母组合,请重新输入或到登录OA修改密码！");
        }
    }

    public SecUser transferToSecUser(SecUser secUser){
        SecUser sfsUser = new SecUser();
        sfsUser.setUserId(secUser.getUserId());
        sfsUser.setUserName(secUser.getUserName());
        sfsUser.setActiveType(secUser.getActiveType());
        sfsUser.setPwd(secUser.getPwd());
        sfsUser.setStatus(secUser.getStatus());
        sfsUser.setMale(secUser.getMale());
        sfsUser.setLoginIp(secUser.getLoginIp());
        sfsUser.setLoginTime(secUser.getLoginTime());
        sfsUser.setPwdLock(secUser.getPwdLock());
        sfsUser.setDepartmentId(secUser.getDepartmentId());
        sfsUser.setEmail(secUser.getEmail());
        sfsUser.setTelNo(secUser.getTelNo());
        sfsUser.setGovernor(secUser.getGovernor());
        sfsUser.setUserType(secUser.getUserType());
        sfsUser.setRememberMe(secUser.getRememberMe());
        sfsUser.setLockFlag(secUser.getLockFlag());
        sfsUser.setIschange(secUser.getIschange());
        sfsUser.setCreator(secUser.getCreator());
        sfsUser.setCreateTime(secUser.getCreateTime());
        sfsUser.setUpdator(secUser.getUpdator());
        sfsUser.setUpdateTime(secUser.getUpdateTime());
        return sfsUser;
    }
}
