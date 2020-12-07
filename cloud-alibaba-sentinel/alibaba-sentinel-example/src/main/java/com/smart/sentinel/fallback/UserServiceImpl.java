package com.smart.sentinel.fallback;

import com.smart.sentinel.feign.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public String test() {
        return "admin";
    }
}
