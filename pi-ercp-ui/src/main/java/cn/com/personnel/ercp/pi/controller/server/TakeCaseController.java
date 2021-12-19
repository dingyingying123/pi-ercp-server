package cn.com.personnel.ercp.pi.controller.server;

import cn.com.personnel.ercp.pi.service.server.ITakeCaseService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/takeCase")
public class TakeCaseController extends PageController {
    @Autowired
    ITakeCaseService takeCaseService;


}
