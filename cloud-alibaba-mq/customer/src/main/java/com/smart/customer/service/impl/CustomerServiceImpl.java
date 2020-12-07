package com.smart.customer.service.impl;

import com.smart.customer.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 * @descriptions:
 * @author: Fa
 * @date: 2020/12/4 20:08
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    String test;
    @Override
    public void save(String str) {
        test = str;
    }

    @Override
    public String test() {
        return test;
    }
}
