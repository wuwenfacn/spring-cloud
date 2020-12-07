package com.smart.sentinel;

import com.smart.sentinel.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 降级
 */
@SpringBootApplication
@EnableDiscoveryClient
// defaultConfiguration: 表示默认运行的 Config 配置类
//@EnableFeignClients(defaultConfiguration = FeignGlobalConfig.class)
@EnableFeignClients
// 如果有多个负载均衡配置类的话，可以加在后面以","分隔
// @RibbonClients({@RibbonClient(value = "sentinel-user",configuration = RibbonConfig.class)})
@RibbonClient(value = "sentinel-user",configuration = RibbonConfig.class)
public class SentinelApp {
    public static void main(String[] args) {
        SpringApplication.run(SentinelApp.class,args);
    }
}
