package cn.com.personnel.ercp.pi.service.server;

import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerTakeCaseFamilyMemberMapper;
import cn.com.personnel.ercp.pi.persistence.mapper.server.ServerTakeCaseInfoMapper;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TakeCaseService extends BaseService implements ITakeCaseService {
    @Autowired
    ServerTakeCaseInfoMapper serverTakeCaseInfoMapper;
    @Autowired
    ServerTakeCaseFamilyMemberMapper serverTakeCaseFamilyMemberMapper;


}
