package cn.com.personnel.ercp.pi.controller.children;

import cn.com.personnel.ercp.pi.module.child.PiChildrenBaseInfoVO;
import cn.com.personnel.ercp.pi.persistence.entity.child.PiChildrenBaseInfo;
import cn.com.personnel.ercp.pi.service.child.IPiChildrenBaseInfoService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/h5ChildrenBaseInfo")
public class H5ChildrenBaseInfoController extends PageController {
    @Autowired
    IPiChildrenBaseInfoService piChildrenBaseInfoService;

    @RequestMapping("/toH5ChildrenModel")
    public ModelAndView toH5ChildrenModel(@RequestParam("childId") String childId){
        logger.info("===========进来了childId:" + childId);
        ModelAndView modelAndView = new ModelAndView("/assets/children");
        if(StringUtils.isNotEmpty(childId)){
            PiChildrenBaseInfo piChildrenBaseInfo = new PiChildrenBaseInfo();
            piChildrenBaseInfo.setChildId(childId);
            PiChildrenBaseInfoVO piChildrenBaseInfoVO = piChildrenBaseInfoService.queryH5PiChildrenBaseInfo(piChildrenBaseInfo);
            modelAndView.addObject("info", piChildrenBaseInfoVO);
        }

        return modelAndView;
    }
}