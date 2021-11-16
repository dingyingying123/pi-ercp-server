package cn.com.personnel.ercp.auth.controller;

import cn.com.personnel.ercp.auth.module.JSTreeNode;
import cn.com.personnel.ercp.auth.persistence.entity.SecRoleModule;
import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.ISecModuleService;
import cn.com.personnel.ercp.auth.service.ISecRoleModuleService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.ercp.pi.module.base.SecRoleModuleVO;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/auth/role_module")
public class SecRoleModuleController extends PageController{
    @Autowired
    private ISecRoleModuleService secRoleModuleService;
    
    @Autowired
    private ISecModuleService secModuleService;
    
    @RequestMapping()
    public String index(){
        return "auth/role_rule";
    }
    
    @RequestMapping("roleModuleTree")
    @ResponseBody 
    public List<JSTreeNode> getTreeForRole(String roleId){
        List<JSTreeNode> roleModuleTree = secModuleService.getRoleModuleTree(ApplicationConfig.APP_CODE,roleId);
        return roleModuleTree;
    } 
    
    
    @RequestMapping("roleModuleSave")
    @ResponseBody 
    public Map<String,Object> roleModuleSave(@RequestBody List<SecRoleModule> records, String roleId){
        Map<String,Object> resMap=new HashMap<String, Object>();
        SecUser user = (SecUser) getLoginUser();
              try {
                  secRoleModuleService.saveRoleModuleRecords(ApplicationConfig.APP_CODE,records,roleId,user);
                resMap.put("success", true);
                resMap.put("message", "保存成功！");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                resMap.put("success", false);
                resMap.put("message", "保存失败！");
            }
        return resMap;
    }

    @RequestMapping("getmoduleList")
    @ResponseBody
    public ReturnEntity getmoduleList(@RequestBody SecRoleModule SecRoleModule){
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,null);
        List list = secModuleService.getModuleIdList(SecRoleModule.getRoleId());
        List list1 = secModuleService.getPareModuleIdList(SecRoleModule.getRoleId());
        Map<String,Object> map = new HashMap<String,Object>();
        if(list!=null && list.size()!=0){
            map.put("modules",list);
            map.put("paremodules",list1);
            returnEntity.setData(list);
        }
        return returnEntity;
    }
    @RequestMapping("rolesave")
    @ResponseBody
    public Map<String,Object> rolesave(@RequestBody List<String> moduleId,@RequestParam String roleId){
        Map<String,Object> resMap=new HashMap<String, Object>();
        SecUser user = (SecUser) getLoginUser();
        try {
            secRoleModuleService.roleSave(ApplicationConfig.APP_CODE,moduleId,roleId,user);
            resMap.put("success", true);
            resMap.put("message", "保存成功！");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            resMap.put("success", false);
            resMap.put("message", "保存失败！");
        }
        return resMap;
    }

    @RequestMapping("getRouterByRoleId")
    @ResponseBody
    public ReturnEntity getRouterByRoleId(@RequestBody SecRoleModule secRoleModule){
        String appStr=Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
        ReturnEntity roleMenuTree = secModuleService.getRoleMenuTree(secRoleModule.getRoleId(),appStr);
        return roleMenuTree;
    }

    @RequestMapping("getAllRouter")
    @ResponseBody
    public ReturnEntity getAllRouter(){
        String appStr= Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
        ReturnEntity roleMenuTree = secModuleService.getAllMenuTree(appStr);
        return roleMenuTree;
    }

    /**
     * 复制角色模块
     * @param secRoleModuleVO
     * @return
     */
    @RequestMapping("copyModuleFromRole")
    @ResponseBody
    public ReturnEntity copyModuleFromRole(@RequestBody SecRoleModuleVO secRoleModuleVO){
        String appStr= Optional.ofNullable(getCookie("appcod")).orElse(ApplicationConfig.APP_CODE);
        SecUser secUser = (SecUser) getLoginUser();
        return secModuleService.copyModuleFromRole(appStr, secRoleModuleVO, secUser);
    }
}
