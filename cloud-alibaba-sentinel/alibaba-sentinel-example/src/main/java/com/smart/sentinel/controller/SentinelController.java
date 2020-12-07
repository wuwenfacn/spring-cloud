package com.smart.sentinel.controller;

import com.smart.sentinel.feign.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SentinelController {
    @Resource
    UserService userService;

    @GetMapping("/")
    private String test() {
        return userService.test();
    }
}
