/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.controller;

import cn.com.personnel.springboot.framework.core.controller.PageController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 33925
 *
 */
@Controller
@RequestMapping("/")
public class IndexController extends PageController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
    	return "index";
    } 
    
    @RequestMapping(value="welcome")
    public String shIndex() {
        return "welcome";
    }
    
}
