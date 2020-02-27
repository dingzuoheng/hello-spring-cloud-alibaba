package com.dzh.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @ClassName EchoController
 * @Author DingZuoHeng
 * @Date 2020/2/25
 * @Version 1.0
 **/
@RestController
public class EchoController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string){
        System.out.println(string);
        return  "Hello Nacos Provider "+ string;
    }

    @GetMapping("/lb")
    public String lb() {
        return "Hello Nacos Provider i am from port :"+port;
    }
}
