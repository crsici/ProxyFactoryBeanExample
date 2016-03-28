package com.sic.org.config;

import com.sic.org.services.CustomUserService;
import com.sic.org.services.CustomUserServiceImpl;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.interceptor.DebugInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * Created by pthanhtrung on 3/28/2016.
 */
@Configuration
public class ProxyConfig {

    @Bean
    public ProxyFactoryBean getProxyContructor( DebugInterceptor debugInterceptor) throws ClassNotFoundException {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(new CustomUserServiceImpl());
        proxyFactoryBean.setProxyInterfaces(new Class[]{CustomUserService.class});
        proxyFactoryBean.setInterceptorNames("debugInterceptor");
        return proxyFactoryBean;
    }

    @Bean
    public DebugInterceptor debugInterceptor(){
        return  new DebugInterceptor();
    }

}
