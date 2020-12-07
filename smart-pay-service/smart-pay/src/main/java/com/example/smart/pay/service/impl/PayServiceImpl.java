package com.example.smart.pay.service.impl;

import com.example.pay.api.service.AlipayService;
import com.example.smart.pay.service.PayService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


@Service
public class PayServiceImpl implements PayService {
    @Reference
    private AlipayService alipayService;

    @Override
    public String pay(Integer type, String total) {
        String s = "";
        if (type == 1) {
            //支付宝支付
            s = alipayService.webPay();
        } else if (type == 2) {
            // 微信支付
            s = alipayService.appPay();
        }
        return s;
    }
}
