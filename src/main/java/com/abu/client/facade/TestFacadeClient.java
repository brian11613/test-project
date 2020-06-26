/*
 * miyapay.com Inc.
 * Copyright (c) 2015-2020 All Rights Reserved.
 */
package com.abu.client.facade;

import com.miya.commons.lang2.Result;
import com.miya.commons.lang2.exception.MiyaException;
import com.abu.client.facade.impl.TestFacadeClientImpl;
import com.abu.dto.TestDataDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author spring-cloud-template-nacos-archetype
 * @Date 2020/05/22 上午11:42
 */
@FeignClient(name = "miya-test"/*这个应用不存在，仅作为示例*/, fallback = TestFacadeClientImpl.class)
public interface TestFacadeClient {

    /**
     * 测试操作数据库是否正常
     *
     * @return
     */
    @GetMapping("/feign/get")
    Result<List<TestDataDTO>> test() throws MiyaException;
}