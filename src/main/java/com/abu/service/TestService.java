/*
 * miyapay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.abu.service;

import com.miya.commons.lang2.exception.MiyaException;
import com.abu.dto.TestDataDTO;

/**
 * @author spring-cloud-template-nacos-archetype
 * @Date 2020/05/22 上午11:42
 */
public interface TestService {

    /**
     * 获取 测试数据
     *
     * @param id
     * @return
     * @throws MiyaException
     */
    TestDataDTO getTestDataById(Long id) throws MiyaException;
}