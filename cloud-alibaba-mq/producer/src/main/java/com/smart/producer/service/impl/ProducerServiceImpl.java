package com.smart.producer.service.impl;

import com.smart.producer.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @descriptions:
 * @author: Fa
 * @date: 2020/12/4 19:38
 */
@Slf4j
@Service
public class ProducerServiceImpl implements ProducerService {
    @Value("${rocketmq.topic}")
    String topic;

    @Resource
    RocketMQTemplate mqTemplate;

    @Override
    public void sendMsg() {
        mqTemplate.asyncSend(topic, "hello wrlod!", new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                log.info("success");
            }

            @Override
            public void onException(Throwable throwable) {
                log.info("error");
            }
        });
    }
}
