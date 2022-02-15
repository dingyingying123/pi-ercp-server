package cn.com.personnel.ercp.pi.controller.children;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.kit.FileKitConfig;
import cn.com.personnel.ercp.common.persistence.entity.FileInfo;
import cn.com.personnel.ercp.common.persistence.mapper.FileInfoMapper;
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
    @Autowired
    FileInfoMapper fileInfoMapper;
    @Autowired
    private FileKitConfig fileKitConfig;

    @RequestMapping("/toH5ChildrenModel")
    public ModelAndView toH5ChildrenModel(@RequestParam("childId") String childId){
        logger.info("===========进来了childId:" + childId);
//        SecUser secUser = getTokenLoginUser();
        SecUser secUser = new SecUser("admin");
        secUser.setUserName("admin");
        ModelAndView modelAndView = new ModelAndView("/children");
        modelAndView.addObject("user", secUser);
        if(StringUtils.isNotEmpty(childId)){
            PiChildrenBaseInfo piChildrenBaseInfo = new PiChildrenBaseInfo();
            piChildrenBaseInfo.setChildId(childId);
            PiChildrenBaseInfoVO piChildrenBaseInfoVO = piChildrenBaseInfoService.queryH5PiChildrenBaseInfo(piChildrenBaseInfo);
            modelAndView.addObject("info", piChildrenBaseInfoVO);
            FileInfo fileInfo = fileInfoMapper.queryOneFilesByCatByFlag(childId, "申请人签字");
            modelAndView.addObject("applyfile", fileInfo == null ? null : fileInfo.getFileKey());
//            FileInfo fileInfo2 = fileInfoMapper.queryOneFilesByCatByFlag(childId, "审核人签字");
//            modelAndView.addObject("approvefile", fileInfo2 == null ? null : fileKitConfig.getFileBasePath() + fileInfo2.getFilePath());
            response.addHeader("Access-Control-Allow-Origin", "*");
        }

        return modelAndView;
    }
}
