/*
 * miyapay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.abu.web.rest;

import com.google.common.collect.Lists;
import com.miya.commons.lang2.Result;
import com.miya.commons.lang2.exception.MiyaException;
import com.miya.commons.lang2.utils.ResultUtils;
import com.abu.client.facade.TestFacadeClient;
import com.abu.dal.mapper.MbrMemberPhoneOpenIdRefDOMapper;
import com.abu.dto.TestDataDTO;
import com.abu.dto.request.FeignTestRequest;
import com.abu.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.instrument.async.LazyTraceExecutor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 仅供前端、客户端调用
 *
 * @author spring-cloud-template-nacos-archetype
 * @Date 2020/05/22 上午11:42
 */
@RestController
@RequestMapping("/test")
@Slf4j
@Api(tags = "测试Controller")
public class TestController {
    @Autowired
    private LazyTraceExecutor executor;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MbrMemberPhoneOpenIdRefDOMapper mbrMemberPhoneOpenIdRefDOMapper;

    @Autowired
    private TestService testService;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private TestFacadeClient testFacadeClient;

    /**
     * 测试操作数据库是否正常
     *
     * @return
     */
    @GetMapping("/get")
    public Result<List<TestDataDTO>> test() throws MiyaException {
        log.info("收到测试请求。");
        //测试SQL语句及日志
        mbrMemberPhoneOpenIdRefDOMapper.countByExample(null);
        List<TestDataDTO> list = Lists.newArrayList(testService.getTestDataById(1L), testService.getTestDataById(1L));
        executor.execute(() -> {
            log.info("异步线程日志。");
        });
        return ResultUtils.successResult(list);
    }

    @ApiOperation("feign测试")
    @PostMapping("/feign-test")
    public Result<List<TestDataDTO>> feignTest(@RequestBody FeignTestRequest feignTestRequest) throws MiyaException {
        log.info("Received request param info:{}", feignTestRequest);
        return testFacadeClient.test();
    }
}