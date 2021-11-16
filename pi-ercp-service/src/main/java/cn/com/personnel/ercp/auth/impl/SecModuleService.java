package cn.com.personnel.ercp.auth.impl;

import cn.com.personnel.ercp.auth.module.JSTreeNode;
import cn.com.personnel.ercp.auth.module.MenuList;
import cn.com.personnel.ercp.auth.persistence.entity.*;
import cn.com.personnel.ercp.auth.persistence.mapper.CesRouterMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecModuleMapper;
import cn.com.personnel.ercp.auth.persistence.mapper.SecRoleModuleMapper;
import cn.com.personnel.ercp.auth.service.ISecModuleService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.exception.MsgException;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.ercp.pi.module.base.SecRoleModuleVO;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.*;

import static cn.com.personnel.ercp.common.UserInfo.getLoginUser;

@Component
public class SecModuleService extends BaseService implements ISecModuleService {

    @Autowired
    private SecModuleMapper secModuleMapper;

    @Autowired
    private SecRoleModuleMapper secRoleModuleMapper;

    @Autowired
    CesRouterMapper cesRouterMapper;

    @Autowired
    SecUserRoleService secUserRoleService;

    /**
     * 新增模块
     */
    @Override
    public int addModule(SecModule secModule) {
        if (secModule.getAppcod() == null) {
            return 0;
        }
        secModule.setModuleId(UUIDKit.getUUID());
        secModule.setCreateTime(new Date());
        secModule.setValid("有效");
        return secModuleMapper.insert(secModule);
    }

    /**
     * 更新模块
     */
    @Override
    public int updateModule(SecModule secModule) {
        if (secModule.getAppcod() == null) {
            return 0;
        }
        secModule.setUpdateTime(new Date());
        return secModuleMapper.updateByPrimaryKeySelective(secModule);
    }

    /**
     * 删除模块
     *
     * @param secModule
     * @return
     */
    @Override
    @Transactional(rollbackForClassName = "Exception")
    public int deleteModule(SecModule secModule) {
        // 先删除主表外键关联子表数据
        secRoleModuleMapper.deleteByModuleId(secModule.getModuleId());
        /*
         * SecRoleModule delModule = new SecRoleModule();
         * delModule.setModuleId(secModule.getModuleId()); List<SecRoleModule>
         * list = secRoleModuleMapper.select(delModule);
         * if(list!=null&&list.size()>0) { for (SecRoleModule secRoleModule :
         * list) { secRoleModuleMapper.delete(secRoleModule); }
         *
         * }
         */
        return secModuleMapper.deleteByPrimaryKey(secModule.getModuleId());
    }

    /**
     * 获取所有模块
     */
    @Override
    public List<SecModule> getAllModules(String appCode) {
        return secModuleMapper.selectOderByOrderId(appCode);
    }

    /**
     * 获取用户可查看模块
     *
     * @param appCode
     * @return
     */
    @Override
    public List<SecModule> getUserModule(String appCode, SecUser user) {
        List<SecModule> moduleList = null;
        if (!ObjectUtils.isEmpty(user))
            if ("是".equals(user.getGovernor())) {
                moduleList = secModuleMapper.selectOderByOrderId(appCode);
            } else {
                moduleList = secModuleMapper.selectUserModule(appCode, user.getUserId());
            }
        return moduleList;
    }

    public int deleteModuleInfo(SecModule module) {
        if (module == null || module.getModuleId() == null) {
            throw new MsgException("删除失败，请检查！");
        }
        int deleteByPrimaryKey = secModuleMapper.deleteByPrimaryKey(module.getModuleId());
        SecModule record = new SecModule();
        record.setParentId(module.getParentId());
        List<SecModule> list = secModuleMapper.select(record);
        if (list == null || list != null && list.size() == 0) {
            SecModule parentModule = new SecModule();
            parentModule.setIsLeaf("是");
            parentModule.setModuleId(module.getParentId());
            secModuleMapper.updateByPrimaryKeySelective(parentModule);
        }
        return deleteByPrimaryKey;
    }

    /*
     * (non-Javadoc)获取角色树结构
     *
     * @see
     * cn.com.personnel.ercp.auth.service.ISecRoleService#getRoleModuleTree(java.
     * lang.String)
     */
    @Override
    public List<JSTreeNode> getRoleModuleTree(String appCode, String roleId) {
        // 得到所有的功能节点
        List<SecModule> modules = getAllModules(appCode);
        // 对应该角色下所有的功能
        Map<String, String> moduleMap = new HashMap<String, String>();
        SecRoleModule secRoleModule = new SecRoleModule();
        secRoleModule.setRoleId(roleId);
        List<SecRoleModule> resultList = secRoleModuleMapper.selectByRoleId(secRoleModule);
        for (SecRoleModule item : resultList) {
            moduleMap.put(item.getModuleId(), "");
        }

        List<JSTreeNode> nodes = new ArrayList<JSTreeNode>();
        Map<String, Boolean> state = null;

        for (SecModule module : modules) {
            state = new HashMap<String, Boolean>();
            state.put("opened", true);
            JSTreeNode node = new JSTreeNode();
            node.setData(module);
            node.setId("n_" + module.getModuleId());
            if ("0".equals(module.getParentId())) {
                node.setParent("#");
            } else {
                node.setParent("n_" + module.getParentId());
            }
            // 设置图标
            if ("是".equals(module.getIsLeaf())) {
                node.setIcon("glyphicon glyphicon-file text-warning");
            } else {
                node.setIcon("");
            }
            // 设置是否选中
            if (moduleMap.containsKey(module.getModuleId()) && "是".equals(module.getIsLeaf())) {
                state.put("selected", true);
            }
            node.setText(module.getModuleName());
            node.setState(state);
            nodes.add(node);

        }
        return nodes;
    }

    @Override
    public SecModule getMenuById(String moduleId) {
        return secModuleMapper.selectByPrimaryKey(moduleId);
    }

    @Override
    public List<String> getModuleIdList(String roleId) {
        return secRoleModuleMapper.getModuleIdList(roleId);
    }

    @Override
    public List<String> getPareModuleIdList(String roleId) {
        return secRoleModuleMapper.getPareModuleIdList(roleId);
    }

    @Override
    public List<SecModule> getUserModuleOneAll(String appCode) {
        return secModuleMapper.selectOderByOrderId(appCode);
    }

    @Override
    public ReturnEntity getRoleMenuTree(String roleId, String appCode) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        returnEntity.setData(getMenuTreeVue(roleId, appCode));
        return returnEntity;
    }

    @Override
    public ReturnEntity getAllMenuTree(String appCode) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        returnEntity.setData(getMenuTreeVue(null, appCode));
        return returnEntity;
    }

    //层级获取菜单
    public List<MenuList> getMenuTreeVue(String roleId, String appCode) {
        CesRouter cesRouter = new CesRouter();
        cesRouter.setAppcod(appCode);
        SecUser user = (SecUser) getLoginUser();
        List<SecModule> modules = new ArrayList<>();
        List<String> roleList = new ArrayList<>();
        if (StringUtils.isNotBlank(roleId)) {
            roleList.add(roleId);
            //取所有没有父级的菜单
            modules = secModuleMapper.getModuleByRoleId(appCode, roleId);
            //取所有父及菜单
            modules.addAll(secModuleMapper.getParentModuleByRoleId(appCode, roleList));
        } else {
            modules = secModuleMapper.selectOderByOrderId(appCode);
        }

        List<CesRouter> routers = cesRouterMapper.selectRouting(appCode, "1");
        //找到所有的1级菜单
        List<MenuList> mList = new ArrayList<>();
        for (SecModule module : modules) {
            if (null != module.getParentId() && module.getParentId().equals("0")) {
                MenuList node = new MenuList();
                node.setId(module.getModuleId());
                //改为获取中文名称
                node.setLabel(module.getModuleName());
                mList.add(node);
            }
        }
        //为一级菜单设置子菜单准备递归
        for (MenuList menu : mList) {
            //获取父菜单下所有子菜单调用getChildList
            List<MenuList> childList = getChildList(menu.getId(), modules, routers);
            menu.setChildren(childList);
        }
        return mList;
    }

    public List<SecModule> getAllModulesByRoles(SecUser user, String appCode) {
        List<SecModule> modules = new ArrayList<>();
        //获取当前登录人的角色
        List<SecUserRole> secUserRoleList = new ArrayList<>();
        secUserRoleList = secUserRoleService.getUserRoles(user.getUserId(), appCode);
        if (secUserRoleList.size() > 0) {
            List<String> roleList = new ArrayList<>();
            for (SecUserRole secUserRole : secUserRoleList) {
                roleList.add(secUserRole.getRoleId());
            }
            //取所有没有父级的菜单
            modules = secModuleMapper.getAllModulesByRoles(secUserRoleList, appCode);
            //取所有父及菜单
            modules.addAll(secModuleMapper.getParentModuleByRoleId(appCode, roleList));
        }/*else{
            modules = secModuleMapper.selectOderByOrderId(appCode);
        }*/
        return modules;
    }

    @Override
    public ReturnEntity copyModuleFromRole(String appCode, SecRoleModuleVO secRoleModuleVO, SecUser secUser) {
        if(StringUtils.isEmpty(secRoleModuleVO.getRoleId()) || StringUtils.isEmpty(secRoleModuleVO.getFromRoleId())){
            return ReturnEntity.errorMsg("参数错误");
        }
        Example example = new Example(SecRoleModule.class);
        example.createCriteria().andEqualTo("roleId", secRoleModuleVO.getFromRoleId());
        List<SecRoleModule> moduleList = secRoleModuleMapper.selectByExample(example);
        Date date = new Date();
        if(moduleList.size() > 0){
            for(SecRoleModule module : moduleList){
                module.setId(UUIDKit.getUUID());
                module.setRoleId(secRoleModuleVO.getRoleId());
                module.setCreateTime(date);
                module.setCreator(secUser.getUserId());
                module.setUpdateTime(null);
                module.setUpdator(null);
                secRoleModuleMapper.insert(module);
            }
        }
        return ReturnEntity.ok(secRoleModuleVO);
    }

    public List<MenuList> getChildList(String id, List<SecModule> menuList, List<CesRouter> routers) {
        //构建子菜单
        List<MenuList> childList = new ArrayList<>();
        //遍历传入的list
        for (SecModule menu : menuList) {
            //所有菜单的父id与传入的根节点id比较，若相等则为该级菜单的子菜单
            if (String.valueOf(menu.getParentId()).equals(id)) {
                MenuList node = new MenuList();
                node.setId(menu.getModuleId());
                //改为获取中文名称
                node.setLabel(menu.getModuleName());
                childList.add(node);
            }
        }
        //添加路由表信息
        for (CesRouter router : routers) {
            //所有菜单的父id与传入的根节点id比较，若相等则为该级菜单的子菜单
            if (String.valueOf(router.getPlace()).equals(id)) {
                MenuList node = new MenuList();
                node.setId(router.getId());
                //改为获取中文名称
                node.setLabel(router.getZhName());
                childList.add(node);
            }
        }
        //递归
        for (MenuList m : childList) {
            m.setChildren(getChildList(m.getId(), menuList, routers));
        }
        if (childList.size() == 0) {
            return null;
        }
        return childList;
    }


}
