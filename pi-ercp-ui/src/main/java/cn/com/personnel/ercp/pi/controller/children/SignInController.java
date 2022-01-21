package cn.com.personnel.ercp.pi.controller.children;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiSignInInfo;
import cn.com.personnel.ercp.pi.service.child.ISignInService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pi/signIn")
public class SignInController extends PageController {
    @Autowired
    ISignInService signInService;

    @RequestMapping("/queryLastSignIn")
    @ResponseBody
    public ReturnEntity queryLastSignIn(){
        SecUser secUser = getTokenLoginUser();
        return signInService.queryLastSignIn(secUser);
    }

    @RequestMapping("/saveLastSignIn")
    @ResponseBody
    public ReturnEntity saveLastSignIn(@RequestBody PiSignInInfo piSignInInfo){
        SecUser secUser = getTokenLoginUser();
        return signInService.saveLastSignIn(piSignInInfo, secUser);
    }

    @RequestMapping("/queryTodaySignIn")
    @ResponseBody
    public ReturnEntity queryTodaySignIn(){
        SecUser secUser = getTokenLoginUser();
        return signInService.queryTodaySignIn(secUser);
    }
}
