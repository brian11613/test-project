package com.abu.config.redis;

import com.miya.commons.redis.conf.DefaultRedisConfiguration;
import com.miya.commons.redis.conf.RedisProperties;
import com.miya.commons.redis.services.LockService;
import com.miya.commons.redis.services.RedisOptionService;
import com.miya.commons.redis.services.RedisValueService;
import com.miya.commons.redis.services.impl.LockServiceImpl;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * redis 配置项
 *
 * @author spring-cloud-template-nacos-archetype
 * @date 2019/10/31 4:16 PM
 */
@Configuration
public class RedisConfig {

    private DefaultRedisConfiguration defaultRedisConfiguration = new DefaultRedisConfiguration();

    @Bean
    @ConfigurationProperties("redis")
    public RedisProperties redisProperties() {
        return new RedisProperties();
    }


    @Bean
    @SuppressWarnings("deprecation")
    public JedisConnectionFactory jedisConnectionFactory(RedisProperties redisProperties) {
        return defaultRedisConfiguration.jedisConnectionFactory(redisProperties);
    }



    @Bean
    public RedisTemplate<String, String> redisTemplate(JedisConnectionFactory jedisConnectionFactory) {
        return defaultRedisConfiguration.redisTemplate(jedisConnectionFactory);
    }

    @Bean
    public RedisValueService redisService(RedisTemplate redisTemplate) {

        return defaultRedisConfiguration.redisService(redisTemplate);
    }

    @Bean
    public LockService lockService(RedisValueService redisService) {
        LockServiceImpl lockService = new LockServiceImpl();
        lockService.setLockPrefix("MIYA_LK");
        lockService.setRedisService(redisService);
        return lockService;
    }

    @Bean
    public RedisOptionService redisOptionService(RedisValueService redisValueService, LockService lockService){
        return defaultRedisConfiguration.redisOptionService(redisValueService, lockService);
    }
}
