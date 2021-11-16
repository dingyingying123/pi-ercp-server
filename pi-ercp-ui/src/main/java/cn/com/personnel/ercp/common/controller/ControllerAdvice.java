/**
 * Copyright 2018 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author 36467
 * 全局注入
 *
 */
@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @Autowired
    private Environment env;

    @ModelAttribute(name = "app_name")
    public Object title() {
        return getAppName();
    }

    public String getAppName() {
        return env.getProperty("app.app_name");
    }
}