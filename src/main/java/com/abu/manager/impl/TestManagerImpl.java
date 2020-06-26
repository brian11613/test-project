/*
 * miyapay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.abu.manager.impl;

import com.abu.dal.entity.MbrMemberPhoneOpenIdRefDO;
import com.abu.manager.TestManager;
import org.springframework.stereotype.Component;

/**
 * @author spring-cloud-template-nacos-archetype
 * @Date 2020/05/22 上午11:42
 */
@Component
public class TestManagerImpl implements TestManager {
    @Override
    public String test() {
        return null;
    }

    @Override
    public boolean insert(MbrMemberPhoneOpenIdRefDO mbrMemberPhoneOpenIdRefDO) {
        return false;
    }

    @Override
    public String sendMqMessage(String message) {
        return null;
    }

    @Override
    public String invokeFeign() {
        return null;
    }
}