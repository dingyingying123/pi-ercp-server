package cn.com.personnel.ercp.common.service;


import cn.com.personnel.ercp.auth.persistence.entity.PortalToken;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.common.kit.JwtUtil;
import cn.com.personnel.ercp.common.persistence.mapper.PortalTokenMapper;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 36457
 */
@Component
public class PortalTokenService extends BaseService implements IPortalTokenService {
    @Autowired
    private PortalTokenMapper tokenMapper;

    @Autowired
    private SecUserMapper secUserMapper;

    @Override
    public PortalToken getTokenByUserIDAndType(String userId, String tokenType) {
        return tokenMapper.getTokenByUserIDAndType(userId, tokenType);
    }

    @Override
    @Transactional
    public void saveToken(PortalToken token) {
        tokenMapper.insert(token);

    }

    @Override
    @Transactional
    public void updateToken(PortalToken token) {
        tokenMapper.updateByPrimaryKeySelective(token);

    }

    @Override
    public Map<String, Object> checkToken(String token, String tokenType, String deviceCode) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        if (token == null) {
            returnMap.put("success", false);
            returnMap.put("code", "06");
            returnMap.put("message", "Token不存在");
            return returnMap;
        }
        String uid = JwtUtil.getUID(token);
        PortalToken portalToken = getTokenByUserIDAndType(uid, tokenType);
        if (portalToken == null || portalToken.getToken() == null || !portalToken.getToken().equals(token)) {
            returnMap.put("success", false);
            returnMap.put("code", "03");
            returnMap.put("message", "UID验证失败");
            return returnMap;
        } else {
            return JwtUtil.verify(token, uid, tokenType, deviceCode);
        }
    }

    @Override
    public Map<String, Object> sign(String uid, String username, String deviceCode) {
        return JwtUtil.sign(uid, username, deviceCode);
    }

    @Override
    public Map<String, Object> accessSign(String token, String deviceCode) {
        return JwtUtil.accessSign(token, deviceCode);
    }

    @Override
    public Map<String, String> parseSign(String token) {
        return JwtUtil.parseToken(token);
    }

    @Override
    public int  deleteToken(PortalToken token) {
        return tokenMapper.delete(token);
    }

}



