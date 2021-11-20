package cn.com.personnel.ercp.pi.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.mapper.SecUserMapper;
import cn.com.personnel.ercp.pi.service.demo.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService implements IDemoService {
    @Autowired
    SecUserMapper secUserMapper;

    @Override
    public List<SecUser> querySecuserList() {
        List<SecUser> secUserList = secUserMapper.findUserByRoleName("qq");
        return secUserList;
    }
}
