package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
//import cn.com.personnel.ercp.common.module.DepartmentJson;
//import cn.com.personnel.ercp.common.module.PeopleJson;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.core.service.IService;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpHeaders;

public interface ICAService extends IService {
//    List<PeopleJson> findPeopleList(String var1, String var2, PagenationQueryParameter var3);
//
//    List<DepartmentJson> findAllDepartment(String var1, String var2, String var3) throws Exception;

    ReturnEntity getFirstDepartment();

    void setAuthorization(HttpHeaders var1) throws UnsupportedEncodingException;

    ReturnEntity findUserInfo(SecUser var1);

    ReturnEntity getSubDepartmentAndEmployeeByPid(String var1);

    Map<String, Object> authenticate(String var1, String var2, String var3) throws Exception;
}
