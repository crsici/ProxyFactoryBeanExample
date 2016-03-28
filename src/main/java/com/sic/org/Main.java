package com.sic.org;

import com.sic.org.config.ProxyConfig;
import com.sic.org.services.CustomUserService;

import org.springframework.aop.support.AopUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pthanhtrung on 3/28/2016.
 */
public class Main {
    public static void main(String args[]){
        ApplicationContext  applicationContext = new AnnotationConfigApplicationContext(ProxyConfig.class);
        CustomUserService customUserService = applicationContext.getBean(CustomUserService.class);
        System.out.println(customUserService + " , is proxy : " +  AopUtils.isAopProxy(customUserService));


    }
}
