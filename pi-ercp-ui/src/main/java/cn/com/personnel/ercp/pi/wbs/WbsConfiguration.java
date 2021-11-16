/**
 * Copyright 2017 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.pi.wbs;

import cn.com.personnel.ercp.pi.wbs.service.*;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @author 33925
 *
 */
@Configuration
public class WbsConfiguration {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean(name = "wbsBean")
    public ServletRegistrationBean dispatcherServlet() {
        ServletRegistrationBean wbsServlet = new ServletRegistrationBean(new CXFServlet(), "/wbs/*");
        return wbsServlet;
    }

    /**
     * 通用接口
     *
     * @param springBus
     * @param callBackService
     * @return
     */
    @Bean
    public Endpoint endpointCallBackMsg(SpringBus springBus, ICommonCallBackService callBackService) {
        EndpointImpl endpoint = new EndpointImpl(springBus, callBackService);
        endpoint.publish("/callBackMsg");
        return endpoint;
    }

    // 公司主数据同步接口
    @Bean
    public Endpoint endpointBaseCompany(SpringBus springBus, IBaseCompanyService baseCompanyService) {
        EndpointImpl endpoint = new EndpointImpl(springBus, baseCompanyService);
        endpoint.publish("/baseCompany");
        return endpoint;
    }

}
