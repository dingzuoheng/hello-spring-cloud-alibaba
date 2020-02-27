package com.dzh.spring.cloud.alibaba.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description TODO
 * @ClassName EchoService
 * @Author DingZuoHeng
 * @Date
 * @Version 1.0
 **/
@FeignClient(value = "service-provider")
public interface EchoService {

    @GetMapping("/echo/{string}")
    String echo(@PathVariable("string") String string );

    @GetMapping("/lb")
    String lb() ;
}
