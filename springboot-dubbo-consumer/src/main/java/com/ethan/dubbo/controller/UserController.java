package com.ethan.dubbo.controller;

import com.ethan.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //调用远程服务
    @Reference
    private UserService userService;

    @RequestMapping(value = "/hi")
    public String userServiceConsume(){

        System.out.println(this.userService.sayHello("hi!"));

        return "hi";
    }
}
