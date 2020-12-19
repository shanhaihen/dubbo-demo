package com.shanhaihen.client;

import com.shanhaihen.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "${config.service.version}")
    HelloService helloService;


    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return helloService.sayHello();
    }

}
