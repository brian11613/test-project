/*
 * miyapay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.abu;

import com.miya.commons.lang2.exception.MiyaException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 微服务启动入口类
 *
 * @author spring-cloud-template-nacos-archetype
 * @Date 2020/05/22 上午11:42
 */
@EnableFeignClients
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableScheduling
@EnableDiscoveryClient
public class TestProjectApplication {

    public static void main(String[] args) {
        //为异常类设定会员服务编号 TODO: 需根据情况设置每个微服务的业务编号。 ！！！不要都设成一样的值！！！
        MiyaException.BIZ_CODE = "001";
        SpringApplication application = new SpringApplication(TestProjectApplication.class);
        application.run(args);
    }
}