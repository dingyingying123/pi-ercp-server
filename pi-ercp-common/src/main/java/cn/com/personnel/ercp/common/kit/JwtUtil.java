package cn.com.personnel.ercp.common.kit;

import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {
    // 过期时间
    public static long expire_time;

    public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Value("${app.expire_time}")
    public void setExpire_time(long expire_time) {
        JwtUtil.expire_time = expire_time;
    }

    /**
     * 校验token是否正确
     *z
     * @param token      密钥
     * @param uid        OA号
     * @param tokenType  token类型
     * @param deviceCode 设备编码
     * @return 是否正确
     */
    public static Map verify(String token, String uid, String tokenType, String deviceCode) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        try {
            String key = null;
            if ("access_token".equals(tokenType)) {
//                key = getUsername(token) + uid + "piservice" + deviceCode + 2021;
                key = getUsername(token) + uid + ApplicationConfig.APP_CODE + deviceCode + 2021;
            } else {
                returnMap.put("success", false);
                returnMap.put("code", "05");
                returnMap.put("message", "token类型不对");
                return returnMap;
            }
            System.out.println("==========token验证key:" + key);
            Algorithm algorithm = Algorithm.HMAC256(key);
            JWTVerifier verifier = JWT.require(algorithm).withClaim("uid", uid).build();
            DecodedJWT jwt = verifier.verify(token);
            returnMap.put("success", true);
            returnMap.put("code", "01");
            returnMap.put("message", "success");
            returnMap.put("uid",uid);
            return returnMap;
        } catch (TokenExpiredException exception) {
            // TOKEN 过期
            returnMap.put("success", false);
            returnMap.put("code", "02");
            returnMap.put("message", "Token过期");
            return returnMap;
        } catch (IllegalArgumentException e) {
            // uid不对
            returnMap.put("success", false);
            returnMap.put("code", "03");
            returnMap.put("message", "UID验证失败");
            return returnMap;
        } catch (UnsupportedEncodingException e) {
            returnMap.put("success", false);
            returnMap.put("code", "04");
            returnMap.put("message", "编码错误");
            return returnMap;
        } catch (SignatureVerificationException e) {
            returnMap.put("success", false);
            returnMap.put("code", "05");
            returnMap.put("message", "密码错误");
            return returnMap;
        }
    }

    /**
     * 校验token是否正确
     *
     * @param token      密钥
     * @param uid        OA号
     * @param tokenType  token类型
     * @return 是否正确
     */
    public static Map verify(String token, String uid, String tokenType) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        try {
            String key = null;
            if ("access_token".equals(tokenType)) {
                key = getUsername(token) + uid + ApplicationConfig.APP_CODE  + "2019";
            } else {
                returnMap.put("success", false);
                returnMap.put("code", "05");
                returnMap.put("message", "token类型不对");
                return returnMap;
            }
            Algorithm algorithm = Algorithm.HMAC256(key);
            JWTVerifier verifier = JWT.require(algorithm).withClaim("uid", uid).build();
            DecodedJWT jwt = verifier.verify(token);
            returnMap.put("success", true);
            returnMap.put("code", "01");
            returnMap.put("message", "success");
            returnMap.put("uid",uid);
            return returnMap;
        } catch (TokenExpiredException exception) {
            // TOKEN 过期
            returnMap.put("success", false);
            returnMap.put("code", "02");
            returnMap.put("message", "Token过期");
            return returnMap;
        } catch (IllegalArgumentException e) {
            // uid不对
            returnMap.put("success", false);
            returnMap.put("code", "03");
            returnMap.put("message", "UID验证失败");
            return returnMap;
        } catch (UnsupportedEncodingException e) {
            returnMap.put("success", false);
            returnMap.put("code", "04");
            returnMap.put("message", "编码错误");
            return returnMap;
        } catch (SignatureVerificationException e) {
            returnMap.put("success", false);
            returnMap.put("code", "05");
            returnMap.put("message", "密码错误");
            return returnMap;
        }
    }

    /**
     * 获得token中的信息无需key解密也能获得
     *
     * @return token中包含的用户名
     */
    public static String getUsername(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("username").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 获得token中的信息无需key解密也能获得
     *
     * @return token中包含的用户ID
     */
    public static String getUID(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("uid").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 获得token中的信息无需key解密也能获得
     *
     * @return token中包含的用户ID
     */
    public static String getArea(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("area").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 生成签名,指定时间后过期
     *
     * @param uid        用户ID
     * @param username   用户名
     * @param deviceCode 设备编码
     * @return 加密的token
     */
    public static Map<String, Object> sign(String uid, String username, String area, String deviceCode) {
        Date date = new Date(System.currentTimeMillis() + expire_time);
        String key = username + uid + ApplicationConfig.APP_CODE + deviceCode;
        return generateToken(key, uid, username, area, date, "refresh_token");
    }

    /**
     * 生成签名,指定时间后过期
     *
     * @param uid        用户ID
     * @param username   用户名
     * @return 加密的token
     */
    public static Map<String, Object> sign(String uid, String username) {
        Date date = new Date(System.currentTimeMillis() + expire_time);
        String key = username + uid + ApplicationConfig.APP_CODE;
        return generateToken(key, uid, username, date, "access_token");
    }

//    public static Map<String, Object> sign(String userId, String userName, String appCode, String deviceCode) {
//        Date date = new Date(System.currentTimeMillis() + expire_time);
//        String key = userName + userId + appCode + deviceCode;
//        return generateToken(key, userId, userName, date, "access_token");
//    }

    /**
     * 根据refresh_token生成access_token
     *
     * @param token
     * @return
     */
    public static Map<String, Object> accessSign(String token, String deviceCode) {
        String uid = getUID(token);
        String username = getUsername(token);
        String area = getArea(token);
        Date date = new Date(System.currentTimeMillis() + 120 * 60 * 1000);
        String key = username + uid + ApplicationConfig.APP_CODE + deviceCode + "2021";
        return generateToken(key, uid, username, area, date, "access_token");
    }

    /**
     * 生成token的方法
     *
     * @param key      生成秘钥
     * @param uid      用户编号
     * @param username 用户名
     * @param date     过期时间
     * @return
     */
    private static Map generateToken(String key, String uid, String username, Date date, String tokenName) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(key);
            String token = JWT.create().withClaim("uid", uid).withClaim("username", username).withExpiresAt(date)
                    .sign(algorithm);
            // 附带userinfo信息
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put(tokenName, token);
            resultMap.put(tokenName + "_exipre_time", sdf.format(date));
            return resultMap;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 生成token的方法
     *
     * @param key      生成秘钥
     * @param uid      用户编号
     * @param username 用户名
     * @param date     过期时间
     * @return
     */
    private static Map generateToken(String key, String uid, String username, String area, Date date, String tokenName) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(key);
            String token = JWT.create().withClaim("uid", uid).withClaim("username", username).withClaim("area", area).withExpiresAt(date)
                    .sign(algorithm);
            // 附带userinfo信息
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put(tokenName, token);
            resultMap.put(tokenName + "_exipre_time", sdf.format(date));
            return resultMap;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解析token，获取用户名和ID
     *
     * @param token
     * @return
     */
    public static Map<String, String> parseToken(String token) {
        String uid = getUID(token);
        String username = getUsername(token);
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("uid", uid);
        resultMap.put("username", username);
        return resultMap;
    }
}
