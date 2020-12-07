package com.smart.customer.controller;

import com.smart.customer.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @descriptions:
 * @author: Fa
 * @date: 2020/12/4 20:37
 */
@RestController
public class CustomerController {
    @Resource
    CustomerService customerService;

    @GetMapping("/cus")
    public String cus(){
        return customerService.test();
    }
}
