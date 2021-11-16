/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.controller;

import cn.com.personnel.ercp.framework.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 34351
 *
 */
@ControllerAdvice
@Controller
public class GlobalExceptionHandler implements ErrorController {

    private static final Logger logger     = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    private static final String ERROR_404_PATH = "/common/404";
    private static final String ERROR_500_PATH = "/common/500";

    @RequestMapping(value = "/error", produces = "text/html")
    public String errorHtml(HttpServletRequest req) {
        return ERROR_404_PATH;
    }

    @RequestMapping(value = "/error")
    @ResponseBody
    public Object error(HttpServletRequest req) {
        return new ModelAndView(ERROR_404_PATH);
    }

    @Override
    public String getErrorPath() {
        return ERROR_404_PATH;
    }

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) {
        ModelAndView mov = new ModelAndView(ERROR_500_PATH);
        if (e instanceof BusinessException) {
            mov.addObject("message", e.getMessage());

        } else {
            mov.addObject("message", e.toString());
        }
        logger.error(req.getRequestURI() + "出现错误", e);

        return mov;
    }

}
