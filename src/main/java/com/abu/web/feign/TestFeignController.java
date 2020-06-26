/*
 * miyapay.com Inc.
 * Copyright (c) 2015-2020 All Rights Reserved.
 */
package com.abu.web.feign;

import com.miya.commons.lang2.Result;
import com.miya.commons.lang2.exception.MiyaException;
import com.abu.client.facade.TestFacadeClient;
import com.abu.dto.TestDataDTO;
import com.abu.dto.request.FeignTestRequest;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 仅供内部系统调用，即不可从外网访问到此类接口
 *
 * @author spring-cloud-template-nacos-archetype
 * @Date 2020/05/22 上午11:42
 */
@Slf4j
@RestController
@RequestMapping("/feign")
public class TestFeignController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private TestFacadeClient testFacadeClient;
    @ApiOperation("feign测试")
    @PostMapping("/feign-test")
    public Result<List<TestDataDTO>> feignTest(@RequestBody FeignTestRequest feignTestRequest) throws MiyaException {
        log.info("Received request param info:{}", feignTestRequest);
        return testFacadeClient.test();
    }

}