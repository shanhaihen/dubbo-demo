package com.shanhaihen.provider;

import com.shanhaihen.service.HelloService;
import org.springframework.stereotype.Service;

@org.apache.dubbo.config.annotation.Service(version = "${config.service.version}")
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello,word";
    }
}
