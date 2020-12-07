package com.smart.producer.controller;

import com.smart.producer.service.ProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @descriptions:
 * @author: Fa
 * @date: 2020/12/4 19:55
 */
@RestController
public class ProducerController {
    @Resource
    ProducerService producerService;

    @GetMapping("/pro")
    public String producer(){
        producerService.sendMsg();
        return "ProducerController";
    }
}
