package cn.com.personnel.ercp.pi.service.demo;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;

import java.util.List;

public interface IDemoService {

    List<SecUser> querySecuserList();
}
