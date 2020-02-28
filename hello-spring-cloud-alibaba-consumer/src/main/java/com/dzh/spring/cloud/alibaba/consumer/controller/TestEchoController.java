package com.dzh.spring.cloud.alibaba.consumer.controller;

import com.dzh.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @ClassName TestEchoController
 * @Author DingZuoHeng
 * @Date 2020/2/25
 * @Version 1.0
 **/
@RefreshScope
@RestController
public class TestEchoController {

    @Autowired
    private EchoService echoService;

    @Value("${user.name}")
    private String username;

    @GetMapping(value = "/config")
    public String config() {
        return echoService.echo(username);
    }

    @GetMapping("feign/echo/{str}")
    public String echo(@PathVariable String str) {
        return "调用feign后得到的结果: " + echoService.echo(str);
    }

    @GetMapping("/feign/lb")
    public String lb() {
        return echoService.lb();
    }
}
