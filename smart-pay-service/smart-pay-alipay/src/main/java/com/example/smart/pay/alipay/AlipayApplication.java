package com.example.smart.pay.alipay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 提供者
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlipayApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlipayApplication.class, args);
    }
}
