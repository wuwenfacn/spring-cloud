package com.example.smart.pay.alipay.service.impl;

import com.example.pay.api.service.AlipayService;
import org.apache.dubbo.config.annotation.Service;

/**
 *  在提供者的接口实现类使用
 *  org.apache.dubbo.config.annotation.Service
 */
@Service
public class AlipayServiceImpl implements AlipayService {
    @Override
    public String webPay() {
        return "网页支付成功";
    }

    @Override
    public String appPay() {
        return "移动支付成功";
    }
}
