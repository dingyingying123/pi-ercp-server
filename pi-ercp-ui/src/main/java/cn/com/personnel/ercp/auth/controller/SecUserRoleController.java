package cn.com.personnel.ercp.auth.controller;

import cn.com.personnel.ercp.auth.module.SecUserRoleModule;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.persistence.entity.SecUserRole;
import cn.com.personnel.ercp.auth.service.ISecUserRoleService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Optional;

@Controller
@RequestMapping("/auth/role_user")
public class SecUserRoleController extends PageController {

    @RequestMapping
    public String index() {
        return "auth/role_user";
    }

    @Autowired
    private ISecUserRoleService secUserRoleService;

    /**
     * 查找角色下用户
     * 
     * @param queryRoleUser
     * @return
     */
    @RequestMapping("query")
    @ResponseBody
    public PageInfo<SecUserRoleModule> queryRoleUser(@RequestBody SecUserRoleModule secUserRoleModule) {
        secUserRoleModule.setAppcod(ApplicationConfig.APP_CODE);
        return new PageInfo<SecUserRoleModule>(secUserRoleService.queryUserRole(secUserRoleModule, buildPagenation()));
    }

    @RequestMapping("query_web")
    @ResponseBody
    public ReturnEntity query_web(@RequestBody SecUserRoleModule secUserRoleModule) {

        secUserRoleModule.setAppcod(ApplicationConfig.APP_CODE);
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,
                new PageInfo<SecUserRoleModule>(secUserRoleService.queryUserRole(secUserRoleModule, buildPagenation())));
        return returnEntity;
    }

    @RequestMapping("add")
    @ResponseBody
    public SecUserRoleModule insertRole(@RequestBody SecUserRole secUserRole) {
        secUserRole.setAppcod(ApplicationConfig.APP_CODE);
        SecUser user = (SecUser) getLoginUser();
        secUserRole.setCreator(user.getUserName());
        return secUserRoleService.addRole(secUserRole);
    }

    @RequestMapping("delete")
    @ResponseBody
    public int deleteRole(@RequestBody SecUserRole secUserRole) {
        return secUserRoleService.deleteRole(secUserRole);
    }

    /**
     * 根据用户查询所包含的角色
     * @param secUserRoleModule
     * @return
     */
    @RequestMapping("queryRolesByUserId")
    @ResponseBody
    public ReturnEntity queryRolesByUserId(@RequestBody SecUserRoleModule secUserRoleModule){
        String appStr= Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
        secUserRoleModule.setAppcod(appStr);
        return ReturnEntity.ok(new PageInfo<>(secUserRoleService.queryUserRoleNoPageByRoleName(secUserRoleModule, buildPagenation())));
    }
}
