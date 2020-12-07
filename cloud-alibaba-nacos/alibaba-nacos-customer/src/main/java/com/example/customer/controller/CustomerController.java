package com.example.customer.controller;

import com.example.customer.commons.result.BaseResult;
import com.example.customer.entity.Tourism;
import com.example.customer.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/cus")
public class CustomerController {
    @Resource
    CustomerService customerService;

    @GetMapping("/test")
    public BaseResult<List<Tourism>> test(){
        return BaseResult.success(customerService.getTourismList());
    }
}
