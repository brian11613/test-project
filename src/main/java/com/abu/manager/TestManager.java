/*
 * miyapay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.abu.manager;

import com.abu.dal.entity.MbrMemberPhoneOpenIdRefDO;

/**
 * @author spring-cloud-template-nacos-archetype
 * @Date 2020/05/22 上午11:42
 */
public interface TestManager {

    String test();

    boolean insert(MbrMemberPhoneOpenIdRefDO mbrMemberPhoneOpenIdRefDO);

    String sendMqMessage(String message);

    String invokeFeign();
}