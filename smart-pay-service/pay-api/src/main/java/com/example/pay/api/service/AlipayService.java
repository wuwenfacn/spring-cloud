package com.example.pay.api.service;

public interface AlipayService {
    /**
     * web端支付
     * @return
     */
    String webPay();

    /**
     * 移动端的支付
     * @return
     */
    String appPay();
}
