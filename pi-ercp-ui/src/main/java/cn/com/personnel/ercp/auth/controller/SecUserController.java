package cn.com.personnel.ercp.auth.controller;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.ISecUserService;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/auth/user")
public class SecUserController extends PageController {

    @Autowired
    private ISecUserService secUserService;


    @RequestMapping
    public String index() {
        return "auth/user";
    }

    /**
     * 条件查询
     * 
     * @param condition
     * @return
     */
    @RequestMapping("query")
    @ResponseBody
    public ReturnEntity queryData(@RequestBody SecUser condition) {
        PageInfo<SecUser> rs = new PageInfo<SecUser>(secUserService.queryUser(condition, buildPagenation()));
        return ReturnEntity.ok(rs);
    }


    @RequestMapping("query_web")
    @ResponseBody
    public ReturnEntity query_web(@RequestBody SecUser condition) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE,
                new PageInfo<SecUser>(secUserService.queryUser(condition, buildPagenation())));
        return returnEntity;
    }

    @RequestMapping("find")
    @ResponseBody
    public List<SecUser> findData() {
        List<SecUser> list = secUserService.findUser();
        return list;
    }

    /**
     * 新增用户
     * 
     * @param secUser
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public ReturnEntity insertUser(@RequestBody SecUser secUser) {
        SecUser ispUser = getTokenLoginUser();
        secUser.setCreator(ispUser.getUserId());
        return ReturnEntity.ok(secUserService.addUser(secUser));
    }

    /**
     * 编辑用户
     * 
     * @param secUser
     * @return
     */
    @RequestMapping("update")
    @ResponseBody
    public SecUser updateUser(@RequestBody SecUser secUser) {
        SecUser currentUser = (SecUser) getLoginUser();
        secUser.setUpdator(currentUser.getUserId());
        return secUserService.updateUser(secUser);
    }

    /**
     * 作废用户
     * 
     * @return
     */
    @RequestMapping("delete")
    @ResponseBody
    public ReturnEntity deleteUser(@RequestBody SecUser secUser) {
        return ReturnEntity.ok(secUserService.deleteUser(secUser));
    }

}
