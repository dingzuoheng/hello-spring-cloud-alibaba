package com.dzh.spring.cloud.alibaba.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @ClassName TestController
 * @Author DingZuoHeng
 * @Date 2020/2/25
 * @Version 1.0
 **/
@RestController
public class TestController {

//    @Resource
    private final RestTemplate restTemplate;

    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @GetMapping(value="/echo/{string}")
    public String echo(@PathVariable String string){
    return restTemplate.getForObject("http://service-provider/echo/" +string,String.class);
    }



}
