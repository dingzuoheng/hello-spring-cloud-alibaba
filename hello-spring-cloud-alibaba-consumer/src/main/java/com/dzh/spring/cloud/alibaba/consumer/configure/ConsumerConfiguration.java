package com.dzh.spring.cloud.alibaba.consumer.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @ClassName ConsumerConfiguration
 * @Author DingZuoHeng
 * @Date 2020/2/25
 * @Version 1.0
 **/
@Configuration
public class ConsumerConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
