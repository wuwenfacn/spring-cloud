package com.example.smart.pay.controller;

import com.example.smart.pay.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pay")
@Slf4j
public class PayController {
    @Resource
    PayService payService;

    @PostMapping("/")
    public String pay(@RequestBody @RequestParam Integer type, @RequestBody @RequestParam  String total) {
        log.info("====================="+type);
        log.info("====================="+total);
        return payService.pay(type, total);
    }

}
