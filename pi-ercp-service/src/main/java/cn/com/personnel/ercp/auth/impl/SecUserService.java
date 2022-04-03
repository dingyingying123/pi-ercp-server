package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.entity.SecUserRole;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserRoleMapper;
import cn.com.personnel.ercp.auth.service.ISecUserService;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.apache.axis.encoding.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import javax.transaction.Transactional;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

@Component
public class SecUserService extends BaseService implements ISecUserService {
    @Autowired
    private SecUserMapper         secUserMapper;
    @Autowired
    private SecUserRoleMapper         secUserRoleMapper;

    private static String SHA_SALT = "!@#$%qwe@#!";

    /**
     * 条件查询
     */
    @Override
    public List<SecUser> queryUser(SecUser secUser, PagenationQueryParameter pageParam) {
        setPageHelper(pageParam);
        return secUserMapper.queryUserByArea(secUser);
    }

    @Override
    public List<SecUser> findUser() {
        return secUserMapper.selectAll();
    }

    /**
     * 设置默认密码
     * 
     * @param secUser
     * @return
     */
    private byte[] generatPwd(SecUser secUser) {
        return "123456".getBytes();
    }

    /**
     * 新增用户
     */
    @Override
    public SecUser addUser(SecUser secUser) {

        // 检查用户是否存在
//        SecUser queryEntity = new SecUser();
//        queryEntity.setUserId(secUser.getUserId());
//        int countResult = secUserMapper.selectCount(queryEntity);
//        Assert.state(countResult < 1, "用户名已经存在！");

        secUser.setUpdateTime(new Date());
        secUser.setPwd(DigestUtils.md5DigestAsHex(generatPwd(secUser)));
        int count = secUserMapper.updateByPrimaryKeySelective(secUser);
        if(count == 0) {
            // 插入数据
            secUser.setPwd(DigestUtils.md5DigestAsHex(generatPwd(secUser)));
            secUser.setPwdLock("是");
            secUser.setStatus("有效");
            secUser.setCreateTime(new Date());
            secUserMapper.insert(secUser);
        }
        return secUser;
    }

    /**
     * 编辑用户
     */
    @Override
    public SecUser updateUser(SecUser secUser) {
        try {
            secUser.setUpdateTime(new Date());
            secUser.setPwd(DigestUtils.md5DigestAsHex(generatPwd(secUser)));
            int row = secUserMapper.updateByPrimaryKeySelective(secUser);
            if (row > 0)
                return secUserMapper.selectByPrimaryKey(secUser.getUserId());
        } catch (Exception e) {
            logger.error("SecUserServiceImp updateUser error, secUser = " + secUser, e);
        }
        return null;
    }

    /**
     * 作废用户
     * 
     * @param secUser
     * @return
     */
    @Override
    public int deleteUser(SecUser secUser) {
        try {
            int row = secUserMapper.deleteByPrimaryKey(secUser.getUserId());
            if (row > 0)
                return 1;
        } catch (Exception e) {
            logger.error("SecUserServiceImp deleteUser error, secUser = " + secUser, e);
        }
        return 0;
    }


    /**
     * 在数据库表中彻底删除用户
     */
    @Override
    public int deleteUserReally(String userId) {
        int count = secUserMapper.deleteByPrimaryKey(userId);
        if (count > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public List<SecUser> findUserByRoleName(String roleName) {
        // TODO Auto-generated method stub
        return secUserMapper.findUserByRoleName(roleName);
    }

    /* (non-Javadoc)
     * @see cn.com.personnel.ercp.auth.service.ISecUserService#importData(java.util.List, java.util.List)
     */
    @Transactional
    public int importData(List<SecUser> secUserList, List<SecUserRole> secUserRoleList) {
        int userCount = 0;
        for(SecUser record : secUserList) {
            List<SecUser> list = secUserMapper.searchById(record.getUserId());
            if(list != null && list.size()>0 ) {
                secUserMapper.updateByPrimaryKey(record);
            }else {
                secUserMapper.insert(record);
            }
            userCount++;
        }
        int userRoleCount = 0;
        for(SecUserRole record : secUserRoleList) {
            List<SecUserRole> list = secUserRoleMapper.selectRoleUser(record);
            if(list != null && list.size()>0 ) {
                secUserRoleMapper.importUpdateBySecUserRole(record);
            }else {
                secUserRoleMapper.insert(record);
            }
            userRoleCount++;
        }
        if(userRoleCount == userCount) {
            return userCount;
        }else {
            return 0;
        }
    }

    @Override
	public SecUser selectByUserId(String userId) {
		return secUserMapper.selectByPrimaryKey(userId);
	}

    /**
     * 外部 新增用户
     * 应CA统一接口要求 返回 001账号已存在;002账号创建失败;000创建账号成功;
     */
    @Override
    public String addRestUser(SecUser secUser) {
        // 检查用户是否存在
        SecUser queryEntity = new SecUser();
        queryEntity.setUserId(secUser.getUserId());
        int countResult = secUserMapper.selectCount(queryEntity);

        if(countResult>0) {
            //应CA统一认证要求,如果再次创建 已有账号 并且是有效状态， 报错；如果是无效状态，变成有效 更新。
//        	SecUser temp=secUserMapper.selectOne(secUser);
            SecUser temp=secUserMapper.selectByPrimaryKey(secUser.getUserId());
            if(temp.getStatus().equals("有效")) {
                return "001";
            }else {
                secUser.setStatus("有效");
                secUser.setUpdateTime(new Date());
                secUserMapper.updateByPrimaryKeySelective(secUser);
                return "000";
            }

        }
        try {
            // 插入数据
            secUser.setPwd(DigestUtils.md5DigestAsHex(generatPwd(secUser)));
            secUser.setPwdLock("是");
            secUser.setStatus("有效");
            secUser.setCreateTime(new Date());
            secUserMapper.insert(secUser);
//            SecUserRole userRole=new SecUserRole();
//            userRole.setId(UUIDKit.getUUID());
//            userRole.setAppcod("r2r");
//            userRole.setUserId(secUser.getUserId());
//            String roleId=secUserRoleMapper.selectRoleIdByRoleName();
//            userRole.setRoleId(roleId);
//            userRole.setCreateTime(new Date());
//            secUserRoleMapper.insert(userRole);
        }catch(Exception e) {
            logger.error("SecUserServiceImp addUser error"+e.getMessage());
            return "002";
        }
        return "000";
    }

    /**
     * 外部rest编辑用户
     * 应CA统一接口要求 返回 101账号不存在;102账号修改失败;100修改账号成功;
     */
    @Override
    public String updateRestUser(SecUser secUser) {
        try {
            SecUser temp=secUserMapper.selectByPrimaryKey(secUser.getUserId());
            if(temp!=null&&temp.getStatus()!=null&&temp.getStatus().equals("作废")) {
                //如果是作废状态 在SAP是禁用状态 不允许修改
                return "102";
            }
            secUser.setUpdateTime(new Date());
            //secUser.setPwd(DigestUtils.md5DigestAsHex(generatPwd(secUser)));
            int row = secUserMapper.updateByPrimaryKeySelective(secUser);
            if (row > 0) {
                return "100";
            }else {
                return "101";
            }
        } catch (Exception e) {
            logger.error("SecUserServiceImp updateRestUser error, secUser = " + secUser, e);
            logger.error(e.getMessage(),e);
            return "102";
        }
    }

    /**
     * Rest作废用户
     *
     * 应CA统一接口要求 返回 201账号不存在;202账号修改失败;200账号作废成功;
     */
    @Override
    public String deleteRestUser(String account,String type) {
        try {
            SecUser secUser=new SecUser();
            secUser.setUserId(account);
            if(type!=null&&type.equals("delete"))
                secUser.setStatus("作废");
            else secUser.setStatus("有效");
            int row = secUserMapper.updateByPrimaryKeySelective(secUser);
            if (row > 0)
                return "200";
            else {
                return "202";
            }
        } catch (Exception e) {
            logger.error("SecUserServiceImp deleteRestUser error, userId = " + account, e);
            logger.error(e.getMessage(),e);
            return "201";
        }
    }

    public boolean checkAuth(String api , String ip , String userName, String password) {
        ///String auth = request.getHeader("Authorization");
        logger.info("访问ip:"+ip);
        logger.info("auth user " + userName);

//        CaApiUser apiUser = caApiUserMapper.selectByPrimaryKey(userName);
//        if(apiUser != null){
//            if("*".equals(apiUser.getIp()) || apiUser.getIp().equals(ip)){
//                if(apiUser.getPasswrod().equals(org.apache.commons.codec.digest.DigestUtils.md5Hex(password))){
//                    Date currentTime = new Date(System.currentTimeMillis());
//                    //账号验证通过
//                    //账号验证通过
//                    List<CaApiConfigVo> caApionfigs = caApiConfigMapper.queryCallNum(userName, api);
//                    Long calNum = 0L;
//                    Long totalNum = 0L;
//                    if(caApionfigs != null && caApionfigs.size() == 1){
//                        CaApiConfigVo caApionfig = caApionfigs.get(0);
//                        Long maxNum = caApionfig.getMaxNum();
//                        String mainId = UUIDKit.getUUID();
//                        if(caApionfig.getCallNum() == null ){
//                            CaApiMain camain = new CaApiMain();
//                            camain.setUuid(mainId);
//                            camain.setCallNum(0L);
//                            camain.setUserId(userName);
//                            camain.setApi(api);
//                            camain.setTotalNum(0L);
//                            camain.setLastTime(currentTime);
//                            caApiMainMapper.insert(camain);
//
//                        }else{
//                            calNum = caApionfig.getCallNum();
//                            totalNum = caApionfig.getTotalNum();
//                            mainId = caApionfig.getMainid();
//                        }
//                        //调用次数验证
//                        if((-1L == maxNum) || (calNum < maxNum)){
//                            //更新调用次数,起一个定时器，每日刷新次数
//                            CaApiMain camain = new CaApiMain();
//                            camain.setUuid(mainId);
//                            camain.setCallNum(calNum + 1L);
//                            camain.setTotalNum(totalNum + 1L);
//                            camain.setLastTime(currentTime);
////            					apiMainMapper.updateByPrimaryKeySelective(camain);
//                            //添加日志
//                            CaApiLog caLog = new CaApiLog();
//                            caLog.setUuid(UUIDKit.getUUID());
//                            caLog.setUserId(userName);
//                            caLog.setIp(ip);
//                            caLog.setApi(api);
//                            caLog.setCallTime(currentTime);
//                            caApiLogMapper.insert(caLog);
//                            return true;
//                        }
//                    }
//                }
//            }
//        }
        return false;
    }

    @Override
    public boolean checkPassword(String inputPwd, String dbPwd) {

        try {
            boolean check = verifySHA(dbPwd,inputPwd);
            if (!check) {
                check = DigestUtils.md5DigestAsHex(inputPwd.getBytes()).equals(dbPwd);
            }
            return check;
        }catch (Exception e) {
            return false;
        }
    }

    private boolean verifySHA(String ldappw, String inputpw) throws NoSuchAlgorithmException {
        logger.info("verifySHA开始进行用户密码检查..."+ ldappw);
        // MessageDigest 提供了消息摘要算法，如 MD5 或 SHA，的功能，这里LDAP使用的是SHA-1
        MessageDigest md = MessageDigest.getInstance("SHA-1");

        // 取出加密字符
        if (ldappw.startsWith("{SSHA}")) {
            ldappw = ldappw.substring(6);
        } else if (ldappw.startsWith("{SHA}")) {
            ldappw = ldappw.substring(5);
        }

        // 解码BASE64
        byte[] ldappwbyte = Base64.decode(ldappw);
        byte[] shacode;
        byte[] salt;

        // 前20位是SHA-1加密段，20位后是最初加密时的随机明文
        if (ldappwbyte.length <= 20) {
            shacode = ldappwbyte;
            salt = SHA_SALT.getBytes();
        } else {
            shacode = new byte[20];
            salt = new byte[ldappwbyte.length - 20];
            System.arraycopy(ldappwbyte, 0, shacode, 0, 20);
            System.arraycopy(ldappwbyte, 20, salt, 0, salt.length);
        }

        // 把用户输入的密码添加到摘要计算信息
        md.update(inputpw.getBytes());

        // 把随机明文添加到摘要计算信息
        md.update(salt);

        // 按SSHA把当前用户密码进行计算
        byte[] inputpwbyte = md.digest();

        logger.info("verifySHA用户密码检查完毕...");
        // 返回校验结果
        return MessageDigest.isEqual(shacode, inputpwbyte);
    }


}
