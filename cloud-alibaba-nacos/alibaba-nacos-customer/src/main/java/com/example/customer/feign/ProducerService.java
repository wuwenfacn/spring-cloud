package com.example.customer.feign;

import com.example.customer.entity.Tourism;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "cloud-feign-producer-fa", path = "/api/pro/list")
public interface ProducerService {
    @GetMapping("/")
    List<Tourism> test();
}
