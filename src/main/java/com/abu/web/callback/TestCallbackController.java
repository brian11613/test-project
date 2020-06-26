/*
 * miyapay.com Inc.
 * Copyright (c) 2015-2020 All Rights Reserved.
 */
package com.abu.web.callback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 仅供三方系统调用，用于接收三方系统的回调请求
 *
 * @author spring-cloud-template-nacos-archetype
 * @Date 2020/05/22 上午11:42
 */
@Slf4j
@RestController
@RequestMapping("/notify")
public class TestCallbackController {

    @GetMapping("/test")
    public void test() {
        log.info("此接口是暴漏给三方系统的...");
    }
}