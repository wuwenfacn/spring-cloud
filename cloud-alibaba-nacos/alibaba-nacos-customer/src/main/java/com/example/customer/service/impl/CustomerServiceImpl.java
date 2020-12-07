package com.example.customer.service.impl;

import com.example.customer.entity.Tourism;
import com.example.customer.feign.ProducerService;
import com.example.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    ProducerService producerService;

    @Override
    public List<Tourism> getTourismList() {
        return producerService.test();
    }
}
