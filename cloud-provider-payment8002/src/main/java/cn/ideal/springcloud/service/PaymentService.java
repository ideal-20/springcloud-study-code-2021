package cn.ideal.springcloud.service;

import cn.ideal.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: PaymentService
 * @Author: BWH_Steven
 * @Date: 2021/5/1 22:35
 * @Version: 1.0
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}


