package cn.com.personnel.ercp.pi.controller;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.pi.service.demo.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    IDemoService demoService;

    @RequestMapping("/demoTest")
    @ResponseBody
    public List<SecUser> demoTest(@RequestBody SecUser user){
        List<SecUser> secUserList = demoService.querySecuserList();
        return secUserList;
    }

    public static void main(String[] args) {
        System.out.println(DigestUtils.md5DigestAsHex("123456".getBytes()));
    }
}
