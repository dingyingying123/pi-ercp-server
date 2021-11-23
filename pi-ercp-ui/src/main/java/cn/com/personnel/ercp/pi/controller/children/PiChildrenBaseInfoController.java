package cn.com.personnel.ercp.pi.controller.children;

import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.fss.persistence.entity.collectionAccount.PiChildrenBaseInfo;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/piChildrenBaseInfo")
public class PiChildrenBaseInfoController extends PageController {


    public ReturnEntity queryPiChildrenBaseInfoList(@RequestBody PiChildrenBaseInfo piChildrenBaseInfo){

        return null;
    }
}
