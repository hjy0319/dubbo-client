package com.hujy.dubbo.dubboclient.controller;

import com.hujy.dubbo.service.ISayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 访问入口
 *
 * @Author hujy
 * @Date Created in 2019-08-03 12:14
 * @Version 1.0
 */
@RestController
public class DubboController {

    @Reference
    private ISayHelloService sayHelloService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return sayHelloService.sayHello();
    }
}
