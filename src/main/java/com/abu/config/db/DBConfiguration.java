/*
 * miyapay.com Inc.
 * Copyright (c) 2015-2020 All Rights Reserved.
 */
package com.abu.config.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author spring-cloud-template-nacos-archetype
 * @Date 2020/05/22 上午11:42
 */
@Configuration
@MapperScan(DBConfiguration.PRIMARY_MAPPER_BASE_PACKAGE)
public class DBConfiguration {
    public static final String PRIMARY_MAPPER_BASE_PACKAGE = "com.abu.dal.mapper";
}