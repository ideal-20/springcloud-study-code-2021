package cn.ideal.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName: PaymentFallbackService
 * @Author: BWH_Steven
 * @Date: 2021/5/14 10:46
 * @Version: 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}

