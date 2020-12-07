package com.smart.sentinel.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SentinelController {
    @Value("${server.port}")
    int port;

    @GetMapping("/")
    public String test() {
        return "user" + port;
    }
}
