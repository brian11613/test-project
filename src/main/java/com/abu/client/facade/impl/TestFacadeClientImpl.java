/*
 * miyapay.com Inc.
 * Copyright (c) 2015-2020 All Rights Reserved.
 */
package com.abu.client.facade.impl;

import com.miya.commons.lang2.Result;
import com.miya.commons.lang2.exception.MiyaException;
import com.miya.commons.lang2.utils.ResultUtils;
import com.abu.client.facade.TestFacadeClient;
import com.abu.common.ResultCode;
import com.abu.dto.TestDataDTO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author spring-cloud-template-nacos-archetype
 * @Date 2020/05/22 上午11:42
 */
@Component
public class TestFacadeClientImpl implements TestFacadeClient {
    @Override
    public Result<List<TestDataDTO>> test() throws MiyaException {
        // throw new MiyaException(REMOTE_FAILED,"fallback!!!!!!!!");
        return ResultUtils.failedResult(ResultCode.REMOTE_FAILED.code, ResultCode.REMOTE_FAILED.msg + "【测试服务】");
    }
}