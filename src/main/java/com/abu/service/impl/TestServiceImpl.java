/*
 * miyapay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.abu.service.impl;

import com.miya.commons.lang2.exception.MiyaException;
import com.miya.commons.redis.annotations.LockType;
import com.miya.commons.redis.services.RedisOptionService;
import com.abu.dto.TestDataDTO;
import com.abu.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author spring-cloud-template-nacos-archetype
 * @Date 2020/05/22 上午11:42
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private RedisOptionService redisOptionService;
    private static final int TIMEOUT_SECONDS = 900;

    @Override
    public TestDataDTO getTestDataById(Long id) throws MiyaException {
        return redisOptionService
                .readRedisFirst("test_prefix", id, TIMEOUT_SECONDS, TestDataDTO.class, LockType.LOCAL_LOCK,
                        () -> TestDataDTO.generateData(id, true));
    }
}