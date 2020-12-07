package com.smart.customer.linseter;

import com.smart.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @descriptions:
 * @author: Fa
 * @date: 2020/12/4 20:02
 */
@Slf4j
@Component
@RocketMQMessageListener(consumerGroup = "consumer-group",topic = "producer-fa")
public class CustomerLinseter implements RocketMQListener<String> {
    @Resource
    CustomerService customerService;

    @Override
    public void onMessage(String str) {
        log.info(str);
        customerService.save(str);
    }
}
