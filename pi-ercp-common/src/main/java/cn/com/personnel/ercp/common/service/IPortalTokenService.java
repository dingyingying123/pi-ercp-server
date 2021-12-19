package cn.com.personnel.ercp.common.service;


import cn.com.personnel.ercp.auth.persistence.entity.PortalToken;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.springboot.framework.core.service.IService;

import java.util.Map;

/*token管理业务接口*/
public interface IPortalTokenService extends IService {
    /*
     * 会话超时时间，默认2小时
     */
    public final static int SESSION_TIMEOUT=2*60*60;
    /*
     *置换保护时间，默认1小时
     */
    public final static int REPLACEMENT_PROTECTION_TIMEOUT=60*60;
    /*
     *旧token延迟过期时间
     */
    public final static int REPLACEMENT_DELAY=2*60;

    /*
     * 生成token
     * @param agent Http头中的user-agent信息
     * @param user 用户信息
     * @return Token格式<br/>
     *          PC: "前缀PC-USERCODE-USERID-CREATIONDATE-RONDEM[6位]"
     *          <br/>
     *          Android:"前缀ANDOIRD-USERCODE-CREATIONDATE-RONDEM[6位]"
     */
//    public String generateToken(String agent, SecUser user) throws Exception;
//
//    /*
//     * 保存用于信息至redis
//     * @param token token字符串
//     * @param user 用户信息
//     */
//    void save(String token, SecUser user) throws Exception;
//
//    /*
//     * 从redis中获取用户信息
//     * @param token token字符串
//     * @return 对象
//     */
//    public SecUser load(String token) throws Exception;
//
//
//
//    /*
//     * 置换token<br/>
//     *  1. 首先要判断token是否有效<br/>
//     *  2. 生成token后的1个小时内部允许置换<br/>
//     *  3. 置换token时， 需要生成新token, 并且旧token不能立即失效，
//     *  应设置置换后的时间延长2分钟<br/>
//     *  4. 兼容手机端和PC端<br/>
//     * @param agent http头信息的user-agent
//     * @param token token 字符串
//     * @return
//     */
//    public String replaceToken(String agent, String token) throws Exception;
//
//    /*
//     * 验证token是否有效
//     * @param agent http头信息的user-agent
//     * @param token token 字符串
//     * @return
//     */
//    public boolean validate(String agent, String token) throws Exception;

    /**
     * 根据用户获取token
     *
     * @param userId
     * @param tokenType
     * @return
     */
    public PortalToken getTokenByUserIDAndType(String userId, String tokenType);

    /**
     * 保存token
     *
     * @param token
     */
    public void saveToken(PortalToken token);

    /**
     * 更新token
     *
     * @param token
     */
    public void updateToken(PortalToken token);

    /**
     * 校验token
     *
     * @param token
     * @param tokenType
     * @param deviceCode
     * @return
     */
    public Map<String, Object> checkToken(String token, String tokenType, String deviceCode);

    /**
     * 获取refreshtoken
     *
     * @param uid
     * @param username
     * @param deviceCode
     * @return
     */
    public Map<String, Object> sign(String uid, String username, String deviceCode);

    /**
     * 获取accesstoken
     *
     * @param token
     * @param deviceCode
     * @return
     */
    public Map<String, Object> accessSign(String token, String deviceCode);

    /**
     * 解析token
     *
     * @param token
     * @return
     */
    public Map<String, String> parseSign(String token);


    /**
     * 删除token
     *
     * @param token
     */
    public int deleteToken(PortalToken token);
}


