package com.smart.sentinel.feign;

import com.smart.sentinel.fallback.UserServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// 远程调用其他服务
@FeignClient(value = "sentinel-user",path = "/user",fallback = UserServiceImpl.class)
public interface UserService {
    @GetMapping("/")
    String test();
}
