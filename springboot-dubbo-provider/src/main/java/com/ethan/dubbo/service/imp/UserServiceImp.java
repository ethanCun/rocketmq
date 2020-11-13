package com.ethan.dubbo.service.imp;

import com.ethan.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
//服务提供方
@Service(interfaceClass = UserService.class)
public class UserServiceImp implements UserService {

    @Override
    public String sayHello(String name) {
        return name;
    }
}
